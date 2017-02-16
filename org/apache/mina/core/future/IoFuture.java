package org.apache.mina.core.future;

import org.apache.mina.core.session.IoSession;

public interface IoFuture {
    IoFuture addListener(IoFutureListener<?> ioFutureListener);

    IoFuture await();

    boolean await(long j);

    IoFuture awaitUninterruptibly();

    boolean awaitUninterruptibly(long j);

    IoSession getSession();
}
