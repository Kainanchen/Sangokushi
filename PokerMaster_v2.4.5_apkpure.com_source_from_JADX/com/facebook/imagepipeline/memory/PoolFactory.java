package com.facebook.imagepipeline.memory;

import com.facebook.common.p011d.Preconditions;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
/* renamed from: com.facebook.imagepipeline.memory.s */
public final class PoolFactory {
    public final PoolConfig f2485a;
    public FlexByteArrayPool f2486b;
    private BitmapPool f2487c;
    private NativeMemoryChunkPool f2488d;
    private PooledByteBufferFactory f2489e;
    private aa f2490f;
    private ByteArrayPool f2491g;

    public PoolFactory(PoolConfig poolConfig) {
        this.f2485a = (PoolConfig) Preconditions.m1030a((Object) poolConfig);
    }

    public final BitmapPool m2424a() {
        if (this.f2487c == null) {
            this.f2487c = new BitmapPool(this.f2485a.f2480d, this.f2485a.f2477a, this.f2485a.f2478b);
        }
        return this.f2487c;
    }

    public final int m2425b() {
        return this.f2485a.f2479c.f2497f;
    }

    public final PooledByteBufferFactory m2426c() {
        if (this.f2489e == null) {
            if (this.f2488d == null) {
                this.f2488d = new NativeMemoryChunkPool(this.f2485a.f2480d, this.f2485a.f2481e, this.f2485a.f2482f);
            }
            this.f2489e = new NativePooledByteBufferFactory(this.f2488d, m2427d());
        }
        return this.f2489e;
    }

    public final aa m2427d() {
        if (this.f2490f == null) {
            this.f2490f = new aa(m2428e());
        }
        return this.f2490f;
    }

    public final ByteArrayPool m2428e() {
        if (this.f2491g == null) {
            this.f2491g = new GenericByteArrayPool(this.f2485a.f2480d, this.f2485a.f2483g, this.f2485a.f2484h);
        }
        return this.f2491g;
    }
}
