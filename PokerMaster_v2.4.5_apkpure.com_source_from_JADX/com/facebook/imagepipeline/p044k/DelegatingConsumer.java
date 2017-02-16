package com.facebook.imagepipeline.p044k;

/* renamed from: com.facebook.imagepipeline.k.m */
public abstract class DelegatingConsumer<I, O> extends BaseConsumer<I> {
    final Consumer<O> f2163e;

    public DelegatingConsumer(Consumer<O> consumer) {
        this.f2163e = consumer;
    }

    protected void m2092a(Throwable th) {
        this.f2163e.m1983b(th);
    }

    protected void m2090a() {
        this.f2163e.m1980b();
    }

    protected void m2091a(float f) {
        this.f2163e.m1981b(f);
    }
}
