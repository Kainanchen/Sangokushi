package org.apache.mina.filter.codec.prefixedstring;

import java.nio.charset.Charset;
import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolEncoderAdapter;
import org.apache.mina.filter.codec.ProtocolEncoderOutput;

public class PrefixedStringEncoder extends ProtocolEncoderAdapter {
    public static final int DEFAULT_MAX_DATA_LENGTH = 2048;
    public static final int DEFAULT_PREFIX_LENGTH = 4;
    private final Charset charset;
    private int maxDataLength;
    private int prefixLength;

    public PrefixedStringEncoder(Charset charset, int i, int i2) {
        this.prefixLength = DEFAULT_PREFIX_LENGTH;
        this.maxDataLength = DEFAULT_MAX_DATA_LENGTH;
        this.charset = charset;
        this.prefixLength = i;
        this.maxDataLength = i2;
    }

    public PrefixedStringEncoder(Charset charset, int i) {
        this(charset, i, DEFAULT_MAX_DATA_LENGTH);
    }

    public PrefixedStringEncoder(Charset charset) {
        this(charset, DEFAULT_PREFIX_LENGTH);
    }

    public PrefixedStringEncoder() {
        this(Charset.defaultCharset());
    }

    public void setPrefixLength(int i) {
        if (i == 1 || i == 2 || i == DEFAULT_PREFIX_LENGTH) {
            this.prefixLength = i;
            return;
        }
        throw new IllegalArgumentException("prefixLength: " + i);
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

    public void encode(IoSession ioSession, Object obj, ProtocolEncoderOutput protocolEncoderOutput) {
        String str = (String) obj;
        IoBuffer autoExpand = IoBuffer.allocate(str.length()).setAutoExpand(true);
        autoExpand.putPrefixedString(str, this.prefixLength, this.charset.newEncoder());
        if (autoExpand.position() > this.maxDataLength) {
            throw new IllegalArgumentException("Data length: " + autoExpand.position());
        }
        autoExpand.flip();
        protocolEncoderOutput.write(autoExpand);
    }
}
