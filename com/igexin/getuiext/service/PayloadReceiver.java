package com.igexin.getuiext.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.igexin.getuiext.data.Consts;
import com.igexin.getuiext.util.C0334h;
import com.igexin.sdk.PushConsts;
import com.tencent.connect.common.Constants;
import com.tencent.open.SocialConstants;
import com.tencent.tauth.AuthActivity;
import com.tencent.tauth.Tencent;
import org.json.JSONException;
import org.json.JSONObject;

public class PayloadReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        String a = C0334h.m1114a(context);
        if (a != null) {
            Bundle extras = intent.getExtras();
            if (("com.igexin.sdk.action." + a).equals(action)) {
                if (extras.getInt(AuthActivity.ACTION_KEY) == PushConsts.GET_CLIENTID) {
                    action = extras.getString("clientid");
                    if (action != null) {
                        Intent intent2 = new Intent(context, GetuiExtService.class);
                        intent2.putExtra(AuthActivity.ACTION_KEY, "bindApp");
                        intent2.putExtra("cid", action);
                        intent2.putExtra("what", Consts.SERVICE_ONRECEIVE);
                        context.startService(intent2);
                    }
                }
            } else if (extras.getInt(AuthActivity.ACTION_KEY) == Tencent.REQUEST_LOGIN) {
                if (context.getPackageName().equals(extras.getString("packagename")) && extras.getString(SocialConstants.PARAM_APP_ID).equals(Consts.INC_APPID)) {
                    if (System.currentTimeMillis() - new C0334h().m1122b() >= Consts.TIME_24HOUR) {
                        byte[] byteArray = extras.getByteArray("payload");
                        a = extras.getString("taskid");
                        if (byteArray != null && !Constants.STR_EMPTY.equals(a)) {
                            try {
                                JSONObject jSONObject = new JSONObject(new String(byteArray));
                                String string = jSONObject.getString(AuthActivity.ACTION_KEY);
                                String string2 = jSONObject.getString("pkgname");
                                String string3 = jSONObject.getString("versionCode");
                                String string4 = jSONObject.getString("sendId");
                                String string5 = jSONObject.getString("context");
                                boolean z = false;
                                if (jSONObject.has("cleanInstall")) {
                                    z = jSONObject.getBoolean("cleanInstall");
                                }
                                if (string != null && string2 != null && string3 != null) {
                                    Intent intent3 = new Intent(context, GetuiExtService.class);
                                    intent3.putExtra(AuthActivity.ACTION_KEY, string);
                                    intent3.putExtra("pkgName", string2);
                                    intent3.putExtra("versionCode", string3);
                                    intent3.putExtra("taskid", a);
                                    intent3.putExtra("sendId", string4);
                                    intent3.putExtra("context", string5);
                                    intent3.putExtra("what", Consts.SERVICE_ONRECEIVE);
                                    intent3.putExtra("cleanInstall", z);
                                    context.startService(intent3);
                                }
                            } catch (JSONException e) {
                            }
                        }
                    }
                }
            }
        }
    }
}
