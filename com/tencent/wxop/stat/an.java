package com.tencent.wxop.stat;

import android.content.Context;

final class an implements Runnable {
    final /* synthetic */ Context f1933a;
    final /* synthetic */ StatSpecifyReportedInfo f1934b;

    an(Context context, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        this.f1933a = context;
        this.f1934b = statSpecifyReportedInfo;
    }

    public final void run() {
        try {
            StatServiceImpl.m2223a(this.f1933a, false, this.f1934b);
        } catch (Throwable th) {
            StatServiceImpl.f1839q.m2360e(th);
        }
    }
}
