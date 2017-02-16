package com.tencent.android.tpush.stat.p078a;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import com.tencent.android.tpush.XGPushConfig;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.tencent.android.tpush.stat.a.c */
class ProGuard {
    String f7812a;
    String f7813b;
    DisplayMetrics f7814c;
    int f7815d;
    String f7816e;
    String f7817f;
    String f7818g;
    String f7819h;
    String f7820i;
    String f7821j;
    int f7822k;
    String f7823l;
    Context f7824m;
    long f7825n;
    private String f7826o;
    private String f7827p;

    private ProGuard(Context context, long j) {
        this.f7813b = "2.0.6";
        this.f7815d = VERSION.SDK_INT;
        this.f7816e = Build.MODEL;
        this.f7817f = Build.MANUFACTURER;
        this.f7818g = Locale.getDefault().getLanguage();
        this.f7822k = 0;
        this.f7823l = null;
        this.f7824m = null;
        this.f7826o = null;
        this.f7827p = null;
        this.f7825n = 0;
        this.f7824m = context.getApplicationContext();
        this.f7814c = ProGuard.m5464b(this.f7824m);
        this.f7812a = ProGuard.m5466b(this.f7824m, j);
        this.f7819h = ProGuard.m5469c(this.f7824m);
        this.f7820i = TimeZone.getDefault().getID();
        this.f7821j = ProGuard.m5477g(this.f7824m);
        this.f7823l = this.f7824m.getPackageName();
        this.f7826o = ProGuard.m5479i(this.f7824m);
        this.f7827p = ProGuard.m5470d();
        this.f7825n = j;
    }

    void m5449a(JSONObject jSONObject, Thread thread) {
        if (thread == null) {
            if (this.f7814c != null) {
                jSONObject.put("sr", this.f7814c.widthPixels + "*" + this.f7814c.heightPixels);
                jSONObject.put("dpi", this.f7814c.xdpi + "*" + this.f7814c.ydpi);
            }
            if (com.tencent.android.tpush.stat.ProGuard.m5519a(this.f7824m).m5522b()) {
                JSONObject jSONObject2 = new JSONObject();
                ProGuard.m5505a(jSONObject2, "bs", ProGuard.m5514h(this.f7824m));
                ProGuard.m5505a(jSONObject2, "ss", ProGuard.m5515i(this.f7824m));
                if (jSONObject2.length() > 0) {
                    ProGuard.m5505a(jSONObject, "wf", jSONObject2.toString());
                }
            }
            JSONArray a = ProGuard.m5504a(this.f7824m, 10);
            if (a != null && a.length() > 0) {
                ProGuard.m5505a(jSONObject, "wflist", a.toString());
            }
        } else {
            ProGuard.m5505a(jSONObject, "thn", thread.getName());
            if (ProGuard.m5467b(this.f7826o) && this.f7826o.split("/").length == 2) {
                ProGuard.m5505a(jSONObject, "fram", this.f7826o.split("/")[0]);
            }
            if (ProGuard.m5467b(this.f7827p) && this.f7827p.split("/").length == 2) {
                ProGuard.m5505a(jSONObject, "from", this.f7827p.split("/")[0]);
            }
            jSONObject.put("ui", ProGuard.m5511e(this.f7824m));
            ProGuard.m5505a(jSONObject, "mid", XGPushConfig.getToken(this.f7824m));
        }
        ProGuard.m5505a(jSONObject, "pcn", ProGuard.m5478h(this.f7824m));
        ProGuard.m5505a(jSONObject, "osn", VERSION.RELEASE);
        ProGuard.m5505a(jSONObject, "av", this.f7812a);
        ProGuard.m5505a(jSONObject, "ch", com.tencent.android.tpush.stat.event.ProGuard.f7881f);
        ProGuard.m5505a(jSONObject, "mf", this.f7817f);
        if (this.f7825n > 0) {
            ProGuard.m5505a(jSONObject, "sv", ProGuard.m5459a(this.f7824m, this.f7825n));
        }
        ProGuard.m5505a(jSONObject, "osd", Build.DISPLAY);
        ProGuard.m5505a(jSONObject, "prod", Build.PRODUCT);
        ProGuard.m5505a(jSONObject, "tags", Build.TAGS);
        ProGuard.m5505a(jSONObject, "id", Build.ID);
        ProGuard.m5505a(jSONObject, "fng", Build.FINGERPRINT);
        ProGuard.m5505a(jSONObject, "ov", Integer.toString(this.f7815d));
        jSONObject.put("os", 1);
        ProGuard.m5505a(jSONObject, "op", this.f7819h);
        ProGuard.m5505a(jSONObject, "lg", this.f7818g);
        ProGuard.m5505a(jSONObject, "md", this.f7816e);
        ProGuard.m5505a(jSONObject, "tz", this.f7820i);
        if (this.f7822k != 0) {
            jSONObject.put("jb", this.f7822k);
        }
        ProGuard.m5505a(jSONObject, "sd", this.f7821j);
        ProGuard.m5505a(jSONObject, "abi", Build.CPU_ABI);
        ProGuard.m5505a(jSONObject, "ram", this.f7826o);
        ProGuard.m5505a(jSONObject, "rom", this.f7827p);
    }
}
