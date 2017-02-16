package com.facebook.imagepipeline.p043e;

import com.facebook.p007c.p010b.DiskCacheConfig;
import com.facebook.p007c.p010b.DiskStorage;
import com.facebook.p007c.p010b.DynamicDefaultDiskStorage;

/* renamed from: com.facebook.imagepipeline.e.d */
public final class DynamicDefaultDiskStorageFactory implements DiskStorageFactory {
    public final DiskStorage m1943a(DiskCacheConfig diskCacheConfig) {
        return new DynamicDefaultDiskStorage(diskCacheConfig.f1034a, diskCacheConfig.f1036c, diskCacheConfig.f1035b, diskCacheConfig.f1041h);
    }
}
