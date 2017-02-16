package org.apache.mina.filter.codec.statemachine;

import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.filter.codec.ProtocolDecoderException;
import org.apache.mina.filter.codec.ProtocolDecoderOutput;
import org.cocos2dx.lib.Cocos2dxHandler;
import org.slf4j.spi.LocationAwareLogger;

public abstract class ShortIntegerDecodingState implements DecodingState {
    private int counter;

    protected abstract DecodingState finishDecode(short s, ProtocolDecoderOutput protocolDecoderOutput);

    public DecodingState decode(IoBuffer ioBuffer, ProtocolDecoderOutput protocolDecoderOutput) {
        int i = 0;
        while (ioBuffer.hasRemaining()) {
            switch (this.counter) {
                case LocationAwareLogger.TRACE_INT /*0*/:
                    i = ioBuffer.getUnsigned();
                    this.counter++;
                case Cocos2dxHandler.HANDLER_SHOW_DIALOG /*1*/:
                    this.counter = 0;
                    return finishDecode((short) ((i << 8) | ioBuffer.getUnsigned()), protocolDecoderOutput);
                default:
                    throw new InternalError();
            }
        }
        return this;
    }

    public DecodingState finishDecode(ProtocolDecoderOutput protocolDecoderOutput) {
        throw new ProtocolDecoderException("Unexpected end of session while waiting for a short integer.");
    }
}
