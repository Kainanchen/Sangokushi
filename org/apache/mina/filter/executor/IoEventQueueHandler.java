package org.apache.mina.filter.executor;

import java.util.EventListener;
import org.apache.mina.core.session.IoEvent;

public interface IoEventQueueHandler extends EventListener {
    public static final IoEventQueueHandler NOOP;

    /* renamed from: org.apache.mina.filter.executor.IoEventQueueHandler.1 */
    static class C04351 implements IoEventQueueHandler {
        C04351() {
        }

        public final boolean accept(Object obj, IoEvent ioEvent) {
            return true;
        }

        public final void offered(Object obj, IoEvent ioEvent) {
        }

        public final void polled(Object obj, IoEvent ioEvent) {
        }
    }

    boolean accept(Object obj, IoEvent ioEvent);

    void offered(Object obj, IoEvent ioEvent);

    void polled(Object obj, IoEvent ioEvent);

    static {
        NOOP = new C04351();
    }
}
