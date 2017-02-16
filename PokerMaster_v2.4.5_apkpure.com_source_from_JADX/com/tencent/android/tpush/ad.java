package com.tencent.android.tpush;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.android.tpush.p067a.ProGuard;
import net.sqlcipher.database.SQLiteDatabase;

/* compiled from: ProGuard */
class ad implements Runnable {
    Context f7312a;
    Intent f7313b;
    XGIOperateCallback f7314c;
    int f7315d;

    public ad(Context context, Intent intent, XGIOperateCallback xGIOperateCallback) {
        this.f7312a = null;
        this.f7313b = null;
        this.f7314c = null;
        this.f7315d = 0;
        this.f7312a = context;
        this.f7313b = intent;
        this.f7314c = xGIOperateCallback;
        this.f7315d = intent.getIntExtra("opType", 0);
    }

    public void run() {
        try {
            switch (this.f7315d) {
                case SQLiteDatabase.OPEN_READWRITE /*0*/:
                    XGPushManager.m4693c(this.f7312a, this.f7313b, this.f7314c);
                    break;
                case SQLiteDatabase.OPEN_READONLY /*1*/:
                    XGPushManager.m4695d(this.f7312a, this.f7313b, this.f7314c);
                    break;
                default:
                    ProGuard.m4723h(XGPushManager.f7261a, "TimeoutRunnable error optype:" + this.f7315d);
                    break;
            }
            for (BroadcastReceiver a : XGPushManager.f7264d.keySet()) {
                com.tencent.android.tpush.common.ProGuard.m4831a(this.f7312a, a);
            }
            XGPushManager.f7264d.clear();
        } catch (Throwable e) {
            ProGuard.m4716c(XGPushManager.f7261a, " RegisterTimeoutRunnable run error", e);
        }
    }
}
