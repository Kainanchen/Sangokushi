package com.tencent.android.tpush;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.android.tpush.common.ProGuard;
import net.sqlcipher.database.SQLiteDatabase;

/* compiled from: ProGuard */
class ac extends BroadcastReceiver {
    Context f7308a;
    Intent f7309b;
    XGIOperateCallback f7310c;
    int f7311d;

    public ac(Context context, Intent intent, XGIOperateCallback xGIOperateCallback) {
        this.f7308a = null;
        this.f7309b = null;
        this.f7310c = null;
        this.f7311d = 0;
        this.f7308a = context;
        this.f7309b = intent;
        this.f7310c = xGIOperateCallback;
        this.f7311d = intent.getIntExtra("opType", 0);
    }

    public void onReceive(Context context, Intent intent) {
        try {
            ProGuard.m4795a().m4801b().removeCallbacks((ad) XGPushManager.f7264d.remove(this));
            switch (this.f7311d) {
                case SQLiteDatabase.OPEN_READWRITE /*0*/:
                    XGPushManager.m4693c(this.f7308a, this.f7309b, this.f7310c);
                    break;
                case SQLiteDatabase.OPEN_READONLY /*1*/:
                    XGPushManager.m4695d(this.f7308a, this.f7309b, this.f7310c);
                    break;
                default:
                    com.tencent.android.tpush.p067a.ProGuard.m4723h(XGPushManager.f7261a, "RegisterStartReceiver error optype:" + this.f7311d);
                    break;
            }
            ProGuard.m4831a(this.f7308a, (BroadcastReceiver) this);
        } catch (Throwable e) {
            com.tencent.android.tpush.p067a.ProGuard.m4716c(XGPushManager.f7261a, "RegisterStartReceiver error", e);
        }
    }
}
