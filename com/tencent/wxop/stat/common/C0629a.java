package com.tencent.wxop.stat.common;

import com.tencent.connect.common.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.wxop.stat.common.a */
public class C0629a {
    private String f1994a;
    private String f1995b;
    private String f1996c;
    private String f1997d;
    private int f1998e;
    private int f1999f;
    private long f2000g;

    public C0629a() {
        this.f1994a = null;
        this.f1995b = null;
        this.f1996c = null;
        this.f1997d = Constants.VIA_RESULT_SUCCESS;
        this.f1999f = 0;
        this.f2000g = 0;
    }

    public C0629a(String str, String str2, int i) {
        this.f1994a = null;
        this.f1995b = null;
        this.f1996c = null;
        this.f1997d = Constants.VIA_RESULT_SUCCESS;
        this.f1999f = 0;
        this.f2000g = 0;
        this.f1994a = str;
        this.f1995b = str2;
        this.f1998e = i;
    }

    JSONObject m2364a() {
        JSONObject jSONObject = new JSONObject();
        try {
            C0645q.m2449a(jSONObject, "ui", this.f1994a);
            C0645q.m2449a(jSONObject, "mc", this.f1995b);
            C0645q.m2449a(jSONObject, "mid", this.f1997d);
            C0645q.m2449a(jSONObject, "aid", this.f1996c);
            jSONObject.put("ts", this.f2000g);
            jSONObject.put("ver", this.f1999f);
        } catch (JSONException e) {
        }
        return jSONObject;
    }

    public void m2365a(int i) {
        this.f1998e = i;
    }

    public String m2366b() {
        return this.f1994a;
    }

    public String m2367c() {
        return this.f1995b;
    }

    public int m2368d() {
        return this.f1998e;
    }

    public String toString() {
        return m2364a().toString();
    }
}
