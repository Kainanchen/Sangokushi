package org.apache.mina.filter.codec;

import org.apache.mina.core.session.IoSession;

public interface ProtocolCodecFactory {
    ProtocolDecoder getDecoder(IoSession ioSession);

    ProtocolEncoder getEncoder(IoSession ioSession);
}
