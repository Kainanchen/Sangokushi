package com.alipay.sdk.util;

import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import com.alipay.android.app.IRemoteServiceCallback.Stub;

/* renamed from: com.alipay.sdk.util.g */
final class C0200g extends Stub {
    final /* synthetic */ C0198e f508a;

    C0200g(C0198e c0198e) {
        this.f508a = c0198e;
    }

    public final boolean isHideLoadingScreen() throws RemoteException {
        return false;
    }

    public final void payEnd(boolean z, String str) throws RemoteException {
    }

    public final void startActivity(String str, String str2, int i, Bundle bundle) throws RemoteException {
        Intent intent = new Intent("android.intent.action.MAIN", null);
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            bundle.putInt("CallingPid", i);
            intent.putExtras(bundle);
        } catch (Exception e) {
        }
        intent.setClassName(str, str2);
        if (this.f508a.f500a != null) {
            this.f508a.f500a.startActivity(intent);
        }
    }
}
