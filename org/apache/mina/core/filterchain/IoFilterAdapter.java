package org.apache.mina.core.filterchain;

import org.apache.mina.core.filterchain.IoFilter.NextFilter;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.core.write.WriteRequest;

public class IoFilterAdapter implements IoFilter {
    public void init() {
    }

    public void destroy() {
    }

    public void onPreAdd(IoFilterChain ioFilterChain, String str, NextFilter nextFilter) {
    }

    public void onPostAdd(IoFilterChain ioFilterChain, String str, NextFilter nextFilter) {
    }

    public void onPreRemove(IoFilterChain ioFilterChain, String str, NextFilter nextFilter) {
    }

    public void onPostRemove(IoFilterChain ioFilterChain, String str, NextFilter nextFilter) {
    }

    public void sessionCreated(NextFilter nextFilter, IoSession ioSession) {
        nextFilter.sessionCreated(ioSession);
    }

    public void sessionOpened(NextFilter nextFilter, IoSession ioSession) {
        nextFilter.sessionOpened(ioSession);
    }

    public void sessionClosed(NextFilter nextFilter, IoSession ioSession) {
        nextFilter.sessionClosed(ioSession);
    }

    public void sessionIdle(NextFilter nextFilter, IoSession ioSession, IdleStatus idleStatus) {
        nextFilter.sessionIdle(ioSession, idleStatus);
    }

    public void exceptionCaught(NextFilter nextFilter, IoSession ioSession, Throwable th) {
        nextFilter.exceptionCaught(ioSession, th);
    }

    public void messageReceived(NextFilter nextFilter, IoSession ioSession, Object obj) {
        nextFilter.messageReceived(ioSession, obj);
    }

    public void messageSent(NextFilter nextFilter, IoSession ioSession, WriteRequest writeRequest) {
        nextFilter.messageSent(ioSession, writeRequest);
    }

    public void filterWrite(NextFilter nextFilter, IoSession ioSession, WriteRequest writeRequest) {
        nextFilter.filterWrite(ioSession, writeRequest);
    }

    public void filterClose(NextFilter nextFilter, IoSession ioSession) {
        nextFilter.filterClose(ioSession);
    }

    public void inputClosed(NextFilter nextFilter, IoSession ioSession) {
        nextFilter.inputClosed(ioSession);
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}
