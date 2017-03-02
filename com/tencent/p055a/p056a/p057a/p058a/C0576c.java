package com.tencent.p055a.p056a.p057a.p058a;

import android.util.Log;
import com.tencent.connect.common.Constants;
import org.json.JSONObject;

/* renamed from: com.tencent.a.a.a.a.c */
public final class C0576c {
    long f1453T;
    String f1454a;
    String f1455b;
    String f1456c;

    public C0576c() {
        this.f1454a = null;
        this.f1455b = null;
        this.f1456c = Constants.VIA_RESULT_SUCCESS;
        this.f1453T = 0;
    }

    static C0576c m1912e(String str) {
        C0576c c0576c = new C0576c();
        if (C0580h.m1930b(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (!jSONObject.isNull("ui")) {
                    c0576c.f1454a = jSONObject.getString("ui");
                }
                if (!jSONObject.isNull("mc")) {
                    c0576c.f1455b = jSONObject.getString("mc");
                }
                if (!jSONObject.isNull("mid")) {
                    c0576c.f1456c = jSONObject.getString("mid");
                }
                if (!jSONObject.isNull("ts")) {
                    c0576c.f1453T = jSONObject.getLong("ts");
                }
            } catch (Throwable e) {
                Log.w("MID", e);
            }
        }
        return c0576c;
    }

    private JSONObject m1913n() {
        JSONObject jSONObject = new JSONObject();
        try {
            C0580h.m1927a(jSONObject, "ui", this.f1454a);
            C0580h.m1927a(jSONObject, "mc", this.f1455b);
            C0580h.m1927a(jSONObject, "mid", this.f1456c);
            jSONObject.put("ts", this.f1453T);
        } catch (Throwable e) {
            Log.w("MID", e);
        }
        return jSONObject;
    }

    public final String m1914a() {
        return this.f1456c;
    }

    public final String toString() {
        return m1913n().toString();
    }
}
