package com.tencent.p063a.p064a.p065a.p066a;

import android.util.Log;
import org.json.JSONObject;

/* renamed from: com.tencent.a.a.a.a.c */
public final class C1024c {
    String f7173a;
    String f7174b;
    public String f7175c;
    long f7176d;

    public C1024c() {
        this.f7173a = null;
        this.f7174b = null;
        this.f7175c = "0";
        this.f7176d = 0;
    }

    static C1024c m4636a(String str) {
        C1024c c1024c = new C1024c();
        if (C1028h.m4652a(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (!jSONObject.isNull("ui")) {
                    c1024c.f7173a = jSONObject.getString("ui");
                }
                if (!jSONObject.isNull("mc")) {
                    c1024c.f7174b = jSONObject.getString("mc");
                }
                if (!jSONObject.isNull("mid")) {
                    c1024c.f7175c = jSONObject.getString("mid");
                }
                if (!jSONObject.isNull("ts")) {
                    c1024c.f7176d = jSONObject.getLong("ts");
                }
            } catch (Throwable e) {
                Log.w("MID", e);
            }
        }
        return c1024c;
    }

    private JSONObject m4637a() {
        JSONObject jSONObject = new JSONObject();
        try {
            C1028h.m4650a(jSONObject, "ui", this.f7173a);
            C1028h.m4650a(jSONObject, "mc", this.f7174b);
            C1028h.m4650a(jSONObject, "mid", this.f7175c);
            jSONObject.put("ts", this.f7176d);
        } catch (Throwable e) {
            Log.w("MID", e);
        }
        return jSONObject;
    }

    public final String toString() {
        return m4637a().toString();
    }
}
