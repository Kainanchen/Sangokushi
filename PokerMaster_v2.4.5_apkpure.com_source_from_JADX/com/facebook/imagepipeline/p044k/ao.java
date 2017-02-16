package com.facebook.imagepipeline.p044k;

import com.facebook.common.p011d.Preconditions;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;

/* compiled from: ThreadHandoffProducerQueue */
/* renamed from: com.facebook.imagepipeline.k.ao */
public final class ao {
    private boolean f2250a;
    private final Deque<Runnable> f2251b;
    private final Executor f2252c;

    public ao(Executor executor) {
        this.f2250a = false;
        this.f2252c = (Executor) Preconditions.m1030a((Object) executor);
        this.f2251b = new ArrayDeque();
    }

    public final synchronized void m2209a(Runnable runnable) {
        if (this.f2250a) {
            this.f2251b.add(runnable);
        } else {
            this.f2252c.execute(runnable);
        }
    }

    public final synchronized void m2210b(Runnable runnable) {
        this.f2251b.remove(runnable);
    }
}
