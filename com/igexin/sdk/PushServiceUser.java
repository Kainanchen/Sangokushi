package com.igexin.sdk;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.igexin.p022a.p023a.p030c.C0247a;
import com.igexin.sdk.aidl.C0524e;

public class PushServiceUser extends Service {
    private static String f1434a;
    private final C0524e f1435b;

    static {
        f1434a = "GeTuiService";
    }

    public PushServiceUser() {
        this.f1435b = new C0525b(this);
    }

    public IBinder onBind(Intent intent) {
        return this.f1435b;
    }

    public void onCreate() {
        super.onCreate();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onLowMemory() {
        C0247a.m838b(f1434a + " PushServiceUser Low Memory!");
        super.onLowMemory();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        return 1;
    }
}
