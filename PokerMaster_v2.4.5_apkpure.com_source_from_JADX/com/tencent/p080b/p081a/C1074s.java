package com.tencent.p080b.p081a;

import java.util.List;

/* renamed from: com.tencent.b.a.s */
final class C1074s implements Runnable {
    final /* synthetic */ List f8228a;
    final /* synthetic */ int f8229b;
    final /* synthetic */ boolean f8230c;
    final /* synthetic */ boolean f8231d;
    final /* synthetic */ C1073r f8232e;

    C1074s(C1073r c1073r, List list, boolean z) {
        this.f8232e = c1073r;
        this.f8228a = list;
        this.f8229b = 1;
        this.f8230c = z;
        this.f8231d = true;
    }

    public final void run() {
        this.f8232e.m5845a(this.f8228a, this.f8229b, this.f8230c);
        if (this.f8231d) {
            this.f8228a.clear();
        }
    }
}
