package com.facebook.imagepipeline.memory;

import android.util.Log;
import com.facebook.common.p011d.DoNotStrip;
import com.facebook.common.p011d.Preconditions;
import com.facebook.imagepipeline.nativecode.ImagePipelineNativeLoader;
import java.io.Closeable;

@DoNotStrip
public class NativeMemoryChunk implements Closeable {
    final long f2425a;
    final int f2426b;
    private boolean f2427c;

    @DoNotStrip
    private static native long nativeAllocate(int i);

    @DoNotStrip
    private static native void nativeCopyFromByteArray(long j, byte[] bArr, int i, int i2);

    @DoNotStrip
    private static native void nativeCopyToByteArray(long j, byte[] bArr, int i, int i2);

    @DoNotStrip
    private static native void nativeFree(long j);

    @DoNotStrip
    private static native void nativeMemcpy(long j, long j2, int i);

    @DoNotStrip
    private static native byte nativeReadByte(long j);

    static {
        ImagePipelineNativeLoader.m2433a();
    }

    public NativeMemoryChunk(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.m1033a(z);
        this.f2426b = i;
        this.f2425a = nativeAllocate(this.f2426b);
        this.f2427c = false;
    }

    public NativeMemoryChunk() {
        this.f2426b = 0;
        this.f2425a = 0;
        this.f2427c = true;
    }

    public synchronized void close() {
        if (!this.f2427c) {
            this.f2427c = true;
            nativeFree(this.f2425a);
        }
    }

    public final synchronized boolean m2340a() {
        return this.f2427c;
    }

    public final synchronized int m2338a(int i, byte[] bArr, int i2, int i3) {
        int a;
        Preconditions.m1030a((Object) bArr);
        Preconditions.m1035b(!m2340a());
        a = m2335a(i, i3);
        m2336a(i, bArr.length, i2, a);
        nativeCopyFromByteArray(this.f2425a + ((long) i), bArr, i2, a);
        return a;
    }

    public final synchronized int m2341b(int i, byte[] bArr, int i2, int i3) {
        int a;
        Preconditions.m1030a((Object) bArr);
        Preconditions.m1035b(!m2340a());
        a = m2335a(i, i3);
        m2336a(i, bArr.length, i2, a);
        nativeCopyToByteArray(this.f2425a + ((long) i), bArr, i2, a);
        return a;
    }

    public final synchronized byte m2337a(int i) {
        byte nativeReadByte;
        boolean z = true;
        synchronized (this) {
            boolean z2;
            if (m2340a()) {
                z2 = false;
            } else {
                z2 = true;
            }
            Preconditions.m1035b(z2);
            if (i >= 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            Preconditions.m1033a(z2);
            if (i >= this.f2426b) {
                z = false;
            }
            Preconditions.m1033a(z);
            nativeReadByte = nativeReadByte(this.f2425a + ((long) i));
        }
        return nativeReadByte;
    }

    final void m2339a(NativeMemoryChunk nativeMemoryChunk, int i) {
        boolean z;
        boolean z2 = true;
        if (m2340a()) {
            z = false;
        } else {
            z = true;
        }
        Preconditions.m1035b(z);
        if (nativeMemoryChunk.m2340a()) {
            z2 = false;
        }
        Preconditions.m1035b(z2);
        m2336a(0, nativeMemoryChunk.f2426b, 0, i);
        nativeMemcpy(nativeMemoryChunk.f2425a + 0, this.f2425a + 0, i);
    }

    protected void finalize() {
        if (!m2340a()) {
            Log.w("NativeMemoryChunk", "finalize: Chunk " + Integer.toHexString(System.identityHashCode(this)) + " still active. Underlying address = " + Long.toHexString(this.f2425a));
            try {
                close();
            } finally {
                super.finalize();
            }
        }
    }

    private int m2335a(int i, int i2) {
        return Math.min(Math.max(0, this.f2426b - i), i2);
    }

    private void m2336a(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2 = true;
        Preconditions.m1033a(i4 >= 0);
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.m1033a(z);
        if (i3 >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.m1033a(z);
        if (i + i4 <= this.f2426b) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.m1033a(z);
        if (i3 + i4 > i2) {
            z2 = false;
        }
        Preconditions.m1033a(z2);
    }
}
