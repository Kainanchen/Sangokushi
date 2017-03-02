package com.igexin.push.core.p048b;

import android.content.ServiceConnection;
import com.igexin.sdk.aidl.ICACallback;

/* renamed from: com.igexin.push.core.b.a */
public class C0417a {
    private String f1086a;
    private ServiceConnection f1087b;
    private ICACallback f1088c;

    public ServiceConnection m1428a() {
        return this.f1087b;
    }

    public void m1429a(ServiceConnection serviceConnection) {
        this.f1087b = serviceConnection;
    }

    public void m1430a(ICACallback iCACallback) {
        this.f1088c = iCACallback;
    }

    public void m1431a(String str) {
        this.f1086a = str;
    }

    public ICACallback m1432b() {
        return this.f1088c;
    }
}
