package com.tencent.p080b.p081a.p083b;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.b.a.b.c */
public final class C1040c {
    public String f8025a;
    public String f8026b;
    public int f8027c;
    private String f8028d;
    private String f8029e;
    private int f8030f;
    private long f8031g;

    public C1040c() {
        this.f8025a = null;
        this.f8026b = null;
        this.f8028d = null;
        this.f8029e = "0";
        this.f8030f = 0;
        this.f8031g = 0;
    }

    public C1040c(String str, String str2, int i) {
        this.f8025a = null;
        this.f8026b = null;
        this.f8028d = null;
        this.f8029e = "0";
        this.f8030f = 0;
        this.f8031g = 0;
        this.f8025a = str;
        this.f8026b = str2;
        this.f8027c = i;
    }

    private JSONObject m5671a() {
        JSONObject jSONObject = new JSONObject();
        try {
            C1055r.m5737a(jSONObject, "ui", this.f8025a);
            C1055r.m5737a(jSONObject, "mc", this.f8026b);
            C1055r.m5737a(jSONObject, "mid", this.f8029e);
            C1055r.m5737a(jSONObject, LogBuilder.KEY_AID, this.f8028d);
            jSONObject.put("ts", this.f8031g);
            jSONObject.put("ver", this.f8030f);
        } catch (JSONException e) {
        }
        return jSONObject;
    }

    public final String toString() {
        return m5671a().toString();
    }
}
