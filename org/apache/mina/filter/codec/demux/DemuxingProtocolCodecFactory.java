package org.apache.mina.filter.codec.demux;

import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolCodecFactory;
import org.apache.mina.filter.codec.ProtocolDecoder;
import org.apache.mina.filter.codec.ProtocolEncoder;

public class DemuxingProtocolCodecFactory implements ProtocolCodecFactory {
    private final DemuxingProtocolDecoder decoder;
    private final DemuxingProtocolEncoder encoder;

    public DemuxingProtocolCodecFactory() {
        this.encoder = new DemuxingProtocolEncoder();
        this.decoder = new DemuxingProtocolDecoder();
    }

    public ProtocolEncoder getEncoder(IoSession ioSession) {
        return this.encoder;
    }

    public ProtocolDecoder getDecoder(IoSession ioSession) {
        return this.decoder;
    }

    public void addMessageEncoder(Class<?> cls, Class<? extends MessageEncoder> cls2) {
        this.encoder.addMessageEncoder((Class) cls, (Class) cls2);
    }

    public <T> void addMessageEncoder(Class<T> cls, MessageEncoder<? super T> messageEncoder) {
        this.encoder.addMessageEncoder((Class) cls, (MessageEncoder) messageEncoder);
    }

    public <T> void addMessageEncoder(Class<T> cls, MessageEncoderFactory<? super T> messageEncoderFactory) {
        this.encoder.addMessageEncoder((Class) cls, (MessageEncoderFactory) messageEncoderFactory);
    }

    public void addMessageEncoder(Iterable<Class<?>> iterable, Class<? extends MessageEncoder> cls) {
        for (Class addMessageEncoder : iterable) {
            addMessageEncoder(addMessageEncoder, (Class) cls);
        }
    }

    public <T> void addMessageEncoder(Iterable<Class<? extends T>> iterable, MessageEncoder<? super T> messageEncoder) {
        for (Class addMessageEncoder : iterable) {
            addMessageEncoder(addMessageEncoder, (MessageEncoder) messageEncoder);
        }
    }

    public <T> void addMessageEncoder(Iterable<Class<? extends T>> iterable, MessageEncoderFactory<? super T> messageEncoderFactory) {
        for (Class addMessageEncoder : iterable) {
            addMessageEncoder(addMessageEncoder, (MessageEncoderFactory) messageEncoderFactory);
        }
    }

    public void addMessageDecoder(Class<? extends MessageDecoder> cls) {
        this.decoder.addMessageDecoder((Class) cls);
    }

    public void addMessageDecoder(MessageDecoder messageDecoder) {
        this.decoder.addMessageDecoder(messageDecoder);
    }

    public void addMessageDecoder(MessageDecoderFactory messageDecoderFactory) {
        this.decoder.addMessageDecoder(messageDecoderFactory);
    }
}
