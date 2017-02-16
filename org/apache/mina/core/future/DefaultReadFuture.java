package org.apache.mina.core.future;

import java.io.IOException;
import org.apache.mina.core.RuntimeIoException;
import org.apache.mina.core.session.IoSession;

public class DefaultReadFuture extends DefaultIoFuture implements ReadFuture {
    private static final Object CLOSED;

    static {
        CLOSED = new Object();
    }

    public DefaultReadFuture(IoSession ioSession) {
        super(ioSession);
    }

    public Object getMessage() {
        if (!isDone()) {
            return null;
        }
        Object value = getValue();
        if (value == CLOSED) {
            return null;
        }
        if (value instanceof RuntimeException) {
            throw ((RuntimeException) value);
        } else if (value instanceof Error) {
            throw ((Error) value);
        } else if (!(value instanceof IOException) && !(value instanceof Exception)) {
            return value;
        } else {
            throw new RuntimeIoException((Exception) value);
        }
    }

    public boolean isRead() {
        if (!isDone()) {
            return false;
        }
        Object value = getValue();
        if (value == CLOSED || (value instanceof Throwable)) {
            return false;
        }
        return true;
    }

    public boolean isClosed() {
        if (isDone() && getValue() == CLOSED) {
            return true;
        }
        return false;
    }

    public Throwable getException() {
        if (isDone()) {
            Object value = getValue();
            if (value instanceof Throwable) {
                return (Throwable) value;
            }
        }
        return null;
    }

    public void setClosed() {
        setValue(CLOSED);
    }

    public void setRead(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("message");
        }
        setValue(obj);
    }

    public void setException(Throwable th) {
        if (th == null) {
            throw new IllegalArgumentException("exception");
        }
        setValue(th);
    }

    public ReadFuture await() {
        return (ReadFuture) super.await();
    }

    public ReadFuture awaitUninterruptibly() {
        return (ReadFuture) super.awaitUninterruptibly();
    }

    public ReadFuture addListener(IoFutureListener<?> ioFutureListener) {
        return (ReadFuture) super.addListener(ioFutureListener);
    }

    public ReadFuture removeListener(IoFutureListener<?> ioFutureListener) {
        return (ReadFuture) super.removeListener(ioFutureListener);
    }
}
