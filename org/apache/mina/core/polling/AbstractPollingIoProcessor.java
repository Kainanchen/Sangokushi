package org.apache.mina.core.polling;

import java.io.IOException;
import java.net.PortUnreachableException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.file.FileRegion;
import org.apache.mina.core.future.DefaultIoFuture;
import org.apache.mina.core.service.AbstractIoService;
import org.apache.mina.core.service.IoProcessor;
import org.apache.mina.core.session.AbstractIoSession;
import org.apache.mina.core.session.IoSessionConfig;
import org.apache.mina.core.session.SessionState;
import org.apache.mina.core.write.WriteRequest;
import org.apache.mina.core.write.WriteRequestQueue;
import org.apache.mina.core.write.WriteToClosedSessionException;
import org.apache.mina.proxy.handlers.http.ntlm.NTLMConstants;
import org.apache.mina.proxy.handlers.socks.SocksProxyConstants;
import org.apache.mina.transport.socket.AbstractDatagramSessionConfig;
import org.apache.mina.util.ExceptionMonitor;
import org.apache.mina.util.NamePreservingRunnable;
import org.cocos2dx.lib.Cocos2dxHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractPollingIoProcessor<S extends AbstractIoSession> implements IoProcessor<S> {
    private static final Logger LOG;
    private static final long SELECT_TIMEOUT = 1000;
    private static final ConcurrentHashMap<Class<?>, AtomicInteger> threadIds;
    private final DefaultIoFuture disposalFuture;
    private final Object disposalLock;
    private volatile boolean disposed;
    private volatile boolean disposing;
    private final Executor executor;
    private final Queue<S> flushingSessions;
    private long lastIdleCheckTime;
    private final Queue<S> newSessions;
    private final AtomicReference<Processor> processorRef;
    private final Queue<S> removingSessions;
    private final String threadName;
    private final Queue<S> trafficControllingSessions;
    public AtomicBoolean wakeupCalled;

    /* renamed from: org.apache.mina.core.polling.AbstractPollingIoProcessor.1 */
    static /* synthetic */ class C04101 {
        static final /* synthetic */ int[] $SwitchMap$org$apache$mina$core$session$SessionState;

        static {
            $SwitchMap$org$apache$mina$core$session$SessionState = new int[SessionState.values().length];
            try {
                $SwitchMap$org$apache$mina$core$session$SessionState[SessionState.OPENED.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$org$apache$mina$core$session$SessionState[SessionState.CLOSING.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$org$apache$mina$core$session$SessionState[SessionState.OPENING.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
        }
    }

    private class Processor implements Runnable {
        static final /* synthetic */ boolean $assertionsDisabled;

        static {
            $assertionsDisabled = !AbstractPollingIoProcessor.class.desiredAssertionStatus();
        }

        private Processor() {
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
            r13 = this;
            r6 = 10;
            r5 = 0;
            r1 = 1;
            r0 = $assertionsDisabled;
            if (r0 != 0) goto L_0x001a;
        L_0x0008:
            r0 = org.apache.mina.core.polling.AbstractPollingIoProcessor.this;
            r0 = r0.processorRef;
            r0 = r0.get();
            if (r0 == r13) goto L_0x001a;
        L_0x0014:
            r0 = new java.lang.AssertionError;
            r0.<init>();
            throw r0;
        L_0x001a:
            r0 = org.apache.mina.core.polling.AbstractPollingIoProcessor.this;
            r2 = java.lang.System.currentTimeMillis();
            r0.lastIdleCheckTime = r2;
            r2 = r6;
            r4 = r5;
        L_0x0025:
            r8 = java.lang.System.currentTimeMillis();	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x01d4 }
            r0 = org.apache.mina.core.polling.AbstractPollingIoProcessor.this;	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x01d4 }
            r10 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
            r0 = r0.select(r10);	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x01d4 }
            r10 = java.lang.System.currentTimeMillis();	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x01d4 }
            r8 = r10 - r8;
            r3 = org.apache.mina.core.polling.AbstractPollingIoProcessor.this;	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x01d4 }
            r3 = r3.wakeupCalled;	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x01d4 }
            r7 = 0;
            r3 = r3.getAndSet(r7);	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x01d4 }
            if (r3 != 0) goto L_0x0103;
        L_0x0042:
            if (r0 != 0) goto L_0x0103;
        L_0x0044:
            r10 = 100;
            r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
            if (r3 >= 0) goto L_0x0103;
        L_0x004a:
            r3 = org.apache.mina.core.polling.AbstractPollingIoProcessor.this;	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x01d4 }
            r3 = r3.isBrokenConnection();	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x01d4 }
            if (r3 == 0) goto L_0x00e6;
        L_0x0052:
            r3 = org.apache.mina.core.polling.AbstractPollingIoProcessor.LOG;	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x01d4 }
            r7 = "Broken connection";
            r3.warn(r7);	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x01d4 }
            r3 = r2;
        L_0x005c:
            r2 = org.apache.mina.core.polling.AbstractPollingIoProcessor.this;	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x0120 }
            r2 = r2.handleNewSessions();	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x0120 }
            r2 = r2 + r4;
            r4 = org.apache.mina.core.polling.AbstractPollingIoProcessor.this;	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x01d8 }
            r4.updateTrafficMask();	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x01d8 }
            if (r0 <= 0) goto L_0x006f;
        L_0x006a:
            r0 = org.apache.mina.core.polling.AbstractPollingIoProcessor.this;	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x01d8 }
            r0.process();	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x01d8 }
        L_0x006f:
            r8 = java.lang.System.currentTimeMillis();	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x01d8 }
            r0 = org.apache.mina.core.polling.AbstractPollingIoProcessor.this;	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x01d8 }
            r0.flush(r8);	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x01d8 }
            r0 = org.apache.mina.core.polling.AbstractPollingIoProcessor.this;	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x01d8 }
            r0 = r0.removeSessions();	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x01d8 }
            r4 = r2 - r0;
            r0 = org.apache.mina.core.polling.AbstractPollingIoProcessor.this;	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x0120 }
            r0.notifyIdleSessions(r8);	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x0120 }
            if (r4 != 0) goto L_0x016b;
        L_0x0087:
            r0 = org.apache.mina.core.polling.AbstractPollingIoProcessor.this;	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x0120 }
            r0 = r0.processorRef;	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x0120 }
            r2 = 0;
            r0.set(r2);	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x0120 }
            r0 = org.apache.mina.core.polling.AbstractPollingIoProcessor.this;	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x0120 }
            r0 = r0.newSessions;	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x0120 }
            r0 = r0.isEmpty();	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x0120 }
            if (r0 == 0) goto L_0x010a;
        L_0x009d:
            r0 = org.apache.mina.core.polling.AbstractPollingIoProcessor.this;	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x0120 }
            r0 = r0.isSelectorEmpty();	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x0120 }
            if (r0 == 0) goto L_0x010a;
        L_0x00a5:
            r0 = $assertionsDisabled;	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x0120 }
            if (r0 != 0) goto L_0x00c3;
        L_0x00a9:
            r0 = org.apache.mina.core.polling.AbstractPollingIoProcessor.this;	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x0120 }
            r0 = r0.processorRef;	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x0120 }
            r0 = r0.get();	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x0120 }
            if (r0 != r13) goto L_0x00c3;
        L_0x00b5:
            r0 = new java.lang.AssertionError;	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x0120 }
            r0.<init>();	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x0120 }
            throw r0;	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x0120 }
        L_0x00bb:
            r0 = move-exception;
            r2 = org.apache.mina.util.ExceptionMonitor.getInstance();
            r2.exceptionCaught(r0);
        L_0x00c3:
            r0 = org.apache.mina.core.polling.AbstractPollingIoProcessor.this;	 Catch:{ Exception -> 0x01ae }
            r2 = r0.disposalLock;	 Catch:{ Exception -> 0x01ae }
            monitor-enter(r2);	 Catch:{ Exception -> 0x01ae }
            r0 = org.apache.mina.core.polling.AbstractPollingIoProcessor.this;	 Catch:{ all -> 0x01ab }
            r0 = r0.disposing;	 Catch:{ all -> 0x01ab }
            if (r0 == 0) goto L_0x00d7;
        L_0x00d2:
            r0 = org.apache.mina.core.polling.AbstractPollingIoProcessor.this;	 Catch:{ all -> 0x01ab }
            r0.doDispose();	 Catch:{ all -> 0x01ab }
        L_0x00d7:
            monitor-exit(r2);	 Catch:{ all -> 0x01ab }
            r0 = org.apache.mina.core.polling.AbstractPollingIoProcessor.this;
            r0 = r0.disposalFuture;
            r1 = java.lang.Boolean.valueOf(r1);
            r0.setValue(r1);
        L_0x00e5:
            return;
        L_0x00e6:
            if (r2 != 0) goto L_0x0106;
        L_0x00e8:
            r3 = org.apache.mina.core.polling.AbstractPollingIoProcessor.LOG;	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x01d4 }
            r7 = new java.lang.StringBuilder;	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x01d4 }
            r10 = "Create a new selector. Selected is 0, delta = ";
            r7.<init>(r10);	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x01d4 }
            r7 = r7.append(r8);	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x01d4 }
            r7 = r7.toString();	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x01d4 }
            r3.warn(r7);	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x01d4 }
            r3 = org.apache.mina.core.polling.AbstractPollingIoProcessor.this;	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x01d4 }
            r3.registerNewSelector();	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x01d4 }
        L_0x0103:
            r3 = r6;
            goto L_0x005c;
        L_0x0106:
            r3 = r2 + -1;
            goto L_0x005c;
        L_0x010a:
            r0 = $assertionsDisabled;	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x0120 }
            if (r0 != 0) goto L_0x0132;
        L_0x010e:
            r0 = org.apache.mina.core.polling.AbstractPollingIoProcessor.this;	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x0120 }
            r0 = r0.processorRef;	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x0120 }
            r0 = r0.get();	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x0120 }
            if (r0 != r13) goto L_0x0132;
        L_0x011a:
            r0 = new java.lang.AssertionError;	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x0120 }
            r0.<init>();	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x0120 }
            throw r0;	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x0120 }
        L_0x0120:
            r0 = move-exception;
            r2 = r3;
            r3 = r4;
        L_0x0123:
            r4 = org.apache.mina.util.ExceptionMonitor.getInstance();
            r4.exceptionCaught(r0);
            r8 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
            java.lang.Thread.sleep(r8);	 Catch:{ InterruptedException -> 0x01a0 }
            r4 = r3;
            goto L_0x0025;
        L_0x0132:
            r0 = org.apache.mina.core.polling.AbstractPollingIoProcessor.this;	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x0120 }
            r0 = r0.processorRef;	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x0120 }
            r2 = 0;
            r0 = r0.compareAndSet(r2, r13);	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x0120 }
            if (r0 != 0) goto L_0x0155;
        L_0x013f:
            r0 = $assertionsDisabled;	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x0120 }
            if (r0 != 0) goto L_0x00c3;
        L_0x0143:
            r0 = org.apache.mina.core.polling.AbstractPollingIoProcessor.this;	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x0120 }
            r0 = r0.processorRef;	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x0120 }
            r0 = r0.get();	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x0120 }
            if (r0 != r13) goto L_0x00c3;
        L_0x014f:
            r0 = new java.lang.AssertionError;	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x0120 }
            r0.<init>();	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x0120 }
            throw r0;	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x0120 }
        L_0x0155:
            r0 = $assertionsDisabled;	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x0120 }
            if (r0 != 0) goto L_0x016b;
        L_0x0159:
            r0 = org.apache.mina.core.polling.AbstractPollingIoProcessor.this;	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x0120 }
            r0 = r0.processorRef;	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x0120 }
            r0 = r0.get();	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x0120 }
            if (r0 == r13) goto L_0x016b;
        L_0x0165:
            r0 = new java.lang.AssertionError;	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x0120 }
            r0.<init>();	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x0120 }
            throw r0;	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x0120 }
        L_0x016b:
            r0 = org.apache.mina.core.polling.AbstractPollingIoProcessor.this;	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x0120 }
            r0 = r0.isDisposing();	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x0120 }
            if (r0 == 0) goto L_0x019d;
        L_0x0173:
            r0 = org.apache.mina.core.polling.AbstractPollingIoProcessor.this;	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x0120 }
            r7 = r0.allSessions();	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x0120 }
            r2 = r5;
        L_0x017a:
            r0 = r7.hasNext();	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x0120 }
            if (r0 == 0) goto L_0x0196;
        L_0x0180:
            r0 = r7.next();	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x0120 }
            r0 = (org.apache.mina.core.session.IoSession) r0;	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x0120 }
            r8 = r0.isActive();	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x0120 }
            if (r8 == 0) goto L_0x01de;
        L_0x018c:
            r2 = org.apache.mina.core.polling.AbstractPollingIoProcessor.this;	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x0120 }
            r0 = (org.apache.mina.core.session.AbstractIoSession) r0;	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x0120 }
            r2.scheduleRemove(r0);	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x0120 }
            r0 = r1;
        L_0x0194:
            r2 = r0;
            goto L_0x017a;
        L_0x0196:
            if (r2 == 0) goto L_0x019d;
        L_0x0198:
            r0 = org.apache.mina.core.polling.AbstractPollingIoProcessor.this;	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x0120 }
            r0.wakeup();	 Catch:{ ClosedSelectorException -> 0x00bb, Exception -> 0x0120 }
        L_0x019d:
            r2 = r3;
            goto L_0x0025;
        L_0x01a0:
            r0 = move-exception;
            r4 = org.apache.mina.util.ExceptionMonitor.getInstance();
            r4.exceptionCaught(r0);
            r4 = r3;
            goto L_0x0025;
        L_0x01ab:
            r0 = move-exception;
            monitor-exit(r2);	 Catch:{ all -> 0x01ab }
            throw r0;	 Catch:{ Exception -> 0x01ae }
        L_0x01ae:
            r0 = move-exception;
            r2 = org.apache.mina.util.ExceptionMonitor.getInstance();	 Catch:{ all -> 0x01c5 }
            r2.exceptionCaught(r0);	 Catch:{ all -> 0x01c5 }
            r0 = org.apache.mina.core.polling.AbstractPollingIoProcessor.this;
            r0 = r0.disposalFuture;
            r1 = java.lang.Boolean.valueOf(r1);
            r0.setValue(r1);
            goto L_0x00e5;
        L_0x01c5:
            r0 = move-exception;
            r2 = org.apache.mina.core.polling.AbstractPollingIoProcessor.this;
            r2 = r2.disposalFuture;
            r1 = java.lang.Boolean.valueOf(r1);
            r2.setValue(r1);
            throw r0;
        L_0x01d4:
            r0 = move-exception;
            r3 = r4;
            goto L_0x0123;
        L_0x01d8:
            r0 = move-exception;
            r12 = r3;
            r3 = r2;
            r2 = r12;
            goto L_0x0123;
        L_0x01de:
            r0 = r2;
            goto L_0x0194;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.apache.mina.core.polling.AbstractPollingIoProcessor.Processor.run():void");
        }
    }

    public abstract Iterator<S> allSessions();

    public abstract void destroy(S s);

    public abstract void doDispose();

    public abstract SessionState getState(S s);

    public abstract void init(S s);

    public abstract boolean isBrokenConnection();

    public abstract boolean isInterestedInRead(S s);

    public abstract boolean isInterestedInWrite(S s);

    public abstract boolean isReadable(S s);

    public abstract boolean isSelectorEmpty();

    public abstract boolean isWritable(S s);

    public abstract int read(S s, IoBuffer ioBuffer);

    public abstract void registerNewSelector();

    public abstract int select();

    public abstract int select(long j);

    public abstract Iterator<S> selectedSessions();

    public abstract void setInterestedInRead(S s, boolean z);

    public abstract void setInterestedInWrite(S s, boolean z);

    public abstract int transferFile(S s, FileRegion fileRegion, int i);

    public abstract void wakeup();

    public abstract int write(S s, IoBuffer ioBuffer, int i);

    static {
        LOG = LoggerFactory.getLogger(IoProcessor.class);
        threadIds = new ConcurrentHashMap();
    }

    public AbstractPollingIoProcessor(Executor executor) {
        this.newSessions = new ConcurrentLinkedQueue();
        this.removingSessions = new ConcurrentLinkedQueue();
        this.flushingSessions = new ConcurrentLinkedQueue();
        this.trafficControllingSessions = new ConcurrentLinkedQueue();
        this.processorRef = new AtomicReference();
        this.disposalLock = new Object();
        this.disposalFuture = new DefaultIoFuture(null);
        this.wakeupCalled = new AtomicBoolean(false);
        if (executor == null) {
            throw new IllegalArgumentException("executor");
        }
        this.threadName = nextThreadName();
        this.executor = executor;
    }

    private String nextThreadName() {
        int i;
        Class cls = getClass();
        AtomicInteger atomicInteger = (AtomicInteger) threadIds.putIfAbsent(cls, new AtomicInteger(1));
        if (atomicInteger == null) {
            i = 1;
        } else {
            i = atomicInteger.incrementAndGet();
        }
        return cls.getSimpleName() + '-' + i;
    }

    public final boolean isDisposing() {
        return this.disposing;
    }

    public final boolean isDisposed() {
        return this.disposed;
    }

    public final void dispose() {
        if (!this.disposed && !this.disposing) {
            synchronized (this.disposalLock) {
                this.disposing = true;
                startupProcessor();
            }
            this.disposalFuture.awaitUninterruptibly();
            this.disposed = true;
        }
    }

    public final void add(S s) {
        if (this.disposed || this.disposing) {
            throw new IllegalStateException("Already disposed.");
        }
        this.newSessions.add(s);
        startupProcessor();
    }

    public final void remove(S s) {
        scheduleRemove(s);
        startupProcessor();
    }

    private void scheduleRemove(S s) {
        if (!this.removingSessions.contains(s)) {
            this.removingSessions.add(s);
        }
    }

    public void write(S s, WriteRequest writeRequest) {
        s.getWriteRequestQueue().offer(s, writeRequest);
        if (!s.isWriteSuspended()) {
            flush((AbstractIoSession) s);
        }
    }

    public final void flush(S s) {
        if (s.setScheduledForFlush(true)) {
            this.flushingSessions.add(s);
            wakeup();
        }
    }

    private void scheduleFlush(S s) {
        if (s.setScheduledForFlush(true)) {
            this.flushingSessions.add(s);
        }
    }

    public final void updateTrafficMask(S s) {
        this.trafficControllingSessions.add(s);
        wakeup();
    }

    private void startupProcessor() {
        if (((Processor) this.processorRef.get()) == null) {
            Runnable processor = new Processor();
            if (this.processorRef.compareAndSet(null, processor)) {
                this.executor.execute(new NamePreservingRunnable(processor, this.threadName));
            }
        }
        wakeup();
    }

    private int handleNewSessions() {
        int i = 0;
        AbstractIoSession abstractIoSession = (AbstractIoSession) this.newSessions.poll();
        while (abstractIoSession != null) {
            int i2;
            if (addNow(abstractIoSession)) {
                i2 = i + 1;
            } else {
                i2 = i;
            }
            i = i2;
            abstractIoSession = (AbstractIoSession) this.newSessions.poll();
        }
        return i;
    }

    private boolean addNow(S s) {
        try {
            init(s);
            s.getService().getFilterChainBuilder().buildFilterChain(s.getFilterChain());
            ((AbstractIoService) s.getService()).getListeners().fireSessionCreated(s);
            return true;
        } catch (Throwable e) {
            ExceptionMonitor.getInstance().exceptionCaught(e);
            try {
                destroy(s);
                return false;
            } catch (Throwable e2) {
                ExceptionMonitor.getInstance().exceptionCaught(e2);
                return false;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int removeSessions() {
        /*
        r6 = this;
        r1 = 0;
        r0 = r6.removingSessions;
        r0 = r0.poll();
        r0 = (org.apache.mina.core.session.AbstractIoSession) r0;
        r5 = r0;
        r0 = r1;
        r1 = r5;
    L_0x000c:
        if (r1 == 0) goto L_0x004f;
    L_0x000e:
        r2 = r6.getState(r1);
        r3 = org.apache.mina.core.polling.AbstractPollingIoProcessor.C04101.$SwitchMap$org$apache$mina$core$session$SessionState;
        r4 = r2.ordinal();
        r3 = r3[r4];
        switch(r3) {
            case 1: goto L_0x0027;
            case 2: goto L_0x003c;
            case 3: goto L_0x0040;
            default: goto L_0x001d;
        };
    L_0x001d:
        r0 = new java.lang.IllegalStateException;
        r1 = java.lang.String.valueOf(r2);
        r0.<init>(r1);
        throw r0;
    L_0x0027:
        r1 = r6.removeNow(r1);
        if (r1 == 0) goto L_0x0050;
    L_0x002d:
        r0 = r0 + 1;
        r1 = r0;
    L_0x0030:
        r0 = r6.removingSessions;
        r0 = r0.poll();
        r0 = (org.apache.mina.core.session.AbstractIoSession) r0;
        r5 = r0;
        r0 = r1;
        r1 = r5;
        goto L_0x000c;
    L_0x003c:
        r0 = r0 + 1;
        r1 = r0;
        goto L_0x0030;
    L_0x0040:
        r2 = r6.newSessions;
        r2.remove(r1);
        r1 = r6.removeNow(r1);
        if (r1 == 0) goto L_0x0050;
    L_0x004b:
        r0 = r0 + 1;
        r1 = r0;
        goto L_0x0030;
    L_0x004f:
        return r0;
    L_0x0050:
        r1 = r0;
        goto L_0x0030;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.mina.core.polling.AbstractPollingIoProcessor.removeSessions():int");
    }

    private boolean removeNow(S s) {
        clearWriteRequestQueue(s);
        try {
            destroy(s);
            try {
                clearWriteRequestQueue(s);
                ((AbstractIoService) s.getService()).getListeners().fireSessionDestroyed(s);
            } catch (Throwable e) {
                s.getFilterChain().fireExceptionCaught(e);
            }
            return true;
        } catch (Throwable e2) {
            s.getFilterChain().fireExceptionCaught(e2);
            try {
                clearWriteRequestQueue(s);
                ((AbstractIoService) s.getService()).getListeners().fireSessionDestroyed(s);
            } catch (Throwable e22) {
                s.getFilterChain().fireExceptionCaught(e22);
            }
            return false;
        } catch (Throwable e222) {
            Throwable th = e222;
            try {
                clearWriteRequestQueue(s);
                ((AbstractIoService) s.getService()).getListeners().fireSessionDestroyed(s);
            } catch (Throwable e2222) {
                s.getFilterChain().fireExceptionCaught(e2222);
            }
        }
    }

    private void clearWriteRequestQueue(S s) {
        WriteRequest poll;
        WriteRequestQueue writeRequestQueue = s.getWriteRequestQueue();
        Collection<WriteRequest> arrayList = new ArrayList();
        WriteRequest poll2 = writeRequestQueue.poll(s);
        if (poll2 != null) {
            Object message = poll2.getMessage();
            if (message instanceof IoBuffer) {
                IoBuffer ioBuffer = (IoBuffer) message;
                if (ioBuffer.hasRemaining()) {
                    ioBuffer.reset();
                    arrayList.add(poll2);
                } else {
                    s.getFilterChain().fireMessageSent(poll2);
                }
            } else {
                arrayList.add(poll2);
            }
            while (true) {
                poll = writeRequestQueue.poll(s);
                if (poll == null) {
                    break;
                }
                arrayList.add(poll);
            }
        }
        if (!arrayList.isEmpty()) {
            Throwable writeToClosedSessionException = new WriteToClosedSessionException((Collection) arrayList);
            for (WriteRequest poll3 : arrayList) {
                s.decreaseScheduledBytesAndMessages(poll3);
                poll3.getFuture().setException(writeToClosedSessionException);
            }
            s.getFilterChain().fireExceptionCaught(writeToClosedSessionException);
        }
    }

    private void process() {
        Iterator selectedSessions = selectedSessions();
        while (selectedSessions.hasNext()) {
            process((AbstractIoSession) selectedSessions.next());
            selectedSessions.remove();
        }
    }

    private void process(S s) {
        if (isReadable(s) && !s.isReadSuspended()) {
            read(s);
        }
        if (isWritable(s) && !s.isWriteSuspended() && s.setScheduledForFlush(true)) {
            this.flushingSessions.add(s);
        }
    }

    private void read(S s) {
        IoSessionConfig config = s.getConfig();
        IoBuffer allocate = IoBuffer.allocate(config.getReadBufferSize());
        boolean hasFragmentation = s.getTransportMetadata().hasFragmentation();
        int i = 0;
        int read;
        if (hasFragmentation) {
            do {
                try {
                    read = read(s, allocate);
                    if (read > 0) {
                        i += read;
                    }
                } catch (Throwable e) {
                    if ((e instanceof IOException) && !((e instanceof PortUnreachableException) && AbstractDatagramSessionConfig.class.isAssignableFrom(config.getClass()) && !((AbstractDatagramSessionConfig) config).isCloseOnPortUnreachable())) {
                        scheduleRemove(s);
                    }
                    s.getFilterChain().fireExceptionCaught(e);
                    return;
                } catch (Throwable th) {
                    allocate.flip();
                }
            } while (allocate.hasRemaining());
        }
        read = read(s, allocate);
        if (read > 0) {
            i = read;
        }
        break;
        allocate.flip();
        if (i > 0) {
            s.getFilterChain().fireMessageReceived(allocate);
            if (hasFragmentation) {
                if ((i << 1) < config.getReadBufferSize()) {
                    s.decreaseReadBufferSize();
                } else if (i == config.getReadBufferSize()) {
                    s.increaseReadBufferSize();
                }
            }
        }
        if (read < 0) {
            s.getFilterChain().fireInputClosed();
        }
    }

    private void notifyIdleSessions(long j) {
        if (j - this.lastIdleCheckTime >= SELECT_TIMEOUT) {
            this.lastIdleCheckTime = j;
            AbstractIoSession.notifyIdleness(allSessions(), j);
        }
    }

    private void flush(long j) {
        if (!this.flushingSessions.isEmpty()) {
            do {
                AbstractIoSession abstractIoSession = (AbstractIoSession) this.flushingSessions.poll();
                if (abstractIoSession != null) {
                    abstractIoSession.unscheduledForFlush();
                    SessionState state = getState(abstractIoSession);
                    switch (C04101.$SwitchMap$org$apache$mina$core$session$SessionState[state.ordinal()]) {
                        case Cocos2dxHandler.HANDLER_SHOW_DIALOG /*1*/:
                            try {
                                if (!(!flushNow(abstractIoSession, j) || abstractIoSession.getWriteRequestQueue().isEmpty(abstractIoSession) || abstractIoSession.isScheduledForFlush())) {
                                    scheduleFlush(abstractIoSession);
                                    break;
                                }
                            } catch (Throwable e) {
                                scheduleRemove(abstractIoSession);
                                abstractIoSession.closeNow();
                                abstractIoSession.getFilterChain().fireExceptionCaught(e);
                                break;
                            }
                        case SocksProxyConstants.SOCKS5_REQUEST_STEP /*2*/:
                            break;
                        case NTLMConstants.MESSAGE_TYPE_3 /*3*/:
                            scheduleFlush(abstractIoSession);
                            return;
                        default:
                            throw new IllegalStateException(String.valueOf(state));
                    }
                }
                return;
            } while (!this.flushingSessions.isEmpty());
        }
    }

    private boolean flushNow(S s, long j) {
        if (s.isConnected()) {
            boolean hasFragmentation = s.getTransportMetadata().hasFragmentation();
            WriteRequestQueue writeRequestQueue = s.getWriteRequestQueue();
            int maxReadBufferSize = s.getConfig().getMaxReadBufferSize() + (s.getConfig().getMaxReadBufferSize() >>> 1);
            int i = 0;
            WriteRequest writeRequest = null;
            try {
                setInterestedInWrite(s, false);
                do {
                    int writeBuffer;
                    int i2 = i;
                    writeRequest = s.getCurrentWriteRequest();
                    if (writeRequest == null) {
                        writeRequest = writeRequestQueue.poll(s);
                        if (writeRequest == null) {
                            break;
                        }
                        s.setCurrentWriteRequest(writeRequest);
                    }
                    Object message = writeRequest.getMessage();
                    if (message instanceof IoBuffer) {
                        writeBuffer = writeBuffer(s, writeRequest, hasFragmentation, maxReadBufferSize - i2, j);
                        if (writeBuffer > 0) {
                            if (((IoBuffer) message).hasRemaining()) {
                                setInterestedInWrite(s, true);
                                return false;
                            }
                        }
                    } else if (message instanceof FileRegion) {
                        writeBuffer = writeFile(s, writeRequest, hasFragmentation, maxReadBufferSize - i2, j);
                        if (writeBuffer > 0) {
                            if (((FileRegion) message).getRemainingBytes() > 0) {
                                setInterestedInWrite(s, true);
                                return false;
                            }
                        }
                    } else {
                        throw new IllegalStateException("Don't know how to handle message of type '" + message.getClass().getName() + "'.  Are you missing a protocol encoder?");
                    }
                    i = writeBuffer;
                    if (i != 0) {
                        i += i2;
                        if (i >= maxReadBufferSize) {
                            scheduleFlush(s);
                            return false;
                        }
                    } else if (writeRequest.equals(AbstractIoSession.MESSAGE_SENT_REQUEST)) {
                        i = i2;
                    } else {
                        setInterestedInWrite(s, true);
                        return false;
                    }
                    if (message instanceof IoBuffer) {
                        ((IoBuffer) message).free();
                        continue;
                    }
                } while (i < maxReadBufferSize);
                return true;
            } catch (Throwable e) {
                if (writeRequest != null) {
                    writeRequest.getFuture().setException(e);
                }
                s.getFilterChain().fireExceptionCaught(e);
                return false;
            }
        }
        scheduleRemove(s);
        return false;
    }

    private int writeBuffer(S s, WriteRequest writeRequest, boolean z, int i, long j) {
        int min;
        int i2 = 0;
        IoBuffer ioBuffer = (IoBuffer) writeRequest.getMessage();
        if (ioBuffer.hasRemaining()) {
            if (z) {
                min = Math.min(ioBuffer.remaining(), i);
            } else {
                min = ioBuffer.remaining();
            }
            try {
                i2 = write(s, ioBuffer, min);
            } catch (IOException e) {
                ioBuffer.free();
                s.closeNow();
                removeNow(s);
            }
        }
        s.increaseWrittenBytes(i2, j);
        if (!(ioBuffer.hasRemaining() && (z || i2 == 0))) {
            if (writeRequest.getOriginalRequest().getMessage() instanceof IoBuffer) {
                ioBuffer = (IoBuffer) writeRequest.getOriginalRequest().getMessage();
                min = ioBuffer.position();
                ioBuffer.reset();
                fireMessageSent(s, writeRequest);
                ioBuffer.position(min);
            } else {
                fireMessageSent(s, writeRequest);
            }
        }
        return i2;
    }

    private int writeFile(S s, WriteRequest writeRequest, boolean z, int i, long j) {
        int min;
        FileRegion fileRegion = (FileRegion) writeRequest.getMessage();
        if (fileRegion.getRemainingBytes() > 0) {
            if (z) {
                min = (int) Math.min(fileRegion.getRemainingBytes(), (long) i);
            } else {
                min = (int) Math.min(2147483647L, fileRegion.getRemainingBytes());
            }
            min = transferFile(s, fileRegion, min);
            fileRegion.update((long) min);
        } else {
            min = 0;
        }
        s.increaseWrittenBytes(min, j);
        if (fileRegion.getRemainingBytes() <= 0 || !(z || min == 0)) {
            fireMessageSent(s, writeRequest);
        }
        return min;
    }

    private void fireMessageSent(S s, WriteRequest writeRequest) {
        s.setCurrentWriteRequest(null);
        s.getFilterChain().fireMessageSent(writeRequest);
    }

    private void updateTrafficMask() {
        int size = this.trafficControllingSessions.size();
        while (size > 0) {
            AbstractIoSession abstractIoSession = (AbstractIoSession) this.trafficControllingSessions.poll();
            if (abstractIoSession != null) {
                SessionState state = getState(abstractIoSession);
                switch (C04101.$SwitchMap$org$apache$mina$core$session$SessionState[state.ordinal()]) {
                    case Cocos2dxHandler.HANDLER_SHOW_DIALOG /*1*/:
                        updateTrafficControl(abstractIoSession);
                        break;
                    case SocksProxyConstants.SOCKS5_REQUEST_STEP /*2*/:
                        break;
                    case NTLMConstants.MESSAGE_TYPE_3 /*3*/:
                        this.trafficControllingSessions.add(abstractIoSession);
                        break;
                    default:
                        throw new IllegalStateException(String.valueOf(state));
                }
                size--;
            } else {
                return;
            }
        }
    }

    public void updateTrafficControl(S s) {
        try {
            setInterestedInRead(s, !s.isReadSuspended());
        } catch (Throwable e) {
            s.getFilterChain().fireExceptionCaught(e);
        }
        try {
            boolean z;
            if (s.getWriteRequestQueue().isEmpty(s) || s.isWriteSuspended()) {
                z = false;
            } else {
                z = true;
            }
            setInterestedInWrite(s, z);
        } catch (Throwable e2) {
            s.getFilterChain().fireExceptionCaught(e2);
        }
    }
}
