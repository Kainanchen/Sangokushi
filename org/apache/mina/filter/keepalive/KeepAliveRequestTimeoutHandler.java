package org.apache.mina.filter.keepalive;

import org.apache.mina.core.session.IoSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface KeepAliveRequestTimeoutHandler {
    public static final KeepAliveRequestTimeoutHandler CLOSE;
    public static final KeepAliveRequestTimeoutHandler DEAF_SPEAKER;
    public static final KeepAliveRequestTimeoutHandler EXCEPTION;
    public static final KeepAliveRequestTimeoutHandler LOG;
    public static final KeepAliveRequestTimeoutHandler NOOP;

    /* renamed from: org.apache.mina.filter.keepalive.KeepAliveRequestTimeoutHandler.1 */
    static class C04401 implements KeepAliveRequestTimeoutHandler {
        C04401() {
        }

        public final void keepAliveRequestTimedOut(KeepAliveFilter keepAliveFilter, IoSession ioSession) {
        }
    }

    /* renamed from: org.apache.mina.filter.keepalive.KeepAliveRequestTimeoutHandler.2 */
    static class C04412 implements KeepAliveRequestTimeoutHandler {
        private final Logger LOGGER;

        C04412() {
            this.LOGGER = LoggerFactory.getLogger(KeepAliveFilter.class);
        }

        public final void keepAliveRequestTimedOut(KeepAliveFilter keepAliveFilter, IoSession ioSession) {
            this.LOGGER.warn("A keep-alive response message was not received within {} second(s).", Integer.valueOf(keepAliveFilter.getRequestTimeout()));
        }
    }

    /* renamed from: org.apache.mina.filter.keepalive.KeepAliveRequestTimeoutHandler.3 */
    static class C04423 implements KeepAliveRequestTimeoutHandler {
        C04423() {
        }

        public final void keepAliveRequestTimedOut(KeepAliveFilter keepAliveFilter, IoSession ioSession) {
            throw new KeepAliveRequestTimeoutException("A keep-alive response message was not received within " + keepAliveFilter.getRequestTimeout() + " second(s).");
        }
    }

    /* renamed from: org.apache.mina.filter.keepalive.KeepAliveRequestTimeoutHandler.4 */
    static class C04434 implements KeepAliveRequestTimeoutHandler {
        private final Logger LOGGER;

        C04434() {
            this.LOGGER = LoggerFactory.getLogger(KeepAliveFilter.class);
        }

        public final void keepAliveRequestTimedOut(KeepAliveFilter keepAliveFilter, IoSession ioSession) {
            this.LOGGER.warn("Closing the session because a keep-alive response message was not received within {} second(s).", Integer.valueOf(keepAliveFilter.getRequestTimeout()));
            ioSession.closeNow();
        }
    }

    /* renamed from: org.apache.mina.filter.keepalive.KeepAliveRequestTimeoutHandler.5 */
    static class C04445 implements KeepAliveRequestTimeoutHandler {
        C04445() {
        }

        public final void keepAliveRequestTimedOut(KeepAliveFilter keepAliveFilter, IoSession ioSession) {
            throw new Error("Shouldn't be invoked.  Please file a bug report.");
        }
    }

    void keepAliveRequestTimedOut(KeepAliveFilter keepAliveFilter, IoSession ioSession);

    static {
        NOOP = new C04401();
        LOG = new C04412();
        EXCEPTION = new C04423();
        CLOSE = new C04434();
        DEAF_SPEAKER = new C04445();
    }
}
