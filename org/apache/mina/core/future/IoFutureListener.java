package org.apache.mina.core.future;

import java.util.EventListener;

public interface IoFutureListener<F extends IoFuture> extends EventListener {
    public static final IoFutureListener<IoFuture> CLOSE;

    /* renamed from: org.apache.mina.core.future.IoFutureListener.1 */
    static class C04071 implements IoFutureListener<IoFuture> {
        C04071() {
        }

        public final void operationComplete(IoFuture ioFuture) {
            ioFuture.getSession().closeNow();
        }
    }

    void operationComplete(F f);

    static {
        CLOSE = new C04071();
    }
}
