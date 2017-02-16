package com.tencent.p080b.p081a;

import android.content.Context;
import android.content.IntentFilter;
import com.tencent.p080b.p081a.p083b.C1049l;

/* renamed from: com.tencent.b.a.al */
final class al implements Runnable {
    final /* synthetic */ Context f8014a;

    al(Context context) {
        this.f8014a = context;
    }

    public final void run() {
        C1062g a = C1062g.m5813a(C1060e.f8181t);
        a.f8193f.getApplicationContext().registerReceiver(new C1079x(a), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        C1049l.m5681a(this.f8014a, true);
        C1073r.m5835a(this.f8014a);
        ai.m5656b(this.f8014a);
        C1060e.f8179r = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new C1067l());
        if (C1058c.m5747a() == C1059d.APP_LAUNCH) {
            C1060e.m5798b(this.f8014a);
        }
        if (C1058c.m5762b()) {
            C1060e.f8178q.m5670g("Init MTA StatService success.");
        }
    }
}
