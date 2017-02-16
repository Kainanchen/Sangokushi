package com.tencent.mm.sdk.diffdev.p089a;

import com.tencent.mm.sdk.diffdev.OAuthErrCode;
import com.tencent.mm.sdk.diffdev.OAuthListener;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mm.sdk.diffdev.a.b */
final class C1103b implements OAuthListener {
    final /* synthetic */ C1102a ag;

    C1103b(C1102a c1102a) {
        this.ag = c1102a;
    }

    public final void onAuthFinish(OAuthErrCode oAuthErrCode, String str) {
        String.format("onAuthFinish, errCode = %s, authCode = %s", new Object[]{oAuthErrCode.toString(), str});
        this.ag.ae = null;
        List<OAuthListener> arrayList = new ArrayList();
        arrayList.addAll(this.ag.ad);
        for (OAuthListener onAuthFinish : arrayList) {
            onAuthFinish.onAuthFinish(oAuthErrCode, str);
        }
    }

    public final void onAuthGotQrcode(String str, byte[] bArr) {
        List<OAuthListener> arrayList = new ArrayList();
        arrayList.addAll(this.ag.ad);
        for (OAuthListener onAuthGotQrcode : arrayList) {
            onAuthGotQrcode.onAuthGotQrcode(str, bArr);
        }
    }

    public final void onQrcodeScanned() {
        if (this.ag.ac != null) {
            this.ag.ac.post(new C1104c(this));
        }
    }
}
