package com.alipay.sdk.app;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.alipay.sdk.app.e */
final class C0139e implements OnClickListener {
    final /* synthetic */ C0137c f216a;

    C0139e(C0137c c0137c) {
        this.f216a = c0137c;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f216a.f213a.cancel();
        this.f216a.f214b.f209c = false;
        C0142h.f219a = C0142h.m385a();
        this.f216a.f214b.f208b.finish();
    }
}
