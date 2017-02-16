package org.apache.mina.filter.codec.statemachine;

import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.filter.codec.ProtocolDecoderException;
import org.apache.mina.filter.codec.ProtocolDecoderOutput;
import org.apache.mina.proxy.handlers.http.ntlm.NTLMConstants;

public abstract class ConsumeToEndOfSessionDecodingState implements DecodingState {
    private IoBuffer buffer;
    private final int maxLength;

    protected abstract DecodingState finishDecode(IoBuffer ioBuffer, ProtocolDecoderOutput protocolDecoderOutput);

    public ConsumeToEndOfSessionDecodingState(int i) {
        this.maxLength = i;
    }

    public DecodingState decode(IoBuffer ioBuffer, ProtocolDecoderOutput protocolDecoderOutput) {
        if (this.buffer == null) {
            this.buffer = IoBuffer.allocate(NTLMConstants.FLAG_UNIDENTIFIED_2).setAutoExpand(true);
        }
        if (this.buffer.position() + ioBuffer.remaining() > this.maxLength) {
            throw new ProtocolDecoderException("Received data exceeds " + this.maxLength + " byte(s).");
        }
        this.buffer.put(ioBuffer);
        return this;
    }

    public DecodingState finishDecode(ProtocolDecoderOutput protocolDecoderOutput) {
        try {
            if (this.buffer == null) {
                IoBuffer allocate = IoBuffer.allocate(0);
            }
            this.buffer.flip();
            DecodingState finishDecode = finishDecode(this.buffer, protocolDecoderOutput);
            this.buffer = null;
            return finishDecode;
        } finally {
            this.buffer = null;
        }
    }
}
