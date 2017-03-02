package com.alipay.sdk.authjs;

import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.alipay.sdk.authjs.e */
final class C0164e extends TimerTask {
    final /* synthetic */ C0161a f333a;
    final /* synthetic */ C0162c f334b;

    C0164e(C0162c c0162c, C0161a c0161a) {
        this.f334b = c0162c;
        this.f333a = c0161a;
    }

    public final void run() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("toastCallBack", "true");
        } catch (JSONException e) {
        }
        C0161a c0161a = new C0161a(C0161a.f317c);
        c0161a.f323i = this.f333a.f323i;
        c0161a.f327m = jSONObject;
        this.f334b.f329a.m434a(c0161a);
    }
}
