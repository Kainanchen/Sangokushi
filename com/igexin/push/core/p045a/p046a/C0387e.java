package com.igexin.push.core.p045a.p046a;

import com.igexin.push.core.C0426b;
import com.igexin.push.core.bean.BaseAction;
import com.igexin.push.core.bean.C0430d;
import com.igexin.push.core.bean.PushTaskBean;
import com.igexin.push.core.p044c.C0444f;
import com.tencent.open.SocialConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.igexin.push.core.a.a.e */
public class C0387e implements C0383a {
    public C0426b m1273a(PushTaskBean pushTaskBean, BaseAction baseAction) {
        return C0426b.success;
    }

    public BaseAction m1274a(JSONObject jSONObject) {
        try {
            if (jSONObject.has("do") && jSONObject.has("actionid") && jSONObject.has("duration")) {
                BaseAction c0430d = new C0430d();
                c0430d.setType(jSONObject.getString(SocialConstants.PARAM_TYPE));
                c0430d.setActionId(jSONObject.getString("actionid"));
                c0430d.setDoActionId(jSONObject.getString("do"));
                if (!jSONObject.has("duration")) {
                    return c0430d;
                }
                c0430d.m1480a(Long.valueOf(jSONObject.getString("duration")).longValue());
                return c0430d;
            }
        } catch (JSONException e) {
        }
        return null;
    }

    public boolean m1275b(PushTaskBean pushTaskBean, BaseAction baseAction) {
        long currentTimeMillis = System.currentTimeMillis() + (((C0430d) baseAction).m1479a() * 1000);
        C0444f.m1577a().m1594a(true);
        C0444f.m1577a().m1609h(currentTimeMillis);
        return true;
    }
}
