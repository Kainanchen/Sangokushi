package org.apache.mina.transport.socket.nio;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.channels.ByteChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import org.apache.mina.core.RuntimeIoException;
import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.file.FileRegion;
import org.apache.mina.core.filterchain.IoFilter;
import org.apache.mina.core.service.DefaultTransportMetadata;
import org.apache.mina.core.service.IoProcessor;
import org.apache.mina.core.service.IoService;
import org.apache.mina.core.service.TransportMetadata;
import org.apache.mina.filter.ssl.SslFilter;
import org.apache.mina.transport.socket.AbstractSocketSessionConfig;
import org.apache.mina.transport.socket.SocketSessionConfig;

class NioSocketSession extends NioSession {
    static final TransportMetadata METADATA;

    private class SessionConfigImpl extends AbstractSocketSessionConfig {
        private SessionConfigImpl() {
        }

        public boolean isKeepAlive() {
            try {
                return NioSocketSession.this.getSocket().getKeepAlive();
            } catch (Throwable e) {
                throw new RuntimeIoException(e);
            }
        }

        public void setKeepAlive(boolean z) {
            try {
                NioSocketSession.this.getSocket().setKeepAlive(z);
            } catch (Throwable e) {
                throw new RuntimeIoException(e);
            }
        }

        public boolean isOobInline() {
            try {
                return NioSocketSession.this.getSocket().getOOBInline();
            } catch (Throwable e) {
                throw new RuntimeIoException(e);
            }
        }

        public void setOobInline(boolean z) {
            try {
                NioSocketSession.this.getSocket().setOOBInline(z);
            } catch (Throwable e) {
                throw new RuntimeIoException(e);
            }
        }

        public boolean isReuseAddress() {
            try {
                return NioSocketSession.this.getSocket().getReuseAddress();
            } catch (Throwable e) {
                throw new RuntimeIoException(e);
            }
        }

        public void setReuseAddress(boolean z) {
            try {
                NioSocketSession.this.getSocket().setReuseAddress(z);
            } catch (Throwable e) {
                throw new RuntimeIoException(e);
            }
        }

        public int getSoLinger() {
            try {
                return NioSocketSession.this.getSocket().getSoLinger();
            } catch (Throwable e) {
                throw new RuntimeIoException(e);
            }
        }

        public void setSoLinger(int i) {
            if (i < 0) {
                try {
                    NioSocketSession.this.getSocket().setSoLinger(false, 0);
                    return;
                } catch (Throwable e) {
                    throw new RuntimeIoException(e);
                }
            }
            NioSocketSession.this.getSocket().setSoLinger(true, i);
        }

        public boolean isTcpNoDelay() {
            if (!NioSocketSession.this.isConnected()) {
                return false;
            }
            try {
                return NioSocketSession.this.getSocket().getTcpNoDelay();
            } catch (Throwable e) {
                throw new RuntimeIoException(e);
            }
        }

        public void setTcpNoDelay(boolean z) {
            try {
                NioSocketSession.this.getSocket().setTcpNoDelay(z);
            } catch (Throwable e) {
                throw new RuntimeIoException(e);
            }
        }

        public int getTrafficClass() {
            try {
                return NioSocketSession.this.getSocket().getTrafficClass();
            } catch (Throwable e) {
                throw new RuntimeIoException(e);
            }
        }

        public void setTrafficClass(int i) {
            try {
                NioSocketSession.this.getSocket().setTrafficClass(i);
            } catch (Throwable e) {
                throw new RuntimeIoException(e);
            }
        }

        public int getSendBufferSize() {
            try {
                return NioSocketSession.this.getSocket().getSendBufferSize();
            } catch (Throwable e) {
                throw new RuntimeIoException(e);
            }
        }

        public void setSendBufferSize(int i) {
            try {
                NioSocketSession.this.getSocket().setSendBufferSize(i);
            } catch (Throwable e) {
                throw new RuntimeIoException(e);
            }
        }

        public int getReceiveBufferSize() {
            try {
                return NioSocketSession.this.getSocket().getReceiveBufferSize();
            } catch (Throwable e) {
                throw new RuntimeIoException(e);
            }
        }

        public void setReceiveBufferSize(int i) {
            try {
                NioSocketSession.this.getSocket().setReceiveBufferSize(i);
            } catch (Throwable e) {
                throw new RuntimeIoException(e);
            }
        }
    }

    static {
        METADATA = new DefaultTransportMetadata("nio", "socket", false, true, InetSocketAddress.class, SocketSessionConfig.class, IoBuffer.class, FileRegion.class);
    }

    public NioSocketSession(IoService ioService, IoProcessor<NioSession> ioProcessor, SocketChannel socketChannel) {
        super(ioProcessor, ioService, socketChannel);
        this.config = new SessionConfigImpl();
        this.config.setAll(ioService.getSessionConfig());
    }

    private Socket getSocket() {
        return ((SocketChannel) this.channel).socket();
    }

    public TransportMetadata getTransportMetadata() {
        return METADATA;
    }

    public SocketSessionConfig getConfig() {
        return (SocketSessionConfig) this.config;
    }

    SocketChannel getChannel() {
        return (SocketChannel) this.channel;
    }

    public InetSocketAddress getRemoteAddress() {
        if (this.channel == null) {
            return null;
        }
        Socket socket = getSocket();
        if (socket != null) {
            return (InetSocketAddress) socket.getRemoteSocketAddress();
        }
        return null;
    }

    public InetSocketAddress getLocalAddress() {
        if (this.channel == null) {
            return null;
        }
        Socket socket = getSocket();
        if (socket != null) {
            return (InetSocketAddress) socket.getLocalSocketAddress();
        }
        return null;
    }

    protected void destroy(NioSession nioSession) {
        ByteChannel channel = nioSession.getChannel();
        SelectionKey selectionKey = nioSession.getSelectionKey();
        if (selectionKey != null) {
            selectionKey.cancel();
        }
        channel.close();
    }

    public InetSocketAddress getServiceAddress() {
        return (InetSocketAddress) super.getServiceAddress();
    }

    public final boolean isSecured() {
        IoFilter ioFilter = getFilterChain().get(SslFilter.class);
        if (ioFilter != null) {
            return ((SslFilter) ioFilter).isSslStarted(this);
        }
        return false;
    }
}
