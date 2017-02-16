package org.apache.mina.core.future;

import org.apache.mina.core.RuntimeIoException;
import org.apache.mina.core.session.IoSession;

public class DefaultConnectFuture extends DefaultIoFuture implements ConnectFuture {
    private static final Object CANCELED;

    static {
        CANCELED = new Object();
    }

    public DefaultConnectFuture() {
        super(null);
    }

    public static ConnectFuture newFailedFuture(Throwable th) {
        ConnectFuture defaultConnectFuture = new DefaultConnectFuture();
        defaultConnectFuture.setException(th);
        return defaultConnectFuture;
    }

    public IoSession getSession() {
        Object value = getValue();
        if (value instanceof IoSession) {
            return (IoSession) value;
        }
        if (value instanceof RuntimeException) {
            throw ((RuntimeException) value);
        } else if (value instanceof Error) {
            throw ((Error) value);
        } else if (!(value instanceof Throwable)) {
            return null;
        } else {
            throw ((RuntimeIoException) new RuntimeIoException("Failed to get the session.").initCause((Throwable) value));
        }
    }

    public Throwable getException() {
        Object value = getValue();
        if (value instanceof Throwable) {
            return (Throwable) value;
        }
        return null;
    }

    public boolean isConnected() {
        return getValue() instanceof IoSession;
    }

    public boolean isCanceled() {
        return getValue() == CANCELED;
    }

    public void setSession(IoSession ioSession) {
        if (ioSession == null) {
            throw new IllegalArgumentException("session");
        }
        setValue(ioSession);
    }

    public void setException(Throwable th) {
        if (th == null) {
            throw new IllegalArgumentException("exception");
        }
        setValue(th);
    }

    public boolean cancel() {
        return setValue(CANCELED);
    }

    public ConnectFuture await() {
        return (ConnectFuture) super.await();
    }

    public ConnectFuture awaitUninterruptibly() {
        return (ConnectFuture) super.awaitUninterruptibly();
    }

    public ConnectFuture addListener(IoFutureListener<?> ioFutureListener) {
        return (ConnectFuture) super.addListener(ioFutureListener);
    }

    public ConnectFuture removeListener(IoFutureListener<?> ioFutureListener) {
        return (ConnectFuture) super.removeListener(ioFutureListener);
    }
}
