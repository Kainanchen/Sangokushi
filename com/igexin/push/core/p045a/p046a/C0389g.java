package com.igexin.push.core.p045a.p046a;

import com.igexin.push.core.C0426b;
import com.igexin.push.core.bean.BaseAction;
import com.igexin.push.core.bean.C0433g;
import com.igexin.push.core.bean.PushTaskBean;
import com.igexin.push.core.p045a.C0402e;
import com.tencent.connect.common.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.igexin.push.core.a.a.g */
public class C0389g implements C0383a {
    public C0426b m1279a(PushTaskBean pushTaskBean, BaseAction baseAction) {
        return C0426b.success;
    }

    public BaseAction m1280a(JSONObject jSONObject) {
        try {
            BaseAction c0433g = new C0433g();
            c0433g.setType("goto");
            c0433g.setActionId(jSONObject.getString("actionid"));
            c0433g.setDoActionId(jSONObject.getString("do"));
            return c0433g;
        } catch (JSONException e) {
            return null;
        }
    }

    public boolean m1281b(PushTaskBean pushTaskBean, BaseAction baseAction) {
        if (!(pushTaskBean == null || baseAction == null || baseAction.getDoActionId() == null || baseAction.getDoActionId().equals(Constants.STR_EMPTY))) {
            C0402e.m1330a().m1367a(pushTaskBean.getTaskId(), pushTaskBean.getMessageId(), baseAction.getDoActionId());
        }
        return true;
    }
}
