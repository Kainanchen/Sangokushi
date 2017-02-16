package org.apache.mina.filter.codec.serialization;

import java.io.DataOutputStream;
import java.io.ObjectOutput;
import java.io.OutputStream;
import org.apache.mina.core.buffer.IoBuffer;

public class ObjectSerializationOutputStream extends OutputStream implements ObjectOutput {
    private int maxObjectSize;
    private final DataOutputStream out;

    public ObjectSerializationOutputStream(OutputStream outputStream) {
        this.maxObjectSize = Integer.MAX_VALUE;
        if (outputStream == null) {
            throw new IllegalArgumentException("out");
        } else if (outputStream instanceof DataOutputStream) {
            this.out = (DataOutputStream) outputStream;
        } else {
            this.out = new DataOutputStream(outputStream);
        }
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

    public void close() {
        this.out.close();
    }

    public void flush() {
        this.out.flush();
    }

    public void write(int i) {
        this.out.write(i);
    }

    public void write(byte[] bArr) {
        this.out.write(bArr);
    }

    public void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
    }

    public void writeObject(Object obj) {
        IoBuffer allocate = IoBuffer.allocate(64, false);
        allocate.setAutoExpand(true);
        allocate.putObject(obj);
        int position = allocate.position() - 4;
        if (position > this.maxObjectSize) {
            throw new IllegalArgumentException("The encoded object is too big: " + position + " (> " + this.maxObjectSize + ')');
        }
        this.out.write(allocate.array(), 0, allocate.position());
    }

    public void writeBoolean(boolean z) {
        this.out.writeBoolean(z);
    }

    public void writeByte(int i) {
        this.out.writeByte(i);
    }

    public void writeBytes(String str) {
        this.out.writeBytes(str);
    }

    public void writeChar(int i) {
        this.out.writeChar(i);
    }

    public void writeChars(String str) {
        this.out.writeChars(str);
    }

    public void writeDouble(double d) {
        this.out.writeDouble(d);
    }

    public void writeFloat(float f) {
        this.out.writeFloat(f);
    }

    public void writeInt(int i) {
        this.out.writeInt(i);
    }

    public void writeLong(long j) {
        this.out.writeLong(j);
    }

    public void writeShort(int i) {
        this.out.writeShort(i);
    }

    public void writeUTF(String str) {
        this.out.writeUTF(str);
    }
}
