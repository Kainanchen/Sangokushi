package com.facebook.imagepipeline.p047h;

import android.support.v4.view.accessibility.AccessibilityEventCompat;

/* renamed from: com.facebook.imagepipeline.h.f */
public final class ImmutableQualityInfo implements QualityInfo {
    public static final QualityInfo f2150a;
    int f2151b;
    boolean f2152c;
    boolean f2153d;

    static {
        f2150a = ImmutableQualityInfo.m2039a(ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, true, true);
    }

    private ImmutableQualityInfo(int i, boolean z, boolean z2) {
        this.f2151b = i;
        this.f2152c = z;
        this.f2153d = z2;
    }

    public final int m2040a() {
        return this.f2151b;
    }

    public final boolean m2041b() {
        return this.f2152c;
    }

    public final boolean m2042c() {
        return this.f2153d;
    }

    public final int hashCode() {
        int i = 0;
        int i2 = (this.f2152c ? AccessibilityEventCompat.TYPE_WINDOWS_CHANGED : 0) ^ this.f2151b;
        if (this.f2153d) {
            i = AccessibilityEventCompat.TYPE_VIEW_CONTEXT_CLICKED;
        }
        return i2 ^ i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableQualityInfo)) {
            return false;
        }
        ImmutableQualityInfo immutableQualityInfo = (ImmutableQualityInfo) obj;
        if (this.f2151b == immutableQualityInfo.f2151b && this.f2152c == immutableQualityInfo.f2152c && this.f2153d == immutableQualityInfo.f2153d) {
            return true;
        }
        return false;
    }

    public static QualityInfo m2039a(int i, boolean z, boolean z2) {
        return new ImmutableQualityInfo(i, z, z2);
    }
}
