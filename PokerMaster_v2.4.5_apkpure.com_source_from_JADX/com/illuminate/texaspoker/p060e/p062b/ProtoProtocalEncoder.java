package com.illuminate.texaspoker.p060e.p062b;

import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolEncoderAdapter;
import org.apache.mina.filter.codec.ProtocolEncoderOutput;

/* renamed from: com.illuminate.texaspoker.e.b.d */
public final class ProtoProtocalEncoder extends ProtocolEncoderAdapter {
    public final void encode(IoSession ioSession, Object obj, ProtocolEncoderOutput protocolEncoderOutput) {
        byte[] bArr = (byte[]) obj;
        r0 = new byte[5];
        int length = bArr.length + 5;
        r0[0] = (byte) -2;
        r0[1] = (byte) ((ViewCompat.MEASURED_STATE_MASK & length) >> 24);
        r0[2] = (byte) ((16711680 & length) >> 16);
        r0[3] = (byte) ((MotionEventCompat.ACTION_POINTER_INDEX_MASK & length) >> 8);
        r0[4] = (byte) (length & MotionEventCompat.ACTION_MASK);
        IoBuffer allocate = IoBuffer.allocate(length);
        allocate.setAutoExpand(true);
        if (bArr != null) {
            allocate.put(r0);
            allocate.put(bArr);
        }
        allocate.flip();
        protocolEncoderOutput.write(allocate);
    }
}
