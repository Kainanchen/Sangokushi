package com.igexin.getuiext.ui.promotion;

import android.graphics.Bitmap;
import android.view.animation.AnimationUtils;

/* renamed from: com.igexin.getuiext.ui.promotion.p */
class C0326p implements Runnable {
    final /* synthetic */ C0325o f890a;
    private Bitmap f891b;

    public C0326p(C0325o c0325o, Bitmap bitmap) {
        this.f890a = c0325o;
        this.f891b = bitmap;
    }

    public void run() {
        this.f890a.f889a.setImageBitmap(this.f891b);
        this.f890a.f889a.invalidate();
        this.f890a.f889a.startAnimation(AnimationUtils.loadAnimation(this.f890a.f889a.getContext(), 17432576));
    }
}
