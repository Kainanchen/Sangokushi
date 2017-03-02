package com.alipay.sdk.util;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.alipay.android.app.IAlixPay.Stub;

/* renamed from: com.alipay.sdk.util.f */
final class C0199f implements ServiceConnection {
    final /* synthetic */ C0198e f507a;

    C0199f(C0198e c0198e) {
        this.f507a = c0198e;
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f507a.f501c = null;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f507a.f502d) {
            this.f507a.f501c = Stub.asInterface(iBinder);
            this.f507a.f502d.notify();
        }
    }
}
