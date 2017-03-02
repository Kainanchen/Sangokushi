package com.tencent.open.utils;

import android.support.v4.view.MotionEventCompat;

/* compiled from: ProGuard */
public final class ZipLong implements Cloneable {
    private long f1750a;

    public ZipLong(byte[] bArr) {
        this(bArr, 0);
    }

    public ZipLong(byte[] bArr, int i) {
        this.f1750a = ((long) (bArr[i + 3] << 24)) & 4278190080L;
        this.f1750a += (long) ((bArr[i + 2] << 16) & 16711680);
        this.f1750a += (long) ((bArr[i + 1] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK);
        this.f1750a += (long) (bArr[i] & MotionEventCompat.ACTION_MASK);
    }

    public ZipLong(long j) {
        this.f1750a = j;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ZipLong) && this.f1750a == ((ZipLong) obj).getValue()) {
            return true;
        }
        return false;
    }

    public byte[] getBytes() {
        return new byte[]{(byte) ((int) (this.f1750a & 255)), (byte) ((int) ((this.f1750a & 65280) >> 8)), (byte) ((int) ((this.f1750a & 16711680) >> 16)), (byte) ((int) ((this.f1750a & 4278190080L) >> 24))};
    }

    public long getValue() {
        return this.f1750a;
    }

    public int hashCode() {
        return (int) this.f1750a;
    }
}
