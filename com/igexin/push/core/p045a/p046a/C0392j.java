package com.igexin.push.core.p045a.p046a;

import android.content.Intent;
import android.net.Uri;
import com.alipay.sdk.sys.C0190a;
import com.igexin.p022a.p023a.p030c.C0247a;
import com.igexin.push.config.C0377k;
import com.igexin.push.core.C0426b;
import com.igexin.push.core.C0483g;
import com.igexin.push.core.bean.BaseAction;
import com.igexin.push.core.bean.C0437k;
import com.igexin.push.core.bean.PushTaskBean;
import com.igexin.push.core.p045a.C0402e;
import com.tencent.connect.common.Constants;
import com.tencent.open.SocialConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.igexin.push.core.a.a.j */
public class C0392j implements C0383a {
    private static final String f1045a;

    static {
        f1045a = C0377k.f1013a;
    }

    private void m1290a(C0437k c0437k, String str) {
        String a = c0437k.m1536a();
        if (a != null) {
            int indexOf = a.indexOf(str);
            if (indexOf != -1) {
                String str2 = Constants.STR_EMPTY;
                String str3 = null;
                int indexOf2 = a.indexOf(C0190a.f451b);
                if (indexOf2 == -1) {
                    str2 = a.substring(0, indexOf - 1);
                    a = a.substring(indexOf);
                    if (a.indexOf("=") != -1) {
                        str3 = a.substring(a.indexOf("=") + 1);
                    }
                } else if (a.charAt(indexOf - 1) == '?') {
                    str2 = a.substring(0, indexOf);
                    str2 = str2 + a.substring(indexOf2 + 1);
                    a = a.substring(indexOf, indexOf2);
                    if (a.indexOf("=") != -1) {
                        str3 = a.substring(a.indexOf("=") + 1);
                    }
                } else if (a.charAt(indexOf - 1) == '&') {
                    String substring = a.substring(0, indexOf - 1);
                    str2 = a.substring(indexOf);
                    str3 = Constants.STR_EMPTY;
                    int indexOf3 = str2.indexOf(C0190a.f451b);
                    if (indexOf3 != -1) {
                        str3 = str2.substring(indexOf3);
                        str2 = str2.substring(0, indexOf3);
                        str2 = str2.substring(str2.indexOf("=") + 1);
                    } else {
                        str2 = str2.substring(str2.indexOf("=") + 1);
                    }
                    String str4 = str2;
                    str2 = substring + str3;
                    str3 = str4;
                }
                c0437k.m1537a(str2);
                c0437k.m1540b(str3);
            }
        }
    }

    public C0426b m1291a(PushTaskBean pushTaskBean, BaseAction baseAction) {
        return C0426b.success;
    }

    public BaseAction m1292a(JSONObject jSONObject) {
        try {
            if (jSONObject.has(SocialConstants.PARAM_URL) && jSONObject.has("do") && jSONObject.has("actionid")) {
                String string = jSONObject.getString(SocialConstants.PARAM_URL);
                if (!string.equals(Constants.STR_EMPTY)) {
                    BaseAction c0437k = new C0437k();
                    c0437k.setType("startweb");
                    c0437k.setActionId(jSONObject.getString("actionid"));
                    c0437k.setDoActionId(jSONObject.getString("do"));
                    c0437k.m1537a(string);
                    if (jSONObject.has("is_withcid") && jSONObject.getString("is_withcid").equals("true")) {
                        c0437k.m1538a(true);
                    }
                    if (!jSONObject.has("is_withnettype") || !jSONObject.getString("is_withnettype").equals("true")) {
                        return c0437k;
                    }
                    c0437k.m1541b(true);
                    return c0437k;
                }
            }
        } catch (JSONException e) {
        }
        return null;
    }

    public boolean m1293b(PushTaskBean pushTaskBean, BaseAction baseAction) {
        C0437k c0437k = (C0437k) baseAction;
        m1290a(c0437k, "targetpkgname");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.setFlags(268435456);
        intent.setPackage(c0437k.m1539b());
        intent.setData(Uri.parse(c0437k.m1542c()));
        C0402e.m1330a().m1402v();
        if (C0483g.f1331q == 0) {
            try {
                C0247a.m838b("startweb isScreenOn sleep=5000");
                Thread.sleep(5000);
            } catch (Exception e) {
            }
        }
        try {
            C0483g.f1321g.startActivity(intent);
        } catch (Exception e2) {
        }
        if (!baseAction.getDoActionId().equals(Constants.STR_EMPTY)) {
            C0402e.m1330a().m1367a(pushTaskBean.getTaskId(), pushTaskBean.getMessageId(), baseAction.getDoActionId());
        }
        return true;
    }
}
