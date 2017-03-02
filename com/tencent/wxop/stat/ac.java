package com.tencent.wxop.stat;

import android.content.Context;
import com.tencent.wxop.stat.p069a.C0613e;
import com.tencent.wxop.stat.p069a.C0615b;
import com.tencent.wxop.stat.p069a.C0616c;

final class ac implements Runnable {
    final /* synthetic */ Context f1906a;
    final /* synthetic */ StatSpecifyReportedInfo f1907b;
    final /* synthetic */ C0616c f1908c;
    final /* synthetic */ int f1909d;

    ac(Context context, StatSpecifyReportedInfo statSpecifyReportedInfo, C0616c c0616c, int i) {
        this.f1906a = context;
        this.f1907b = statSpecifyReportedInfo;
        this.f1908c = c0616c;
        this.f1909d = i;
    }

    public final void run() {
        try {
            C0613e c0615b = new C0615b(this.f1906a, StatServiceImpl.m2223a(this.f1906a, false, this.f1907b), this.f1908c.f1863a, this.f1907b);
            c0615b.m2265b().f1865c = this.f1908c.f1865c;
            Long valueOf = Long.valueOf((long) this.f1909d);
            c0615b.m2263a(Long.valueOf(valueOf.longValue() <= 0 ? 1 : valueOf.longValue()).longValue());
            new aq(c0615b).m2308a();
        } catch (Throwable th) {
            StatServiceImpl.f1839q.m2360e(th);
            StatServiceImpl.m2229a(this.f1906a, th);
        }
    }
}
