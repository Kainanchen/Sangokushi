package org.apache.mina.filter.codec;

import org.apache.mina.core.session.IoSession;

public class SynchronizedProtocolEncoder implements ProtocolEncoder {
    private final ProtocolEncoder encoder;

    public SynchronizedProtocolEncoder(ProtocolEncoder protocolEncoder) {
        if (protocolEncoder == null) {
            throw new IllegalArgumentException("encoder");
        }
        this.encoder = protocolEncoder;
    }

    public ProtocolEncoder getEncoder() {
        return this.encoder;
    }

    public void encode(IoSession ioSession, Object obj, ProtocolEncoderOutput protocolEncoderOutput) {
        synchronized (this.encoder) {
            this.encoder.encode(ioSession, obj, protocolEncoderOutput);
        }
    }

    public void dispose(IoSession ioSession) {
        synchronized (this.encoder) {
            this.encoder.dispose(ioSession);
        }
    }
}
