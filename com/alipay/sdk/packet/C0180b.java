package com.alipay.sdk.packet;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: com.alipay.sdk.packet.b */
public final class C0180b {
    String f415a;
    public String f416b;

    public C0180b(String str, String str2) {
        this.f415a = str;
        this.f416b = str2;
    }

    private String m543b() {
        return this.f415a;
    }

    private void m542a(String str) {
        this.f415a = str;
    }

    private String m545c() {
        return this.f416b;
    }

    private void m544b(String str) {
        this.f416b = str;
    }

    public final JSONObject m546a() {
        if (TextUtils.isEmpty(this.f416b)) {
            return null;
        }
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject(this.f416b);
        } catch (Exception e) {
            jSONObject = null;
        }
        return jSONObject;
    }

    public final String toString() {
        return "\nenvelop:" + this.f415a + "\nbody:" + this.f416b;
    }
}
