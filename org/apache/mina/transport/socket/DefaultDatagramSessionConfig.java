package org.apache.mina.transport.socket;

public class DefaultDatagramSessionConfig extends AbstractDatagramSessionConfig {
    private static final boolean DEFAULT_BROADCAST = false;
    private static final int DEFAULT_RECEIVE_BUFFER_SIZE = -1;
    private static final boolean DEFAULT_REUSE_ADDRESS = false;
    private static final int DEFAULT_SEND_BUFFER_SIZE = -1;
    private static final int DEFAULT_TRAFFIC_CLASS = 0;
    private boolean broadcast;
    private int receiveBufferSize;
    private boolean reuseAddress;
    private int sendBufferSize;
    private int trafficClass;

    public DefaultDatagramSessionConfig() {
        this.broadcast = DEFAULT_REUSE_ADDRESS;
        this.reuseAddress = DEFAULT_REUSE_ADDRESS;
        this.receiveBufferSize = DEFAULT_SEND_BUFFER_SIZE;
        this.sendBufferSize = DEFAULT_SEND_BUFFER_SIZE;
        this.trafficClass = 0;
    }

    public boolean isBroadcast() {
        return this.broadcast;
    }

    public void setBroadcast(boolean z) {
        this.broadcast = z;
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

    protected boolean isBroadcastChanged() {
        return this.broadcast ? true : DEFAULT_REUSE_ADDRESS;
    }

    protected boolean isReceiveBufferSizeChanged() {
        return this.receiveBufferSize != DEFAULT_SEND_BUFFER_SIZE ? true : DEFAULT_REUSE_ADDRESS;
    }

    protected boolean isReuseAddressChanged() {
        return this.reuseAddress ? true : DEFAULT_REUSE_ADDRESS;
    }

    protected boolean isSendBufferSizeChanged() {
        return this.sendBufferSize != DEFAULT_SEND_BUFFER_SIZE ? true : DEFAULT_REUSE_ADDRESS;
    }

    protected boolean isTrafficClassChanged() {
        return this.trafficClass != 0 ? true : DEFAULT_REUSE_ADDRESS;
    }
}
