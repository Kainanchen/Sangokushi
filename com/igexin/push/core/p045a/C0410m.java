package com.igexin.push.core.p045a;

import com.igexin.push.config.C0377k;
import com.igexin.push.core.p044c.C0441c;
import com.tencent.tauth.AuthActivity;
import com.zkunity.app.ResourceIDs;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.igexin.push.core.a.m */
public class C0410m extends C0398b {
    private static final String f1065a;

    static {
        f1065a = C0377k.f1013a;
    }

    public boolean m1419a(Object obj, JSONObject jSONObject) {
        try {
            if (jSONObject.has(AuthActivity.ACTION_KEY) && jSONObject.getString(AuthActivity.ACTION_KEY).equals("received")) {
                try {
                    if (C0441c.m1566a().m1571a(Long.parseLong(jSONObject.getString(ResourceIDs.ID)))) {
                        C0402e.m1330a().m1387g();
                    }
                } catch (NumberFormatException e) {
                }
            }
        } catch (JSONException e2) {
        }
        return true;
    }
}
