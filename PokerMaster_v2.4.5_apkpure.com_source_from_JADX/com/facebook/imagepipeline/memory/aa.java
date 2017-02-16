package com.facebook.imagepipeline.memory;

import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.common.p011d.Preconditions;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PooledByteStreams */
public final class aa {
    private final int f2439a;
    private final ByteArrayPool f2440b;

    public aa(ByteArrayPool byteArrayPool) {
        this(byteArrayPool, (byte) 0);
    }

    private aa(ByteArrayPool byteArrayPool, byte b) {
        Preconditions.m1033a(true);
        this.f2439a = AccessibilityNodeInfoCompat.ACTION_COPY;
        this.f2440b = byteArrayPool;
    }

    public final long m2363a(InputStream inputStream, OutputStream outputStream) {
        long j = 0;
        byte[] bArr = (byte[]) this.f2440b.m2344a(this.f2439a);
        while (true) {
            int read = inputStream.read(bArr, 0, this.f2439a);
            if (read == -1) {
                break;
            }
            try {
                outputStream.write(bArr, 0, read);
                j += (long) read;
            } finally {
                j = this.f2440b;
                j.m2345a((Object) bArr);
            }
        }
        return j;
    }
}
