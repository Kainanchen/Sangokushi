package com.facebook.imagepipeline.p044k;

import android.graphics.Bitmap;
import com.facebook.common.p011d.ImmutableMap;
import com.facebook.common.p011d.Preconditions;
import com.facebook.common.p017h.CloseableReference;
import com.facebook.imagepipeline.p040b.PlatformBitmapFactory;
import com.facebook.imagepipeline.p047h.CloseableImage;
import com.facebook.imagepipeline.p047h.CloseableStaticBitmap;
import com.facebook.imagepipeline.p050l.Postprocessor;
import com.facebook.imagepipeline.p050l.RepeatedPostprocessor;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: PostprocessorProducer */
/* renamed from: com.facebook.imagepipeline.k.af */
public final class af implements ag<CloseableReference<CloseableImage>> {
    final Executor f2215a;
    private final ag<CloseableReference<CloseableImage>> f2216b;
    private final PlatformBitmapFactory f2217c;

    /* renamed from: com.facebook.imagepipeline.k.af.a */
    private class PostprocessorProducer extends DelegatingConsumer<CloseableReference<CloseableImage>, CloseableReference<CloseableImage>> {
        final aj f2200a;
        final String f2201b;
        final Postprocessor f2202c;
        @GuardedBy("PostprocessorConsumer.this")
        @Nullable
        CloseableReference<CloseableImage> f2203d;
        @GuardedBy("PostprocessorConsumer.this")
        boolean f2204f;
        @GuardedBy("PostprocessorConsumer.this")
        boolean f2205g;
        @GuardedBy("PostprocessorConsumer.this")
        boolean f2206h;
        final /* synthetic */ af f2207i;
        @GuardedBy("PostprocessorConsumer.this")
        private boolean f2208j;

        /* renamed from: com.facebook.imagepipeline.k.af.a.1 */
        class PostprocessorProducer extends BaseProducerContextCallbacks {
            final /* synthetic */ af f2197a;
            final /* synthetic */ PostprocessorProducer f2198b;

            PostprocessorProducer(PostprocessorProducer postprocessorProducer, af afVar) {
                this.f2198b = postprocessorProducer;
                this.f2197a = afVar;
            }

            public final void m2150a() {
                this.f2198b.m2162e();
            }
        }

        /* renamed from: com.facebook.imagepipeline.k.af.a.2 */
        class PostprocessorProducer implements Runnable {
            final /* synthetic */ PostprocessorProducer f2199a;

            PostprocessorProducer(PostprocessorProducer postprocessorProducer) {
                this.f2199a = postprocessorProducer;
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                r10 = this;
                r1 = 0;
                r2 = r10.f2199a;
                monitor-enter(r2);
                r0 = r10.f2199a;	 Catch:{ all -> 0x0047 }
                r3 = r0.f2203d;	 Catch:{ all -> 0x0047 }
                r0 = r10.f2199a;	 Catch:{ all -> 0x0047 }
                r4 = r0.f2204f;	 Catch:{ all -> 0x0047 }
                r0 = r10.f2199a;	 Catch:{ all -> 0x0047 }
                r5 = 0;
                r0.f2203d = r5;	 Catch:{ all -> 0x0047 }
                r0 = r10.f2199a;	 Catch:{ all -> 0x0047 }
                r5 = 0;
                r0.f2205g = r5;	 Catch:{ all -> 0x0047 }
                monitor-exit(r2);	 Catch:{ all -> 0x0047 }
                r0 = com.facebook.common.p017h.CloseableReference.m1095a(r3);
                if (r0 == 0) goto L_0x0036;
            L_0x001d:
                r2 = r10.f2199a;	 Catch:{ all -> 0x0077 }
                r0 = com.facebook.common.p017h.CloseableReference.m1095a(r3);	 Catch:{ all -> 0x0077 }
                com.facebook.common.p011d.Preconditions.m1033a(r0);	 Catch:{ all -> 0x0077 }
                r0 = r3.m1099a();	 Catch:{ all -> 0x0077 }
                r0 = (com.facebook.imagepipeline.p047h.CloseableImage) r0;	 Catch:{ all -> 0x0077 }
                r0 = r0 instanceof com.facebook.imagepipeline.p047h.CloseableStaticBitmap;	 Catch:{ all -> 0x0077 }
                if (r0 != 0) goto L_0x004a;
            L_0x0030:
                r2.m2156a(r3, r4);	 Catch:{ all -> 0x0077 }
            L_0x0033:
                com.facebook.common.p017h.CloseableReference.m1097c(r3);
            L_0x0036:
                r1 = r10.f2199a;
                monitor-enter(r1);
                r0 = 0;
                r1.f2206h = r0;	 Catch:{ all -> 0x009d }
                r0 = r1.m2161d();	 Catch:{ all -> 0x009d }
                monitor-exit(r1);	 Catch:{ all -> 0x009d }
                if (r0 == 0) goto L_0x0046;
            L_0x0043:
                r1.m2159c();
            L_0x0046:
                return;
            L_0x0047:
                r0 = move-exception;
                monitor-exit(r2);	 Catch:{ all -> 0x0047 }
                throw r0;
            L_0x004a:
                r0 = r2.f2200a;	 Catch:{ all -> 0x0077 }
                r5 = r2.f2201b;	 Catch:{ all -> 0x0077 }
                r6 = "PostprocessorProducer";
                r0.m2043a(r5, r6);	 Catch:{ all -> 0x0077 }
                r0 = r3.m1099a();	 Catch:{ Exception -> 0x007c }
                r0 = (com.facebook.imagepipeline.p047h.CloseableImage) r0;	 Catch:{ Exception -> 0x007c }
                r1 = r2.m2154a(r0);	 Catch:{ Exception -> 0x007c }
                r0 = r2.f2200a;	 Catch:{ all -> 0x0098 }
                r5 = r2.f2201b;	 Catch:{ all -> 0x0098 }
                r6 = "PostprocessorProducer";
                r7 = r2.f2200a;	 Catch:{ all -> 0x0098 }
                r8 = r2.f2201b;	 Catch:{ all -> 0x0098 }
                r9 = r2.f2202c;	 Catch:{ all -> 0x0098 }
                r7 = com.facebook.imagepipeline.p044k.af.PostprocessorProducer.m2151a(r7, r8, r9);	 Catch:{ all -> 0x0098 }
                r0.m2046a(r5, r6, r7);	 Catch:{ all -> 0x0098 }
                r2.m2156a(r1, r4);	 Catch:{ all -> 0x0098 }
                com.facebook.common.p017h.CloseableReference.m1097c(r1);	 Catch:{ all -> 0x0077 }
                goto L_0x0033;
            L_0x0077:
                r0 = move-exception;
                com.facebook.common.p017h.CloseableReference.m1097c(r3);
                throw r0;
            L_0x007c:
                r0 = move-exception;
                r4 = r2.f2200a;	 Catch:{ all -> 0x0098 }
                r5 = r2.f2201b;	 Catch:{ all -> 0x0098 }
                r6 = "PostprocessorProducer";
                r7 = r2.f2200a;	 Catch:{ all -> 0x0098 }
                r8 = r2.f2201b;	 Catch:{ all -> 0x0098 }
                r9 = r2.f2202c;	 Catch:{ all -> 0x0098 }
                r7 = com.facebook.imagepipeline.p044k.af.PostprocessorProducer.m2151a(r7, r8, r9);	 Catch:{ all -> 0x0098 }
                r4.m2045a(r5, r6, r0, r7);	 Catch:{ all -> 0x0098 }
                r2.m2160c(r0);	 Catch:{ all -> 0x0098 }
                r0 = 0;
                com.facebook.common.p017h.CloseableReference.m1097c(r0);	 Catch:{ all -> 0x0077 }
                goto L_0x0033;
            L_0x0098:
                r0 = move-exception;
                com.facebook.common.p017h.CloseableReference.m1097c(r1);	 Catch:{ all -> 0x0077 }
                throw r0;	 Catch:{ all -> 0x0077 }
            L_0x009d:
                r0 = move-exception;
                monitor-exit(r1);	 Catch:{ all -> 0x009d }
                throw r0;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.k.af.a.2.run():void");
            }
        }

        protected final /* synthetic */ void m2157a(Object obj, boolean z) {
            CloseableReference closeableReference = (CloseableReference) obj;
            if (CloseableReference.m1095a(closeableReference)) {
                synchronized (this) {
                    if (this.f2208j) {
                        return;
                    }
                    CloseableReference closeableReference2 = this.f2203d;
                    this.f2203d = CloseableReference.m1096b(closeableReference);
                    this.f2204f = z;
                    this.f2205g = true;
                    boolean d = m2161d();
                    CloseableReference.m1097c(closeableReference2);
                    if (d) {
                        m2159c();
                    }
                }
            } else if (z) {
                m2156a(null, true);
            }
        }

        public PostprocessorProducer(af afVar, Consumer<CloseableReference<CloseableImage>> consumer, aj ajVar, String str, Postprocessor postprocessor, ah ahVar) {
            this.f2207i = afVar;
            super(consumer);
            this.f2203d = null;
            this.f2204f = false;
            this.f2205g = false;
            this.f2206h = false;
            this.f2200a = ajVar;
            this.f2201b = str;
            this.f2202c = postprocessor;
            ahVar.m2171a(new PostprocessorProducer(this, afVar));
        }

        protected final void m2158a(Throwable th) {
            m2160c(th);
        }

        protected final void m2155a() {
            m2162e();
        }

        final void m2159c() {
            this.f2207i.f2215a.execute(new PostprocessorProducer(this));
        }

        final synchronized boolean m2161d() {
            boolean z = true;
            synchronized (this) {
                if (this.f2208j || !this.f2205g || this.f2206h || !CloseableReference.m1095a(this.f2203d)) {
                    z = false;
                } else {
                    this.f2206h = true;
                }
            }
            return z;
        }

        static Map<String, String> m2151a(aj ajVar, String str, Postprocessor postprocessor) {
            if (ajVar.m2048b(str)) {
                return ImmutableMap.m1023a("Postprocessor", postprocessor.m2333b());
            }
            return null;
        }

        final CloseableReference<CloseableImage> m2154a(CloseableImage closeableImage) {
            CloseableStaticBitmap closeableStaticBitmap = (CloseableStaticBitmap) closeableImage;
            Bitmap bitmap = closeableStaticBitmap.f2138a;
            CloseableReference a = this.f2202c.m2332a();
            try {
                CloseableReference<CloseableImage> a2 = CloseableReference.m1093a(new CloseableStaticBitmap(a, closeableImage.m2019d(), closeableStaticBitmap.f2139b));
                return a2;
            } finally {
                CloseableReference.m1097c(a);
            }
        }

        final void m2156a(CloseableReference<CloseableImage> closeableReference, boolean z) {
            if ((!z && !m2152f()) || (z && m2153g())) {
                this.f2163e.m1982b(closeableReference, z);
            }
        }

        final void m2160c(Throwable th) {
            if (m2153g()) {
                this.f2163e.m1983b(th);
            }
        }

        final void m2162e() {
            if (m2153g()) {
                this.f2163e.m1980b();
            }
        }

        private synchronized boolean m2152f() {
            return this.f2208j;
        }

        private boolean m2153g() {
            boolean z = true;
            synchronized (this) {
                if (this.f2208j) {
                    z = false;
                } else {
                    CloseableReference closeableReference = this.f2203d;
                    this.f2203d = null;
                    this.f2208j = true;
                    CloseableReference.m1097c(closeableReference);
                }
            }
            return z;
        }
    }

    /* renamed from: com.facebook.imagepipeline.k.af.b */
    class PostprocessorProducer extends DelegatingConsumer<CloseableReference<CloseableImage>, CloseableReference<CloseableImage>> {
        final /* synthetic */ af f2211a;
        @GuardedBy("RepeatedPostprocessorConsumer.this")
        private boolean f2212b;
        @GuardedBy("RepeatedPostprocessorConsumer.this")
        @Nullable
        private CloseableReference<CloseableImage> f2213c;

        /* renamed from: com.facebook.imagepipeline.k.af.b.1 */
        class PostprocessorProducer extends BaseProducerContextCallbacks {
            final /* synthetic */ af f2209a;
            final /* synthetic */ PostprocessorProducer f2210b;

            PostprocessorProducer(PostprocessorProducer postprocessorProducer, af afVar) {
                this.f2210b = postprocessorProducer;
                this.f2209a = afVar;
            }

            public final void m2163a() {
                if (this.f2210b.m2167c()) {
                    this.f2210b.f2163e.m1980b();
                }
            }
        }

        protected final /* synthetic */ void m2165a(Object obj, boolean z) {
            CloseableReference closeableReference = (CloseableReference) obj;
            if (z) {
                synchronized (this) {
                    if (this.f2212b) {
                    } else {
                        CloseableReference closeableReference2 = this.f2213c;
                        this.f2213c = CloseableReference.m1096b(closeableReference);
                        CloseableReference.m1097c(closeableReference2);
                    }
                }
                synchronized (this) {
                    if (this.f2212b) {
                        return;
                    }
                    CloseableReference b = CloseableReference.m1096b(this.f2213c);
                    try {
                        this.f2163e.m1982b(b, false);
                    } finally {
                        CloseableReference.m1097c(b);
                    }
                }
            }
        }

        private PostprocessorProducer(af afVar, PostprocessorProducer postprocessorProducer, ah ahVar) {
            this.f2211a = afVar;
            super(postprocessorProducer);
            this.f2212b = false;
            this.f2213c = null;
            ahVar.m2171a(new PostprocessorProducer(this, afVar));
        }

        protected final void m2166a(Throwable th) {
            if (m2167c()) {
                this.f2163e.m1983b(th);
            }
        }

        protected final void m2164a() {
            if (m2167c()) {
                this.f2163e.m1980b();
            }
        }

        final boolean m2167c() {
            boolean z = true;
            synchronized (this) {
                if (this.f2212b) {
                    z = false;
                } else {
                    CloseableReference closeableReference = this.f2213c;
                    this.f2213c = null;
                    this.f2212b = true;
                    CloseableReference.m1097c(closeableReference);
                }
            }
            return z;
        }
    }

    /* renamed from: com.facebook.imagepipeline.k.af.c */
    class PostprocessorProducer extends DelegatingConsumer<CloseableReference<CloseableImage>, CloseableReference<CloseableImage>> {
        final /* synthetic */ af f2214a;

        protected final /* synthetic */ void m2168a(Object obj, boolean z) {
            CloseableReference closeableReference = (CloseableReference) obj;
            if (z) {
                this.f2163e.m1982b(closeableReference, z);
            }
        }

        private PostprocessorProducer(af afVar, PostprocessorProducer postprocessorProducer) {
            this.f2214a = afVar;
            super(postprocessorProducer);
        }
    }

    public af(ag<CloseableReference<CloseableImage>> agVar, PlatformBitmapFactory platformBitmapFactory, Executor executor) {
        this.f2216b = (ag) Preconditions.m1030a((Object) agVar);
        this.f2217c = platformBitmapFactory;
        this.f2215a = (Executor) Preconditions.m1030a((Object) executor);
    }

    public final void m2169a(Consumer<CloseableReference<CloseableImage>> consumer, ah ahVar) {
        Consumer postprocessorProducer;
        aj c = ahVar.m2173c();
        Postprocessor postprocessor = ahVar.m2170a().f2410k;
        PostprocessorProducer postprocessorProducer2 = new PostprocessorProducer(this, consumer, c, ahVar.m2172b(), postprocessor, ahVar);
        if (postprocessor instanceof RepeatedPostprocessor) {
            postprocessorProducer = new PostprocessorProducer(postprocessorProducer2, ahVar, (byte) 0);
        } else {
            Object postprocessorProducer3 = new PostprocessorProducer(postprocessorProducer2, (byte) 0);
        }
        this.f2216b.m2094a(postprocessorProducer, ahVar);
    }
}
