package com.tencent.wxop.stat;

import android.content.Context;
import com.tencent.wxop.stat.common.C0639k;

final class aj implements Runnable {
    final /* synthetic */ Context f1922a;
    final /* synthetic */ StatSpecifyReportedInfo f1923b;

    aj(Context context, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        this.f1922a = context;
        this.f1923b = statSpecifyReportedInfo;
    }

    public final void run() {
        if (this.f1922a == null) {
            StatServiceImpl.f1839q.error((Object) "The Context of StatService.onResume() can not be null!");
        } else {
            StatServiceImpl.trackBeginPage(this.f1922a, C0639k.m2415h(this.f1922a), this.f1923b);
        }
    }
}
