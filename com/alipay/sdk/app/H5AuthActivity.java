package com.alipay.sdk.app;

public class H5AuthActivity extends H5PayActivity {
    public final void m362a() {
        Object obj = AuthTask.f190a;
        synchronized (obj) {
            try {
                obj.notify();
            } catch (Exception e) {
            }
        }
    }
}
