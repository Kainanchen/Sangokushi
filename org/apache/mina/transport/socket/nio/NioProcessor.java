package org.apache.mina.transport.socket.nio;

import java.io.IOException;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.spi.SelectorProvider;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import org.apache.mina.core.RuntimeIoException;
import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.file.FileRegion;
import org.apache.mina.core.polling.AbstractPollingIoProcessor;
import org.apache.mina.core.session.SessionState;

public final class NioProcessor extends AbstractPollingIoProcessor<NioSession> {
    private Selector selector;
    private SelectorProvider selectorProvider;

    protected static class IoSessionIterator<NioSession> implements Iterator<NioSession> {
        private final Iterator<SelectionKey> iterator;

        private IoSessionIterator(Set<SelectionKey> set) {
            this.iterator = set.iterator();
        }

        public boolean hasNext() {
            return this.iterator.hasNext();
        }

        public NioSession next() {
            return ((SelectionKey) this.iterator.next()).attachment();
        }

        public void remove() {
            this.iterator.remove();
        }
    }

    public NioProcessor(Executor executor) {
        super(executor);
        this.selectorProvider = null;
        try {
            this.selector = Selector.open();
        } catch (Throwable e) {
            throw new RuntimeIoException("Failed to open a selector.", e);
        }
    }

    public NioProcessor(Executor executor, SelectorProvider selectorProvider) {
        super(executor);
        this.selectorProvider = null;
        if (selectorProvider == null) {
            try {
                this.selector = Selector.open();
                return;
            } catch (Throwable e) {
                throw new RuntimeIoException("Failed to open a selector.", e);
            }
        }
        this.selector = selectorProvider.openSelector();
    }

    protected final void doDispose() {
        this.selector.close();
    }

    protected final int select(long j) {
        return this.selector.select(j);
    }

    protected final int select() {
        return this.selector.select();
    }

    protected final boolean isSelectorEmpty() {
        return this.selector.keys().isEmpty();
    }

    protected final void wakeup() {
        this.wakeupCalled.getAndSet(true);
        this.selector.wakeup();
    }

    protected final Iterator<NioSession> allSessions() {
        return new IoSessionIterator(null);
    }

    protected final Iterator<NioSession> selectedSessions() {
        return new IoSessionIterator(null);
    }

    protected final void init(NioSession nioSession) {
        SelectableChannel selectableChannel = (SelectableChannel) nioSession.getChannel();
        selectableChannel.configureBlocking(false);
        nioSession.setSelectionKey(selectableChannel.register(this.selector, 1, nioSession));
    }

    protected final void destroy(NioSession nioSession) {
        ByteChannel channel = nioSession.getChannel();
        SelectionKey selectionKey = nioSession.getSelectionKey();
        if (selectionKey != null) {
            selectionKey.cancel();
        }
        if (channel.isOpen()) {
            channel.close();
        }
    }

    protected final void registerNewSelector() {
        synchronized (this.selector) {
            Selector open;
            Set<SelectionKey> keys = this.selector.keys();
            if (this.selectorProvider == null) {
                open = Selector.open();
            } else {
                open = this.selectorProvider.openSelector();
            }
            for (SelectionKey selectionKey : keys) {
                NioSession nioSession = (NioSession) selectionKey.attachment();
                nioSession.setSelectionKey(selectionKey.channel().register(open, selectionKey.interestOps(), nioSession));
            }
            this.selector.close();
            this.selector = open;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected final boolean isBrokenConnection() {
        /*
        r7 = this;
        r4 = 0;
        r5 = r7.selector;
        monitor-enter(r5);
        r1 = r7.selector;	 Catch:{ all -> 0x0040 }
        r1 = r1.keys();	 Catch:{ all -> 0x0040 }
        r6 = r1.iterator();	 Catch:{ all -> 0x0040 }
    L_0x000e:
        r1 = r6.hasNext();	 Catch:{ all -> 0x0040 }
        if (r1 == 0) goto L_0x003e;
    L_0x0014:
        r1 = r6.next();	 Catch:{ all -> 0x0040 }
        r1 = (java.nio.channels.SelectionKey) r1;	 Catch:{ all -> 0x0040 }
        r3 = r1.channel();	 Catch:{ all -> 0x0040 }
        r2 = r3 instanceof java.nio.channels.DatagramChannel;	 Catch:{ all -> 0x0040 }
        if (r2 == 0) goto L_0x002c;
    L_0x0022:
        r0 = r3;
        r0 = (java.nio.channels.DatagramChannel) r0;	 Catch:{ all -> 0x0040 }
        r2 = r0;
        r2 = r2.isConnected();	 Catch:{ all -> 0x0040 }
        if (r2 == 0) goto L_0x0038;
    L_0x002c:
        r2 = r3 instanceof java.nio.channels.SocketChannel;	 Catch:{ all -> 0x0040 }
        if (r2 == 0) goto L_0x0043;
    L_0x0030:
        r3 = (java.nio.channels.SocketChannel) r3;	 Catch:{ all -> 0x0040 }
        r2 = r3.isConnected();	 Catch:{ all -> 0x0040 }
        if (r2 != 0) goto L_0x0043;
    L_0x0038:
        r1.cancel();	 Catch:{ all -> 0x0040 }
        r1 = 1;
    L_0x003c:
        r4 = r1;
        goto L_0x000e;
    L_0x003e:
        monitor-exit(r5);	 Catch:{ all -> 0x0040 }
        return r4;
    L_0x0040:
        r1 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x0040 }
        throw r1;
    L_0x0043:
        r1 = r4;
        goto L_0x003c;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.mina.transport.socket.nio.NioProcessor.isBrokenConnection():boolean");
    }

    protected final SessionState getState(NioSession nioSession) {
        SelectionKey selectionKey = nioSession.getSelectionKey();
        if (selectionKey == null) {
            return SessionState.OPENING;
        }
        if (selectionKey.isValid()) {
            return SessionState.OPENED;
        }
        return SessionState.CLOSING;
    }

    protected final boolean isReadable(NioSession nioSession) {
        SelectionKey selectionKey = nioSession.getSelectionKey();
        return selectionKey != null && selectionKey.isValid() && selectionKey.isReadable();
    }

    protected final boolean isWritable(NioSession nioSession) {
        SelectionKey selectionKey = nioSession.getSelectionKey();
        return selectionKey != null && selectionKey.isValid() && selectionKey.isWritable();
    }

    protected final boolean isInterestedInRead(NioSession nioSession) {
        SelectionKey selectionKey = nioSession.getSelectionKey();
        return (selectionKey == null || !selectionKey.isValid() || (selectionKey.interestOps() & 1) == 0) ? false : true;
    }

    protected final boolean isInterestedInWrite(NioSession nioSession) {
        SelectionKey selectionKey = nioSession.getSelectionKey();
        return (selectionKey == null || !selectionKey.isValid() || (selectionKey.interestOps() & 4) == 0) ? false : true;
    }

    protected final void setInterestedInRead(NioSession nioSession, boolean z) {
        SelectionKey selectionKey = nioSession.getSelectionKey();
        if (selectionKey != null && selectionKey.isValid()) {
            int i;
            int interestOps = selectionKey.interestOps();
            if (z) {
                i = interestOps | 1;
            } else {
                i = interestOps & -2;
            }
            if (interestOps != i) {
                selectionKey.interestOps(i);
            }
        }
    }

    protected final void setInterestedInWrite(NioSession nioSession, boolean z) {
        SelectionKey selectionKey = nioSession.getSelectionKey();
        if (selectionKey != null && selectionKey.isValid()) {
            int interestOps = selectionKey.interestOps();
            if (z) {
                interestOps |= 4;
            } else {
                interestOps &= -5;
            }
            selectionKey.interestOps(interestOps);
        }
    }

    protected final int read(NioSession nioSession, IoBuffer ioBuffer) {
        return nioSession.getChannel().read(ioBuffer.buf());
    }

    protected final int write(NioSession nioSession, IoBuffer ioBuffer, int i) {
        if (ioBuffer.remaining() <= i) {
            return nioSession.getChannel().write(ioBuffer.buf());
        }
        int limit = ioBuffer.limit();
        ioBuffer.limit(ioBuffer.position() + i);
        try {
            int write = nioSession.getChannel().write(ioBuffer.buf());
            return write;
        } finally {
            ioBuffer.limit(limit);
        }
    }

    protected final int transferFile(NioSession nioSession, FileRegion fileRegion, int i) {
        try {
            return (int) fileRegion.getFileChannel().transferTo(fileRegion.getPosition(), (long) i, nioSession.getChannel());
        } catch (IOException e) {
            String message = e.getMessage();
            if (message != null && message.contains("temporarily unavailable")) {
                return 0;
            }
            throw e;
        }
    }
}
