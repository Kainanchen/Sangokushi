package com.illuminate.texaspoker.view.refreshlayout;

import android.graphics.PointF;
import com.android.volley.DefaultRetryPolicy;

/* renamed from: com.illuminate.texaspoker.view.refreshlayout.d */
public final class RefreshIndicator {
    protected int f7139a;
    PointF f7140b;
    float f7141c;
    float f7142d;
    int f7143e;
    int f7144f;
    int f7145g;
    int f7146h;
    float f7147i;
    float f7148j;
    boolean f7149k;
    int f7150l;
    int f7151m;

    public RefreshIndicator() {
        this.f7139a = 0;
        this.f7140b = new PointF();
        this.f7143e = 0;
        this.f7144f = 0;
        this.f7146h = 0;
        this.f7147i = 1.2f;
        this.f7148j = 1.7f;
        this.f7149k = false;
        this.f7150l = -1;
        this.f7151m = 0;
    }

    public final void m4598a(float f) {
        this.f7147i = f;
        this.f7139a = (int) (((float) this.f7145g) * f);
    }

    public final int m4597a() {
        return this.f7139a;
    }

    public final void m4599a(int i) {
        this.f7147i = (((float) this.f7145g) * DefaultRetryPolicy.DEFAULT_BACKOFF_MULT) / ((float) i);
        this.f7139a = i;
    }

    public final void m4600b(int i) {
        this.f7145g = i;
        this.f7139a = (int) (this.f7147i * ((float) this.f7145g));
    }

    public final boolean m4601b() {
        return this.f7143e > 0;
    }

    public final boolean m4602c() {
        return this.f7143e >= this.f7139a;
    }

    public final boolean m4603d() {
        return this.f7143e != this.f7146h;
    }

    public final boolean m4604e() {
        return this.f7143e == 0;
    }

    public final boolean m4605f() {
        return this.f7144f < this.f7139a && this.f7143e >= this.f7139a;
    }

    public final boolean m4606g() {
        return this.f7143e > m4607h();
    }

    public final int m4607h() {
        return this.f7150l >= 0 ? this.f7150l : this.f7145g;
    }
}
