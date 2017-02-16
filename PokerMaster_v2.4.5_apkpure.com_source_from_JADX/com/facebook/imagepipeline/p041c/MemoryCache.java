package com.facebook.imagepipeline.p041c;

import com.facebook.common.p017h.CloseableReference;
import javax.annotation.Nullable;

/* renamed from: com.facebook.imagepipeline.c.p */
public interface MemoryCache<K, V> {
    @Nullable
    CloseableReference<V> m1891a(K k);

    @Nullable
    CloseableReference<V> m1892a(K k, CloseableReference<V> closeableReference);
}
