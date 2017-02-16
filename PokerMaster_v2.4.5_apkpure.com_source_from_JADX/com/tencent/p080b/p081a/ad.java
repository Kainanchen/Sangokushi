package com.tencent.p080b.p081a;

import android.content.Context;
import android.support.v4.view.PointerIconCompat;
import com.tencent.p080b.p081a.p083b.C1049l;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.tencent.b.a.ad */
public class ad {
    private static volatile ad f7995b;
    private Timer f7996a;
    private Context f7997c;

    static {
        f7995b = null;
    }

    private ad(Context context) {
        this.f7996a = null;
        this.f7997c = null;
        this.f7997c = context.getApplicationContext();
        this.f7996a = new Timer(false);
    }

    public static ad m5650a(Context context) {
        if (f7995b == null) {
            synchronized (ad.class) {
                if (f7995b == null) {
                    f7995b = new ad(context);
                }
            }
        }
        return f7995b;
    }

    public final void m5651a() {
        if (C1058c.m5747a() == C1059d.PERIOD) {
            long k = (long) ((C1058c.m5776k() * 60) * PointerIconCompat.TYPE_DEFAULT);
            if (C1058c.m5762b()) {
                C1049l.m5693c().m5662a("setupPeriodTimer delay:" + k);
            }
            TimerTask aeVar = new ae(this);
            if (this.f7996a != null) {
                if (C1058c.m5762b()) {
                    C1049l.m5693c().m5662a("setupPeriodTimer schedule delay:" + k);
                }
                this.f7996a.schedule(aeVar, k);
            } else if (C1058c.m5762b()) {
                C1049l.m5693c().m5666c("setupPeriodTimer schedule timer == null");
            }
        }
    }
}
