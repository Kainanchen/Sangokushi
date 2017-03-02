package com.tencent.wxop.stat;

import android.content.Context;
import com.tencent.wxop.stat.common.C0639k;

/* renamed from: com.tencent.wxop.stat.m */
final class C0655m implements Runnable {
    final /* synthetic */ Context f2091a;
    final /* synthetic */ StatSpecifyReportedInfo f2092b;

    C0655m(Context context, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        this.f2091a = context;
        this.f2092b = statSpecifyReportedInfo;
    }

    public final void run() {
        if (this.f2091a == null) {
            StatServiceImpl.f1839q.error((Object) "The Context of StatService.onPause() can not be null!");
        } else {
            StatServiceImpl.trackEndPage(this.f2091a, C0639k.m2415h(this.f2091a), this.f2092b);
        }
    }
}
