package com.tencent.android.tpush;

import android.content.Context;
import android.content.Intent;
import com.sina.weibo.sdk.component.ShareRequestParam;
import com.sina.weibo.sdk.register.mobile.SelectCountryActivity;
import com.tencent.android.tpush.common.ProGuard;
import com.tencent.android.tpush.service.XGWatchdog;
import net.sqlcipher.database.SQLiteDatabase;

/* compiled from: ProGuard */
class ab implements Runnable {
    private Context f7303a;
    private Intent f7304b;
    private XGIOperateCallback f7305c;
    private int f7306d;
    private int f7307e;

    public ab(XGIOperateCallback xGIOperateCallback, Context context, Intent intent, int i, int i2) {
        this.f7307e = 0;
        this.f7305c = xGIOperateCallback;
        this.f7303a = context;
        this.f7304b = intent;
        this.f7306d = i;
        this.f7307e = i2;
    }

    public void run() {
        try {
            XGWatchdog.getInstance(this.f7303a).startWatchdog();
            this.f7304b.removeExtra("storage");
            if (this.f7306d != 1) {
                if (this.f7306d == 0) {
                    switch (this.f7304b.getIntExtra("operation", -1)) {
                        case XGPushManager.OPERATION_REQ_REGISTER /*100*/:
                            XGPushManager.m4693c(this.f7303a, this.f7304b, this.f7305c);
                            break;
                        case XGPushManager.OPERATION_REQ_UNREGISTER /*101*/:
                            XGPushManager.m4695d(this.f7303a, this.f7304b, this.f7305c);
                            break;
                        default:
                            break;
                    }
                }
            }
            String stringExtra = this.f7304b.getStringExtra(ShareRequestParam.RESP_UPLOAD_PIC_PARAM_DATA);
            switch (this.f7304b.getIntExtra("operation", -1)) {
                case SQLiteDatabase.OPEN_READWRITE /*0*/:
                    this.f7305c.onSuccess(stringExtra, this.f7304b.getIntExtra("flag", -1));
                    if (this.f7307e == 0) {
                        ProGuard.m4818b(this.f7303a, ".firstregister", 0);
                    }
                    if (ProGuard.m4823a(this.f7303a).m4825b() && com.tencent.android.tpush.p069c.ProGuard.m4782d(this.f7303a) && com.tencent.android.tpush.p069c.ProGuard.m4778b().equals("gcm")) {
                        com.tencent.android.tpush.p069c.ProGuard.m4785a(this.f7303a);
                        break;
                    }
                case SQLiteDatabase.OPEN_READONLY /*1*/:
                    this.f7305c.onFail(stringExtra, this.f7304b.getIntExtra(SelectCountryActivity.EXTRA_COUNTRY_CODE, -1), this.f7304b.getStringExtra(NotificationCompatApi24.CATEGORY_MESSAGE));
                    break;
            }
            XGWatchdog.getInstance(this.f7303a).sendAllLocalXGAppList();
            ProGuard.m4788a(this.f7303a);
            com.tencent.android.tpush.service.ProGuard.m5426a(this.f7303a).m5440a();
        } catch (Throwable th) {
            com.tencent.android.tpush.p067a.ProGuard.m4723h(XGPushManager.f7261a, th.toString());
        }
    }
}
