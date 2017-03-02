package com.tencent.wxop.stat;

import android.content.Context;

final class ak implements Runnable {
    final /* synthetic */ String f1924a;
    final /* synthetic */ Context f1925b;
    final /* synthetic */ StatSpecifyReportedInfo f1926c;

    ak(String str, Context context, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        this.f1924a = str;
        this.f1925b = context;
        this.f1926c = statSpecifyReportedInfo;
    }

    public final void run() {
        if (this.f1924a == null || this.f1924a.trim().length() == 0) {
            StatServiceImpl.f1839q.m2363w("qq num is null or empty.");
            return;
        }
        StatConfig.f1797f = this.f1924a;
        StatServiceImpl.m2234b(this.f1925b, new StatAccount(this.f1924a), this.f1926c);
    }
}
