package org.apache.mina.util.byteaccess;

import org.apache.mina.core.buffer.IoBuffer;

public interface IoRelativeWriter {
    void put(byte b);

    void put(IoBuffer ioBuffer);

    void putChar(char c);

    void putDouble(double d);

    void putFloat(float f);

    void putInt(int i);

    void putLong(long j);

    void putShort(short s);
}
