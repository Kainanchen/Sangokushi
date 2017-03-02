package com.tencent.open.web.security;

import android.webkit.WebView;
import com.alipay.sdk.packet.C0182d;
import com.alipay.sdk.util.C0203j;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.open.web.security.c */
public class ProGuard extends com.tencent.open.ProGuard.ProGuard {
    private String f1756d;

    public ProGuard(WebView webView, long j, String str, String str2) {
        super(webView, j, str);
        this.f1756d = str2;
    }

    public void m2202a(Object obj) {
        com.tencent.open.p067a.ProGuard.m2114a("openSDK_LOG.SecureJsListener", "-->onComplete, result: " + obj);
    }

    public void m2201a() {
        com.tencent.open.p067a.ProGuard.m2117b("openSDK_LOG.SecureJsListener", "-->onNoMatchMethod...");
    }

    public void m2203a(String str) {
        com.tencent.open.p067a.ProGuard.m2114a("openSDK_LOG.SecureJsListener", "-->onCustomCallback, js: " + str);
        JSONObject jSONObject = new JSONObject();
        int i = 0;
        if (!com.tencent.open.p066c.ProGuard.f1694a) {
            i = -4;
        }
        try {
            jSONObject.put(C0203j.f519c, i);
            jSONObject.put("sn", this.b);
            jSONObject.put(C0182d.f429k, str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        m2200b(jSONObject.toString());
    }

    private void m2200b(String str) {
        WebView webView = (WebView) this.a.get();
        if (webView != null) {
            StringBuffer stringBuffer = new StringBuffer("javascript:");
            stringBuffer.append("if(!!").append(this.f1756d).append("){");
            stringBuffer.append(this.f1756d);
            stringBuffer.append("(");
            stringBuffer.append(str);
            stringBuffer.append(")}");
            String stringBuffer2 = stringBuffer.toString();
            com.tencent.open.p067a.ProGuard.m2114a("openSDK_LOG.SecureJsListener", "-->callback, callback: " + stringBuffer2);
            webView.loadUrl(stringBuffer2);
        }
    }
}
