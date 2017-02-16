package org.apache.mina.filter.codec.textline;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.session.AttributeKey;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolEncoderAdapter;
import org.apache.mina.filter.codec.ProtocolEncoderOutput;
import org.cocos2dx.lib.BuildConfig;

public class TextLineEncoder extends ProtocolEncoderAdapter {
    private static final AttributeKey ENCODER;
    private final Charset charset;
    private final LineDelimiter delimiter;
    private int maxLineLength;

    static {
        ENCODER = new AttributeKey(TextLineEncoder.class, "encoder");
    }

    public TextLineEncoder() {
        this(Charset.defaultCharset(), LineDelimiter.UNIX);
    }

    public TextLineEncoder(String str) {
        this(new LineDelimiter(str));
    }

    public TextLineEncoder(LineDelimiter lineDelimiter) {
        this(Charset.defaultCharset(), lineDelimiter);
    }

    public TextLineEncoder(Charset charset) {
        this(charset, LineDelimiter.UNIX);
    }

    public TextLineEncoder(Charset charset, String str) {
        this(charset, new LineDelimiter(str));
    }

    public TextLineEncoder(Charset charset, LineDelimiter lineDelimiter) {
        this.maxLineLength = Integer.MAX_VALUE;
        if (charset == null) {
            throw new IllegalArgumentException("charset");
        } else if (lineDelimiter == null) {
            throw new IllegalArgumentException("delimiter");
        } else if (LineDelimiter.AUTO.equals(lineDelimiter)) {
            throw new IllegalArgumentException("AUTO delimiter is not allowed for encoder.");
        } else {
            this.charset = charset;
            this.delimiter = lineDelimiter;
        }
    }

    public int getMaxLineLength() {
        return this.maxLineLength;
    }

    public void setMaxLineLength(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxLineLength: " + i);
        }
        this.maxLineLength = i;
    }

    public void encode(IoSession ioSession, Object obj, ProtocolEncoderOutput protocolEncoderOutput) {
        CharsetEncoder charsetEncoder = (CharsetEncoder) ioSession.getAttribute(ENCODER);
        if (charsetEncoder == null) {
            charsetEncoder = this.charset.newEncoder();
            ioSession.setAttribute(ENCODER, charsetEncoder);
        }
        CharsetEncoder charsetEncoder2 = charsetEncoder;
        CharSequence obj2 = obj == null ? BuildConfig.FLAVOR : obj.toString();
        IoBuffer autoExpand = IoBuffer.allocate(obj2.length()).setAutoExpand(true);
        autoExpand.putString(obj2, charsetEncoder2);
        if (autoExpand.position() > this.maxLineLength) {
            throw new IllegalArgumentException("Line length: " + autoExpand.position());
        }
        autoExpand.putString(this.delimiter.getValue(), charsetEncoder2);
        autoExpand.flip();
        protocolEncoderOutput.write(autoExpand);
    }

    public void dispose() {
    }
}
