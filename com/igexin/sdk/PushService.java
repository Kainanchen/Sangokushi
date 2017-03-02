package com.igexin.sdk;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Process;
import com.igexin.p022a.p023a.p030c.C0247a;
import com.igexin.push.config.C0379m;
import com.igexin.push.core.C0483g;
import com.igexin.sdk.p053a.C0516a;
import com.igexin.sdk.p053a.C0519d;
import com.tencent.connect.common.Constants;
import com.tencent.tauth.AuthActivity;
import java.util.concurrent.atomic.AtomicBoolean;

public class PushService extends Service {
    private static String f1428a;
    private IPushCore f1429b;
    private final AtomicBoolean f1430c;
    private boolean f1431d;
    private boolean f1432e;
    private ServiceConnection f1433f;

    static {
        f1428a = "PushSdk";
    }

    public PushService() {
        this.f1430c = new AtomicBoolean(false);
        this.f1433f = new C0520a(this);
    }

    private void m1865b() {
        C0247a.m838b(f1428a + "|startPushCore ++++");
        C0516a.m1869a().m1871a((Context) this);
        this.f1429b = C0516a.m1869a().m1872b();
        if (this.f1429b != null) {
            this.f1429b.start(this);
        }
    }

    private void m1867c() {
        try {
            C0247a.m838b(f1428a + " bind user process service");
            bindService(new Intent(this, PushServiceUser.class), this.f1433f, 1);
        } catch (Throwable th) {
            C0247a.m838b(f1428a + th.toString());
        }
    }

    private void m1868d() {
        try {
            C0247a.m838b(f1428a + " stop user process service by getui");
            this.f1431d = true;
            unbindService(this.f1433f);
        } catch (Throwable th) {
            C0247a.m838b(f1428a + th.toString());
        }
    }

    public IBinder onBind(Intent intent) {
        return this.f1429b != null ? this.f1429b.onServiceBind(intent) : null;
    }

    public void onCreate() {
        super.onCreate();
    }

    public void onDestroy() {
        if (this.f1429b != null) {
            this.f1429b.onServiceDestroy();
        }
        Process.killProcess(Process.myPid());
        super.onDestroy();
    }

    public void onLowMemory() {
        C0247a.m838b(f1428a + " PushService Low Memory!");
        super.onLowMemory();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (intent == null) {
            try {
                if (this.f1430c.getAndSet(true)) {
                    return 1;
                }
                m1867c();
                m1865b();
                return 1;
            } catch (Throwable th) {
                C0247a.m838b(th.toString());
                return 1;
            }
        }
        String stringExtra = intent.getStringExtra(AuthActivity.ACTION_KEY);
        if (stringExtra != null && stringExtra.equals("stopUserService") && this.f1432e) {
            m1868d();
            return 1;
        } else if (!this.f1430c.getAndSet(true)) {
            this.f1430c.set(true);
            m1867c();
            if (PushConsts.ACTION_SERVICE_INITIALIZE.equals(stringExtra)) {
                C0247a.m838b(f1428a + "|start from initialize...");
                m1865b();
                return this.f1429b != null ? this.f1429b.onServiceStartCommand(intent, i, i2) : 1;
            } else {
                C0379m.m1253a((Context) this);
                if (Constants.VIA_TO_TYPE_QQ_GROUP.equals(C0483g.m1728c().get("ss"))) {
                    if (new C0519d(this).m1880c()) {
                        C0247a.m838b(f1428a + "|is switch on == true, don't stopService");
                    } else {
                        C0247a.m838b(f1428a + "|is switch on == false, don't auto start");
                        m1868d();
                        stopSelf();
                        return 1;
                    }
                }
                m1865b();
                return this.f1429b != null ? this.f1429b.onServiceStartCommand(intent, i, i2) : 1;
            }
        } else if (this.f1429b == null) {
            return 1;
        } else {
            C0247a.m838b(f1428a + "|inInit = true, call onServiceStartCommand...");
            return this.f1429b.onServiceStartCommand(intent, i, i2);
        }
    }
}
