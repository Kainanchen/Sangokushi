package org.apache.mina.core.session;

import java.net.SocketAddress;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import org.apache.mina.core.file.FileRegion;
import org.apache.mina.core.filterchain.DefaultIoFilterChain;
import org.apache.mina.core.filterchain.IoFilterChain;
import org.apache.mina.core.service.AbstractIoAcceptor;
import org.apache.mina.core.service.DefaultTransportMetadata;
import org.apache.mina.core.service.IoHandler;
import org.apache.mina.core.service.IoHandlerAdapter;
import org.apache.mina.core.service.IoProcessor;
import org.apache.mina.core.service.IoService;
import org.apache.mina.core.service.TransportMetadata;
import org.apache.mina.core.write.WriteRequest;

public class DummySession extends AbstractIoSession {
    private static final SocketAddress ANONYMOUS_ADDRESS;
    private static final TransportMetadata TRANSPORT_METADATA;
    private volatile IoSessionConfig config;
    private final IoFilterChain filterChain;
    private volatile IoHandler handler;
    private volatile SocketAddress localAddress;
    private final IoProcessor<IoSession> processor;
    private volatile SocketAddress remoteAddress;
    private volatile IoService service;
    private volatile TransportMetadata transportMetadata;

    /* renamed from: org.apache.mina.core.session.DummySession.1 */
    static class C04171 extends SocketAddress {
        private static final long serialVersionUID = -496112902353454179L;

        C04171() {
        }

        public final String toString() {
            return "?";
        }
    }

    /* renamed from: org.apache.mina.core.session.DummySession.2 */
    class C04182 extends AbstractIoSessionConfig {
        C04182() {
        }
    }

    /* renamed from: org.apache.mina.core.session.DummySession.3 */
    class C04193 extends AbstractIoSessionConfig {
        C04193() {
        }
    }

    /* renamed from: org.apache.mina.core.session.DummySession.4 */
    class C04204 implements Executor {
        C04204() {
        }

        public void execute(Runnable runnable) {
        }
    }

    /* renamed from: org.apache.mina.core.session.DummySession.5 */
    class C04215 extends AbstractIoAcceptor {
        C04215(IoSessionConfig ioSessionConfig, Executor executor) {
            super(ioSessionConfig, executor);
        }

        protected Set<SocketAddress> bindInternal(List<? extends SocketAddress> list) {
            throw new UnsupportedOperationException();
        }

        protected void unbind0(List<? extends SocketAddress> list) {
            throw new UnsupportedOperationException();
        }

        public TransportMetadata getTransportMetadata() {
            return DummySession.TRANSPORT_METADATA;
        }

        protected void dispose0() {
        }

        public IoSessionConfig getSessionConfig() {
            return this.sessionConfig;
        }
    }

    /* renamed from: org.apache.mina.core.session.DummySession.6 */
    class C04226 implements IoProcessor<IoSession> {
        C04226() {
        }

        public void add(IoSession ioSession) {
        }

        public void flush(IoSession ioSession) {
            DummySession dummySession = (DummySession) ioSession;
            WriteRequest poll = dummySession.getWriteRequestQueue().poll(ioSession);
            if (poll != null) {
                Object message = poll.getMessage();
                if (message instanceof FileRegion) {
                    FileRegion fileRegion = (FileRegion) message;
                    try {
                        fileRegion.getFileChannel().position(fileRegion.getPosition() + fileRegion.getRemainingBytes());
                        fileRegion.update(fileRegion.getRemainingBytes());
                    } catch (Throwable e) {
                        dummySession.getFilterChain().fireExceptionCaught(e);
                    }
                }
                DummySession.this.getFilterChain().fireMessageSent(poll);
            }
        }

        public void write(IoSession ioSession, WriteRequest writeRequest) {
            ioSession.getWriteRequestQueue().offer(ioSession, writeRequest);
            if (!ioSession.isWriteSuspended()) {
                flush(ioSession);
            }
        }

        public void remove(IoSession ioSession) {
            if (!ioSession.getCloseFuture().isClosed()) {
                ioSession.getFilterChain().fireSessionClosed();
            }
        }

        public void updateTrafficControl(IoSession ioSession) {
        }

        public void dispose() {
        }

        public boolean isDisposed() {
            return false;
        }

        public boolean isDisposing() {
            return false;
        }
    }

    static {
        boolean z = false;
        TRANSPORT_METADATA = new DefaultTransportMetadata("mina", "dummy", false, z, SocketAddress.class, IoSessionConfig.class, Object.class);
        ANONYMOUS_ADDRESS = new C04171();
    }

    public DummySession() {
        super(new C04215(new C04193(), new C04204()));
        this.config = new C04182();
        this.filterChain = new DefaultIoFilterChain(this);
        this.handler = new IoHandlerAdapter();
        this.localAddress = ANONYMOUS_ADDRESS;
        this.remoteAddress = ANONYMOUS_ADDRESS;
        this.transportMetadata = TRANSPORT_METADATA;
        this.processor = new C04226();
        this.service = super.getService();
        try {
            IoSessionDataStructureFactory defaultIoSessionDataStructureFactory = new DefaultIoSessionDataStructureFactory();
            setAttributeMap(defaultIoSessionDataStructureFactory.getAttributeMap(this));
            setWriteRequestQueue(defaultIoSessionDataStructureFactory.getWriteRequestQueue(this));
        } catch (Exception e) {
            throw new InternalError();
        }
    }

    public IoSessionConfig getConfig() {
        return this.config;
    }

    public void setConfig(IoSessionConfig ioSessionConfig) {
        if (ioSessionConfig == null) {
            throw new IllegalArgumentException("config");
        }
        this.config = ioSessionConfig;
    }

    public IoFilterChain getFilterChain() {
        return this.filterChain;
    }

    public IoHandler getHandler() {
        return this.handler;
    }

    public void setHandler(IoHandler ioHandler) {
        if (ioHandler == null) {
            throw new IllegalArgumentException("handler");
        }
        this.handler = ioHandler;
    }

    public SocketAddress getLocalAddress() {
        return this.localAddress;
    }

    public SocketAddress getRemoteAddress() {
        return this.remoteAddress;
    }

    public void setLocalAddress(SocketAddress socketAddress) {
        if (socketAddress == null) {
            throw new IllegalArgumentException("localAddress");
        }
        this.localAddress = socketAddress;
    }

    public void setRemoteAddress(SocketAddress socketAddress) {
        if (socketAddress == null) {
            throw new IllegalArgumentException("remoteAddress");
        }
        this.remoteAddress = socketAddress;
    }

    public IoService getService() {
        return this.service;
    }

    public void setService(IoService ioService) {
        if (ioService == null) {
            throw new IllegalArgumentException("service");
        }
        this.service = ioService;
    }

    public final IoProcessor<IoSession> getProcessor() {
        return this.processor;
    }

    public TransportMetadata getTransportMetadata() {
        return this.transportMetadata;
    }

    public void setTransportMetadata(TransportMetadata transportMetadata) {
        if (transportMetadata == null) {
            throw new IllegalArgumentException("transportMetadata");
        }
        this.transportMetadata = transportMetadata;
    }

    public void setScheduledWriteBytes(int i) {
        super.setScheduledWriteBytes(i);
    }

    public void setScheduledWriteMessages(int i) {
        super.setScheduledWriteMessages(i);
    }

    public void updateThroughput(boolean z) {
        super.updateThroughput(System.currentTimeMillis(), z);
    }
}
