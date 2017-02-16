package com.illuminate.texaspoker.p060e.p062b;

import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;

/* renamed from: com.illuminate.texaspoker.e.b.a */
public final class ClientSessionHandler extends IoHandlerAdapter {
    PushEventListener f6488a;

    public final void sessionCreated(IoSession ioSession) {
        super.sessionCreated(ioSession);
    }

    public final void sessionOpened(IoSession ioSession) {
        super.sessionOpened(ioSession);
        if (this.f6488a != null) {
            this.f6488a.m3922a();
        }
    }

    public final void sessionClosed(IoSession ioSession) {
        super.sessionClosed(ioSession);
        if (this.f6488a != null) {
            this.f6488a.m3925c();
        }
    }

    public final void sessionIdle(IoSession ioSession, IdleStatus idleStatus) {
        super.sessionIdle(ioSession, idleStatus);
    }

    public final void exceptionCaught(IoSession ioSession, Throwable th) {
    }

    public final void messageReceived(IoSession ioSession, Object obj) {
        super.messageReceived(ioSession, obj);
        if (this.f6488a != null) {
            this.f6488a.m3923a(obj);
        }
    }

    public final void messageSent(IoSession ioSession, Object obj) {
        super.messageSent(ioSession, obj);
        if (this.f6488a != null) {
            this.f6488a.m3924b();
        }
    }

    public final void inputClosed(IoSession ioSession) {
        super.inputClosed(ioSession);
    }
}
