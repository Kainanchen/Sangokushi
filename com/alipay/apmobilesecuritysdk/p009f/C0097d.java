package com.alipay.apmobilesecuritysdk.p009f;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.p006c.C0087a;
import com.alipay.apmobilesecuritysdk.p010g.C0104a;
import com.alipay.p011b.p012a.p013a.p014a.C0110a;
import com.alipay.sdk.cons.C0166b;
import com.tencent.connect.common.Constants;
import org.json.JSONObject;

/* renamed from: com.alipay.apmobilesecuritysdk.f.d */
public final class C0097d {
    private static C0096c m167a(String str) {
        try {
            if (!C0110a.m234a(str)) {
                JSONObject jSONObject = new JSONObject(str);
                return new C0096c(jSONObject.optString("apdid"), jSONObject.optString("deviceInfoHash"), jSONObject.optString("timestamp"), jSONObject.optString(C0166b.f352c), jSONObject.optString(C0166b.f356g));
            }
        } catch (Throwable e) {
            C0087a.m140a(e);
        }
        return null;
    }

    public static synchronized void m168a() {
        synchronized (C0097d.class) {
        }
    }

    public static synchronized void m169a(Context context) {
        synchronized (C0097d.class) {
            C0104a.m218a(context, "vkeyid_profiles_v4", "key_deviceid_v4", Constants.STR_EMPTY);
            C0104a.m219a("wxcasxx_v4", "key_wxcasxx_v4", Constants.STR_EMPTY);
        }
    }

    public static synchronized void m170a(Context context, C0096c c0096c) {
        synchronized (C0097d.class) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("apdid", c0096c.m162a());
                jSONObject.put("deviceInfoHash", c0096c.m163b());
                jSONObject.put("timestamp", c0096c.m164c());
                jSONObject.put(C0166b.f352c, c0096c.m165d());
                jSONObject.put(C0166b.f356g, c0096c.m166e());
                String jSONObject2 = jSONObject.toString();
                C0104a.m218a(context, "vkeyid_profiles_v4", "key_deviceid_v4", jSONObject2);
                C0104a.m219a("wxcasxx_v4", "key_wxcasxx_v4", jSONObject2);
            } catch (Throwable e) {
                C0087a.m140a(e);
            }
        }
    }

    public static synchronized C0096c m171b() {
        C0096c a;
        synchronized (C0097d.class) {
            String a2 = C0104a.m217a("wxcasxx_v4", "key_wxcasxx_v4");
            a = C0110a.m234a(a2) ? null : C0097d.m167a(a2);
        }
        return a;
    }

    public static synchronized C0096c m172b(Context context) {
        C0096c a;
        synchronized (C0097d.class) {
            String a2 = C0104a.m216a(context, "vkeyid_profiles_v4", "key_deviceid_v4");
            if (C0110a.m234a(a2)) {
                a2 = C0104a.m217a("wxcasxx_v4", "key_wxcasxx_v4");
            }
            a = C0097d.m167a(a2);
        }
        return a;
    }

    public static synchronized C0096c m173c(Context context) {
        C0096c a;
        synchronized (C0097d.class) {
            String a2 = C0104a.m216a(context, "vkeyid_profiles_v4", "key_deviceid_v4");
            a = C0110a.m234a(a2) ? null : C0097d.m167a(a2);
        }
        return a;
    }
}
