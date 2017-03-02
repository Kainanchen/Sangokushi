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

public class PushManagerReceiver extends BroadcastReceiver {
    private static String f1426a;

    static {
        f1426a = "PushSdk";
    }

    public void onReceive(Context context, Intent intent) {
        String e = C0402e.m1330a().m1384e("ss");
        if ((e == null || !e.equals(Constants.VIA_TO_TYPE_QQ_GROUP) || new C0519d(context).m1880c()) && intent != null) {
            if (PushConsts.ACTION_BROADCAST_PUSHMANAGER.equals(intent.getAction())) {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    return;
                }
                if (extras.containsKey("verifyCode")) {
                    String verifyCode = PushManager.getInstance().getVerifyCode();
                    if (verifyCode == null || verifyCode.equals(extras.getString("verifyCode"))) {
                        try {
                            Intent intent2 = new Intent(context.getApplicationContext(), PushService.class);
                            intent2.putExtra(AuthActivity.ACTION_KEY, PushConsts.ACTION_BROADCAST_PUSHMANAGER);
                            intent2.putExtra("bundle", intent.getExtras());
                            context.getApplicationContext().startService(intent2);
                            return;
                        } catch (Exception e2) {
                            return;
                        }
                    }
                    C0247a.m838b(f1426a + " bundle verifyCode : " + extras.getString("verifyCode") + " != " + verifyCode);
                    return;
                }
                C0247a.m838b(f1426a + " bundle not contains verifyCode, ignore broadcast ####");
            }
        }
    }
}
