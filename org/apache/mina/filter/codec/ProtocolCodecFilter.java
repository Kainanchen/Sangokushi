package org.apache.mina.filter.codec;

import java.net.SocketAddress;
import java.util.Queue;
import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.file.FileRegion;
import org.apache.mina.core.filterchain.IoFilter;
import org.apache.mina.core.filterchain.IoFilter.NextFilter;
import org.apache.mina.core.filterchain.IoFilterAdapter;
import org.apache.mina.core.filterchain.IoFilterChain;
import org.apache.mina.core.future.DefaultWriteFuture;
import org.apache.mina.core.future.WriteFuture;
import org.apache.mina.core.session.AbstractIoSession;
import org.apache.mina.core.session.AttributeKey;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.core.write.DefaultWriteRequest;
import org.apache.mina.core.write.NothingWrittenException;
import org.apache.mina.core.write.WriteRequest;
import org.apache.mina.core.write.WriteRequestWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProtocolCodecFilter extends IoFilterAdapter {
    private static final AttributeKey DECODER;
    private static final AttributeKey DECODER_OUT;
    private static final IoBuffer EMPTY_BUFFER;
    private static final Class<?>[] EMPTY_PARAMS;
    private static final AttributeKey ENCODER;
    private static final AttributeKey ENCODER_OUT;
    private static final Logger LOGGER;
    private final ProtocolCodecFactory factory;

    /* renamed from: org.apache.mina.filter.codec.ProtocolCodecFilter.1 */
    class C04271 implements ProtocolCodecFactory {
        final /* synthetic */ ProtocolDecoder val$decoder;
        final /* synthetic */ ProtocolEncoder val$encoder;

        C04271(ProtocolEncoder protocolEncoder, ProtocolDecoder protocolDecoder) {
            this.val$encoder = protocolEncoder;
            this.val$decoder = protocolDecoder;
        }

        public ProtocolEncoder getEncoder(IoSession ioSession) {
            return this.val$encoder;
        }

        public ProtocolDecoder getDecoder(IoSession ioSession) {
            return this.val$decoder;
        }
    }

    /* renamed from: org.apache.mina.filter.codec.ProtocolCodecFilter.2 */
    class C04282 implements ProtocolCodecFactory {
        final /* synthetic */ ProtocolDecoder val$decoder;
        final /* synthetic */ ProtocolEncoder val$encoder;

        C04282(ProtocolEncoder protocolEncoder, ProtocolDecoder protocolDecoder) {
            this.val$encoder = protocolEncoder;
            this.val$decoder = protocolDecoder;
        }

        public ProtocolEncoder getEncoder(IoSession ioSession) {
            return this.val$encoder;
        }

        public ProtocolDecoder getDecoder(IoSession ioSession) {
            return this.val$decoder;
        }
    }

    private static class EncodedWriteRequest extends DefaultWriteRequest {
        public EncodedWriteRequest(Object obj, WriteFuture writeFuture, SocketAddress socketAddress) {
            super(obj, writeFuture, socketAddress);
        }

        public boolean isEncoded() {
            return true;
        }
    }

    private static class MessageWriteRequest extends WriteRequestWrapper {
        public MessageWriteRequest(WriteRequest writeRequest) {
            super(writeRequest);
        }

        public Object getMessage() {
            return ProtocolCodecFilter.EMPTY_BUFFER;
        }

        public String toString() {
            return "MessageWriteRequest, parent : " + super.toString();
        }
    }

    private static class ProtocolDecoderOutputImpl extends AbstractProtocolDecoderOutput {
        public void flush(NextFilter nextFilter, IoSession ioSession) {
            Queue messageQueue = getMessageQueue();
            while (!messageQueue.isEmpty()) {
                nextFilter.messageReceived(ioSession, messageQueue.poll());
            }
        }
    }

    private static class ProtocolEncoderOutputImpl extends AbstractProtocolEncoderOutput {
        private final SocketAddress destination;
        private final NextFilter nextFilter;
        private final IoSession session;

        public ProtocolEncoderOutputImpl(IoSession ioSession, NextFilter nextFilter, WriteRequest writeRequest) {
            this.session = ioSession;
            this.nextFilter = nextFilter;
            this.destination = writeRequest.getDestination();
        }

        public WriteFuture flush() {
            Queue messageQueue = getMessageQueue();
            WriteFuture writeFuture = null;
            while (!messageQueue.isEmpty()) {
                Object poll = messageQueue.poll();
                if (poll == null) {
                    break;
                }
                WriteFuture defaultWriteFuture;
                if (!(poll instanceof IoBuffer) || ((IoBuffer) poll).hasRemaining()) {
                    defaultWriteFuture = new DefaultWriteFuture(this.session);
                    this.nextFilter.filterWrite(this.session, new EncodedWriteRequest(poll, defaultWriteFuture, this.destination));
                } else {
                    defaultWriteFuture = writeFuture;
                }
                writeFuture = defaultWriteFuture;
            }
            if (writeFuture == null) {
                return DefaultWriteFuture.newNotWrittenFuture(this.session, new NothingWrittenException(AbstractIoSession.MESSAGE_SENT_REQUEST));
            }
            return writeFuture;
        }
    }

    static {
        LOGGER = LoggerFactory.getLogger(ProtocolCodecFilter.class);
        EMPTY_PARAMS = new Class[0];
        EMPTY_BUFFER = IoBuffer.wrap(new byte[0]);
        ENCODER = new AttributeKey(ProtocolCodecFilter.class, "encoder");
        DECODER = new AttributeKey(ProtocolCodecFilter.class, "decoder");
        DECODER_OUT = new AttributeKey(ProtocolCodecFilter.class, "decoderOut");
        ENCODER_OUT = new AttributeKey(ProtocolCodecFilter.class, "encoderOut");
    }

    public ProtocolCodecFilter(ProtocolCodecFactory protocolCodecFactory) {
        if (protocolCodecFactory == null) {
            throw new IllegalArgumentException("factory");
        }
        this.factory = protocolCodecFactory;
    }

    public ProtocolCodecFilter(ProtocolEncoder protocolEncoder, ProtocolDecoder protocolDecoder) {
        if (protocolEncoder == null) {
            throw new IllegalArgumentException("encoder");
        } else if (protocolDecoder == null) {
            throw new IllegalArgumentException("decoder");
        } else {
            this.factory = new C04271(protocolEncoder, protocolDecoder);
        }
    }

    public ProtocolCodecFilter(Class<? extends ProtocolEncoder> cls, Class<? extends ProtocolDecoder> cls2) {
        if (cls == null) {
            throw new IllegalArgumentException("encoderClass");
        } else if (cls2 == null) {
            throw new IllegalArgumentException("decoderClass");
        } else if (!ProtocolEncoder.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("encoderClass: " + cls.getName());
        } else if (ProtocolDecoder.class.isAssignableFrom(cls2)) {
            try {
                cls.getConstructor(EMPTY_PARAMS);
                try {
                    cls2.getConstructor(EMPTY_PARAMS);
                    try {
                        try {
                            this.factory = new C04282((ProtocolEncoder) cls.newInstance(), (ProtocolDecoder) cls2.newInstance());
                        } catch (Exception e) {
                            throw new IllegalArgumentException("decoderClass cannot be initialized");
                        }
                    } catch (Exception e2) {
                        throw new IllegalArgumentException("encoderClass cannot be initialized");
                    }
                } catch (NoSuchMethodException e3) {
                    throw new IllegalArgumentException("decoderClass doesn't have a public default constructor.");
                }
            } catch (NoSuchMethodException e4) {
                throw new IllegalArgumentException("encoderClass doesn't have a public default constructor.");
            }
        } else {
            throw new IllegalArgumentException("decoderClass: " + cls2.getName());
        }
    }

    public ProtocolEncoder getEncoder(IoSession ioSession) {
        return (ProtocolEncoder) ioSession.getAttribute(ENCODER);
    }

    public void onPreAdd(IoFilterChain ioFilterChain, String str, NextFilter nextFilter) {
        if (ioFilterChain.contains((IoFilter) this)) {
            throw new IllegalArgumentException("You can't add the same filter instance more than once.  Create another instance and add it.");
        }
    }

    public void onPostRemove(IoFilterChain ioFilterChain, String str, NextFilter nextFilter) {
        disposeCodec(ioFilterChain.getSession());
    }

    public void messageReceived(NextFilter nextFilter, IoSession ioSession, Object obj) {
        LOGGER.debug("Processing a MESSAGE_RECEIVED for session {}", Long.valueOf(ioSession.getId()));
        if (obj instanceof IoBuffer) {
            IoBuffer ioBuffer = (IoBuffer) obj;
            ProtocolDecoder decoder = this.factory.getDecoder(ioSession);
            ProtocolDecoderOutput decoderOut = getDecoderOut(ioSession, nextFilter);
            while (ioBuffer.hasRemaining()) {
                int position = ioBuffer.position();
                try {
                    synchronized (ioSession) {
                        decoder.decode(ioSession, ioBuffer, decoderOut);
                    }
                    decoderOut.flush(nextFilter, ioSession);
                } catch (Throwable e) {
                    Throwable th;
                    if (e instanceof ProtocolDecoderException) {
                        th = (ProtocolDecoderException) e;
                    } else {
                        th = new ProtocolDecoderException(e);
                    }
                    if (th.getHexdump() == null) {
                        int position2 = ioBuffer.position();
                        ioBuffer.position(position);
                        th.setHexdump(ioBuffer.getHexDump());
                        ioBuffer.position(position2);
                    }
                    decoderOut.flush(nextFilter, ioSession);
                    nextFilter.exceptionCaught(ioSession, th);
                    if (!(e instanceof RecoverableProtocolDecoderException)) {
                        return;
                    }
                    if (ioBuffer.position() == position) {
                        return;
                    }
                }
            }
            return;
        }
        nextFilter.messageReceived(ioSession, obj);
    }

    public void messageSent(NextFilter nextFilter, IoSession ioSession, WriteRequest writeRequest) {
        if (!(writeRequest instanceof EncodedWriteRequest)) {
            if (writeRequest instanceof MessageWriteRequest) {
                nextFilter.messageSent(ioSession, ((MessageWriteRequest) writeRequest).getParentRequest());
            } else {
                nextFilter.messageSent(ioSession, writeRequest);
            }
        }
    }

    public void filterWrite(NextFilter nextFilter, IoSession ioSession, WriteRequest writeRequest) {
        Object message = writeRequest.getMessage();
        if ((message instanceof IoBuffer) || (message instanceof FileRegion)) {
            nextFilter.filterWrite(ioSession, writeRequest);
            return;
        }
        ProtocolEncoder encoder = this.factory.getEncoder(ioSession);
        ProtocolEncoderOutput encoderOut = getEncoderOut(ioSession, nextFilter, writeRequest);
        if (encoder == null) {
            throw new ProtocolEncoderException("The encoder is null for the session " + ioSession);
        }
        try {
            encoder.encode(ioSession, message, encoderOut);
            Queue messageQueue = ((AbstractProtocolEncoderOutput) encoderOut).getMessageQueue();
            while (!messageQueue.isEmpty()) {
                message = messageQueue.poll();
                if (message != null) {
                    if (message instanceof IoBuffer) {
                        if (!((IoBuffer) message).hasRemaining()) {
                        }
                    }
                    nextFilter.filterWrite(ioSession, new EncodedWriteRequest(message, null, writeRequest.getDestination()));
                }
            }
            break;
            nextFilter.filterWrite(ioSession, new MessageWriteRequest(writeRequest));
        } catch (Throwable e) {
            ProtocolEncoderException protocolEncoderException;
            if (e instanceof ProtocolEncoderException) {
                protocolEncoderException = (ProtocolEncoderException) e;
            } else {
                protocolEncoderException = new ProtocolEncoderException(e);
            }
            throw protocolEncoderException;
        }
    }

    public void sessionClosed(NextFilter nextFilter, IoSession ioSession) {
        ProtocolDecoder decoder = this.factory.getDecoder(ioSession);
        ProtocolDecoderOutput decoderOut = getDecoderOut(ioSession, nextFilter);
        try {
            decoder.finishDecode(ioSession, decoderOut);
            disposeCodec(ioSession);
            decoderOut.flush(nextFilter, ioSession);
            nextFilter.sessionClosed(ioSession);
        } catch (Throwable e) {
            ProtocolDecoderException protocolDecoderException;
            if (e instanceof ProtocolDecoderException) {
                protocolDecoderException = (ProtocolDecoderException) e;
            } else {
                protocolDecoderException = new ProtocolDecoderException(e);
            }
            throw protocolDecoderException;
        } catch (Throwable th) {
            disposeCodec(ioSession);
            decoderOut.flush(nextFilter, ioSession);
        }
    }

    private void disposeCodec(IoSession ioSession) {
        disposeEncoder(ioSession);
        disposeDecoder(ioSession);
        disposeDecoderOut(ioSession);
    }

    private void disposeEncoder(IoSession ioSession) {
        ProtocolEncoder protocolEncoder = (ProtocolEncoder) ioSession.removeAttribute(ENCODER);
        if (protocolEncoder != null) {
            try {
                protocolEncoder.dispose(ioSession);
            } catch (Exception e) {
                LOGGER.warn("Failed to dispose: " + protocolEncoder.getClass().getName() + " (" + protocolEncoder + ')');
            }
        }
    }

    private void disposeDecoder(IoSession ioSession) {
        ProtocolDecoder protocolDecoder = (ProtocolDecoder) ioSession.removeAttribute(DECODER);
        if (protocolDecoder != null) {
            try {
                protocolDecoder.dispose(ioSession);
            } catch (Exception e) {
                LOGGER.warn("Failed to dispose: " + protocolDecoder.getClass().getName() + " (" + protocolDecoder + ')');
            }
        }
    }

    private ProtocolDecoderOutput getDecoderOut(IoSession ioSession, NextFilter nextFilter) {
        ProtocolDecoderOutput protocolDecoderOutput = (ProtocolDecoderOutput) ioSession.getAttribute(DECODER_OUT);
        if (protocolDecoderOutput != null) {
            return protocolDecoderOutput;
        }
        protocolDecoderOutput = new ProtocolDecoderOutputImpl();
        ioSession.setAttribute(DECODER_OUT, protocolDecoderOutput);
        return protocolDecoderOutput;
    }

    private ProtocolEncoderOutput getEncoderOut(IoSession ioSession, NextFilter nextFilter, WriteRequest writeRequest) {
        ProtocolEncoderOutput protocolEncoderOutput = (ProtocolEncoderOutput) ioSession.getAttribute(ENCODER_OUT);
        if (protocolEncoderOutput != null) {
            return protocolEncoderOutput;
        }
        protocolEncoderOutput = new ProtocolEncoderOutputImpl(ioSession, nextFilter, writeRequest);
        ioSession.setAttribute(ENCODER_OUT, protocolEncoderOutput);
        return protocolEncoderOutput;
    }

    private void disposeDecoderOut(IoSession ioSession) {
        ioSession.removeAttribute(DECODER_OUT);
    }
}
