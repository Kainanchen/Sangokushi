package com.tencent.p080b.p081a;

import com.tencent.p080b.p081a.p083b.C1049l;
import java.util.TimerTask;

/* renamed from: com.tencent.b.a.ae */
final class ae extends TimerTask {
    final /* synthetic */ ad f7998a;

    ae(ad adVar) {
        this.f7998a = adVar;
    }

    public final void run() {
        if (C1058c.m5762b()) {
            C1049l.m5693c().m5662a((Object) "TimerTask run");
        }
        C1060e.m5803d(this.f7998a.f7997c);
        cancel();
        this.f7998a.m5651a();
    }
}
