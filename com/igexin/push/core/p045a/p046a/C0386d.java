package com.igexin.push.core.p045a.p046a;

import com.igexin.push.core.C0426b;
import com.igexin.push.core.bean.BaseAction;
import com.igexin.push.core.bean.PushTaskBean;
import com.igexin.push.core.p044c.C0444f;
import com.igexin.push.core.p045a.C0402e;
import com.tencent.connect.common.Constants;
import com.tencent.open.SocialConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.igexin.push.core.a.a.d */
public class C0386d implements C0383a {
    public C0426b m1270a(PushTaskBean pushTaskBean, BaseAction baseAction) {
        return C0426b.success;
    }

    public BaseAction m1271a(JSONObject jSONObject) {
        try {
            if (jSONObject.has("do") && jSONObject.has("actionid")) {
                BaseAction baseAction = new BaseAction();
                baseAction.setType(jSONObject.getString(SocialConstants.PARAM_TYPE));
                baseAction.setActionId(jSONObject.getString("actionid"));
                baseAction.setDoActionId(jSONObject.getString("do"));
                return baseAction;
            }
        } catch (JSONException e) {
        }
        return null;
    }

    public boolean m1272b(PushTaskBean pushTaskBean, BaseAction baseAction) {
        C0444f.m1577a().m1594a(false);
        if (!baseAction.getDoActionId().equals(Constants.STR_EMPTY)) {
            C0402e.m1330a().m1367a(pushTaskBean.getTaskId(), pushTaskBean.getMessageId(), baseAction.getDoActionId());
        }
        return true;
    }
}
