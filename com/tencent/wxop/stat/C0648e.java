package com.tencent.wxop.stat;

import com.tencent.wxop.stat.common.C0639k;
import java.util.TimerTask;

/* renamed from: com.tencent.wxop.stat.e */
class C0648e extends TimerTask {
    final /* synthetic */ C0647d f2074a;

    C0648e(C0647d c0647d) {
        this.f2074a = c0647d;
    }

    public void run() {
        if (StatConfig.isDebugEnable()) {
            C0639k.m2401b().m2361i("TimerTask run");
        }
        StatServiceImpl.m2242e(this.f2074a.f2073c);
        cancel();
        this.f2074a.m2460a();
    }
}
