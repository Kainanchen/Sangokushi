package com.tencent.wxop.stat.p069a;

import android.content.Context;
import com.tencent.wxop.stat.C0625a;
import com.tencent.wxop.stat.StatSpecifyReportedInfo;
import com.tencent.wxop.stat.common.C0639k;
import com.tencent.wxop.stat.common.C0645q;
import org.json.JSONObject;

/* renamed from: com.tencent.wxop.stat.a.j */
public class C0622j extends C0613e {
    private static String f1886a;
    private String f1887m;
    private String f1888n;

    static {
        f1886a = null;
    }

    public C0622j(Context context, int i, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        super(context, i, statSpecifyReportedInfo);
        this.f1887m = null;
        this.f1888n = null;
        this.f1887m = C0625a.m2283a(context).m2292b();
        if (f1886a == null) {
            f1886a = C0639k.m2416i(context);
        }
    }

    public C0618f m2276a() {
        return C0618f.NETWORK_MONITOR;
    }

    public void m2277a(String str) {
        this.f1888n = str;
    }

    public boolean m2278a(JSONObject jSONObject) {
        C0645q.m2449a(jSONObject, "op", f1886a);
        C0645q.m2449a(jSONObject, "cn", this.f1887m);
        jSONObject.put("sp", this.f1888n);
        return true;
    }
}
