package com.tencent.android.tpush.service.channel;

import com.tencent.android.tpush.service.channel.exception.ChannelException;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.tencent.android.tpush.service.channel.k */
class ProGuard implements Runnable {
    final /* synthetic */ ProGuard f7702a;
    private com.tencent.android.tpush.service.channel.p074a.ProGuard f7703b;
    private ChannelException f7704c;
    private boolean f7705d;

    public ProGuard(ProGuard proGuard, com.tencent.android.tpush.service.channel.p074a.ProGuard proGuard2, ChannelException channelException, boolean z) {
        this.f7702a = proGuard;
        this.f7703b = null;
        this.f7704c = null;
        this.f7705d = false;
        this.f7703b = proGuard2;
        this.f7704c = channelException;
        this.f7705d = z;
    }

    public void run() {
        if (this.f7703b == null) {
            com.tencent.android.tpush.p067a.ProGuard.m4723h("TpnsChannel", "@@RequestFailRunnable currentClient == null");
            return;
        }
        Iterator it;
        ProGuard proGuard;
        long currentTimeMillis = System.currentTimeMillis();
        ProGuard f = this.f7703b.m5124f();
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f7702a.f7656k.get(this.f7703b);
        if (concurrentHashMap != null) {
            for (ProGuard proGuard2 : concurrentHashMap.values()) {
                proGuard = proGuard2.f7715d;
                if (proGuard != null) {
                    f.m5140a(3, Long.valueOf(currentTimeMillis - proGuard2.f7713b));
                    this.f7702a.f7654i.removeCallbacks((ProGuard) this.f7702a.f7657l.remove(proGuard2));
                    proGuard.m5079a(proGuard2.f7714c, this.f7704c, f);
                }
            }
            concurrentHashMap.clear();
        }
        if (!this.f7703b.m5123e()) {
            synchronized (this.f7702a) {
                it = this.f7702a.f7655j.iterator();
                while (it.hasNext()) {
                    ProGuard proGuard3 = (ProGuard) it.next();
                    proGuard = proGuard3.f7715d;
                    if (proGuard != null) {
                        f.m5140a(3, Long.valueOf(currentTimeMillis - proGuard3.f7713b));
                        this.f7702a.f7654i.removeCallbacks((ProGuard) this.f7702a.f7657l.get(proGuard3));
                        proGuard.m5079a(proGuard3.f7714c, this.f7704c, f);
                    }
                }
                this.f7702a.f7655j.clear();
            }
        }
        ProGuard.f7643a = 0;
        if (ProGuard.f7648f > ProGuard.f7646d) {
            ProGuard.f7648f = (ProGuard.f7648f / 10) * 9;
        } else {
            ProGuard.f7648f = ProGuard.f7646d;
        }
        this.f7702a.m5225c();
        if (!this.f7702a.f7655j.isEmpty()) {
            this.f7702a.m5227e();
        }
        if (this.f7705d) {
            this.f7702a.m5228f();
        }
    }
}
