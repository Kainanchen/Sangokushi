package com.alipay.apmobilesecuritysdk.p010g;

import android.os.Process;

/* renamed from: com.alipay.apmobilesecuritysdk.g.c */
final class C0106c implements Runnable {
    final /* synthetic */ C0105b f140a;

    C0106c(C0105b c0105b) {
        this.f140a = c0105b;
    }

    public final void run() {
        try {
            Process.setThreadPriority(0);
            while (!this.f140a.f139c.isEmpty()) {
                Runnable runnable = (Runnable) this.f140a.f139c.pollFirst();
                if (runnable != null) {
                    runnable.run();
                }
            }
        } catch (Exception e) {
        } finally {
            this.f140a.f138b = null;
        }
    }
}
