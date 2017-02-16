package org.apache.mina.core.future;

import org.apache.mina.core.session.IoSession;

public interface ConnectFuture extends IoFuture {
    ConnectFuture addListener(IoFutureListener<?> ioFutureListener);

    ConnectFuture awaitUninterruptibly();

    boolean cancel();

    IoSession getSession();

    boolean isCanceled();

    boolean isConnected();

    void setException(Throwable th);

    void setSession(IoSession ioSession);
}
