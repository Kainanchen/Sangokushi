package com.facebook.imagepipeline.memory;

import android.support.v4.view.MotionEventCompat;
import com.facebook.common.p011d.Preconditions;
import java.io.InputStream;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
/* renamed from: com.facebook.imagepipeline.memory.y */
public final class PooledByteBufferInputStream extends InputStream {
    final PooledByteBuffer f2504a;
    int f2505b;
    int f2506c;

    public PooledByteBufferInputStream(PooledByteBuffer pooledByteBuffer) {
        boolean z;
        if (pooledByteBuffer.m2397b()) {
            z = false;
        } else {
            z = true;
        }
        Preconditions.m1033a(z);
        this.f2504a = (PooledByteBuffer) Preconditions.m1030a((Object) pooledByteBuffer);
        this.f2505b = 0;
        this.f2506c = 0;
    }

    public final int available() {
        return this.f2504a.m2395a() - this.f2505b;
    }

    public final void mark(int i) {
        this.f2506c = this.f2505b;
    }

    public final boolean markSupported() {
        return true;
    }

    public final int read() {
        if (available() <= 0) {
            return -1;
        }
        PooledByteBuffer pooledByteBuffer = this.f2504a;
        int i = this.f2505b;
        this.f2505b = i + 1;
        return pooledByteBuffer.m2394a(i) & MotionEventCompat.ACTION_MASK;
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            throw new ArrayIndexOutOfBoundsException("length=" + bArr.length + "; regionStart=" + i + "; regionLength=" + i2);
        }
        int available = available();
        if (available <= 0) {
            return -1;
        }
        if (i2 <= 0) {
            return 0;
        }
        available = Math.min(available, i2);
        this.f2504a.m2396a(this.f2505b, bArr, i, available);
        this.f2505b += available;
        return available;
    }

    public final void reset() {
        this.f2505b = this.f2506c;
    }

    public final long skip(long j) {
        Preconditions.m1033a(j >= 0);
        int min = Math.min((int) j, available());
        this.f2505b += min;
        return (long) min;
    }
}
