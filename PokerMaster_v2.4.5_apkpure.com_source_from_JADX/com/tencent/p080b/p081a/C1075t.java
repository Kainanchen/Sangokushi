package com.tencent.p080b.p081a;

import java.util.List;

/* renamed from: com.tencent.b.a.t */
final class C1075t implements Runnable {
    final /* synthetic */ List f8233a;
    final /* synthetic */ boolean f8234b;
    final /* synthetic */ boolean f8235c;
    final /* synthetic */ C1073r f8236d;

    C1075t(C1073r c1073r, List list, boolean z) {
        this.f8236d = c1073r;
        this.f8233a = list;
        this.f8234b = z;
        this.f8235c = true;
    }

    public final void run() {
        this.f8236d.m5846a(this.f8233a, this.f8234b);
        if (this.f8235c) {
            this.f8233a.clear();
        }
    }
}
