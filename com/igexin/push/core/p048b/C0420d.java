package com.igexin.push.core.p048b;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import com.igexin.push.core.C0416a;
import com.igexin.push.core.C0482f;
import com.igexin.sdk.aidl.C0521a;
import com.tencent.tauth.AuthActivity;

/* renamed from: com.igexin.push.core.b.d */
class C0420d implements ServiceConnection {
    final /* synthetic */ C0419c f1092a;

    C0420d(C0419c c0419c) {
        this.f1092a = c0419c;
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C0418b.m1433a().m1434a(componentName.getPackageName()).m1430a(C0521a.m1881a(iBinder));
        Message message = new Message();
        Intent intent = new Intent();
        intent.putExtra("pkgname", componentName.getPackageName());
        String a = this.f1092a.m1438a(componentName.getPackageName());
        if (a == null) {
            intent.putExtra(AuthActivity.ACTION_KEY, "disconnected");
        } else if (C0421e.m1442a().m1453a(componentName.getPackageName(), a)) {
            intent.putExtra(AuthActivity.ACTION_KEY, "connected");
        } else {
            intent.putExtra(AuthActivity.ACTION_KEY, "disconnected");
        }
        message.what = C0416a.f1073d;
        message.obj = intent;
        C0482f.m1694a().m1700a(message);
    }

    public void onServiceDisconnected(ComponentName componentName) {
        C0418b.m1433a().m1434a(componentName.getPackageName()).m1430a(null);
    }
}
