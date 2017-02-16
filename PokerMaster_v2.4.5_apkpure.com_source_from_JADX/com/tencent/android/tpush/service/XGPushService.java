package com.tencent.android.tpush.service;

import android.app.Notification;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.IBinder;
import com.jg.EType;
import com.jg.JgClassChecked;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.tencent.android.tpush.XGPushConfig;
import com.tencent.android.tpush.service.p077d.ProGuard;

@JgClassChecked(author = 1, fComment = "\u786e\u8ba4\u5df2\u8fdb\u884c\u5b89\u5168\u6821\u9a8c", lastDate = "20150316", reviewer = 3, vComment = {EType.SERVICESCHECK})
/* compiled from: ProGuard */
public class XGPushService extends Service {
    private static Service f7502a;

    public IBinder onBind(Intent intent) {
        return null;
    }

    private void m4971b() {
        boolean z = true;
        if (ProGuard.m5319b(getApplicationContext(), "com.tencent.android.tpush.debug," + getApplicationContext().getPackageName(), 0) != 1) {
            z = false;
        }
        XGPushConfig.enableDebug = z;
        if (z) {
            com.tencent.android.tpush.p067a.ProGuard.m4699a(2);
        } else {
            com.tencent.android.tpush.p067a.ProGuard.m4699a(3);
        }
    }

    public void onCreate() {
        super.onCreate();
        f7502a = this;
        if (VERSION.SDK_INT < 18) {
            startForeground(-1998, new Notification());
        }
        Context applicationContext = getApplicationContext();
        com.tencent.android.tpush.service.p073c.ProGuard.m5102a(applicationContext);
        ProGuard.m5375c(applicationContext);
        m4971b();
        if (XGPushConfig.enableDebug) {
            com.tencent.android.tpush.p067a.ProGuard.m4703a("XGPushService", "onCreate() : " + getPackageName());
        }
        ProGuard.m5368a().m5384b();
    }

    public void onStart(Intent intent, int i) {
        super.onStart(intent, i);
    }

    static {
        f7502a = null;
    }

    public static Service m4970a() {
        return f7502a;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, 1, i2);
        if (com.tencent.android.tpush.common.ProGuard.m4826a(getApplicationContext()) > 0) {
            ProGuard.m5350q(getApplicationContext());
            return 2;
        }
        m4971b();
        ProGuard.m5315a(ProGuard.m5376e(), "tpush.wifi.bandon", LetterIndexBar.SEARCH_ICON_LETTER, true);
        ProGuard.m5368a().m5383a(intent);
        return 1;
    }

    public void onDestroy() {
        ProGuard.m5368a().m5385c();
        super.onDestroy();
    }
}
