package com.igexin.push.core.p045a;

import com.igexin.push.config.C0367a;
import com.igexin.push.config.C0377k;
import com.igexin.push.config.C0378l;
import com.igexin.push.p037a.p038a.C0338c;
import com.tencent.tauth.AuthActivity;
import org.json.JSONObject;

/* renamed from: com.igexin.push.core.a.c */
public class C0399c extends C0398b {
    private static final String f1054a;

    static {
        f1054a = C0377k.f1013a;
    }

    public boolean m1321a(Object obj, JSONObject jSONObject) {
        try {
            if (jSONObject.has(AuthActivity.ACTION_KEY) && jSONObject.getString(AuthActivity.ACTION_KEY).equals("block_client") && jSONObject.has("duration")) {
                long j = jSONObject.getLong("duration") * 1000;
                long currentTimeMillis = System.currentTimeMillis();
                if (j != 0) {
                    C0378l.f1016c = j + currentTimeMillis;
                    C0367a.m1224a().m1238e();
                    C0338c.m1132c().m1136d();
                }
            }
        } catch (Exception e) {
        }
        return true;
    }
}
