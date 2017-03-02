package com.tencent.wxop.stat;

class ar implements C0626h {
    final /* synthetic */ aq f1944a;

    ar(aq aqVar) {
        this.f1944a = aqVar;
    }

    public void m2311a() {
        StatServiceImpl.m2238c();
        if (au.m2331b().m2344a() >= StatConfig.getMaxBatchReportCount()) {
            au.m2331b().m2345a(StatConfig.getMaxBatchReportCount());
        }
    }

    public void m2312b() {
        StatServiceImpl.m2239d();
    }
}
