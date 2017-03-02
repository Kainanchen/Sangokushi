package com.tencent.wxop.stat;

import android.content.Context;
import com.tencent.wxop.stat.common.C0639k;
import com.ut.device.AidConstants;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.tencent.wxop.stat.d */
public class C0647d {
    private static volatile C0647d f2071b;
    private Timer f2072a;
    private Context f2073c;

    static {
        f2071b = null;
    }

    private C0647d(Context context) {
        this.f2072a = null;
        this.f2073c = null;
        this.f2073c = context.getApplicationContext();
        this.f2072a = new Timer(false);
    }

    public static C0647d m2459a(Context context) {
        if (f2071b == null) {
            synchronized (C0647d.class) {
                if (f2071b == null) {
                    f2071b = new C0647d(context);
                }
            }
        }
        return f2071b;
    }

    public void m2460a() {
        if (StatConfig.getStatSendStrategy() == StatReportStrategy.PERIOD) {
            long sendPeriodMinutes = (long) ((StatConfig.getSendPeriodMinutes() * 60) * AidConstants.EVENT_REQUEST_STARTED);
            if (StatConfig.isDebugEnable()) {
                C0639k.m2401b().m2361i("setupPeriodTimer delay:" + sendPeriodMinutes);
            }
            m2461a(new C0648e(this), sendPeriodMinutes);
        }
    }

    public void m2461a(TimerTask timerTask, long j) {
        if (this.f2072a != null) {
            if (StatConfig.isDebugEnable()) {
                C0639k.m2401b().m2361i("setupPeriodTimer schedule delay:" + j);
            }
            this.f2072a.schedule(timerTask, j);
        } else if (StatConfig.isDebugEnable()) {
            C0639k.m2401b().m2363w("setupPeriodTimer schedule timer == null");
        }
    }
}
