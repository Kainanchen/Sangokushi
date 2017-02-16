package com.tencent.p080b.p081a;

import android.content.Context;

/* renamed from: com.tencent.b.a.i */
final class C1064i implements Runnable {
    final /* synthetic */ Context f8198a;

    C1064i(Context context) {
        this.f8198a = context;
    }

    public final void run() {
        try {
            new Thread(new C1068m(this.f8198a), "NetworkMonitorTask").start();
        } catch (Throwable th) {
            C1060e.f8178q.m5665b(th);
            C1060e.m5794a(this.f8198a, th);
        }
    }
}
