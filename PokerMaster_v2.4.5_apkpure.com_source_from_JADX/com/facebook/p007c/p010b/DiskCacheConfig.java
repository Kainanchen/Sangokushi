package com.facebook.p007c.p010b;

import android.content.Context;
import com.facebook.common.p011d.Preconditions;
import com.facebook.common.p011d.Supplier;
import com.facebook.common.p012a.DiskTrimmableRegistry;
import com.facebook.common.p012a.NoOpDiskTrimmableRegistry;
import com.facebook.p007c.p008a.CacheErrorLogger;
import com.facebook.p007c.p008a.CacheEventListener;
import com.facebook.p007c.p008a.NoOpCacheErrorLogger;
import com.facebook.p007c.p008a.NoOpCacheEventListener;
import java.io.File;
import javax.annotation.Nullable;

/* renamed from: com.facebook.c.b.c */
public final class DiskCacheConfig {
    public final int f1034a;
    public final String f1035b;
    public final Supplier<File> f1036c;
    public final long f1037d;
    public final long f1038e;
    public final long f1039f;
    public final EntryEvictionComparatorSupplier f1040g;
    public final CacheErrorLogger f1041h;
    public final CacheEventListener f1042i;
    public final DiskTrimmableRegistry f1043j;
    public final Context f1044k;
    public final boolean f1045l;

    /* renamed from: com.facebook.c.b.c.a */
    public static class DiskCacheConfig {
        int f1022a;
        String f1023b;
        public Supplier<File> f1024c;
        long f1025d;
        long f1026e;
        long f1027f;
        EntryEvictionComparatorSupplier f1028g;
        CacheErrorLogger f1029h;
        CacheEventListener f1030i;
        DiskTrimmableRegistry f1031j;
        boolean f1032k;
        @Nullable
        public final Context f1033l;

        /* renamed from: com.facebook.c.b.c.a.1 */
        class DiskCacheConfig implements Supplier<File> {
            final /* synthetic */ DiskCacheConfig f1021a;

            public DiskCacheConfig(DiskCacheConfig diskCacheConfig) {
                this.f1021a = diskCacheConfig;
            }

            public final /* synthetic */ Object m964a() {
                return this.f1021a.f1033l.getApplicationContext().getCacheDir();
            }
        }

        private DiskCacheConfig(@Nullable Context context) {
            this.f1022a = 1;
            this.f1023b = "image_cache";
            this.f1025d = 41943040;
            this.f1026e = 10485760;
            this.f1027f = 2097152;
            this.f1028g = new DefaultEntryEvictionComparatorSupplier();
            this.f1033l = context;
        }
    }

    private DiskCacheConfig(DiskCacheConfig diskCacheConfig) {
        CacheErrorLogger a;
        CacheEventListener a2;
        DiskTrimmableRegistry a3;
        this.f1034a = diskCacheConfig.f1022a;
        this.f1035b = (String) Preconditions.m1030a(diskCacheConfig.f1023b);
        this.f1036c = (Supplier) Preconditions.m1030a(diskCacheConfig.f1024c);
        this.f1037d = diskCacheConfig.f1025d;
        this.f1038e = diskCacheConfig.f1026e;
        this.f1039f = diskCacheConfig.f1027f;
        this.f1040g = (EntryEvictionComparatorSupplier) Preconditions.m1030a(diskCacheConfig.f1028g);
        if (diskCacheConfig.f1029h == null) {
            a = NoOpCacheErrorLogger.m910a();
        } else {
            a = diskCacheConfig.f1029h;
        }
        this.f1041h = a;
        if (diskCacheConfig.f1030i == null) {
            a2 = NoOpCacheEventListener.m911a();
        } else {
            a2 = diskCacheConfig.f1030i;
        }
        this.f1042i = a2;
        if (diskCacheConfig.f1031j == null) {
            a3 = NoOpDiskTrimmableRegistry.m1004a();
        } else {
            a3 = diskCacheConfig.f1031j;
        }
        this.f1043j = a3;
        this.f1044k = diskCacheConfig.f1033l;
        this.f1045l = diskCacheConfig.f1032k;
    }
}
