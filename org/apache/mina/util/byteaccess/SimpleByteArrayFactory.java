package org.apache.mina.util.byteaccess;

import org.apache.mina.core.buffer.IoBuffer;

public class SimpleByteArrayFactory implements ByteArrayFactory {

    /* renamed from: org.apache.mina.util.byteaccess.SimpleByteArrayFactory.1 */
    class C04741 extends BufferByteArray {
        C04741(IoBuffer ioBuffer) {
            super(ioBuffer);
        }

        public void free() {
        }
    }

    public ByteArray create(int i) {
        if (i >= 0) {
            return new C04741(IoBuffer.allocate(i));
        }
        throw new IllegalArgumentException("Buffer size must not be negative:" + i);
    }
}
