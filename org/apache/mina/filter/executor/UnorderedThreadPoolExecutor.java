package org.apache.mina.filter.executor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.AbortPolicy;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.mina.core.session.IoEvent;

public class UnorderedThreadPoolExecutor extends ThreadPoolExecutor {
    private static final Runnable EXIT_SIGNAL;
    private long completedTaskCount;
    private volatile int corePoolSize;
    private final AtomicInteger idleWorkers;
    private volatile int largestPoolSize;
    private volatile int maximumPoolSize;
    private final IoEventQueueHandler queueHandler;
    private volatile boolean shutdown;
    private final Set<Worker> workers;

    /* renamed from: org.apache.mina.filter.executor.UnorderedThreadPoolExecutor.1 */
    static class C04371 implements Runnable {
        C04371() {
        }

        public final void run() {
            throw new Error("This method shouldn't be called. Please file a bug report.");
        }
    }

    private class Worker implements Runnable {
        private AtomicLong completedTaskCount;
        private Thread thread;

        private Worker() {
            this.completedTaskCount = new AtomicLong(0);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
            r10 = this;
            r2 = java.lang.Thread.currentThread();
            r10.thread = r2;
        L_0x0006:
            r3 = r10.fetchTask();	 Catch:{ all -> 0x0089 }
            r2 = org.apache.mina.filter.executor.UnorderedThreadPoolExecutor.this;	 Catch:{ all -> 0x0089 }
            r2 = r2.idleWorkers;	 Catch:{ all -> 0x0089 }
            r2.decrementAndGet();	 Catch:{ all -> 0x0089 }
            if (r3 != 0) goto L_0x0064;
        L_0x0015:
            r2 = org.apache.mina.filter.executor.UnorderedThreadPoolExecutor.this;	 Catch:{ all -> 0x0089 }
            r4 = r2.workers;	 Catch:{ all -> 0x0089 }
            monitor-enter(r4);	 Catch:{ all -> 0x0089 }
            r2 = org.apache.mina.filter.executor.UnorderedThreadPoolExecutor.this;	 Catch:{ all -> 0x00b5 }
            r2 = r2.workers;	 Catch:{ all -> 0x00b5 }
            r2 = r2.size();	 Catch:{ all -> 0x00b5 }
            r5 = org.apache.mina.filter.executor.UnorderedThreadPoolExecutor.this;	 Catch:{ all -> 0x00b5 }
            r5 = r5.corePoolSize;	 Catch:{ all -> 0x00b5 }
            if (r2 <= r5) goto L_0x0063;
        L_0x002e:
            r2 = org.apache.mina.filter.executor.UnorderedThreadPoolExecutor.this;	 Catch:{ all -> 0x00b5 }
            r2 = r2.workers;	 Catch:{ all -> 0x00b5 }
            r2.remove(r10);	 Catch:{ all -> 0x00b5 }
            monitor-exit(r4);	 Catch:{ all -> 0x00b5 }
        L_0x0038:
            r2 = org.apache.mina.filter.executor.UnorderedThreadPoolExecutor.this;
            r3 = r2.workers;
            monitor-enter(r3);
            r2 = org.apache.mina.filter.executor.UnorderedThreadPoolExecutor.this;	 Catch:{ all -> 0x00c3 }
            r2 = r2.workers;	 Catch:{ all -> 0x00c3 }
            r2.remove(r10);	 Catch:{ all -> 0x00c3 }
            r2 = org.apache.mina.filter.executor.UnorderedThreadPoolExecutor.this;	 Catch:{ all -> 0x00c3 }
            r4 = r2.completedTaskCount;	 Catch:{ all -> 0x00c3 }
            r6 = r10.completedTaskCount;	 Catch:{ all -> 0x00c3 }
            r6 = r6.get();	 Catch:{ all -> 0x00c3 }
            r4 = r4 + r6;
            r2.completedTaskCount = r4;	 Catch:{ all -> 0x00c3 }
            r2 = org.apache.mina.filter.executor.UnorderedThreadPoolExecutor.this;	 Catch:{ all -> 0x00c3 }
            r2 = r2.workers;	 Catch:{ all -> 0x00c3 }
            r2.notifyAll();	 Catch:{ all -> 0x00c3 }
            monitor-exit(r3);	 Catch:{ all -> 0x00c3 }
            return;
        L_0x0063:
            monitor-exit(r4);	 Catch:{ all -> 0x00b5 }
        L_0x0064:
            r2 = org.apache.mina.filter.executor.UnorderedThreadPoolExecutor.EXIT_SIGNAL;	 Catch:{ all -> 0x0089 }
            if (r3 == r2) goto L_0x0038;
        L_0x006a:
            if (r3 == 0) goto L_0x007e;
        L_0x006c:
            r2 = org.apache.mina.filter.executor.UnorderedThreadPoolExecutor.this;	 Catch:{ all -> 0x00b8 }
            r4 = r2.queueHandler;	 Catch:{ all -> 0x00b8 }
            r5 = org.apache.mina.filter.executor.UnorderedThreadPoolExecutor.this;	 Catch:{ all -> 0x00b8 }
            r0 = r3;
            r0 = (org.apache.mina.core.session.IoEvent) r0;	 Catch:{ all -> 0x00b8 }
            r2 = r0;
            r4.polled(r5, r2);	 Catch:{ all -> 0x00b8 }
            r10.runTask(r3);	 Catch:{ all -> 0x00b8 }
        L_0x007e:
            r2 = org.apache.mina.filter.executor.UnorderedThreadPoolExecutor.this;	 Catch:{ all -> 0x0089 }
            r2 = r2.idleWorkers;	 Catch:{ all -> 0x0089 }
            r2.incrementAndGet();	 Catch:{ all -> 0x0089 }
            goto L_0x0006;
        L_0x0089:
            r2 = move-exception;
            r3 = org.apache.mina.filter.executor.UnorderedThreadPoolExecutor.this;
            r3 = r3.workers;
            monitor-enter(r3);
            r4 = org.apache.mina.filter.executor.UnorderedThreadPoolExecutor.this;	 Catch:{ all -> 0x00c6 }
            r4 = r4.workers;	 Catch:{ all -> 0x00c6 }
            r4.remove(r10);	 Catch:{ all -> 0x00c6 }
            r4 = org.apache.mina.filter.executor.UnorderedThreadPoolExecutor.this;	 Catch:{ all -> 0x00c6 }
            r6 = r4.completedTaskCount;	 Catch:{ all -> 0x00c6 }
            r5 = r10.completedTaskCount;	 Catch:{ all -> 0x00c6 }
            r8 = r5.get();	 Catch:{ all -> 0x00c6 }
            r6 = r6 + r8;
            r4.completedTaskCount = r6;	 Catch:{ all -> 0x00c6 }
            r4 = org.apache.mina.filter.executor.UnorderedThreadPoolExecutor.this;	 Catch:{ all -> 0x00c6 }
            r4 = r4.workers;	 Catch:{ all -> 0x00c6 }
            r4.notifyAll();	 Catch:{ all -> 0x00c6 }
            monitor-exit(r3);	 Catch:{ all -> 0x00c6 }
            throw r2;
        L_0x00b5:
            r2 = move-exception;
            monitor-exit(r4);	 Catch:{ all -> 0x00b5 }
            throw r2;	 Catch:{ all -> 0x0089 }
        L_0x00b8:
            r2 = move-exception;
            r3 = org.apache.mina.filter.executor.UnorderedThreadPoolExecutor.this;	 Catch:{ all -> 0x0089 }
            r3 = r3.idleWorkers;	 Catch:{ all -> 0x0089 }
            r3.incrementAndGet();	 Catch:{ all -> 0x0089 }
            throw r2;	 Catch:{ all -> 0x0089 }
        L_0x00c3:
            r2 = move-exception;
            monitor-exit(r3);	 Catch:{ all -> 0x00c3 }
            throw r2;
        L_0x00c6:
            r2 = move-exception;
            monitor-exit(r3);	 Catch:{ all -> 0x00c6 }
            throw r2;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.apache.mina.filter.executor.UnorderedThreadPoolExecutor.Worker.run():void");
        }

        private Runnable fetchTask() {
            Runnable runnable;
            Runnable runnable2 = null;
            long currentTimeMillis = System.currentTimeMillis();
            long keepAliveTime = currentTimeMillis + UnorderedThreadPoolExecutor.this.getKeepAliveTime(TimeUnit.MILLISECONDS);
            while (true) {
                long j = keepAliveTime - currentTimeMillis;
                if (j <= 0) {
                    return runnable2;
                }
                try {
                    runnable = (Runnable) UnorderedThreadPoolExecutor.this.getQueue().poll(j, TimeUnit.MILLISECONDS);
                    if (runnable != null) {
                        return runnable;
                    }
                    try {
                        System.currentTimeMillis();
                        break;
                    } catch (InterruptedException e) {
                        runnable2 = runnable;
                    }
                } catch (InterruptedException e2) {
                    currentTimeMillis = j;
                } catch (Throwable th) {
                    Throwable th2 = th;
                    if (runnable2 == null) {
                        try {
                            j = System.currentTimeMillis();
                        } catch (InterruptedException e3) {
                        }
                    } else {
                        j = currentTimeMillis;
                    }
                }
            }
            return runnable;
        }

        private void runTask(Runnable runnable) {
            UnorderedThreadPoolExecutor.this.beforeExecute(this.thread, runnable);
            Object obj = null;
            try {
                runnable.run();
                obj = 1;
                UnorderedThreadPoolExecutor.this.afterExecute(runnable, null);
                this.completedTaskCount.incrementAndGet();
            } catch (Throwable e) {
                if (obj == null) {
                    UnorderedThreadPoolExecutor.this.afterExecute(runnable, e);
                }
                throw e;
            }
        }
    }

    static {
        EXIT_SIGNAL = new C04371();
    }

    public UnorderedThreadPoolExecutor() {
        this(16);
    }

    public UnorderedThreadPoolExecutor(int i) {
        this(0, i);
    }

    public UnorderedThreadPoolExecutor(int i, int i2) {
        this(i, i2, 30, TimeUnit.SECONDS);
    }

    public UnorderedThreadPoolExecutor(int i, int i2, long j, TimeUnit timeUnit) {
        this(i, i2, j, timeUnit, Executors.defaultThreadFactory());
    }

    public UnorderedThreadPoolExecutor(int i, int i2, long j, TimeUnit timeUnit, IoEventQueueHandler ioEventQueueHandler) {
        this(i, i2, j, timeUnit, Executors.defaultThreadFactory(), ioEventQueueHandler);
    }

    public UnorderedThreadPoolExecutor(int i, int i2, long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
        this(i, i2, j, timeUnit, threadFactory, null);
    }

    public UnorderedThreadPoolExecutor(int i, int i2, long j, TimeUnit timeUnit, ThreadFactory threadFactory, IoEventQueueHandler ioEventQueueHandler) {
        super(0, 1, j, timeUnit, new LinkedBlockingQueue(), threadFactory, new AbortPolicy());
        this.workers = new HashSet();
        this.idleWorkers = new AtomicInteger();
        if (i < 0) {
            throw new IllegalArgumentException("corePoolSize: " + i);
        } else if (i2 == 0 || i2 < i) {
            throw new IllegalArgumentException("maximumPoolSize: " + i2);
        } else {
            if (ioEventQueueHandler == null) {
                ioEventQueueHandler = IoEventQueueHandler.NOOP;
            }
            this.corePoolSize = i;
            this.maximumPoolSize = i2;
            this.queueHandler = ioEventQueueHandler;
        }
    }

    public IoEventQueueHandler getQueueHandler() {
        return this.queueHandler;
    }

    public void setRejectedExecutionHandler(RejectedExecutionHandler rejectedExecutionHandler) {
    }

    private void addWorker() {
        synchronized (this.workers) {
            if (this.workers.size() >= this.maximumPoolSize) {
                return;
            }
            Runnable worker = new Worker();
            Thread newThread = getThreadFactory().newThread(worker);
            this.idleWorkers.incrementAndGet();
            newThread.start();
            this.workers.add(worker);
            if (this.workers.size() > this.largestPoolSize) {
                this.largestPoolSize = this.workers.size();
            }
        }
    }

    private void addWorkerIfNecessary() {
        if (this.idleWorkers.get() == 0) {
            synchronized (this.workers) {
                if (this.workers.isEmpty() || this.idleWorkers.get() == 0) {
                    addWorker();
                }
            }
        }
    }

    private void removeWorker() {
        synchronized (this.workers) {
            if (this.workers.size() <= this.corePoolSize) {
                return;
            }
            getQueue().offer(EXIT_SIGNAL);
        }
    }

    public int getMaximumPoolSize() {
        return this.maximumPoolSize;
    }

    public void setMaximumPoolSize(int i) {
        if (i <= 0 || i < this.corePoolSize) {
            throw new IllegalArgumentException("maximumPoolSize: " + i);
        }
        synchronized (this.workers) {
            this.maximumPoolSize = i;
            for (int size = this.workers.size() - i; size > 0; size--) {
                removeWorker();
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean awaitTermination(long r10, java.util.concurrent.TimeUnit r12) {
        /*
        r9 = this;
        r0 = java.lang.System.currentTimeMillis();
        r2 = r12.toMillis(r10);
        r0 = r0 + r2;
        r2 = r9.workers;
        monitor-enter(r2);
    L_0x000c:
        r3 = r9.isTerminated();	 Catch:{ all -> 0x0024 }
        if (r3 != 0) goto L_0x0027;
    L_0x0012:
        r4 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x0024 }
        r4 = r0 - r4;
        r6 = 0;
        r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r3 <= 0) goto L_0x0027;
    L_0x001e:
        r3 = r9.workers;	 Catch:{ all -> 0x0024 }
        r3.wait(r4);	 Catch:{ all -> 0x0024 }
        goto L_0x000c;
    L_0x0024:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0024 }
        throw r0;
    L_0x0027:
        monitor-exit(r2);	 Catch:{ all -> 0x0024 }
        r0 = r9.isTerminated();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.mina.filter.executor.UnorderedThreadPoolExecutor.awaitTermination(long, java.util.concurrent.TimeUnit):boolean");
    }

    public boolean isShutdown() {
        return this.shutdown;
    }

    public boolean isTerminated() {
        if (!this.shutdown) {
            return false;
        }
        boolean isEmpty;
        synchronized (this.workers) {
            isEmpty = this.workers.isEmpty();
        }
        return isEmpty;
    }

    public void shutdown() {
        if (!this.shutdown) {
            this.shutdown = true;
            synchronized (this.workers) {
                for (int size = this.workers.size(); size > 0; size--) {
                    getQueue().offer(EXIT_SIGNAL);
                }
            }
        }
    }

    public List<Runnable> shutdownNow() {
        shutdown();
        List<Runnable> arrayList = new ArrayList();
        while (true) {
            Runnable runnable = (Runnable) getQueue().poll();
            if (runnable == null) {
                return arrayList;
            }
            if (runnable == EXIT_SIGNAL) {
                getQueue().offer(EXIT_SIGNAL);
                Thread.yield();
            } else {
                getQueueHandler().polled(this, (IoEvent) runnable);
                arrayList.add(runnable);
            }
        }
    }

    public void execute(Runnable runnable) {
        if (this.shutdown) {
            rejectTask(runnable);
        }
        checkTaskType(runnable);
        IoEvent ioEvent = (IoEvent) runnable;
        boolean accept = this.queueHandler.accept(this, ioEvent);
        if (accept) {
            getQueue().offer(ioEvent);
        }
        addWorkerIfNecessary();
        if (accept) {
            this.queueHandler.offered(this, ioEvent);
        }
    }

    private void rejectTask(Runnable runnable) {
        getRejectedExecutionHandler().rejectedExecution(runnable, this);
    }

    private void checkTaskType(Runnable runnable) {
        if (!(runnable instanceof IoEvent)) {
            throw new IllegalArgumentException("task must be an IoEvent or its subclass.");
        }
    }

    public int getActiveCount() {
        int size;
        synchronized (this.workers) {
            size = this.workers.size() - this.idleWorkers.get();
        }
        return size;
    }

    public long getCompletedTaskCount() {
        long j;
        synchronized (this.workers) {
            long j2 = this.completedTaskCount;
            j = j2;
            for (Worker access$100 : this.workers) {
                j = access$100.completedTaskCount.get() + j;
            }
        }
        return j;
    }

    public int getLargestPoolSize() {
        return this.largestPoolSize;
    }

    public int getPoolSize() {
        int size;
        synchronized (this.workers) {
            size = this.workers.size();
        }
        return size;
    }

    public long getTaskCount() {
        return getCompletedTaskCount();
    }

    public boolean isTerminating() {
        boolean z;
        synchronized (this.workers) {
            z = isShutdown() && !isTerminated();
        }
        return z;
    }

    public int prestartAllCoreThreads() {
        int i = 0;
        synchronized (this.workers) {
            for (int size = this.corePoolSize - this.workers.size(); size > 0; size--) {
                addWorker();
                i++;
            }
        }
        return i;
    }

    public boolean prestartCoreThread() {
        boolean z;
        synchronized (this.workers) {
            if (this.workers.size() < this.corePoolSize) {
                addWorker();
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public void purge() {
    }

    public boolean remove(Runnable runnable) {
        boolean remove = super.remove(runnable);
        if (remove) {
            getQueueHandler().polled(this, (IoEvent) runnable);
        }
        return remove;
    }

    public int getCorePoolSize() {
        return this.corePoolSize;
    }

    public void setCorePoolSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("corePoolSize: " + i);
        } else if (i > this.maximumPoolSize) {
            throw new IllegalArgumentException("corePoolSize exceeds maximumPoolSize");
        } else {
            synchronized (this.workers) {
                if (this.corePoolSize > i) {
                    for (int i2 = this.corePoolSize - i; i2 > 0; i2--) {
                        removeWorker();
                    }
                }
                this.corePoolSize = i;
            }
        }
    }
}
