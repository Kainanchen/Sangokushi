package org.apache.mina.core.buffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class CachedBufferAllocator implements IoBufferAllocator {
    private static final int DEFAULT_MAX_CACHED_BUFFER_SIZE = 262144;
    private static final int DEFAULT_MAX_POOL_SIZE = 8;
    private final ThreadLocal<Map<Integer, Queue<CachedBuffer>>> directBuffers;
    private final ThreadLocal<Map<Integer, Queue<CachedBuffer>>> heapBuffers;
    private final int maxCachedBufferSize;
    private final int maxPoolSize;

    /* renamed from: org.apache.mina.core.buffer.CachedBufferAllocator.1 */
    class C03991 extends ThreadLocal<Map<Integer, Queue<CachedBuffer>>> {
        C03991() {
        }

        protected Map<Integer, Queue<CachedBuffer>> initialValue() {
            return CachedBufferAllocator.this.newPoolMap();
        }
    }

    /* renamed from: org.apache.mina.core.buffer.CachedBufferAllocator.2 */
    class C04002 extends ThreadLocal<Map<Integer, Queue<CachedBuffer>>> {
        C04002() {
        }

        protected Map<Integer, Queue<CachedBuffer>> initialValue() {
            return CachedBufferAllocator.this.newPoolMap();
        }
    }

    private class CachedBuffer extends AbstractIoBuffer {
        private ByteBuffer buf;
        private final Thread ownerThread;

        protected CachedBuffer(ByteBuffer byteBuffer) {
            super(CachedBufferAllocator.this, byteBuffer.capacity());
            this.ownerThread = Thread.currentThread();
            this.buf = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        protected CachedBuffer(CachedBuffer cachedBuffer, ByteBuffer byteBuffer) {
            super(cachedBuffer);
            this.ownerThread = Thread.currentThread();
            this.buf = byteBuffer;
        }

        public ByteBuffer buf() {
            if (this.buf != null) {
                return this.buf;
            }
            throw new IllegalStateException("Buffer has been freed already.");
        }

        protected void buf(ByteBuffer byteBuffer) {
            ByteBuffer byteBuffer2 = this.buf;
            this.buf = byteBuffer;
            free(byteBuffer2);
        }

        protected IoBuffer duplicate0() {
            return new CachedBuffer(this, buf().duplicate());
        }

        protected IoBuffer slice0() {
            return new CachedBuffer(this, buf().slice());
        }

        protected IoBuffer asReadOnlyBuffer0() {
            return new CachedBuffer(this, buf().asReadOnlyBuffer());
        }

        public byte[] array() {
            return buf().array();
        }

        public int arrayOffset() {
            return buf().arrayOffset();
        }

        public boolean hasArray() {
            return buf().hasArray();
        }

        public void free() {
            free(this.buf);
            this.buf = null;
        }

        private void free(ByteBuffer byteBuffer) {
            if (byteBuffer == null) {
                return;
            }
            if ((CachedBufferAllocator.this.maxCachedBufferSize == 0 || byteBuffer.capacity() <= CachedBufferAllocator.this.maxCachedBufferSize) && !byteBuffer.isReadOnly() && !isDerived() && Thread.currentThread() == this.ownerThread) {
                Queue queue;
                if (byteBuffer.isDirect()) {
                    queue = (Queue) ((Map) CachedBufferAllocator.this.directBuffers.get()).get(Integer.valueOf(byteBuffer.capacity()));
                } else {
                    queue = (Queue) ((Map) CachedBufferAllocator.this.heapBuffers.get()).get(Integer.valueOf(byteBuffer.capacity()));
                }
                if (queue == null) {
                    return;
                }
                if (CachedBufferAllocator.this.maxPoolSize == 0 || queue.size() < CachedBufferAllocator.this.maxPoolSize) {
                    queue.offer(new CachedBuffer(byteBuffer));
                }
            }
        }
    }

    public CachedBufferAllocator() {
        this(DEFAULT_MAX_POOL_SIZE, DEFAULT_MAX_CACHED_BUFFER_SIZE);
    }

    public CachedBufferAllocator(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("maxPoolSize: " + i);
        } else if (i2 < 0) {
            throw new IllegalArgumentException("maxCachedBufferSize: " + i2);
        } else {
            this.maxPoolSize = i;
            this.maxCachedBufferSize = i2;
            this.heapBuffers = new C03991();
            this.directBuffers = new C04002();
        }
    }

    public int getMaxPoolSize() {
        return this.maxPoolSize;
    }

    public int getMaxCachedBufferSize() {
        return this.maxCachedBufferSize;
    }

    Map<Integer, Queue<CachedBuffer>> newPoolMap() {
        Map<Integer, Queue<CachedBuffer>> hashMap = new HashMap();
        for (int i = 0; i < 31; i++) {
            hashMap.put(Integer.valueOf(1 << i), new ConcurrentLinkedQueue());
        }
        hashMap.put(Integer.valueOf(0), new ConcurrentLinkedQueue());
        hashMap.put(Integer.valueOf(Integer.MAX_VALUE), new ConcurrentLinkedQueue());
        return hashMap;
    }

    public IoBuffer allocate(int i, boolean z) {
        IoBuffer ioBuffer;
        int normalizeCapacity = IoBuffer.normalizeCapacity(i);
        if (this.maxCachedBufferSize == 0 || normalizeCapacity <= this.maxCachedBufferSize) {
            Queue queue;
            if (z) {
                queue = (Queue) ((Map) this.directBuffers.get()).get(Integer.valueOf(normalizeCapacity));
            } else {
                queue = (Queue) ((Map) this.heapBuffers.get()).get(Integer.valueOf(normalizeCapacity));
            }
            ioBuffer = (IoBuffer) queue.poll();
            if (ioBuffer != null) {
                ioBuffer.clear();
                ioBuffer.setAutoExpand(false);
                ioBuffer.order(ByteOrder.BIG_ENDIAN);
            } else if (z) {
                ioBuffer = wrap(ByteBuffer.allocateDirect(normalizeCapacity));
            } else {
                ioBuffer = wrap(ByteBuffer.allocate(normalizeCapacity));
            }
        } else if (z) {
            ioBuffer = wrap(ByteBuffer.allocateDirect(normalizeCapacity));
        } else {
            ioBuffer = wrap(ByteBuffer.allocate(normalizeCapacity));
        }
        ioBuffer.limit(i);
        return ioBuffer;
    }

    public ByteBuffer allocateNioBuffer(int i, boolean z) {
        return allocate(i, z).buf();
    }

    public IoBuffer wrap(ByteBuffer byteBuffer) {
        return new CachedBuffer(byteBuffer);
    }

    public void dispose() {
    }
}
