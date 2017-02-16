package com.facebook.imagepipeline.p044k;

import com.android.volley.DefaultRetryPolicy;
import com.facebook.common.p011d.ImmutableMap;
import com.facebook.common.p017h.CloseableReference;
import com.facebook.imagepipeline.p041c.CacheKeyFactory;
import com.facebook.imagepipeline.p041c.MemoryCache;
import com.facebook.imagepipeline.p047h.CloseableImage;
import com.facebook.imagepipeline.p050l.ImageRequest;
import com.facebook.imagepipeline.p050l.Postprocessor;
import com.facebook.imagepipeline.p050l.RepeatedPostprocessor;
import com.facebook.p007c.p008a.CacheKey;
import java.util.Map;

/* compiled from: PostprocessedBitmapMemoryCacheProducer */
/* renamed from: com.facebook.imagepipeline.k.ae */
public final class ae implements ag<CloseableReference<CloseableImage>> {
    private final MemoryCache<CacheKey, CloseableImage> f2194a;
    private final CacheKeyFactory f2195b;
    private final ag<CloseableReference<CloseableImage>> f2196c;

    /* renamed from: com.facebook.imagepipeline.k.ae.a */
    public static class PostprocessedBitmapMemoryCacheProducer extends DelegatingConsumer<CloseableReference<CloseableImage>, CloseableReference<CloseableImage>> {
        private final CacheKey f2191a;
        private final boolean f2192b;
        private final MemoryCache<CacheKey, CloseableImage> f2193c;

        protected final /* synthetic */ void m2148a(Object obj, boolean z) {
            obj = (CloseableReference) obj;
            if (obj == null) {
                if (z) {
                    this.f2163e.m1982b(null, true);
                }
            } else if (z || this.f2192b) {
                CloseableReference a = this.f2193c.m1892a(this.f2191a, obj);
                try {
                    this.f2163e.m1981b((float) DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
                    Consumer consumer = this.f2163e;
                    if (a != null) {
                        obj = a;
                    }
                    consumer.m1982b(obj, z);
                } finally {
                    CloseableReference.m1097c(a);
                }
            }
        }

        public PostprocessedBitmapMemoryCacheProducer(Consumer<CloseableReference<CloseableImage>> consumer, CacheKey cacheKey, boolean z, MemoryCache<CacheKey, CloseableImage> memoryCache) {
            super(consumer);
            this.f2191a = cacheKey;
            this.f2192b = z;
            this.f2193c = memoryCache;
        }
    }

    public ae(MemoryCache<CacheKey, CloseableImage> memoryCache, CacheKeyFactory cacheKeyFactory, ag<CloseableReference<CloseableImage>> agVar) {
        this.f2194a = memoryCache;
        this.f2195b = cacheKeyFactory;
        this.f2196c = agVar;
    }

    public final void m2149a(Consumer<CloseableReference<CloseableImage>> consumer, ah ahVar) {
        Map map = null;
        aj c = ahVar.m2173c();
        String b = ahVar.m2172b();
        ImageRequest a = ahVar.m2170a();
        Object d = ahVar.m2174d();
        Postprocessor postprocessor = a.f2410k;
        if (postprocessor == null || postprocessor.m2334c() == null) {
            this.f2196c.m2094a(consumer, ahVar);
            return;
        }
        c.m2043a(b, "PostprocessedBitmapMemoryCacheProducer");
        CacheKey b2 = this.f2195b.m1881b(a, d);
        CloseableReference a2 = this.f2194a.m1891a(b2);
        if (a2 != null) {
            String str = "PostprocessedBitmapMemoryCacheProducer";
            if (c.m2048b(b)) {
                map = ImmutableMap.m1023a("cached_value_found", "true");
            }
            c.m2046a(b, str, map);
            consumer.m1981b((float) DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
            consumer.m1982b(a2, true);
            a2.close();
            return;
        }
        Consumer postprocessedBitmapMemoryCacheProducer = new PostprocessedBitmapMemoryCacheProducer(consumer, b2, postprocessor instanceof RepeatedPostprocessor, this.f2194a);
        str = "PostprocessedBitmapMemoryCacheProducer";
        if (c.m2048b(b)) {
            map = ImmutableMap.m1023a("cached_value_found", "false");
        }
        c.m2046a(b, str, map);
        this.f2196c.m2094a(postprocessedBitmapMemoryCacheProducer, ahVar);
    }
}
