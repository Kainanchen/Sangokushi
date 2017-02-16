package org.apache.mina.filter.codec.statemachine;

import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.filter.codec.ProtocolDecoderException;
import org.apache.mina.filter.codec.ProtocolDecoderOutput;
import org.apache.mina.proxy.handlers.http.ntlm.NTLMConstants;
import org.apache.mina.proxy.handlers.socks.SocksProxyConstants;
import org.cocos2dx.lib.Cocos2dxHandler;
import org.slf4j.spi.LocationAwareLogger;

public abstract class IntegerDecodingState implements DecodingState {
    private int counter;

    protected abstract DecodingState finishDecode(int i, ProtocolDecoderOutput protocolDecoderOutput);

    public DecodingState decode(IoBuffer ioBuffer, ProtocolDecoderOutput protocolDecoderOutput) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (ioBuffer.hasRemaining()) {
            switch (this.counter) {
                case LocationAwareLogger.TRACE_INT /*0*/:
                    i3 = ioBuffer.getUnsigned();
                    break;
                case Cocos2dxHandler.HANDLER_SHOW_DIALOG /*1*/:
                    i2 = ioBuffer.getUnsigned();
                    break;
                case SocksProxyConstants.SOCKS5_REQUEST_STEP /*2*/:
                    i = ioBuffer.getUnsigned();
                    break;
                case NTLMConstants.MESSAGE_TYPE_3 /*3*/:
                    this.counter = 0;
                    return finishDecode(((i << 8) | ((i3 << 24) | (i2 << 16))) | ioBuffer.getUnsigned(), protocolDecoderOutput);
                default:
                    throw new InternalError();
            }
            this.counter++;
        }
        return this;
    }

    public DecodingState finishDecode(ProtocolDecoderOutput protocolDecoderOutput) {
        throw new ProtocolDecoderException("Unexpected end of session while waiting for an integer.");
    }
}
