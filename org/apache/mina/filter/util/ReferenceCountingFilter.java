package org.apache.mina.filter.util;

import org.apache.mina.core.filterchain.IoFilter;
import org.apache.mina.core.filterchain.IoFilter.NextFilter;
import org.apache.mina.core.filterchain.IoFilterAdapter;
import org.apache.mina.core.filterchain.IoFilterChain;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.core.write.WriteRequest;

public class ReferenceCountingFilter extends IoFilterAdapter {
    private int count;
    private final IoFilter filter;

    public ReferenceCountingFilter(IoFilter ioFilter) {
        this.count = 0;
        this.filter = ioFilter;
    }

    public void init() {
    }

    public void destroy() {
    }

    public synchronized void onPreAdd(IoFilterChain ioFilterChain, String str, NextFilter nextFilter) {
        if (this.count == 0) {
            this.filter.init();
        }
        this.count++;
        this.filter.onPreAdd(ioFilterChain, str, nextFilter);
    }

    public synchronized void onPostRemove(IoFilterChain ioFilterChain, String str, NextFilter nextFilter) {
        this.filter.onPostRemove(ioFilterChain, str, nextFilter);
        this.count--;
        if (this.count == 0) {
            this.filter.destroy();
        }
    }

    public void exceptionCaught(NextFilter nextFilter, IoSession ioSession, Throwable th) {
        this.filter.exceptionCaught(nextFilter, ioSession, th);
    }

    public void filterClose(NextFilter nextFilter, IoSession ioSession) {
        this.filter.filterClose(nextFilter, ioSession);
    }

    public void filterWrite(NextFilter nextFilter, IoSession ioSession, WriteRequest writeRequest) {
        this.filter.filterWrite(nextFilter, ioSession, writeRequest);
    }

    public void messageReceived(NextFilter nextFilter, IoSession ioSession, Object obj) {
        this.filter.messageReceived(nextFilter, ioSession, obj);
    }

    public void messageSent(NextFilter nextFilter, IoSession ioSession, WriteRequest writeRequest) {
        this.filter.messageSent(nextFilter, ioSession, writeRequest);
    }

    public void onPostAdd(IoFilterChain ioFilterChain, String str, NextFilter nextFilter) {
        this.filter.onPostAdd(ioFilterChain, str, nextFilter);
    }

    public void onPreRemove(IoFilterChain ioFilterChain, String str, NextFilter nextFilter) {
        this.filter.onPreRemove(ioFilterChain, str, nextFilter);
    }

    public void sessionClosed(NextFilter nextFilter, IoSession ioSession) {
        this.filter.sessionClosed(nextFilter, ioSession);
    }

    public void sessionCreated(NextFilter nextFilter, IoSession ioSession) {
        this.filter.sessionCreated(nextFilter, ioSession);
    }

    public void sessionIdle(NextFilter nextFilter, IoSession ioSession, IdleStatus idleStatus) {
        this.filter.sessionIdle(nextFilter, ioSession, idleStatus);
    }

    public void sessionOpened(NextFilter nextFilter, IoSession ioSession) {
        this.filter.sessionOpened(nextFilter, ioSession);
    }
}
