package org.apache.mina.filter.codec.demux;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.mina.core.session.AttributeKey;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.core.session.UnknownMessageTypeException;
import org.apache.mina.filter.codec.ProtocolEncoder;
import org.apache.mina.filter.codec.ProtocolEncoderOutput;
import org.apache.mina.util.CopyOnWriteMap;
import org.apache.mina.util.IdentityHashSet;

public class DemuxingProtocolEncoder implements ProtocolEncoder {
    private static final Class<?>[] EMPTY_PARAMS;
    private final AttributeKey STATE;
    private final Map<Class<?>, MessageEncoderFactory> type2encoderFactory;

    private static class DefaultConstructorMessageEncoderFactory<T> implements MessageEncoderFactory<T> {
        private final Class<MessageEncoder<T>> encoderClass;

        private DefaultConstructorMessageEncoderFactory(Class<MessageEncoder<T>> cls) {
            if (cls == null) {
                throw new IllegalArgumentException("encoderClass");
            } else if (MessageEncoder.class.isAssignableFrom(cls)) {
                this.encoderClass = cls;
            } else {
                throw new IllegalArgumentException("encoderClass is not assignable to MessageEncoder");
            }
        }

        public MessageEncoder<T> getEncoder() {
            return (MessageEncoder) this.encoderClass.newInstance();
        }
    }

    private static class SingletonMessageEncoderFactory<T> implements MessageEncoderFactory<T> {
        private final MessageEncoder<T> encoder;

        private SingletonMessageEncoderFactory(MessageEncoder<T> messageEncoder) {
            if (messageEncoder == null) {
                throw new IllegalArgumentException("encoder");
            }
            this.encoder = messageEncoder;
        }

        public MessageEncoder<T> getEncoder() {
            return this.encoder;
        }
    }

    private class State {
        private final ConcurrentHashMap<Class<?>, MessageEncoder> findEncoderCache;
        private final Map<Class<?>, MessageEncoder> type2encoder;

        private State() {
            this.findEncoderCache = new ConcurrentHashMap();
            this.type2encoder = new ConcurrentHashMap();
            for (Entry entry : DemuxingProtocolEncoder.this.type2encoderFactory.entrySet()) {
                this.type2encoder.put(entry.getKey(), ((MessageEncoderFactory) entry.getValue()).getEncoder());
            }
        }
    }

    static {
        EMPTY_PARAMS = new Class[0];
    }

    public DemuxingProtocolEncoder() {
        this.STATE = new AttributeKey(getClass(), "state");
        this.type2encoderFactory = new CopyOnWriteMap();
    }

    public void addMessageEncoder(Class<?> cls, Class<? extends MessageEncoder> cls2) {
        if (cls2 == null) {
            throw new IllegalArgumentException("encoderClass");
        }
        try {
            cls2.getConstructor(EMPTY_PARAMS);
            Object obj = null;
            if (MessageEncoder.class.isAssignableFrom(cls2)) {
                addMessageEncoder((Class) cls, new DefaultConstructorMessageEncoderFactory(null));
                obj = 1;
            }
            if (obj == null) {
                throw new IllegalArgumentException("Unregisterable type: " + cls2);
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("The specified class doesn't have a public default constructor.");
        }
    }

    public <T> void addMessageEncoder(Class<T> cls, MessageEncoder<? super T> messageEncoder) {
        addMessageEncoder((Class) cls, new SingletonMessageEncoderFactory(null));
    }

    public <T> void addMessageEncoder(Class<T> cls, MessageEncoderFactory<? super T> messageEncoderFactory) {
        if (cls == null) {
            throw new IllegalArgumentException("messageType");
        } else if (messageEncoderFactory == null) {
            throw new IllegalArgumentException("factory");
        } else {
            synchronized (this.type2encoderFactory) {
                if (this.type2encoderFactory.containsKey(cls)) {
                    throw new IllegalStateException("The specified message type (" + cls.getName() + ") is registered already.");
                }
                this.type2encoderFactory.put(cls, messageEncoderFactory);
            }
        }
    }

    public void addMessageEncoder(Iterable<Class<?>> iterable, Class<? extends MessageEncoder> cls) {
        for (Class addMessageEncoder : iterable) {
            addMessageEncoder(addMessageEncoder, (Class) cls);
        }
    }

    public <T> void addMessageEncoder(Iterable<Class<? extends T>> iterable, MessageEncoder<? super T> messageEncoder) {
        for (Class addMessageEncoder : iterable) {
            addMessageEncoder(addMessageEncoder, (MessageEncoder) messageEncoder);
        }
    }

    public <T> void addMessageEncoder(Iterable<Class<? extends T>> iterable, MessageEncoderFactory<? super T> messageEncoderFactory) {
        for (Class addMessageEncoder : iterable) {
            addMessageEncoder(addMessageEncoder, (MessageEncoderFactory) messageEncoderFactory);
        }
    }

    public void encode(IoSession ioSession, Object obj, ProtocolEncoderOutput protocolEncoderOutput) {
        MessageEncoder findEncoder = findEncoder(getState(ioSession), obj.getClass());
        if (findEncoder != null) {
            findEncoder.encode(ioSession, obj, protocolEncoderOutput);
            return;
        }
        throw new UnknownMessageTypeException("No message encoder found for message: " + obj);
    }

    protected MessageEncoder<Object> findEncoder(State state, Class<?> cls) {
        return findEncoder(state, cls, null);
    }

    private MessageEncoder<Object> findEncoder(State state, Class<?> cls, Set<Class<?>> set) {
        if (set != null && set.contains(cls)) {
            return null;
        }
        MessageEncoder<Object> messageEncoder = (MessageEncoder) state.findEncoderCache.get(cls);
        if (messageEncoder != null) {
            return messageEncoder;
        }
        MessageEncoder<Object> messageEncoder2;
        messageEncoder = (MessageEncoder) state.type2encoder.get(cls);
        if (messageEncoder == null) {
            if (set == null) {
                set = new IdentityHashSet();
            }
            set.add(cls);
            messageEncoder2 = messageEncoder;
            for (Class findEncoder : cls.getInterfaces()) {
                messageEncoder2 = findEncoder(state, findEncoder, set);
                if (messageEncoder2 != null) {
                    break;
                }
            }
        } else {
            messageEncoder2 = messageEncoder;
        }
        if (messageEncoder2 == null) {
            Class superclass = cls.getSuperclass();
            if (superclass != null) {
                messageEncoder2 = findEncoder(state, superclass);
            }
        }
        if (messageEncoder2 != null) {
            state.findEncoderCache.put(cls, messageEncoder2);
            messageEncoder = (MessageEncoder) state.findEncoderCache.putIfAbsent(cls, messageEncoder2);
            if (messageEncoder != null) {
                return messageEncoder;
            }
        }
        return messageEncoder2;
    }

    public void dispose(IoSession ioSession) {
        ioSession.removeAttribute(this.STATE);
    }

    private State getState(IoSession ioSession) {
        State state = (State) ioSession.getAttribute(this.STATE);
        if (state != null) {
            return state;
        }
        State state2 = new State();
        state = (State) ioSession.setAttributeIfAbsent(this.STATE, state2);
        return state != null ? state : state2;
    }
}
