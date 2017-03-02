package com.tencent.wxop.stat.p069a;

import android.content.Context;
import com.alipay.sdk.sys.C0190a;
import com.tencent.connect.common.Constants;
import com.tencent.p055a.p056a.p057a.p058a.C0580h;
import com.tencent.wxop.stat.StatConfig;
import com.tencent.wxop.stat.StatSpecifyReportedInfo;
import com.tencent.wxop.stat.au;
import com.tencent.wxop.stat.common.C0629a;
import com.tencent.wxop.stat.common.C0639k;
import com.tencent.wxop.stat.common.C0645q;
import org.json.JSONObject;

/* renamed from: com.tencent.wxop.stat.a.e */
public abstract class C0613e {
    protected static String f1848j;
    private StatSpecifyReportedInfo f1849a;
    protected String f1850b;
    protected long f1851c;
    protected int f1852d;
    protected C0629a f1853e;
    protected int f1854f;
    protected String f1855g;
    protected String f1856h;
    protected String f1857i;
    protected boolean f1858k;
    protected Context f1859l;

    static {
        f1848j = null;
    }

    C0613e(Context context, int i, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        this.f1850b = null;
        this.f1853e = null;
        this.f1855g = null;
        this.f1856h = null;
        this.f1857i = null;
        this.f1858k = false;
        this.f1849a = null;
        this.f1859l = context;
        this.f1851c = System.currentTimeMillis() / 1000;
        this.f1852d = i;
        this.f1856h = StatConfig.getInstallChannel(context);
        this.f1857i = C0639k.m2417j(context);
        this.f1850b = StatConfig.getAppKey(context);
        if (statSpecifyReportedInfo != null) {
            this.f1849a = statSpecifyReportedInfo;
            if (C0639k.m2405c(statSpecifyReportedInfo.getAppKey())) {
                this.f1850b = statSpecifyReportedInfo.getAppKey();
            }
            if (C0639k.m2405c(statSpecifyReportedInfo.getInstallChannel())) {
                this.f1856h = statSpecifyReportedInfo.getInstallChannel();
            }
            if (C0639k.m2405c(statSpecifyReportedInfo.getVersion())) {
                this.f1857i = statSpecifyReportedInfo.getVersion();
            }
            this.f1858k = statSpecifyReportedInfo.isImportant();
        }
        this.f1855g = StatConfig.getCustomUserId(context);
        this.f1853e = au.m2317a(context).m2350b(context);
        if (m2251a() != C0618f.NETWORK_DETECTOR) {
            this.f1854f = C0639k.m2426s(context).intValue();
        } else {
            this.f1854f = -C0618f.NETWORK_DETECTOR.m2269a();
        }
        if (!C0580h.m1931c(f1848j)) {
            String localMidOnly = StatConfig.getLocalMidOnly(context);
            f1848j = localMidOnly;
            if (!C0639k.m2405c(localMidOnly)) {
                f1848j = Constants.VIA_RESULT_SUCCESS;
            }
        }
    }

    public abstract C0618f m2251a();

    public abstract boolean m2252a(JSONObject jSONObject);

    public boolean m2253b(JSONObject jSONObject) {
        boolean z = false;
        try {
            C0645q.m2449a(jSONObject, "ky", this.f1850b);
            jSONObject.put("et", m2251a().m2269a());
            if (this.f1853e != null) {
                jSONObject.put("ui", this.f1853e.m2366b());
                C0645q.m2449a(jSONObject, "mc", this.f1853e.m2367c());
                int d = this.f1853e.m2368d();
                jSONObject.put("ut", d);
                if (d == 0 && C0639k.m2430w(this.f1859l) == 1) {
                    jSONObject.put("ia", 1);
                }
            }
            C0645q.m2449a(jSONObject, "cui", this.f1855g);
            if (m2251a() != C0618f.SESSION_ENV) {
                C0645q.m2449a(jSONObject, C0190a.f460k, this.f1857i);
                C0645q.m2449a(jSONObject, "ch", this.f1856h);
            }
            if (this.f1858k) {
                jSONObject.put("impt", 1);
            }
            C0645q.m2449a(jSONObject, "mid", f1848j);
            jSONObject.put("idx", this.f1854f);
            jSONObject.put("si", this.f1852d);
            jSONObject.put("ts", this.f1851c);
            jSONObject.put("dts", C0639k.m2390a(this.f1859l, false));
            z = m2252a(jSONObject);
        } catch (Throwable th) {
        }
        return z;
    }

    public long m2254c() {
        return this.f1851c;
    }

    public StatSpecifyReportedInfo m2255d() {
        return this.f1849a;
    }

    public Context m2256e() {
        return this.f1859l;
    }

    public boolean m2257f() {
        return this.f1858k;
    }

    public String m2258g() {
        try {
            JSONObject jSONObject = new JSONObject();
            m2253b(jSONObject);
            return jSONObject.toString();
        } catch (Throwable th) {
            return Constants.STR_EMPTY;
        }
    }
}
