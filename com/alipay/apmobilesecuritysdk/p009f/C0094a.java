package com.alipay.apmobilesecuritysdk.p009f;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.p006c.C0087a;
import com.alipay.apmobilesecuritysdk.p010g.C0104a;
import com.alipay.p011b.p012a.p013a.p014a.C0110a;
import com.tencent.connect.common.Constants;
import org.json.JSONObject;

/* renamed from: com.alipay.apmobilesecuritysdk.f.a */
public final class C0094a {
    private static C0095b m152a(String str) {
        try {
            if (!C0110a.m234a(str)) {
                JSONObject jSONObject = new JSONObject(str);
                return new C0095b(jSONObject.optString("apdid"), jSONObject.optString("deviceInfoHash"), jSONObject.optString("timestamp"));
            }
        } catch (Throwable e) {
            C0087a.m140a(e);
        }
        return null;
    }

    public static synchronized void m153a() {
        synchronized (C0094a.class) {
        }
    }

    public static synchronized void m154a(Context context) {
        synchronized (C0094a.class) {
            C0104a.m218a(context, "vkeyid_profiles_v3", "deviceid", Constants.STR_EMPTY);
            C0104a.m219a("wxcasxx_v3", "wxcasxx", Constants.STR_EMPTY);
        }
    }

    public static synchronized void m155a(Context context, C0095b c0095b) {
        synchronized (C0094a.class) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("apdid", c0095b.m159a());
                jSONObject.put("deviceInfoHash", c0095b.m160b());
                jSONObject.put("timestamp", c0095b.m161c());
                String jSONObject2 = jSONObject.toString();
                C0104a.m218a(context, "vkeyid_profiles_v3", "deviceid", jSONObject2);
                C0104a.m219a("wxcasxx_v3", "wxcasxx", jSONObject2);
            } catch (Throwable e) {
                C0087a.m140a(e);
            }
        }
    }

    public static synchronized C0095b m156b() {
        C0095b a;
        synchronized (C0094a.class) {
            String a2 = C0104a.m217a("wxcasxx_v3", "wxcasxx");
            a = C0110a.m234a(a2) ? null : C0094a.m152a(a2);
        }
        return a;
    }

    public static synchronized C0095b m157b(Context context) {
        C0095b a;
        synchronized (C0094a.class) {
            String a2 = C0104a.m216a(context, "vkeyid_profiles_v3", "deviceid");
            if (C0110a.m234a(a2)) {
                a2 = C0104a.m217a("wxcasxx_v3", "wxcasxx");
            }
            a = C0094a.m152a(a2);
        }
        return a;
    }

    public static synchronized C0095b m158c(Context context) {
        C0095b a;
        synchronized (C0094a.class) {
            String a2 = C0104a.m216a(context, "vkeyid_profiles_v3", "deviceid");
            a = C0110a.m234a(a2) ? null : C0094a.m152a(a2);
        }
        return a;
    }
}
