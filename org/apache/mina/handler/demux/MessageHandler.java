package org.apache.mina.handler.demux;

import org.apache.mina.core.session.IoSession;

public interface MessageHandler<E> {
    public static final MessageHandler<Object> NOOP;

    /* renamed from: org.apache.mina.handler.demux.MessageHandler.1 */
    static class C04571 implements MessageHandler<Object> {
        C04571() {
        }

        public final void handleMessage(IoSession ioSession, Object obj) {
        }
    }

    void handleMessage(IoSession ioSession, E e);

    static {
        NOOP = new C04571();
    }
}
