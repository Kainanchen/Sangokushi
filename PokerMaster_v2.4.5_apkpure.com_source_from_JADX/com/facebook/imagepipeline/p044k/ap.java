package com.facebook.imagepipeline.p044k;

import android.util.Pair;
import com.facebook.common.p011d.Preconditions;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: ThrottlingProducer */
/* renamed from: com.facebook.imagepipeline.k.ap */
public final class ap<T> implements ag<T> {
    @GuardedBy("this")
    int f2256a;
    @GuardedBy("this")
    final ConcurrentLinkedQueue<Pair<Consumer<T>, ah>> f2257b;
    final Executor f2258c;
    private final ag<T> f2259d;
    private final int f2260e;

    /* renamed from: com.facebook.imagepipeline.k.ap.a */
    private class ThrottlingProducer extends DelegatingConsumer<T, T> {
        final /* synthetic */ ap f2255a;

        /* renamed from: com.facebook.imagepipeline.k.ap.a.1 */
        class ThrottlingProducer implements Runnable {
            final /* synthetic */ Pair f2253a;
            final /* synthetic */ ThrottlingProducer f2254b;

            ThrottlingProducer(ThrottlingProducer throttlingProducer, Pair pair) {
                this.f2254b = throttlingProducer;
                this.f2253a = pair;
            }

            public final void run() {
                this.f2254b.f2255a.m2216b((Consumer) this.f2253a.first, (ah) this.f2253a.second);
            }
        }

        private ThrottlingProducer(ap apVar, Consumer<T> consumer) {
            this.f2255a = apVar;
            super(consumer);
        }

        private void m2211c() {
            synchronized (this.f2255a) {
                Pair pair = (Pair) this.f2255a.f2257b.poll();
                if (pair == null) {
                    ap apVar = this.f2255a;
                    apVar.f2256a--;
                }
            }
            if (pair != null) {
                this.f2255a.f2258c.execute(new ThrottlingProducer(this, pair));
            }
        }

        protected final void m2213a(T t, boolean z) {
            this.f2163e.m1982b(t, z);
            if (z) {
                m2211c();
            }
        }

        protected final void m2214a(Throwable th) {
            this.f2163e.m1983b(th);
            m2211c();
        }

        protected final void m2212a() {
            this.f2163e.m1980b();
            m2211c();
        }
    }

    public ap(int i, Executor executor, ag<T> agVar) {
        this.f2260e = i;
        this.f2258c = (Executor) Preconditions.m1030a((Object) executor);
        this.f2259d = (ag) Preconditions.m1030a((Object) agVar);
        this.f2257b = new ConcurrentLinkedQueue();
        this.f2256a = 0;
    }

    public final void m2215a(Consumer<T> consumer, ah ahVar) {
        Object obj;
        ahVar.m2173c().m2043a(ahVar.m2172b(), "ThrottlingProducer");
        synchronized (this) {
            if (this.f2256a >= this.f2260e) {
                this.f2257b.add(Pair.create(consumer, ahVar));
                obj = 1;
            } else {
                this.f2256a++;
                obj = null;
            }
        }
        if (obj == null) {
            m2216b(consumer, ahVar);
        }
    }

    final void m2216b(Consumer<T> consumer, ah ahVar) {
        ahVar.m2173c().m2046a(ahVar.m2172b(), "ThrottlingProducer", null);
        this.f2259d.m2094a(new ThrottlingProducer(consumer, (byte) 0), ahVar);
    }
}
