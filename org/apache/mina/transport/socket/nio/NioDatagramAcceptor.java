package org.apache.mina.transport.socket.nio;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.channels.DatagramChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import org.apache.mina.core.RuntimeIoException;
import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.service.AbstractIoAcceptor;
import org.apache.mina.core.service.AbstractIoAcceptor.AcceptorOperationFuture;
import org.apache.mina.core.service.IoProcessor;
import org.apache.mina.core.service.TransportMetadata;
import org.apache.mina.core.session.AbstractIoSession;
import org.apache.mina.core.session.ExpiringSessionRecycler;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.core.session.IoSessionConfig;
import org.apache.mina.core.session.IoSessionRecycler;
import org.apache.mina.transport.socket.DatagramAcceptor;
import org.apache.mina.transport.socket.DatagramSessionConfig;
import org.apache.mina.transport.socket.DefaultDatagramSessionConfig;
import org.apache.mina.util.ExceptionMonitor;

public final class NioDatagramAcceptor extends AbstractIoAcceptor implements IoProcessor<NioSession>, DatagramAcceptor {
    private static final IoSessionRecycler DEFAULT_RECYCLER;
    private static final long SELECT_TIMEOUT = 1000;
    private Acceptor acceptor;
    private final Map<SocketAddress, DatagramChannel> boundHandles;
    private final Queue<AcceptorOperationFuture> cancelQueue;
    private final ServiceOperationFuture disposalFuture;
    private final Queue<NioSession> flushingSessions;
    private long lastIdleCheckTime;
    private final Semaphore lock;
    private final Queue<AcceptorOperationFuture> registerQueue;
    private volatile boolean selectable;
    private volatile Selector selector;
    private IoSessionRecycler sessionRecycler;

    private class Acceptor implements Runnable {
        private Acceptor() {
        }

        public void run() {
            Throwable th;
            NioDatagramAcceptor.this.lastIdleCheckTime = System.currentTimeMillis();
            NioDatagramAcceptor.this.lock.release();
            int i = 0;
            while (NioDatagramAcceptor.this.selectable) {
                try {
                    int select = NioDatagramAcceptor.this.select(NioDatagramAcceptor.SELECT_TIMEOUT);
                    int access$300 = NioDatagramAcceptor.this.registerHandles() + i;
                    if (access$300 == 0) {
                        try {
                            NioDatagramAcceptor.this.lock.acquire();
                            if (NioDatagramAcceptor.this.registerQueue.isEmpty() && NioDatagramAcceptor.this.cancelQueue.isEmpty()) {
                                NioDatagramAcceptor.this.acceptor = null;
                                NioDatagramAcceptor.this.lock.release();
                                break;
                            }
                            NioDatagramAcceptor.this.lock.release();
                        } catch (Throwable e) {
                            ExceptionMonitor.getInstance().exceptionCaught(e);
                        } catch (Throwable e2) {
                            Throwable th2 = e2;
                            i = access$300;
                            th = th2;
                        } catch (Throwable th3) {
                            NioDatagramAcceptor.this.lock.release();
                        }
                    }
                    if (select > 0) {
                        NioDatagramAcceptor.this.processReadySessions(NioDatagramAcceptor.this.selectedHandles());
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    NioDatagramAcceptor.this.flushSessions(currentTimeMillis);
                    i = access$300 - NioDatagramAcceptor.this.unregisterHandles();
                    NioDatagramAcceptor.this.notifyIdleSessions(currentTimeMillis);
                } catch (Throwable e22) {
                    ExceptionMonitor.getInstance().exceptionCaught(e22);
                } catch (Exception e3) {
                    th = e3;
                    ExceptionMonitor.getInstance().exceptionCaught(th);
                    try {
                        Thread.sleep(NioDatagramAcceptor.SELECT_TIMEOUT);
                    } catch (InterruptedException e4) {
                    }
                }
            }
            if (NioDatagramAcceptor.this.selectable && NioDatagramAcceptor.this.isDisposing()) {
                NioDatagramAcceptor.this.selectable = false;
                try {
                    NioDatagramAcceptor.this.destroy();
                } catch (Throwable e222) {
                    ExceptionMonitor.getInstance().exceptionCaught(e222);
                } finally {
                    NioDatagramAcceptor.this.disposalFuture.setValue(Boolean.valueOf(true));
                }
            }
        }
    }

    static {
        DEFAULT_RECYCLER = new ExpiringSessionRecycler();
    }

    public NioDatagramAcceptor() {
        this(new DefaultDatagramSessionConfig(), null);
    }

    public NioDatagramAcceptor(Executor executor) {
        this(new DefaultDatagramSessionConfig(), executor);
    }

    private NioDatagramAcceptor(IoSessionConfig ioSessionConfig, Executor executor) {
        super(ioSessionConfig, executor);
        this.lock = new Semaphore(1);
        this.registerQueue = new ConcurrentLinkedQueue();
        this.cancelQueue = new ConcurrentLinkedQueue();
        this.flushingSessions = new ConcurrentLinkedQueue();
        this.boundHandles = Collections.synchronizedMap(new HashMap());
        this.sessionRecycler = DEFAULT_RECYCLER;
        this.disposalFuture = new ServiceOperationFuture();
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

    private int registerHandles() {
        int size;
        while (true) {
            AcceptorOperationFuture acceptorOperationFuture = (AcceptorOperationFuture) this.registerQueue.poll();
            if (acceptorOperationFuture == null) {
                return 0;
            }
            Map hashMap = new HashMap();
            try {
                for (SocketAddress open : acceptorOperationFuture.getLocalAddresses()) {
                    DatagramChannel open2 = open(open);
                    hashMap.put(localAddress(open2), open2);
                }
                this.boundHandles.putAll(hashMap);
                getListeners().fireServiceActivated();
                acceptorOperationFuture.setDone();
                size = hashMap.size();
                break;
            } catch (Exception e) {
                acceptorOperationFuture.setException(e);
                if (acceptorOperationFuture.getException() != null) {
                    for (DatagramChannel close : hashMap.values()) {
                        try {
                            close(close);
                        } catch (Throwable e2) {
                            ExceptionMonitor.getInstance().exceptionCaught(e2);
                        }
                    }
                    wakeup();
                }
            } catch (Throwable th) {
                if (acceptorOperationFuture.getException() != null) {
                    for (DatagramChannel close2 : hashMap.values()) {
                        try {
                            close(close2);
                        } catch (Throwable e22) {
                            ExceptionMonitor.getInstance().exceptionCaught(e22);
                        }
                    }
                    wakeup();
                }
            }
        }
        if (acceptorOperationFuture.getException() != null) {
            for (DatagramChannel close22 : hashMap.values()) {
                try {
                    close(close22);
                } catch (Throwable e222) {
                    ExceptionMonitor.getInstance().exceptionCaught(e222);
                }
            }
            wakeup();
        }
        return size;
    }

    private void processReadySessions(Set<SelectionKey> set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            SelectionKey selectionKey = (SelectionKey) it.next();
            DatagramChannel datagramChannel = (DatagramChannel) selectionKey.channel();
            it.remove();
            try {
                if (selectionKey.isValid() && selectionKey.isReadable()) {
                    readHandle(datagramChannel);
                }
                if (selectionKey.isValid() && selectionKey.isWritable()) {
                    for (IoSession ioSession : getManagedSessions().values()) {
                        scheduleFlush((NioSession) ioSession);
                    }
                }
            } catch (Throwable e) {
                ExceptionMonitor.getInstance().exceptionCaught(e);
            }
        }
    }

    private boolean scheduleFlush(NioSession nioSession) {
        if (!nioSession.setScheduledForFlush(true)) {
            return false;
        }
        this.flushingSessions.add(nioSession);
        return true;
    }

    private void readHandle(DatagramChannel datagramChannel) {
        IoBuffer allocate = IoBuffer.allocate(getSessionConfig().getReadBufferSize());
        SocketAddress receive = receive(datagramChannel, allocate);
        if (receive != null) {
            IoSession newSessionWithoutLock = newSessionWithoutLock(receive, localAddress(datagramChannel));
            allocate.flip();
            newSessionWithoutLock.getFilterChain().fireMessageReceived(allocate);
        }
    }

    private IoSession newSessionWithoutLock(SocketAddress socketAddress, SocketAddress socketAddress2) {
        DatagramChannel datagramChannel = (DatagramChannel) this.boundHandles.get(socketAddress2);
        if (datagramChannel == null) {
            throw new IllegalArgumentException("Unknown local address: " + socketAddress2);
        }
        synchronized (this.sessionRecycler) {
            IoSession recycle = this.sessionRecycler.recycle(socketAddress);
            if (recycle != null) {
                return recycle;
            }
            IoSession newSession = newSession(this, datagramChannel, socketAddress);
            getSessionRecycler().put(newSession);
            initSession(newSession, null, null);
            try {
                getFilterChainBuilder().buildFilterChain(newSession.getFilterChain());
                getListeners().fireSessionCreated(newSession);
                return newSession;
            } catch (Throwable e) {
                ExceptionMonitor.getInstance().exceptionCaught(e);
                return newSession;
            }
        }
    }

    private void flushSessions(long j) {
        while (true) {
            NioSession nioSession = (NioSession) this.flushingSessions.poll();
            if (nioSession != null) {
                nioSession.unscheduledForFlush();
                try {
                    if (!(!flush(nioSession, j) || nioSession.getWriteRequestQueue().isEmpty(nioSession) || nioSession.isScheduledForFlush())) {
                        scheduleFlush(nioSession);
                    }
                } catch (Throwable e) {
                    nioSession.getFilterChain().fireExceptionCaught(e);
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean flush(org.apache.mina.transport.socket.nio.NioSession r11, long r12) {
        /*
        r10 = this;
        r1 = 1;
        r2 = 0;
        r6 = r11.getWriteRequestQueue();
        r0 = r11.getConfig();
        r0 = r0.getMaxReadBufferSize();
        r3 = r11.getConfig();
        r3 = r3.getMaxReadBufferSize();
        r3 = r3 >>> 1;
        r7 = r0 + r3;
        r3 = r2;
    L_0x001b:
        r0 = r11.getCurrentWriteRequest();	 Catch:{ all -> 0x004f }
        if (r0 != 0) goto L_0x0033;
    L_0x0021:
        r0 = r6.poll(r11);	 Catch:{ all -> 0x004f }
        if (r0 != 0) goto L_0x0030;
    L_0x0027:
        r0 = 0;
        r10.setInterestedInWrite(r11, r0);	 Catch:{ all -> 0x004f }
        r11.increaseWrittenBytes(r3, r12);
        r0 = r1;
    L_0x002f:
        return r0;
    L_0x0030:
        r11.setCurrentWriteRequest(r0);	 Catch:{ all -> 0x004f }
    L_0x0033:
        r5 = r0;
        r0 = r5.getMessage();	 Catch:{ all -> 0x004f }
        r0 = (org.apache.mina.core.buffer.IoBuffer) r0;	 Catch:{ all -> 0x004f }
        r4 = r0.remaining();	 Catch:{ all -> 0x004f }
        if (r4 != 0) goto L_0x0055;
    L_0x0040:
        r4 = 0;
        r11.setCurrentWriteRequest(r4);	 Catch:{ all -> 0x004f }
        r0.reset();	 Catch:{ all -> 0x004f }
        r0 = r11.getFilterChain();	 Catch:{ all -> 0x004f }
        r0.fireMessageSent(r5);	 Catch:{ all -> 0x004f }
        goto L_0x001b;
    L_0x004f:
        r0 = move-exception;
        r1 = r3;
        r11.increaseWrittenBytes(r1, r12);
        throw r0;
    L_0x0055:
        r4 = r5.getDestination();	 Catch:{ all -> 0x004f }
        if (r4 != 0) goto L_0x005f;
    L_0x005b:
        r4 = r11.getRemoteAddress();	 Catch:{ all -> 0x004f }
    L_0x005f:
        r4 = r10.send(r11, r0, r4);	 Catch:{ all -> 0x004f }
        if (r4 == 0) goto L_0x0067;
    L_0x0065:
        if (r3 < r7) goto L_0x0070;
    L_0x0067:
        r0 = 1;
        r10.setInterestedInWrite(r11, r0);	 Catch:{ all -> 0x004f }
        r11.increaseWrittenBytes(r3, r12);
        r0 = r2;
        goto L_0x002f;
    L_0x0070:
        r8 = 0;
        r10.setInterestedInWrite(r11, r8);	 Catch:{ all -> 0x004f }
        r8 = 0;
        r11.setCurrentWriteRequest(r8);	 Catch:{ all -> 0x004f }
        r3 = r3 + r4;
        r0.reset();	 Catch:{ all -> 0x004f }
        r0 = r11.getFilterChain();	 Catch:{ all -> 0x004f }
        r0.fireMessageSent(r5);	 Catch:{ all -> 0x004f }
        goto L_0x001b;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.mina.transport.socket.nio.NioDatagramAcceptor.flush(org.apache.mina.transport.socket.nio.NioSession, long):boolean");
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
        if (r0 == 0) goto L_0x0046;
    L_0x000c:
        r2 = r0.getLocalAddresses();
        r3 = r2.iterator();
        r2 = r1;
    L_0x0015:
        r1 = r3.hasNext();
        if (r1 == 0) goto L_0x0041;
    L_0x001b:
        r1 = r3.next();
        r1 = (java.net.SocketAddress) r1;
        r4 = r5.boundHandles;
        r1 = r4.remove(r1);
        r1 = (java.nio.channels.DatagramChannel) r1;
        if (r1 == 0) goto L_0x0015;
    L_0x002b:
        r5.close(r1);	 Catch:{ Exception -> 0x0034 }
        r5.wakeup();	 Catch:{ Exception -> 0x0034 }
        r2 = r2 + 1;
        goto L_0x0015;
    L_0x0034:
        r1 = move-exception;
        r4 = org.apache.mina.util.ExceptionMonitor.getInstance();	 Catch:{ all -> 0x003f }
        r4.exceptionCaught(r1);	 Catch:{ all -> 0x003f }
        r2 = r2 + 1;
        goto L_0x0015;
    L_0x003f:
        r0 = move-exception;
        throw r0;
    L_0x0041:
        r0.setDone();
        r1 = r2;
        goto L_0x0002;
    L_0x0046:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.mina.transport.socket.nio.NioDatagramAcceptor.unregisterHandles():int");
    }

    private void notifyIdleSessions(long j) {
        if (j - this.lastIdleCheckTime >= SELECT_TIMEOUT) {
            this.lastIdleCheckTime = j;
            AbstractIoSession.notifyIdleness(getListeners().getManagedSessions().values().iterator(), j);
        }
    }

    private void startupAcceptor() {
        if (!this.selectable) {
            this.registerQueue.clear();
            this.cancelQueue.clear();
            this.flushingSessions.clear();
        }
        this.lock.acquire();
        if (this.acceptor == null) {
            this.acceptor = new Acceptor();
            executeWorker(this.acceptor);
            return;
        }
        this.lock.release();
    }

    protected final void init() {
        this.selector = Selector.open();
    }

    public final void add(NioSession nioSession) {
    }

    protected final Set<SocketAddress> bindInternal(List<? extends SocketAddress> list) {
        AcceptorOperationFuture acceptorOperationFuture = new AcceptorOperationFuture(list);
        this.registerQueue.add(acceptorOperationFuture);
        startupAcceptor();
        try {
            this.lock.acquire();
            Thread.sleep(10);
            wakeup();
            acceptorOperationFuture.awaitUninterruptibly();
            if (acceptorOperationFuture.getException() != null) {
                throw acceptorOperationFuture.getException();
            }
            Set<SocketAddress> hashSet = new HashSet();
            for (DatagramChannel localAddress : this.boundHandles.values()) {
                hashSet.add(localAddress(localAddress));
            }
            return hashSet;
        } finally {
            this.lock.release();
        }
    }

    protected final void close(DatagramChannel datagramChannel) {
        SelectionKey keyFor = datagramChannel.keyFor(this.selector);
        if (keyFor != null) {
            keyFor.cancel();
        }
        datagramChannel.disconnect();
        datagramChannel.close();
    }

    protected final void destroy() {
        if (this.selector != null) {
            this.selector.close();
        }
    }

    protected final void dispose0() {
        unbind();
        startupAcceptor();
        wakeup();
    }

    public final void flush(NioSession nioSession) {
        if (scheduleFlush(nioSession)) {
            wakeup();
        }
    }

    public final InetSocketAddress getDefaultLocalAddress() {
        return (InetSocketAddress) super.getDefaultLocalAddress();
    }

    public final InetSocketAddress getLocalAddress() {
        return (InetSocketAddress) super.getLocalAddress();
    }

    public final DatagramSessionConfig getSessionConfig() {
        return (DatagramSessionConfig) this.sessionConfig;
    }

    public final IoSessionRecycler getSessionRecycler() {
        return this.sessionRecycler;
    }

    public final TransportMetadata getTransportMetadata() {
        return NioDatagramSession.METADATA;
    }

    protected final boolean isReadable(DatagramChannel datagramChannel) {
        SelectionKey keyFor = datagramChannel.keyFor(this.selector);
        if (keyFor == null || !keyFor.isValid()) {
            return false;
        }
        return keyFor.isReadable();
    }

    protected final boolean isWritable(DatagramChannel datagramChannel) {
        SelectionKey keyFor = datagramChannel.keyFor(this.selector);
        if (keyFor == null || !keyFor.isValid()) {
            return false;
        }
        return keyFor.isWritable();
    }

    protected final SocketAddress localAddress(DatagramChannel datagramChannel) {
        InetSocketAddress inetSocketAddress = (InetSocketAddress) datagramChannel.socket().getLocalSocketAddress();
        InetAddress address = inetSocketAddress.getAddress();
        if (!(address instanceof Inet6Address) || !((Inet6Address) address).isIPv4CompatibleAddress()) {
            return inetSocketAddress;
        }
        Object address2 = ((Inet6Address) address).getAddress();
        Object obj = new byte[4];
        System.arraycopy(address2, 12, obj, 0, 4);
        return new InetSocketAddress(Inet4Address.getByAddress(obj), inetSocketAddress.getPort());
    }

    protected final NioSession newSession(IoProcessor<NioSession> ioProcessor, DatagramChannel datagramChannel, SocketAddress socketAddress) {
        SelectionKey keyFor = datagramChannel.keyFor(this.selector);
        if (keyFor == null || !keyFor.isValid()) {
            return null;
        }
        NioSession nioDatagramSession = new NioDatagramSession(this, datagramChannel, ioProcessor, socketAddress);
        nioDatagramSession.setSelectionKey(keyFor);
        return nioDatagramSession;
    }

    public final IoSession newSession(SocketAddress socketAddress, SocketAddress socketAddress2) {
        if (isDisposing()) {
            throw new IllegalStateException("The Acceptor is being disposed.");
        } else if (socketAddress == null) {
            throw new IllegalArgumentException("remoteAddress");
        } else {
            IoSession newSessionWithoutLock;
            synchronized (this.bindLock) {
                if (isActive()) {
                    try {
                        newSessionWithoutLock = newSessionWithoutLock(socketAddress, socketAddress2);
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Error e2) {
                        throw e2;
                    } catch (Throwable e3) {
                        throw new RuntimeIoException("Failed to create a session.", e3);
                    }
                }
                throw new IllegalStateException("Can't create a session from a unbound service.");
            }
            return newSessionWithoutLock;
        }
    }

    protected final DatagramChannel open(SocketAddress socketAddress) {
        DatagramChannel open = DatagramChannel.open();
        try {
            new NioDatagramSessionConfig(open).setAll(getSessionConfig());
            open.configureBlocking(false);
            open.socket().bind(socketAddress);
            open.register(this.selector, 1);
            return open;
        } catch (IOException e) {
            Exception iOException = new IOException("Error while binding on " + socketAddress + "\noriginal message : " + e.getMessage());
            iOException.initCause(e.getCause());
            open.close();
            throw iOException;
        } catch (Throwable th) {
            close(open);
        }
    }

    protected final SocketAddress receive(DatagramChannel datagramChannel, IoBuffer ioBuffer) {
        return datagramChannel.receive(ioBuffer.buf());
    }

    public final void remove(NioSession nioSession) {
        getSessionRecycler().remove(nioSession);
        getListeners().fireSessionDestroyed(nioSession);
    }

    protected final int select() {
        return this.selector.select();
    }

    protected final int select(long j) {
        return this.selector.select(j);
    }

    protected final Set<SelectionKey> selectedHandles() {
        return this.selector.selectedKeys();
    }

    protected final int send(NioSession nioSession, IoBuffer ioBuffer, SocketAddress socketAddress) {
        return ((DatagramChannel) nioSession.getChannel()).send(ioBuffer.buf(), socketAddress);
    }

    public final void setDefaultLocalAddress(InetSocketAddress inetSocketAddress) {
        setDefaultLocalAddress(inetSocketAddress);
    }

    protected final void setInterestedInWrite(NioSession nioSession, boolean z) {
        SelectionKey selectionKey = nioSession.getSelectionKey();
        if (selectionKey != null) {
            int interestOps = selectionKey.interestOps();
            if (z) {
                interestOps |= 4;
            } else {
                interestOps &= -5;
            }
            selectionKey.interestOps(interestOps);
        }
    }

    public final void setSessionRecycler(IoSessionRecycler ioSessionRecycler) {
        synchronized (this.bindLock) {
            if (isActive()) {
                throw new IllegalStateException("sessionRecycler can't be set while the acceptor is bound.");
            }
            if (ioSessionRecycler == null) {
                ioSessionRecycler = DEFAULT_RECYCLER;
            }
            this.sessionRecycler = ioSessionRecycler;
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

    public final void updateTrafficControl(NioSession nioSession) {
        throw new UnsupportedOperationException();
    }

    protected final void wakeup() {
        this.selector.wakeup();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void write(org.apache.mina.transport.socket.nio.NioSession r9, org.apache.mina.core.write.WriteRequest r10) {
        /*
        r8 = this;
        r3 = 0;
        r1 = 0;
        r4 = java.lang.System.currentTimeMillis();
        r6 = r9.getWriteRequestQueue();
        r0 = r9.getConfig();
        r0 = r0.getMaxReadBufferSize();
        r2 = r9.getConfig();
        r2 = r2.getMaxReadBufferSize();
        r2 = r2 >>> 1;
        r7 = r0 + r2;
        r0 = r10.getMessage();
        r0 = (org.apache.mina.core.buffer.IoBuffer) r0;
        r2 = r0.remaining();
        if (r2 != 0) goto L_0x00b1;
    L_0x002a:
        r9.setCurrentWriteRequest(r3);
        r0.reset();
        r0 = r9.getFilterChain();
        r0.fireMessageSent(r10);
    L_0x0037:
        return;
    L_0x0038:
        r9.setCurrentWriteRequest(r0);	 Catch:{ Exception -> 0x00a0 }
    L_0x003b:
        r3 = r0;
        r0 = r3.getMessage();	 Catch:{ Exception -> 0x00a0 }
        r0 = (org.apache.mina.core.buffer.IoBuffer) r0;	 Catch:{ Exception -> 0x00a0 }
        r2 = r0.remaining();	 Catch:{ Exception -> 0x00a0 }
        if (r2 != 0) goto L_0x0068;
    L_0x0048:
        r2 = 0;
        r9.setCurrentWriteRequest(r2);	 Catch:{ Exception -> 0x00a0 }
        r0.reset();	 Catch:{ Exception -> 0x00a0 }
        r0 = r9.getFilterChain();	 Catch:{ Exception -> 0x00a0 }
        r0.fireMessageSent(r3);	 Catch:{ Exception -> 0x00a0 }
        r0 = r3;
    L_0x0057:
        if (r0 != 0) goto L_0x003b;
    L_0x0059:
        r0 = r6.poll(r9);	 Catch:{ Exception -> 0x00a0 }
        if (r0 != 0) goto L_0x0038;
    L_0x005f:
        r0 = 0;
        r8.setInterestedInWrite(r9, r0);	 Catch:{ Exception -> 0x00a0 }
        r0 = r1;
    L_0x0064:
        r9.increaseWrittenBytes(r0, r4);
        goto L_0x0037;
    L_0x0068:
        r2 = r3.getDestination();	 Catch:{ Exception -> 0x00a0 }
        if (r2 != 0) goto L_0x0072;
    L_0x006e:
        r2 = r9.getRemoteAddress();	 Catch:{ Exception -> 0x00a0 }
    L_0x0072:
        r2 = r8.send(r9, r0, r2);	 Catch:{ Exception -> 0x00a0 }
        if (r2 == 0) goto L_0x007a;
    L_0x0078:
        if (r7 > 0) goto L_0x008a;
    L_0x007a:
        r0 = 1;
        r8.setInterestedInWrite(r9, r0);	 Catch:{ Exception -> 0x00a0 }
        r0 = r9.getWriteRequestQueue();	 Catch:{ Exception -> 0x00a0 }
        r0.offer(r9, r3);	 Catch:{ Exception -> 0x00a0 }
        r8.scheduleFlush(r9);	 Catch:{ Exception -> 0x00a0 }
        r0 = r3;
        goto L_0x0057;
    L_0x008a:
        r6 = 0;
        r8.setInterestedInWrite(r9, r6);	 Catch:{ Exception -> 0x00a0 }
        r6 = 0;
        r9.setCurrentWriteRequest(r6);	 Catch:{ Exception -> 0x00a0 }
        r1 = r2 + 0;
        r0.reset();	 Catch:{ Exception -> 0x00a0 }
        r0 = r9.getFilterChain();	 Catch:{ Exception -> 0x00a0 }
        r0.fireMessageSent(r3);	 Catch:{ Exception -> 0x00a0 }
        r0 = r1;
        goto L_0x0064;
    L_0x00a0:
        r0 = move-exception;
        r2 = r9.getFilterChain();	 Catch:{ all -> 0x00ac }
        r2.fireExceptionCaught(r0);	 Catch:{ all -> 0x00ac }
        r9.increaseWrittenBytes(r1, r4);
        goto L_0x0037;
    L_0x00ac:
        r0 = move-exception;
        r9.increaseWrittenBytes(r1, r4);
        throw r0;
    L_0x00b1:
        r0 = r10;
        goto L_0x0057;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.mina.transport.socket.nio.NioDatagramAcceptor.write(org.apache.mina.transport.socket.nio.NioSession, org.apache.mina.core.write.WriteRequest):void");
    }
}
