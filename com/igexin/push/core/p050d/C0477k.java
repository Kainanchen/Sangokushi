package com.igexin.push.core.p050d;

import com.igexin.p022a.p023a.p027b.C0246g;
import com.igexin.p022a.p031b.C0259a;
import com.igexin.push.core.C0483g;
import com.igexin.push.p035e.p049a.C0466b;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.tencent.tauth.AuthActivity;
import org.json.JSONObject;

/* renamed from: com.igexin.push.core.d.k */
public class C0477k extends C0466b {
    public C0477k(String str, byte[] bArr, int i) {
        super(str);
        m1668a(bArr, i);
    }

    private void m1668a(byte[] bArr, int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(AuthActivity.ACTION_KEY, "upload_BI");
            jSONObject.put("BIType", String.valueOf(i));
            jSONObject.put("cid", C0483g.f1333s);
            jSONObject.put("BIData", new String(C0246g.m835e(bArr, 0), AsyncHttpResponseHandler.DEFAULT_CHARSET));
            m1638b(C0259a.m881b(jSONObject.toString().getBytes()));
        } catch (Exception e) {
        }
    }

    public void m1669a(byte[] bArr) {
        String str = new String(bArr);
    }

    public int m1670b() {
        return 0;
    }
}
