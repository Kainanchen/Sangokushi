package com.tencent.wxop.stat;

import android.content.Context;
import com.tencent.wxop.stat.p069a.C0613e;
import com.tencent.wxop.stat.p069a.C0615b;
import com.tencent.wxop.stat.p069a.C0616c;

/* renamed from: com.tencent.wxop.stat.s */
final class C0661s implements Runnable {
    final /* synthetic */ Context f2103a;
    final /* synthetic */ StatSpecifyReportedInfo f2104b;
    final /* synthetic */ C0616c f2105c;

    C0661s(Context context, StatSpecifyReportedInfo statSpecifyReportedInfo, C0616c c0616c) {
        this.f2103a = context;
        this.f2104b = statSpecifyReportedInfo;
        this.f2105c = c0616c;
    }

    public final void run() {
        try {
            C0613e c0615b = new C0615b(this.f2103a, StatServiceImpl.m2223a(this.f2103a, false, this.f2104b), this.f2105c.f1863a, this.f2104b);
            c0615b.m2265b().f1864b = this.f2105c.f1864b;
            new aq(c0615b).m2308a();
        } catch (Throwable th) {
            StatServiceImpl.f1839q.m2360e(th);
            StatServiceImpl.m2229a(this.f2103a, th);
        }
    }
}
