package com.igexin.push.p037a.p038a;

import com.igexin.push.core.C0483g;
import com.igexin.push.core.p045a.C0402e;
import com.igexin.push.p035e.p036b.C0335d;
import com.tencent.connect.common.Constants;

/* renamed from: com.igexin.push.a.a.b */
public class C0337b implements C0335d {
    private long f899a;

    public C0337b() {
        this.f899a = 0;
    }

    public void m1129a() {
        C0402e.m1330a().m1406z();
        C0402e.m1330a().m1398r();
        C0402e.m1330a().m1399s();
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - C0483g.f1298J > 3600000) {
            Object obj = 1;
            if (C0402e.m1330a().m1363a(currentTimeMillis)) {
                if (Constants.VIA_TO_TYPE_QQ_GROUP.equals(C0402e.m1330a().m1384e("ccs"))) {
                    obj = null;
                }
            }
            if (obj != null) {
                C0483g.f1298J = currentTimeMillis;
                C0402e.m1330a().m1405y();
            }
        }
        C0402e.m1330a().m1341A();
    }

    public void m1130a(long j) {
        this.f899a = j;
    }

    public boolean m1131b() {
        return System.currentTimeMillis() - this.f899a > 3600000;
    }
}
