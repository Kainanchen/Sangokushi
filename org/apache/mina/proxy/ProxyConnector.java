package org.apache.mina.proxy;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.concurrent.Executor;
import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.file.FileRegion;
import org.apache.mina.core.future.ConnectFuture;
import org.apache.mina.core.future.DefaultConnectFuture;
import org.apache.mina.core.service.AbstractIoConnector;
import org.apache.mina.core.service.DefaultTransportMetadata;
import org.apache.mina.core.service.IoHandler;
import org.apache.mina.core.service.TransportMetadata;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.core.session.IoSessionConfig;
import org.apache.mina.core.session.IoSessionInitializer;
import org.apache.mina.proxy.filter.ProxyFilter;
import org.apache.mina.proxy.handlers.socks.SocksProxyRequest;
import org.apache.mina.proxy.session.ProxyIoSession;
import org.apache.mina.proxy.session.ProxyIoSessionInitializer;
import org.apache.mina.transport.socket.DefaultSocketSessionConfig;
import org.apache.mina.transport.socket.SocketConnector;
import org.apache.mina.transport.socket.SocketSessionConfig;

public class ProxyConnector extends AbstractIoConnector {
    private static final TransportMetadata METADATA;
    private SocketConnector connector;
    private DefaultConnectFuture future;
    private final ProxyFilter proxyFilter;
    private ProxyIoSession proxyIoSession;

    static {
        METADATA = new DefaultTransportMetadata("proxy", "proxyconnector", false, true, InetSocketAddress.class, SocketSessionConfig.class, IoBuffer.class, FileRegion.class);
    }

    public ProxyConnector() {
        super(new DefaultSocketSessionConfig(), null);
        this.connector = null;
        this.proxyFilter = new ProxyFilter();
    }

    public ProxyConnector(SocketConnector socketConnector) {
        this(socketConnector, new DefaultSocketSessionConfig(), null);
    }

    public ProxyConnector(SocketConnector socketConnector, IoSessionConfig ioSessionConfig, Executor executor) {
        super(ioSessionConfig, executor);
        this.connector = null;
        this.proxyFilter = new ProxyFilter();
        setConnector(socketConnector);
    }

    public IoSessionConfig getSessionConfig() {
        return this.connector.getSessionConfig();
    }

    public ProxyIoSession getProxyIoSession() {
        return this.proxyIoSession;
    }

    public void setProxyIoSession(ProxyIoSession proxyIoSession) {
        if (proxyIoSession == null) {
            throw new IllegalArgumentException("proxySession object cannot be null");
        } else if (proxyIoSession.getProxyAddress() == null) {
            throw new IllegalArgumentException("proxySession.proxyAddress cannot be null");
        } else {
            proxyIoSession.setConnector(this);
            setDefaultRemoteAddress(proxyIoSession.getProxyAddress());
            this.proxyIoSession = proxyIoSession;
        }
    }

    protected ConnectFuture connect0(SocketAddress socketAddress, SocketAddress socketAddress2, IoSessionInitializer<? extends ConnectFuture> ioSessionInitializer) {
        if (!this.proxyIoSession.isReconnectionNeeded()) {
            IoHandler handler = getHandler();
            if (handler instanceof AbstractProxyIoHandler) {
                this.connector.setHandler(handler);
                this.future = new DefaultConnectFuture();
            } else {
                throw new IllegalArgumentException("IoHandler must be an instance of AbstractProxyIoHandler");
            }
        }
        ConnectFuture connect = this.connector.connect(this.proxyIoSession.getProxyAddress(), new ProxyIoSessionInitializer(ioSessionInitializer, this.proxyIoSession));
        return ((this.proxyIoSession.getRequest() instanceof SocksProxyRequest) || this.proxyIoSession.isReconnectionNeeded()) ? connect : this.future;
    }

    public void cancelConnectFuture() {
        this.future.cancel();
    }

    protected ConnectFuture fireConnected(IoSession ioSession) {
        this.future.setSession(ioSession);
        return this.future;
    }

    public final SocketConnector getConnector() {
        return this.connector;
    }

    private void setConnector(SocketConnector socketConnector) {
        if (socketConnector == null) {
            throw new IllegalArgumentException("connector cannot be null");
        }
        this.connector = socketConnector;
        String name = ProxyFilter.class.getName();
        if (socketConnector.getFilterChain().contains(name)) {
            socketConnector.getFilterChain().remove(name);
        }
        socketConnector.getFilterChain().addFirst(name, this.proxyFilter);
    }

    protected void dispose0() {
        if (this.connector != null) {
            this.connector.dispose();
        }
    }

    public TransportMetadata getTransportMetadata() {
        return METADATA;
    }
}
