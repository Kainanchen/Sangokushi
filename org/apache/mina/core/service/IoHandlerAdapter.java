package org.apache.mina.core.service;

import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IoHandlerAdapter implements IoHandler {
    private static final Logger LOGGER;

    static {
        LOGGER = LoggerFactory.getLogger(IoHandlerAdapter.class);
    }

    public void sessionCreated(IoSession ioSession) {
    }

    public void sessionOpened(IoSession ioSession) {
    }

    public void sessionClosed(IoSession ioSession) {
    }

    public void sessionIdle(IoSession ioSession, IdleStatus idleStatus) {
    }

    public void exceptionCaught(IoSession ioSession, Throwable th) {
        if (LOGGER.isWarnEnabled()) {
            LOGGER.warn("EXCEPTION, please implement " + getClass().getName() + ".exceptionCaught() for proper handling:", th);
        }
    }

    public void messageReceived(IoSession ioSession, Object obj) {
    }

    public void messageSent(IoSession ioSession, Object obj) {
    }

    public void inputClosed(IoSession ioSession) {
        ioSession.closeNow();
    }
}
