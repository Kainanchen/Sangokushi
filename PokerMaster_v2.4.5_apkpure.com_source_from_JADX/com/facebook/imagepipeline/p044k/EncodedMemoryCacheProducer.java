package com.facebook.imagepipeline.p044k;

import com.android.volley.DefaultRetryPolicy;
import com.facebook.common.p011d.ImmutableMap;
import com.facebook.common.p017h.CloseableReference;
import com.facebook.imagepipeline.memory.PooledByteBuffer;
import com.facebook.imagepipeline.p041c.CacheKeyFactory;
import com.facebook.imagepipeline.p041c.MemoryCache;
import com.facebook.imagepipeline.p047h.EncodedImage;
import com.facebook.imagepipeline.p050l.ImageRequest.ImageRequest;
import com.facebook.p007c.p008a.CacheKey;
import java.util.Map;

/* renamed from: com.facebook.imagepipeline.k.p */
public final class EncodedMemoryCacheProducer implements ag<EncodedImage> {
    final MemoryCache<CacheKey, PooledByteBuffer> f2336a;
    private final CacheKeyFactory f2337b;
    private final ag<EncodedImage> f2338c;

    /* renamed from: com.facebook.imagepipeline.k.p.1 */
    class EncodedMemoryCacheProducer extends DelegatingConsumer<EncodedImage, EncodedImage> {
        final /* synthetic */ CacheKey f2334a;
        final /* synthetic */ EncodedMemoryCacheProducer f2335b;

        EncodedMemoryCacheProducer(EncodedMemoryCacheProducer encodedMemoryCacheProducer, Consumer consumer, CacheKey cacheKey) {
            this.f2335b = encodedMemoryCacheProducer;
            this.f2334a = cacheKey;
            super(consumer);
        }

        public final /* synthetic */ void m2279a(Object obj, boolean z) {
            EncodedImage encodedImage = (EncodedImage) obj;
            if (!z || encodedImage == null) {
                this.f2163e.m1982b(encodedImage, z);
                return;
            }
            EncodedImage b = CloseableReference.m1096b(encodedImage.f2142a);
            if (b != null) {
                try {
                    CloseableReference a = this.f2335b.f2336a.m1892a(this.f2334a, b);
                    if (a != null) {
                        try {
                            b = new EncodedImage(a);
                            b.m2034b(encodedImage);
                            try {
                                this.f2163e.m1981b((float) DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
                                this.f2163e.m1982b(b, true);
                                return;
                            } finally {
                                EncodedImage.m2029d(b);
                            }
                        } finally {
                            CloseableReference.m1097c(a);
                        }
                    }
                } finally {
                    CloseableReference.m1097c(b);
                }
            }
            this.f2163e.m1982b(encodedImage, true);
        }
    }

    public EncodedMemoryCacheProducer(MemoryCache<CacheKey, PooledByteBuffer> memoryCache, CacheKeyFactory cacheKeyFactory, ag<EncodedImage> agVar) {
        this.f2336a = memoryCache;
        this.f2337b = cacheKeyFactory;
        this.f2338c = agVar;
    }

    public final void m2280a(Consumer<EncodedImage> consumer, ah ahVar) {
        Map map = null;
        String b = ahVar.m2172b();
        aj c = ahVar.m2173c();
        c.m2043a(b, "EncodedMemoryCacheProducer");
        CacheKey a = this.f2337b.m1879a(ahVar.m2170a());
        CloseableReference a2 = this.f2336a.m1891a(a);
        if (a2 != null) {
            EncodedImage encodedImage;
            try {
                encodedImage = new EncodedImage(a2);
                String str = "EncodedMemoryCacheProducer";
                if (c.m2048b(b)) {
                    map = ImmutableMap.m1023a("cached_value_found", "true");
                }
                c.m2046a(b, str, map);
                consumer.m1981b((float) DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
                consumer.m1982b(encodedImage, true);
                EncodedImage.m2029d(encodedImage);
                CloseableReference.m1097c(a2);
            } catch (Throwable th) {
                CloseableReference.m1097c(a2);
            }
        } else if (ahVar.m2175e().f2399e >= ImageRequest.ENCODED_MEMORY_CACHE.f2399e) {
            r3 = "EncodedMemoryCacheProducer";
            if (c.m2048b(b)) {
                map = ImmutableMap.m1023a("cached_value_found", "false");
            }
            c.m2046a(b, r3, map);
            consumer.m1982b(null, true);
            CloseableReference.m1097c(a2);
        } else {
            Consumer encodedMemoryCacheProducer = new EncodedMemoryCacheProducer(this, consumer, a);
            r3 = "EncodedMemoryCacheProducer";
            if (c.m2048b(b)) {
                map = ImmutableMap.m1023a("cached_value_found", "false");
            }
            c.m2046a(b, r3, map);
            this.f2338c.m2094a(encodedMemoryCacheProducer, ahVar);
            CloseableReference.m1097c(a2);
        }
    }
}
