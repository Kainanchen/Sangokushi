package com.tencent.p080b.p081a;

import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.b.a.b */
public final class C1057b {
    long f8102a;
    int f8103b;
    String f8104c;
    int f8105d;
    String f8106e;

    public C1057b() {
        this.f8102a = 0;
        this.f8103b = 0;
        this.f8104c = LetterIndexBar.SEARCH_ICON_LETTER;
        this.f8105d = 0;
        this.f8106e = LetterIndexBar.SEARCH_ICON_LETTER;
    }

    public final JSONObject m5746a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tm", this.f8102a);
            jSONObject.put("st", this.f8103b);
            if (this.f8104c != null) {
                jSONObject.put("dm", this.f8104c);
            }
            jSONObject.put("pt", this.f8105d);
            if (this.f8106e != null) {
                jSONObject.put("rip", this.f8106e);
            }
            jSONObject.put("ts", System.currentTimeMillis() / 1000);
        } catch (JSONException e) {
        }
        return jSONObject;
    }
}
