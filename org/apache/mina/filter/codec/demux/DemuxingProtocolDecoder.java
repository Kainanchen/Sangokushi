package org.apache.mina.filter.codec.demux;

import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.session.AttributeKey;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.CumulativeProtocolDecoder;
import org.apache.mina.filter.codec.ProtocolDecoderException;
import org.apache.mina.filter.codec.ProtocolDecoderOutput;

public class DemuxingProtocolDecoder extends CumulativeProtocolDecoder {
    private static final Class<?>[] EMPTY_PARAMS;
    private final AttributeKey STATE;
    private MessageDecoderFactory[] decoderFactories;

    private static class DefaultConstructorMessageDecoderFactory implements MessageDecoderFactory {
        private final Class<?> decoderClass;

        private DefaultConstructorMessageDecoderFactory(Class<?> cls) {
            if (cls == null) {
                throw new IllegalArgumentException("decoderClass");
            } else if (MessageDecoder.class.isAssignableFrom(cls)) {
                this.decoderClass = cls;
            } else {
                throw new IllegalArgumentException("decoderClass is not assignable to MessageDecoder");
            }
        }

        public MessageDecoder getDecoder() {
            return (MessageDecoder) this.decoderClass.newInstance();
        }
    }

    private static class SingletonMessageDecoderFactory implements MessageDecoderFactory {
        private final MessageDecoder decoder;

        private SingletonMessageDecoderFactory(MessageDecoder messageDecoder) {
            if (messageDecoder == null) {
                throw new IllegalArgumentException("decoder");
            }
            this.decoder = messageDecoder;
        }

        public MessageDecoder getDecoder() {
            return this.decoder;
        }
    }

    private class State {
        private MessageDecoder currentDecoder;
        private final MessageDecoder[] decoders;

        private State() {
            MessageDecoderFactory[] access$500 = DemuxingProtocolDecoder.this.decoderFactories;
            this.decoders = new MessageDecoder[access$500.length];
            for (int length = access$500.length - 1; length >= 0; length--) {
                this.decoders[length] = access$500[length].getDecoder();
            }
        }
    }

    static {
        EMPTY_PARAMS = new Class[0];
    }

    public DemuxingProtocolDecoder() {
        this.STATE = new AttributeKey(getClass(), "state");
        this.decoderFactories = new MessageDecoderFactory[0];
    }

    public void addMessageDecoder(Class<? extends MessageDecoder> cls) {
        if (cls == null) {
            throw new IllegalArgumentException("decoderClass");
        }
        try {
            cls.getConstructor(EMPTY_PARAMS);
            Object obj = null;
            if (MessageDecoder.class.isAssignableFrom(cls)) {
                addMessageDecoder(new DefaultConstructorMessageDecoderFactory(null));
                obj = 1;
            }
            if (obj == null) {
                throw new IllegalArgumentException("Unregisterable type: " + cls);
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("The specified class doesn't have a public default constructor.");
        }
    }

    public void addMessageDecoder(MessageDecoder messageDecoder) {
        addMessageDecoder(new SingletonMessageDecoderFactory(null));
    }

    public void addMessageDecoder(MessageDecoderFactory messageDecoderFactory) {
        if (messageDecoderFactory == null) {
            throw new IllegalArgumentException("factory");
        }
        Object obj = this.decoderFactories;
        Object obj2 = new MessageDecoderFactory[(obj.length + 1)];
        System.arraycopy(obj, 0, obj2, 0, obj.length);
        obj2[obj.length] = messageDecoderFactory;
        this.decoderFactories = obj2;
    }

    protected boolean doDecode(IoSession ioSession, IoBuffer ioBuffer, ProtocolDecoderOutput protocolDecoderOutput) {
        State state = getState(ioSession);
        if (state.currentDecoder == null) {
            MessageDecoder[] access$300 = state.decoders;
            int length = access$300.length - 1;
            int i = 0;
            loop0:
            while (length >= 0) {
                MessageDecoder messageDecoder = access$300[length];
                int limit = ioBuffer.limit();
                int position = ioBuffer.position();
                try {
                    MessageDecoderResult decodable = messageDecoder.decodable(ioSession, ioBuffer);
                    if (decodable == MessageDecoder.OK) {
                        state.currentDecoder = messageDecoder;
                        break loop0;
                    }
                    if (decodable == MessageDecoder.NOT_OK) {
                        i++;
                    } else if (decodable != MessageDecoder.NEED_DATA) {
                        throw new IllegalStateException("Unexpected decode result (see your decodable()): " + decodable);
                    }
                    length--;
                } finally {
                    ioBuffer.position(position);
                    ioBuffer.limit(limit);
                }
            }
            if (i == access$300.length) {
                String hexDump = ioBuffer.getHexDump();
                ioBuffer.position(ioBuffer.limit());
                ProtocolDecoderException protocolDecoderException = new ProtocolDecoderException("No appropriate message decoder: " + hexDump);
                protocolDecoderException.setHexdump(hexDump);
                throw protocolDecoderException;
            } else if (state.currentDecoder == null) {
                return false;
            }
        }
        try {
            MessageDecoderResult decode = state.currentDecoder.decode(ioSession, ioBuffer, protocolDecoderOutput);
            if (decode == MessageDecoder.OK) {
                state.currentDecoder = null;
                return true;
            } else if (decode == MessageDecoder.NEED_DATA) {
                return false;
            } else {
                if (decode == MessageDecoder.NOT_OK) {
                    state.currentDecoder = null;
                    throw new ProtocolDecoderException("Message decoder returned NOT_OK.");
                }
                state.currentDecoder = null;
                throw new IllegalStateException("Unexpected decode result (see your decode()): " + decode);
            }
        } catch (Exception e) {
            state.currentDecoder = null;
            throw e;
        }
    }

    public void finishDecode(IoSession ioSession, ProtocolDecoderOutput protocolDecoderOutput) {
        super.finishDecode(ioSession, protocolDecoderOutput);
        MessageDecoder access$200 = getState(ioSession).currentDecoder;
        if (access$200 != null) {
            access$200.finishDecode(ioSession, protocolDecoderOutput);
        }
    }

    public void dispose(IoSession ioSession) {
        super.dispose(ioSession);
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
