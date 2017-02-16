package org.apache.mina.core.future;

import org.apache.mina.core.session.IoSession;

public class DefaultWriteFuture extends DefaultIoFuture implements WriteFuture {
    public static WriteFuture newWrittenFuture(IoSession ioSession) {
        WriteFuture defaultWriteFuture = new DefaultWriteFuture(ioSession);
        defaultWriteFuture.setWritten();
        return defaultWriteFuture;
    }

    public static WriteFuture newNotWrittenFuture(IoSession ioSession, Throwable th) {
        WriteFuture defaultWriteFuture = new DefaultWriteFuture(ioSession);
        defaultWriteFuture.setException(th);
        return defaultWriteFuture;
    }

    public DefaultWriteFuture(IoSession ioSession) {
        super(ioSession);
    }

    public boolean isWritten() {
        if (isDone()) {
            Object value = getValue();
            if (value instanceof Boolean) {
                return ((Boolean) value).booleanValue();
            }
        }
        return false;
    }

    public void setWritten() {
        setValue(Boolean.TRUE);
    }

    public void setException(Throwable th) {
        if (th == null) {
            throw new IllegalArgumentException("exception");
        }
        setValue(th);
    }

    public WriteFuture await() {
        return (WriteFuture) super.await();
    }

    public WriteFuture awaitUninterruptibly() {
        return (WriteFuture) super.awaitUninterruptibly();
    }

    public WriteFuture addListener(IoFutureListener<?> ioFutureListener) {
        return (WriteFuture) super.addListener(ioFutureListener);
    }

    public WriteFuture removeListener(IoFutureListener<?> ioFutureListener) {
        return (WriteFuture) super.removeListener(ioFutureListener);
    }
}
