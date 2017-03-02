package com.igexin.getuiext.ui;

import android.content.Context;
import android.content.Intent;
import com.igexin.download.SdkDownLoader;
import com.igexin.getuiext.data.Consts;
import com.igexin.getuiext.data.p034a.C0288a;
import com.igexin.getuiext.data.p034a.C0291d;
import com.igexin.getuiext.data.p034a.C0292e;
import com.igexin.getuiext.p033b.C0287c;
import com.igexin.getuiext.service.C0295a;
import com.igexin.getuiext.ui.promotion.C0316f;
import com.tencent.tauth.AuthActivity;
import com.zkunity.app.ResourceIDs;

/* renamed from: com.igexin.getuiext.ui.b */
public class C0306b {
    public static int m1042a(Context context, C0291d c0291d, boolean z) {
        Context applicationContext = context.getApplicationContext();
        if (c0291d == null) {
            return -1;
        }
        SdkDownLoader instantiate = SdkDownLoader.getInstantiate(applicationContext);
        instantiate.setDownloadDir("/libs/tmp/");
        int newTask = instantiate.newTask(c0291d.f774g, c0291d.a, c0291d.f773f, z, Consts.DOWNLOAD_HANDLER_OWNER);
        C0287c d = C0287c.m994d();
        d.m996a(applicationContext);
        d.m998c().m989a(newTask, c0291d);
        C0306b.m1045a(applicationContext, c0291d);
        return newTask;
    }

    public static void m1043a(Context context, int i, C0288a c0288a) {
        Context applicationContext = context.getApplicationContext();
        Intent intent = new Intent("com.igexin.download.action.notify.click");
        intent.putExtra(AuthActivity.ACTION_KEY, "run");
        intent.putExtra(ResourceIDs.ID, i);
        intent.putExtra("verifyCode", Consts.verifyCode);
        applicationContext.sendBroadcast(intent);
        if (c0288a == null) {
            return;
        }
        if (c0288a instanceof C0292e) {
            C0295a.m1016a(applicationContext, c0288a, 9);
        } else if (c0288a instanceof C0316f) {
            C0295a.m1016a(applicationContext, c0288a, 7);
        }
    }

    public static void m1044a(Context context, int i, C0291d c0291d) {
        Context applicationContext = context.getApplicationContext();
        Intent intent = new Intent("com.igexin.download.action.notify.click");
        intent.putExtra(AuthActivity.ACTION_KEY, "pause");
        intent.putExtra(ResourceIDs.ID, i);
        intent.putExtra("verifyCode", Consts.verifyCode);
        applicationContext.sendBroadcast(intent);
        if (c0291d == null) {
            return;
        }
        if (c0291d instanceof C0292e) {
            C0295a.m1016a(applicationContext, (C0288a) c0291d, 8);
        } else if (c0291d instanceof C0316f) {
            C0295a.m1016a(applicationContext, (C0288a) c0291d, 6);
        }
    }

    private static void m1045a(Context context, C0291d c0291d) {
        new C0307c(c0291d, context).execute(new Void[0]);
    }

    public static void m1046a(Context context, String str) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage != null) {
            context.startActivity(launchIntentForPackage);
        }
    }

    public static void m1047a(Context context, String str, int i, C0288a c0288a) {
        Intent intent = new Intent("com.igexin.increment");
        intent.putExtra(AuthActivity.ACTION_KEY, "install");
        intent.putExtra("filepath", str);
        intent.putExtra("pkgname", c0288a.f765b);
        intent.putExtra("verifyCode", Consts.verifyCode);
        context.sendBroadcast(intent);
    }
}
