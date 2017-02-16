package com.facebook.imagepipeline.p044k;

import com.android.volley.DefaultRetryPolicy;
import com.facebook.common.p011d.ImmutableMap;
import com.facebook.common.p017h.CloseableReference;
import com.facebook.imagepipeline.p041c.CacheKeyFactory;
import com.facebook.imagepipeline.p041c.MemoryCache;
import com.facebook.imagepipeline.p047h.CloseableImage;
import com.facebook.imagepipeline.p047h.QualityInfo;
import com.facebook.imagepipeline.p050l.ImageRequest.ImageRequest;
import com.facebook.p007c.p008a.CacheKey;
import java.util.Map;

/* renamed from: com.facebook.imagepipeline.k.h */
public class BitmapMemoryCacheProducer implements ag<CloseableReference<CloseableImage>> {
    final MemoryCache<CacheKey, CloseableImage> f2275a;
    private final CacheKeyFactory f2276b;
    private final ag<CloseableReference<CloseableImage>> f2277c;

    /* renamed from: com.facebook.imagepipeline.k.h.1 */
    class BitmapMemoryCacheProducer extends DelegatingConsumer<CloseableReference<CloseableImage>, CloseableReference<CloseableImage>> {
        final /* synthetic */ CacheKey f2279a;
        final /* synthetic */ BitmapMemoryCacheProducer f2280b;

        BitmapMemoryCacheProducer(BitmapMemoryCacheProducer bitmapMemoryCacheProducer, Consumer consumer, CacheKey cacheKey) {
            this.f2280b = bitmapMemoryCacheProducer;
            this.f2279a = cacheKey;
            super(consumer);
        }

        public final /* synthetic */ void m2239a(Object obj, boolean z) {
            obj = (CloseableReference) obj;
            if (obj != null) {
                CloseableReference a;
                obj.m1099a();
                if (!z) {
                    a = this.f2280b.f2275a.m1891a(this.f2279a);
                    if (a != null) {
                        try {
                            QualityInfo d = ((CloseableImage) obj.m1099a()).m2019d();
                            QualityInfo d2 = ((CloseableImage) a.m1099a()).m2019d();
                            if (d2.m2038c() || d2.m2036a() >= d.m2036a()) {
                                this.f2163e.m1982b(a, false);
                                return;
                            }
                            CloseableReference.m1097c(a);
                        } finally {
                            CloseableReference.m1097c(a);
                        }
                    }
                }
                a = this.f2280b.f2275a.m1892a(this.f2279a, obj);
                if (z) {
                    try {
                        this.f2163e.m1981b((float) DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
                    } catch (Throwable th) {
                        CloseableReference.m1097c(a);
                    }
                }
                Consumer consumer = this.f2163e;
                if (a != null) {
                    obj = a;
                }
                consumer.m1982b(obj, z);
                CloseableReference.m1097c(a);
            } else if (z) {
                this.f2163e.m1982b(null, true);
            }
        }
    }

    public BitmapMemoryCacheProducer(MemoryCache<CacheKey, CloseableImage> memoryCache, CacheKeyFactory cacheKeyFactory, ag<CloseableReference<CloseableImage>> agVar) {
        this.f2275a = memoryCache;
        this.f2276b = cacheKeyFactory;
        this.f2277c = agVar;
    }

    public final void m2234a(Consumer<CloseableReference<CloseableImage>> consumer, ah ahVar) {
        Map map = null;
        aj c = ahVar.m2173c();
        String b = ahVar.m2172b();
        c.m2043a(b, m2233a());
        CacheKey a = this.f2276b.m1880a(ahVar.m2170a(), ahVar.m2174d());
        CloseableReference a2 = this.f2275a.m1891a(a);
        if (a2 != null) {
            boolean c2 = ((CloseableImage) a2.m1099a()).m2019d().m2038c();
            if (c2) {
                c.m2046a(b, m2233a(), c.m2048b(b) ? ImmutableMap.m1023a("cached_value_found", "true") : null);
                consumer.m1981b((float) DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
            }
            consumer.m1982b(a2, c2);
            a2.close();
            if (c2) {
                return;
            }
        }
        if (ahVar.m2175e().f2399e >= ImageRequest.BITMAP_MEMORY_CACHE.f2399e) {
            Map a3;
            String a4 = m2233a();
            if (c.m2048b(b)) {
                a3 = ImmutableMap.m1023a("cached_value_found", "false");
            } else {
                a3 = null;
            }
            c.m2046a(b, a4, a3);
            consumer.m1982b(null, true);
            return;
        }
        Consumer a5 = m2232a((Consumer) consumer, a);
        a4 = m2233a();
        if (c.m2048b(b)) {
            map = ImmutableMap.m1023a("cached_value_found", "false");
        }
        c.m2046a(b, a4, map);
        this.f2277c.m2094a(a5, ahVar);
    }

    protected Consumer<CloseableReference<CloseableImage>> m2232a(Consumer<CloseableReference<CloseableImage>> consumer, CacheKey cacheKey) {
        return new BitmapMemoryCacheProducer(this, consumer, cacheKey);
    }

    protected String m2233a() {
        return "BitmapMemoryCacheProducer";
    }
}
