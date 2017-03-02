package com.tencent.wxop.stat.common;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.tencent.wxop.stat.common.e */
public class C0633e {
    ExecutorService f2025a;

    public C0633e() {
        this.f2025a = null;
        this.f2025a = Executors.newSingleThreadExecutor();
    }

    public void m2373a(Runnable runnable) {
        this.f2025a.execute(runnable);
    }
}
