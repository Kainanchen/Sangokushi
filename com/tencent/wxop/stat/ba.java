package com.tencent.wxop.stat;

import java.util.List;

class ba implements C0626h {
    final /* synthetic */ List f1979a;
    final /* synthetic */ boolean f1980b;
    final /* synthetic */ au f1981c;

    ba(au auVar, List list, boolean z) {
        this.f1981c = auVar;
        this.f1979a = list;
        this.f1980b = z;
    }

    public void m2353a() {
        StatServiceImpl.m2238c();
        this.f1981c.m2349a(this.f1979a, this.f1980b, true);
    }

    public void m2354b() {
        StatServiceImpl.m2239d();
        this.f1981c.m2348a(this.f1979a, 1, this.f1980b, true);
    }
}
