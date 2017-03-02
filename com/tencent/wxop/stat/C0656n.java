package com.tencent.wxop.stat;

import android.content.Context;
import com.tencent.wxop.stat.common.C0639k;

/* renamed from: com.tencent.wxop.stat.n */
final class C0656n implements Runnable {
    final /* synthetic */ Context f2093a;

    C0656n(Context context) {
        this.f2093a = context;
    }

    public final void run() {
        if (this.f2093a == null) {
            StatServiceImpl.f1839q.error((Object) "The Context of StatService.onStop() can not be null!");
            return;
        }
        StatServiceImpl.flushDataToDB(this.f2093a);
        if (!StatServiceImpl.m2230a()) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (C0639k.m2386B(this.f2093a)) {
                if (StatConfig.isDebugEnable()) {
                    StatServiceImpl.f1839q.m2361i("onStop isBackgroundRunning flushDataToDB");
                }
                StatServiceImpl.commitEvents(this.f2093a, -1);
            }
        }
    }
}
