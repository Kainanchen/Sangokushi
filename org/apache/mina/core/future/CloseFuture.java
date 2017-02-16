package org.apache.mina.core.future;

public interface CloseFuture extends IoFuture {
    CloseFuture addListener(IoFutureListener<?> ioFutureListener);

    CloseFuture awaitUninterruptibly();

    boolean isClosed();

    void setClosed();
}
