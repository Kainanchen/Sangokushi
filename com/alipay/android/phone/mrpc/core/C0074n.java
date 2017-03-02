package com.alipay.android.phone.mrpc.core;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.alipay.android.phone.mrpc.core.n */
final class C0074n implements ThreadFactory {
    private final AtomicInteger f56a;

    C0074n() {
        this.f56a = new AtomicInteger(1);
    }

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, "com.alipay.mobile.common.transport.http.HttpManager.HttpWorker #" + this.f56a.getAndIncrement());
        thread.setPriority(4);
        return thread;
    }
}
