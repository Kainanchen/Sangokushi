package org.apache.mina.core.future;

public interface WriteFuture extends IoFuture {
    WriteFuture addListener(IoFutureListener<?> ioFutureListener);

    WriteFuture awaitUninterruptibly();

    boolean isWritten();

    void setException(Throwable th);

    void setWritten();
}
