package com.facebook.p007c.p010b;

import com.facebook.p006b.BinaryResource;
import com.facebook.p007c.p008a.CacheKey;
import com.facebook.p007c.p008a.WriterCallback;

/* renamed from: com.facebook.c.b.i */
public interface FileCache {
    BinaryResource m971a(CacheKey cacheKey);

    BinaryResource m972a(CacheKey cacheKey, WriterCallback writerCallback);

    boolean m973b(CacheKey cacheKey);

    boolean m974c(CacheKey cacheKey);
}
