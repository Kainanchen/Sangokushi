package org.apache.mina.transport.socket.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.apache.mina.core.polling.AbstractPollingIoConnector;
import org.apache.mina.core.polling.AbstractPollingIoConnector.ConnectionRequest;
import org.apache.mina.core.service.IoProcessor;
import org.apache.mina.core.service.TransportMetadata;
import org.apache.mina.transport.socket.DefaultSocketSessionConfig;
import org.apache.mina.transport.socket.SocketConnector;
import org.apache.mina.transport.socket.SocketSessionConfig;

public final class NioSocketConnector extends AbstractPollingIoConnector<NioSession, SocketChannel> implements SocketConnector {
    private volatile Selector selector;

    private static class SocketChannelIterator implements Iterator<SocketChannel> {
        private final Iterator<SelectionKey> f484i;

        private SocketChannelIterator(Collection<SelectionKey> collection) {
            this.f484i = collection.iterator();
        }

        public boolean hasNext() {
            return this.f484i.hasNext();
        }

        public SocketChannel next() {
            return (SocketChannel) ((SelectionKey) this.f484i.next()).channel();
        }

        public void remove() {
            this.f484i.remove();
        }
    }

    public NioSocketConnector() {
        super(new DefaultSocketSessionConfig(), NioProcessor.class);
        ((DefaultSocketSessionConfig) getSessionConfig()).init(this);
    }

    public NioSocketConnector(int i) {
        super(new DefaultSocketSessionConfig(), NioProcessor.class, i);
        ((DefaultSocketSessionConfig) getSessionConfig()).init(this);
    }

    public NioSocketConnector(IoProcessor<NioSession> ioProcessor) {
        super(new DefaultSocketSessionConfig(), (IoProcessor) ioProcessor);
        ((DefaultSocketSessionConfig) getSessionConfig()).init(this);
    }

    public NioSocketConnector(Executor executor, IoProcessor<NioSession> ioProcessor) {
        super(new DefaultSocketSessionConfig(), executor, (IoProcessor) ioProcessor);
        ((DefaultSocketSessionConfig) getSessionConfig()).init(this);
    }

    public NioSocketConnector(Class<? extends IoProcessor<NioSession>> cls, int i) {
        super(new DefaultSocketSessionConfig(), (Class) cls, i);
    }

    public NioSocketConnector(Class<? extends IoProcessor<NioSession>> cls) {
        super(new DefaultSocketSessionConfig(), (Class) cls);
    }

    protected final void init() {
        this.selector = Selector.open();
    }

    protected final void destroy() {
        if (this.selector != null) {
            this.selector.close();
        }
    }

    public final TransportMetadata getTransportMetadata() {
        return NioSocketSession.METADATA;
    }

    public final SocketSessionConfig getSessionConfig() {
        return (SocketSessionConfig) this.sessionConfig;
    }

    public final InetSocketAddress getDefaultRemoteAddress() {
        return (InetSocketAddress) super.getDefaultRemoteAddress();
    }

    public final void setDefaultRemoteAddress(InetSocketAddress inetSocketAddress) {
        super.setDefaultRemoteAddress(inetSocketAddress);
    }

    protected final Iterator<SocketChannel> allHandles() {
        return new SocketChannelIterator(null);
    }

    protected final boolean connect(SocketChannel socketChannel, SocketAddress socketAddress) {
        return socketChannel.connect(socketAddress);
    }

    protected final ConnectionRequest getConnectionRequest(SocketChannel socketChannel) {
        SelectionKey keyFor = socketChannel.keyFor(this.selector);
        if (keyFor == null || !keyFor.isValid()) {
            return null;
        }
        return (ConnectionRequest) keyFor.attachment();
    }

    protected final void close(SocketChannel socketChannel) {
        SelectionKey keyFor = socketChannel.keyFor(this.selector);
        if (keyFor != null) {
            keyFor.cancel();
        }
        socketChannel.close();
    }

    protected final boolean finishConnect(SocketChannel socketChannel) {
        if (!socketChannel.finishConnect()) {
            return false;
        }
        SelectionKey keyFor = socketChannel.keyFor(this.selector);
        if (keyFor != null) {
            keyFor.cancel();
        }
        return true;
    }

    protected final SocketChannel newHandle(SocketAddress socketAddress) {
        SocketChannel open = SocketChannel.open();
        int receiveBufferSize = getSessionConfig().getReceiveBufferSize();
        if (receiveBufferSize > 65535) {
            open.socket().setReceiveBufferSize(receiveBufferSize);
        }
        if (socketAddress != null) {
            try {
                open.socket().bind(socketAddress);
            } catch (IOException e) {
                Exception iOException = new IOException("Error while binding on " + socketAddress + "\noriginal message : " + e.getMessage());
                iOException.initCause(e.getCause());
                open.close();
                throw iOException;
            }
        }
        open.configureBlocking(false);
        return open;
    }

    protected final NioSession newSession(IoProcessor<NioSession> ioProcessor, SocketChannel socketChannel) {
        return new NioSocketSession(this, ioProcessor, socketChannel);
    }

    protected final void register(SocketChannel socketChannel, ConnectionRequest connectionRequest) {
        socketChannel.register(this.selector, 8, connectionRequest);
    }

    protected final int select(int i) {
        return this.selector.select((long) i);
    }

    protected final Iterator<SocketChannel> selectedHandles() {
        return new SocketChannelIterator(null);
    }

    protected final void wakeup() {
        this.selector.wakeup();
    }
}
