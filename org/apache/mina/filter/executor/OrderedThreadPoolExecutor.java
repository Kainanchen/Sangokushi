package org.apache.mina.filter.executor;

import java.util.HashSet;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.AbortPolicy;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.mina.core.session.AttributeKey;
import org.apache.mina.core.session.DummySession;
import org.apache.mina.core.session.IoEvent;
import org.apache.mina.core.session.IoSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrderedThreadPoolExecutor extends ThreadPoolExecutor {
    private static final int DEFAULT_INITIAL_THREAD_POOL_SIZE = 0;
    private static final int DEFAULT_KEEP_ALIVE = 30;
    private static final int DEFAULT_MAX_THREAD_POOL = 16;
    private static final IoSession EXIT_SIGNAL;
    private static final Logger LOGGER;
    private final AttributeKey TASKS_QUEUE;
    private long completedTaskCount;
    private final IoEventQueueHandler eventQueueHandler;
    private final AtomicInteger idleWorkers;
    private volatile int largestPoolSize;
    private volatile boolean shutdown;
    private final BlockingQueue<IoSession> waitingSessions;
    private final Set<Worker> workers;

    private class SessionTasksQueue {
        private boolean processingCompleted;
        private final Queue<Runnable> tasksQueue;

        private SessionTasksQueue() {
            this.tasksQueue = new ConcurrentLinkedQueue();
            this.processingCompleted = true;
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
            r8 = this;
            r0 = java.lang.Thread.currentThread();
            r8.thread = r0;
        L_0x0006:
            r0 = r8.fetchSession();	 Catch:{ all -> 0x007f }
            r1 = org.apache.mina.filter.executor.OrderedThreadPoolExecutor.this;	 Catch:{ all -> 0x007f }
            r1 = r1.idleWorkers;	 Catch:{ all -> 0x007f }
            r1.decrementAndGet();	 Catch:{ all -> 0x007f }
            if (r0 != 0) goto L_0x0064;
        L_0x0015:
            r1 = org.apache.mina.filter.executor.OrderedThreadPoolExecutor.this;	 Catch:{ all -> 0x007f }
            r1 = r1.workers;	 Catch:{ all -> 0x007f }
            monitor-enter(r1);	 Catch:{ all -> 0x007f }
            r2 = org.apache.mina.filter.executor.OrderedThreadPoolExecutor.this;	 Catch:{ all -> 0x00ab }
            r2 = r2.workers;	 Catch:{ all -> 0x00ab }
            r2 = r2.size();	 Catch:{ all -> 0x00ab }
            r3 = org.apache.mina.filter.executor.OrderedThreadPoolExecutor.this;	 Catch:{ all -> 0x00ab }
            r3 = r3.getCorePoolSize();	 Catch:{ all -> 0x00ab }
            if (r2 <= r3) goto L_0x0063;
        L_0x002e:
            r0 = org.apache.mina.filter.executor.OrderedThreadPoolExecutor.this;	 Catch:{ all -> 0x00ab }
            r0 = r0.workers;	 Catch:{ all -> 0x00ab }
            r0.remove(r8);	 Catch:{ all -> 0x00ab }
            monitor-exit(r1);	 Catch:{ all -> 0x00ab }
        L_0x0038:
            r0 = org.apache.mina.filter.executor.OrderedThreadPoolExecutor.this;
            r1 = r0.workers;
            monitor-enter(r1);
            r0 = org.apache.mina.filter.executor.OrderedThreadPoolExecutor.this;	 Catch:{ all -> 0x00b9 }
            r0 = r0.workers;	 Catch:{ all -> 0x00b9 }
            r0.remove(r8);	 Catch:{ all -> 0x00b9 }
            r0 = org.apache.mina.filter.executor.OrderedThreadPoolExecutor.this;	 Catch:{ all -> 0x00b9 }
            r2 = r0.completedTaskCount;	 Catch:{ all -> 0x00b9 }
            r4 = r8.completedTaskCount;	 Catch:{ all -> 0x00b9 }
            r4 = r4.get();	 Catch:{ all -> 0x00b9 }
            r2 = r2 + r4;
            r0.completedTaskCount = r2;	 Catch:{ all -> 0x00b9 }
            r0 = org.apache.mina.filter.executor.OrderedThreadPoolExecutor.this;	 Catch:{ all -> 0x00b9 }
            r0 = r0.workers;	 Catch:{ all -> 0x00b9 }
            r0.notifyAll();	 Catch:{ all -> 0x00b9 }
            monitor-exit(r1);	 Catch:{ all -> 0x00b9 }
            return;
        L_0x0063:
            monitor-exit(r1);	 Catch:{ all -> 0x00ab }
        L_0x0064:
            r1 = org.apache.mina.filter.executor.OrderedThreadPoolExecutor.EXIT_SIGNAL;	 Catch:{ all -> 0x007f }
            if (r0 == r1) goto L_0x0038;
        L_0x006a:
            if (r0 == 0) goto L_0x0075;
        L_0x006c:
            r1 = org.apache.mina.filter.executor.OrderedThreadPoolExecutor.this;	 Catch:{ all -> 0x00ae }
            r0 = r1.getSessionTasksQueue(r0);	 Catch:{ all -> 0x00ae }
            r8.runTasks(r0);	 Catch:{ all -> 0x00ae }
        L_0x0075:
            r0 = org.apache.mina.filter.executor.OrderedThreadPoolExecutor.this;	 Catch:{ all -> 0x007f }
            r0 = r0.idleWorkers;	 Catch:{ all -> 0x007f }
            r0.incrementAndGet();	 Catch:{ all -> 0x007f }
            goto L_0x0006;
        L_0x007f:
            r0 = move-exception;
            r1 = org.apache.mina.filter.executor.OrderedThreadPoolExecutor.this;
            r1 = r1.workers;
            monitor-enter(r1);
            r2 = org.apache.mina.filter.executor.OrderedThreadPoolExecutor.this;	 Catch:{ all -> 0x00bc }
            r2 = r2.workers;	 Catch:{ all -> 0x00bc }
            r2.remove(r8);	 Catch:{ all -> 0x00bc }
            r2 = org.apache.mina.filter.executor.OrderedThreadPoolExecutor.this;	 Catch:{ all -> 0x00bc }
            r4 = r2.completedTaskCount;	 Catch:{ all -> 0x00bc }
            r3 = r8.completedTaskCount;	 Catch:{ all -> 0x00bc }
            r6 = r3.get();	 Catch:{ all -> 0x00bc }
            r4 = r4 + r6;
            r2.completedTaskCount = r4;	 Catch:{ all -> 0x00bc }
            r2 = org.apache.mina.filter.executor.OrderedThreadPoolExecutor.this;	 Catch:{ all -> 0x00bc }
            r2 = r2.workers;	 Catch:{ all -> 0x00bc }
            r2.notifyAll();	 Catch:{ all -> 0x00bc }
            monitor-exit(r1);	 Catch:{ all -> 0x00bc }
            throw r0;
        L_0x00ab:
            r0 = move-exception;
            monitor-exit(r1);	 Catch:{ all -> 0x00ab }
            throw r0;	 Catch:{ all -> 0x007f }
        L_0x00ae:
            r0 = move-exception;
            r1 = org.apache.mina.filter.executor.OrderedThreadPoolExecutor.this;	 Catch:{ all -> 0x007f }
            r1 = r1.idleWorkers;	 Catch:{ all -> 0x007f }
            r1.incrementAndGet();	 Catch:{ all -> 0x007f }
            throw r0;	 Catch:{ all -> 0x007f }
        L_0x00b9:
            r0 = move-exception;
            monitor-exit(r1);	 Catch:{ all -> 0x00b9 }
            throw r0;
        L_0x00bc:
            r0 = move-exception;
            monitor-exit(r1);	 Catch:{ all -> 0x00bc }
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.apache.mina.filter.executor.OrderedThreadPoolExecutor.Worker.run():void");
        }

        private IoSession fetchSession() {
            IoSession ioSession;
            IoSession ioSession2 = null;
            long currentTimeMillis = System.currentTimeMillis();
            long keepAliveTime = currentTimeMillis + OrderedThreadPoolExecutor.this.getKeepAliveTime(TimeUnit.MILLISECONDS);
            while (true) {
                long j = keepAliveTime - currentTimeMillis;
                if (j <= 0) {
                    return ioSession2;
                }
                try {
                    ioSession = (IoSession) OrderedThreadPoolExecutor.this.waitingSessions.poll(j, TimeUnit.MILLISECONDS);
                    if (ioSession != null) {
                        return ioSession;
                    }
                    try {
                        System.currentTimeMillis();
                        break;
                    } catch (InterruptedException e) {
                        ioSession2 = ioSession;
                    }
                } catch (InterruptedException e2) {
                    currentTimeMillis = j;
                } catch (Throwable th) {
                    Throwable th2 = th;
                    if (ioSession2 == null) {
                        try {
                            j = System.currentTimeMillis();
                        } catch (InterruptedException e3) {
                        }
                    } else {
                        j = currentTimeMillis;
                    }
                }
            }
            return ioSession;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void runTasks(org.apache.mina.filter.executor.OrderedThreadPoolExecutor.SessionTasksQueue r5) {
            /*
            r4 = this;
        L_0x0000:
            r1 = r5.tasksQueue;
            monitor-enter(r1);
            r0 = r1.poll();	 Catch:{ all -> 0x0026 }
            r0 = (java.lang.Runnable) r0;	 Catch:{ all -> 0x0026 }
            if (r0 != 0) goto L_0x0013;
        L_0x000d:
            r0 = 1;
            r5.processingCompleted = r0;	 Catch:{ all -> 0x0026 }
            monitor-exit(r1);	 Catch:{ all -> 0x0026 }
            return;
        L_0x0013:
            monitor-exit(r1);	 Catch:{ all -> 0x0026 }
            r1 = org.apache.mina.filter.executor.OrderedThreadPoolExecutor.this;
            r2 = r1.eventQueueHandler;
            r3 = org.apache.mina.filter.executor.OrderedThreadPoolExecutor.this;
            r1 = r0;
            r1 = (org.apache.mina.core.session.IoEvent) r1;
            r2.polled(r3, r1);
            r4.runTask(r0);
            goto L_0x0000;
        L_0x0026:
            r0 = move-exception;
            monitor-exit(r1);	 Catch:{ all -> 0x0026 }
            throw r0;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.apache.mina.filter.executor.OrderedThreadPoolExecutor.Worker.runTasks(org.apache.mina.filter.executor.OrderedThreadPoolExecutor$SessionTasksQueue):void");
        }

        private void runTask(Runnable runnable) {
            OrderedThreadPoolExecutor.this.beforeExecute(this.thread, runnable);
            Object obj = null;
            try {
                runnable.run();
                obj = 1;
                OrderedThreadPoolExecutor.this.afterExecute(runnable, null);
                this.completedTaskCount.incrementAndGet();
            } catch (Throwable e) {
                if (obj == null) {
                    OrderedThreadPoolExecutor.this.afterExecute(runnable, e);
                }
                throw e;
            }
        }
    }

    static {
        LOGGER = LoggerFactory.getLogger(OrderedThreadPoolExecutor.class);
        EXIT_SIGNAL = new DummySession();
    }

    public OrderedThreadPoolExecutor() {
        this(DEFAULT_INITIAL_THREAD_POOL_SIZE, DEFAULT_MAX_THREAD_POOL, 30, TimeUnit.SECONDS, Executors.defaultThreadFactory(), null);
    }

    public OrderedThreadPoolExecutor(int i) {
        this(DEFAULT_INITIAL_THREAD_POOL_SIZE, i, 30, TimeUnit.SECONDS, Executors.defaultThreadFactory(), null);
    }

    public OrderedThreadPoolExecutor(int i, int i2) {
        this(i, i2, 30, TimeUnit.SECONDS, Executors.defaultThreadFactory(), null);
    }

    public OrderedThreadPoolExecutor(int i, int i2, long j, TimeUnit timeUnit) {
        this(i, i2, j, timeUnit, Executors.defaultThreadFactory(), null);
    }

    public OrderedThreadPoolExecutor(int i, int i2, long j, TimeUnit timeUnit, IoEventQueueHandler ioEventQueueHandler) {
        this(i, i2, j, timeUnit, Executors.defaultThreadFactory(), ioEventQueueHandler);
    }

    public OrderedThreadPoolExecutor(int i, int i2, long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
        this(i, i2, j, timeUnit, threadFactory, null);
    }

    public OrderedThreadPoolExecutor(int i, int i2, long j, TimeUnit timeUnit, ThreadFactory threadFactory, IoEventQueueHandler ioEventQueueHandler) {
        super(DEFAULT_INITIAL_THREAD_POOL_SIZE, 1, j, timeUnit, new SynchronousQueue(), threadFactory, new AbortPolicy());
        this.TASKS_QUEUE = new AttributeKey(getClass(), "tasksQueue");
        this.waitingSessions = new LinkedBlockingQueue();
        this.workers = new HashSet();
        this.idleWorkers = new AtomicInteger();
        if (i < 0) {
            throw new IllegalArgumentException("corePoolSize: " + i);
        } else if (i2 == 0 || i2 < i) {
            throw new IllegalArgumentException("maximumPoolSize: " + i2);
        } else {
            super.setCorePoolSize(i);
            super.setMaximumPoolSize(i2);
            if (ioEventQueueHandler == null) {
                this.eventQueueHandler = IoEventQueueHandler.NOOP;
            } else {
                this.eventQueueHandler = ioEventQueueHandler;
            }
        }
    }

    private SessionTasksQueue getSessionTasksQueue(IoSession ioSession) {
        SessionTasksQueue sessionTasksQueue = (SessionTasksQueue) ioSession.getAttribute(this.TASKS_QUEUE);
        if (sessionTasksQueue != null) {
            return sessionTasksQueue;
        }
        SessionTasksQueue sessionTasksQueue2 = new SessionTasksQueue();
        sessionTasksQueue = (SessionTasksQueue) ioSession.setAttributeIfAbsent(this.TASKS_QUEUE, sessionTasksQueue2);
        return sessionTasksQueue != null ? sessionTasksQueue : sessionTasksQueue2;
    }

    public IoEventQueueHandler getQueueHandler() {
        return this.eventQueueHandler;
    }

    public void setRejectedExecutionHandler(RejectedExecutionHandler rejectedExecutionHandler) {
    }

    private void addWorker() {
        synchronized (this.workers) {
            if (this.workers.size() >= super.getMaximumPoolSize()) {
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
            if (this.workers.size() <= super.getCorePoolSize()) {
                return;
            }
            this.waitingSessions.offer(EXIT_SIGNAL);
        }
    }

    public int getMaximumPoolSize() {
        return super.getMaximumPoolSize();
    }

    public void setMaximumPoolSize(int i) {
        if (i <= 0 || i < super.getCorePoolSize()) {
            throw new IllegalArgumentException("maximumPoolSize: " + i);
        }
        synchronized (this.workers) {
            super.setMaximumPoolSize(i);
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
        throw new UnsupportedOperationException("Method not decompiled: org.apache.mina.filter.executor.OrderedThreadPoolExecutor.awaitTermination(long, java.util.concurrent.TimeUnit):boolean");
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
                    this.waitingSessions.offer(EXIT_SIGNAL);
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<java.lang.Runnable> shutdownNow() {
        /*
        r8 = this;
        r8.shutdown();
        r4 = new java.util.ArrayList;
        r4.<init>();
    L_0x0008:
        r1 = r8.waitingSessions;
        r1 = r1.poll();
        r1 = (org.apache.mina.core.session.IoSession) r1;
        if (r1 == 0) goto L_0x005d;
    L_0x0012:
        r2 = EXIT_SIGNAL;
        if (r1 != r2) goto L_0x0021;
    L_0x0016:
        r1 = r8.waitingSessions;
        r2 = EXIT_SIGNAL;
        r1.offer(r2);
        java.lang.Thread.yield();
        goto L_0x0008;
    L_0x0021:
        r2 = r8.TASKS_QUEUE;
        r1 = r1.getAttribute(r2);
        r1 = (org.apache.mina.filter.executor.OrderedThreadPoolExecutor.SessionTasksQueue) r1;
        r5 = r1.tasksQueue;
        monitor-enter(r5);
        r2 = r1.tasksQueue;	 Catch:{ all -> 0x0051 }
        r6 = r2.iterator();	 Catch:{ all -> 0x0051 }
    L_0x0036:
        r2 = r6.hasNext();	 Catch:{ all -> 0x0051 }
        if (r2 == 0) goto L_0x0054;
    L_0x003c:
        r2 = r6.next();	 Catch:{ all -> 0x0051 }
        r2 = (java.lang.Runnable) r2;	 Catch:{ all -> 0x0051 }
        r7 = r8.getQueueHandler();	 Catch:{ all -> 0x0051 }
        r0 = r2;
        r0 = (org.apache.mina.core.session.IoEvent) r0;	 Catch:{ all -> 0x0051 }
        r3 = r0;
        r7.polled(r8, r3);	 Catch:{ all -> 0x0051 }
        r4.add(r2);	 Catch:{ all -> 0x0051 }
        goto L_0x0036;
    L_0x0051:
        r1 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x0051 }
        throw r1;
    L_0x0054:
        r1 = r1.tasksQueue;	 Catch:{ all -> 0x0051 }
        r1.clear();	 Catch:{ all -> 0x0051 }
        monitor-exit(r5);	 Catch:{ all -> 0x0051 }
        goto L_0x0008;
    L_0x005d:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.mina.filter.executor.OrderedThreadPoolExecutor.shutdownNow():java.util.List<java.lang.Runnable>");
    }

    private void print(Queue<Runnable> queue, IoEvent ioEvent) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Adding event ").append(ioEvent.getType()).append(" to session ").append(ioEvent.getSession().getId());
        stringBuilder.append("\nQueue : [");
        Object obj = 1;
        for (Runnable runnable : queue) {
            if (obj != null) {
                obj = null;
            } else {
                stringBuilder.append(", ");
            }
            stringBuilder.append(((IoEvent) runnable).getType()).append(", ");
        }
        stringBuilder.append("]\n");
        LOGGER.debug(stringBuilder.toString());
    }

    public void execute(Runnable runnable) {
        Object obj = null;
        if (this.shutdown) {
            rejectTask(runnable);
        }
        checkTaskType(runnable);
        IoEvent ioEvent = (IoEvent) runnable;
        IoSession session = ioEvent.getSession();
        SessionTasksQueue sessionTasksQueue = getSessionTasksQueue(session);
        Queue access$200 = sessionTasksQueue.tasksQueue;
        boolean accept = this.eventQueueHandler.accept(this, ioEvent);
        if (accept) {
            synchronized (access$200) {
                access$200.offer(ioEvent);
                if (sessionTasksQueue.processingCompleted) {
                    sessionTasksQueue.processingCompleted = false;
                    obj = 1;
                }
                if (LOGGER.isDebugEnabled()) {
                    print(access$200, ioEvent);
                }
            }
        }
        if (obj != null) {
            this.waitingSessions.offer(session);
        }
        addWorkerIfNecessary();
        if (accept) {
            this.eventQueueHandler.offered(this, ioEvent);
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
            for (Worker access$400 : this.workers) {
                j = access$400.completedTaskCount.get() + j;
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
        int i = DEFAULT_INITIAL_THREAD_POOL_SIZE;
        synchronized (this.workers) {
            for (int corePoolSize = super.getCorePoolSize() - this.workers.size(); corePoolSize > 0; corePoolSize--) {
                addWorker();
                i++;
            }
        }
        return i;
    }

    public boolean prestartCoreThread() {
        boolean z;
        synchronized (this.workers) {
            if (this.workers.size() < super.getCorePoolSize()) {
                addWorker();
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public BlockingQueue<Runnable> getQueue() {
        throw new UnsupportedOperationException();
    }

    public void purge() {
    }

    public boolean remove(Runnable runnable) {
        checkTaskType(runnable);
        IoEvent ioEvent = (IoEvent) runnable;
        SessionTasksQueue sessionTasksQueue = (SessionTasksQueue) ioEvent.getSession().getAttribute(this.TASKS_QUEUE);
        if (sessionTasksQueue == null) {
            return false;
        }
        boolean remove;
        Queue access$200 = sessionTasksQueue.tasksQueue;
        synchronized (access$200) {
            remove = access$200.remove(runnable);
        }
        if (remove) {
            getQueueHandler().polled(this, ioEvent);
        }
        return remove;
    }

    public int getCorePoolSize() {
        return super.getCorePoolSize();
    }

    public void setCorePoolSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("corePoolSize: " + i);
        } else if (i > super.getMaximumPoolSize()) {
            throw new IllegalArgumentException("corePoolSize exceeds maximumPoolSize");
        } else {
            synchronized (this.workers) {
                if (super.getCorePoolSize() > i) {
                    for (int corePoolSize = super.getCorePoolSize() - i; corePoolSize > 0; corePoolSize--) {
                        removeWorker();
                    }
                }
                super.setCorePoolSize(i);
            }
        }
    }
}
