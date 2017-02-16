package com.amap.api.location;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.amap.p003a.InstanceFactory;
import com.amap.p003a.ab;
import com.amap.p003a.bc;
import com.amap.p003a.bs;

public class APSService extends Service {
    APSServiceBase f783a;

    public IBinder onBind(Intent intent) {
        try {
            return this.f783a.onBind(intent);
        } catch (Throwable th) {
            bc.m330a(th, "APSService", "onBind");
            return null;
        }
    }

    public void onCreate() {
        onCreate(this);
    }

    public void onCreate(Context context) {
        try {
            if (bs.m447d(context)) {
                Context context2 = context;
                this.f783a = (APSServiceBase) InstanceFactory.m717a(context2, bc.m324a("loc", "3.0.0"), "com.amap.api.location.APSServiceWrapper", ab.class, new Class[]{Context.class}, new Object[]{context});
            } else if (this.f783a == null) {
                this.f783a = new ab(this);
            }
        } catch (Throwable th) {
        }
        try {
            if (this.f783a == null) {
                this.f783a = new ab(this);
            }
            this.f783a.onCreate();
        } catch (Throwable th2) {
            bc.m330a(th2, "APSService", "onCreate");
        }
        super.onCreate();
    }

    public void onDestroy() {
        try {
            this.f783a.onDestroy();
        } catch (Throwable th) {
            bc.m330a(th, "APSService", "onDestroy");
        }
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        try {
            return this.f783a.onStartCommand(intent, i, i2);
        } catch (Throwable th) {
            bc.m330a(th, "APSService", "onStartCommand");
            return super.onStartCommand(intent, i, i2);
        }
    }
}
