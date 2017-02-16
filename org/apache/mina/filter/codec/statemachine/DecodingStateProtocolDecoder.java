package org.apache.mina.filter.codec.statemachine;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolDecoder;
import org.apache.mina.filter.codec.ProtocolDecoderOutput;

public class DecodingStateProtocolDecoder implements ProtocolDecoder {
    private IoSession session;
    private final DecodingState state;
    private final Queue<IoBuffer> undecodedBuffers;

    public DecodingStateProtocolDecoder(DecodingState decodingState) {
        this.undecodedBuffers = new ConcurrentLinkedQueue();
        if (decodingState == null) {
            throw new IllegalArgumentException("state");
        }
        this.state = decodingState;
    }

    public void decode(IoSession ioSession, IoBuffer ioBuffer, ProtocolDecoderOutput protocolDecoderOutput) {
        if (this.session == null) {
            this.session = ioSession;
        } else if (this.session != ioSession) {
            throw new IllegalStateException(getClass().getSimpleName() + " is a stateful decoder.  You have to create one per session.");
        }
        this.undecodedBuffers.offer(ioBuffer);
        while (true) {
            IoBuffer ioBuffer2 = (IoBuffer) this.undecodedBuffers.peek();
            if (ioBuffer2 != null) {
                int remaining = ioBuffer2.remaining();
                this.state.decode(ioBuffer2, protocolDecoderOutput);
                int remaining2 = ioBuffer2.remaining();
                if (remaining2 == 0) {
                    this.undecodedBuffers.poll();
                } else if (remaining == remaining2) {
                    break;
                }
            } else {
                return;
            }
        }
        throw new IllegalStateException(DecodingState.class.getSimpleName() + " must consume at least one byte per decode().");
    }

    public void finishDecode(IoSession ioSession, ProtocolDecoderOutput protocolDecoderOutput) {
        this.state.finishDecode(protocolDecoderOutput);
    }

    public void dispose(IoSession ioSession) {
    }
}
