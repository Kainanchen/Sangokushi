package com.igexin.push.core.p045a.p046a;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.text.TextUtils;
import com.igexin.getuiext.data.Consts;
import com.igexin.p022a.p023a.p030c.C0247a;
import com.igexin.push.config.C0377k;
import com.igexin.push.core.C0426b;
import com.igexin.push.core.C0483g;
import com.igexin.push.core.bean.BaseAction;
import com.igexin.push.core.bean.C0434h;
import com.igexin.push.core.bean.PushTaskBean;
import com.tencent.connect.common.Constants;
import com.tencent.open.SocialConstants;
import com.ut.device.AidConstants;
import com.zkunity.app.ResourceIDs;
import java.util.HashMap;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.igexin.push.core.a.a.h */
public class C0390h implements C0383a {
    public static HashMap f1042a;
    private static final String f1043b;

    static {
        f1043b = C0377k.f1013a;
        f1042a = new HashMap();
    }

    private PendingIntent m1282a(String str, String str2, String str3, int i) {
        Intent intent = new Intent("com.igexin.sdk.action.doaction");
        intent.putExtra("taskid", str);
        intent.putExtra("messageid", str2);
        intent.putExtra(SocialConstants.PARAM_APP_ID, C0483g.f1315a);
        intent.putExtra("actionid", str3);
        intent.putExtra("accesstoken", C0483g.au);
        intent.putExtra("notifID", i);
        return PendingIntent.getBroadcast(C0483g.f1321g, new Random().nextInt(AidConstants.EVENT_REQUEST_STARTED), intent, 134217728);
    }

    public C0426b m1283a(PushTaskBean pushTaskBean, BaseAction baseAction) {
        return C0426b.success;
    }

    public BaseAction m1284a(JSONObject jSONObject) {
        try {
            BaseAction c0434h = new C0434h();
            c0434h.setType("notification");
            c0434h.setActionId(jSONObject.getString("actionid"));
            c0434h.setDoActionId(jSONObject.getString("do"));
            String string = jSONObject.getString(SocialConstants.PARAM_TITLE);
            String string2 = jSONObject.getString(Consts.PROMOTION_TYPE_TEXT);
            c0434h.m1506a(string);
            c0434h.m1509b(string2);
            if (jSONObject.has("logo") && !Constants.STR_EMPTY.equals(jSONObject.getString("logo"))) {
                string = jSONObject.getString("logo");
                if (string.lastIndexOf(".png") == -1 && string.lastIndexOf(".jpeg") == -1) {
                    string = "null";
                } else {
                    int indexOf = string.indexOf(".png");
                    if (indexOf == -1) {
                        indexOf = string.indexOf(".jpeg");
                    }
                    if (indexOf != -1) {
                        string = string.substring(0, indexOf);
                    }
                }
                c0434h.m1511c(string);
            }
            if (jSONObject.has("is_noclear")) {
                c0434h.m1507a(jSONObject.getBoolean("is_noclear"));
            }
            if (jSONObject.has("is_novibrate")) {
                c0434h.m1510b(jSONObject.getBoolean("is_novibrate"));
            }
            if (jSONObject.has("is_noring")) {
                c0434h.m1512c(jSONObject.getBoolean("is_noring"));
            }
            if (jSONObject.has("is_chklayout")) {
                c0434h.m1515d(jSONObject.getBoolean("is_chklayout"));
            }
            if (jSONObject.has("logo_url")) {
                c0434h.m1514d(jSONObject.getString("logo_url"));
            }
            if (jSONObject.has("banner_url")) {
                c0434h.m1517e(jSONObject.getString("banner_url"));
            }
            return c0434h;
        } catch (JSONException e) {
            return null;
        }
    }

    public void m1285a(String str, String str2, C0434h c0434h) {
        int currentTimeMillis = (int) System.currentTimeMillis();
        C0483g.aj.put(str, Integer.valueOf(currentTimeMillis));
        PendingIntent a = m1282a(str, str2, c0434h.getDoActionId(), currentTimeMillis);
        NotificationManager notificationManager = (NotificationManager) C0483g.f1321g.getSystemService("notification");
        Notification notification = new Notification();
        notification.tickerText = c0434h.m1508b();
        notification.defaults = 4;
        notification.ledARGB = -16711936;
        notification.ledOnMS = AidConstants.EVENT_REQUEST_STARTED;
        notification.ledOffMS = 3000;
        notification.flags = 1;
        if (c0434h.m1513c()) {
            notification.flags |= 32;
        } else {
            notification.flags |= 16;
        }
        if (!c0434h.m1518e()) {
            notification.defaults |= 1;
        }
        if (!c0434h.m1516d()) {
            notification.defaults |= 2;
        }
        int identifier = C0483g.f1321g.getResources().getIdentifier("push", ResourceIDs.DRAWABLE_ID, C0483g.f1319e);
        if (c0434h.m1519f() == null) {
            if (identifier != 0) {
                notification.icon = identifier;
            } else {
                notification.icon = 17301651;
            }
        } else if ("null".equals(c0434h.m1519f())) {
            notification.icon = 17301651;
        } else if (c0434h.m1519f().startsWith("@")) {
            String f = c0434h.m1519f();
            if (f.substring(1, f.length()).endsWith("email")) {
                notification.icon = 17301647;
            } else {
                notification.icon = 17301651;
            }
        } else {
            identifier = C0483g.f1321g.getResources().getIdentifier(c0434h.m1519f(), ResourceIDs.DRAWABLE_ID, C0483g.f1319e);
            if (identifier != 0) {
                notification.icon = identifier;
            } else {
                notification.icon = 17301651;
            }
        }
        if ((c0434h.m1521h() == null && c0434h.m1520g() == null) || !c0434h.m1522i()) {
            notification.setLatestEventInfo(C0483g.f1321g, c0434h.m1505a(), c0434h.m1508b(), a);
            notificationManager.notify(currentTimeMillis, notification);
        }
    }

    public boolean m1286b(PushTaskBean pushTaskBean, BaseAction baseAction) {
        if (!(pushTaskBean == null || baseAction == null || !(baseAction instanceof C0434h))) {
            C0434h c0434h = (C0434h) baseAction;
            if (TextUtils.isEmpty(c0434h.m1505a()) || TextUtils.isEmpty(c0434h.m1508b())) {
                C0247a.m838b(f1043b + " title = " + c0434h.m1505a() + ", content = " + c0434h.m1508b() + ", is invalid, don't show");
            } else {
                m1285a(pushTaskBean.getTaskId(), pushTaskBean.getMessageId(), c0434h);
            }
        }
        return true;
    }
}
