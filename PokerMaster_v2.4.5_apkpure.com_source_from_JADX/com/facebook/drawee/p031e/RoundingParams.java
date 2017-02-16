package com.facebook.drawee.p031e;

import java.util.Arrays;

/* renamed from: com.facebook.drawee.e.e */
public final class RoundingParams {
    RoundingParams f1473a;
    boolean f1474b;
    float[] f1475c;
    int f1476d;
    float f1477e;
    int f1478f;
    float f1479g;

    /* renamed from: com.facebook.drawee.e.e.a */
    public enum RoundingParams {
        OVERLAY_COLOR,
        BITMAP_ONLY
    }

    public RoundingParams() {
        this.f1473a = RoundingParams.BITMAP_ONLY;
        this.f1474b = false;
        this.f1475c = null;
        this.f1476d = 0;
        this.f1477e = 0.0f;
        this.f1478f = 0;
        this.f1479g = 0.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RoundingParams roundingParams = (RoundingParams) obj;
        if (this.f1474b == roundingParams.f1474b && this.f1476d == roundingParams.f1476d && Float.compare(roundingParams.f1477e, this.f1477e) == 0 && this.f1478f == roundingParams.f1478f && Float.compare(roundingParams.f1479g, this.f1479g) == 0 && this.f1473a == roundingParams.f1473a) {
            return Arrays.equals(this.f1475c, roundingParams.f1475c);
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        int hashCode = (this.f1473a != null ? this.f1473a.hashCode() : 0) * 31;
        if (this.f1474b) {
            i = 1;
        } else {
            i = 0;
        }
        hashCode = (i + hashCode) * 31;
        if (this.f1475c != null) {
            i = Arrays.hashCode(this.f1475c);
        } else {
            i = 0;
        }
        hashCode = (((i + hashCode) * 31) + this.f1476d) * 31;
        if (this.f1477e != 0.0f) {
            i = Float.floatToIntBits(this.f1477e);
        } else {
            i = 0;
        }
        i = (((i + hashCode) * 31) + this.f1478f) * 31;
        if (this.f1479g != 0.0f) {
            i2 = Float.floatToIntBits(this.f1479g);
        }
        return i + i2;
    }
}
