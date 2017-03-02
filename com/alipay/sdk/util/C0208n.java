package com.alipay.sdk.util;

import android.app.Activity;

/* renamed from: com.alipay.sdk.util.n */
final class C0208n implements Runnable {
    final /* synthetic */ Activity f528a;

    C0208n(Activity activity) {
        this.f528a = activity;
    }

    public final void run() {
        this.f528a.finish();
    }
}
