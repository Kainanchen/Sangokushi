package org.apache.mina.core.future;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.mina.core.polling.AbstractPollingIoProcessor;
import org.apache.mina.core.service.IoProcessor;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.util.ExceptionMonitor;

public class DefaultIoFuture implements IoFuture {
    private static final long DEAD_LOCK_CHECK_INTERVAL = 5000;
    private IoFutureListener<?> firstListener;
    private final Object lock;
    private List<IoFutureListener<?>> otherListeners;
    private boolean ready;
    private Object result;
    private final IoSession session;
    private int waiters;

    public DefaultIoFuture(IoSession ioSession) {
        this.session = ioSession;
        this.lock = this;
    }

    public IoSession getSession() {
        return this.session;
    }

    @Deprecated
    public void join() {
        awaitUninterruptibly();
    }

    @Deprecated
    public boolean join(long j) {
        return awaitUninterruptibly(j);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.apache.mina.core.future.IoFuture await() {
        /*
        r4 = this;
        r1 = r4.lock;
        monitor-enter(r1);
    L_0x0003:
        r0 = r4.ready;	 Catch:{ all -> 0x0022 }
        if (r0 != 0) goto L_0x0034;
    L_0x0007:
        r0 = r4.waiters;	 Catch:{ all -> 0x0022 }
        r0 = r0 + 1;
        r4.waiters = r0;	 Catch:{ all -> 0x0022 }
        r0 = r4.lock;	 Catch:{ all -> 0x0025 }
        r2 = 5000; // 0x1388 float:7.006E-42 double:2.4703E-320;
        r0.wait(r2);	 Catch:{ all -> 0x0025 }
        r0 = r4.waiters;	 Catch:{ all -> 0x0022 }
        r0 = r0 + -1;
        r4.waiters = r0;	 Catch:{ all -> 0x0022 }
        r0 = r4.ready;	 Catch:{ all -> 0x0022 }
        if (r0 != 0) goto L_0x0003;
    L_0x001e:
        r4.checkDeadLock();	 Catch:{ all -> 0x0022 }
        goto L_0x0003;
    L_0x0022:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0022 }
        throw r0;
    L_0x0025:
        r0 = move-exception;
        r2 = r4.waiters;	 Catch:{ all -> 0x0022 }
        r2 = r2 + -1;
        r4.waiters = r2;	 Catch:{ all -> 0x0022 }
        r2 = r4.ready;	 Catch:{ all -> 0x0022 }
        if (r2 != 0) goto L_0x0033;
    L_0x0030:
        r4.checkDeadLock();	 Catch:{ all -> 0x0022 }
    L_0x0033:
        throw r0;	 Catch:{ all -> 0x0022 }
    L_0x0034:
        monitor-exit(r1);	 Catch:{ all -> 0x0022 }
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.mina.core.future.DefaultIoFuture.await():org.apache.mina.core.future.IoFuture");
    }

    public boolean await(long j, TimeUnit timeUnit) {
        return await0(timeUnit.toMillis(j), true);
    }

    public boolean await(long j) {
        return await0(j, true);
    }

    public IoFuture awaitUninterruptibly() {
        try {
            await0(Long.MAX_VALUE, false);
        } catch (InterruptedException e) {
        }
        return this;
    }

    public boolean awaitUninterruptibly(long j, TimeUnit timeUnit) {
        try {
            return await0(timeUnit.toMillis(j), false);
        } catch (InterruptedException e) {
            throw new InternalError();
        }
    }

    public boolean awaitUninterruptibly(long j) {
        try {
            return await0(j, false);
        } catch (InterruptedException e) {
            throw new InternalError();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean await0(long r8, boolean r10) {
        /*
        r7 = this;
        r4 = 0;
        r0 = java.lang.System.currentTimeMillis();
        r0 = r0 + r8;
        r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r2 >= 0) goto L_0x0010;
    L_0x000b:
        r0 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
    L_0x0010:
        r3 = r7.lock;
        monitor-enter(r3);
        r2 = r7.ready;	 Catch:{ all -> 0x004d }
        if (r2 != 0) goto L_0x001b;
    L_0x0017:
        r2 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1));
        if (r2 > 0) goto L_0x001f;
    L_0x001b:
        r0 = r7.ready;	 Catch:{ all -> 0x004d }
        monitor-exit(r3);	 Catch:{ all -> 0x004d }
    L_0x001e:
        return r0;
    L_0x001f:
        r2 = r7.waiters;	 Catch:{ all -> 0x004d }
        r2 = r2 + 1;
        r7.waiters = r2;	 Catch:{ all -> 0x004d }
    L_0x0025:
        r4 = 5000; // 0x1388 float:7.006E-42 double:2.4703E-320;
        r4 = java.lang.Math.min(r8, r4);	 Catch:{ InterruptedException -> 0x0050 }
        r2 = r7.lock;	 Catch:{ InterruptedException -> 0x0050 }
        r2.wait(r4);	 Catch:{ InterruptedException -> 0x0050 }
    L_0x0030:
        r2 = r7.ready;	 Catch:{ all -> 0x0054 }
        if (r2 != 0) goto L_0x003c;
    L_0x0034:
        r4 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x0054 }
        r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1));
        if (r2 >= 0) goto L_0x0063;
    L_0x003c:
        r0 = r7.ready;	 Catch:{ all -> 0x0054 }
        r1 = r7.waiters;	 Catch:{ all -> 0x004d }
        r1 = r1 + -1;
        r7.waiters = r1;	 Catch:{ all -> 0x004d }
        r1 = r7.ready;	 Catch:{ all -> 0x004d }
        if (r1 != 0) goto L_0x004b;
    L_0x0048:
        r7.checkDeadLock();	 Catch:{ all -> 0x004d }
    L_0x004b:
        monitor-exit(r3);	 Catch:{ all -> 0x004d }
        goto L_0x001e;
    L_0x004d:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x004d }
        throw r0;
    L_0x0050:
        r2 = move-exception;
        if (r10 == 0) goto L_0x0030;
    L_0x0053:
        throw r2;	 Catch:{ all -> 0x0054 }
    L_0x0054:
        r0 = move-exception;
        r1 = r7.waiters;	 Catch:{ all -> 0x004d }
        r1 = r1 + -1;
        r7.waiters = r1;	 Catch:{ all -> 0x004d }
        r1 = r7.ready;	 Catch:{ all -> 0x004d }
        if (r1 != 0) goto L_0x0062;
    L_0x005f:
        r7.checkDeadLock();	 Catch:{ all -> 0x004d }
    L_0x0062:
        throw r0;	 Catch:{ all -> 0x004d }
    L_0x0063:
        r7.checkDeadLock();	 Catch:{ all -> 0x0054 }
        goto L_0x0025;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.mina.core.future.DefaultIoFuture.await0(long, boolean):boolean");
    }

    private void checkDeadLock() {
        int i = 0;
        if ((this instanceof CloseFuture) || (this instanceof WriteFuture) || (this instanceof ReadFuture) || (this instanceof ConnectFuture)) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            for (StackTraceElement className : stackTrace) {
                if (AbstractPollingIoProcessor.class.getName().equals(className.getClassName())) {
                    new IllegalStateException("t").getStackTrace();
                    throw new IllegalStateException("DEAD LOCK: " + IoFuture.class.getSimpleName() + ".await() was invoked from an I/O processor thread.  Please use " + IoFutureListener.class.getSimpleName() + " or configure a proper thread model alternatively.");
                }
            }
            int length = stackTrace.length;
            while (i < length) {
                try {
                    if (IoProcessor.class.isAssignableFrom(DefaultIoFuture.class.getClassLoader().loadClass(stackTrace[i].getClassName()))) {
                        throw new IllegalStateException("DEAD LOCK: " + IoFuture.class.getSimpleName() + ".await() was invoked from an I/O processor thread.  Please use " + IoFutureListener.class.getSimpleName() + " or configure a proper thread model alternatively.");
                    }
                    i++;
                } catch (ClassNotFoundException e) {
                }
            }
        }
    }

    public boolean isDone() {
        boolean z;
        synchronized (this.lock) {
            z = this.ready;
        }
        return z;
    }

    public boolean setValue(Object obj) {
        boolean z = true;
        synchronized (this.lock) {
            if (this.ready) {
                z = false;
            } else {
                this.result = obj;
                this.ready = true;
                if (this.waiters > 0) {
                    this.lock.notifyAll();
                }
                notifyListeners();
            }
        }
        return z;
    }

    public Object getValue() {
        Object obj;
        synchronized (this.lock) {
            obj = this.result;
        }
        return obj;
    }

    public IoFuture addListener(IoFutureListener<?> ioFutureListener) {
        if (ioFutureListener == null) {
            throw new IllegalArgumentException("listener");
        }
        synchronized (this.lock) {
            if (this.ready) {
                notifyListener(ioFutureListener);
            } else if (this.firstListener == null) {
                this.firstListener = ioFutureListener;
            } else {
                if (this.otherListeners == null) {
                    this.otherListeners = new ArrayList(1);
                }
                this.otherListeners.add(ioFutureListener);
            }
        }
        return this;
    }

    public IoFuture removeListener(IoFutureListener<?> ioFutureListener) {
        if (ioFutureListener == null) {
            throw new IllegalArgumentException("listener");
        }
        synchronized (this.lock) {
            if (!this.ready) {
                if (ioFutureListener == this.firstListener) {
                    if (this.otherListeners == null || this.otherListeners.isEmpty()) {
                        this.firstListener = null;
                    } else {
                        this.firstListener = (IoFutureListener) this.otherListeners.remove(0);
                    }
                } else if (this.otherListeners != null) {
                    this.otherListeners.remove(ioFutureListener);
                }
            }
        }
        return this;
    }

    private void notifyListeners() {
        if (this.firstListener != null) {
            notifyListener(this.firstListener);
            this.firstListener = null;
            if (this.otherListeners != null) {
                for (IoFutureListener notifyListener : this.otherListeners) {
                    notifyListener(notifyListener);
                }
                this.otherListeners = null;
            }
        }
    }

    private void notifyListener(IoFutureListener ioFutureListener) {
        try {
            ioFutureListener.operationComplete(this);
        } catch (Throwable e) {
            ExceptionMonitor.getInstance().exceptionCaught(e);
        }
    }
}
