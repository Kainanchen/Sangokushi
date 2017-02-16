package com.tencent.p080b.p081a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: com.tencent.b.a.x */
final class C1079x extends BroadcastReceiver {
    final /* synthetic */ C1062g f8245a;

    C1079x(C1062g c1062g) {
        this.f8245a = c1062g;
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.f8245a.f8195h != null) {
            this.f8245a.f8195h.m5674a(new ac(this));
        }
    }
}
