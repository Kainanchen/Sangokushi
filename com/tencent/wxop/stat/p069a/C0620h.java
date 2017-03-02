package com.tencent.wxop.stat.p069a;

import android.content.Context;
import com.alipay.sdk.sys.C0190a;
import com.tencent.wxop.stat.C0625a;
import com.tencent.wxop.stat.StatAppMonitor;
import com.tencent.wxop.stat.StatSpecifyReportedInfo;
import com.tencent.wxop.stat.common.C0639k;
import com.tencent.wxop.stat.common.C0645q;
import org.json.JSONObject;

/* renamed from: com.tencent.wxop.stat.a.h */
public class C0620h extends C0613e {
    private static String f1882m;
    private static String f1883n;
    private StatAppMonitor f1884a;

    static {
        f1882m = null;
        f1883n = null;
    }

    public C0620h(Context context, int i, StatAppMonitor statAppMonitor, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        super(context, i, statSpecifyReportedInfo);
        this.f1884a = null;
        this.f1884a = statAppMonitor.clone();
    }

    public C0618f m2272a() {
        return C0618f.MONITOR_STAT;
    }

    public boolean m2273a(JSONObject jSONObject) {
        if (this.f1884a == null) {
            return false;
        }
        jSONObject.put("na", this.f1884a.getInterfaceName());
        jSONObject.put("rq", this.f1884a.getReqSize());
        jSONObject.put("rp", this.f1884a.getRespSize());
        jSONObject.put("rt", this.f1884a.getResultType());
        jSONObject.put("tm", this.f1884a.getMillisecondsConsume());
        jSONObject.put("rc", this.f1884a.getReturnCode());
        jSONObject.put("sp", this.f1884a.getSampling());
        if (f1883n == null) {
            f1883n = C0639k.m2421n(this.l);
        }
        C0645q.m2449a(jSONObject, C0190a.f460k, f1883n);
        if (f1882m == null) {
            f1882m = C0639k.m2416i(this.l);
        }
        C0645q.m2449a(jSONObject, "op", f1882m);
        jSONObject.put("cn", C0625a.m2283a(this.l).m2292b());
        return true;
    }
}
