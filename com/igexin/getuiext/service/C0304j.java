package com.igexin.getuiext.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.igexin.getuiext.data.p034a.C0288a;
import com.igexin.getuiext.data.p034a.C0292e;
import com.igexin.getuiext.ui.promotion.C0316f;

/* renamed from: com.igexin.getuiext.service.j */
class C0304j extends BroadcastReceiver {
    final /* synthetic */ GetuiExtService f822a;

    C0304j(GetuiExtService getuiExtService) {
        this.f822a = getuiExtService;
    }

    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.PACKAGE_ADDED")) {
            String substring = intent.getDataString().substring(8);
            C0288a b = C0297c.m1021a().m1025b(substring);
            if (b != null) {
                if (b instanceof C0316f) {
                    C0295a.m1016a(context, b, 4);
                } else if (b instanceof C0292e) {
                    C0295a.m1016a(context, b, 5);
                }
                C0297c.m1021a().m1026c(substring);
            } else if (context.getPackageName().equals(substring)) {
                C0295a.m1016a(context, b, 5);
            }
        }
    }
}
