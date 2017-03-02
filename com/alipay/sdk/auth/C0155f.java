package com.alipay.sdk.auth;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.alipay.sdk.auth.f */
final class C0155f implements OnClickListener {
    final /* synthetic */ C0154e f299a;

    C0155f(C0154e c0154e) {
        this.f299a = c0154e;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f299a.f298b.f282a.f289g = true;
        this.f299a.f297a.proceed();
        dialogInterface.dismiss();
    }
}
