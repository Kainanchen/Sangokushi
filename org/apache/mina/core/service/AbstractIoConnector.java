package org.apache.mina.core.service;

import java.net.SocketAddress;
import java.util.concurrent.Executor;
import org.apache.mina.core.future.ConnectFuture;
import org.apache.mina.core.future.IoFuture;
import org.apache.mina.core.future.IoFutureListener;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.core.session.IoSessionConfig;
import org.apache.mina.core.session.IoSessionInitializer;
import org.cocos2dx.lib.GameControllerDelegate;

public abstract class AbstractIoConnector extends AbstractIoService implements IoConnector {
    private long connectTimeoutCheckInterval;
    private long connectTimeoutInMillis;
    private SocketAddress defaultLocalAddress;
    private SocketAddress defaultRemoteAddress;

    /* renamed from: org.apache.mina.core.service.AbstractIoConnector.1 */
    class C04111 implements IoHandler {
        C04111() {
        }

        public void exceptionCaught(IoSession ioSession, Throwable th) {
        }

        public void messageReceived(IoSession ioSession, Object obj) {
        }

        public void messageSent(IoSession ioSession, Object obj) {
        }

        public void sessionClosed(IoSession ioSession) {
        }

        public void sessionCreated(IoSession ioSession) {
        }

        public void sessionIdle(IoSession ioSession, IdleStatus idleStatus) {
        }

        public void sessionOpened(IoSession ioSession) {
        }

        public void inputClosed(IoSession ioSession) {
        }
    }

    /* renamed from: org.apache.mina.core.service.AbstractIoConnector.2 */
    class C04122 implements IoFutureListener<ConnectFuture> {
        final /* synthetic */ IoSession val$session;

        C04122(IoSession ioSession) {
            this.val$session = ioSession;
        }

        public void operationComplete(ConnectFuture connectFuture) {
            if (connectFuture.isCanceled()) {
                this.val$session.closeNow();
            }
        }
    }

    public abstract ConnectFuture connect0(SocketAddress socketAddress, SocketAddress socketAddress2, IoSessionInitializer<? extends ConnectFuture> ioSessionInitializer);

    public AbstractIoConnector(IoSessionConfig ioSessionConfig, Executor executor) {
        super(ioSessionConfig, executor);
        this.connectTimeoutCheckInterval = 50;
        this.connectTimeoutInMillis = 60000;
    }

    public long getConnectTimeoutCheckInterval() {
        return this.connectTimeoutCheckInterval;
    }

    public void setConnectTimeoutCheckInterval(long j) {
        if (getConnectTimeoutMillis() < j) {
            this.connectTimeoutInMillis = j;
        }
        this.connectTimeoutCheckInterval = j;
    }

    public final int getConnectTimeout() {
        return ((int) this.connectTimeoutInMillis) / GameControllerDelegate.THUMBSTICK_LEFT_X;
    }

    public final long getConnectTimeoutMillis() {
        return this.connectTimeoutInMillis;
    }

    public final void setConnectTimeout(int i) {
        setConnectTimeoutMillis(((long) i) * 1000);
    }

    public final void setConnectTimeoutMillis(long j) {
        if (j <= this.connectTimeoutCheckInterval) {
            this.connectTimeoutCheckInterval = j;
        }
        this.connectTimeoutInMillis = j;
    }

    public SocketAddress getDefaultRemoteAddress() {
        return this.defaultRemoteAddress;
    }

    public final void setDefaultLocalAddress(SocketAddress socketAddress) {
        this.defaultLocalAddress = socketAddress;
    }

    public final SocketAddress getDefaultLocalAddress() {
        return this.defaultLocalAddress;
    }

    public final void setDefaultRemoteAddress(SocketAddress socketAddress) {
        if (socketAddress == null) {
            throw new IllegalArgumentException("defaultRemoteAddress");
        } else if (getTransportMetadata().getAddressType().isAssignableFrom(socketAddress.getClass())) {
            this.defaultRemoteAddress = socketAddress;
        } else {
            throw new IllegalArgumentException("defaultRemoteAddress type: " + socketAddress.getClass() + " (expected: " + getTransportMetadata().getAddressType() + ")");
        }
    }

    public final ConnectFuture connect() {
        SocketAddress defaultRemoteAddress = getDefaultRemoteAddress();
        if (defaultRemoteAddress != null) {
            return connect(defaultRemoteAddress, null, null);
        }
        throw new IllegalStateException("defaultRemoteAddress is not set.");
    }

    public ConnectFuture connect(IoSessionInitializer<? extends ConnectFuture> ioSessionInitializer) {
        SocketAddress defaultRemoteAddress = getDefaultRemoteAddress();
        if (defaultRemoteAddress != null) {
            return connect(defaultRemoteAddress, null, ioSessionInitializer);
        }
        throw new IllegalStateException("defaultRemoteAddress is not set.");
    }

    public final ConnectFuture connect(SocketAddress socketAddress) {
        return connect(socketAddress, null, null);
    }

    public ConnectFuture connect(SocketAddress socketAddress, IoSessionInitializer<? extends ConnectFuture> ioSessionInitializer) {
        return connect(socketAddress, null, ioSessionInitializer);
    }

    public ConnectFuture connect(SocketAddress socketAddress, SocketAddress socketAddress2) {
        return connect(socketAddress, socketAddress2, null);
    }

    public final ConnectFuture connect(SocketAddress socketAddress, SocketAddress socketAddress2, IoSessionInitializer<? extends ConnectFuture> ioSessionInitializer) {
        if (isDisposing()) {
            throw new IllegalStateException("The connector is being disposed.");
        } else if (socketAddress == null) {
            throw new IllegalArgumentException("remoteAddress");
        } else if (!getTransportMetadata().getAddressType().isAssignableFrom(socketAddress.getClass())) {
            throw new IllegalArgumentException("remoteAddress type: " + socketAddress.getClass() + " (expected: " + getTransportMetadata().getAddressType() + ")");
        } else if (socketAddress2 == null || getTransportMetadata().getAddressType().isAssignableFrom(socketAddress2.getClass())) {
            if (getHandler() == null) {
                if (getSessionConfig().isUseReadOperation()) {
                    setHandler(new C04111());
                } else {
                    throw new IllegalStateException("handler is not set.");
                }
            }
            return connect0(socketAddress, socketAddress2, ioSessionInitializer);
        } else {
            throw new IllegalArgumentException("localAddress type: " + socketAddress2.getClass() + " (expected: " + getTransportMetadata().getAddressType() + ")");
        }
    }

    protected final void finishSessionInitialization0(IoSession ioSession, IoFuture ioFuture) {
        ioFuture.addListener(new C04122(ioSession));
    }

    public String toString() {
        TransportMetadata transportMetadata = getTransportMetadata();
        return "(" + transportMetadata.getProviderName() + ' ' + transportMetadata.getName() + " connector: managedSessionCount: " + getManagedSessionCount() + ')';
    }
}
