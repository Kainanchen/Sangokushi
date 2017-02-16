package org.apache.mina.core.buffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class SimpleBufferAllocator implements IoBufferAllocator {

    private class SimpleBuffer extends AbstractIoBuffer {
        private ByteBuffer buf;

        protected SimpleBuffer(ByteBuffer byteBuffer) {
            super(SimpleBufferAllocator.this, byteBuffer.capacity());
            this.buf = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        protected SimpleBuffer(SimpleBuffer simpleBuffer, ByteBuffer byteBuffer) {
            super(simpleBuffer);
            this.buf = byteBuffer;
        }

        public ByteBuffer buf() {
            return this.buf;
        }

        protected void buf(ByteBuffer byteBuffer) {
            this.buf = byteBuffer;
        }

        protected IoBuffer duplicate0() {
            return new SimpleBuffer(this, this.buf.duplicate());
        }

        protected IoBuffer slice0() {
            return new SimpleBuffer(this, this.buf.slice());
        }

        protected IoBuffer asReadOnlyBuffer0() {
            return new SimpleBuffer(this, this.buf.asReadOnlyBuffer());
        }

        public byte[] array() {
            return this.buf.array();
        }

        public int arrayOffset() {
            return this.buf.arrayOffset();
        }

        public boolean hasArray() {
            return this.buf.hasArray();
        }

        public void free() {
        }
    }

    public IoBuffer allocate(int i, boolean z) {
        return wrap(allocateNioBuffer(i, z));
    }

    public ByteBuffer allocateNioBuffer(int i, boolean z) {
        if (z) {
            return ByteBuffer.allocateDirect(i);
        }
        return ByteBuffer.allocate(i);
    }

    public IoBuffer wrap(ByteBuffer byteBuffer) {
        return new SimpleBuffer(byteBuffer);
    }

    public void dispose() {
    }
}
