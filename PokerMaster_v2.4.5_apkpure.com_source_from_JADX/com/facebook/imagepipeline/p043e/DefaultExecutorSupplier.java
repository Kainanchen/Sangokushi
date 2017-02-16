package com.facebook.imagepipeline.p043e;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.facebook.imagepipeline.e.a */
public final class DefaultExecutorSupplier implements ExecutorSupplier {
    private final Executor f1987a;
    private final Executor f1988b;
    private final Executor f1989c;
    private final Executor f1990d;

    public DefaultExecutorSupplier(int i) {
        ThreadFactory priorityThreadFactory = new PriorityThreadFactory();
        this.f1987a = Executors.newFixedThreadPool(2);
        this.f1988b = Executors.newFixedThreadPool(i, priorityThreadFactory);
        this.f1989c = Executors.newFixedThreadPool(i, priorityThreadFactory);
        this.f1990d = Executors.newFixedThreadPool(1, priorityThreadFactory);
    }

    public final Executor m1935a() {
        return this.f1987a;
    }

    public final Executor m1936b() {
        return this.f1987a;
    }

    public final Executor m1937c() {
        return this.f1988b;
    }

    public final Executor m1938d() {
        return this.f1989c;
    }

    public final Executor m1939e() {
        return this.f1990d;
    }
}
