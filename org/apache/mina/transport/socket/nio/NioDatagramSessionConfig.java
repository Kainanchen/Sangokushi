package org.apache.mina.transport.socket.nio;

import java.nio.channels.DatagramChannel;
import org.apache.mina.core.RuntimeIoException;
import org.apache.mina.transport.socket.AbstractDatagramSessionConfig;

class NioDatagramSessionConfig extends AbstractDatagramSessionConfig {
    private final DatagramChannel channel;

    NioDatagramSessionConfig(DatagramChannel datagramChannel) {
        this.channel = datagramChannel;
    }

    public int getReceiveBufferSize() {
        try {
            return this.channel.socket().getReceiveBufferSize();
        } catch (Throwable e) {
            throw new RuntimeIoException(e);
        }
    }

    public void setReceiveBufferSize(int i) {
        try {
            this.channel.socket().setReceiveBufferSize(i);
        } catch (Throwable e) {
            throw new RuntimeIoException(e);
        }
    }

    public boolean isBroadcast() {
        try {
            return this.channel.socket().getBroadcast();
        } catch (Throwable e) {
            throw new RuntimeIoException(e);
        }
    }

    public void setBroadcast(boolean z) {
        try {
            this.channel.socket().setBroadcast(z);
        } catch (Throwable e) {
            throw new RuntimeIoException(e);
        }
    }

    public int getSendBufferSize() {
        try {
            return this.channel.socket().getSendBufferSize();
        } catch (Throwable e) {
            throw new RuntimeIoException(e);
        }
    }

    public void setSendBufferSize(int i) {
        try {
            this.channel.socket().setSendBufferSize(i);
        } catch (Throwable e) {
            throw new RuntimeIoException(e);
        }
    }

    public boolean isReuseAddress() {
        try {
            return this.channel.socket().getReuseAddress();
        } catch (Throwable e) {
            throw new RuntimeIoException(e);
        }
    }

    public void setReuseAddress(boolean z) {
        try {
            this.channel.socket().setReuseAddress(z);
        } catch (Throwable e) {
            throw new RuntimeIoException(e);
        }
    }

    public int getTrafficClass() {
        try {
            return this.channel.socket().getTrafficClass();
        } catch (Throwable e) {
            throw new RuntimeIoException(e);
        }
    }

    public void setTrafficClass(int i) {
        try {
            this.channel.socket().setTrafficClass(i);
        } catch (Throwable e) {
            throw new RuntimeIoException(e);
        }
    }
}
