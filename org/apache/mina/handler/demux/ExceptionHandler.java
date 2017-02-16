package org.apache.mina.handler.demux;

import org.apache.mina.core.session.IoSession;

public interface ExceptionHandler<E extends Throwable> {
    public static final ExceptionHandler<Throwable> CLOSE;
    public static final ExceptionHandler<Throwable> NOOP;

    /* renamed from: org.apache.mina.handler.demux.ExceptionHandler.1 */
    static class C04551 implements ExceptionHandler<Throwable> {
        C04551() {
        }

        public final void exceptionCaught(IoSession ioSession, Throwable th) {
        }
    }

    /* renamed from: org.apache.mina.handler.demux.ExceptionHandler.2 */
    static class C04562 implements ExceptionHandler<Throwable> {
        C04562() {
        }

        public final void exceptionCaught(IoSession ioSession, Throwable th) {
            ioSession.closeNow();
        }
    }

    void exceptionCaught(IoSession ioSession, E e);

    static {
        NOOP = new C04551();
        CLOSE = new C04562();
    }
}
