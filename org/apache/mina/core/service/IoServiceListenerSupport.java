package org.apache.mina.core.service;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.mina.core.filterchain.IoFilterChain;
import org.apache.mina.core.future.IoFuture;
import org.apache.mina.core.future.IoFutureListener;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.util.ExceptionMonitor;

public class IoServiceListenerSupport {
    private final AtomicBoolean activated;
    private volatile long activationTime;
    private AtomicLong cumulativeManagedSessionCount;
    private volatile int largestManagedSessionCount;
    private final List<IoServiceListener> listeners;
    private final ConcurrentMap<Long, IoSession> managedSessions;
    private final Map<Long, IoSession> readOnlyManagedSessions;
    private final IoService service;

    private static class LockNotifyingListener implements IoFutureListener<IoFuture> {
        private final Object lock;

        public LockNotifyingListener(Object obj) {
            this.lock = obj;
        }

        public void operationComplete(IoFuture ioFuture) {
            synchronized (this.lock) {
                this.lock.notifyAll();
            }
        }
    }

    public IoServiceListenerSupport(IoService ioService) {
        this.listeners = new CopyOnWriteArrayList();
        this.managedSessions = new ConcurrentHashMap();
        this.readOnlyManagedSessions = Collections.unmodifiableMap(this.managedSessions);
        this.activated = new AtomicBoolean();
        this.largestManagedSessionCount = 0;
        this.cumulativeManagedSessionCount = new AtomicLong(0);
        if (ioService == null) {
            throw new IllegalArgumentException("service");
        }
        this.service = ioService;
    }

    public void add(IoServiceListener ioServiceListener) {
        if (ioServiceListener != null) {
            this.listeners.add(ioServiceListener);
        }
    }

    public void remove(IoServiceListener ioServiceListener) {
        if (ioServiceListener != null) {
            this.listeners.remove(ioServiceListener);
        }
    }

    public long getActivationTime() {
        return this.activationTime;
    }

    public Map<Long, IoSession> getManagedSessions() {
        return this.readOnlyManagedSessions;
    }

    public int getManagedSessionCount() {
        return this.managedSessions.size();
    }

    public int getLargestManagedSessionCount() {
        return this.largestManagedSessionCount;
    }

    public long getCumulativeManagedSessionCount() {
        return this.cumulativeManagedSessionCount.get();
    }

    public boolean isActive() {
        return this.activated.get();
    }

    public void fireServiceActivated() {
        if (this.activated.compareAndSet(false, true)) {
            this.activationTime = System.currentTimeMillis();
            for (IoServiceListener serviceActivated : this.listeners) {
                try {
                    serviceActivated.serviceActivated(this.service);
                } catch (Throwable e) {
                    ExceptionMonitor.getInstance().exceptionCaught(e);
                }
            }
        }
    }

    public void fireServiceDeactivated() {
        if (this.activated.compareAndSet(true, false)) {
            try {
                for (IoServiceListener serviceDeactivated : this.listeners) {
                    serviceDeactivated.serviceDeactivated(this.service);
                }
                disconnectSessions();
            } catch (Throwable e) {
                ExceptionMonitor.getInstance().exceptionCaught(e);
            } catch (Throwable th) {
                disconnectSessions();
            }
        }
    }

    public void fireSessionCreated(IoSession ioSession) {
        boolean z = false;
        if (ioSession.getService() instanceof IoConnector) {
            synchronized (this.managedSessions) {
                z = this.managedSessions.isEmpty();
            }
        }
        if (this.managedSessions.putIfAbsent(Long.valueOf(ioSession.getId()), ioSession) == null) {
            if (z) {
                fireServiceActivated();
            }
            IoFilterChain filterChain = ioSession.getFilterChain();
            filterChain.fireSessionCreated();
            filterChain.fireSessionOpened();
            int size = this.managedSessions.size();
            if (size > this.largestManagedSessionCount) {
                this.largestManagedSessionCount = size;
            }
            this.cumulativeManagedSessionCount.incrementAndGet();
            for (IoServiceListener sessionCreated : this.listeners) {
                try {
                    sessionCreated.sessionCreated(ioSession);
                } catch (Throwable e) {
                    ExceptionMonitor.getInstance().exceptionCaught(e);
                }
            }
        }
    }

    public void fireSessionDestroyed(IoSession ioSession) {
        if (this.managedSessions.remove(Long.valueOf(ioSession.getId())) != null) {
            ioSession.getFilterChain().fireSessionClosed();
            try {
                for (IoServiceListener sessionDestroyed : this.listeners) {
                    sessionDestroyed.sessionDestroyed(ioSession);
                }
                if (ioSession.getService() instanceof IoConnector) {
                    boolean isEmpty;
                    synchronized (this.managedSessions) {
                        isEmpty = this.managedSessions.isEmpty();
                    }
                    if (isEmpty) {
                        fireServiceDeactivated();
                    }
                }
            } catch (Throwable e) {
                ExceptionMonitor.getInstance().exceptionCaught(e);
            } catch (Throwable th) {
                if (ioSession.getService() instanceof IoConnector) {
                    synchronized (this.managedSessions) {
                    }
                    if (this.managedSessions.isEmpty()) {
                        fireServiceDeactivated();
                    }
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void disconnectSessions() {
        /*
        r4 = this;
        r0 = r4.service;
        r0 = r0 instanceof org.apache.mina.core.service.IoAcceptor;
        if (r0 != 0) goto L_0x0007;
    L_0x0006:
        return;
    L_0x0007:
        r0 = r4.service;
        r0 = (org.apache.mina.core.service.IoAcceptor) r0;
        r0 = r0.isCloseOnDeactivation();
        if (r0 == 0) goto L_0x0006;
    L_0x0011:
        r1 = new java.lang.Object;
        r1.<init>();
        r2 = new org.apache.mina.core.service.IoServiceListenerSupport$LockNotifyingListener;
        r2.<init>(r1);
        r0 = r4.managedSessions;
        r0 = r0.values();
        r3 = r0.iterator();
    L_0x0025:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x0039;
    L_0x002b:
        r0 = r3.next();
        r0 = (org.apache.mina.core.session.IoSession) r0;
        r0 = r0.closeNow();
        r0.addListener(r2);
        goto L_0x0025;
    L_0x0039:
        monitor-enter(r1);	 Catch:{ InterruptedException -> 0x004b }
    L_0x003a:
        r0 = r4.managedSessions;	 Catch:{ all -> 0x0048 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0048 }
        if (r0 != 0) goto L_0x004d;
    L_0x0042:
        r2 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        r1.wait(r2);	 Catch:{ all -> 0x0048 }
        goto L_0x003a;
    L_0x0048:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0048 }
        throw r0;	 Catch:{ InterruptedException -> 0x004b }
    L_0x004b:
        r0 = move-exception;
        goto L_0x0006;
    L_0x004d:
        monitor-exit(r1);	 Catch:{ all -> 0x0048 }
        goto L_0x0006;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.mina.core.service.IoServiceListenerSupport.disconnectSessions():void");
    }
}
