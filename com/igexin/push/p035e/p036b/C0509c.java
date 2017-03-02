package com.igexin.push.p035e.p036b;

import com.igexin.p022a.p023a.p030c.C0247a;
import com.igexin.push.core.C0482f;
import com.igexin.push.core.C0483g;
import com.igexin.push.core.C0485i;
import com.igexin.push.core.p045a.C0402e;
import java.util.concurrent.TimeUnit;

/* renamed from: com.igexin.push.e.b.c */
public class C0509c extends C0395f {
    private static C0509c f1409a;

    public C0509c() {
        super(C0485i.m1729a().m1734b());
        this.z = true;
    }

    public static C0509c m1821g() {
        if (f1409a == null) {
            f1409a = new C0509c();
        }
        return f1409a;
    }

    protected void m1822a() {
        C0402e.m1330a().m1342B();
        C0483g.f1293E = System.currentTimeMillis();
        if (C0483g.f1327m) {
            C0247a.m838b("heartbeatReq");
            C0482f.m1694a().m1714i().m1386f();
            return;
        }
        C0247a.m838b("HeartBeatTimerTask doTaskMethod isOnline = false, refresh wait time !!!!!!");
        m1826h();
    }

    public final int m1823b() {
        return -2147483642;
    }

    public void m1824c() {
        super.m741c();
        if (!this.w) {
            m1826h();
        }
    }

    public void m1825d() {
    }

    public void m1826h() {
        m734a(C0485i.m1729a().m1734b(), TimeUnit.MILLISECONDS);
    }

    public void m1827i() {
    }
}
