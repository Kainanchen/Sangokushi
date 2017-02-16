package org.apache.mina.filter.codec.serialization;

import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.CumulativeProtocolDecoder;
import org.apache.mina.filter.codec.ProtocolDecoderOutput;
import org.apache.mina.proxy.handlers.http.ntlm.NTLMConstants;

public class ObjectSerializationDecoder extends CumulativeProtocolDecoder {
    private final ClassLoader classLoader;
    private int maxObjectSize;

    public ObjectSerializationDecoder() {
        this(Thread.currentThread().getContextClassLoader());
    }

    public ObjectSerializationDecoder(ClassLoader classLoader) {
        this.maxObjectSize = NTLMConstants.FLAG_UNIDENTIFIED_4;
        if (classLoader == null) {
            throw new IllegalArgumentException("classLoader");
        }
        this.classLoader = classLoader;
    }

    public int getMaxObjectSize() {
        return this.maxObjectSize;
    }

    public void setMaxObjectSize(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxObjectSize: " + i);
        }
        this.maxObjectSize = i;
    }

    protected boolean doDecode(IoSession ioSession, IoBuffer ioBuffer, ProtocolDecoderOutput protocolDecoderOutput) {
        if (!ioBuffer.prefixedDataAvailable(4, this.maxObjectSize)) {
            return false;
        }
        protocolDecoderOutput.write(ioBuffer.getObject(this.classLoader));
        return true;
    }
}
