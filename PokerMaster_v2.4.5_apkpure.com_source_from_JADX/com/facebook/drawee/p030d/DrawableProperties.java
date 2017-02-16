package com.facebook.drawee.p030d;

import android.graphics.ColorFilter;

/* renamed from: com.facebook.drawee.d.d */
public final class DrawableProperties {
    int f1343a;
    boolean f1344b;
    ColorFilter f1345c;
    int f1346d;
    int f1347e;

    public DrawableProperties() {
        this.f1343a = -1;
        this.f1344b = false;
        this.f1345c = null;
        this.f1346d = -1;
        this.f1347e = -1;
    }

    public final void m1337a(ColorFilter colorFilter) {
        this.f1345c = colorFilter;
        this.f1344b = true;
    }

    public final void m1338a(boolean z) {
        this.f1346d = z ? 1 : 0;
    }

    public final void m1339b(boolean z) {
        this.f1347e = z ? 1 : 0;
    }
}
