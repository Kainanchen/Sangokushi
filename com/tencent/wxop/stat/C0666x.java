package com.tencent.wxop.stat;

import android.content.Context;
import com.tencent.wxop.stat.p069a.C0613e;
import com.tencent.wxop.stat.p069a.C0615b;
import com.tencent.wxop.stat.p069a.C0616c;

/* renamed from: com.tencent.wxop.stat.x */
final class C0666x implements Runnable {
    final /* synthetic */ String f2115a;
    final /* synthetic */ C0616c f2116b;
    final /* synthetic */ Context f2117c;
    final /* synthetic */ StatSpecifyReportedInfo f2118d;

    C0666x(String str, C0616c c0616c, Context context, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        this.f2115a = str;
        this.f2116b = c0616c;
        this.f2117c = context;
        this.f2118d = statSpecifyReportedInfo;
    }

    public final void run() {
        try {
            if (StatServiceImpl.m2231a(this.f2115a)) {
                StatServiceImpl.f1839q.error((Object) "The event_id of StatService.trackCustomEndEvent() can not be null or empty.");
                return;
            }
            Long l = (Long) StatServiceImpl.f1827e.remove(this.f2116b);
            if (l != null) {
                C0613e c0615b = new C0615b(this.f2117c, StatServiceImpl.m2223a(this.f2117c, false, this.f2118d), this.f2116b.f1863a, this.f2118d);
                c0615b.m2265b().f1864b = this.f2116b.f1864b;
                l = Long.valueOf((System.currentTimeMillis() - l.longValue()) / 1000);
                c0615b.m2263a(Long.valueOf(l.longValue() == 0 ? 1 : l.longValue()).longValue());
                new aq(c0615b).m2308a();
                return;
            }
            StatServiceImpl.f1839q.error("No start time found for custom event: " + this.f2116b.toString() + ", lost trackCustomBeginEvent()?");
        } catch (Throwable th) {
            StatServiceImpl.f1839q.m2360e(th);
            StatServiceImpl.m2229a(this.f2117c, th);
        }
    }
}
