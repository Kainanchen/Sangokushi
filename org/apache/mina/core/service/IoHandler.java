package org.apache.mina.core.service;

import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;

public interface IoHandler {
    void exceptionCaught(IoSession ioSession, Throwable th);

    void inputClosed(IoSession ioSession);

    void messageReceived(IoSession ioSession, Object obj);

    void messageSent(IoSession ioSession, Object obj);

    void sessionClosed(IoSession ioSession);

    void sessionCreated(IoSession ioSession);

    void sessionIdle(IoSession ioSession, IdleStatus idleStatus);

    void sessionOpened(IoSession ioSession);
}
