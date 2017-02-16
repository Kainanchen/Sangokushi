package org.apache.mina.handler.demux;

import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.core.session.UnknownMessageTypeException;
import org.apache.mina.util.IdentityHashSet;

public class DemuxingIoHandler extends IoHandlerAdapter {
    private final Map<Class<?>, ExceptionHandler<?>> exceptionHandlerCache;
    private final Map<Class<?>, ExceptionHandler<?>> exceptionHandlers;
    private final Map<Class<?>, MessageHandler<?>> receivedMessageHandlerCache;
    private final Map<Class<?>, MessageHandler<?>> receivedMessageHandlers;
    private final Map<Class<?>, MessageHandler<?>> sentMessageHandlerCache;
    private final Map<Class<?>, MessageHandler<?>> sentMessageHandlers;

    public DemuxingIoHandler() {
        this.receivedMessageHandlerCache = new ConcurrentHashMap();
        this.receivedMessageHandlers = new ConcurrentHashMap();
        this.sentMessageHandlerCache = new ConcurrentHashMap();
        this.sentMessageHandlers = new ConcurrentHashMap();
        this.exceptionHandlerCache = new ConcurrentHashMap();
        this.exceptionHandlers = new ConcurrentHashMap();
    }

    public <E> MessageHandler<? super E> addReceivedMessageHandler(Class<E> cls, MessageHandler<? super E> messageHandler) {
        this.receivedMessageHandlerCache.clear();
        return (MessageHandler) this.receivedMessageHandlers.put(cls, messageHandler);
    }

    public <E> MessageHandler<? super E> removeReceivedMessageHandler(Class<E> cls) {
        this.receivedMessageHandlerCache.clear();
        return (MessageHandler) this.receivedMessageHandlers.remove(cls);
    }

    public <E> MessageHandler<? super E> addSentMessageHandler(Class<E> cls, MessageHandler<? super E> messageHandler) {
        this.sentMessageHandlerCache.clear();
        return (MessageHandler) this.sentMessageHandlers.put(cls, messageHandler);
    }

    public <E> MessageHandler<? super E> removeSentMessageHandler(Class<E> cls) {
        this.sentMessageHandlerCache.clear();
        return (MessageHandler) this.sentMessageHandlers.remove(cls);
    }

    public <E extends Throwable> ExceptionHandler<? super E> addExceptionHandler(Class<E> cls, ExceptionHandler<? super E> exceptionHandler) {
        this.exceptionHandlerCache.clear();
        return (ExceptionHandler) this.exceptionHandlers.put(cls, exceptionHandler);
    }

    public <E extends Throwable> ExceptionHandler<? super E> removeExceptionHandler(Class<E> cls) {
        this.exceptionHandlerCache.clear();
        return (ExceptionHandler) this.exceptionHandlers.remove(cls);
    }

    public <E> MessageHandler<? super E> getMessageHandler(Class<E> cls) {
        return (MessageHandler) this.receivedMessageHandlers.get(cls);
    }

    public Map<Class<?>, MessageHandler<?>> getReceivedMessageHandlerMap() {
        return Collections.unmodifiableMap(this.receivedMessageHandlers);
    }

    public Map<Class<?>, MessageHandler<?>> getSentMessageHandlerMap() {
        return Collections.unmodifiableMap(this.sentMessageHandlers);
    }

    public Map<Class<?>, ExceptionHandler<?>> getExceptionHandlerMap() {
        return Collections.unmodifiableMap(this.exceptionHandlers);
    }

    public void messageReceived(IoSession ioSession, Object obj) {
        MessageHandler findReceivedMessageHandler = findReceivedMessageHandler(obj.getClass());
        if (findReceivedMessageHandler != null) {
            findReceivedMessageHandler.handleMessage(ioSession, obj);
            return;
        }
        throw new UnknownMessageTypeException("No message handler found for message type: " + obj.getClass().getSimpleName());
    }

    public void messageSent(IoSession ioSession, Object obj) {
        MessageHandler findSentMessageHandler = findSentMessageHandler(obj.getClass());
        if (findSentMessageHandler != null) {
            findSentMessageHandler.handleMessage(ioSession, obj);
            return;
        }
        throw new UnknownMessageTypeException("No handler found for message type: " + obj.getClass().getSimpleName());
    }

    public void exceptionCaught(IoSession ioSession, Throwable th) {
        ExceptionHandler findExceptionHandler = findExceptionHandler(th.getClass());
        if (findExceptionHandler != null) {
            findExceptionHandler.exceptionCaught(ioSession, th);
            return;
        }
        throw new UnknownMessageTypeException("No handler found for exception type: " + th.getClass().getSimpleName());
    }

    protected MessageHandler<Object> findReceivedMessageHandler(Class<?> cls) {
        return findReceivedMessageHandler(cls, null);
    }

    protected MessageHandler<Object> findSentMessageHandler(Class<?> cls) {
        return findSentMessageHandler(cls, null);
    }

    protected ExceptionHandler<Throwable> findExceptionHandler(Class<? extends Throwable> cls) {
        return findExceptionHandler(cls, null);
    }

    private MessageHandler<Object> findReceivedMessageHandler(Class<?> cls, Set<Class<?>> set) {
        return (MessageHandler) findHandler(this.receivedMessageHandlers, this.receivedMessageHandlerCache, cls, set);
    }

    private MessageHandler<Object> findSentMessageHandler(Class<?> cls, Set<Class<?>> set) {
        return (MessageHandler) findHandler(this.sentMessageHandlers, this.sentMessageHandlerCache, cls, set);
    }

    private ExceptionHandler<Throwable> findExceptionHandler(Class<?> cls, Set<Class<?>> set) {
        return (ExceptionHandler) findHandler(this.exceptionHandlers, this.exceptionHandlerCache, cls, set);
    }

    private Object findHandler(Map<Class<?>, ?> map, Map map2, Class<?> cls, Set<Class<?>> set) {
        if (set != null && set.contains(cls)) {
            return null;
        }
        Object obj = map2.get(cls);
        if (obj != null) {
            return obj;
        }
        Object findHandler;
        obj = map.get(cls);
        if (obj == null) {
            if (set == null) {
                set = new IdentityHashSet();
            }
            set.add(cls);
            for (Class findHandler2 : cls.getInterfaces()) {
                obj = findHandler(map, map2, findHandler2, set);
                if (obj != null) {
                    break;
                }
            }
        }
        if (obj == null) {
            Class superclass = cls.getSuperclass();
            if (superclass != null) {
                findHandler = findHandler(map, map2, superclass, null);
                if (findHandler != null) {
                    return findHandler;
                }
                map2.put(cls, findHandler);
                return findHandler;
            }
        }
        findHandler = obj;
        if (findHandler != null) {
            return findHandler;
        }
        map2.put(cls, findHandler);
        return findHandler;
    }
}
