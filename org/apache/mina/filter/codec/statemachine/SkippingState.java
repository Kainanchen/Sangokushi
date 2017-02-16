package org.apache.mina.filter.codec.statemachine;

import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.filter.codec.ProtocolDecoderOutput;

public abstract class SkippingState implements DecodingState {
    private int skippedBytes;

    protected abstract boolean canSkip(byte b);

    protected abstract DecodingState finishDecode(int i);

    public DecodingState decode(IoBuffer ioBuffer, ProtocolDecoderOutput protocolDecoderOutput) {
        int position = ioBuffer.position();
        int limit = ioBuffer.limit();
        while (position < limit) {
            if (canSkip(ioBuffer.get(position))) {
                this.skippedBytes++;
                position++;
            } else {
                ioBuffer.position(position);
                position = this.skippedBytes;
                this.skippedBytes = 0;
                return finishDecode(position);
            }
        }
        ioBuffer.position(limit);
        return this;
    }

    public DecodingState finishDecode(ProtocolDecoderOutput protocolDecoderOutput) {
        return finishDecode(this.skippedBytes);
    }
}
