package com.tencent.wxop.stat;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.tencent.wxop.stat.b */
class C0627b extends BroadcastReceiver {
    final /* synthetic */ C0625a f1978a;

    C0627b(C0625a c0625a) {
        this.f1978a = c0625a;
    }

    public void onReceive(Context context, Intent intent) {
        if (this.f1978a.f1899e != null) {
            this.f1978a.f1899e.m2373a(new C0628c(this));
        }
    }
}
