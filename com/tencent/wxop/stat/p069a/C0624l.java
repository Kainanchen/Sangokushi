package com.tencent.wxop.stat.p069a;

import android.content.Context;
import com.tencent.wxop.stat.StatSpecifyReportedInfo;
import com.tencent.wxop.stat.common.C0630b;
import com.tencent.wxop.stat.common.C0639k;
import org.json.JSONObject;

/* renamed from: com.tencent.wxop.stat.a.l */
public class C0624l extends C0613e {
    private C0630b f1892a;
    private JSONObject f1893m;

    public C0624l(Context context, int i, JSONObject jSONObject, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        super(context, i, statSpecifyReportedInfo);
        this.f1893m = null;
        this.f1892a = new C0630b(context);
        this.f1893m = jSONObject;
    }

    public C0618f m2281a() {
        return C0618f.SESSION_ENV;
    }

    public boolean m2282a(JSONObject jSONObject) {
        if (this.f1853e != null) {
            jSONObject.put("ut", this.f1853e.m2368d());
        }
        if (this.f1893m != null) {
            jSONObject.put("cfg", this.f1893m);
        }
        if (C0639k.m2432y(this.l)) {
            jSONObject.put("ncts", 1);
        }
        this.f1892a.m2371a(jSONObject, null);
        return true;
    }
}
