package com.tencent.wxop.stat;

import android.content.Context;

final class ad implements Runnable {
    final /* synthetic */ Context f1910a;
    final /* synthetic */ int f1911b;

    ad(Context context, int i) {
        this.f1910a = context;
        this.f1911b = i;
    }

    public final void run() {
        try {
            StatServiceImpl.flushDataToDB(this.f1910a);
            au.m2317a(this.f1910a).m2345a(this.f1911b);
        } catch (Throwable th) {
            StatServiceImpl.f1839q.m2360e(th);
            StatServiceImpl.m2229a(this.f1910a, th);
        }
    }
}
