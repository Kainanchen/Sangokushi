package com.igexin.push.p047d;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.igexin.push.core.C0465c;
import com.igexin.push.core.C0478d;
import com.igexin.push.core.C0482f;
import com.igexin.sdk.aidl.C0492c;

/* renamed from: com.igexin.push.d.f */
class C0500f implements ServiceConnection {
    final /* synthetic */ C0497c f1380a;

    C0500f(C0497c c0497c) {
        this.f1380a = c0497c;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.f1380a.f1370b == C0478d.prepare) {
            this.f1380a.f1373e.m1747a(C0492c.m1741a(iBinder));
            C0495a c0495a = new C0495a();
            c0495a.m1744a(C0465c.connectASNL);
            this.f1380a.m1774a(c0495a);
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        if (this.f1380a.f1370b == C0478d.passive) {
            C0482f.m1694a().m1712g().m1802b(true);
            this.f1380a.m1763c();
        }
    }
}
