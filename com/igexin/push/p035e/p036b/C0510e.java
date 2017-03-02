package com.igexin.push.p035e.p036b;

import com.igexin.p022a.p023a.p027b.C0244d;
import com.igexin.p022a.p023a.p030c.C0247a;
import com.igexin.push.config.C0377k;
import com.igexin.push.core.C0482f;
import com.igexin.push.core.C0483g;
import com.igexin.push.core.p045a.C0402e;
import com.igexin.push.p040c.p042b.C0348a;
import com.igexin.push.p052f.C0512a;
import java.util.concurrent.TimeUnit;

/* renamed from: com.igexin.push.e.b.e */
public class C0510e extends C0395f {
    private static final String f1410a;
    private static C0510e f1411b;

    static {
        f1410a = C0377k.f1013a;
    }

    private C0510e() {
        super(3600000);
        this.z = true;
    }

    public static C0510e m1828g() {
        if (f1411b == null) {
            f1411b = new C0510e();
        }
        return f1411b;
    }

    protected void m1829a() {
        C0402e.m1330a().m1342B();
        boolean a = C0402e.m1330a().m1363a(System.currentTimeMillis());
        boolean b = C0512a.m1844b();
        if (C0483g.f1323i && C0483g.f1324j && C0483g.f1325k && !C0483g.f1327m && !a && b && !C0483g.f1327m) {
            C0247a.m838b("ReconnectTimerTask|doTaskMethod|do login before");
            int d = C0482f.m1694a().m1714i().m1381d();
            C0247a.m838b("ReconnectTimerTask|doTaskMethod|do login result|" + d);
            if (d != 1 && d == 0) {
                C0244d.m802c().m797a((Object) new C0348a());
                C0244d.m802c().m814d();
            }
            m734a(1800000, TimeUnit.MILLISECONDS);
            return;
        }
        C0247a.m838b("ReconnectTimerTask|doTaskMethod|stop");
        m734a(3600000, TimeUnit.MILLISECONDS);
    }

    public final int m1830b() {
        return -2147483641;
    }

    public void m1831c() {
        super.m741c();
    }

    public void m1832d() {
    }

    public void m1833h() {
        long c = C0482f.m1694a().m1712g().m1803c();
        C0247a.m838b("ReconnectTimerTask|refreshDelayTime|" + c);
        m734a(c, TimeUnit.MILLISECONDS);
    }
}
