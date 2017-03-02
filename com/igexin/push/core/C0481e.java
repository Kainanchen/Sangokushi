package com.igexin.push.core;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.igexin.p022a.p023a.p030c.C0247a;
import com.igexin.push.config.C0377k;
import com.igexin.push.config.C0378l;
import com.igexin.push.core.bean.C0432f;
import com.igexin.push.core.p045a.C0402e;
import com.igexin.push.core.p048b.C0419c;
import com.igexin.push.p052f.C0512a;
import com.igexin.sdk.PushConsts;
import com.tencent.connect.common.Constants;
import com.tencent.tauth.AuthActivity;

/* renamed from: com.igexin.push.core.e */
public class C0481e extends Handler {
    private static String f1275a;

    static {
        f1275a = C0377k.f1013a;
    }

    public void handleMessage(Message message) {
        Bundle bundleExtra;
        if (message.what == C0416a.f1072c) {
            Intent intent = (Intent) message.obj;
            if (intent != null && intent.hasExtra(AuthActivity.ACTION_KEY)) {
                String stringExtra = intent.getStringExtra(AuthActivity.ACTION_KEY);
                if (stringExtra.equals(PushConsts.ACTION_SERVICE_INITIALIZE)) {
                    C0402e.m1330a().m1350a(intent);
                } else if (stringExtra.equals(PushConsts.ACTION_SERVICE_INITIALIZE_SLAVE)) {
                    C0402e.m1330a().m1373b(intent);
                } else if (stringExtra.equals(PushConsts.ACTION_BROADCAST_REFRESHLS)) {
                    if (C0378l.f1027n) {
                        C0419c.m1436a().m1440b(intent);
                    }
                } else if (stringExtra.equals(PushConsts.ACTION_BROADCAST_PUSHMANAGER)) {
                    bundleExtra = intent.getBundleExtra("bundle");
                    C0247a.m838b(f1275a + " receive broadcast com.igexin.sdk.action.pushmanager");
                    C0402e.m1330a().m1351a(bundleExtra);
                } else if (stringExtra.equals(PushConsts.ACTION_BROADCAST_USER_PRESENT)) {
                    C0483g.f1298J = System.currentTimeMillis();
                    Object obj = 1;
                    if (C0402e.m1330a().m1363a(System.currentTimeMillis())) {
                        if (Constants.VIA_TO_TYPE_QQ_GROUP.equals(C0402e.m1330a().m1384e("ccs"))) {
                            obj = null;
                        }
                    }
                    if (obj != null) {
                        C0402e.m1330a().m1405y();
                    }
                } else if (stringExtra.equals("com.igexin.sdk.action.extdownloadsuccess")) {
                    C0402e.m1330a().m1382d(intent);
                }
            }
        } else if (message.what == C0416a.f1073d) {
            C0419c.m1436a().m1439a((Intent) message.obj);
        } else if (message.what == C0416a.f1074e) {
            C0402e.m1330a().m1379c((Intent) message.obj);
        } else if (message.what == C0416a.f1075f) {
            C0402e.m1330a().m1379c((Intent) message.obj);
        } else if (message.what == C0416a.f1076g) {
        } else {
            if (message.what == C0416a.f1077h) {
                bundleExtra = (Bundle) message.obj;
                C0402e.m1330a().m1376b(bundleExtra.getString("taskid"), bundleExtra.getString("messageid"), bundleExtra.getString("actionid"));
            } else if (message.what == C0416a.f1078i) {
                C0512a.m1840a((C0432f) message.obj);
            } else if (message.what == C0416a.f1079j) {
                C0402e.m1330a().m1400t();
            }
        }
    }
}
