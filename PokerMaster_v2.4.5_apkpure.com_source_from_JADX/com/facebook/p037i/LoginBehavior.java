package com.facebook.p037i;

/* renamed from: com.facebook.i.i */
public enum LoginBehavior {
    NATIVE_WITH_FALLBACK(true, true, true, false, true, true),
    NATIVE_ONLY(true, true, false, false, false, true),
    KATANA_ONLY(false, true, false, false, false, false),
    WEB_ONLY(false, false, true, false, true, false),
    WEB_VIEW_ONLY(false, false, true, false, false, false),
    DEVICE_AUTH(false, false, false, true, false, false);
    
    final boolean f1835g;
    final boolean f1836h;
    final boolean f1837i;
    final boolean f1838j;
    final boolean f1839k;
    final boolean f1840l;

    private LoginBehavior(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f1835g = z;
        this.f1836h = z2;
        this.f1837i = z3;
        this.f1838j = z4;
        this.f1839k = z5;
        this.f1840l = z6;
    }
}
