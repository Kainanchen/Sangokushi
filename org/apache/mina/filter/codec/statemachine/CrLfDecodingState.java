package org.apache.mina.filter.codec.statemachine;

import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.filter.codec.ProtocolDecoderException;
import org.apache.mina.filter.codec.ProtocolDecoderOutput;

public abstract class CrLfDecodingState implements DecodingState {
    private static final byte CR = (byte) 13;
    private static final byte LF = (byte) 10;
    private boolean hasCR;

    protected abstract DecodingState finishDecode(boolean z, ProtocolDecoderOutput protocolDecoderOutput);

    public DecodingState decode(IoBuffer ioBuffer, ProtocolDecoderOutput protocolDecoderOutput) {
        boolean z;
        boolean z2 = true;
        while (ioBuffer.hasRemaining()) {
            byte b = ioBuffer.get();
            if (this.hasCR) {
                if (b == LF) {
                    z = true;
                } else {
                    throw new ProtocolDecoderException("Expected LF after CR but was: " + (b & 255));
                }
            } else if (b == 13) {
                this.hasCR = true;
            } else if (b == LF) {
                z = true;
            } else {
                ioBuffer.position(ioBuffer.position() - 1);
                z = false;
            }
            if (z2) {
                return this;
            }
            this.hasCR = false;
            return finishDecode(z, protocolDecoderOutput);
        }
        z2 = false;
        z = false;
        if (z2) {
            return this;
        }
        this.hasCR = false;
        return finishDecode(z, protocolDecoderOutput);
    }

    public DecodingState finishDecode(ProtocolDecoderOutput protocolDecoderOutput) {
        return finishDecode(false, protocolDecoderOutput);
    }
}
