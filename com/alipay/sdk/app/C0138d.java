package com.alipay.sdk.app;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.alipay.sdk.app.d */
final class C0138d implements OnClickListener {
    final /* synthetic */ C0137c f215a;

    C0138d(C0137c c0137c) {
        this.f215a = c0137c;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f215a.f214b.f209c = true;
        this.f215a.f213a.proceed();
        dialogInterface.dismiss();
    }
}
