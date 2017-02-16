package com.facebook.common.p013b;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* renamed from: com.facebook.common.b.d */
public final class ScheduledFutureImpl<V> implements RunnableFuture<V>, ScheduledFuture<V> {
    private final Handler f1103a;
    private final FutureTask<V> f1104b;

    public ScheduledFutureImpl(Handler handler, Callable<V> callable) {
        this.f1103a = handler;
        this.f1104b = new FutureTask(callable);
    }

    public ScheduledFutureImpl(Handler handler, Runnable runnable, @Nullable V v) {
        this.f1103a = handler;
        this.f1104b = new FutureTask(runnable, v);
    }

    public final long getDelay(TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final void run() {
        this.f1104b.run();
    }

    public final boolean cancel(boolean z) {
        return this.f1104b.cancel(z);
    }

    public final boolean isCancelled() {
        return this.f1104b.isCancelled();
    }

    public final boolean isDone() {
        return this.f1104b.isDone();
    }

    public final V get() {
        return this.f1104b.get();
    }

    public final V get(long j, TimeUnit timeUnit) {
        return this.f1104b.get(j, timeUnit);
    }

    public final /* synthetic */ int compareTo(Object obj) {
        throw new UnsupportedOperationException();
    }
}
