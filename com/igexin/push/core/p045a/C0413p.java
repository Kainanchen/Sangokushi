package com.igexin.push.core.p045a;

import com.igexin.push.config.C0377k;
import com.igexin.push.core.p044c.C0444f;
import com.igexin.push.core.p048b.C0421e;
import com.igexin.push.core.p048b.C0424h;
import com.tencent.tauth.AuthActivity;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.igexin.push.core.a.p */
public class C0413p extends C0398b {
    private static final String f1068a;

    static {
        f1068a = C0377k.f1013a;
    }

    public boolean m1425a(Object obj, JSONObject jSONObject) {
        try {
            if (jSONObject.has(AuthActivity.ACTION_KEY) && jSONObject.getString(AuthActivity.ACTION_KEY).equals("response_ca_list")) {
                JSONArray jSONArray = jSONObject.getJSONArray("ca_list");
                Map hashMap = new HashMap();
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    C0424h c0424h = new C0424h();
                    c0424h.m1462a(jSONObject2.getString("pkgname"));
                    c0424h.m1467c(jSONObject2.getString("signature"));
                    c0424h.m1463a(C0421e.m1442a().m1456c(jSONObject2.getString("permissions")));
                    hashMap.put(c0424h.m1460a(), c0424h);
                }
                C0444f.m1577a().m1607f(System.currentTimeMillis());
                if (hashMap.size() > 0) {
                    C0421e.m1442a().m1452a(hashMap);
                }
            }
        } catch (JSONException e) {
        }
        return true;
    }
}
