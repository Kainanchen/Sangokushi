package com.tencent.p080b.p081a;

/* renamed from: com.tencent.b.a.z */
final class C1081z implements Runnable {
    final /* synthetic */ int f8249a;
    final /* synthetic */ C1073r f8250b;

    C1081z(C1073r c1073r, int i) {
        this.f8250b = c1073r;
        this.f8249a = i;
    }

    public final void run() {
        C1073r.m5840a(this.f8250b, this.f8249a, true);
        C1073r.m5840a(this.f8250b, this.f8249a, false);
    }
}
