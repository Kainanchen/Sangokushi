package com.facebook.imagepipeline.memory;

import com.facebook.common.p011d.Throwables;
import java.io.InputStream;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* renamed from: com.facebook.imagepipeline.memory.m */
public final class NativePooledByteBufferFactory implements PooledByteBufferFactory {
    private final aa f2462a;
    private final NativeMemoryChunkPool f2463b;

    public final /* synthetic */ PooledByteBuffer m2411a(InputStream inputStream) {
        return m2408b(inputStream);
    }

    public final /* synthetic */ PooledByteBuffer m2412a(InputStream inputStream, int i) {
        return m2409b(inputStream, i);
    }

    public final /* synthetic */ PooledByteBuffer m2413a(byte[] bArr) {
        return m2410b(bArr);
    }

    public NativePooledByteBufferFactory(NativeMemoryChunkPool nativeMemoryChunkPool, aa aaVar) {
        this.f2463b = nativeMemoryChunkPool;
        this.f2462a = aaVar;
    }

    private NativePooledByteBuffer m2408b(InputStream inputStream) {
        NativePooledByteBufferOutputStream nativePooledByteBufferOutputStream = new NativePooledByteBufferOutputStream(this.f2463b);
        try {
            NativePooledByteBuffer a = m2407a(inputStream, nativePooledByteBufferOutputStream);
            return a;
        } finally {
            nativePooledByteBufferOutputStream.close();
        }
    }

    private NativePooledByteBuffer m2410b(byte[] bArr) {
        NativePooledByteBufferOutputStream nativePooledByteBufferOutputStream = new NativePooledByteBufferOutputStream(this.f2463b, bArr.length);
        try {
            nativePooledByteBufferOutputStream.write(bArr, 0, bArr.length);
            NativePooledByteBuffer a = nativePooledByteBufferOutputStream.m2418a();
            nativePooledByteBufferOutputStream.close();
            return a;
        } catch (Throwable e) {
            throw Throwables.m1039b(e);
        } catch (Throwable th) {
            nativePooledByteBufferOutputStream.close();
        }
    }

    private NativePooledByteBuffer m2409b(InputStream inputStream, int i) {
        NativePooledByteBufferOutputStream nativePooledByteBufferOutputStream = new NativePooledByteBufferOutputStream(this.f2463b, i);
        try {
            NativePooledByteBuffer a = m2407a(inputStream, nativePooledByteBufferOutputStream);
            return a;
        } finally {
            nativePooledByteBufferOutputStream.close();
        }
    }

    private NativePooledByteBuffer m2407a(InputStream inputStream, NativePooledByteBufferOutputStream nativePooledByteBufferOutputStream) {
        this.f2462a.m2363a(inputStream, nativePooledByteBufferOutputStream);
        return nativePooledByteBufferOutputStream.m2418a();
    }

    public final /* synthetic */ PooledByteBufferOutputStream m2414a() {
        return new NativePooledByteBufferOutputStream(this.f2463b);
    }
}
