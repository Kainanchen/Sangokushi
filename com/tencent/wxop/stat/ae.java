package com.tencent.wxop.stat;

import android.content.Context;

final class ae implements Runnable {
    final /* synthetic */ Context f1912a;

    ae(Context context) {
        this.f1912a = context;
    }

    public final void run() {
        try {
            new Thread(new ap(this.f1912a, null, null), "NetworkMonitorTask").start();
        } catch (Throwable th) {
            StatServiceImpl.f1839q.m2360e(th);
            StatServiceImpl.m2229a(this.f1912a, th);
        }
    }
}
