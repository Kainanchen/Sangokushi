package org.apache.mina.util.byteaccess;

import java.util.ArrayList;
import java.util.Stack;
import org.apache.mina.core.buffer.IoBuffer;

public class ByteArrayPool implements ByteArrayFactory {
    private final int MAX_BITS;
    private final boolean direct;
    private int freeBufferCount;
    private ArrayList<Stack<DirectBufferByteArray>> freeBuffers;
    private long freeMemory;
    private boolean freed;
    private final int maxFreeBuffers;
    private final int maxFreeMemory;

    private class DirectBufferByteArray extends BufferByteArray {
        private boolean freed;

        public DirectBufferByteArray(IoBuffer ioBuffer) {
            super(ioBuffer);
        }

        public void setFreed(boolean z) {
            this.freed = z;
        }

        public void free() {
            synchronized (this) {
                if (this.freed) {
                    throw new IllegalStateException("Already freed.");
                }
                this.freed = true;
            }
            int access$000 = ByteArrayPool.this.bits(last());
            synchronized (ByteArrayPool.this) {
                if (ByteArrayPool.this.freeBuffers == null || ByteArrayPool.this.freeBufferCount >= ByteArrayPool.this.maxFreeBuffers || ByteArrayPool.this.freeMemory + ((long) last()) > ((long) ByteArrayPool.this.maxFreeMemory)) {
                    return;
                }
                ((Stack) ByteArrayPool.this.freeBuffers.get(access$000)).push(this);
                ByteArrayPool.this.freeBufferCount = ByteArrayPool.this.freeBufferCount + 1;
                ByteArrayPool.this.freeMemory = ByteArrayPool.this.freeMemory + ((long) last());
            }
        }
    }

    public ByteArrayPool(boolean z, int i, int i2) {
        this.MAX_BITS = 32;
        this.freeBufferCount = 0;
        this.freeMemory = 0;
        this.direct = z;
        this.freeBuffers = new ArrayList();
        for (int i3 = 0; i3 < 32; i3++) {
            this.freeBuffers.add(new Stack());
        }
        this.maxFreeBuffers = i;
        this.maxFreeMemory = i2;
        this.freed = false;
    }

    public ByteArray create(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Buffer size must be at least 1: " + i);
        }
        int bits = bits(i);
        synchronized (this) {
            if (((Stack) this.freeBuffers.get(bits)).isEmpty()) {
                IoBuffer allocate = IoBuffer.allocate(1 << bits, this.direct);
                allocate.limit(i);
                ByteArray directBufferByteArray = new DirectBufferByteArray(allocate);
                directBufferByteArray.setFreed(false);
                return directBufferByteArray;
            }
            DirectBufferByteArray directBufferByteArray2 = (DirectBufferByteArray) ((Stack) this.freeBuffers.get(bits)).pop();
            directBufferByteArray2.setFreed(false);
            directBufferByteArray2.getSingleIoBuffer().limit(i);
            return directBufferByteArray2;
        }
    }

    private int bits(int i) {
        int i2 = 0;
        while ((1 << i2) < i) {
            i2++;
        }
        return i2;
    }

    public void free() {
        synchronized (this) {
            if (this.freed) {
                throw new IllegalStateException("Already freed.");
            }
            this.freed = true;
            this.freeBuffers.clear();
            this.freeBuffers = null;
        }
    }
}
