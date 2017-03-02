package com.tencent.wxop.stat;

import android.content.Context;
import java.util.Map;

final class af implements Runnable {
    final /* synthetic */ Context f1913a;
    final /* synthetic */ Map f1914b;
    final /* synthetic */ StatSpecifyReportedInfo f1915c;

    af(Context context, Map map, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        this.f1913a = context;
        this.f1914b = map;
        this.f1915c = statSpecifyReportedInfo;
    }

    public final void run() {
        try {
            new Thread(new ap(this.f1913a, this.f1914b, this.f1915c), "NetworkMonitorTask").start();
        } catch (Throwable th) {
            StatServiceImpl.f1839q.m2360e(th);
            StatServiceImpl.m2229a(this.f1913a, th);
        }
    }
}
