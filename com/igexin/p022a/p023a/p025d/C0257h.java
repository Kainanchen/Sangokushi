package com.igexin.p022a.p023a.p025d;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.igexin.a.a.d.h */
final class C0257h implements ThreadFactory {
    final AtomicInteger f673a;
    final /* synthetic */ C0255f f674b;

    public C0257h(C0255f c0255f) {
        this.f674b = c0255f;
        this.f673a = new AtomicInteger(0);
    }

    public Thread newThread(Runnable runnable) {
        return new Thread(runnable, "TaskService-pool-" + this.f673a.incrementAndGet());
    }
}
