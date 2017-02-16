package com.facebook.imagepipeline.memory;

import android.util.Log;
import com.facebook.common.p011d.Preconditions;
import com.facebook.common.p017h.CloseableReference;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
/* renamed from: com.facebook.imagepipeline.memory.n */
public final class NativePooledByteBufferOutputStream extends PooledByteBufferOutputStream {
    private final NativeMemoryChunkPool f2464a;
    private CloseableReference<NativeMemoryChunk> f2465b;
    private int f2466c;

    /* renamed from: com.facebook.imagepipeline.memory.n.a */
    public static class NativePooledByteBufferOutputStream extends RuntimeException {
        public NativePooledByteBufferOutputStream() {
            super("OutputStream no longer valid");
        }
    }

    public final /* synthetic */ PooledByteBuffer m2420c() {
        return m2418a();
    }

    public NativePooledByteBufferOutputStream(NativeMemoryChunkPool nativeMemoryChunkPool, int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.m1033a(z);
        this.f2464a = (NativeMemoryChunkPool) Preconditions.m1030a((Object) nativeMemoryChunkPool);
        this.f2466c = 0;
        this.f2465b = CloseableReference.m1094a(this.f2464a.m2354a(i), this.f2464a);
    }

    public final NativePooledByteBuffer m2418a() {
        m2417d();
        return new NativePooledByteBuffer(this.f2465b, this.f2466c);
    }

    public final int m2419b() {
        return this.f2466c;
    }

    public final void write(int i) {
        write(new byte[]{(byte) i});
    }

    public final void write(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new ArrayIndexOutOfBoundsException("length=" + bArr.length + "; regionStart=" + i + "; regionLength=" + i2);
        }
        m2417d();
        int i3 = this.f2466c + i2;
        m2417d();
        if (i3 > ((NativeMemoryChunk) this.f2465b.m1099a()).f2426b) {
            NativeMemoryChunk nativeMemoryChunk = (NativeMemoryChunk) this.f2464a.m2354a(i3);
            NativeMemoryChunk nativeMemoryChunk2 = (NativeMemoryChunk) this.f2465b.m1099a();
            int i4 = this.f2466c;
            Preconditions.m1030a((Object) nativeMemoryChunk);
            if (nativeMemoryChunk.f2425a == nativeMemoryChunk2.f2425a) {
                Log.w("NativeMemoryChunk", "Copying from NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(nativeMemoryChunk2)) + " to NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(nativeMemoryChunk)) + " which share the same address " + Long.toHexString(nativeMemoryChunk2.f2425a));
                Preconditions.m1033a(false);
            }
            if (nativeMemoryChunk.f2425a < nativeMemoryChunk2.f2425a) {
                synchronized (nativeMemoryChunk) {
                    synchronized (nativeMemoryChunk2) {
                        nativeMemoryChunk2.m2339a(nativeMemoryChunk, i4);
                    }
                }
            } else {
                synchronized (nativeMemoryChunk2) {
                    synchronized (nativeMemoryChunk) {
                        nativeMemoryChunk2.m2339a(nativeMemoryChunk, i4);
                    }
                }
            }
            this.f2465b.close();
            this.f2465b = CloseableReference.m1094a(nativeMemoryChunk, this.f2464a);
        }
        ((NativeMemoryChunk) this.f2465b.m1099a()).m2338a(this.f2466c, bArr, i, i2);
        this.f2466c += i2;
    }

    public final void close() {
        CloseableReference.m1097c(this.f2465b);
        this.f2465b = null;
        this.f2466c = -1;
        super.close();
    }

    private void m2417d() {
        if (!CloseableReference.m1095a(this.f2465b)) {
            throw new NativePooledByteBufferOutputStream();
        }
    }

    public NativePooledByteBufferOutputStream(NativeMemoryChunkPool nativeMemoryChunkPool) {
        this(nativeMemoryChunkPool, nativeMemoryChunkPool.f2459g[0]);
    }
}
