package com.facebook.imagepipeline.memory;

import java.io.Closeable;

/* renamed from: com.facebook.imagepipeline.memory.w */
public interface PooledByteBuffer extends Closeable {

    /* renamed from: com.facebook.imagepipeline.memory.w.a */
    public static class PooledByteBuffer extends RuntimeException {
        public PooledByteBuffer() {
            super("Invalid bytebuf. Already closed");
        }
    }

    byte m2394a(int i);

    int m2395a();

    void m2396a(int i, byte[] bArr, int i2, int i3);

    boolean m2397b();
}
