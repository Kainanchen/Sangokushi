package org.apache.mina.filter.codec.statemachine;

import java.util.ArrayList;
import java.util.List;
import org.apache.mina.core.filterchain.IoFilter.NextFilter;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolDecoderOutput;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class DecodingStateMachine implements DecodingState {
    private final ProtocolDecoderOutput childOutput;
    private final List<Object> childProducts;
    private DecodingState currentState;
    private boolean initialized;
    private final Logger log;

    /* renamed from: org.apache.mina.filter.codec.statemachine.DecodingStateMachine.1 */
    class C04331 implements ProtocolDecoderOutput {
        C04331() {
        }

        public void flush(NextFilter nextFilter, IoSession ioSession) {
        }

        public void write(Object obj) {
            DecodingStateMachine.this.childProducts.add(obj);
        }
    }

    protected abstract void destroy();

    protected abstract DecodingState finishDecode(List<Object> list, ProtocolDecoderOutput protocolDecoderOutput);

    protected abstract DecodingState init();

    public DecodingStateMachine() {
        this.log = LoggerFactory.getLogger(DecodingStateMachine.class);
        this.childProducts = new ArrayList();
        this.childOutput = new C04331();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.apache.mina.filter.codec.statemachine.DecodingState decode(org.apache.mina.core.buffer.IoBuffer r7, org.apache.mina.filter.codec.ProtocolDecoderOutput r8) {
        /*
        r6 = this;
        r1 = r6.getCurrentState();
        r4 = r7.limit();
        r0 = r7.position();
        r2 = r0;
    L_0x000d:
        if (r2 == r4) goto L_0x0031;
    L_0x000f:
        r0 = r6.childOutput;	 Catch:{ Exception -> 0x003a }
        r0 = r1.decode(r7, r0);	 Catch:{ Exception -> 0x003a }
        if (r0 != 0) goto L_0x0026;
    L_0x0017:
        r1 = r6.childProducts;	 Catch:{ Exception -> 0x003a, all -> 0x0046 }
        r1 = r6.finishDecode(r1, r8);	 Catch:{ Exception -> 0x003a, all -> 0x0046 }
        r6.currentState = r0;
        if (r0 != 0) goto L_0x0024;
    L_0x0021:
        r6.cleanup();
    L_0x0024:
        r6 = r1;
    L_0x0025:
        return r6;
    L_0x0026:
        r3 = r7.position();	 Catch:{ Exception -> 0x003a, all -> 0x0046 }
        if (r3 != r2) goto L_0x002e;
    L_0x002c:
        if (r1 == r0) goto L_0x0032;
    L_0x002e:
        r2 = r3;
        r1 = r0;
        goto L_0x000d;
    L_0x0031:
        r0 = r1;
    L_0x0032:
        r6.currentState = r0;
        if (r0 != 0) goto L_0x0025;
    L_0x0036:
        r6.cleanup();
        goto L_0x0025;
    L_0x003a:
        r0 = move-exception;
        r1 = 0;
        throw r0;	 Catch:{ all -> 0x003d }
    L_0x003d:
        r0 = move-exception;
    L_0x003e:
        r6.currentState = r1;
        if (r1 != 0) goto L_0x0045;
    L_0x0042:
        r6.cleanup();
    L_0x0045:
        throw r0;
    L_0x0046:
        r1 = move-exception;
        r5 = r1;
        r1 = r0;
        r0 = r5;
        goto L_0x003e;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.mina.filter.codec.statemachine.DecodingStateMachine.decode(org.apache.mina.core.buffer.IoBuffer, org.apache.mina.filter.codec.ProtocolDecoderOutput):org.apache.mina.filter.codec.statemachine.DecodingState");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.apache.mina.filter.codec.statemachine.DecodingState finishDecode(org.apache.mina.filter.codec.ProtocolDecoderOutput r5) {
        /*
        r4 = this;
        r2 = 0;
        r1 = r4.getCurrentState();
    L_0x0005:
        r0 = r4.childOutput;	 Catch:{ Exception -> 0x001d, all -> 0x0031 }
        r3 = r1.finishDecode(r0);	 Catch:{ Exception -> 0x001d, all -> 0x0031 }
        if (r3 == 0) goto L_0x000f;
    L_0x000d:
        if (r1 != r3) goto L_0x0042;
    L_0x000f:
        r4.currentState = r3;
        r0 = r4.childProducts;
        r0 = r4.finishDecode(r0, r5);
        if (r3 != 0) goto L_0x001c;
    L_0x0019:
        r4.cleanup();
    L_0x001c:
        return r0;
    L_0x001d:
        r0 = move-exception;
        r1 = r4.log;	 Catch:{ all -> 0x003f }
        r3 = "Ignoring the exception caused by a closed session.";
        r1.debug(r3, r0);	 Catch:{ all -> 0x003f }
        r4.currentState = r2;
        r0 = r4.childProducts;
        r0 = r4.finishDecode(r0, r5);
        r4.cleanup();
        goto L_0x001c;
    L_0x0031:
        r0 = move-exception;
    L_0x0032:
        r4.currentState = r1;
        r2 = r4.childProducts;
        r4.finishDecode(r2, r5);
        if (r1 != 0) goto L_0x003e;
    L_0x003b:
        r4.cleanup();
    L_0x003e:
        throw r0;
    L_0x003f:
        r0 = move-exception;
        r1 = r2;
        goto L_0x0032;
    L_0x0042:
        r1 = r3;
        goto L_0x0005;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.mina.filter.codec.statemachine.DecodingStateMachine.finishDecode(org.apache.mina.filter.codec.ProtocolDecoderOutput):org.apache.mina.filter.codec.statemachine.DecodingState");
    }

    private void cleanup() {
        if (this.initialized) {
            this.initialized = false;
            this.childProducts.clear();
            try {
                destroy();
                return;
            } catch (Throwable e) {
                this.log.warn("Failed to destroy a decoding state machine.", e);
                return;
            }
        }
        throw new IllegalStateException();
    }

    private DecodingState getCurrentState() {
        DecodingState decodingState = this.currentState;
        if (decodingState != null) {
            return decodingState;
        }
        decodingState = init();
        this.initialized = true;
        return decodingState;
    }
}
