package com.tencent.wxop.stat.p069a;

import android.content.Context;
import com.tencent.wxop.stat.StatAccount;
import com.tencent.wxop.stat.StatSpecifyReportedInfo;
import com.tencent.wxop.stat.common.C0645q;
import org.json.JSONObject;

/* renamed from: com.tencent.wxop.stat.a.a */
public class C0614a extends C0613e {
    private StatAccount f1860a;

    public C0614a(Context context, int i, StatAccount statAccount, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        super(context, i, statSpecifyReportedInfo);
        this.f1860a = null;
        this.f1860a = statAccount;
    }

    public C0618f m2259a() {
        return C0618f.ADDITION;
    }

    public boolean m2260a(JSONObject jSONObject) {
        C0645q.m2449a(jSONObject, "qq", this.f1860a.getAccount());
        jSONObject.put("acc", this.f1860a.toJsonString());
        return true;
    }
}
