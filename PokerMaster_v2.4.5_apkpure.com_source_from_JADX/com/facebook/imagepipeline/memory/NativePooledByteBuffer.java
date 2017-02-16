package com.facebook.imagepipeline.memory;

import com.facebook.common.p011d.Preconditions;
import com.facebook.common.p017h.CloseableReference;
import com.facebook.imagepipeline.memory.PooledByteBuffer.PooledByteBuffer;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* renamed from: com.facebook.imagepipeline.memory.l */
public final class NativePooledByteBuffer implements PooledByteBuffer {
    @GuardedBy("this")
    CloseableReference<NativeMemoryChunk> f2460a;
    private final int f2461b;

    public NativePooledByteBuffer(CloseableReference<NativeMemoryChunk> closeableReference, int i) {
        Preconditions.m1030a((Object) closeableReference);
        boolean z = i >= 0 && i <= ((NativeMemoryChunk) closeableReference.m1099a()).f2426b;
        Preconditions.m1033a(z);
        this.f2460a = closeableReference.m1100b();
        this.f2461b = i;
    }

    public final synchronized int m2400a() {
        m2398c();
        return this.f2461b;
    }

    public final synchronized byte m2399a(int i) {
        byte a;
        boolean z = true;
        synchronized (this) {
            boolean z2;
            m2398c();
            if (i >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            Preconditions.m1033a(z2);
            if (i >= this.f2461b) {
                z = false;
            }
            Preconditions.m1033a(z);
            a = ((NativeMemoryChunk) this.f2460a.m1099a()).m2337a(i);
        }
        return a;
    }

    public final synchronized void m2401a(int i, byte[] bArr, int i2, int i3) {
        m2398c();
        Preconditions.m1033a(i + i3 <= this.f2461b);
        ((NativeMemoryChunk) this.f2460a.m1099a()).m2341b(i, bArr, i2, i3);
    }

    public final synchronized boolean m2402b() {
        return !CloseableReference.m1095a(this.f2460a);
    }

    public final synchronized void close() {
        CloseableReference.m1097c(this.f2460a);
        this.f2460a = null;
    }

    private synchronized void m2398c() {
        if (m2402b()) {
            throw new PooledByteBuffer();
        }
    }
}
