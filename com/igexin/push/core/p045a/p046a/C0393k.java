package com.igexin.push.core.p045a.p046a;

import android.content.Intent;
import android.content.pm.PackageManager;
import com.igexin.p022a.p023a.p030c.C0247a;
import com.igexin.push.config.C0377k;
import com.igexin.push.core.C0426b;
import com.igexin.push.core.C0483g;
import com.igexin.push.core.bean.BaseAction;
import com.igexin.push.core.bean.C0436j;
import com.igexin.push.core.bean.PushTaskBean;
import com.igexin.push.core.p045a.C0402e;
import com.igexin.push.p052f.C0512a;
import com.tencent.connect.common.Constants;
import com.tencent.open.SocialConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.igexin.push.core.a.a.k */
public class C0393k implements C0383a {
    private static final String f1046a;

    static {
        f1046a = C0377k.f1013a;
    }

    public C0426b m1294a(PushTaskBean pushTaskBean, BaseAction baseAction) {
        return C0426b.success;
    }

    public BaseAction m1295a(JSONObject jSONObject) {
        try {
            BaseAction c0436j = new C0436j();
            c0436j.setType("startapp");
            c0436j.setActionId(jSONObject.getString("actionid"));
            c0436j.setDoActionId(jSONObject.getString("do"));
            if (jSONObject.has("appstartupid")) {
                c0436j.m1529a(jSONObject.getJSONObject("appstartupid").getString("android"));
            }
            if (jSONObject.has("is_autostart")) {
                c0436j.m1535d(jSONObject.getString("is_autostart"));
            }
            if (jSONObject.has(SocialConstants.PARAM_APP_ID)) {
                c0436j.m1531b(jSONObject.getString(SocialConstants.PARAM_APP_ID));
            }
            if (!jSONObject.has("noinstall_action")) {
                return c0436j;
            }
            c0436j.m1533c(jSONObject.getString("noinstall_action"));
            return c0436j;
        } catch (JSONException e) {
            return null;
        }
    }

    public boolean m1296b(PushTaskBean pushTaskBean, BaseAction baseAction) {
        boolean z = false;
        if (!(pushTaskBean == null || baseAction == null)) {
            boolean z2;
            C0436j c0436j = (C0436j) baseAction;
            PackageManager packageManager = C0483g.f1321g.getPackageManager();
            String b = c0436j.m1530b();
            if (b.equals(Constants.STR_EMPTY)) {
                b = C0483g.f1315a;
                z2 = true;
            } else {
                z2 = C0483g.f1315a.equals(c0436j.m1530b());
            }
            C0247a.m838b("doStartApp|" + z2 + "|" + b);
            Intent launchIntentForPackage;
            if (z2) {
                try {
                    C0402e.m1330a().m1377b(pushTaskBean.getTaskId(), pushTaskBean.getMessageId(), b, null);
                    if (((C0436j) baseAction).m1534d().equals("true")) {
                        launchIntentForPackage = packageManager.getLaunchIntentForPackage(C0483g.f1319e);
                        if (launchIntentForPackage == null) {
                            return false;
                        }
                        C0483g.f1321g.startActivity(launchIntentForPackage);
                    }
                    if (c0436j.getDoActionId() != null) {
                        C0402e.m1330a().m1367a(pushTaskBean.getTaskId(), pushTaskBean.getMessageId(), c0436j.getDoActionId());
                    }
                } catch (Exception e) {
                }
            } else {
                C0402e.m1330a().m1377b(pushTaskBean.getTaskId(), pushTaskBean.getMessageId(), b, null);
                if (!c0436j.m1534d().equals("true")) {
                    z = true;
                } else if (C0512a.m1843a(c0436j.m1528a())) {
                    launchIntentForPackage = packageManager.getLaunchIntentForPackage(((C0436j) baseAction).m1528a());
                    if (launchIntentForPackage == null) {
                        return false;
                    }
                    C0483g.f1321g.startActivity(launchIntentForPackage);
                    z = true;
                }
                if (z) {
                    if (c0436j.getDoActionId() != null) {
                        C0402e.m1330a().m1367a(pushTaskBean.getTaskId(), pushTaskBean.getMessageId(), c0436j.getDoActionId());
                    }
                } else if (c0436j.m1532c() != null) {
                    C0402e.m1330a().m1367a(pushTaskBean.getTaskId(), pushTaskBean.getMessageId(), c0436j.m1532c());
                }
            }
        }
        return true;
    }
}
