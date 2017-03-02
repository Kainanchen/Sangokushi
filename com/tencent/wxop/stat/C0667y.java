package com.tencent.wxop.stat;

import android.content.Context;
import com.tencent.wxop.stat.p069a.C0616c;

/* renamed from: com.tencent.wxop.stat.y */
final class C0667y implements Runnable {
    final /* synthetic */ String f2119a;
    final /* synthetic */ C0616c f2120b;
    final /* synthetic */ Context f2121c;

    C0667y(String str, C0616c c0616c, Context context) {
        this.f2119a = str;
        this.f2120b = c0616c;
        this.f2121c = context;
    }

    public final void run() {
        try {
            if (StatServiceImpl.m2231a(this.f2119a)) {
                StatServiceImpl.f1839q.error((Object) "The event_id of StatService.trackCustomBeginEvent() can not be null or empty.");
                return;
            }
            if (StatConfig.isDebugEnable()) {
                StatServiceImpl.f1839q.m2361i("add begin key:" + this.f2120b);
            }
            if (StatServiceImpl.f1827e.containsKey(this.f2120b)) {
                StatServiceImpl.f1839q.warn("Duplicate CustomEvent key: " + this.f2120b.toString() + ", trackCustomBeginKVEvent() repeated?");
            } else if (StatServiceImpl.f1827e.size() <= StatConfig.getMaxParallelTimmingEvents()) {
                StatServiceImpl.f1827e.put(this.f2120b, Long.valueOf(System.currentTimeMillis()));
            } else {
                StatServiceImpl.f1839q.error("The number of timedEvent exceeds the maximum value " + Integer.toString(StatConfig.getMaxParallelTimmingEvents()));
            }
        } catch (Throwable th) {
            StatServiceImpl.f1839q.m2360e(th);
            StatServiceImpl.m2229a(this.f2121c, th);
        }
    }
}
