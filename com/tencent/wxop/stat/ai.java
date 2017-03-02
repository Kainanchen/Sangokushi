package com.tencent.wxop.stat;

import android.content.Context;

final class ai implements Runnable {
    final /* synthetic */ Context f1920a;
    final /* synthetic */ StatSpecifyReportedInfo f1921b;

    ai(Context context, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        this.f1920a = context;
        this.f1921b = statSpecifyReportedInfo;
    }

    public final void run() {
        try {
            StatServiceImpl.stopSession();
            StatServiceImpl.m2223a(this.f1920a, true, this.f1921b);
        } catch (Throwable th) {
            StatServiceImpl.f1839q.m2360e(th);
            StatServiceImpl.m2229a(this.f1920a, th);
        }
    }
}
