package com.facebook.drawee.p027f;

import android.content.Context;
import android.view.ViewConfiguration;

/* renamed from: com.facebook.drawee.f.a */
public final class GestureDetector {
    public GestureDetector f1481a;
    public final float f1482b;
    public boolean f1483c;
    public boolean f1484d;
    public long f1485e;
    public float f1486f;
    public float f1487g;

    /* renamed from: com.facebook.drawee.f.a.a */
    public interface GestureDetector {
        boolean m1216g();
    }

    public GestureDetector(Context context) {
        this.f1482b = (float) ViewConfiguration.get(context).getScaledTouchSlop();
        m1425a();
    }

    public final void m1425a() {
        this.f1481a = null;
        m1426b();
    }

    public final void m1426b() {
        this.f1483c = false;
        this.f1484d = false;
    }
}
