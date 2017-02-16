package com.facebook.common.p013b;

import android.os.Handler;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* renamed from: com.facebook.common.b.c */
public class HandlerExecutorServiceImpl extends AbstractExecutorService implements C0273b {
    final Handler f1102a;

    protected /* synthetic */ RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return m1006a(runnable, obj);
    }

    protected /* synthetic */ RunnableFuture newTaskFor(Callable callable) {
        return m1007a(callable);
    }

    public /* synthetic */ Future submit(Runnable runnable, @Nullable Object obj) {
        return m1008b(runnable, obj);
    }

    public HandlerExecutorServiceImpl(Handler handler) {
        this.f1102a = handler;
    }

    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException();
    }

    public boolean isShutdown() {
        return false;
    }

    public boolean isTerminated() {
        return false;
    }

    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public void execute(Runnable runnable) {
        this.f1102a.post(runnable);
    }

    private <T> ScheduledFutureImpl<T> m1006a(Runnable runnable, T t) {
        return new ScheduledFutureImpl(this.f1102a, runnable, t);
    }

    private <T> ScheduledFutureImpl<T> m1007a(Callable<T> callable) {
        return new ScheduledFutureImpl(this.f1102a, callable);
    }

    private <T> ScheduledFuture<T> m1008b(Runnable runnable, @Nullable T t) {
        if (runnable == null) {
            throw new NullPointerException();
        }
        Object a = m1006a(runnable, t);
        execute(a);
        return a;
    }

    public ScheduledFuture<?> schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        Object a = m1006a(runnable, null);
        this.f1102a.postDelayed(a, timeUnit.toMillis(j));
        return a;
    }

    public <V> ScheduledFuture<V> schedule(Callable<V> callable, long j, TimeUnit timeUnit) {
        Object a = m1007a(callable);
        this.f1102a.postDelayed(a, timeUnit.toMillis(j));
        return a;
    }

    public ScheduledFuture<?> scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public ScheduledFuture<?> scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ Future submit(Callable callable) {
        if (callable == null) {
            throw new NullPointerException();
        }
        Object a = m1007a(callable);
        execute(a);
        return a;
    }

    public /* synthetic */ Future submit(Runnable runnable) {
        return m1008b(runnable, null);
    }
}
