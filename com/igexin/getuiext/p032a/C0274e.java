package com.igexin.getuiext.p032a;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import com.igexin.getuiext.activity.GetuiExtActivity;
import com.igexin.getuiext.data.Consts;
import com.igexin.getuiext.util.C0334h;

/* renamed from: com.igexin.getuiext.a.e */
public class C0274e implements C0270a {
    public void m961a(Context context, Intent intent) {
        if (Consts.verifyCode == intent.getIntExtra("verifyCode", -1)) {
            int intExtra = intent.getIntExtra("notifID", 0);
            if (intExtra != 0) {
                ((NotificationManager) context.getSystemService("notification")).cancel(intExtra);
            }
            boolean b = C0334h.m1118b(context);
            Intent intent2 = new Intent(context, GetuiExtActivity.class);
            intent2.setFlags(268435456);
            intent2.putExtras(intent.getExtras());
            intent2.putExtra("isWifi", b);
            context.startActivity(intent2);
        }
    }
}
