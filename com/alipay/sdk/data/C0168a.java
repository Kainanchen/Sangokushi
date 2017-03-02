package com.alipay.sdk.data;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.sdk.sys.C0191b;
import com.alipay.sdk.util.C0202i;
import org.json.JSONObject;

/* renamed from: com.alipay.sdk.data.a */
public final class C0168a {
    public static final int f374a = 3500;
    public static final String f375b = "http://h5.m.taobao.com/trade/paySuccess.html?bizOrderId=$OrderId$&";
    public static final int f376c = 1000;
    public static final int f377d = 20000;
    public static final String f378e = "alipay_cashier_dynamic_config";
    public static final String f379f = "timeout";
    public static final String f380g = "st_sdk_config";
    public static final String f381h = "tbreturl";
    private static C0168a f382k;
    int f383i;
    public String f384j;

    public C0168a() {
        this.f383i = f374a;
        this.f384j = f375b;
    }

    private static /* synthetic */ void m469a(C0168a c0168a) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(f379f, c0168a.m477a());
            jSONObject.put(f381h, c0168a.f384j);
            C0202i.m664a(C0191b.m600a().f467a, f378e, jSONObject.toString());
        } catch (Exception e) {
        }
    }

    private static /* synthetic */ void m470a(C0168a c0168a, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject optJSONObject = new JSONObject(str).optJSONObject(f380g);
                c0168a.f383i = optJSONObject.optInt(f379f, f374a);
                c0168a.f384j = optJSONObject.optString(f381h, f375b).trim();
            } catch (Throwable th) {
            }
        }
    }

    public final int m477a() {
        if (this.f383i < f376c || this.f383i > f377d) {
            return f374a;
        }
        new StringBuilder("DynamicConfig::getJumpTimeout >").append(this.f383i);
        return this.f383i;
    }

    private String m474c() {
        return this.f384j;
    }

    public static C0168a m472b() {
        if (f382k == null) {
            C0168a c0168a = new C0168a();
            f382k = c0168a;
            Object b = C0202i.m665b(C0191b.m600a().f467a, f378e, null);
            if (!TextUtils.isEmpty(b)) {
                try {
                    JSONObject jSONObject = new JSONObject(b);
                    c0168a.f383i = jSONObject.optInt(f379f, f374a);
                    c0168a.f384j = jSONObject.optString(f381h, f375b).trim();
                } catch (Throwable th) {
                }
            }
        }
        return f382k;
    }

    private void m475d() {
        Object b = C0202i.m665b(C0191b.m600a().f467a, f378e, null);
        if (!TextUtils.isEmpty(b)) {
            try {
                JSONObject jSONObject = new JSONObject(b);
                this.f383i = jSONObject.optInt(f379f, f374a);
                this.f384j = jSONObject.optString(f381h, f375b).trim();
            } catch (Throwable th) {
            }
        }
    }

    private void m471a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.f383i = jSONObject.optInt(f379f, f374a);
                this.f384j = jSONObject.optString(f381h, f375b).trim();
            } catch (Throwable th) {
            }
        }
    }

    private void m476e() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(f379f, m477a());
            jSONObject.put(f381h, this.f384j);
            C0202i.m664a(C0191b.m600a().f467a, f378e, jSONObject.toString());
        } catch (Exception e) {
        }
    }

    private void m473b(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject optJSONObject = new JSONObject(str).optJSONObject(f380g);
                this.f383i = optJSONObject.optInt(f379f, f374a);
                this.f384j = optJSONObject.optString(f381h, f375b).trim();
            } catch (Throwable th) {
            }
        }
    }

    public final void m478a(Context context) {
        new Thread(new C0169b(this, context)).start();
    }
}
