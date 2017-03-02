package com.tencent.wxop.stat;

import android.content.Context;
import com.tencent.wxop.stat.p069a.C0613e;
import com.tencent.wxop.stat.p069a.C0615b;
import com.tencent.wxop.stat.p069a.C0616c;

/* renamed from: com.tencent.wxop.stat.u */
final class C0663u implements Runnable {
    final /* synthetic */ Context f2106a;
    final /* synthetic */ StatSpecifyReportedInfo f2107b;
    final /* synthetic */ C0616c f2108c;

    C0663u(Context context, StatSpecifyReportedInfo statSpecifyReportedInfo, C0616c c0616c) {
        this.f2106a = context;
        this.f2107b = statSpecifyReportedInfo;
        this.f2108c = c0616c;
    }

    public final void run() {
        try {
            C0613e c0615b = new C0615b(this.f2106a, StatServiceImpl.m2223a(this.f2106a, false, this.f2107b), this.f2108c.f1863a, this.f2107b);
            c0615b.m2265b().f1865c = this.f2108c.f1865c;
            new aq(c0615b).m2308a();
        } catch (Throwable th) {
            StatServiceImpl.f1839q.m2360e(th);
            StatServiceImpl.m2229a(this.f2106a, th);
        }
    }
}
