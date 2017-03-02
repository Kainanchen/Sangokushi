package com.tencent.mm.sdk.diffdev.p065a;

import com.tencent.mm.sdk.diffdev.OAuthListener;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mm.sdk.diffdev.a.c */
final class C0603c implements Runnable {
    final /* synthetic */ C0602b ah;

    C0603c(C0602b c0602b) {
        this.ah = c0602b;
    }

    public final void run() {
        List<OAuthListener> arrayList = new ArrayList();
        arrayList.addAll(this.ah.ag.ad);
        for (OAuthListener onQrcodeScanned : arrayList) {
            onQrcodeScanned.onQrcodeScanned();
        }
    }
}
