package org.apache.mina.filter.codec.prefixedstring;

import java.nio.charset.Charset;
import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.CumulativeProtocolDecoder;
import org.apache.mina.filter.codec.ProtocolDecoderOutput;

public class PrefixedStringDecoder extends CumulativeProtocolDecoder {
    public static final int DEFAULT_MAX_DATA_LENGTH = 2048;
    public static final int DEFAULT_PREFIX_LENGTH = 4;
    private final Charset charset;
    private int maxDataLength;
    private int prefixLength;

    public PrefixedStringDecoder(Charset charset, int i, int i2) {
        this.prefixLength = DEFAULT_PREFIX_LENGTH;
        this.maxDataLength = DEFAULT_MAX_DATA_LENGTH;
        this.charset = charset;
        this.prefixLength = i;
        this.maxDataLength = i2;
    }

    public PrefixedStringDecoder(Charset charset, int i) {
        this(charset, i, DEFAULT_MAX_DATA_LENGTH);
    }

    public PrefixedStringDecoder(Charset charset) {
        this(charset, DEFAULT_PREFIX_LENGTH);
    }

    public void setPrefixLength(int i) {
        this.prefixLength = i;
    }

    public int getPrefixLength() {
        return this.prefixLength;
    }

    public void setMaxDataLength(int i) {
        this.maxDataLength = i;
    }

    public int getMaxDataLength() {
        return this.maxDataLength;
    }

    protected boolean doDecode(IoSession ioSession, IoBuffer ioBuffer, ProtocolDecoderOutput protocolDecoderOutput) {
        if (!ioBuffer.prefixedDataAvailable(this.prefixLength, this.maxDataLength)) {
            return false;
        }
        protocolDecoderOutput.write(ioBuffer.getPrefixedString(this.prefixLength, this.charset.newDecoder()));
        return true;
    }
}
