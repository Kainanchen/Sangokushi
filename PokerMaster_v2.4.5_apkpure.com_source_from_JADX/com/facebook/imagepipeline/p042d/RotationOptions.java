package com.facebook.imagepipeline.p042d;

import com.facebook.common.p021l.HashCodeUtil;

/* renamed from: com.facebook.imagepipeline.d.e */
public final class RotationOptions {
    public final int f1985a;
    public final boolean f1986b;

    public RotationOptions(boolean z) {
        this.f1985a = -1;
        this.f1986b = z;
    }

    public final boolean m1929a() {
        return this.f1985a == -1;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        Integer valueOf = Integer.valueOf(this.f1985a);
        Boolean valueOf2 = Boolean.valueOf(this.f1986b);
        if (valueOf == null) {
            i = 0;
        } else {
            i = valueOf.hashCode();
        }
        if (valueOf2 != null) {
            i2 = valueOf2.hashCode();
        }
        return HashCodeUtil.m1117a(i, i2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RotationOptions)) {
            return false;
        }
        RotationOptions rotationOptions = (RotationOptions) obj;
        if (this.f1985a == rotationOptions.f1985a && this.f1986b == rotationOptions.f1986b) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return String.format(null, "%d defer:%b", new Object[]{Integer.valueOf(this.f1985a), Boolean.valueOf(this.f1986b)});
    }
}
