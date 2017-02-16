package org.apache.mina.transport.vmpipe;

import java.io.IOException;
import java.net.SocketAddress;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import org.apache.mina.core.future.IoFuture;
import org.apache.mina.core.service.AbstractIoAcceptor;
import org.apache.mina.core.service.TransportMetadata;
import org.apache.mina.core.session.IdleStatusChecker;
import org.apache.mina.core.session.IoSession;

public final class VmPipeAcceptor extends AbstractIoAcceptor {
    static final Map<VmPipeAddress, VmPipe> boundHandlers;
    private IdleStatusChecker idleChecker;

    static {
        boundHandlers = new HashMap();
    }

    public VmPipeAcceptor() {
        this(null);
    }

    public VmPipeAcceptor(Executor executor) {
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

    public final VmPipeAddress getLocalAddress() {
        return (VmPipeAddress) super.getLocalAddress();
    }

    public final VmPipeAddress getDefaultLocalAddress() {
        return (VmPipeAddress) super.getDefaultLocalAddress();
    }

    public final void setDefaultLocalAddress(VmPipeAddress vmPipeAddress) {
        super.setDefaultLocalAddress(vmPipeAddress);
    }

    protected final void dispose0() {
        this.idleChecker.getNotifyingTask().cancel();
        unbind();
    }

    protected final Set<SocketAddress> bindInternal(List<? extends SocketAddress> list) {
        Set<SocketAddress> hashSet = new HashSet();
        synchronized (boundHandlers) {
            for (SocketAddress socketAddress : list) {
                Object obj = (VmPipeAddress) socketAddress;
                if (obj == null || obj.getPort() == 0) {
                    for (int i = 10000; i < Integer.MAX_VALUE; i++) {
                        obj = new VmPipeAddress(i);
                        if (!boundHandlers.containsKey(obj) && !hashSet.contains(obj)) {
                            break;
                        }
                    }
                    obj = null;
                    if (obj == null) {
                        throw new IOException("No port available.");
                    }
                } else if (obj.getPort() < 0) {
                    throw new IOException("Bind port number must be 0 or above.");
                } else if (boundHandlers.containsKey(obj)) {
                    throw new IOException("Address already bound: " + obj);
                }
                hashSet.add(obj);
            }
            for (SocketAddress socketAddress2 : hashSet) {
                VmPipeAddress vmPipeAddress = (VmPipeAddress) socketAddress2;
                if (boundHandlers.containsKey(vmPipeAddress)) {
                    for (SocketAddress remove : hashSet) {
                        boundHandlers.remove(remove);
                    }
                    throw new IOException("Duplicate local address: " + socketAddress2);
                }
                boundHandlers.put(vmPipeAddress, new VmPipe(this, vmPipeAddress, getHandler(), getListeners()));
            }
        }
        return hashSet;
    }

    protected final void unbind0(List<? extends SocketAddress> list) {
        synchronized (boundHandlers) {
            for (SocketAddress remove : list) {
                boundHandlers.remove(remove);
            }
        }
    }

    public final IoSession newSession(SocketAddress socketAddress, SocketAddress socketAddress2) {
        throw new UnsupportedOperationException();
    }

    final void doFinishSessionInitialization(IoSession ioSession, IoFuture ioFuture) {
        initSession(ioSession, ioFuture, null);
    }
}
