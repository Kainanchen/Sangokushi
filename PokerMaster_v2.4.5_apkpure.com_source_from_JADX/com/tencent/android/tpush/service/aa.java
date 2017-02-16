package com.tencent.android.tpush.service;

import com.tencent.android.tpush.p067a.ProGuard;

/* compiled from: ProGuard */
class aa implements Runnable {
    final /* synthetic */ XGWatchdog f7540a;

    aa(XGWatchdog xGWatchdog) {
        this.f7540a = xGWatchdog;
    }

    public void run() {
        try {
            String access$000 = this.f7540a.directSendContent("ver:");
            Integer valueOf = Integer.valueOf(0);
            if (access$000 != null) {
                try {
                    valueOf = Integer.valueOf(access$000);
                } catch (NumberFormatException e) {
                }
            }
            if (valueOf.intValue() <= 2) {
                this.f7540a.directSendContent("exit:");
                this.f7540a.directSendContent("exit1:");
                this.f7540a.directSendContent("exit2:");
                Thread.sleep(5000);
                this.f7540a.directStartWatchdog();
            }
            this.f7540a.isStarted = true;
        } catch (Throwable th) {
            ProGuard.m4723h(XGWatchdog.TAG, "jniStartWatchdog error:" + th.getMessage());
        }
    }
}
