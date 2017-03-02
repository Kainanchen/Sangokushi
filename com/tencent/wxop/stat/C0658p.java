package com.tencent.wxop.stat;

import android.content.Context;
import com.tencent.wxop.stat.p069a.C0617d;

/* renamed from: com.tencent.wxop.stat.p */
final class C0658p implements Runnable {
    final /* synthetic */ String f2095a;
    final /* synthetic */ Context f2096b;
    final /* synthetic */ StatSpecifyReportedInfo f2097c;

    C0658p(String str, Context context, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        this.f2095a = str;
        this.f2096b = context;
        this.f2097c = statSpecifyReportedInfo;
    }

    public final void run() {
        try {
            if (StatServiceImpl.m2231a(this.f2095a)) {
                StatServiceImpl.f1839q.error((Object) "Error message in StatService.reportError() is empty.");
            } else {
                new aq(new C0617d(this.f2096b, StatServiceImpl.m2223a(this.f2096b, false, this.f2097c), this.f2095a, 0, StatConfig.getMaxReportEventLength(), null, this.f2097c)).m2308a();
            }
        } catch (Throwable th) {
            StatServiceImpl.f1839q.m2360e(th);
            StatServiceImpl.m2229a(this.f2096b, th);
        }
    }
}
