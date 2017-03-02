package com.alipay.sdk.auth;

/* renamed from: com.alipay.sdk.auth.c */
final class C0152c implements Runnable {
    final /* synthetic */ String f294a;
    final /* synthetic */ AuthActivity f295b;

    C0152c(AuthActivity authActivity, String str) {
        this.f295b = authActivity;
        this.f294a = str;
    }

    public final void run() {
        try {
            this.f295b.f285c.loadUrl("javascript:" + this.f294a);
        } catch (Exception e) {
        }
    }
}
