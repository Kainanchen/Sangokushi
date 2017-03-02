package com.igexin.push.core.p045a;

import com.igexin.p022a.p023a.p025d.C0233d;
import com.igexin.push.config.C0377k;
import com.igexin.push.p040c.p043c.C0364n;
import com.tencent.tauth.AuthActivity;
import com.zkunity.app.ResourceIDs;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.igexin.push.core.a.g */
public class C0404g extends C0397a {
    private static final String f1060a;
    private static Map f1061b;

    static {
        f1060a = C0377k.f1013a;
    }

    public C0404g() {
        f1061b = new HashMap();
        f1061b.put("redirect_server", new C0411n());
        f1061b.put("response_deviceid", new C0414q());
        f1061b.put("pushmessage", new C0409l());
        f1061b.put("response_ca_list", new C0413p());
        f1061b.put("received", new C0410m());
        f1061b.put("sendmessage_feedback", new C0415r());
        f1061b.put("block_client", new C0399c());
    }

    public boolean m1408a(C0233d c0233d) {
        return false;
    }

    public boolean m1409a(Object obj) {
        if (obj instanceof C0364n) {
            C0364n c0364n = (C0364n) obj;
            if (c0364n.m1216a() && c0364n.f991e != null) {
                try {
                    JSONObject jSONObject = new JSONObject((String) c0364n.f991e);
                    if (jSONObject.has(AuthActivity.ACTION_KEY) && !jSONObject.getString(AuthActivity.ACTION_KEY).equals("received") && jSONObject.has(ResourceIDs.ID)) {
                        C0402e.m1330a().m1355a(jSONObject.getString(ResourceIDs.ID));
                    }
                    if (jSONObject != null && jSONObject.has(AuthActivity.ACTION_KEY)) {
                        C0398b c0398b = (C0398b) f1061b.get(jSONObject.getString(AuthActivity.ACTION_KEY));
                        if (c0398b != null) {
                            return c0398b.m1320a(obj, jSONObject);
                        }
                    }
                } catch (Exception e) {
                }
            }
        }
        return false;
    }
}
