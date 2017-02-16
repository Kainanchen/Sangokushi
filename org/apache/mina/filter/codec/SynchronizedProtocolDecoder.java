package org.apache.mina.filter.codec;

import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.session.IoSession;

public class SynchronizedProtocolDecoder implements ProtocolDecoder {
    private final ProtocolDecoder decoder;

    public SynchronizedProtocolDecoder(ProtocolDecoder protocolDecoder) {
        if (protocolDecoder == null) {
            throw new IllegalArgumentException("decoder");
        }
        this.decoder = protocolDecoder;
    }

    public ProtocolDecoder getDecoder() {
        return this.decoder;
    }

    public void decode(IoSession ioSession, IoBuffer ioBuffer, ProtocolDecoderOutput protocolDecoderOutput) {
        synchronized (this.decoder) {
            this.decoder.decode(ioSession, ioBuffer, protocolDecoderOutput);
        }
    }

    public void finishDecode(IoSession ioSession, ProtocolDecoderOutput protocolDecoderOutput) {
        synchronized (this.decoder) {
            this.decoder.finishDecode(ioSession, protocolDecoderOutput);
        }
    }

    public void dispose(IoSession ioSession) {
        synchronized (this.decoder) {
            this.decoder.dispose(ioSession);
        }
    }
}
