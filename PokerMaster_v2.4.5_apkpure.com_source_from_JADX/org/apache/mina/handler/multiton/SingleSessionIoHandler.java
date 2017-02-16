package org.apache.mina.handler.multiton;

import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;

@Deprecated
public interface SingleSessionIoHandler {
    void exceptionCaught(Throwable th);

    void inputClosed(IoSession ioSession);

    void messageReceived(Object obj);

    void messageSent(Object obj);

    void sessionClosed();

    void sessionCreated();

    void sessionIdle(IdleStatus idleStatus);

    void sessionOpened();
}
