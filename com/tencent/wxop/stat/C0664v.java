package com.tencent.wxop.stat;

import android.content.Context;
import com.tencent.wxop.stat.p069a.C0616c;

/* renamed from: com.tencent.wxop.stat.v */
final class C0664v implements Runnable {
    final /* synthetic */ String f2109a;
    final /* synthetic */ C0616c f2110b;
    final /* synthetic */ Context f2111c;

    C0664v(String str, C0616c c0616c, Context context) {
        this.f2109a = str;
        this.f2110b = c0616c;
        this.f2111c = context;
    }

    public final void run() {
        try {
            if (StatServiceImpl.m2231a(this.f2109a)) {
                StatServiceImpl.f1839q.error((Object) "The event_id of StatService.trackCustomBeginEvent() can not be null or empty.");
                return;
            }
            if (StatConfig.isDebugEnable()) {
                StatServiceImpl.f1839q.m2361i("add begin key:" + this.f2110b.toString());
            }
            if (StatServiceImpl.f1827e.containsKey(this.f2110b)) {
                StatServiceImpl.f1839q.error("Duplicate CustomEvent key: " + this.f2110b.toString() + ", trackCustomBeginEvent() repeated?");
            } else if (StatServiceImpl.f1827e.size() <= StatConfig.getMaxParallelTimmingEvents()) {
                StatServiceImpl.f1827e.put(this.f2110b, Long.valueOf(System.currentTimeMillis()));
            } else {
                StatServiceImpl.f1839q.error("The number of timedEvent exceeds the maximum value " + Integer.toString(StatConfig.getMaxParallelTimmingEvents()));
            }
        } catch (Throwable th) {
            StatServiceImpl.f1839q.m2360e(th);
            StatServiceImpl.m2229a(this.f2111c, th);
        }
    }
}
