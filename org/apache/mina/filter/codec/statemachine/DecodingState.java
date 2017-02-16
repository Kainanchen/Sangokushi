package org.apache.mina.filter.codec.statemachine;

import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.filter.codec.ProtocolDecoderOutput;

public interface DecodingState {
    DecodingState decode(IoBuffer ioBuffer, ProtocolDecoderOutput protocolDecoderOutput);

    DecodingState finishDecode(ProtocolDecoderOutput protocolDecoderOutput);
}
