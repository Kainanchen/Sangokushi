package com.tencent.open.utils;

import android.support.v4.view.MotionEventCompat;

/* compiled from: ProGuard */
public final class ZipShort implements Cloneable {
    private int f1751a;

    public ZipShort(byte[] bArr) {
        this(bArr, 0);
    }

    public ZipShort(byte[] bArr, int i) {
        this.f1751a = (bArr[i + 1] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK;
        this.f1751a += bArr[i] & MotionEventCompat.ACTION_MASK;
    }

    public ZipShort(int i) {
        this.f1751a = i;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof ZipShort) && this.f1751a == ((ZipShort) obj).getValue()) {
            return true;
        }
        return false;
    }

    public byte[] getBytes() {
        return new byte[]{(byte) (this.f1751a & MotionEventCompat.ACTION_MASK), (byte) ((this.f1751a & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8)};
    }

    public int getValue() {
        return this.f1751a;
    }

    public int hashCode() {
        return this.f1751a;
    }
}
