package com.facebook.imagepipeline.p043e;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import com.facebook.imagepipeline.memory.ByteArrayPool;
import com.facebook.imagepipeline.memory.PooledByteBuffer;
import com.facebook.imagepipeline.memory.PooledByteBufferFactory;
import com.facebook.imagepipeline.p040b.PlatformBitmapFactory;
import com.facebook.imagepipeline.p041c.BufferedDiskCache;
import com.facebook.imagepipeline.p041c.CacheKeyFactory;
import com.facebook.imagepipeline.p041c.MemoryCache;
import com.facebook.imagepipeline.p044k.AddImageTransformMetaDataProducer;
import com.facebook.imagepipeline.p044k.LocalExifThumbnailProducer;
import com.facebook.imagepipeline.p044k.ag;
import com.facebook.imagepipeline.p044k.ak;
import com.facebook.imagepipeline.p044k.at;
import com.facebook.imagepipeline.p046g.ImageDecoder;
import com.facebook.imagepipeline.p046g.ProgressiveJpegConfig;
import com.facebook.imagepipeline.p047h.CloseableImage;
import com.facebook.imagepipeline.p047h.EncodedImage;
import com.facebook.p007c.p008a.CacheKey;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.e.l */
public final class ProducerFactory {
    ContentResolver f2088a;
    Resources f2089b;
    AssetManager f2090c;
    final ByteArrayPool f2091d;
    final ImageDecoder f2092e;
    final ProgressiveJpegConfig f2093f;
    final boolean f2094g;
    final boolean f2095h;
    final boolean f2096i;
    final ExecutorSupplier f2097j;
    final PooledByteBufferFactory f2098k;
    final BufferedDiskCache f2099l;
    final BufferedDiskCache f2100m;
    final MemoryCache<CacheKey, PooledByteBuffer> f2101n;
    final MemoryCache<CacheKey, CloseableImage> f2102o;
    final CacheKeyFactory f2103p;
    final int f2104q;
    final PlatformBitmapFactory f2105r;
    private final int f2106s;

    public ProducerFactory(Context context, ByteArrayPool byteArrayPool, ImageDecoder imageDecoder, ProgressiveJpegConfig progressiveJpegConfig, boolean z, int i, boolean z2, ExecutorSupplier executorSupplier, PooledByteBufferFactory pooledByteBufferFactory, MemoryCache<CacheKey, CloseableImage> memoryCache, MemoryCache<CacheKey, PooledByteBuffer> memoryCache2, BufferedDiskCache bufferedDiskCache, BufferedDiskCache bufferedDiskCache2, CacheKeyFactory cacheKeyFactory, PlatformBitmapFactory platformBitmapFactory, boolean z3, int i2) {
        this.f2104q = i2;
        this.f2088a = context.getApplicationContext().getContentResolver();
        this.f2089b = context.getApplicationContext().getResources();
        this.f2090c = context.getApplicationContext().getAssets();
        this.f2091d = byteArrayPool;
        this.f2092e = imageDecoder;
        this.f2093f = progressiveJpegConfig;
        this.f2094g = z;
        this.f2106s = i;
        this.f2095h = z2;
        this.f2097j = executorSupplier;
        this.f2098k = pooledByteBufferFactory;
        this.f2102o = memoryCache;
        this.f2101n = memoryCache2;
        this.f2099l = bufferedDiskCache;
        this.f2100m = bufferedDiskCache2;
        this.f2103p = cacheKeyFactory;
        this.f2105r = platformBitmapFactory;
        this.f2096i = z3;
    }

    public static AddImageTransformMetaDataProducer m1962a(ag<EncodedImage> agVar) {
        return new AddImageTransformMetaDataProducer(agVar);
    }

    public final LocalExifThumbnailProducer m1964a() {
        return new LocalExifThumbnailProducer(this.f2097j.m1930a(), this.f2098k, this.f2088a);
    }

    public final ak m1963a(ag<EncodedImage> agVar, boolean z) {
        Executor d = this.f2097j.m1933d();
        PooledByteBufferFactory pooledByteBufferFactory = this.f2098k;
        boolean z2 = z && !this.f2094g;
        return new ak(d, pooledByteBufferFactory, z2, agVar);
    }

    public final at m1965b(ag<EncodedImage> agVar) {
        return new at(this.f2097j.m1933d(), this.f2098k, agVar, this.f2106s);
    }
}
