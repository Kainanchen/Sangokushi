package org.apache.mina.filter.codec.statemachine;

import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.filter.codec.ProtocolDecoderOutput;

public abstract class ConsumeToCrLfDecodingState implements DecodingState {
    private static final byte CR = (byte) 13;
    private static final byte LF = (byte) 10;
    private IoBuffer buffer;
    private boolean lastIsCR;

    protected abstract DecodingState finishDecode(IoBuffer ioBuffer, ProtocolDecoderOutput protocolDecoderOutput);

    public DecodingState decode(IoBuffer ioBuffer, ProtocolDecoderOutput protocolDecoderOutput) {
        int i;
        int position = ioBuffer.position();
        int limit = ioBuffer.limit();
        int i2 = -1;
        for (i = position; i < limit; i++) {
            byte b = ioBuffer.get(i);
            if (b != 13) {
                if (b == 10 && this.lastIsCR) {
                    i2 = i;
                    break;
                }
                this.lastIsCR = false;
            } else {
                this.lastIsCR = true;
            }
        }
        if (i2 >= 0) {
            IoBuffer slice;
            i = i2 - 1;
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
            ioBuffer.position(i2 + 1);
            return finishDecode(slice, protocolDecoderOutput);
        }
        ioBuffer.position(position);
        if (this.buffer == null) {
            this.buffer = IoBuffer.allocate(ioBuffer.remaining());
            this.buffer.setAutoExpand(true);
        }
        this.buffer.put(ioBuffer);
        if (!this.lastIsCR) {
            return this;
        }
        this.buffer.position(this.buffer.position() - 1);
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
