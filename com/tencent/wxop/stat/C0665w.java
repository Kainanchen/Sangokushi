package com.tencent.wxop.stat;

import android.content.Context;

/* renamed from: com.tencent.wxop.stat.w */
final class C0665w implements Runnable {
    final /* synthetic */ String f2112a;
    final /* synthetic */ Context f2113b;
    final /* synthetic */ StatSpecifyReportedInfo f2114c;

    C0665w(String str, Context context, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        this.f2112a = str;
        this.f2113b = context;
        this.f2114c = statSpecifyReportedInfo;
    }

    public final void run() {
        try {
            synchronized (StatServiceImpl.f1837o) {
                if (StatServiceImpl.f1837o.size() >= StatConfig.getMaxParallelTimmingEvents()) {
                    StatServiceImpl.f1839q.error("The number of page events exceeds the maximum value " + Integer.toString(StatConfig.getMaxParallelTimmingEvents()));
                    return;
                }
                StatServiceImpl.f1835m = this.f2112a;
                if (StatServiceImpl.f1837o.containsKey(StatServiceImpl.f1835m)) {
                    StatServiceImpl.f1839q.m2359e("Duplicate PageID : " + StatServiceImpl.f1835m + ", onResume() repeated?");
                    return;
                }
                StatServiceImpl.f1837o.put(StatServiceImpl.f1835m, Long.valueOf(System.currentTimeMillis()));
                StatServiceImpl.m2223a(this.f2113b, true, this.f2114c);
            }
        } catch (Throwable th) {
            StatServiceImpl.f1839q.m2360e(th);
            StatServiceImpl.m2229a(this.f2113b, th);
        }
    }
}
