package com.alipay.apmobilesecuritysdk.p007d;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.p006c.C0087a;
import com.alipay.apmobilesecuritysdk.p009f.C0098e;
import com.alipay.apmobilesecuritysdk.p009f.C0099f;
import com.alipay.apmobilesecuritysdk.p010g.C0104a;
import com.alipay.p011b.p012a.p013a.p014a.C0110a;
import com.alipay.p011b.p012a.p013a.p016b.C0113b;
import com.tencent.connect.common.Constants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.alipay.apmobilesecuritysdk.d.c */
public final class C0090c {
    public static Map<String, String> m143a(Context context) {
        String str;
        C0113b a = C0113b.m245a();
        Map<String, String> hashMap = new HashMap();
        C0099f a2 = C0098e.m174a(context);
        String a3 = C0113b.m246a(context);
        String b = C0113b.m249b(context);
        String l = C0113b.m268l(context);
        String o = C0113b.m274o(context);
        String n = C0113b.m272n(context);
        if (a2 != null) {
            if (C0110a.m234a(a3)) {
                a3 = a2.m175a();
            }
            if (C0110a.m234a(b)) {
                b = a2.m177b();
            }
            if (C0110a.m234a(l)) {
                l = a2.m179c();
            }
            if (C0110a.m234a(o)) {
                o = a2.m181d();
            }
            if (C0110a.m234a(n)) {
                n = a2.m183e();
            }
            str = n;
            n = o;
            o = l;
            l = b;
            b = a3;
        } else {
            str = n;
            n = o;
            o = l;
            l = b;
            b = a3;
        }
        C0099f c0099f = new C0099f(b, l, o, n, str);
        if (context != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("imei", c0099f.m175a());
                jSONObject.put("imsi", c0099f.m177b());
                jSONObject.put("mac", c0099f.m179c());
                jSONObject.put("bluetoothmac", c0099f.m181d());
                jSONObject.put("gsi", c0099f.m183e());
                a3 = jSONObject.toString();
                C0104a.m219a("device_feature_file_name", "device_feature_file_key", a3);
                C0104a.m218a(context, "device_feature_prefs_name", "device_feature_prefs_key", a3);
            } catch (Throwable e) {
                C0087a.m140a(e);
            }
        }
        hashMap.put("AD1", b);
        hashMap.put("AD2", l);
        hashMap.put("AD3", C0113b.m258g(context));
        hashMap.put("AD5", C0113b.m262i(context));
        hashMap.put("AD6", C0113b.m264j(context));
        hashMap.put("AD7", C0113b.m266k(context));
        hashMap.put("AD8", o);
        hashMap.put("AD9", C0113b.m270m(context));
        hashMap.put("AD10", str);
        hashMap.put("AD11", C0113b.m252d());
        hashMap.put("AD12", a.m291e());
        hashMap.put("AD13", C0113b.m255f());
        hashMap.put("AD14", C0113b.m259h());
        hashMap.put("AD15", C0113b.m261i());
        hashMap.put("AD16", C0113b.m263j());
        hashMap.put("AD17", Constants.STR_EMPTY);
        hashMap.put("AD18", n);
        hashMap.put("AD19", C0113b.m276p(context));
        hashMap.put("AD20", C0113b.m265k());
        hashMap.put("AD21", C0113b.m256f(context));
        hashMap.put("AD22", Constants.STR_EMPTY);
        hashMap.put("AD23", C0113b.m267l());
        hashMap.put("AD24", C0110a.m241f(C0113b.m260h(context)));
        hashMap.put("AD26", C0113b.m254e(context));
        hashMap.put("AD27", C0113b.m277q());
        hashMap.put("AD28", C0113b.m281s());
        hashMap.put("AD29", C0113b.m285u());
        hashMap.put("AD30", C0113b.m279r());
        hashMap.put("AD31", C0113b.m283t());
        hashMap.put("AD32", C0113b.m273o());
        hashMap.put("AD33", C0113b.m275p());
        hashMap.put("AD34", C0113b.m282s(context));
        hashMap.put("AD35", C0113b.m284t(context));
        hashMap.put("AD36", C0113b.m280r(context));
        hashMap.put("AD37", C0113b.m271n());
        hashMap.put("AD38", C0113b.m269m());
        hashMap.put("AD39", C0113b.m251c(context));
        hashMap.put("AD40", C0113b.m253d(context));
        hashMap.put("AD41", C0113b.m248b());
        hashMap.put("AD42", C0113b.m250c());
        hashMap.put("AL3", C0113b.m278q(context));
        return hashMap;
    }
}
