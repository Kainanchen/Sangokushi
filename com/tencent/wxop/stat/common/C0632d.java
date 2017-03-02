package com.tencent.wxop.stat.common;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import com.alipay.sdk.sys.C0190a;
import com.tencent.wxop.stat.C0625a;
import com.tencent.wxop.stat.StatConfig;
import com.tencent.wxop.stat.au;
import com.zkunity.app.ResourceIDs;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.tencent.wxop.stat.common.d */
class C0632d {
    String f2006a;
    String f2007b;
    DisplayMetrics f2008c;
    int f2009d;
    String f2010e;
    String f2011f;
    String f2012g;
    String f2013h;
    String f2014i;
    String f2015j;
    String f2016k;
    int f2017l;
    String f2018m;
    String f2019n;
    Context f2020o;
    private String f2021p;
    private String f2022q;
    private String f2023r;
    private String f2024s;

    private C0632d(Context context) {
        this.f2007b = StatConstants.VERSION;
        this.f2009d = VERSION.SDK_INT;
        this.f2010e = Build.MODEL;
        this.f2011f = Build.MANUFACTURER;
        this.f2012g = Locale.getDefault().getLanguage();
        this.f2017l = 0;
        this.f2018m = null;
        this.f2019n = null;
        this.f2020o = null;
        this.f2021p = null;
        this.f2022q = null;
        this.f2023r = null;
        this.f2024s = null;
        this.f2020o = context.getApplicationContext();
        this.f2008c = C0639k.m2406d(this.f2020o);
        this.f2006a = C0639k.m2417j(this.f2020o);
        this.f2013h = StatConfig.getInstallChannel(this.f2020o);
        this.f2014i = C0639k.m2416i(this.f2020o);
        this.f2015j = TimeZone.getDefault().getID();
        this.f2017l = C0639k.m2422o(this.f2020o);
        this.f2016k = C0639k.m2423p(this.f2020o);
        this.f2018m = this.f2020o.getPackageName();
        if (this.f2009d >= 14) {
            this.f2021p = C0639k.m2429v(this.f2020o);
        }
        this.f2022q = C0639k.m2428u(this.f2020o).toString();
        this.f2023r = C0639k.m2427t(this.f2020o);
        this.f2024s = C0639k.m2407d();
        this.f2019n = C0639k.m2387C(this.f2020o);
    }

    void m2372a(JSONObject jSONObject, Thread thread) {
        if (thread == null) {
            if (this.f2008c != null) {
                jSONObject.put("sr", this.f2008c.widthPixels + "*" + this.f2008c.heightPixels);
                jSONObject.put("dpi", this.f2008c.xdpi + "*" + this.f2008c.ydpi);
            }
            if (C0625a.m2283a(this.f2020o).m2295e()) {
                JSONObject jSONObject2 = new JSONObject();
                C0645q.m2449a(jSONObject2, "bs", C0645q.m2454d(this.f2020o));
                C0645q.m2449a(jSONObject2, "ss", C0645q.m2455e(this.f2020o));
                if (jSONObject2.length() > 0) {
                    C0645q.m2449a(jSONObject, "wf", jSONObject2.toString());
                }
            }
            JSONArray a = C0645q.m2448a(this.f2020o, 10);
            if (a != null && a.length() > 0) {
                C0645q.m2449a(jSONObject, "wflist", a.toString());
            }
            C0645q.m2449a(jSONObject, "sen", this.f2021p);
        } else {
            C0645q.m2449a(jSONObject, "thn", thread.getName());
            C0645q.m2449a(jSONObject, "qq", StatConfig.getQQ(this.f2020o));
            C0645q.m2449a(jSONObject, "cui", StatConfig.getCustomUserId(this.f2020o));
            if (C0639k.m2405c(this.f2023r) && this.f2023r.split("/").length == 2) {
                C0645q.m2449a(jSONObject, "fram", this.f2023r.split("/")[0]);
            }
            if (C0639k.m2405c(this.f2024s) && this.f2024s.split("/").length == 2) {
                C0645q.m2449a(jSONObject, "from", this.f2024s.split("/")[0]);
            }
            if (au.m2317a(this.f2020o).m2350b(this.f2020o) != null) {
                jSONObject.put("ui", au.m2317a(this.f2020o).m2350b(this.f2020o).m2366b());
            }
            C0645q.m2449a(jSONObject, "mid", StatConfig.getLocalMidOnly(this.f2020o));
        }
        C0645q.m2449a(jSONObject, "pcn", C0639k.m2424q(this.f2020o));
        C0645q.m2449a(jSONObject, "osn", VERSION.RELEASE);
        C0645q.m2449a(jSONObject, C0190a.f460k, this.f2006a);
        C0645q.m2449a(jSONObject, "ch", this.f2013h);
        C0645q.m2449a(jSONObject, "mf", this.f2011f);
        C0645q.m2449a(jSONObject, C0190a.f457h, this.f2007b);
        C0645q.m2449a(jSONObject, "osd", Build.DISPLAY);
        C0645q.m2449a(jSONObject, "prod", Build.PRODUCT);
        C0645q.m2449a(jSONObject, "tags", Build.TAGS);
        C0645q.m2449a(jSONObject, ResourceIDs.ID, Build.ID);
        C0645q.m2449a(jSONObject, "fng", Build.FINGERPRINT);
        C0645q.m2449a(jSONObject, "lch", this.f2019n);
        C0645q.m2449a(jSONObject, "ov", Integer.toString(this.f2009d));
        jSONObject.put("os", 1);
        C0645q.m2449a(jSONObject, "op", this.f2014i);
        C0645q.m2449a(jSONObject, "lg", this.f2012g);
        C0645q.m2449a(jSONObject, "md", this.f2010e);
        C0645q.m2449a(jSONObject, "tz", this.f2015j);
        if (this.f2017l != 0) {
            jSONObject.put("jb", this.f2017l);
        }
        C0645q.m2449a(jSONObject, "sd", this.f2016k);
        C0645q.m2449a(jSONObject, "apn", this.f2018m);
        C0645q.m2449a(jSONObject, "cpu", this.f2022q);
        C0645q.m2449a(jSONObject, "abi", Build.CPU_ABI);
        C0645q.m2449a(jSONObject, "abi2", Build.CPU_ABI2);
        C0645q.m2449a(jSONObject, "ram", this.f2023r);
        C0645q.m2449a(jSONObject, "rom", this.f2024s);
    }
}
