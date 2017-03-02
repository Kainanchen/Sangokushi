package com.tencent.wxop.stat;

import android.content.Context;
import com.tencent.wxop.stat.p069a.C0620h;

final class aa implements Runnable {
    final /* synthetic */ Context f1903a;
    final /* synthetic */ StatSpecifyReportedInfo f1904b;
    final /* synthetic */ StatAppMonitor f1905c;

    aa(Context context, StatSpecifyReportedInfo statSpecifyReportedInfo, StatAppMonitor statAppMonitor) {
        this.f1903a = context;
        this.f1904b = statSpecifyReportedInfo;
        this.f1905c = statAppMonitor;
    }

    public final void run() {
        try {
            new aq(new C0620h(this.f1903a, StatServiceImpl.m2223a(this.f1903a, false, this.f1904b), this.f1905c, this.f1904b)).m2308a();
        } catch (Throwable th) {
            StatServiceImpl.f1839q.m2360e(th);
            StatServiceImpl.m2229a(this.f1903a, th);
        }
    }
}
