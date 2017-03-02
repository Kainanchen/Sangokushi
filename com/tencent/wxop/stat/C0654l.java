package com.tencent.wxop.stat;

import android.content.Context;
import com.tencent.wxop.stat.common.C0639k;

/* renamed from: com.tencent.wxop.stat.l */
final class C0654l implements Runnable {
    final /* synthetic */ Context f2090a;

    C0654l(Context context) {
        this.f2090a = context;
    }

    public final void run() {
        C0625a.m2283a(StatServiceImpl.f1842t).m2298h();
        C0639k.m2390a(this.f2090a, true);
        au.m2317a(this.f2090a);
        C0651i.m2471b(this.f2090a);
        StatServiceImpl.f1840r = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new ao());
        if (StatConfig.getStatSendStrategy() == StatReportStrategy.APP_LAUNCH) {
            StatServiceImpl.commitEvents(this.f2090a, -1);
        }
        if (StatConfig.isDebugEnable()) {
            StatServiceImpl.f1839q.m2358d("Init MTA StatService success.");
        }
    }
}
