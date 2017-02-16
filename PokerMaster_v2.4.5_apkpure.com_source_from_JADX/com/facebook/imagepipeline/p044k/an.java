package com.facebook.imagepipeline.p044k;

import com.facebook.common.p011d.Preconditions;

/* compiled from: ThreadHandoffProducer */
/* renamed from: com.facebook.imagepipeline.k.an */
public final class an<T> implements ag<T> {
    final ag<T> f2248a;
    final ao f2249b;

    /* renamed from: com.facebook.imagepipeline.k.an.1 */
    class ThreadHandoffProducer extends am<T> {
        final /* synthetic */ aj f2241b;
        final /* synthetic */ String f2242c;
        final /* synthetic */ Consumer f2243d;
        final /* synthetic */ ah f2244e;
        final /* synthetic */ an f2245f;

        ThreadHandoffProducer(an anVar, Consumer consumer, aj ajVar, String str, String str2, aj ajVar2, String str3, Consumer consumer2, ah ahVar) {
            this.f2245f = anVar;
            this.f2241b = ajVar2;
            this.f2242c = str3;
            this.f2243d = consumer2;
            this.f2244e = ahVar;
            super(consumer, ajVar, str, str2);
        }

        protected final void m2204a(T t) {
            this.f2241b.m2046a(this.f2242c, "BackgroundThreadHandoffProducer", null);
            this.f2245f.f2248a.m2094a(this.f2243d, this.f2244e);
        }

        protected final void m2205b(T t) {
        }

        protected final T m2206c() {
            return null;
        }
    }

    /* renamed from: com.facebook.imagepipeline.k.an.2 */
    class ThreadHandoffProducer extends BaseProducerContextCallbacks {
        final /* synthetic */ am f2246a;
        final /* synthetic */ an f2247b;

        ThreadHandoffProducer(an anVar, am amVar) {
            this.f2247b = anVar;
            this.f2246a = amVar;
        }

        public final void m2207a() {
            this.f2246a.m1009a();
            this.f2247b.f2249b.m2210b(this.f2246a);
        }
    }

    public an(ag<T> agVar, ao aoVar) {
        this.f2248a = (ag) Preconditions.m1030a((Object) agVar);
        this.f2249b = aoVar;
    }

    public final void m2208a(Consumer<T> consumer, ah ahVar) {
        aj c = ahVar.m2173c();
        String b = ahVar.m2172b();
        Runnable threadHandoffProducer = new ThreadHandoffProducer(this, consumer, c, "BackgroundThreadHandoffProducer", b, c, b, consumer, ahVar);
        ahVar.m2171a(new ThreadHandoffProducer(this, threadHandoffProducer));
        this.f2249b.m2209a(threadHandoffProducer);
    }
}
