package com.tencent.wxop.stat;

import com.tencent.wxop.stat.p069a.C0613e;

class ay implements Runnable {
    final /* synthetic */ C0613e f1971a;
    final /* synthetic */ C0626h f1972b;
    final /* synthetic */ boolean f1973c;
    final /* synthetic */ boolean f1974d;
    final /* synthetic */ au f1975e;

    ay(au auVar, C0613e c0613e, C0626h c0626h, boolean z, boolean z2) {
        this.f1975e = auVar;
        this.f1971a = c0613e;
        this.f1972b = c0626h;
        this.f1973c = z;
        this.f1974d = z2;
    }

    public void run() {
        this.f1975e.m2333b(this.f1971a, this.f1972b, this.f1973c, this.f1974d);
    }
}
