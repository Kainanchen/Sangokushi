package com.igexin.push.p047d;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.igexin.push.core.C0478d;
import com.igexin.push.core.C0482f;
import com.igexin.push.core.C0483g;
import com.igexin.push.p040c.p043c.C0351e;
import com.igexin.push.p040c.p043c.C0362l;
import com.igexin.sdk.aidl.C0492c;
import java.util.List;

/* renamed from: com.igexin.push.d.g */
class C0501g implements ServiceConnection {
    final /* synthetic */ C0496b f1381a;
    final /* synthetic */ String f1382b;
    final /* synthetic */ C0497c f1383c;

    C0501g(C0497c c0497c, C0496b c0496b, String str) {
        this.f1383c = c0497c;
        this.f1381a = c0496b;
        this.f1382b = str;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.f1383c.f1370b == C0478d.active) {
            try {
                this.f1381a.m1747a(C0492c.m1741a(iBinder));
                this.f1383c.f1375g.put(this.f1382b, this.f1381a);
                if (this.f1381a.m1751c().onASNLConnected(this.f1381a.m1745a(), this.f1381a.m1749b(), this.f1382b, 0) == -1) {
                    this.f1383c.f1375g.remove(this.f1382b);
                } else if (C0483g.f1327m) {
                    this.f1381a.m1751c().onASNLNetworkConnected();
                }
            } catch (Exception e) {
                this.f1383c.f1375g.remove(this.f1382b);
            }
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        if (this.f1383c.f1370b == C0478d.active) {
            C0496b c0496b = (C0496b) this.f1383c.f1375g.get(this.f1382b);
            this.f1383c.f1375g.remove(this.f1382b);
            List a = this.f1383c.m1762c(c0496b.m1754e());
            if (a.size() != 0) {
                for (int i = 0; i < a.size(); i++) {
                    String str = (String) a.get(i);
                    if (str.startsWith("S-")) {
                        C0351e c0362l = new C0362l();
                        c0362l.f981a = Long.valueOf(str.substring(2)).longValue();
                        C0482f.m1694a().m1712g().m1796a("S-" + String.valueOf(c0362l.f981a), c0362l, true);
                    }
                    this.f1383c.f1376h.remove(str);
                }
            }
        }
    }
}
