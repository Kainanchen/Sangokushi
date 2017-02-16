package org.apache.mina.filter.codec.serialization;

import java.io.NotSerializableException;
import java.io.Serializable;
import org.apache.mina.core.buffer.IoBuffer;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.filter.codec.ProtocolEncoderAdapter;
import org.apache.mina.filter.codec.ProtocolEncoderOutput;

public class ObjectSerializationEncoder extends ProtocolEncoderAdapter {
    private int maxObjectSize;

    public ObjectSerializationEncoder() {
        this.maxObjectSize = Integer.MAX_VALUE;
    }

    public int getMaxObjectSize() {
        return this.maxObjectSize;
    }

    public void setMaxObjectSize(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxObjectSize: " + i);
        }
        this.maxObjectSize = i;
    }

    public void encode(IoSession ioSession, Object obj, ProtocolEncoderOutput protocolEncoderOutput) {
        if (obj instanceof Serializable) {
            IoBuffer allocate = IoBuffer.allocate(64);
            allocate.setAutoExpand(true);
            allocate.putObject(obj);
            int position = allocate.position() - 4;
            if (position > this.maxObjectSize) {
                throw new IllegalArgumentException("The encoded object is too big: " + position + " (> " + this.maxObjectSize + ')');
            }
            allocate.flip();
            protocolEncoderOutput.write(allocate);
            return;
        }
        throw new NotSerializableException();
    }
}
