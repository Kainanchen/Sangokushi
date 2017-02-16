package com.facebook.imagepipeline.p042d;

import com.facebook.common.p021l.HashCodeUtil;

/* renamed from: com.facebook.imagepipeline.d.d */
public final class ResizeOptions {
    public final int f1981a;
    public final int f1982b;
    public final float f1983c;
    public final float f1984d;

    public final int hashCode() {
        return HashCodeUtil.m1117a(this.f1981a, this.f1982b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ResizeOptions)) {
            return false;
        }
        ResizeOptions resizeOptions = (ResizeOptions) obj;
        if (this.f1981a == resizeOptions.f1981a && this.f1982b == resizeOptions.f1982b) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return String.format(null, "%dx%d", new Object[]{Integer.valueOf(this.f1981a), Integer.valueOf(this.f1982b)});
    }
}
