package org.apache.mina.filter.codec;

import java.util.Queue;
import org.apache.mina.core.filterchain.IoFilter.NextFilter;
import org.apache.mina.core.future.DefaultWriteFuture;
import org.apache.mina.core.future.WriteFuture;
import org.apache.mina.core.session.DummySession;
import org.apache.mina.core.session.IoSession;

public class ProtocolCodecSession extends DummySession {
    private final AbstractProtocolDecoderOutput decoderOutput;
    private final AbstractProtocolEncoderOutput encoderOutput;
    private final WriteFuture notWrittenFuture;

    /* renamed from: org.apache.mina.filter.codec.ProtocolCodecSession.1 */
    class C04291 extends AbstractProtocolEncoderOutput {
        C04291() {
        }

        public WriteFuture flush() {
            return ProtocolCodecSession.this.notWrittenFuture;
        }
    }

    /* renamed from: org.apache.mina.filter.codec.ProtocolCodecSession.2 */
    class C04302 extends AbstractProtocolDecoderOutput {
        C04302() {
        }

        public void flush(NextFilter nextFilter, IoSession ioSession) {
        }
    }

    public ProtocolCodecSession() {
        this.notWrittenFuture = DefaultWriteFuture.newNotWrittenFuture(this, new UnsupportedOperationException());
        this.encoderOutput = new C04291();
        this.decoderOutput = new C04302();
    }

    public ProtocolEncoderOutput getEncoderOutput() {
        return this.encoderOutput;
    }

    public Queue<Object> getEncoderOutputQueue() {
        return this.encoderOutput.getMessageQueue();
    }

    public ProtocolDecoderOutput getDecoderOutput() {
        return this.decoderOutput;
    }

    public Queue<Object> getDecoderOutputQueue() {
        return this.decoderOutput.getMessageQueue();
    }
}
