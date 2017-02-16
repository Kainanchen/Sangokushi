package com.facebook.imagepipeline.p043e;

import com.facebook.p007c.p010b.DiskCacheConfig;
import com.facebook.p007c.p010b.DiskStorage;
import com.facebook.p007c.p010b.DiskStorageCache;
import com.facebook.p007c.p010b.FileCache;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: com.facebook.imagepipeline.e.b */
public final class DiskStorageCacheFactory implements FileCacheFactory {
    private DiskStorageFactory f1991a;

    public DiskStorageCacheFactory(DiskStorageFactory diskStorageFactory) {
        this.f1991a = diskStorageFactory;
    }

    public final FileCache m1941a(DiskCacheConfig diskCacheConfig) {
        DiskStorage a = this.f1991a.m1942a(diskCacheConfig);
        Executor newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        return new DiskStorageCache(a, diskCacheConfig.f1040g, new DiskStorageCache.DiskStorageCache(diskCacheConfig.f1039f, diskCacheConfig.f1038e, diskCacheConfig.f1037d), diskCacheConfig.f1042i, diskCacheConfig.f1041h, diskCacheConfig.f1044k, newSingleThreadExecutor, diskCacheConfig.f1045l);
    }
}
