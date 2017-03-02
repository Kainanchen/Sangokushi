package com.tencent.wxop.stat;

class at implements C0626h {
    final /* synthetic */ aq f1946a;

    at(aq aqVar) {
        this.f1946a = aqVar;
    }

    public void m2315a() {
        StatServiceImpl.m2238c();
        if (au.m2331b().f1950a > 0) {
            StatServiceImpl.commitEvents(this.f1946a.f1942d, -1);
        }
    }

    public void m2316b() {
        au.m2331b().m2346a(this.f1946a.f1939a, null, this.f1946a.f1941c, true);
        StatServiceImpl.m2239d();
    }
}
