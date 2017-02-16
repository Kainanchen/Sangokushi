package com.tencent.p080b.p081a;

import com.tencent.p080b.p081a.p082a.C1029d;

/* renamed from: com.tencent.b.a.v */
final class C1077v implements Runnable {
    final /* synthetic */ C1029d f8238a;
    final /* synthetic */ ah f8239b;
    final /* synthetic */ boolean f8240c;
    final /* synthetic */ boolean f8241d;
    final /* synthetic */ C1073r f8242e;

    C1077v(C1073r c1073r, C1029d c1029d, ah ahVar, boolean z, boolean z2) {
        this.f8242e = c1073r;
        this.f8238a = c1029d;
        this.f8239b = ahVar;
        this.f8240c = z;
        this.f8241d = z2;
    }

    public final void run() {
        this.f8242e.m5850b(this.f8238a, this.f8239b, this.f8240c, this.f8241d);
    }
}
