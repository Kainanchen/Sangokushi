package org.apache.mina.filter.codec.statemachine;

import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.filter.codec.ProtocolDecoderOutput;

public abstract class FixedLengthDecodingState implements DecodingState {
    private IoBuffer buffer;
    private final int length;

    protected abstract DecodingState finishDecode(IoBuffer ioBuffer, ProtocolDecoderOutput protocolDecoderOutput);

    public FixedLengthDecodingState(int i) {
        this.length = i;
    }

    public DecodingState decode(IoBuffer ioBuffer, ProtocolDecoderOutput protocolDecoderOutput) {
        int limit;
        if (this.buffer == null) {
            if (ioBuffer.remaining() >= this.length) {
                limit = ioBuffer.limit();
                ioBuffer.limit(ioBuffer.position() + this.length);
                IoBuffer slice = ioBuffer.slice();
                ioBuffer.position(ioBuffer.position() + this.length);
                ioBuffer.limit(limit);
                return finishDecode(slice, protocolDecoderOutput);
            }
            this.buffer = IoBuffer.allocate(this.length);
            this.buffer.put(ioBuffer);
            return this;
        } else if (ioBuffer.remaining() >= this.length - this.buffer.position()) {
            limit = ioBuffer.limit();
            ioBuffer.limit((ioBuffer.position() + this.length) - this.buffer.position());
            this.buffer.put(ioBuffer);
            ioBuffer.limit(limit);
            IoBuffer ioBuffer2 = this.buffer;
            this.buffer = null;
            return finishDecode(ioBuffer2.flip(), protocolDecoderOutput);
        } else {
            this.buffer.put(ioBuffer);
            return this;
        }
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
