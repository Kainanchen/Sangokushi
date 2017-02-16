package org.apache.mina.filter.util;

import org.apache.mina.core.filterchain.IoFilter.NextFilter;
import org.apache.mina.core.filterchain.IoFilterAdapter;
import org.apache.mina.core.filterchain.IoFilterEvent;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoEventType;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.core.write.WriteRequest;

public abstract class CommonEventFilter extends IoFilterAdapter {
    public abstract void filter(IoFilterEvent ioFilterEvent);

    public final void sessionCreated(NextFilter nextFilter, IoSession ioSession) {
        filter(new IoFilterEvent(nextFilter, IoEventType.SESSION_CREATED, ioSession, null));
    }

    public final void sessionOpened(NextFilter nextFilter, IoSession ioSession) {
        filter(new IoFilterEvent(nextFilter, IoEventType.SESSION_OPENED, ioSession, null));
    }

    public final void sessionClosed(NextFilter nextFilter, IoSession ioSession) {
        filter(new IoFilterEvent(nextFilter, IoEventType.SESSION_CLOSED, ioSession, null));
    }

    public final void sessionIdle(NextFilter nextFilter, IoSession ioSession, IdleStatus idleStatus) {
        filter(new IoFilterEvent(nextFilter, IoEventType.SESSION_IDLE, ioSession, idleStatus));
    }

    public final void exceptionCaught(NextFilter nextFilter, IoSession ioSession, Throwable th) {
        filter(new IoFilterEvent(nextFilter, IoEventType.EXCEPTION_CAUGHT, ioSession, th));
    }

    public final void messageReceived(NextFilter nextFilter, IoSession ioSession, Object obj) {
        filter(new IoFilterEvent(nextFilter, IoEventType.MESSAGE_RECEIVED, ioSession, obj));
    }

    public final void messageSent(NextFilter nextFilter, IoSession ioSession, WriteRequest writeRequest) {
        filter(new IoFilterEvent(nextFilter, IoEventType.MESSAGE_SENT, ioSession, writeRequest));
    }

    public final void filterWrite(NextFilter nextFilter, IoSession ioSession, WriteRequest writeRequest) {
        filter(new IoFilterEvent(nextFilter, IoEventType.WRITE, ioSession, writeRequest));
    }

    public final void filterClose(NextFilter nextFilter, IoSession ioSession) {
        filter(new IoFilterEvent(nextFilter, IoEventType.CLOSE, ioSession, null));
    }
}
