package org.apache.mina.core.filterchain;

import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.core.write.WriteRequest;

public interface IoFilter {

    public interface NextFilter {
        void exceptionCaught(IoSession ioSession, Throwable th);

        void filterClose(IoSession ioSession);

        void filterWrite(IoSession ioSession, WriteRequest writeRequest);

        void inputClosed(IoSession ioSession);

        void messageReceived(IoSession ioSession, Object obj);

        void messageSent(IoSession ioSession, WriteRequest writeRequest);

        void sessionClosed(IoSession ioSession);

        void sessionCreated(IoSession ioSession);

        void sessionIdle(IoSession ioSession, IdleStatus idleStatus);

        void sessionOpened(IoSession ioSession);
    }

    void destroy();

    void exceptionCaught(NextFilter nextFilter, IoSession ioSession, Throwable th);

    void filterClose(NextFilter nextFilter, IoSession ioSession);

    void filterWrite(NextFilter nextFilter, IoSession ioSession, WriteRequest writeRequest);

    void init();

    void inputClosed(NextFilter nextFilter, IoSession ioSession);

    void messageReceived(NextFilter nextFilter, IoSession ioSession, Object obj);

    void messageSent(NextFilter nextFilter, IoSession ioSession, WriteRequest writeRequest);

    void onPostAdd(IoFilterChain ioFilterChain, String str, NextFilter nextFilter);

    void onPostRemove(IoFilterChain ioFilterChain, String str, NextFilter nextFilter);

    void onPreAdd(IoFilterChain ioFilterChain, String str, NextFilter nextFilter);

    void onPreRemove(IoFilterChain ioFilterChain, String str, NextFilter nextFilter);

    void sessionClosed(NextFilter nextFilter, IoSession ioSession);

    void sessionCreated(NextFilter nextFilter, IoSession ioSession);

    void sessionIdle(NextFilter nextFilter, IoSession ioSession, IdleStatus idleStatus);

    void sessionOpened(NextFilter nextFilter, IoSession ioSession);
}
