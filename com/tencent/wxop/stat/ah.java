package com.tencent.wxop.stat;

import android.content.Context;
import com.tencent.wxop.stat.p069a.C0613e;
import com.tencent.wxop.stat.p069a.C0623k;

final class ah implements Runnable {
    final /* synthetic */ Context f1917a;
    final /* synthetic */ String f1918b;
    final /* synthetic */ StatSpecifyReportedInfo f1919c;

    ah(Context context, String str, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        this.f1917a = context;
        this.f1918b = str;
        this.f1919c = statSpecifyReportedInfo;
    }

    public final void run() {
        try {
            Long l;
            StatServiceImpl.flushDataToDB(this.f1917a);
            synchronized (StatServiceImpl.f1837o) {
                l = (Long) StatServiceImpl.f1837o.remove(this.f1918b);
            }
            if (l != null) {
                Long valueOf = Long.valueOf((System.currentTimeMillis() - l.longValue()) / 1000);
                if (valueOf.longValue() <= 0) {
                    valueOf = Long.valueOf(1);
                }
                String j = StatServiceImpl.f1836n;
                if (j != null && j.equals(this.f1918b)) {
                    j = "-";
                }
                C0613e c0623k = new C0623k(this.f1917a, j, this.f1918b, StatServiceImpl.m2223a(this.f1917a, false, this.f1919c), valueOf, this.f1919c);
                if (!this.f1918b.equals(StatServiceImpl.f1835m)) {
                    StatServiceImpl.f1839q.warn("Invalid invocation since previous onResume on diff page.");
                }
                new aq(c0623k).m2308a();
                StatServiceImpl.f1836n = this.f1918b;
                return;
            }
            StatServiceImpl.f1839q.m2359e("Starttime for PageID:" + this.f1918b + " not found, lost onResume()?");
        } catch (Throwable th) {
            StatServiceImpl.f1839q.m2360e(th);
            StatServiceImpl.m2229a(this.f1917a, th);
        }
    }
}
