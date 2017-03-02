package com.tencent.wxop.stat;

import android.content.Context;

final class al implements Runnable {
    final /* synthetic */ StatAccount f1927a;
    final /* synthetic */ Context f1928b;
    final /* synthetic */ StatSpecifyReportedInfo f1929c;

    al(StatAccount statAccount, Context context, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        this.f1927a = statAccount;
        this.f1928b = context;
        this.f1929c = statSpecifyReportedInfo;
    }

    public final void run() {
        if (this.f1927a == null || this.f1927a.getAccount().trim().length() == 0) {
            StatServiceImpl.f1839q.m2363w("account is null or empty.");
            return;
        }
        StatConfig.setQQ(this.f1928b, this.f1927a.getAccount());
        StatServiceImpl.m2234b(this.f1928b, this.f1927a, this.f1929c);
    }
}
