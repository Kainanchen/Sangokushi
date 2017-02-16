package com.illuminate.texaspoker.p060e.p062b;

import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolCodecFactory;
import org.apache.mina.filter.codec.ProtocolDecoder;
import org.apache.mina.filter.codec.ProtocolEncoder;

/* renamed from: com.illuminate.texaspoker.e.b.b */
public final class ProtoProtocalCodecFactory implements ProtocolCodecFactory {
    private final ProtoProtocalEncoder f6489a;
    private final ProtoProtocalDecoder f6490b;

    public ProtoProtocalCodecFactory() {
        this.f6489a = new ProtoProtocalEncoder();
        this.f6490b = new ProtoProtocalDecoder();
    }

    public final ProtocolDecoder getDecoder(IoSession ioSession) {
        return this.f6490b;
    }

    public final ProtocolEncoder getEncoder(IoSession ioSession) {
        return this.f6489a;
    }
}
