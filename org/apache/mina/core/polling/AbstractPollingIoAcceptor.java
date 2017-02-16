package org.apache.mina.core.polling;

import java.net.SocketAddress;
import java.nio.channels.spi.SelectorProvider;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.mina.core.RuntimeIoException;
import org.apache.mina.core.service.AbstractIoAcceptor;
import org.apache.mina.core.service.AbstractIoAcceptor.AcceptorOperationFuture;
import org.apache.mina.core.service.IoProcessor;
import org.apache.mina.core.service.SimpleIoProcessorPool;
import org.apache.mina.core.session.AbstractIoSession;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.core.session.IoSessionConfig;
import org.apache.mina.transport.socket.SocketSessionConfig;
import org.apache.mina.util.ExceptionMonitor;

public abstract class AbstractPollingIoAcceptor<S extends AbstractIoSession, H> extends AbstractIoAcceptor {
    private AtomicReference<Acceptor> acceptorRef;
    protected int backlog;
    private final Map<SocketAddress, H> boundHandles;
    private final Queue<AcceptorOperationFuture> cancelQueue;
    private final boolean createdProcessor;
    private final ServiceOperationFuture disposalFuture;
    private final Semaphore lock;
    private final IoProcessor<S> processor;
    private final Queue<AcceptorOperationFuture> registerQueue;
    protected boolean reuseAddress;
    private volatile boolean selectable;

    private class Acceptor implements Runnable {
        static final /* synthetic */ boolean $assertionsDisabled;

        static {
            $assertionsDisabled = !AbstractPollingIoAcceptor.class.desiredAssertionStatus();
        }

        private Acceptor() {
        }

        public void run() {
            Throwable th;
            if ($assertionsDisabled || AbstractPollingIoAcceptor.this.acceptorRef.get() == this) {
                AbstractPollingIoAcceptor.this.lock.release();
                int i = 0;
                while (AbstractPollingIoAcceptor.this.selectable) {
                    try {
                        int access$400 = AbstractPollingIoAcceptor.this.registerHandles() + i;
                        try {
                            i = AbstractPollingIoAcceptor.this.select();
                            if (access$400 == 0) {
                                AbstractPollingIoAcceptor.this.acceptorRef.set(null);
                                if (AbstractPollingIoAcceptor.this.registerQueue.isEmpty() && AbstractPollingIoAcceptor.this.cancelQueue.isEmpty()) {
                                    if (!$assertionsDisabled && AbstractPollingIoAcceptor.this.acceptorRef.get() == this) {
                                        throw new AssertionError();
                                    }
                                    if (!AbstractPollingIoAcceptor.this.selectable) {
                                        return;
                                    }
                                    return;
                                } else if (!AbstractPollingIoAcceptor.this.acceptorRef.compareAndSet(null, this)) {
                                    if (!$assertionsDisabled && AbstractPollingIoAcceptor.this.acceptorRef.get() == this) {
                                        throw new AssertionError();
                                    }
                                    if (!AbstractPollingIoAcceptor.this.selectable && AbstractPollingIoAcceptor.this.isDisposing()) {
                                        AbstractPollingIoAcceptor.this.selectable = false;
                                        try {
                                            if (AbstractPollingIoAcceptor.this.createdProcessor) {
                                                AbstractPollingIoAcceptor.this.processor.dispose();
                                            }
                                            try {
                                                synchronized (AbstractPollingIoAcceptor.this.disposalLock) {
                                                    if (AbstractPollingIoAcceptor.this.isDisposing()) {
                                                        AbstractPollingIoAcceptor.this.destroy();
                                                    }
                                                }
                                                AbstractPollingIoAcceptor.this.disposalFuture.setDone();
                                                return;
                                            } catch (Throwable e) {
                                                try {
                                                    ExceptionMonitor.getInstance().exceptionCaught(e);
                                                    return;
                                                } finally {
                                                    AbstractPollingIoAcceptor.this.disposalFuture.setDone();
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            try {
                                                synchronized (AbstractPollingIoAcceptor.this.disposalLock) {
                                                }
                                                if (AbstractPollingIoAcceptor.this.isDisposing()) {
                                                    AbstractPollingIoAcceptor.this.destroy();
                                                }
                                                AbstractPollingIoAcceptor.this.disposalFuture.setDone();
                                            } catch (Throwable e2) {
                                                try {
                                                    ExceptionMonitor.getInstance().exceptionCaught(e2);
                                                } finally {
                                                    AbstractPollingIoAcceptor.this.disposalFuture.setDone();
                                                }
                                            }
                                        }
                                    } else {
                                        return;
                                    }
                                } else if (!($assertionsDisabled || AbstractPollingIoAcceptor.this.acceptorRef.get() == this)) {
                                    throw new AssertionError();
                                }
                            }
                            if (i > 0) {
                                processHandles(AbstractPollingIoAcceptor.this.selectedHandles());
                            }
                            i = access$400 - AbstractPollingIoAcceptor.this.unregisterHandles();
                        } catch (Throwable e3) {
                            ExceptionMonitor.getInstance().exceptionCaught(e3);
                        } catch (Throwable e32) {
                            Throwable th3 = e32;
                            i = access$400;
                            th = th3;
                            ExceptionMonitor.getInstance().exceptionCaught(th);
                            try {
                                Thread.sleep(1000);
                            } catch (Throwable th4) {
                                ExceptionMonitor.getInstance().exceptionCaught(th4);
                            }
                        }
                    } catch (Throwable e322) {
                        ExceptionMonitor.getInstance().exceptionCaught(e322);
                    } catch (Exception e4) {
                        th4 = e4;
                        ExceptionMonitor.getInstance().exceptionCaught(th4);
                        Thread.sleep(1000);
                    }
                }
                if (!AbstractPollingIoAcceptor.this.selectable) {
                    return;
                }
                return;
            }
            throw new AssertionError();
        }

        private void processHandles(Iterator<H> it) {
            while (it.hasNext()) {
                Object next = it.next();
                it.remove();
                IoSession accept = AbstractPollingIoAcceptor.this.accept(AbstractPollingIoAcceptor.this.processor, next);
                if (accept != null) {
                    AbstractPollingIoAcceptor.this.initSession(accept, null, null);
                    accept.getProcessor().add(accept);
                }
            }
        }
    }

    public abstract S accept(IoProcessor<S> ioProcessor, H h);

    public abstract void close(H h);

    public abstract void destroy();

    public abstract void init();

    public abstract void init(SelectorProvider selectorProvider);

    public abstract SocketAddress localAddress(H h);

    public abstract H open(SocketAddress socketAddress);

    public abstract int select();

    public abstract Iterator<H> selectedHandles();

    public abstract void wakeup();

    public AbstractPollingIoAcceptor(IoSessionConfig ioSessionConfig, Class<? extends IoProcessor<S>> cls) {
        this(ioSessionConfig, null, new SimpleIoProcessorPool(cls), true, null);
    }

    public AbstractPollingIoAcceptor(IoSessionConfig ioSessionConfig, Class<? extends IoProcessor<S>> cls, int i) {
        this(ioSessionConfig, null, new SimpleIoProcessorPool((Class) cls, i), true, null);
    }

    public AbstractPollingIoAcceptor(IoSessionConfig ioSessionConfig, Class<? extends IoProcessor<S>> cls, int i, SelectorProvider selectorProvider) {
        this(ioSessionConfig, null, new SimpleIoProcessorPool(cls, i, selectorProvider), true, selectorProvider);
    }

    public AbstractPollingIoAcceptor(IoSessionConfig ioSessionConfig, IoProcessor<S> ioProcessor) {
        this(ioSessionConfig, null, ioProcessor, false, null);
    }

    public AbstractPollingIoAcceptor(IoSessionConfig ioSessionConfig, Executor executor, IoProcessor<S> ioProcessor) {
        this(ioSessionConfig, executor, ioProcessor, false, null);
    }

    private AbstractPollingIoAcceptor(IoSessionConfig ioSessionConfig, Executor executor, IoProcessor<S> ioProcessor, boolean z, SelectorProvider selectorProvider) {
        super(ioSessionConfig, executor);
        this.lock = new Semaphore(1);
        this.registerQueue = new ConcurrentLinkedQueue();
        this.cancelQueue = new ConcurrentLinkedQueue();
        this.boundHandles = Collections.synchronizedMap(new HashMap());
        this.disposalFuture = new ServiceOperationFuture();
        this.acceptorRef = new AtomicReference();
        this.reuseAddress = false;
        this.backlog = 50;
        if (ioProcessor == null) {
            throw new IllegalArgumentException("processor");
        }
        this.processor = ioProcessor;
        this.createdProcessor = z;
        try {
            init(selectorProvider);
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

    protected void dispose0() {
        unbind();
        startupAcceptor();
        wakeup();
    }

    protected final Set<SocketAddress> bindInternal(List<? extends SocketAddress> list) {
        AcceptorOperationFuture acceptorOperationFuture = new AcceptorOperationFuture(list);
        this.registerQueue.add(acceptorOperationFuture);
        startupAcceptor();
        try {
            this.lock.acquire();
            wakeup();
            acceptorOperationFuture.awaitUninterruptibly();
            if (acceptorOperationFuture.getException() != null) {
                throw acceptorOperationFuture.getException();
            }
            Set<SocketAddress> hashSet = new HashSet();
            for (Object localAddress : this.boundHandles.values()) {
                hashSet.add(localAddress(localAddress));
            }
            return hashSet;
        } finally {
            this.lock.release();
        }
    }

    private void startupAcceptor() {
        if (!this.selectable) {
            this.registerQueue.clear();
            this.cancelQueue.clear();
        }
        if (((Acceptor) this.acceptorRef.get()) == null) {
            this.lock.acquire();
            Runnable acceptor = new Acceptor();
            if (this.acceptorRef.compareAndSet(null, acceptor)) {
                executeWorker(acceptor);
            } else {
                this.lock.release();
            }
        }
    }

    protected final void unbind0(List<? extends SocketAddress> list) {
        AcceptorOperationFuture acceptorOperationFuture = new AcceptorOperationFuture(list);
        this.cancelQueue.add(acceptorOperationFuture);
        startupAcceptor();
        wakeup();
        acceptorOperationFuture.awaitUninterruptibly();
        if (acceptorOperationFuture.getException() != null) {
            throw acceptorOperationFuture.getException();
        }
    }

    private int registerHandles() {
        int size;
        while (true) {
            AcceptorOperationFuture acceptorOperationFuture = (AcceptorOperationFuture) this.registerQueue.poll();
            if (acceptorOperationFuture == null) {
                return 0;
            }
            Map concurrentHashMap = new ConcurrentHashMap();
            Object open;
            try {
                for (SocketAddress open2 : acceptorOperationFuture.getLocalAddresses()) {
                    open = open(open2);
                    concurrentHashMap.put(localAddress(open), open);
                }
                this.boundHandles.putAll(concurrentHashMap);
                acceptorOperationFuture.setDone();
                size = concurrentHashMap.size();
                break;
            } catch (Exception e) {
                acceptorOperationFuture.setException(e);
                if (acceptorOperationFuture.getException() != null) {
                    for (Object open3 : concurrentHashMap.values()) {
                        try {
                            close(open3);
                        } catch (Throwable e2) {
                            ExceptionMonitor.getInstance().exceptionCaught(e2);
                        }
                    }
                    wakeup();
                }
            } catch (Throwable th) {
                if (acceptorOperationFuture.getException() != null) {
                    for (Object close : concurrentHashMap.values()) {
                        try {
                            close(close);
                        } catch (Throwable e3) {
                            ExceptionMonitor.getInstance().exceptionCaught(e3);
                        }
                    }
                    wakeup();
                }
            }
        }
        if (acceptorOperationFuture.getException() != null) {
            for (Object close2 : concurrentHashMap.values()) {
                try {
                    close(close2);
                } catch (Throwable e32) {
                    ExceptionMonitor.getInstance().exceptionCaught(e32);
                }
            }
            wakeup();
        }
        return size;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int unregisterHandles() {
        /*
        r5 = this;
        r0 = 0;
        r1 = r0;
    L_0x0002:
        r0 = r5.cancelQueue;
        r0 = r0.poll();
        r0 = (org.apache.mina.core.service.AbstractIoAcceptor.AcceptorOperationFuture) r0;
        if (r0 == 0) goto L_0x0044;
    L_0x000c:
        r2 = r0.getLocalAddresses();
        r3 = r2.iterator();
        r2 = r1;
    L_0x0015:
        r1 = r3.hasNext();
        if (r1 == 0) goto L_0x003f;
    L_0x001b:
        r1 = r3.next();
        r1 = (java.net.SocketAddress) r1;
        r4 = r5.boundHandles;
        r1 = r4.remove(r1);
        if (r1 == 0) goto L_0x0015;
    L_0x0029:
        r5.close(r1);	 Catch:{ Exception -> 0x0032 }
        r5.wakeup();	 Catch:{ Exception -> 0x0032 }
        r2 = r2 + 1;
        goto L_0x0015;
    L_0x0032:
        r1 = move-exception;
        r4 = org.apache.mina.util.ExceptionMonitor.getInstance();	 Catch:{ all -> 0x003d }
        r4.exceptionCaught(r1);	 Catch:{ all -> 0x003d }
        r2 = r2 + 1;
        goto L_0x0015;
    L_0x003d:
        r0 = move-exception;
        throw r0;
    L_0x003f:
        r0.setDone();
        r1 = r2;
        goto L_0x0002;
    L_0x0044:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.mina.core.polling.AbstractPollingIoAcceptor.unregisterHandles():int");
    }

    public final IoSession newSession(SocketAddress socketAddress, SocketAddress socketAddress2) {
        throw new UnsupportedOperationException();
    }

    public int getBacklog() {
        return this.backlog;
    }

    public void setBacklog(int i) {
        synchronized (this.bindLock) {
            if (isActive()) {
                throw new IllegalStateException("backlog can't be set while the acceptor is bound.");
            }
            this.backlog = i;
        }
    }

    public boolean isReuseAddress() {
        return this.reuseAddress;
    }

    public void setReuseAddress(boolean z) {
        synchronized (this.bindLock) {
            if (isActive()) {
                throw new IllegalStateException("backlog can't be set while the acceptor is bound.");
            }
            this.reuseAddress = z;
        }
    }

    public SocketSessionConfig getSessionConfig() {
        return (SocketSessionConfig) this.sessionConfig;
    }
}
