package com.igexin.push.core.p050d;

import com.alipay.sdk.util.C0203j;
import com.igexin.p022a.p023a.p030c.C0247a;
import com.igexin.p022a.p031b.C0259a;
import com.igexin.push.core.C0483g;
import com.igexin.push.p035e.p049a.C0466b;
import com.tencent.open.SocialConstants;
import com.tencent.tauth.AuthActivity;
import org.json.JSONObject;

/* renamed from: com.igexin.push.core.d.i */
public class C0475i extends C0466b {
    public C0475i(String str, String str2, boolean z) {
        super(str);
        m1662a(str2, z);
    }

    private void m1662a(String str, boolean z) {
        if (str != null && C0483g.f1315a != null && C0483g.f1333s != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(AuthActivity.ACTION_KEY, "alias_unbind");
                jSONObject.put("alias", str);
                jSONObject.put(SocialConstants.PARAM_APP_ID, C0483g.f1315a);
                if (z) {
                    jSONObject.put("cid", C0483g.f1333s);
                }
                m1638b(C0259a.m881b(jSONObject.toString().getBytes()));
                C0247a.m838b("-> UnbindAliasHttpPlugin init jsonObject:" + jSONObject);
            } catch (Exception e) {
            }
        }
    }

    public void m1663a(byte[] bArr) {
        if (bArr != null) {
            C0247a.m838b("-> UnbindAliasHttpPlugin result:" + new String(C0259a.m882c(bArr)));
            JSONObject jSONObject = new JSONObject();
            if (jSONObject.has(C0203j.f519c)) {
                if (!"ok".equals(jSONObject.getString(C0203j.f519c))) {
                }
            }
        }
    }

    public int m1664b() {
        return 0;
    }
}
