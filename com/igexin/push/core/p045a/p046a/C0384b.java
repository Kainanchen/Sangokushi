package com.igexin.push.core.p045a.p046a;

import android.content.pm.PackageInfo;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.igexin.push.core.C0426b;
import com.igexin.push.core.C0483g;
import com.igexin.push.core.bean.BaseAction;
import com.igexin.push.core.bean.C0428b;
import com.igexin.push.core.bean.PushTaskBean;
import com.igexin.push.core.p045a.C0402e;
import com.tencent.connect.common.Constants;
import com.tencent.open.SocialConstants;
import org.json.JSONObject;

/* renamed from: com.igexin.push.core.a.a.b */
public class C0384b implements C0383a {
    public C0426b m1262a(PushTaskBean pushTaskBean, BaseAction baseAction) {
        return C0426b.success;
    }

    public BaseAction m1263a(JSONObject jSONObject) {
        try {
            if (jSONObject.has(SocialConstants.PARAM_TYPE) && jSONObject.has("actionid")) {
                BaseAction c0428b = new C0428b();
                c0428b.setType("checkapp");
                c0428b.setActionId(jSONObject.getString("actionid"));
                if (jSONObject.has("appstartupid")) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("appstartupid");
                    if (jSONObject2.has("android")) {
                        c0428b.m1472a(jSONObject2.getString("android"));
                        if (jSONObject.has("do_installed") || jSONObject.has("do_uninstalled")) {
                            if (jSONObject.has("do_installed")) {
                                c0428b.m1474b(jSONObject.getString("do_installed"));
                            }
                            if (!jSONObject.has("do_uninstalled")) {
                                return c0428b;
                            }
                            c0428b.m1476c(jSONObject.getString("do_uninstalled"));
                            return c0428b;
                        }
                    }
                }
            }
        } catch (Exception e) {
        }
        return null;
    }

    public boolean m1264a(String str) {
        for (PackageInfo packageInfo : C0483g.f1321g.getPackageManager().getInstalledPackages(AccessibilityNodeInfoCompat.ACTION_SCROLL_FORWARD)) {
            if (packageInfo.packageName.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean m1265b(PushTaskBean pushTaskBean, BaseAction baseAction) {
        C0428b c0428b = (C0428b) baseAction;
        String taskId = pushTaskBean.getTaskId();
        String messageId = pushTaskBean.getMessageId();
        if (m1264a(c0428b.m1471a())) {
            if (!(c0428b.m1473b() == null || c0428b.m1473b().equals(Constants.STR_EMPTY))) {
                C0402e.m1330a().m1367a(taskId, messageId, c0428b.m1473b());
            }
        } else if (!(c0428b.m1475c() == null || c0428b.m1475c().equals(Constants.STR_EMPTY))) {
            C0402e.m1330a().m1367a(taskId, messageId, c0428b.m1475c());
        }
        return true;
    }
}
