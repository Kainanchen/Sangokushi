package org.apache.mina.transport.socket;

import org.apache.mina.core.session.AbstractIoSessionConfig;
import org.apache.mina.core.session.IoSessionConfig;

public abstract class AbstractSocketSessionConfig extends AbstractIoSessionConfig implements SocketSessionConfig {
    public void setAll(IoSessionConfig ioSessionConfig) {
        super.setAll(ioSessionConfig);
        if (!(ioSessionConfig instanceof SocketSessionConfig)) {
            return;
        }
        if (ioSessionConfig instanceof AbstractSocketSessionConfig) {
            AbstractSocketSessionConfig abstractSocketSessionConfig = (AbstractSocketSessionConfig) ioSessionConfig;
            if (abstractSocketSessionConfig.isKeepAliveChanged()) {
                setKeepAlive(abstractSocketSessionConfig.isKeepAlive());
            }
            if (abstractSocketSessionConfig.isOobInlineChanged()) {
                setOobInline(abstractSocketSessionConfig.isOobInline());
            }
            if (abstractSocketSessionConfig.isReceiveBufferSizeChanged()) {
                setReceiveBufferSize(abstractSocketSessionConfig.getReceiveBufferSize());
            }
            if (abstractSocketSessionConfig.isReuseAddressChanged()) {
                setReuseAddress(abstractSocketSessionConfig.isReuseAddress());
            }
            if (abstractSocketSessionConfig.isSendBufferSizeChanged()) {
                setSendBufferSize(abstractSocketSessionConfig.getSendBufferSize());
            }
            if (abstractSocketSessionConfig.isSoLingerChanged()) {
                setSoLinger(abstractSocketSessionConfig.getSoLinger());
            }
            if (abstractSocketSessionConfig.isTcpNoDelayChanged()) {
                setTcpNoDelay(abstractSocketSessionConfig.isTcpNoDelay());
            }
            if (abstractSocketSessionConfig.isTrafficClassChanged() && getTrafficClass() != abstractSocketSessionConfig.getTrafficClass()) {
                setTrafficClass(abstractSocketSessionConfig.getTrafficClass());
                return;
            }
            return;
        }
        SocketSessionConfig socketSessionConfig = (SocketSessionConfig) ioSessionConfig;
        setKeepAlive(socketSessionConfig.isKeepAlive());
        setOobInline(socketSessionConfig.isOobInline());
        setReceiveBufferSize(socketSessionConfig.getReceiveBufferSize());
        setReuseAddress(socketSessionConfig.isReuseAddress());
        setSendBufferSize(socketSessionConfig.getSendBufferSize());
        setSoLinger(socketSessionConfig.getSoLinger());
        setTcpNoDelay(socketSessionConfig.isTcpNoDelay());
        if (getTrafficClass() != socketSessionConfig.getTrafficClass()) {
            setTrafficClass(socketSessionConfig.getTrafficClass());
        }
    }

    protected boolean isKeepAliveChanged() {
        return true;
    }

    protected boolean isOobInlineChanged() {
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

    protected boolean isSoLingerChanged() {
        return true;
    }

    protected boolean isTcpNoDelayChanged() {
        return true;
    }

    protected boolean isTrafficClassChanged() {
        return true;
    }
}
