package org.apache.mina.filter.codec;

import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.session.IoSession;

public interface ProtocolDecoder {
    void decode(IoSession ioSession, IoBuffer ioBuffer, ProtocolDecoderOutput protocolDecoderOutput);

    void dispose(IoSession ioSession);

    void finishDecode(IoSession ioSession, ProtocolDecoderOutput protocolDecoderOutput);
}
