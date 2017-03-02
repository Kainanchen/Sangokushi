package com.igexin.push.core.p045a.p046a;

import com.igexin.push.core.C0426b;
import com.igexin.push.core.bean.BaseAction;
import com.igexin.push.core.bean.PushTaskBean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.igexin.push.core.a.a.f */
public class C0388f implements C0383a {
    public C0426b m1276a(PushTaskBean pushTaskBean, BaseAction baseAction) {
        return C0426b.success;
    }

    public BaseAction m1277a(JSONObject jSONObject) {
        try {
            BaseAction baseAction = new BaseAction();
            baseAction.setType("null");
            baseAction.setActionId(jSONObject.getString("actionid"));
            return baseAction;
        } catch (JSONException e) {
            return null;
        }
    }

    public boolean m1278b(PushTaskBean pushTaskBean, BaseAction baseAction) {
        return true;
    }
}
