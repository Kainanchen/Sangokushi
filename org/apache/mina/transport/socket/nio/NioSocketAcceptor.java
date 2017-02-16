package org.apache.mina.transport.socket.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.SocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.channels.spi.SelectorProvider;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.apache.mina.core.polling.AbstractPollingIoAcceptor;
import org.apache.mina.core.service.IoProcessor;
import org.apache.mina.core.service.TransportMetadata;
import org.apache.mina.transport.socket.DefaultSocketSessionConfig;
import org.apache.mina.transport.socket.SocketAcceptor;

public final class NioSocketAcceptor extends AbstractPollingIoAcceptor<NioSession, ServerSocketChannel> implements SocketAcceptor {
    private volatile Selector selector;
    private volatile SelectorProvider selectorProvider;

    private static class ServerSocketChannelIterator implements Iterator<ServerSocketChannel> {
        private final Iterator<SelectionKey> iterator;

        private ServerSocketChannelIterator(Collection<SelectionKey> collection) {
            this.iterator = collection.iterator();
        }

        public boolean hasNext() {
            return this.iterator.hasNext();
        }

        public ServerSocketChannel next() {
            SelectionKey selectionKey = (SelectionKey) this.iterator.next();
            if (selectionKey.isValid() && selectionKey.isAcceptable()) {
                return (ServerSocketChannel) selectionKey.channel();
            }
            return null;
        }

        public void remove() {
            this.iterator.remove();
        }
    }

    public NioSocketAcceptor() {
        super(new DefaultSocketSessionConfig(), NioProcessor.class);
        this.selectorProvider = null;
        ((DefaultSocketSessionConfig) getSessionConfig()).init(this);
    }

    public NioSocketAcceptor(int i) {
        super(new DefaultSocketSessionConfig(), NioProcessor.class, i);
        this.selectorProvider = null;
        ((DefaultSocketSessionConfig) getSessionConfig()).init(this);
    }

    public NioSocketAcceptor(IoProcessor<NioSession> ioProcessor) {
        super(new DefaultSocketSessionConfig(), (IoProcessor) ioProcessor);
        this.selectorProvider = null;
        ((DefaultSocketSessionConfig) getSessionConfig()).init(this);
    }

    public NioSocketAcceptor(Executor executor, IoProcessor<NioSession> ioProcessor) {
        super(new DefaultSocketSessionConfig(), executor, (IoProcessor) ioProcessor);
        this.selectorProvider = null;
        ((DefaultSocketSessionConfig) getSessionConfig()).init(this);
    }

    public NioSocketAcceptor(int i, SelectorProvider selectorProvider) {
        super(new DefaultSocketSessionConfig(), NioProcessor.class, i, selectorProvider);
        this.selectorProvider = null;
        ((DefaultSocketSessionConfig) getSessionConfig()).init(this);
        this.selectorProvider = selectorProvider;
    }

    protected final void init() {
        this.selector = Selector.open();
    }

    protected final void init(SelectorProvider selectorProvider) {
        this.selectorProvider = selectorProvider;
        if (selectorProvider == null) {
            this.selector = Selector.open();
        } else {
            this.selector = selectorProvider.openSelector();
        }
    }

    protected final void destroy() {
        if (this.selector != null) {
            this.selector.close();
        }
    }

    public final TransportMetadata getTransportMetadata() {
        return NioSocketSession.METADATA;
    }

    public final InetSocketAddress getLocalAddress() {
        return (InetSocketAddress) super.getLocalAddress();
    }

    public final InetSocketAddress getDefaultLocalAddress() {
        return (InetSocketAddress) super.getDefaultLocalAddress();
    }

    public final void setDefaultLocalAddress(InetSocketAddress inetSocketAddress) {
        setDefaultLocalAddress(inetSocketAddress);
    }

    protected final NioSession accept(IoProcessor<NioSession> ioProcessor, ServerSocketChannel serverSocketChannel) {
        SelectionKey keyFor;
        if (serverSocketChannel != null) {
            keyFor = serverSocketChannel.keyFor(this.selector);
        } else {
            keyFor = null;
        }
        if (keyFor == null || !keyFor.isValid() || !keyFor.isAcceptable()) {
            return null;
        }
        SocketChannel accept = serverSocketChannel.accept();
        if (accept != null) {
            return new NioSocketSession(this, ioProcessor, accept);
        }
        return null;
    }

    protected final ServerSocketChannel open(SocketAddress socketAddress) {
        ServerSocketChannel openServerSocketChannel;
        if (this.selectorProvider != null) {
            openServerSocketChannel = this.selectorProvider.openServerSocketChannel();
        } else {
            openServerSocketChannel = ServerSocketChannel.open();
        }
        try {
            openServerSocketChannel.configureBlocking(false);
            ServerSocket socket = openServerSocketChannel.socket();
            socket.setReuseAddress(isReuseAddress());
            socket.bind(socketAddress, getBacklog());
            openServerSocketChannel.register(this.selector, 16);
            return openServerSocketChannel;
        } catch (IOException e) {
            Exception iOException = new IOException("Error while binding on " + socketAddress + "\noriginal message : " + e.getMessage());
            iOException.initCause(e.getCause());
            openServerSocketChannel.close();
            throw iOException;
        } catch (Throwable th) {
            close(openServerSocketChannel);
        }
    }

    protected final SocketAddress localAddress(ServerSocketChannel serverSocketChannel) {
        return serverSocketChannel.socket().getLocalSocketAddress();
    }

    protected final int select() {
        return this.selector.select();
    }

    protected final Iterator<ServerSocketChannel> selectedHandles() {
        return new ServerSocketChannelIterator(null);
    }

    protected final void close(ServerSocketChannel serverSocketChannel) {
        SelectionKey keyFor = serverSocketChannel.keyFor(this.selector);
        if (keyFor != null) {
            keyFor.cancel();
        }
        serverSocketChannel.close();
    }

    protected final void wakeup() {
        this.selector.wakeup();
    }
}
