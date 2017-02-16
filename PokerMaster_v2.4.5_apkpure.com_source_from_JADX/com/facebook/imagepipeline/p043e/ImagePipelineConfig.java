package com.facebook.imagepipeline.p043e;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap.Config;
import com.facebook.common.p011d.Preconditions;
import com.facebook.common.p011d.Supplier;
import com.facebook.common.p016g.MemoryTrimmableRegistry;
import com.facebook.common.p016g.NoOpMemoryTrimmableRegistry;
import com.facebook.imagepipeline.memory.PoolConfig;
import com.facebook.imagepipeline.memory.PoolFactory;
import com.facebook.imagepipeline.p038a.p039a.AnimatedImageFactory;
import com.facebook.imagepipeline.p040b.PlatformBitmapFactory;
import com.facebook.imagepipeline.p041c.CacheKeyFactory;
import com.facebook.imagepipeline.p041c.DefaultBitmapMemoryCacheParamsSupplier;
import com.facebook.imagepipeline.p041c.DefaultCacheKeyFactory;
import com.facebook.imagepipeline.p041c.DefaultEncodedMemoryCacheParamsSupplier;
import com.facebook.imagepipeline.p041c.ImageCacheStatsTracker;
import com.facebook.imagepipeline.p041c.MemoryCacheParams;
import com.facebook.imagepipeline.p041c.NoOpImageCacheStatsTracker;
import com.facebook.imagepipeline.p043e.ImagePipelineExperiments.ImagePipelineExperiments;
import com.facebook.imagepipeline.p044k.HttpUrlConnectionNetworkFetcher;
import com.facebook.imagepipeline.p044k.ad;
import com.facebook.imagepipeline.p046g.ImageDecoder;
import com.facebook.imagepipeline.p046g.ProgressiveJpegConfig;
import com.facebook.imagepipeline.p046g.SimpleProgressiveJpegConfig;
import com.facebook.imagepipeline.p048i.RequestListener;
import com.facebook.p007c.p010b.DiskCacheConfig;
import com.tencent.android.tpush.common.Constants;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Nullable;

/* renamed from: com.facebook.imagepipeline.e.h */
public final class ImagePipelineConfig {
    private static ImagePipelineConfig f2028x;
    final Config f2029a;
    final Supplier<MemoryCacheParams> f2030b;
    final CacheKeyFactory f2031c;
    final Context f2032d;
    final boolean f2033e;
    final boolean f2034f;
    final FileCacheFactory f2035g;
    final Supplier<MemoryCacheParams> f2036h;
    final ExecutorSupplier f2037i;
    final ImageCacheStatsTracker f2038j;
    @Nullable
    final ImageDecoder f2039k;
    final Supplier<Boolean> f2040l;
    final DiskCacheConfig f2041m;
    final MemoryTrimmableRegistry f2042n;
    final ad f2043o;
    final PoolFactory f2044p;
    final ProgressiveJpegConfig f2045q;
    final Set<RequestListener> f2046r;
    final boolean f2047s;
    final DiskCacheConfig f2048t;
    final ImagePipelineExperiments f2049u;
    @Nullable
    private final AnimatedImageFactory f2050v;
    @Nullable
    private final PlatformBitmapFactory f2051w;

    /* renamed from: com.facebook.imagepipeline.e.h.1 */
    class ImagePipelineConfig implements Supplier<Boolean> {
        final /* synthetic */ ImagePipelineConfig f2003a;

        ImagePipelineConfig(ImagePipelineConfig imagePipelineConfig) {
            this.f2003a = imagePipelineConfig;
        }

        public final /* synthetic */ Object m1946a() {
            return Boolean.valueOf(true);
        }
    }

    /* renamed from: com.facebook.imagepipeline.e.h.a */
    public static class ImagePipelineConfig {
        AnimatedImageFactory f2004a;
        Config f2005b;
        Supplier<MemoryCacheParams> f2006c;
        CacheKeyFactory f2007d;
        final Context f2008e;
        boolean f2009f;
        boolean f2010g;
        Supplier<MemoryCacheParams> f2011h;
        ExecutorSupplier f2012i;
        ImageCacheStatsTracker f2013j;
        ImageDecoder f2014k;
        Supplier<Boolean> f2015l;
        DiskCacheConfig f2016m;
        MemoryTrimmableRegistry f2017n;
        ad f2018o;
        PlatformBitmapFactory f2019p;
        PoolFactory f2020q;
        ProgressiveJpegConfig f2021r;
        Set<RequestListener> f2022s;
        boolean f2023t;
        DiskCacheConfig f2024u;
        FileCacheFactory f2025v;
        final ImagePipelineExperiments f2026w;

        private ImagePipelineConfig(Context context) {
            this.f2009f = false;
            this.f2023t = true;
            this.f2026w = new ImagePipelineExperiments(this);
            this.f2008e = (Context) Preconditions.m1030a((Object) context);
        }
    }

    /* renamed from: com.facebook.imagepipeline.e.h.b */
    public static class ImagePipelineConfig {
        public boolean f2027a;

        private ImagePipelineConfig() {
            this.f2027a = false;
        }
    }

    static {
        f2028x = new ImagePipelineConfig();
    }

    private ImagePipelineConfig(ImagePipelineConfig imagePipelineConfig) {
        Supplier defaultBitmapMemoryCacheParamsSupplier;
        Config config;
        CacheKeyFactory a;
        FileCacheFactory diskStorageCacheFactory;
        ImageCacheStatsTracker a2;
        DiskCacheConfig diskCacheConfig;
        MemoryTrimmableRegistry a3;
        ad httpUrlConnectionNetworkFetcher;
        PoolFactory poolFactory;
        ProgressiveJpegConfig simpleProgressiveJpegConfig;
        Set hashSet;
        ExecutorSupplier defaultExecutorSupplier;
        this.f2050v = imagePipelineConfig.f2004a;
        if (imagePipelineConfig.f2006c == null) {
            defaultBitmapMemoryCacheParamsSupplier = new DefaultBitmapMemoryCacheParamsSupplier((ActivityManager) imagePipelineConfig.f2008e.getSystemService(Constants.FLAG_ACTIVITY_NAME));
        } else {
            defaultBitmapMemoryCacheParamsSupplier = imagePipelineConfig.f2006c;
        }
        this.f2030b = defaultBitmapMemoryCacheParamsSupplier;
        if (imagePipelineConfig.f2005b == null) {
            config = Config.ARGB_8888;
        } else {
            config = imagePipelineConfig.f2005b;
        }
        this.f2029a = config;
        if (imagePipelineConfig.f2007d == null) {
            a = DefaultCacheKeyFactory.m1912a();
        } else {
            a = imagePipelineConfig.f2007d;
        }
        this.f2031c = a;
        this.f2032d = (Context) Preconditions.m1030a(imagePipelineConfig.f2008e);
        this.f2034f = imagePipelineConfig.f2010g;
        if (imagePipelineConfig.f2025v == null) {
            diskStorageCacheFactory = new DiskStorageCacheFactory(new DynamicDefaultDiskStorageFactory());
        } else {
            diskStorageCacheFactory = imagePipelineConfig.f2025v;
        }
        this.f2035g = diskStorageCacheFactory;
        this.f2033e = imagePipelineConfig.f2009f;
        if (imagePipelineConfig.f2011h == null) {
            defaultBitmapMemoryCacheParamsSupplier = new DefaultEncodedMemoryCacheParamsSupplier();
        } else {
            defaultBitmapMemoryCacheParamsSupplier = imagePipelineConfig.f2011h;
        }
        this.f2036h = defaultBitmapMemoryCacheParamsSupplier;
        if (imagePipelineConfig.f2013j == null) {
            a2 = NoOpImageCacheStatsTracker.m1920a();
        } else {
            a2 = imagePipelineConfig.f2013j;
        }
        this.f2038j = a2;
        this.f2039k = imagePipelineConfig.f2014k;
        if (imagePipelineConfig.f2015l == null) {
            defaultBitmapMemoryCacheParamsSupplier = new ImagePipelineConfig(this);
        } else {
            defaultBitmapMemoryCacheParamsSupplier = imagePipelineConfig.f2015l;
        }
        this.f2040l = defaultBitmapMemoryCacheParamsSupplier;
        if (imagePipelineConfig.f2016m == null) {
            DiskCacheConfig.DiskCacheConfig diskCacheConfig2 = new DiskCacheConfig.DiskCacheConfig((byte) 0);
            boolean z = (diskCacheConfig2.f1024c == null && diskCacheConfig2.f1033l == null) ? false : true;
            Preconditions.m1036b(z, "Either a non-null context or a base directory path or supplier must be provided.");
            if (diskCacheConfig2.f1024c == null && diskCacheConfig2.f1033l != null) {
                diskCacheConfig2.f1024c = new DiskCacheConfig.DiskCacheConfig.DiskCacheConfig(diskCacheConfig2);
            }
            diskCacheConfig = new DiskCacheConfig((byte) 0);
        } else {
            diskCacheConfig = imagePipelineConfig.f2016m;
        }
        this.f2041m = diskCacheConfig;
        if (imagePipelineConfig.f2017n == null) {
            a3 = NoOpMemoryTrimmableRegistry.m1090a();
        } else {
            a3 = imagePipelineConfig.f2017n;
        }
        this.f2042n = a3;
        if (imagePipelineConfig.f2018o == null) {
            httpUrlConnectionNetworkFetcher = new HttpUrlConnectionNetworkFetcher();
        } else {
            httpUrlConnectionNetworkFetcher = imagePipelineConfig.f2018o;
        }
        this.f2043o = httpUrlConnectionNetworkFetcher;
        this.f2051w = imagePipelineConfig.f2019p;
        if (imagePipelineConfig.f2020q == null) {
            poolFactory = new PoolFactory(new PoolConfig((byte) 0));
        } else {
            poolFactory = imagePipelineConfig.f2020q;
        }
        this.f2044p = poolFactory;
        if (imagePipelineConfig.f2021r == null) {
            simpleProgressiveJpegConfig = new SimpleProgressiveJpegConfig();
        } else {
            simpleProgressiveJpegConfig = imagePipelineConfig.f2021r;
        }
        this.f2045q = simpleProgressiveJpegConfig;
        if (imagePipelineConfig.f2022s == null) {
            hashSet = new HashSet();
        } else {
            hashSet = imagePipelineConfig.f2022s;
        }
        this.f2046r = hashSet;
        this.f2047s = imagePipelineConfig.f2023t;
        if (imagePipelineConfig.f2024u == null) {
            diskCacheConfig = this.f2041m;
        } else {
            diskCacheConfig = imagePipelineConfig.f2024u;
        }
        this.f2048t = diskCacheConfig;
        int b = this.f2044p.m2425b();
        if (imagePipelineConfig.f2012i == null) {
            defaultExecutorSupplier = new DefaultExecutorSupplier(b);
        } else {
            defaultExecutorSupplier = imagePipelineConfig.f2012i;
        }
        this.f2037i = defaultExecutorSupplier;
        ImagePipelineExperiments imagePipelineExperiments = imagePipelineConfig.f2026w;
        this.f2049u = new ImagePipelineExperiments(imagePipelineExperiments.f2052a, (byte) 0);
    }

    public static ImagePipelineConfig m1948a() {
        return f2028x;
    }

    public static ImagePipelineConfig m1947a(Context context) {
        return new ImagePipelineConfig((byte) 0);
    }
}
