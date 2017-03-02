package com.igexin.push.core.p050d;

import com.alipay.sdk.util.C0203j;
import com.igexin.p022a.p023a.p030c.C0247a;
import com.igexin.p022a.p031b.C0259a;
import com.igexin.push.core.C0483g;
import com.igexin.push.p035e.p049a.C0466b;
import com.tencent.open.SocialConstants;
import com.tencent.tauth.AuthActivity;
import org.json.JSONObject;

/* renamed from: com.igexin.push.core.d.b */
public class C0468b extends C0466b {
    public C0468b(String str, String str2) {
        super(str);
        m1644a(str2);
    }

    public void m1644a(String str) {
        if (str != null && C0483g.f1315a != null && C0483g.f1333s != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(AuthActivity.ACTION_KEY, "alias_bind");
                jSONObject.put("alias", str);
                jSONObject.put(SocialConstants.PARAM_APP_ID, C0483g.f1315a);
                jSONObject.put("cid", C0483g.f1333s);
                m1638b(C0259a.m881b(jSONObject.toString().getBytes()));
                C0247a.m838b("-> BindAliasHttpPlugin init jsonObject:" + jSONObject);
            } catch (Exception e) {
            }
        }
    }

    public void m1645a(byte[] bArr) {
        if (bArr != null) {
            C0247a.m838b("-> BindAlias result::" + new String(C0259a.m882c(bArr)));
            JSONObject jSONObject = new JSONObject();
            if (jSONObject.has(C0203j.f519c)) {
                if (!"ok".equals(jSONObject.getString(C0203j.f519c))) {
                }
            }
        }
    }

    public int m1646b() {
        return 0;
    }
}
