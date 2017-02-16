package org.apache.mina.filter.codec.statemachine;

import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.filter.codec.ProtocolDecoderOutput;

public abstract class ConsumeToDynamicTerminatorDecodingState implements DecodingState {
    private IoBuffer buffer;

    protected abstract DecodingState finishDecode(IoBuffer ioBuffer, ProtocolDecoderOutput protocolDecoderOutput);

    protected abstract boolean isTerminator(byte b);

    public DecodingState decode(IoBuffer ioBuffer, ProtocolDecoderOutput protocolDecoderOutput) {
        int position = ioBuffer.position();
        int i = -1;
        int limit = ioBuffer.limit();
        for (int i2 = position; i2 < limit; i2++) {
            if (isTerminator(ioBuffer.get(i2))) {
                i = i2;
                break;
            }
        }
        if (i >= 0) {
            IoBuffer slice;
            if (position < i) {
                ioBuffer.limit(i);
                if (this.buffer == null) {
                    slice = ioBuffer.slice();
                } else {
                    this.buffer.put(ioBuffer);
                    slice = this.buffer.flip();
                    this.buffer = null;
                }
                ioBuffer.limit(limit);
            } else if (this.buffer == null) {
                slice = IoBuffer.allocate(0);
            } else {
                slice = this.buffer.flip();
                this.buffer = null;
            }
            ioBuffer.position(i + 1);
            return finishDecode(slice, protocolDecoderOutput);
        }
        if (this.buffer == null) {
            this.buffer = IoBuffer.allocate(ioBuffer.remaining());
            this.buffer.setAutoExpand(true);
        }
        this.buffer.put(ioBuffer);
        return this;
    }

    public DecodingState finishDecode(ProtocolDecoderOutput protocolDecoderOutput) {
        IoBuffer allocate;
        if (this.buffer == null) {
            allocate = IoBuffer.allocate(0);
        } else {
            allocate = this.buffer.flip();
            this.buffer = null;
        }
        return finishDecode(allocate, protocolDecoderOutput);
    }
}
