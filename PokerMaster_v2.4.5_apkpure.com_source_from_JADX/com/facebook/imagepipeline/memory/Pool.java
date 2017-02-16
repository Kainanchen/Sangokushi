package com.facebook.imagepipeline.memory;

import com.facebook.common.p017h.ResourceReleaser;

/* renamed from: com.facebook.imagepipeline.memory.q */
public interface Pool<V> extends ResourceReleaser<V> {
    V m2344a(int i);

    void m2345a(V v);
}
