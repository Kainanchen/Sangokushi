package com.illuminate.texaspoker.p060e.p062b;

import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.CumulativeProtocolDecoder;
import org.apache.mina.filter.codec.ProtocolDecoderOutput;

/* renamed from: com.illuminate.texaspoker.e.b.c */
public final class ProtoProtocalDecoder extends CumulativeProtocolDecoder {
    protected final boolean doDecode(IoSession ioSession, IoBuffer ioBuffer, ProtocolDecoderOutput protocolDecoderOutput) {
        if (ioBuffer.remaining() < 5 || ioBuffer.remaining() <= 1) {
            return false;
        }
        ioBuffer.mark();
        if (ioBuffer.get() != -2) {
            ioBuffer.clear();
            return false;
        }
        int i = ioBuffer.getInt();
        if (i > ioBuffer.remaining() + 5) {
            ioBuffer.reset();
            return false;
        }
        ioBuffer.reset();
        Object obj = new byte[i];
        ioBuffer.get(obj, 0, i);
        if (i > 0) {
            protocolDecoderOutput.write(obj);
        }
        return true;
    }
}
