package com.igexin.push.core.p045a;

import com.alipay.sdk.util.C0203j;
import com.igexin.p022a.p023a.p030c.C0247a;
import com.tencent.open.SocialConstants;
import com.tencent.tauth.AuthActivity;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.igexin.push.core.a.r */
public class C0415r extends C0398b {
    public boolean m1427a(Object obj, JSONObject jSONObject) {
        try {
            if (jSONObject.has(AuthActivity.ACTION_KEY) && jSONObject.getString(AuthActivity.ACTION_KEY).equals("sendmessage_feedback")) {
                String string = jSONObject.getString(SocialConstants.PARAM_APP_ID);
                String string2 = jSONObject.getString("taskid");
                String string3 = jSONObject.getString("actionid");
                String string4 = jSONObject.getString(C0203j.f519c);
                long j = jSONObject.getLong("timestamp");
                C0247a.m838b("SendMessageFeedbackAction|appid:" + string + "|taskid:" + string2 + "|actionid:" + string3);
                C0402e.m1330a().m1358a(string, string2, string3, string4, j);
            }
        } catch (JSONException e) {
        }
        return true;
    }
}
