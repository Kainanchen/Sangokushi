package com.igexin.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.igexin.p022a.p023a.p030c.C0247a;
import com.igexin.push.core.p045a.C0402e;
import com.igexin.sdk.p053a.C0519d;
import com.tencent.connect.common.Constants;
import com.tencent.tauth.AuthActivity;

public class PushReceiver extends BroadcastReceiver {
    private static String f1427a;

    static {
        f1427a = "PushSdk";
    }

    public void onReceive(Context context, Intent intent) {
        try {
            String e = C0402e.m1330a().m1384e("ss");
            if ((e == null || !e.equals(Constants.VIA_TO_TYPE_QQ_GROUP) || new C0519d(context).m1880c()) && intent != null) {
                String verifyCode;
                e = intent.getAction();
                if (PushConsts.ACTION_BROADCAST_PUSHMANAGER.equals(e)) {
                    Bundle extras = intent.getExtras();
                    if (extras == null) {
                        return;
                    }
                    if (extras.containsKey("verifyCode")) {
                        verifyCode = PushManager.getInstance().getVerifyCode();
                        if (verifyCode == null || verifyCode.equals(extras.getString("verifyCode"))) {
                            Intent intent2 = new Intent(context.getApplicationContext(), PushService.class);
                            intent2.putExtra(AuthActivity.ACTION_KEY, PushConsts.ACTION_BROADCAST_PUSHMANAGER);
                            intent2.putExtra("bundle", intent.getExtras());
                            context.getApplicationContext().startService(intent2);
                        } else {
                            C0247a.m838b(f1427a + " bundle verifyCode : " + extras.getString("verifyCode") + " != " + verifyCode);
                            return;
                        }
                    }
                    C0247a.m838b(f1427a + " bundle not contains verifyCode, ignore broadcast ####");
                    return;
                }
                if (PushConsts.ACTION_BROADCAST_REFRESHLS.equals(e)) {
                    String stringExtra = intent.getStringExtra("callback_pkgname");
                    verifyCode = intent.getStringExtra("callback_classname");
                    Intent intent3 = new Intent(context.getApplicationContext(), PushService.class);
                    intent3.putExtra(AuthActivity.ACTION_KEY, PushConsts.ACTION_BROADCAST_REFRESHLS);
                    intent3.putExtra("callback_pkgname", stringExtra);
                    intent3.putExtra("callback_classname", verifyCode);
                    context.getApplicationContext().startService(intent3);
                }
                if (PushConsts.ACTION_BROADCAST_TO_BOOT.equals(e)) {
                    context.startService(new Intent(context.getApplicationContext(), PushService.class));
                } else if (PushConsts.ACTION_BROADCAST_NETWORK_CHANGE.equals(e)) {
                    r0 = new Intent(context.getApplicationContext(), PushService.class);
                    r0.putExtra(AuthActivity.ACTION_KEY, PushConsts.ACTION_BROADCAST_NETWORK_CHANGE);
                    context.startService(r0);
                } else if (PushConsts.ACTION_BROADCAST_USER_PRESENT.equals(e)) {
                    r0 = new Intent(context.getApplicationContext(), PushService.class);
                    r0.putExtra(AuthActivity.ACTION_KEY, PushConsts.ACTION_BROADCAST_USER_PRESENT);
                    context.startService(r0);
                }
            }
        } catch (Exception e2) {
        }
    }
}
