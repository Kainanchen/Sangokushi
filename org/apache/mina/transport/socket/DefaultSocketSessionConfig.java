package org.apache.mina.transport.socket;

import org.apache.mina.core.service.IoService;

public class DefaultSocketSessionConfig extends AbstractSocketSessionConfig {
    private static final boolean DEFAULT_KEEP_ALIVE = false;
    private static final boolean DEFAULT_OOB_INLINE = false;
    private static final boolean DEFAULT_REUSE_ADDRESS = false;
    private static final int DEFAULT_SO_LINGER = -1;
    private static final boolean DEFAULT_TCP_NO_DELAY = false;
    private static final int DEFAULT_TRAFFIC_CLASS = 0;
    private boolean defaultReuseAddress;
    private boolean keepAlive;
    private boolean oobInline;
    protected IoService parent;
    private int receiveBufferSize;
    private boolean reuseAddress;
    private int sendBufferSize;
    private int soLinger;
    private boolean tcpNoDelay;
    private int trafficClass;

    public DefaultSocketSessionConfig() {
        this.receiveBufferSize = DEFAULT_SO_LINGER;
        this.sendBufferSize = DEFAULT_SO_LINGER;
        this.trafficClass = 0;
        this.keepAlive = DEFAULT_REUSE_ADDRESS;
        this.oobInline = DEFAULT_REUSE_ADDRESS;
        this.soLinger = DEFAULT_SO_LINGER;
        this.tcpNoDelay = DEFAULT_REUSE_ADDRESS;
    }

    public void init(IoService ioService) {
        this.parent = ioService;
        if (ioService instanceof SocketAcceptor) {
            this.defaultReuseAddress = true;
        } else {
            this.defaultReuseAddress = DEFAULT_REUSE_ADDRESS;
        }
        this.reuseAddress = this.defaultReuseAddress;
    }

    public boolean isReuseAddress() {
        return this.reuseAddress;
    }

    public void setReuseAddress(boolean z) {
        this.reuseAddress = z;
    }

    public int getReceiveBufferSize() {
        return this.receiveBufferSize;
    }

    public void setReceiveBufferSize(int i) {
        this.receiveBufferSize = i;
    }

    public int getSendBufferSize() {
        return this.sendBufferSize;
    }

    public void setSendBufferSize(int i) {
        this.sendBufferSize = i;
    }

    public int getTrafficClass() {
        return this.trafficClass;
    }

    public void setTrafficClass(int i) {
        this.trafficClass = i;
    }

    public boolean isKeepAlive() {
        return this.keepAlive;
    }

    public void setKeepAlive(boolean z) {
        this.keepAlive = z;
    }

    public boolean isOobInline() {
        return this.oobInline;
    }

    public void setOobInline(boolean z) {
        this.oobInline = z;
    }

    public int getSoLinger() {
        return this.soLinger;
    }

    public void setSoLinger(int i) {
        this.soLinger = i;
    }

    public boolean isTcpNoDelay() {
        return this.tcpNoDelay;
    }

    public void setTcpNoDelay(boolean z) {
        this.tcpNoDelay = z;
    }

    protected boolean isKeepAliveChanged() {
        return this.keepAlive ? true : DEFAULT_REUSE_ADDRESS;
    }

    protected boolean isOobInlineChanged() {
        return this.oobInline ? true : DEFAULT_REUSE_ADDRESS;
    }

    protected boolean isReceiveBufferSizeChanged() {
        return this.receiveBufferSize != DEFAULT_SO_LINGER ? true : DEFAULT_REUSE_ADDRESS;
    }

    protected boolean isReuseAddressChanged() {
        return this.reuseAddress != this.defaultReuseAddress ? true : DEFAULT_REUSE_ADDRESS;
    }

    protected boolean isSendBufferSizeChanged() {
        return this.sendBufferSize != DEFAULT_SO_LINGER ? true : DEFAULT_REUSE_ADDRESS;
    }

    protected boolean isSoLingerChanged() {
        return this.soLinger != DEFAULT_SO_LINGER ? true : DEFAULT_REUSE_ADDRESS;
    }

    protected boolean isTcpNoDelayChanged() {
        return this.tcpNoDelay ? true : DEFAULT_REUSE_ADDRESS;
    }

    protected boolean isTrafficClassChanged() {
        return this.trafficClass != 0 ? true : DEFAULT_REUSE_ADDRESS;
    }
}
