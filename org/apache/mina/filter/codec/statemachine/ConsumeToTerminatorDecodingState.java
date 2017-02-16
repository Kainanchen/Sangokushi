package org.apache.mina.filter.codec.statemachine;

import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.filter.codec.ProtocolDecoderOutput;

public abstract class ConsumeToTerminatorDecodingState implements DecodingState {
    private IoBuffer buffer;
    private final byte terminator;

    protected abstract DecodingState finishDecode(IoBuffer ioBuffer, ProtocolDecoderOutput protocolDecoderOutput);

    public ConsumeToTerminatorDecodingState(byte b) {
        this.terminator = b;
    }

    public DecodingState decode(IoBuffer ioBuffer, ProtocolDecoderOutput protocolDecoderOutput) {
        int indexOf = ioBuffer.indexOf(this.terminator);
        if (indexOf >= 0) {
            IoBuffer slice;
            int limit = ioBuffer.limit();
            if (ioBuffer.position() < indexOf) {
                ioBuffer.limit(indexOf);
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
            ioBuffer.position(indexOf + 1);
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
