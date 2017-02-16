package org.apache.mina.filter.codec.textline;

import com.texaspoker.moment.TexasPokerMiniGame.SCMiniGameIniRsp;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.session.AttributeKey;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolDecoder;
import org.apache.mina.filter.codec.ProtocolDecoderOutput;
import org.apache.mina.filter.codec.RecoverableProtocolDecoderException;
import org.apache.mina.proxy.handlers.http.ntlm.NTLMConstants;
import org.slf4j.spi.LocationAwareLogger;

public class TextLineDecoder implements ProtocolDecoder {
    private final AttributeKey CONTEXT;
    private int bufferLength;
    private final Charset charset;
    private IoBuffer delimBuf;
    private final LineDelimiter delimiter;
    private int maxLineLength;

    private class Context {
        private final IoBuffer buf;
        private final CharsetDecoder decoder;
        private int matchCount;
        private int overflowPosition;

        private Context(int i) {
            this.matchCount = 0;
            this.overflowPosition = 0;
            this.decoder = TextLineDecoder.this.charset.newDecoder();
            this.buf = IoBuffer.allocate(i).setAutoExpand(true);
        }

        public CharsetDecoder getDecoder() {
            return this.decoder;
        }

        public IoBuffer getBuffer() {
            return this.buf;
        }

        public int getOverflowPosition() {
            return this.overflowPosition;
        }

        public int getMatchCount() {
            return this.matchCount;
        }

        public void setMatchCount(int i) {
            this.matchCount = i;
        }

        public void reset() {
            this.overflowPosition = 0;
            this.matchCount = 0;
            this.decoder.reset();
        }

        public void append(IoBuffer ioBuffer) {
            if (this.overflowPosition != 0) {
                discard(ioBuffer);
            } else if (this.buf.position() > TextLineDecoder.this.maxLineLength - ioBuffer.remaining()) {
                this.overflowPosition = this.buf.position();
                this.buf.clear();
                discard(ioBuffer);
            } else {
                getBuffer().put(ioBuffer);
            }
        }

        private void discard(IoBuffer ioBuffer) {
            if (Integer.MAX_VALUE - ioBuffer.remaining() < this.overflowPosition) {
                this.overflowPosition = Integer.MAX_VALUE;
            } else {
                this.overflowPosition += ioBuffer.remaining();
            }
            ioBuffer.position(ioBuffer.limit());
        }
    }

    public TextLineDecoder() {
        this(LineDelimiter.AUTO);
    }

    public TextLineDecoder(String str) {
        this(new LineDelimiter(str));
    }

    public TextLineDecoder(LineDelimiter lineDelimiter) {
        this(Charset.defaultCharset(), lineDelimiter);
    }

    public TextLineDecoder(Charset charset) {
        this(charset, LineDelimiter.AUTO);
    }

    public TextLineDecoder(Charset charset, String str) {
        this(charset, new LineDelimiter(str));
    }

    public TextLineDecoder(Charset charset, LineDelimiter lineDelimiter) {
        this.CONTEXT = new AttributeKey(getClass(), "context");
        this.maxLineLength = NTLMConstants.FLAG_UNIDENTIFIED_3;
        this.bufferLength = NTLMConstants.FLAG_NEGOTIATE_LAN_MANAGER_KEY;
        if (charset == null) {
            throw new IllegalArgumentException("charset parameter shuld not be null");
        } else if (lineDelimiter == null) {
            throw new IllegalArgumentException("delimiter parameter should not be null");
        } else {
            this.charset = charset;
            this.delimiter = lineDelimiter;
            if (this.delimBuf == null) {
                IoBuffer autoExpand = IoBuffer.allocate(2).setAutoExpand(true);
                try {
                    autoExpand.putString(lineDelimiter.getValue(), charset.newEncoder());
                } catch (CharacterCodingException e) {
                }
                autoExpand.flip();
                this.delimBuf = autoExpand;
            }
        }
    }

    public int getMaxLineLength() {
        return this.maxLineLength;
    }

    public void setMaxLineLength(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxLineLength (" + i + ") should be a positive value");
        }
        this.maxLineLength = i;
    }

    public void setBufferLength(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("bufferLength (" + this.maxLineLength + ") should be a positive value");
        }
        this.bufferLength = i;
    }

    public int getBufferLength() {
        return this.bufferLength;
    }

    public void decode(IoSession ioSession, IoBuffer ioBuffer, ProtocolDecoderOutput protocolDecoderOutput) {
        Context context = getContext(ioSession);
        if (LineDelimiter.AUTO.equals(this.delimiter)) {
            decodeAuto(context, ioSession, ioBuffer, protocolDecoderOutput);
        } else {
            decodeNormal(context, ioSession, ioBuffer, protocolDecoderOutput);
        }
    }

    private Context getContext(IoSession ioSession) {
        Context context = (Context) ioSession.getAttribute(this.CONTEXT);
        if (context != null) {
            return context;
        }
        context = new Context(this.bufferLength, null);
        ioSession.setAttribute(this.CONTEXT, context);
        return context;
    }

    public void finishDecode(IoSession ioSession, ProtocolDecoderOutput protocolDecoderOutput) {
    }

    public void dispose(IoSession ioSession) {
        if (((Context) ioSession.getAttribute(this.CONTEXT)) != null) {
            ioSession.removeAttribute(this.CONTEXT);
        }
    }

    private void decodeAuto(Context context, IoSession ioSession, IoBuffer ioBuffer, ProtocolDecoderOutput protocolDecoderOutput) {
        int matchCount = context.getMatchCount();
        int position = ioBuffer.position();
        int limit = ioBuffer.limit();
        while (ioBuffer.hasRemaining()) {
            int i;
            Object obj;
            switch (ioBuffer.get()) {
                case LocationAwareLogger.DEBUG_INT /*10*/:
                    i = matchCount + 1;
                    obj = 1;
                    break;
                case SCMiniGameIniRsp.VCMD_CHECK_CARDS_FIELD_NUMBER /*13*/:
                    i = matchCount + 1;
                    obj = null;
                    break;
                default:
                    obj = null;
                    i = 0;
                    break;
            }
            if (obj != null) {
                matchCount = ioBuffer.position();
                ioBuffer.limit(matchCount);
                ioBuffer.position(position);
                context.append(ioBuffer);
                ioBuffer.limit(limit);
                ioBuffer.position(matchCount);
                if (context.getOverflowPosition() == 0) {
                    IoBuffer buffer = context.getBuffer();
                    buffer.flip();
                    buffer.limit(buffer.limit() - i);
                    try {
                        byte[] bArr = new byte[buffer.limit()];
                        buffer.get(bArr);
                        writeText(ioSession, context.getDecoder().decode(ByteBuffer.wrap(bArr)).toString(), protocolDecoderOutput);
                        position = matchCount;
                        matchCount = 0;
                    } finally {
                        buffer.clear();
                    }
                } else {
                    position = context.getOverflowPosition();
                    context.reset();
                    throw new RecoverableProtocolDecoderException("Line is too long: " + position);
                }
            }
            matchCount = i;
        }
        ioBuffer.position(position);
        context.append(ioBuffer);
        context.setMatchCount(matchCount);
    }

    private void decodeNormal(Context context, IoSession ioSession, IoBuffer ioBuffer, ProtocolDecoderOutput protocolDecoderOutput) {
        int matchCount = context.getMatchCount();
        int position = ioBuffer.position();
        int limit = ioBuffer.limit();
        while (ioBuffer.hasRemaining()) {
            if (this.delimBuf.get(matchCount) == ioBuffer.get()) {
                int i = matchCount + 1;
                if (i == this.delimBuf.limit()) {
                    matchCount = ioBuffer.position();
                    ioBuffer.limit(matchCount);
                    ioBuffer.position(position);
                    context.append(ioBuffer);
                    ioBuffer.limit(limit);
                    ioBuffer.position(matchCount);
                    if (context.getOverflowPosition() == 0) {
                        IoBuffer buffer = context.getBuffer();
                        buffer.flip();
                        buffer.limit(buffer.limit() - i);
                        try {
                            writeText(ioSession, buffer.getString(context.getDecoder()), protocolDecoderOutput);
                            position = matchCount;
                            matchCount = 0;
                        } finally {
                            buffer.clear();
                        }
                    } else {
                        position = context.getOverflowPosition();
                        context.reset();
                        throw new RecoverableProtocolDecoderException("Line is too long: " + position);
                    }
                }
                matchCount = i;
            } else {
                ioBuffer.position(Math.max(0, ioBuffer.position() - matchCount));
                matchCount = 0;
            }
        }
        ioBuffer.position(position);
        context.append(ioBuffer);
        context.setMatchCount(matchCount);
    }

    protected void writeText(IoSession ioSession, String str, ProtocolDecoderOutput protocolDecoderOutput) {
        protocolDecoderOutput.write(str);
    }
}
