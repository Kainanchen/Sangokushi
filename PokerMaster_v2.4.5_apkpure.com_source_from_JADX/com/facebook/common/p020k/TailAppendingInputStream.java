package com.facebook.common.p020k;

import android.support.v4.view.MotionEventCompat;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.facebook.common.k.b */
public final class TailAppendingInputStream extends FilterInputStream {
    private final byte[] f1149a;
    private int f1150b;
    private int f1151c;

    public TailAppendingInputStream(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        if (inputStream == null) {
            throw new NullPointerException();
        } else if (bArr == null) {
            throw new NullPointerException();
        } else {
            this.f1149a = bArr;
        }
    }

    public final int read() {
        int read = this.in.read();
        return read != -1 ? read : m1116a();
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = this.in.read(bArr, i, i2);
        if (read != -1) {
            return read;
        }
        if (i2 == 0) {
            return 0;
        }
        read = 0;
        while (read < i2) {
            int a = m1116a();
            if (a == -1) {
                break;
            }
            bArr[i + read] = (byte) a;
            read++;
        }
        return read <= 0 ? -1 : read;
    }

    public final void reset() {
        if (this.in.markSupported()) {
            this.in.reset();
            this.f1150b = this.f1151c;
            return;
        }
        throw new IOException("mark is not supported");
    }

    public final void mark(int i) {
        if (this.in.markSupported()) {
            super.mark(i);
            this.f1151c = this.f1150b;
        }
    }

    private int m1116a() {
        if (this.f1150b >= this.f1149a.length) {
            return -1;
        }
        byte[] bArr = this.f1149a;
        int i = this.f1150b;
        this.f1150b = i + 1;
        return bArr[i] & MotionEventCompat.ACTION_MASK;
    }
}
