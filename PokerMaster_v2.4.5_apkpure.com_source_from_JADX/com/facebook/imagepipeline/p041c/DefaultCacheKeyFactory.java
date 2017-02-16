package com.facebook.imagepipeline.p041c;

import com.facebook.imagepipeline.p050l.ImageRequest;
import com.facebook.imagepipeline.p050l.Postprocessor;
import com.facebook.p007c.p008a.CacheKey;
import com.facebook.p007c.p008a.SimpleCacheKey;

/* renamed from: com.facebook.imagepipeline.c.j */
public final class DefaultCacheKeyFactory implements CacheKeyFactory {
    private static DefaultCacheKeyFactory f1954a;

    static {
        f1954a = null;
    }

    protected DefaultCacheKeyFactory() {
    }

    public static synchronized DefaultCacheKeyFactory m1912a() {
        DefaultCacheKeyFactory defaultCacheKeyFactory;
        synchronized (DefaultCacheKeyFactory.class) {
            if (f1954a == null) {
                f1954a = new DefaultCacheKeyFactory();
            }
            defaultCacheKeyFactory = f1954a;
        }
        return defaultCacheKeyFactory;
    }

    public final CacheKey m1914a(ImageRequest imageRequest, Object obj) {
        return new BitmapMemoryCacheKey(imageRequest.f2401b.toString(), imageRequest.f2405f, imageRequest.f2406g, imageRequest.f2404e, null, null, obj);
    }

    public final CacheKey m1915b(ImageRequest imageRequest, Object obj) {
        String name;
        CacheKey cacheKey = null;
        Postprocessor postprocessor = imageRequest.f2410k;
        if (postprocessor != null) {
            cacheKey = postprocessor.m2334c();
            name = postprocessor.getClass().getName();
        } else {
            name = null;
        }
        return new BitmapMemoryCacheKey(imageRequest.f2401b.toString(), imageRequest.f2405f, imageRequest.f2406g, imageRequest.f2404e, cacheKey, name, obj);
    }

    public final CacheKey m1913a(ImageRequest imageRequest) {
        return new SimpleCacheKey(imageRequest.f2401b.toString());
    }
}
