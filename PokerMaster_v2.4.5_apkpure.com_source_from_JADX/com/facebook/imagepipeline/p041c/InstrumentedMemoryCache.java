package com.facebook.imagepipeline.p041c;

import com.facebook.common.p017h.CloseableReference;

/* renamed from: com.facebook.imagepipeline.c.o */
public final class InstrumentedMemoryCache<K, V> implements MemoryCache<K, V> {
    private final MemoryCache<K, V> f1956a;
    private final MemoryCacheTracker f1957b;

    public InstrumentedMemoryCache(MemoryCache<K, V> memoryCache, MemoryCacheTracker memoryCacheTracker) {
        this.f1956a = memoryCache;
        this.f1957b = memoryCacheTracker;
    }

    public final CloseableReference<V> m1918a(K k) {
        return this.f1956a.m1891a(k);
    }

    public final CloseableReference<V> m1919a(K k, CloseableReference<V> closeableReference) {
        return this.f1956a.m1892a(k, closeableReference);
    }
}
