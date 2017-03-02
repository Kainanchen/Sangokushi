package com.igexin.getuiext.service;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.igexin.getuiext.data.Consts;
import com.igexin.getuiext.data.p034a.C0288a;
import com.igexin.getuiext.data.p034a.C0292e;
import com.igexin.getuiext.p032a.C0270a;
import com.igexin.getuiext.p032a.C0271b;
import com.igexin.getuiext.ui.promotion.C0316f;
import com.tencent.tauth.AuthActivity;

/* renamed from: com.igexin.getuiext.service.h */
final class C0302h extends Handler {
    final /* synthetic */ GetuiExtService f820a;

    public C0302h(GetuiExtService getuiExtService, Looper looper) {
        this.f820a = getuiExtService;
        super(looper);
    }

    private void m1037a(int i, Intent intent) {
        switch (i) {
            case Consts.SERVICE_ONRECEIVE /*11001*/:
                m1038a(intent);
            case Consts.INSTALL_APP /*11003*/:
                String stringExtra = intent.getStringExtra("pkgName");
                if (stringExtra != null) {
                    C0288a b = C0297c.m1021a().m1025b(stringExtra);
                    if (b == null) {
                        return;
                    }
                    if (b instanceof C0316f) {
                        C0295a.m1016a(this.f820a.f797c, b, 5);
                    } else if (b instanceof C0292e) {
                        C0295a.m1016a(this.f820a.f797c, b, 6);
                    }
                }
            default:
        }
    }

    private void m1038a(Intent intent) {
        if (intent != null) {
            C0270a a = C0271b.m955a(intent.getStringExtra(AuthActivity.ACTION_KEY));
            if (a != null) {
                a.m954a(this.f820a.f797c, intent);
            }
        }
    }

    public void handleMessage(Message message) {
        Intent intent = (Intent) message.obj;
        if (intent != null) {
            int intExtra = intent.getIntExtra("what", -1);
            if (intExtra != -1) {
                m1037a(intExtra, intent);
            }
        }
    }
}
