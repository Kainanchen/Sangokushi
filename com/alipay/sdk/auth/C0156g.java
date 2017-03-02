package com.alipay.sdk.auth;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: com.alipay.sdk.auth.g */
final class C0156g implements OnClickListener {
    final /* synthetic */ C0154e f300a;

    C0156g(C0154e c0154e) {
        this.f300a = c0154e;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f300a.f297a.cancel();
        this.f300a.f298b.f282a.f289g = false;
        C0157h.m439a(this.f300a.f298b.f282a, this.f300a.f298b.f282a.f286d + "?resultCode=150");
        this.f300a.f298b.f282a.finish();
    }
}
