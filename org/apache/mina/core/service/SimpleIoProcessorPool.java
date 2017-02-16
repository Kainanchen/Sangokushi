package org.apache.mina.core.service;

import java.nio.channels.spi.SelectorProvider;
import java.util.concurrent.Executor;
import org.apache.mina.core.session.AbstractIoSession;
import org.apache.mina.core.session.AttributeKey;
import org.apache.mina.core.write.WriteRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleIoProcessorPool<S extends AbstractIoSession> implements IoProcessor<S> {
    private static final int DEFAULT_SIZE;
    private static final Logger LOGGER;
    private static final AttributeKey PROCESSOR;
    private final boolean createdExecutor;
    private final Object disposalLock;
    private volatile boolean disposed;
    private volatile boolean disposing;
    private final Executor executor;
    private final IoProcessor<S>[] pool;

    static {
        LOGGER = LoggerFactory.getLogger(SimpleIoProcessorPool.class);
        DEFAULT_SIZE = Runtime.getRuntime().availableProcessors() + 1;
        PROCESSOR = new AttributeKey(SimpleIoProcessorPool.class, "processor");
    }

    public SimpleIoProcessorPool(Class<? extends IoProcessor<S>> cls) {
        this(cls, null, DEFAULT_SIZE, null);
    }

    public SimpleIoProcessorPool(Class<? extends IoProcessor<S>> cls, int i) {
        this(cls, null, i, null);
    }

    public SimpleIoProcessorPool(Class<? extends IoProcessor<S>> cls, int i, SelectorProvider selectorProvider) {
        this(cls, null, i, selectorProvider);
    }

    public SimpleIoProcessorPool(Class<? extends IoProcessor<S>> cls, Executor executor) {
        this(cls, executor, DEFAULT_SIZE, null);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SimpleIoProcessorPool(java.lang.Class<? extends org.apache.mina.core.service.IoProcessor<S>> r9, java.util.concurrent.Executor r10, int r11, java.nio.channels.spi.SelectorProvider r12) {
        /*
        r8 = this;
        r1 = 1;
        r2 = 0;
        r8.<init>();
        r0 = new java.lang.Object;
        r0.<init>();
        r8.disposalLock = r0;
        if (r9 != 0) goto L_0x0016;
    L_0x000e:
        r0 = new java.lang.IllegalArgumentException;
        r1 = "processorType";
        r0.<init>(r1);
        throw r0;
    L_0x0016:
        if (r11 > 0) goto L_0x0033;
    L_0x0018:
        r0 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r2 = "size: ";
        r1.<init>(r2);
        r1 = r1.append(r11);
        r2 = " (expected: positive integer)";
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0033:
        if (r10 != 0) goto L_0x00bc;
    L_0x0035:
        r0 = r1;
    L_0x0036:
        r8.createdExecutor = r0;
        r0 = r8.createdExecutor;
        if (r0 == 0) goto L_0x00bf;
    L_0x003c:
        r0 = java.util.concurrent.Executors.newCachedThreadPool();
        r8.executor = r0;
        r0 = r8.executor;
        r0 = (java.util.concurrent.ThreadPoolExecutor) r0;
        r3 = new java.util.concurrent.ThreadPoolExecutor$CallerRunsPolicy;
        r3.<init>();
        r0.setRejectedExecutionHandler(r3);
    L_0x004e:
        r0 = new org.apache.mina.core.service.IoProcessor[r11];
        r8.pool = r0;
        r0 = 0;
        r3 = 1;
        r3 = new java.lang.Class[r3];	 Catch:{ NoSuchMethodException -> 0x00c2, RuntimeException -> 0x012d, Exception -> 0x013a }
        r4 = 0;
        r5 = java.util.concurrent.ExecutorService.class;
        r3[r4] = r5;	 Catch:{ NoSuchMethodException -> 0x00c2, RuntimeException -> 0x012d, Exception -> 0x013a }
        r3 = r9.getConstructor(r3);	 Catch:{ NoSuchMethodException -> 0x00c2, RuntimeException -> 0x012d, Exception -> 0x013a }
        r4 = r8.pool;	 Catch:{ NoSuchMethodException -> 0x01b4, RuntimeException -> 0x012d, Exception -> 0x013a }
        r5 = 0;
        r0 = 1;
        r0 = new java.lang.Object[r0];	 Catch:{ NoSuchMethodException -> 0x01b4, RuntimeException -> 0x012d, Exception -> 0x013a }
        r6 = 0;
        r7 = r8.executor;	 Catch:{ NoSuchMethodException -> 0x01b4, RuntimeException -> 0x012d, Exception -> 0x013a }
        r0[r6] = r7;	 Catch:{ NoSuchMethodException -> 0x01b4, RuntimeException -> 0x012d, Exception -> 0x013a }
        r0 = r3.newInstance(r0);	 Catch:{ NoSuchMethodException -> 0x01b4, RuntimeException -> 0x012d, Exception -> 0x013a }
        r0 = (org.apache.mina.core.service.IoProcessor) r0;	 Catch:{ NoSuchMethodException -> 0x01b4, RuntimeException -> 0x012d, Exception -> 0x013a }
        r4[r5] = r0;	 Catch:{ NoSuchMethodException -> 0x01b4, RuntimeException -> 0x012d, Exception -> 0x013a }
        r2 = r1;
    L_0x0073:
        if (r3 != 0) goto L_0x0167;
    L_0x0075:
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00b7 }
        r0.<init>();	 Catch:{ all -> 0x00b7 }
        r1 = java.lang.String.valueOf(r9);	 Catch:{ all -> 0x00b7 }
        r0 = r0.append(r1);	 Catch:{ all -> 0x00b7 }
        r1 = " must have a public constructor with one ";
        r0 = r0.append(r1);	 Catch:{ all -> 0x00b7 }
        r1 = java.util.concurrent.ExecutorService.class;
        r1 = r1.getSimpleName();	 Catch:{ all -> 0x00b7 }
        r0 = r0.append(r1);	 Catch:{ all -> 0x00b7 }
        r1 = " parameter, a public constructor with one ";
        r0 = r0.append(r1);	 Catch:{ all -> 0x00b7 }
        r1 = java.util.concurrent.Executor.class;
        r1 = r1.getSimpleName();	 Catch:{ all -> 0x00b7 }
        r0 = r0.append(r1);	 Catch:{ all -> 0x00b7 }
        r1 = " parameter or a public default constructor.";
        r0 = r0.append(r1);	 Catch:{ all -> 0x00b7 }
        r0 = r0.toString();	 Catch:{ all -> 0x00b7 }
        r1 = LOGGER;	 Catch:{ all -> 0x00b7 }
        r1.error(r0);	 Catch:{ all -> 0x00b7 }
        r1 = new java.lang.IllegalArgumentException;	 Catch:{ all -> 0x00b7 }
        r1.<init>(r0);	 Catch:{ all -> 0x00b7 }
        throw r1;	 Catch:{ all -> 0x00b7 }
    L_0x00b7:
        r0 = move-exception;
        r8.dispose();
        throw r0;
    L_0x00bc:
        r0 = r2;
        goto L_0x0036;
    L_0x00bf:
        r8.executor = r10;
        goto L_0x004e;
    L_0x00c2:
        r3 = move-exception;
    L_0x00c3:
        if (r12 != 0) goto L_0x00e6;
    L_0x00c5:
        r3 = 1;
        r3 = new java.lang.Class[r3];	 Catch:{ NoSuchMethodException -> 0x0110, RuntimeException -> 0x012d, Exception -> 0x013a }
        r4 = 0;
        r5 = java.util.concurrent.Executor.class;
        r3[r4] = r5;	 Catch:{ NoSuchMethodException -> 0x0110, RuntimeException -> 0x012d, Exception -> 0x013a }
        r3 = r9.getConstructor(r3);	 Catch:{ NoSuchMethodException -> 0x0110, RuntimeException -> 0x012d, Exception -> 0x013a }
        r4 = r8.pool;	 Catch:{ NoSuchMethodException -> 0x01b0, RuntimeException -> 0x012d, Exception -> 0x013a }
        r5 = 0;
        r0 = 1;
        r0 = new java.lang.Object[r0];	 Catch:{ NoSuchMethodException -> 0x01b0, RuntimeException -> 0x012d, Exception -> 0x013a }
        r6 = 0;
        r7 = r8.executor;	 Catch:{ NoSuchMethodException -> 0x01b0, RuntimeException -> 0x012d, Exception -> 0x013a }
        r0[r6] = r7;	 Catch:{ NoSuchMethodException -> 0x01b0, RuntimeException -> 0x012d, Exception -> 0x013a }
        r0 = r3.newInstance(r0);	 Catch:{ NoSuchMethodException -> 0x01b0, RuntimeException -> 0x012d, Exception -> 0x013a }
        r0 = (org.apache.mina.core.service.IoProcessor) r0;	 Catch:{ NoSuchMethodException -> 0x01b0, RuntimeException -> 0x012d, Exception -> 0x013a }
        r4[r5] = r0;	 Catch:{ NoSuchMethodException -> 0x01b0, RuntimeException -> 0x012d, Exception -> 0x013a }
        r2 = r1;
        goto L_0x0073;
    L_0x00e6:
        r3 = 2;
        r3 = new java.lang.Class[r3];	 Catch:{ NoSuchMethodException -> 0x0110, RuntimeException -> 0x012d, Exception -> 0x013a }
        r4 = 0;
        r5 = java.util.concurrent.Executor.class;
        r3[r4] = r5;	 Catch:{ NoSuchMethodException -> 0x0110, RuntimeException -> 0x012d, Exception -> 0x013a }
        r4 = 1;
        r5 = java.nio.channels.spi.SelectorProvider.class;
        r3[r4] = r5;	 Catch:{ NoSuchMethodException -> 0x0110, RuntimeException -> 0x012d, Exception -> 0x013a }
        r3 = r9.getConstructor(r3);	 Catch:{ NoSuchMethodException -> 0x0110, RuntimeException -> 0x012d, Exception -> 0x013a }
        r4 = r8.pool;	 Catch:{ NoSuchMethodException -> 0x01b0, RuntimeException -> 0x012d, Exception -> 0x013a }
        r5 = 0;
        r0 = 2;
        r0 = new java.lang.Object[r0];	 Catch:{ NoSuchMethodException -> 0x01b0, RuntimeException -> 0x012d, Exception -> 0x013a }
        r6 = 0;
        r7 = r8.executor;	 Catch:{ NoSuchMethodException -> 0x01b0, RuntimeException -> 0x012d, Exception -> 0x013a }
        r0[r6] = r7;	 Catch:{ NoSuchMethodException -> 0x01b0, RuntimeException -> 0x012d, Exception -> 0x013a }
        r6 = 1;
        r0[r6] = r12;	 Catch:{ NoSuchMethodException -> 0x01b0, RuntimeException -> 0x012d, Exception -> 0x013a }
        r0 = r3.newInstance(r0);	 Catch:{ NoSuchMethodException -> 0x01b0, RuntimeException -> 0x012d, Exception -> 0x013a }
        r0 = (org.apache.mina.core.service.IoProcessor) r0;	 Catch:{ NoSuchMethodException -> 0x01b0, RuntimeException -> 0x012d, Exception -> 0x013a }
        r4[r5] = r0;	 Catch:{ NoSuchMethodException -> 0x01b0, RuntimeException -> 0x012d, Exception -> 0x013a }
        r2 = r1;
        goto L_0x0073;
    L_0x0110:
        r3 = move-exception;
    L_0x0111:
        r3 = 0;
        r3 = new java.lang.Class[r3];	 Catch:{ NoSuchMethodException -> 0x01ac, RuntimeException -> 0x012d, Exception -> 0x013a }
        r3 = r9.getConstructor(r3);	 Catch:{ NoSuchMethodException -> 0x01ac, RuntimeException -> 0x012d, Exception -> 0x013a }
        r4 = r8.pool;	 Catch:{ NoSuchMethodException -> 0x0128, RuntimeException -> 0x012d, Exception -> 0x013a }
        r5 = 0;
        r0 = 0;
        r0 = new java.lang.Object[r0];	 Catch:{ NoSuchMethodException -> 0x0128, RuntimeException -> 0x012d, Exception -> 0x013a }
        r0 = r3.newInstance(r0);	 Catch:{ NoSuchMethodException -> 0x0128, RuntimeException -> 0x012d, Exception -> 0x013a }
        r0 = (org.apache.mina.core.service.IoProcessor) r0;	 Catch:{ NoSuchMethodException -> 0x0128, RuntimeException -> 0x012d, Exception -> 0x013a }
        r4[r5] = r0;	 Catch:{ NoSuchMethodException -> 0x0128, RuntimeException -> 0x012d, Exception -> 0x013a }
        goto L_0x0073;
    L_0x0128:
        r0 = move-exception;
        r0 = r3;
    L_0x012a:
        r3 = r0;
        goto L_0x0073;
    L_0x012d:
        r0 = move-exception;
        r1 = LOGGER;	 Catch:{ all -> 0x00b7 }
        r2 = "Cannot create an IoProcessor :{}";
        r3 = r0.getMessage();	 Catch:{ all -> 0x00b7 }
        r1.error(r2, r3);	 Catch:{ all -> 0x00b7 }
        throw r0;	 Catch:{ all -> 0x00b7 }
    L_0x013a:
        r0 = move-exception;
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00b7 }
        r2 = "Failed to create a new instance of ";
        r1.<init>(r2);	 Catch:{ all -> 0x00b7 }
        r2 = r9.getName();	 Catch:{ all -> 0x00b7 }
        r1 = r1.append(r2);	 Catch:{ all -> 0x00b7 }
        r2 = ":";
        r1 = r1.append(r2);	 Catch:{ all -> 0x00b7 }
        r2 = r0.getMessage();	 Catch:{ all -> 0x00b7 }
        r1 = r1.append(r2);	 Catch:{ all -> 0x00b7 }
        r1 = r1.toString();	 Catch:{ all -> 0x00b7 }
        r2 = LOGGER;	 Catch:{ all -> 0x00b7 }
        r2.error(r1, r0);	 Catch:{ all -> 0x00b7 }
        r2 = new org.apache.mina.core.RuntimeIoException;	 Catch:{ all -> 0x00b7 }
        r2.<init>(r1, r0);	 Catch:{ all -> 0x00b7 }
        throw r2;	 Catch:{ all -> 0x00b7 }
    L_0x0167:
        r0 = r8.pool;	 Catch:{ all -> 0x00b7 }
        r0 = r0.length;	 Catch:{ all -> 0x00b7 }
        if (r1 >= r0) goto L_0x01ab;
    L_0x016c:
        if (r2 == 0) goto L_0x019d;
    L_0x016e:
        if (r12 != 0) goto L_0x0185;
    L_0x0170:
        r4 = r8.pool;	 Catch:{ Exception -> 0x019b }
        r0 = 1;
        r0 = new java.lang.Object[r0];	 Catch:{ Exception -> 0x019b }
        r5 = 0;
        r6 = r8.executor;	 Catch:{ Exception -> 0x019b }
        r0[r5] = r6;	 Catch:{ Exception -> 0x019b }
        r0 = r3.newInstance(r0);	 Catch:{ Exception -> 0x019b }
        r0 = (org.apache.mina.core.service.IoProcessor) r0;	 Catch:{ Exception -> 0x019b }
        r4[r1] = r0;	 Catch:{ Exception -> 0x019b }
    L_0x0182:
        r1 = r1 + 1;
        goto L_0x0167;
    L_0x0185:
        r4 = r8.pool;	 Catch:{ Exception -> 0x019b }
        r0 = 2;
        r0 = new java.lang.Object[r0];	 Catch:{ Exception -> 0x019b }
        r5 = 0;
        r6 = r8.executor;	 Catch:{ Exception -> 0x019b }
        r0[r5] = r6;	 Catch:{ Exception -> 0x019b }
        r5 = 1;
        r0[r5] = r12;	 Catch:{ Exception -> 0x019b }
        r0 = r3.newInstance(r0);	 Catch:{ Exception -> 0x019b }
        r0 = (org.apache.mina.core.service.IoProcessor) r0;	 Catch:{ Exception -> 0x019b }
        r4[r1] = r0;	 Catch:{ Exception -> 0x019b }
        goto L_0x0182;
    L_0x019b:
        r0 = move-exception;
        goto L_0x0182;
    L_0x019d:
        r4 = r8.pool;	 Catch:{ Exception -> 0x019b }
        r0 = 0;
        r0 = new java.lang.Object[r0];	 Catch:{ Exception -> 0x019b }
        r0 = r3.newInstance(r0);	 Catch:{ Exception -> 0x019b }
        r0 = (org.apache.mina.core.service.IoProcessor) r0;	 Catch:{ Exception -> 0x019b }
        r4[r1] = r0;	 Catch:{ Exception -> 0x019b }
        goto L_0x0182;
    L_0x01ab:
        return;
    L_0x01ac:
        r2 = move-exception;
        r2 = r1;
        goto L_0x012a;
    L_0x01b0:
        r0 = move-exception;
        r0 = r3;
        goto L_0x0111;
    L_0x01b4:
        r0 = move-exception;
        r0 = r3;
        goto L_0x00c3;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.mina.core.service.SimpleIoProcessorPool.<init>(java.lang.Class, java.util.concurrent.Executor, int, java.nio.channels.spi.SelectorProvider):void");
    }

    public final void add(S s) {
        getProcessor(s).add(s);
    }

    public final void flush(S s) {
        getProcessor(s).flush(s);
    }

    public final void write(S s, WriteRequest writeRequest) {
        getProcessor(s).write(s, writeRequest);
    }

    public final void remove(S s) {
        getProcessor(s).remove(s);
    }

    public final void updateTrafficControl(S s) {
        getProcessor(s).updateTrafficControl(s);
    }

    public boolean isDisposed() {
        return this.disposed;
    }

    public boolean isDisposing() {
        return this.disposing;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void dispose() {
        /*
        r8 = this;
        r0 = r8.disposed;
        if (r0 == 0) goto L_0x0005;
    L_0x0004:
        return;
    L_0x0005:
        r1 = r8.disposalLock;
        monitor-enter(r1);
        r0 = r8.disposing;	 Catch:{ all -> 0x0036 }
        if (r0 != 0) goto L_0x0044;
    L_0x000c:
        r0 = 1;
        r8.disposing = r0;	 Catch:{ all -> 0x0036 }
        r2 = r8.pool;	 Catch:{ all -> 0x0036 }
        r3 = r2.length;	 Catch:{ all -> 0x0036 }
        r0 = 0;
    L_0x0013:
        if (r0 >= r3) goto L_0x0039;
    L_0x0015:
        r4 = r2[r0];	 Catch:{ all -> 0x0036 }
        if (r4 == 0) goto L_0x0022;
    L_0x0019:
        r5 = r4.isDisposing();	 Catch:{ all -> 0x0036 }
        if (r5 != 0) goto L_0x0022;
    L_0x001f:
        r4.dispose();	 Catch:{ Exception -> 0x0025 }
    L_0x0022:
        r0 = r0 + 1;
        goto L_0x0013;
    L_0x0025:
        r5 = move-exception;
        r6 = LOGGER;	 Catch:{ all -> 0x0036 }
        r7 = "Failed to dispose the {} IoProcessor.";
        r4 = r4.getClass();	 Catch:{ all -> 0x0036 }
        r4 = r4.getSimpleName();	 Catch:{ all -> 0x0036 }
        r6.warn(r7, r4, r5);	 Catch:{ all -> 0x0036 }
        goto L_0x0022;
    L_0x0036:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0036 }
        throw r0;
    L_0x0039:
        r0 = r8.createdExecutor;	 Catch:{ all -> 0x0036 }
        if (r0 == 0) goto L_0x0044;
    L_0x003d:
        r0 = r8.executor;	 Catch:{ all -> 0x0036 }
        r0 = (java.util.concurrent.ExecutorService) r0;	 Catch:{ all -> 0x0036 }
        r0.shutdown();	 Catch:{ all -> 0x0036 }
    L_0x0044:
        r0 = r8.pool;	 Catch:{ all -> 0x0036 }
        r2 = 0;
        java.util.Arrays.fill(r0, r2);	 Catch:{ all -> 0x0036 }
        r0 = 1;
        r8.disposed = r0;	 Catch:{ all -> 0x0036 }
        monitor-exit(r1);	 Catch:{ all -> 0x0036 }
        goto L_0x0004;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.mina.core.service.SimpleIoProcessorPool.dispose():void");
    }

    private IoProcessor<S> getProcessor(S s) {
        IoProcessor<S> ioProcessor = (IoProcessor) s.getAttribute(PROCESSOR);
        if (ioProcessor == null) {
            if (this.disposed || this.disposing) {
                throw new IllegalStateException("A disposed processor cannot be accessed.");
            }
            ioProcessor = this.pool[Math.abs((int) s.getId()) % this.pool.length];
            if (ioProcessor == null) {
                throw new IllegalStateException("A disposed processor cannot be accessed.");
            }
            s.setAttributeIfAbsent(PROCESSOR, ioProcessor);
        }
        return ioProcessor;
    }
}
