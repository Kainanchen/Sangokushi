package com.facebook.imagepipeline.memory;

import java.io.InputStream;

/* renamed from: com.facebook.imagepipeline.memory.x */
public interface PooledByteBufferFactory {
    PooledByteBuffer m2403a(InputStream inputStream);

    PooledByteBuffer m2404a(InputStream inputStream, int i);

    PooledByteBuffer m2405a(byte[] bArr);

    PooledByteBufferOutputStream m2406a();
}
