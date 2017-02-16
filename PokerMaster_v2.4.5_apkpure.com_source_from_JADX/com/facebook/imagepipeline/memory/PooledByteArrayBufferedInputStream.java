package com.facebook.imagepipeline.memory;

import android.support.v4.view.MotionEventCompat;
import com.facebook.common.p011d.Preconditions;
import com.facebook.common.p014e.FLog;
import com.facebook.common.p017h.ResourceReleaser;
import java.io.IOException;
import java.io.InputStream;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
/* renamed from: com.facebook.imagepipeline.memory.v */
public final class PooledByteArrayBufferedInputStream extends InputStream {
    private final InputStream f2498a;
    private final byte[] f2499b;
    private final ResourceReleaser<byte[]> f2500c;
    private int f2501d;
    private int f2502e;
    private boolean f2503f;

    public PooledByteArrayBufferedInputStream(InputStream inputStream, byte[] bArr, ResourceReleaser<byte[]> resourceReleaser) {
        this.f2498a = (InputStream) Preconditions.m1030a((Object) inputStream);
        this.f2499b = (byte[]) Preconditions.m1030a((Object) bArr);
        this.f2500c = (ResourceReleaser) Preconditions.m1030a((Object) resourceReleaser);
        this.f2501d = 0;
        this.f2502e = 0;
        this.f2503f = false;
    }

    public final int read() {
        Preconditions.m1035b(this.f2502e <= this.f2501d);
        m2430b();
        if (!m2429a()) {
            return -1;
        }
        byte[] bArr = this.f2499b;
        int i = this.f2502e;
        this.f2502e = i + 1;
        return bArr[i] & MotionEventCompat.ACTION_MASK;
    }

    public final int read(byte[] bArr, int i, int i2) {
        Preconditions.m1035b(this.f2502e <= this.f2501d);
        m2430b();
        if (!m2429a()) {
            return -1;
        }
        int min = Math.min(this.f2501d - this.f2502e, i2);
        System.arraycopy(this.f2499b, this.f2502e, bArr, i, min);
        this.f2502e += min;
        return min;
    }

    public final int available() {
        Preconditions.m1035b(this.f2502e <= this.f2501d);
        m2430b();
        return (this.f2501d - this.f2502e) + this.f2498a.available();
    }

    public final void close() {
        if (!this.f2503f) {
            this.f2503f = true;
            this.f2500c.m1091a(this.f2499b);
            super.close();
        }
    }

    public final long skip(long j) {
        Preconditions.m1035b(this.f2502e <= this.f2501d);
        m2430b();
        int i = this.f2501d - this.f2502e;
        if (((long) i) >= j) {
            this.f2502e = (int) (((long) this.f2502e) + j);
            return j;
        }
        this.f2502e = this.f2501d;
        return ((long) i) + this.f2498a.skip(j - ((long) i));
    }

    private boolean m2429a() {
        if (this.f2502e < this.f2501d) {
            return true;
        }
        int read = this.f2498a.read(this.f2499b);
        if (read <= 0) {
            return false;
        }
        this.f2501d = read;
        this.f2502e = 0;
        return true;
    }

    private void m2430b() {
        if (this.f2503f) {
            throw new IOException("stream already closed");
        }
    }

    protected final void finalize() {
        if (!this.f2503f) {
            FLog.m1048a("PooledByteInputStream", "Finalized without closing");
            close();
        }
        super.finalize();
    }
}
