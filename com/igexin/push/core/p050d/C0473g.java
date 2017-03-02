package com.igexin.push.core.p050d;

import com.igexin.p022a.p031b.C0259a;
import com.igexin.push.core.C0483g;
import com.igexin.push.core.p045a.C0402e;
import com.igexin.push.p035e.p049a.C0466b;
import com.igexin.sdk.PushBuildConfig;
import com.tencent.open.SocialConstants;
import com.tencent.tauth.AuthActivity;
import org.json.JSONObject;

/* renamed from: com.igexin.push.core.d.g */
public class C0473g extends C0466b {
    public C0473g(String str) {
        super(str);
        m1658a();
    }

    public void m1658a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(AuthActivity.ACTION_KEY, "sdkconfig");
            jSONObject.put("cid", C0483g.f1333s);
            jSONObject.put(SocialConstants.PARAM_APP_ID, C0483g.f1315a);
            jSONObject.put("sdk_version", PushBuildConfig.sdk_conf_version);
            m1638b(C0259a.m881b(jSONObject.toString().getBytes()));
        } catch (Exception e) {
        }
    }

    public void m1659a(byte[] bArr) {
        C0402e.m1330a().m1362a(bArr);
    }

    public int m1660b() {
        return 0;
    }
}
