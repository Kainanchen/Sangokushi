package org.apache.mina.filter.codec.serialization;

import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.StreamCorruptedException;
import org.apache.mina.core.buffer.IoBuffer;

public class ObjectSerializationInputStream extends InputStream implements ObjectInput {
    private final ClassLoader classLoader;
    private final DataInputStream in;
    private int maxObjectSize;

    public ObjectSerializationInputStream(InputStream inputStream) {
        this(inputStream, null);
    }

    public ObjectSerializationInputStream(InputStream inputStream, ClassLoader classLoader) {
        this.maxObjectSize = AccessibilityNodeInfoCompat.ACTION_DISMISS;
        if (inputStream == null) {
            throw new IllegalArgumentException("in");
        }
        if (classLoader == null) {
            classLoader = Thread.currentThread().getContextClassLoader();
        }
        if (inputStream instanceof DataInputStream) {
            this.in = (DataInputStream) inputStream;
        } else {
            this.in = new DataInputStream(inputStream);
        }
        this.classLoader = classLoader;
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

    public int read() {
        return this.in.read();
    }

    public Object readObject() {
        int readInt = this.in.readInt();
        if (readInt <= 0) {
            throw new StreamCorruptedException("Invalid objectSize: " + readInt);
        } else if (readInt > this.maxObjectSize) {
            throw new StreamCorruptedException("ObjectSize too big: " + readInt + " (expected: <= " + this.maxObjectSize + ')');
        } else {
            IoBuffer allocate = IoBuffer.allocate(readInt + 4, false);
            allocate.putInt(readInt);
            this.in.readFully(allocate.array(), 4, readInt);
            allocate.position(0);
            allocate.limit(readInt + 4);
            return allocate.getObject(this.classLoader);
        }
    }

    public boolean readBoolean() {
        return this.in.readBoolean();
    }

    public byte readByte() {
        return this.in.readByte();
    }

    public char readChar() {
        return this.in.readChar();
    }

    public double readDouble() {
        return this.in.readDouble();
    }

    public float readFloat() {
        return this.in.readFloat();
    }

    public void readFully(byte[] bArr) {
        this.in.readFully(bArr);
    }

    public void readFully(byte[] bArr, int i, int i2) {
        this.in.readFully(bArr, i, i2);
    }

    public int readInt() {
        return this.in.readInt();
    }

    @Deprecated
    public String readLine() {
        return this.in.readLine();
    }

    public long readLong() {
        return this.in.readLong();
    }

    public short readShort() {
        return this.in.readShort();
    }

    public String readUTF() {
        return this.in.readUTF();
    }

    public int readUnsignedByte() {
        return this.in.readUnsignedByte();
    }

    public int readUnsignedShort() {
        return this.in.readUnsignedShort();
    }

    public int skipBytes(int i) {
        return this.in.skipBytes(i);
    }
}
