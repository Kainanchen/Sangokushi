package com.tencent.p080b.p081a.p083b;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.tencent.b.a.b.f */
public final class C1043f {
    ExecutorService f8056a;

    public C1043f() {
        this.f8056a = null;
        this.f8056a = Executors.newSingleThreadExecutor();
    }

    public final void m5674a(Runnable runnable) {
        this.f8056a.execute(runnable);
    }
}
