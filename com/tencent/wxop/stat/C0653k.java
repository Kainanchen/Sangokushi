package com.tencent.wxop.stat;

import java.util.List;

/* renamed from: com.tencent.wxop.stat.k */
class C0653k implements Runnable {
    final /* synthetic */ List f2087a;
    final /* synthetic */ C0626h f2088b;
    final /* synthetic */ C0651i f2089c;

    C0653k(C0651i c0651i, List list, C0626h c0626h) {
        this.f2089c = c0651i;
        this.f2087a = list;
        this.f2088b = c0626h;
    }

    public void run() {
        this.f2089c.m2473a(this.f2087a, this.f2088b);
    }
}
