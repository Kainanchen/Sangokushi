package com.tencent.wxop.stat;

import android.content.Context;
import com.tencent.wxop.stat.p069a.C0613e;
import com.tencent.wxop.stat.p069a.C0615b;
import com.tencent.wxop.stat.p069a.C0616c;

/* renamed from: com.tencent.wxop.stat.z */
final class C0668z implements Runnable {
    final /* synthetic */ String f2122a;
    final /* synthetic */ C0616c f2123b;
    final /* synthetic */ Context f2124c;
    final /* synthetic */ StatSpecifyReportedInfo f2125d;

    C0668z(String str, C0616c c0616c, Context context, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        this.f2122a = str;
        this.f2123b = c0616c;
        this.f2124c = context;
        this.f2125d = statSpecifyReportedInfo;
    }

    public final void run() {
        try {
            if (StatServiceImpl.m2231a(this.f2122a)) {
                StatServiceImpl.f1839q.error((Object) "The event_id of StatService.trackCustomEndEvent() can not be null or empty.");
                return;
            }
            Long l = (Long) StatServiceImpl.f1827e.remove(this.f2123b);
            if (l != null) {
                C0613e c0615b = new C0615b(this.f2124c, StatServiceImpl.m2223a(this.f2124c, false, this.f2125d), this.f2123b.f1863a, this.f2125d);
                c0615b.m2265b().f1865c = this.f2123b.f1865c;
                l = Long.valueOf((System.currentTimeMillis() - l.longValue()) / 1000);
                c0615b.m2263a(Long.valueOf(l.longValue() <= 0 ? 1 : l.longValue()).longValue());
                new aq(c0615b).m2308a();
                return;
            }
            StatServiceImpl.f1839q.warn("No start time found for custom event: " + this.f2123b.toString() + ", lost trackCustomBeginKVEvent()?");
        } catch (Throwable th) {
            StatServiceImpl.f1839q.m2360e(th);
            StatServiceImpl.m2229a(this.f2124c, th);
        }
    }
}
