package com.igexin.push.core.p045a;

import android.text.TextUtils;
import com.igexin.p022a.p023a.p025d.C0233d;
import com.igexin.p022a.p023a.p030c.C0247a;
import com.igexin.push.config.C0377k;
import com.igexin.push.core.C0482f;
import com.igexin.push.core.C0483g;
import com.igexin.push.core.p044c.C0444f;
import com.igexin.push.p040c.p043c.C0351e;
import com.igexin.push.p040c.p043c.C0365o;

/* renamed from: com.igexin.push.core.a.o */
public class C0412o extends C0397a {
    private static final String f1067a;

    static {
        f1067a = C0377k.f1013a + "_RegisterResultAction";
    }

    public boolean m1423a(C0233d c0233d) {
        return false;
    }

    public boolean m1424a(Object obj) {
        boolean z = false;
        if (obj instanceof C0365o) {
            C0365o c0365o = (C0365o) obj;
            C0483g.f1292D = 0;
            C0247a.m838b("register resp |" + c0365o.f995a + "|" + C0483g.f1332r);
            C0247a.m838b("register resp cid = " + c0365o.f997c + " device id = " + c0365o.f998d);
            if (c0365o.f995a != C0483g.f1332r) {
                C0483g.f1328n = false;
                C0247a.m838b(f1067a + " change session : from [" + C0483g.f1332r + "] to [" + c0365o.f995a + "]");
                C0247a.m838b(f1067a + " change cid : from [" + C0483g.f1333s + "] to [" + c0365o.f997c + "]");
                if (TextUtils.isEmpty(c0365o.f997c) || TextUtils.isEmpty(c0365o.f998d)) {
                    C0444f.m1577a().m1591a(c0365o.f995a);
                } else {
                    C0444f.m1577a().m1593a(c0365o.f997c, c0365o.f998d, c0365o.f995a);
                }
                C0483g.f1294F = 0;
                z = true;
            }
            C0247a.m838b("loginReqAfterRegister|new session:" + C0483g.f1332r + ", cid :" + C0483g.f1333s + ", devId :" + C0483g.f1340z);
            C0351e c = C0402e.m1330a().m1378c();
            C0482f.m1694a().m1712g().m1796a("S-" + c.f969a, c, true);
            if (z) {
                return true;
            }
        }
        return true;
    }
}
