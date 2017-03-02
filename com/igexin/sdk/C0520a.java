package com.igexin.sdk;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.igexin.p022a.p023a.p030c.C0247a;

/* renamed from: com.igexin.sdk.a */
class C0520a implements ServiceConnection {
    final /* synthetic */ PushService f1445a;

    C0520a(PushService pushService) {
        this.f1445a = pushService;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C0247a.m838b(PushService.f1428a + " bind user process service success");
        this.f1445a.f1432e = true;
    }

    public void onServiceDisconnected(ComponentName componentName) {
        C0247a.m838b(PushService.f1428a + " user process service onServiceDisconnected");
        this.f1445a.f1432e = false;
        if (this.f1445a.f1431d) {
            C0247a.m838b(PushService.f1428a + " stop user process service by getui, onServiceDisconnected, not restart");
            this.f1445a.f1431d = false;
            return;
        }
        C0247a.m838b(PushService.f1428a + " stop user process service by usr, need restart #########");
        try {
            this.f1445a.bindService(new Intent(this.f1445a, PushServiceUser.class), this.f1445a.f1433f, 1);
        } catch (Throwable th) {
        }
    }
}
