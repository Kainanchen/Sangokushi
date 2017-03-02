package com.tencent.wxop.stat.p069a;

import android.content.Context;
import com.tencent.wxop.stat.StatConfig;
import com.tencent.wxop.stat.StatSpecifyReportedInfo;
import com.tencent.wxop.stat.common.C0645q;
import org.json.JSONObject;

/* renamed from: com.tencent.wxop.stat.a.i */
public class C0621i extends C0613e {
    public static final StatSpecifyReportedInfo f1885a;

    static {
        StatSpecifyReportedInfo statSpecifyReportedInfo = new StatSpecifyReportedInfo();
        f1885a = statSpecifyReportedInfo;
        statSpecifyReportedInfo.setAppKey("A9VH9B8L4GX4");
    }

    public C0621i(Context context) {
        super(context, 0, f1885a);
    }

    public C0618f m2274a() {
        return C0618f.NETWORK_DETECTOR;
    }

    public boolean m2275a(JSONObject jSONObject) {
        C0645q.m2449a(jSONObject, "actky", StatConfig.getAppKey(this.l));
        return true;
    }
}
