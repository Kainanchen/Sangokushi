package com.igexin.push.core.p050d;

import com.igexin.push.core.p045a.C0402e;
import java.util.TimerTask;

/* renamed from: com.igexin.push.core.d.d */
class C0470d extends TimerTask {
    final /* synthetic */ C0469c f1256a;

    C0470d(C0469c c0469c) {
        this.f1256a = c0469c;
    }

    public void run() {
        C0402e.m1330a().m1356a(this.f1256a.f1253b, this.f1256a.f1254c, this.f1256a.f1255d);
        this.f1256a.f1254c.m1178a(this.f1256a.f1254c.m1177a() + 1);
    }
}
