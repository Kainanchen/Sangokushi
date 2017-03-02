package com.alipay.sdk.app;

import android.webkit.SslErrorHandler;
import com.alipay.sdk.widget.C0213d;

/* renamed from: com.alipay.sdk.app.c */
final class C0137c implements Runnable {
    final /* synthetic */ SslErrorHandler f213a;
    final /* synthetic */ C0136b f214b;

    C0137c(C0136b c0136b, SslErrorHandler sslErrorHandler) {
        this.f214b = c0136b;
        this.f213a = sslErrorHandler;
    }

    public final void run() {
        C0213d.m715a(this.f214b.f208b, "\u5b89\u5168\u8b66\u544a", "\u5b89\u5168\u8fde\u63a5\u8bc1\u4e66\u6821\u9a8c\u65e0\u6548\uff0c\u5c06\u65e0\u6cd5\u4fdd\u8bc1\u8bbf\u95ee\u6570\u636e\u7684\u5b89\u5168\u6027\uff0c\u53ef\u80fd\u5b58\u5728\u98ce\u9669\uff0c\u8bf7\u9009\u62e9\u662f\u5426\u7ee7\u7eed\uff1f", "\u7ee7\u7eed", new C0138d(this), "\u9000\u51fa", new C0139e(this));
    }
}
