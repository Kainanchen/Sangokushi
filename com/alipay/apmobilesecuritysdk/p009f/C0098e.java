package com.alipay.apmobilesecuritysdk.p009f;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.p006c.C0087a;
import com.alipay.apmobilesecuritysdk.p010g.C0104a;
import com.alipay.p011b.p012a.p013a.p014a.C0110a;
import org.json.JSONObject;

/* renamed from: com.alipay.apmobilesecuritysdk.f.e */
public final class C0098e {
    public static C0099f m174a(Context context) {
        if (context == null) {
            return null;
        }
        String a = C0104a.m216a(context, "device_feature_prefs_name", "device_feature_prefs_key");
        if (C0110a.m234a(a)) {
            a = C0104a.m217a("device_feature_file_name", "device_feature_file_key");
        }
        if (C0110a.m234a(a)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(a);
            C0099f c0099f = new C0099f();
            c0099f.m176a(jSONObject.getString("imei"));
            c0099f.m178b(jSONObject.getString("imsi"));
            c0099f.m180c(jSONObject.getString("mac"));
            c0099f.m182d(jSONObject.getString("bluetoothmac"));
            c0099f.m184e(jSONObject.getString("gsi"));
            return c0099f;
        } catch (Throwable e) {
            C0087a.m140a(e);
            return null;
        }
    }
}
