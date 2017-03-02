package com.igexin.push.core.p045a;

import com.igexin.p022a.p023a.p025d.C0233d;
import com.igexin.p022a.p023a.p030c.C0247a;
import com.igexin.push.config.C0377k;
import com.igexin.push.core.C0485i;
import com.igexin.push.core.C0487k;
import com.igexin.push.p040c.p043c.C0358h;

/* renamed from: com.igexin.push.core.a.h */
public class C0405h extends C0397a {
    private static final String f1062a;

    static {
        f1062a = C0377k.f1013a;
    }

    public boolean m1410a(C0233d c0233d) {
        return false;
    }

    public boolean m1411a(Object obj) {
        if (obj instanceof C0358h) {
            C0247a.m838b("heartbeatRsp");
            C0485i.m1729a().m1732a(C0487k.HEARTBEAT_OK);
        }
        return true;
    }
}
