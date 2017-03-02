package com.tencent.wxop.stat;

import android.content.Context;
import com.tencent.wxop.stat.p069a.C0617d;
import com.tencent.wxop.stat.p069a.C0621i;

/* renamed from: com.tencent.wxop.stat.q */
final class C0659q implements Runnable {
    final /* synthetic */ Context f2098a;
    final /* synthetic */ Throwable f2099b;

    C0659q(Context context, Throwable th) {
        this.f2098a = context;
        this.f2099b = th;
    }

    public final void run() {
        try {
            if (StatConfig.isEnableStatService()) {
                new aq(new C0617d(this.f2098a, StatServiceImpl.m2223a(this.f2098a, false, null), 99, this.f2099b, C0621i.f1885a)).m2308a();
            }
        } catch (Throwable th) {
            StatServiceImpl.f1839q.m2359e("reportSdkSelfException error: " + th);
        }
    }
}
