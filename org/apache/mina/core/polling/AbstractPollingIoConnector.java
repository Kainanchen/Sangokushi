package org.apache.mina.core.polling;

import java.net.ConnectException;
import java.net.SocketAddress;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.mina.core.RuntimeIoException;
import org.apache.mina.core.future.ConnectFuture;
import org.apache.mina.core.future.DefaultConnectFuture;
import org.apache.mina.core.service.AbstractIoConnector;
import org.apache.mina.core.service.IoProcessor;
import org.apache.mina.core.service.SimpleIoProcessorPool;
import org.apache.mina.core.session.AbstractIoSession;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.core.session.IoSessionConfig;
import org.apache.mina.core.session.IoSessionInitializer;
import org.apache.mina.util.ExceptionMonitor;

public abstract class AbstractPollingIoConnector<T extends AbstractIoSession, H> extends AbstractIoConnector {
    private final Queue<ConnectionRequest> cancelQueue;
    private final Queue<ConnectionRequest> connectQueue;
    private final AtomicReference<Connector> connectorRef;
    private final boolean createdProcessor;
    private final ServiceOperationFuture disposalFuture;
    private final IoProcessor<T> processor;
    private volatile boolean selectable;

    public final class ConnectionRequest extends DefaultConnectFuture {
        private final long deadline;
        private final H handle;
        private final IoSessionInitializer<? extends ConnectFuture> sessionInitializer;

        public ConnectionRequest(H h, IoSessionInitializer<? extends ConnectFuture> ioSessionInitializer) {
            this.handle = h;
            long connectTimeoutMillis = AbstractPollingIoConnector.this.getConnectTimeoutMillis();
            if (connectTimeoutMillis <= 0) {
                this.deadline = Long.MAX_VALUE;
            } else {
                this.deadline = connectTimeoutMillis + System.currentTimeMillis();
            }
            this.sessionInitializer = ioSessionInitializer;
        }

        public final H getHandle() {
            return this.handle;
        }

        public final long getDeadline() {
            return this.deadline;
        }

        public final IoSessionInitializer<? extends ConnectFuture> getSessionInitializer() {
            return this.sessionInitializer;
        }

        public final boolean cancel() {
            if (!isDone() && super.cancel()) {
                AbstractPollingIoConnector.this.cancelQueue.add(this);
                AbstractPollingIoConnector.this.startupWorker();
                AbstractPollingIoConnector.this.wakeup();
            }
            return true;
        }
    }

    private class Connector implements Runnable {
        static final /* synthetic */ boolean $assertionsDisabled;

        static {
            $assertionsDisabled = !AbstractPollingIoConnector.class.desiredAssertionStatus();
        }

        private Connector() {
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
            r7 = this;
            r1 = 0;
            r0 = $assertionsDisabled;
            if (r0 != 0) goto L_0x0017;
        L_0x0005:
            r0 = org.apache.mina.core.polling.AbstractPollingIoConnector.this;
            r0 = r0.connectorRef;
            r0 = r0.get();
            if (r0 == r7) goto L_0x0017;
        L_0x0011:
            r0 = new java.lang.AssertionError;
            r0.<init>();
            throw r0;
        L_0x0017:
            r0 = r1;
        L_0x0018:
            r2 = org.apache.mina.core.polling.AbstractPollingIoConnector.this;
            r2 = r2.selectable;
            if (r2 == 0) goto L_0x0070;
        L_0x0020:
            r2 = org.apache.mina.core.polling.AbstractPollingIoConnector.this;	 Catch:{ ClosedSelectorException -> 0x0068, Exception -> 0x018f }
            r2 = r2.getConnectTimeoutMillis();	 Catch:{ ClosedSelectorException -> 0x0068, Exception -> 0x018f }
            r4 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
            r2 = java.lang.Math.min(r2, r4);	 Catch:{ ClosedSelectorException -> 0x0068, Exception -> 0x018f }
            r2 = (int) r2;	 Catch:{ ClosedSelectorException -> 0x0068, Exception -> 0x018f }
            r3 = org.apache.mina.core.polling.AbstractPollingIoConnector.this;	 Catch:{ ClosedSelectorException -> 0x0068, Exception -> 0x018f }
            r3 = r3.select(r2);	 Catch:{ ClosedSelectorException -> 0x0068, Exception -> 0x018f }
            r2 = org.apache.mina.core.polling.AbstractPollingIoConnector.this;	 Catch:{ ClosedSelectorException -> 0x0068, Exception -> 0x018f }
            r2 = r2.registerNew();	 Catch:{ ClosedSelectorException -> 0x0068, Exception -> 0x018f }
            r2 = r2 + r0;
            if (r2 != 0) goto L_0x010a;
        L_0x003c:
            r0 = org.apache.mina.core.polling.AbstractPollingIoConnector.this;	 Catch:{ ClosedSelectorException -> 0x0068, Exception -> 0x00d8 }
            r0 = r0.connectorRef;	 Catch:{ ClosedSelectorException -> 0x0068, Exception -> 0x00d8 }
            r4 = 0;
            r0.set(r4);	 Catch:{ ClosedSelectorException -> 0x0068, Exception -> 0x00d8 }
            r0 = org.apache.mina.core.polling.AbstractPollingIoConnector.this;	 Catch:{ ClosedSelectorException -> 0x0068, Exception -> 0x00d8 }
            r0 = r0.connectQueue;	 Catch:{ ClosedSelectorException -> 0x0068, Exception -> 0x00d8 }
            r0 = r0.isEmpty();	 Catch:{ ClosedSelectorException -> 0x0068, Exception -> 0x00d8 }
            if (r0 == 0) goto L_0x00b5;
        L_0x0052:
            r0 = $assertionsDisabled;	 Catch:{ ClosedSelectorException -> 0x0068, Exception -> 0x00d8 }
            if (r0 != 0) goto L_0x0070;
        L_0x0056:
            r0 = org.apache.mina.core.polling.AbstractPollingIoConnector.this;	 Catch:{ ClosedSelectorException -> 0x0068, Exception -> 0x00d8 }
            r0 = r0.connectorRef;	 Catch:{ ClosedSelectorException -> 0x0068, Exception -> 0x00d8 }
            r0 = r0.get();	 Catch:{ ClosedSelectorException -> 0x0068, Exception -> 0x00d8 }
            if (r0 != r7) goto L_0x0070;
        L_0x0062:
            r0 = new java.lang.AssertionError;	 Catch:{ ClosedSelectorException -> 0x0068, Exception -> 0x00d8 }
            r0.<init>();	 Catch:{ ClosedSelectorException -> 0x0068, Exception -> 0x00d8 }
            throw r0;	 Catch:{ ClosedSelectorException -> 0x0068, Exception -> 0x00d8 }
        L_0x0068:
            r0 = move-exception;
            r2 = org.apache.mina.util.ExceptionMonitor.getInstance();
            r2.exceptionCaught(r0);
        L_0x0070:
            r0 = org.apache.mina.core.polling.AbstractPollingIoConnector.this;
            r0 = r0.selectable;
            if (r0 == 0) goto L_0x00b4;
        L_0x0078:
            r0 = org.apache.mina.core.polling.AbstractPollingIoConnector.this;
            r0 = r0.isDisposing();
            if (r0 == 0) goto L_0x00b4;
        L_0x0080:
            r0 = org.apache.mina.core.polling.AbstractPollingIoConnector.this;
            r0.selectable = r1;
            r0 = org.apache.mina.core.polling.AbstractPollingIoConnector.this;	 Catch:{ all -> 0x014f }
            r0 = r0.createdProcessor;	 Catch:{ all -> 0x014f }
            if (r0 == 0) goto L_0x0096;
        L_0x008d:
            r0 = org.apache.mina.core.polling.AbstractPollingIoConnector.this;	 Catch:{ all -> 0x014f }
            r0 = r0.processor;	 Catch:{ all -> 0x014f }
            r0.dispose();	 Catch:{ all -> 0x014f }
        L_0x0096:
            r0 = org.apache.mina.core.polling.AbstractPollingIoConnector.this;	 Catch:{ Exception -> 0x0131 }
            r1 = r0.disposalLock;	 Catch:{ Exception -> 0x0131 }
            monitor-enter(r1);	 Catch:{ Exception -> 0x0131 }
            r0 = org.apache.mina.core.polling.AbstractPollingIoConnector.this;	 Catch:{ all -> 0x012e }
            r0 = r0.isDisposing();	 Catch:{ all -> 0x012e }
            if (r0 == 0) goto L_0x00aa;
        L_0x00a5:
            r0 = org.apache.mina.core.polling.AbstractPollingIoConnector.this;	 Catch:{ all -> 0x012e }
            r0.destroy();	 Catch:{ all -> 0x012e }
        L_0x00aa:
            monitor-exit(r1);	 Catch:{ all -> 0x012e }
            r0 = org.apache.mina.core.polling.AbstractPollingIoConnector.this;
            r0 = r0.disposalFuture;
            r0.setDone();
        L_0x00b4:
            return;
        L_0x00b5:
            r0 = org.apache.mina.core.polling.AbstractPollingIoConnector.this;	 Catch:{ ClosedSelectorException -> 0x0068, Exception -> 0x00d8 }
            r0 = r0.connectorRef;	 Catch:{ ClosedSelectorException -> 0x0068, Exception -> 0x00d8 }
            r4 = 0;
            r0 = r0.compareAndSet(r4, r7);	 Catch:{ ClosedSelectorException -> 0x0068, Exception -> 0x00d8 }
            if (r0 != 0) goto L_0x00f4;
        L_0x00c2:
            r0 = $assertionsDisabled;	 Catch:{ ClosedSelectorException -> 0x0068, Exception -> 0x00d8 }
            if (r0 != 0) goto L_0x0070;
        L_0x00c6:
            r0 = org.apache.mina.core.polling.AbstractPollingIoConnector.this;	 Catch:{ ClosedSelectorException -> 0x0068, Exception -> 0x00d8 }
            r0 = r0.connectorRef;	 Catch:{ ClosedSelectorException -> 0x0068, Exception -> 0x00d8 }
            r0 = r0.get();	 Catch:{ ClosedSelectorException -> 0x0068, Exception -> 0x00d8 }
            if (r0 != r7) goto L_0x0070;
        L_0x00d2:
            r0 = new java.lang.AssertionError;	 Catch:{ ClosedSelectorException -> 0x0068, Exception -> 0x00d8 }
            r0.<init>();	 Catch:{ ClosedSelectorException -> 0x0068, Exception -> 0x00d8 }
            throw r0;	 Catch:{ ClosedSelectorException -> 0x0068, Exception -> 0x00d8 }
        L_0x00d8:
            r0 = move-exception;
            r6 = r0;
            r0 = r2;
            r2 = r6;
        L_0x00dc:
            r3 = org.apache.mina.util.ExceptionMonitor.getInstance();
            r3.exceptionCaught(r2);
            r2 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
            java.lang.Thread.sleep(r2);	 Catch:{ InterruptedException -> 0x00ea }
            goto L_0x0018;
        L_0x00ea:
            r2 = move-exception;
            r3 = org.apache.mina.util.ExceptionMonitor.getInstance();
            r3.exceptionCaught(r2);
            goto L_0x0018;
        L_0x00f4:
            r0 = $assertionsDisabled;	 Catch:{ ClosedSelectorException -> 0x0068, Exception -> 0x00d8 }
            if (r0 != 0) goto L_0x010a;
        L_0x00f8:
            r0 = org.apache.mina.core.polling.AbstractPollingIoConnector.this;	 Catch:{ ClosedSelectorException -> 0x0068, Exception -> 0x00d8 }
            r0 = r0.connectorRef;	 Catch:{ ClosedSelectorException -> 0x0068, Exception -> 0x00d8 }
            r0 = r0.get();	 Catch:{ ClosedSelectorException -> 0x0068, Exception -> 0x00d8 }
            if (r0 == r7) goto L_0x010a;
        L_0x0104:
            r0 = new java.lang.AssertionError;	 Catch:{ ClosedSelectorException -> 0x0068, Exception -> 0x00d8 }
            r0.<init>();	 Catch:{ ClosedSelectorException -> 0x0068, Exception -> 0x00d8 }
            throw r0;	 Catch:{ ClosedSelectorException -> 0x0068, Exception -> 0x00d8 }
        L_0x010a:
            if (r3 <= 0) goto L_0x0119;
        L_0x010c:
            r0 = org.apache.mina.core.polling.AbstractPollingIoConnector.this;	 Catch:{ ClosedSelectorException -> 0x0068, Exception -> 0x00d8 }
            r3 = org.apache.mina.core.polling.AbstractPollingIoConnector.this;	 Catch:{ ClosedSelectorException -> 0x0068, Exception -> 0x00d8 }
            r3 = r3.selectedHandles();	 Catch:{ ClosedSelectorException -> 0x0068, Exception -> 0x00d8 }
            r0 = r0.processConnections(r3);	 Catch:{ ClosedSelectorException -> 0x0068, Exception -> 0x00d8 }
            r2 = r2 - r0;
        L_0x0119:
            r0 = org.apache.mina.core.polling.AbstractPollingIoConnector.this;	 Catch:{ ClosedSelectorException -> 0x0068, Exception -> 0x00d8 }
            r3 = org.apache.mina.core.polling.AbstractPollingIoConnector.this;	 Catch:{ ClosedSelectorException -> 0x0068, Exception -> 0x00d8 }
            r3 = r3.allHandles();	 Catch:{ ClosedSelectorException -> 0x0068, Exception -> 0x00d8 }
            r0.processTimedOutSessions(r3);	 Catch:{ ClosedSelectorException -> 0x0068, Exception -> 0x00d8 }
            r0 = org.apache.mina.core.polling.AbstractPollingIoConnector.this;	 Catch:{ ClosedSelectorException -> 0x0068, Exception -> 0x00d8 }
            r0 = r0.cancelKeys();	 Catch:{ ClosedSelectorException -> 0x0068, Exception -> 0x00d8 }
            r0 = r2 - r0;
            goto L_0x0018;
        L_0x012e:
            r0 = move-exception;
            monitor-exit(r1);	 Catch:{ all -> 0x012e }
            throw r0;	 Catch:{ Exception -> 0x0131 }
        L_0x0131:
            r0 = move-exception;
            r1 = org.apache.mina.util.ExceptionMonitor.getInstance();	 Catch:{ all -> 0x0144 }
            r1.exceptionCaught(r0);	 Catch:{ all -> 0x0144 }
            r0 = org.apache.mina.core.polling.AbstractPollingIoConnector.this;
            r0 = r0.disposalFuture;
            r0.setDone();
            goto L_0x00b4;
        L_0x0144:
            r0 = move-exception;
            r1 = org.apache.mina.core.polling.AbstractPollingIoConnector.this;
            r1 = r1.disposalFuture;
            r1.setDone();
            throw r0;
        L_0x014f:
            r0 = move-exception;
            r1 = org.apache.mina.core.polling.AbstractPollingIoConnector.this;	 Catch:{ Exception -> 0x0172 }
            r2 = r1.disposalLock;	 Catch:{ Exception -> 0x0172 }
            monitor-enter(r2);	 Catch:{ Exception -> 0x0172 }
            r1 = org.apache.mina.core.polling.AbstractPollingIoConnector.this;	 Catch:{ all -> 0x016f }
            r1 = r1.isDisposing();	 Catch:{ all -> 0x016f }
            if (r1 == 0) goto L_0x0164;
        L_0x015f:
            r1 = org.apache.mina.core.polling.AbstractPollingIoConnector.this;	 Catch:{ all -> 0x016f }
            r1.destroy();	 Catch:{ all -> 0x016f }
        L_0x0164:
            monitor-exit(r2);	 Catch:{ all -> 0x016f }
            r1 = org.apache.mina.core.polling.AbstractPollingIoConnector.this;
            r1 = r1.disposalFuture;
            r1.setDone();
        L_0x016e:
            throw r0;
        L_0x016f:
            r1 = move-exception;
            monitor-exit(r2);	 Catch:{ all -> 0x016f }
            throw r1;	 Catch:{ Exception -> 0x0172 }
        L_0x0172:
            r1 = move-exception;
            r2 = org.apache.mina.util.ExceptionMonitor.getInstance();	 Catch:{ all -> 0x0184 }
            r2.exceptionCaught(r1);	 Catch:{ all -> 0x0184 }
            r1 = org.apache.mina.core.polling.AbstractPollingIoConnector.this;
            r1 = r1.disposalFuture;
            r1.setDone();
            goto L_0x016e;
        L_0x0184:
            r0 = move-exception;
            r1 = org.apache.mina.core.polling.AbstractPollingIoConnector.this;
            r1 = r1.disposalFuture;
            r1.setDone();
            throw r0;
        L_0x018f:
            r2 = move-exception;
            goto L_0x00dc;
            */
            throw new UnsupportedOperationException("Method not decompiled: org.apache.mina.core.polling.AbstractPollingIoConnector.Connector.run():void");
        }
    }

    public abstract Iterator<H> allHandles();

    public abstract void close(H h);

    public abstract boolean connect(H h, SocketAddress socketAddress);

    public abstract void destroy();

    public abstract boolean finishConnect(H h);

    public abstract ConnectionRequest getConnectionRequest(H h);

    public abstract void init();

    public abstract H newHandle(SocketAddress socketAddress);

    public abstract T newSession(IoProcessor<T> ioProcessor, H h);

    public abstract void register(H h, ConnectionRequest connectionRequest);

    public abstract int select(int i);

    public abstract Iterator<H> selectedHandles();

    public abstract void wakeup();

    public AbstractPollingIoConnector(IoSessionConfig ioSessionConfig, Class<? extends IoProcessor<T>> cls) {
        this(ioSessionConfig, null, new SimpleIoProcessorPool(cls), true);
    }

    public AbstractPollingIoConnector(IoSessionConfig ioSessionConfig, Class<? extends IoProcessor<T>> cls, int i) {
        this(ioSessionConfig, null, new SimpleIoProcessorPool((Class) cls, i), true);
    }

    public AbstractPollingIoConnector(IoSessionConfig ioSessionConfig, IoProcessor<T> ioProcessor) {
        this(ioSessionConfig, null, ioProcessor, false);
    }

    public AbstractPollingIoConnector(IoSessionConfig ioSessionConfig, Executor executor, IoProcessor<T> ioProcessor) {
        this(ioSessionConfig, executor, ioProcessor, false);
    }

    private AbstractPollingIoConnector(IoSessionConfig ioSessionConfig, Executor executor, IoProcessor<T> ioProcessor, boolean z) {
        super(ioSessionConfig, executor);
        this.connectQueue = new ConcurrentLinkedQueue();
        this.cancelQueue = new ConcurrentLinkedQueue();
        this.disposalFuture = new ServiceOperationFuture();
        this.connectorRef = new AtomicReference();
        if (ioProcessor == null) {
            throw new IllegalArgumentException("processor");
        }
        this.processor = ioProcessor;
        this.createdProcessor = z;
        try {
            init();
            this.selectable = true;
            if (!this.selectable) {
                try {
                    destroy();
                } catch (Throwable e) {
                    ExceptionMonitor.getInstance().exceptionCaught(e);
                }
            }
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Throwable e3) {
            throw new RuntimeIoException("Failed to initialize.", e3);
        } catch (Throwable th) {
            if (!this.selectable) {
                try {
                    destroy();
                } catch (Throwable e4) {
                    ExceptionMonitor.getInstance().exceptionCaught(e4);
                }
            }
        }
    }

    protected final void dispose0() {
        startupWorker();
        wakeup();
    }

    protected final ConnectFuture connect0(SocketAddress socketAddress, SocketAddress socketAddress2, IoSessionInitializer<? extends ConnectFuture> ioSessionInitializer) {
        ConnectFuture connectionRequest;
        try {
            Object newHandle = newHandle(socketAddress2);
            if (connect(newHandle, socketAddress)) {
                Object defaultConnectFuture = new DefaultConnectFuture();
                IoSession newSession = newSession(this.processor, newHandle);
                initSession(newSession, defaultConnectFuture, ioSessionInitializer);
                newSession.getProcessor().add(newSession);
                return defaultConnectFuture;
            }
            connectionRequest = new ConnectionRequest(newHandle, ioSessionInitializer);
            this.connectQueue.add(connectionRequest);
            startupWorker();
            wakeup();
            return connectionRequest;
        } catch (Throwable e) {
            connectionRequest = DefaultConnectFuture.newFailedFuture(e);
            if (null == null) {
                return connectionRequest;
            }
            try {
                close(null);
                return connectionRequest;
            } catch (Throwable e2) {
                ExceptionMonitor.getInstance().exceptionCaught(e2);
                return connectionRequest;
            }
        } catch (Throwable th) {
            if (null != null) {
                try {
                    close(null);
                } catch (Throwable e22) {
                    ExceptionMonitor.getInstance().exceptionCaught(e22);
                }
            }
        }
    }

    private void startupWorker() {
        if (!this.selectable) {
            this.connectQueue.clear();
            this.cancelQueue.clear();
        }
        if (((Connector) this.connectorRef.get()) == null) {
            Runnable connector = new Connector();
            if (this.connectorRef.compareAndSet(null, connector)) {
                executeWorker(connector);
            }
        }
    }

    private int registerNew() {
        int i = 0;
        while (true) {
            ConnectionRequest connectionRequest = (ConnectionRequest) this.connectQueue.poll();
            if (connectionRequest == null) {
                return i;
            }
            Object access$100 = connectionRequest.handle;
            try {
                register(access$100, connectionRequest);
                i++;
            } catch (Throwable e) {
                connectionRequest.setException(e);
                try {
                    close(access$100);
                } catch (Throwable e2) {
                    ExceptionMonitor.getInstance().exceptionCaught(e2);
                }
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int cancelKeys() {
        /*
        r3 = this;
        r0 = 0;
        r1 = r0;
    L_0x0002:
        r0 = r3.cancelQueue;
        r0 = r0.poll();
        r0 = (org.apache.mina.core.polling.AbstractPollingIoConnector.ConnectionRequest) r0;
        if (r0 == 0) goto L_0x0025;
    L_0x000c:
        r0 = r0.handle;
        r3.close(r0);	 Catch:{ Exception -> 0x0017 }
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x0002;
    L_0x0017:
        r0 = move-exception;
        r2 = org.apache.mina.util.ExceptionMonitor.getInstance();	 Catch:{ all -> 0x0023 }
        r2.exceptionCaught(r0);	 Catch:{ all -> 0x0023 }
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x0002;
    L_0x0023:
        r0 = move-exception;
        throw r0;
    L_0x0025:
        if (r1 <= 0) goto L_0x002a;
    L_0x0027:
        r3.wakeup();
    L_0x002a:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.mina.core.polling.AbstractPollingIoConnector.cancelKeys():int");
    }

    private int processConnections(Iterator<H> it) {
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            it.remove();
            Object connectionRequest = getConnectionRequest(next);
            if (connectionRequest != null) {
                try {
                    if (finishConnect(next)) {
                        IoSession newSession = newSession(this.processor, next);
                        initSession(newSession, connectionRequest, connectionRequest.getSessionInitializer());
                        newSession.getProcessor().add(newSession);
                        i++;
                    }
                } catch (Throwable e) {
                    connectionRequest.setException(e);
                } finally {
                    this.cancelQueue.offer(connectionRequest);
                }
            }
        }
        return i;
    }

    private void processTimedOutSessions(Iterator<H> it) {
        long currentTimeMillis = System.currentTimeMillis();
        while (it.hasNext()) {
            ConnectionRequest connectionRequest = getConnectionRequest(it.next());
            if (connectionRequest != null && currentTimeMillis >= connectionRequest.deadline) {
                connectionRequest.setException(new ConnectException("Connection timed out."));
                this.cancelQueue.offer(connectionRequest);
            }
        }
    }
}
