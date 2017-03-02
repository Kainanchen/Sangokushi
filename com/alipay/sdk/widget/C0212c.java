package com.alipay.sdk.widget;

/* renamed from: com.alipay.sdk.widget.c */
final class C0212c implements Runnable {
    final /* synthetic */ C0210a f538a;

    C0212c(C0210a c0210a) {
        this.f538a = c0210a;
    }

    public final void run() {
        if (this.f538a.f534e != null) {
            try {
                this.f538a.f534e.dismiss();
            } catch (Exception e) {
            }
        }
    }
}
