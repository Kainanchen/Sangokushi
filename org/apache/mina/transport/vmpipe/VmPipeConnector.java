package org.apache.mina.transport.vmpipe;

import java.io.IOException;
import java.net.SocketAddress;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import org.apache.mina.core.future.ConnectFuture;
import org.apache.mina.core.future.DefaultConnectFuture;
import org.apache.mina.core.future.IoFuture;
import org.apache.mina.core.future.IoFutureListener;
import org.apache.mina.core.service.AbstractIoConnector;
import org.apache.mina.core.service.TransportMetadata;
import org.apache.mina.core.session.IdleStatusChecker;
import org.apache.mina.core.session.IoSessionInitializer;
import org.apache.mina.util.ExceptionMonitor;

public final class VmPipeConnector extends AbstractIoConnector {
    private static final IoFutureListener<IoFuture> LOCAL_ADDRESS_RECLAIMER;
    private static final Set<VmPipeAddress> TAKEN_LOCAL_ADDRESSES;
    private static int nextLocalPort;
    private IdleStatusChecker idleChecker;

    private static class LocalAddressReclaimer implements IoFutureListener<IoFuture> {
        private LocalAddressReclaimer() {
        }

        public void operationComplete(IoFuture ioFuture) {
            synchronized (VmPipeConnector.TAKEN_LOCAL_ADDRESSES) {
                VmPipeConnector.TAKEN_LOCAL_ADDRESSES.remove(ioFuture.getSession().getLocalAddress());
            }
        }
    }

    public VmPipeConnector() {
        this(null);
    }

    public VmPipeConnector(Executor executor) {
        super(new DefaultVmPipeSessionConfig(), executor);
        this.idleChecker = new IdleStatusChecker();
        executeWorker(this.idleChecker.getNotifyingTask(), "idleStatusChecker");
    }

    public final TransportMetadata getTransportMetadata() {
        return VmPipeSession.METADATA;
    }

    public final VmPipeSessionConfig getSessionConfig() {
        return (VmPipeSessionConfig) this.sessionConfig;
    }

    protected final ConnectFuture connect0(SocketAddress socketAddress, SocketAddress socketAddress2, IoSessionInitializer<? extends ConnectFuture> ioSessionInitializer) {
        VmPipe vmPipe = (VmPipe) VmPipeAcceptor.boundHandlers.get(socketAddress);
        if (vmPipe == null) {
            return DefaultConnectFuture.newFailedFuture(new IOException("Endpoint unavailable: " + socketAddress));
        }
        ConnectFuture defaultConnectFuture = new DefaultConnectFuture();
        try {
            VmPipeSession vmPipeSession = new VmPipeSession(this, getListeners(), nextLocalAddress(), getHandler(), vmPipe);
            initSession(vmPipeSession, defaultConnectFuture, ioSessionInitializer);
            vmPipeSession.getCloseFuture().addListener(LOCAL_ADDRESS_RECLAIMER);
            try {
                getFilterChainBuilder().buildFilterChain(vmPipeSession.getFilterChain());
                getListeners().fireSessionCreated(vmPipeSession);
                this.idleChecker.addSession(vmPipeSession);
                VmPipeSession remoteSession = vmPipeSession.getRemoteSession();
                ((VmPipeAcceptor) remoteSession.getService()).doFinishSessionInitialization(remoteSession, null);
                try {
                    vmPipe.getAcceptor().getFilterChainBuilder().buildFilterChain(remoteSession.getFilterChain());
                    vmPipe.getListeners().fireSessionCreated(remoteSession);
                    this.idleChecker.addSession(remoteSession);
                } catch (Throwable e) {
                    ExceptionMonitor.getInstance().exceptionCaught(e);
                    remoteSession.closeNow();
                }
                ((VmPipeFilterChain) vmPipeSession.getFilterChain()).start();
                ((VmPipeFilterChain) remoteSession.getFilterChain()).start();
                return defaultConnectFuture;
            } catch (Throwable e2) {
                defaultConnectFuture.setException(e2);
                return defaultConnectFuture;
            }
        } catch (Throwable e22) {
            return DefaultConnectFuture.newFailedFuture(e22);
        }
    }

    protected final void dispose0() {
        this.idleChecker.getNotifyingTask().cancel();
    }

    static {
        TAKEN_LOCAL_ADDRESSES = new HashSet();
        nextLocalPort = -1;
        LOCAL_ADDRESS_RECLAIMER = new LocalAddressReclaimer();
    }

    private static VmPipeAddress nextLocalAddress() {
        synchronized (TAKEN_LOCAL_ADDRESSES) {
            if (nextLocalPort >= 0) {
                nextLocalPort = -1;
            }
            int i = 0;
            while (i < Integer.MAX_VALUE) {
                int i2 = nextLocalPort;
                nextLocalPort = i2 - 1;
                VmPipeAddress vmPipeAddress = new VmPipeAddress(i2);
                if (TAKEN_LOCAL_ADDRESSES.contains(vmPipeAddress)) {
                    i++;
                } else {
                    TAKEN_LOCAL_ADDRESSES.add(vmPipeAddress);
                    return vmPipeAddress;
                }
            }
            throw new IOException("Can't assign a local VM pipe port.");
        }
    }
}
