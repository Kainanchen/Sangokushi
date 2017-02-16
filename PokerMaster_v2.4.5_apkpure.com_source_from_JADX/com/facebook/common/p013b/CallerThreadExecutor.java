package com.facebook.common.p013b;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facebook.common.b.a */
public final class CallerThreadExecutor extends AbstractExecutorService {
    private static final CallerThreadExecutor f1101a;

    static {
        f1101a = new CallerThreadExecutor();
    }

    public static CallerThreadExecutor m1005a() {
        return f1101a;
    }

    private CallerThreadExecutor() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }

    public final boolean isShutdown() {
        return false;
    }

    public final void shutdown() {
    }

    public final List<Runnable> shutdownNow() {
        shutdown();
        return Collections.emptyList();
    }

    public final boolean isTerminated() {
        return false;
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return true;
    }
}
