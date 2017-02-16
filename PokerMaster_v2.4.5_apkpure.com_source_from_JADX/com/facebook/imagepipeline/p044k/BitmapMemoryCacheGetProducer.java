package com.facebook.imagepipeline.p044k;

import com.facebook.common.p017h.CloseableReference;
import com.facebook.imagepipeline.p041c.CacheKeyFactory;
import com.facebook.imagepipeline.p041c.MemoryCache;
import com.facebook.imagepipeline.p047h.CloseableImage;
import com.facebook.p007c.p008a.CacheKey;

/* renamed from: com.facebook.imagepipeline.k.f */
public final class BitmapMemoryCacheGetProducer extends BitmapMemoryCacheProducer {
    public BitmapMemoryCacheGetProducer(MemoryCache<CacheKey, CloseableImage> memoryCache, CacheKeyFactory cacheKeyFactory, ag<CloseableReference<CloseableImage>> agVar) {
        super(memoryCache, cacheKeyFactory, agVar);
    }

    protected final Consumer<CloseableReference<CloseableImage>> m2235a(Consumer<CloseableReference<CloseableImage>> consumer, CacheKey cacheKey) {
        return consumer;
    }

    protected final String m2236a() {
        return "BitmapMemoryCacheGetProducer";
    }
}
