package com.tencent.mm.sdk.diffdev.p089a;

import com.tencent.mm.sdk.diffdev.OAuthListener;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mm.sdk.diffdev.a.c */
final class C1104c implements Runnable {
    final /* synthetic */ C1103b ah;

    C1104c(C1103b c1103b) {
        this.ah = c1103b;
    }

    public final void run() {
        List<OAuthListener> arrayList = new ArrayList();
        arrayList.addAll(this.ah.ag.ad);
        for (OAuthListener onQrcodeScanned : arrayList) {
            onQrcodeScanned.onQrcodeScanned();
        }
    }
}
