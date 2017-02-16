package org.apache.mina.filter.codec;

import org.apache.mina.core.session.IoSession;

public interface ProtocolEncoder {
    void dispose(IoSession ioSession);

    void encode(IoSession ioSession, Object obj, ProtocolEncoderOutput protocolEncoderOutput);
}
