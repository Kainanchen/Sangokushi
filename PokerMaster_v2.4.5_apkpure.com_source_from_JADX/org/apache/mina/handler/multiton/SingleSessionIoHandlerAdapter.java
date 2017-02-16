package org.apache.mina.handler.multiton;

import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;

@Deprecated
public class SingleSessionIoHandlerAdapter implements SingleSessionIoHandler {
    private final IoSession session;

    public SingleSessionIoHandlerAdapter(IoSession ioSession) {
        if (ioSession == null) {
            throw new IllegalArgumentException("session");
        }
        this.session = ioSession;
    }

    protected IoSession getSession() {
        return this.session;
    }

    public void exceptionCaught(Throwable th) {
    }

    public void inputClosed(IoSession ioSession) {
    }

    public void messageReceived(Object obj) {
    }

    public void messageSent(Object obj) {
    }

    public void sessionClosed() {
    }

    public void sessionCreated() {
    }

    public void sessionIdle(IdleStatus idleStatus) {
    }

    public void sessionOpened() {
    }
}
