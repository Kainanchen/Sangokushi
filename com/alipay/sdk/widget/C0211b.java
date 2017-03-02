package com.alipay.sdk.widget;

import com.alipay.sdk.widget.C0210a.C0209a;

/* renamed from: com.alipay.sdk.widget.b */
final class C0211b implements Runnable {
    final /* synthetic */ C0210a f537a;

    C0211b(C0210a c0210a) {
        this.f537a = c0210a;
    }

    public final void run() {
        if (this.f537a.f534e == null) {
            this.f537a.f534e = new C0209a(this.f537a, this.f537a.f535f);
        }
        try {
            if (!this.f537a.f534e.isShowing()) {
                this.f537a.f534e.show();
            }
        } catch (Exception e) {
        }
    }
}
