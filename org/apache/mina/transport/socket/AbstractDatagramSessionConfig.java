package org.apache.mina.transport.socket;

import org.apache.mina.core.session.AbstractIoSessionConfig;
import org.apache.mina.core.session.IoSessionConfig;

public abstract class AbstractDatagramSessionConfig extends AbstractIoSessionConfig implements DatagramSessionConfig {
    private boolean closeOnPortUnreachable;

    public AbstractDatagramSessionConfig() {
        this.closeOnPortUnreachable = true;
    }

    public void setAll(IoSessionConfig ioSessionConfig) {
        super.setAll(ioSessionConfig);
        if (!(ioSessionConfig instanceof DatagramSessionConfig)) {
            return;
        }
        if (ioSessionConfig instanceof AbstractDatagramSessionConfig) {
            AbstractDatagramSessionConfig abstractDatagramSessionConfig = (AbstractDatagramSessionConfig) ioSessionConfig;
            if (abstractDatagramSessionConfig.isBroadcastChanged()) {
                setBroadcast(abstractDatagramSessionConfig.isBroadcast());
            }
            if (abstractDatagramSessionConfig.isReceiveBufferSizeChanged()) {
                setReceiveBufferSize(abstractDatagramSessionConfig.getReceiveBufferSize());
            }
            if (abstractDatagramSessionConfig.isReuseAddressChanged()) {
                setReuseAddress(abstractDatagramSessionConfig.isReuseAddress());
            }
            if (abstractDatagramSessionConfig.isSendBufferSizeChanged()) {
                setSendBufferSize(abstractDatagramSessionConfig.getSendBufferSize());
            }
            if (abstractDatagramSessionConfig.isTrafficClassChanged() && getTrafficClass() != abstractDatagramSessionConfig.getTrafficClass()) {
                setTrafficClass(abstractDatagramSessionConfig.getTrafficClass());
                return;
            }
            return;
        }
        DatagramSessionConfig datagramSessionConfig = (DatagramSessionConfig) ioSessionConfig;
        setBroadcast(datagramSessionConfig.isBroadcast());
        setReceiveBufferSize(datagramSessionConfig.getReceiveBufferSize());
        setReuseAddress(datagramSessionConfig.isReuseAddress());
        setSendBufferSize(datagramSessionConfig.getSendBufferSize());
        if (getTrafficClass() != datagramSessionConfig.getTrafficClass()) {
            setTrafficClass(datagramSessionConfig.getTrafficClass());
        }
    }

    protected boolean isBroadcastChanged() {
        return true;
    }

    protected boolean isReceiveBufferSizeChanged() {
        return true;
    }

    protected boolean isReuseAddressChanged() {
        return true;
    }

    protected boolean isSendBufferSizeChanged() {
        return true;
    }

    protected boolean isTrafficClassChanged() {
        return true;
    }

    public boolean isCloseOnPortUnreachable() {
        return this.closeOnPortUnreachable;
    }

    public void setCloseOnPortUnreachable(boolean z) {
        this.closeOnPortUnreachable = z;
    }
}
