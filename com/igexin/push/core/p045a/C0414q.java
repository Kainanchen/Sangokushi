package com.igexin.push.core.p045a;

import com.igexin.p022a.p023a.p030c.C0247a;
import com.igexin.push.config.C0377k;
import com.igexin.push.core.C0482f;
import com.igexin.push.core.C0483g;
import com.igexin.push.core.p044c.C0444f;
import com.tencent.tauth.AuthActivity;
import org.json.JSONObject;

/* renamed from: com.igexin.push.core.a.q */
public class C0414q extends C0398b {
    private static final String f1069a;

    static {
        f1069a = C0377k.f1013a;
    }

    public boolean m1426a(Object obj, JSONObject jSONObject) {
        try {
            if (jSONObject.has(AuthActivity.ACTION_KEY) && jSONObject.getString(AuthActivity.ACTION_KEY).equals("response_deviceid")) {
                String string = jSONObject.getString("deviceid");
                C0247a.m838b(f1069a + " get devid resp, devid : " + string + ", save 2db and file");
                C0444f.m1577a().m1598b(string);
                if (C0483g.av != null) {
                    C0247a.m838b(f1069a + " deviceid arrived cancel addPhoneInfoTimerTask...");
                    C0483g.av.m753t();
                    C0483g.av = null;
                }
                if (C0483g.f1340z != null) {
                    C0482f.m1694a().m1714i().m1389i();
                }
                C0247a.m838b("deviceidRsp|" + C0483g.f1340z);
            }
        } catch (Exception e) {
        }
        return true;
    }
}
