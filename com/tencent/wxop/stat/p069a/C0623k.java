package com.tencent.wxop.stat.p069a;

import android.content.Context;
import com.tencent.wxop.stat.StatSpecifyReportedInfo;
import com.tencent.wxop.stat.common.C0645q;
import org.json.JSONObject;

/* renamed from: com.tencent.wxop.stat.a.k */
public class C0623k extends C0613e {
    Long f1889a;
    String f1890m;
    String f1891n;

    public C0623k(Context context, String str, String str2, int i, Long l, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        super(context, i, statSpecifyReportedInfo);
        this.f1889a = null;
        this.f1891n = str;
        this.f1890m = str2;
        this.f1889a = l;
    }

    public C0618f m2279a() {
        return C0618f.PAGE_VIEW;
    }

    public boolean m2280a(JSONObject jSONObject) {
        C0645q.m2449a(jSONObject, "pi", this.f1890m);
        C0645q.m2449a(jSONObject, "rf", this.f1891n);
        if (this.f1889a != null) {
            jSONObject.put("du", this.f1889a);
        }
        return true;
    }
}
