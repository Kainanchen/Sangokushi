package com.facebook.imagepipeline.p043e;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.v4.util.Pools.SynchronizedPool;
import com.facebook.common.p011d.Preconditions;
import com.facebook.common.p011d.Supplier;
import com.facebook.common.p016g.MemoryTrimmableRegistry;
import com.facebook.imagepipeline.memory.ByteArrayPool;
import com.facebook.imagepipeline.memory.FlexByteArrayPool;
import com.facebook.imagepipeline.memory.PoolFactory;
import com.facebook.imagepipeline.memory.PooledByteBuffer;
import com.facebook.imagepipeline.p038a.p039a.AnimatedFactory;
import com.facebook.imagepipeline.p038a.p039a.AnimatedFactoryProvider;
import com.facebook.imagepipeline.p038a.p039a.AnimatedImageFactory;
import com.facebook.imagepipeline.p040b.ArtBitmapFactory;
import com.facebook.imagepipeline.p040b.EmptyJpegGenerator;
import com.facebook.imagepipeline.p040b.GingerbreadBitmapFactory;
import com.facebook.imagepipeline.p040b.HoneycombBitmapFactory;
import com.facebook.imagepipeline.p040b.PlatformBitmapFactory;
import com.facebook.imagepipeline.p041c.BitmapCountingMemoryCacheFactory.BitmapCountingMemoryCacheFactory;
import com.facebook.imagepipeline.p041c.BitmapMemoryCacheFactory.BitmapMemoryCacheFactory;
import com.facebook.imagepipeline.p041c.BitmapMemoryCacheTrimStrategy;
import com.facebook.imagepipeline.p041c.BufferedDiskCache;
import com.facebook.imagepipeline.p041c.CountingMemoryCache;
import com.facebook.imagepipeline.p041c.EncodedCountingMemoryCacheFactory.EncodedCountingMemoryCacheFactory;
import com.facebook.imagepipeline.p041c.EncodedMemoryCacheFactory.EncodedMemoryCacheFactory;
import com.facebook.imagepipeline.p041c.InstrumentedMemoryCache;
import com.facebook.imagepipeline.p041c.MemoryCache;
import com.facebook.imagepipeline.p041c.NativeMemoryCacheTrimStrategy;
import com.facebook.imagepipeline.p044k.ao;
import com.facebook.imagepipeline.p046g.ImageDecoder;
import com.facebook.imagepipeline.p047h.CloseableImage;
import com.facebook.imagepipeline.p049j.ArtDecoder;
import com.facebook.imagepipeline.p049j.GingerbreadPurgeableDecoder;
import com.facebook.imagepipeline.p049j.KitKatPurgeableDecoder;
import com.facebook.imagepipeline.p049j.PlatformDecoder;
import com.facebook.p007c.p008a.CacheKey;
import com.facebook.p007c.p010b.FileCache;
import java.util.Collections;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
/* renamed from: com.facebook.imagepipeline.e.j */
public final class ImagePipelineFactory {
    private static ImagePipelineFactory f2067a;
    private final ao f2068b;
    private final ImagePipelineConfig f2069c;
    private CountingMemoryCache<CacheKey, CloseableImage> f2070d;
    private MemoryCache<CacheKey, CloseableImage> f2071e;
    private CountingMemoryCache<CacheKey, PooledByteBuffer> f2072f;
    private MemoryCache<CacheKey, PooledByteBuffer> f2073g;
    private BufferedDiskCache f2074h;
    private FileCache f2075i;
    private ImageDecoder f2076j;
    private ImagePipeline f2077k;
    private ProducerFactory f2078l;
    private ProducerSequenceFactory f2079m;
    private BufferedDiskCache f2080n;
    private FileCache f2081o;
    private PlatformBitmapFactory f2082p;
    private PlatformDecoder f2083q;
    private AnimatedFactory f2084r;

    static {
        f2067a = null;
    }

    public static ImagePipelineFactory m1949a() {
        return (ImagePipelineFactory) Preconditions.m1031a(f2067a, (Object) "ImagePipelineFactory was not initialized!");
    }

    public static void m1950a(Context context) {
        f2067a = new ImagePipelineFactory(new ImagePipelineConfig((byte) 0));
    }

    private ImagePipelineFactory(ImagePipelineConfig imagePipelineConfig) {
        this.f2069c = (ImagePipelineConfig) Preconditions.m1030a((Object) imagePipelineConfig);
        this.f2068b = new ao(imagePipelineConfig.f2037i.m1934e());
    }

    public final AnimatedFactory m1957b() {
        if (this.f2084r == null) {
            this.f2084r = AnimatedFactoryProvider.m1860a(m1954i(), this.f2069c.f2037i);
        }
        return this.f2084r;
    }

    private MemoryCache<CacheKey, CloseableImage> m1951f() {
        if (this.f2071e == null) {
            if (this.f2070d == null) {
                Supplier supplier = this.f2069c.f2030b;
                MemoryTrimmableRegistry memoryTrimmableRegistry = this.f2069c.f2042n;
                m1954i();
                this.f2070d = new CountingMemoryCache(new BitmapCountingMemoryCacheFactory(), new BitmapMemoryCacheTrimStrategy(), supplier, this.f2069c.f2049u.f2065f);
            }
            this.f2071e = new InstrumentedMemoryCache(this.f2070d, new BitmapMemoryCacheFactory(this.f2069c.f2038j));
        }
        return this.f2071e;
    }

    private MemoryCache<CacheKey, PooledByteBuffer> m1952g() {
        if (this.f2073g == null) {
            if (this.f2072f == null) {
                Supplier supplier = this.f2069c.f2036h;
                MemoryTrimmableRegistry memoryTrimmableRegistry = this.f2069c.f2042n;
                m1954i();
                this.f2072f = new CountingMemoryCache(new EncodedCountingMemoryCacheFactory(), new NativeMemoryCacheTrimStrategy(), supplier, false);
            }
            this.f2073g = new InstrumentedMemoryCache(this.f2072f, new EncodedMemoryCacheFactory(this.f2069c.f2038j));
        }
        return this.f2073g;
    }

    private BufferedDiskCache m1953h() {
        if (this.f2074h == null) {
            this.f2074h = new BufferedDiskCache(m1958c(), this.f2069c.f2044p.m2426c(), this.f2069c.f2044p.m2427d(), this.f2069c.f2037i.m1930a(), this.f2069c.f2037i.m1931b(), this.f2069c.f2038j);
        }
        return this.f2074h;
    }

    public final FileCache m1958c() {
        if (this.f2075i == null) {
            this.f2075i = this.f2069c.f2035g.m1940a(this.f2069c.f2041m);
        }
        return this.f2075i;
    }

    public final ImagePipeline m1959d() {
        if (this.f2077k == null) {
            if (this.f2079m == null) {
                if (this.f2078l == null) {
                    Context context = this.f2069c.f2032d;
                    ByteArrayPool e = this.f2069c.f2044p.m2428e();
                    if (this.f2076j == null) {
                        if (this.f2069c.f2039k != null) {
                            this.f2076j = this.f2069c.f2039k;
                        } else {
                            AnimatedImageFactory b;
                            if (m1957b() != null) {
                                b = m1957b().m1859b();
                            } else {
                                b = null;
                            }
                            this.f2076j = new ImageDecoder(b, m1955j(), this.f2069c.f2029a);
                        }
                    }
                    this.f2078l = new ProducerFactory(context, e, this.f2076j, this.f2069c.f2045q, this.f2069c.f2033e, this.f2069c.f2049u.f2062c, this.f2069c.f2047s, this.f2069c.f2037i, this.f2069c.f2044p.m2426c(), m1951f(), m1952g(), m1953h(), m1956k(), this.f2069c.f2031c, m1954i(), this.f2069c.f2049u.f2063d, this.f2069c.f2049u.f2060a);
                }
                this.f2079m = new ProducerSequenceFactory(this.f2078l, this.f2069c.f2043o, this.f2069c.f2047s, this.f2069c.f2049u.f2061b, this.f2068b, this.f2069c.f2049u.f2064e);
            }
            this.f2077k = new ImagePipeline(this.f2079m, Collections.unmodifiableSet(this.f2069c.f2046r), this.f2069c.f2040l, m1951f(), m1952g(), m1953h(), m1956k(), this.f2069c.f2031c, this.f2068b);
        }
        return this.f2077k;
    }

    private PlatformBitmapFactory m1954i() {
        if (this.f2082p == null) {
            PlatformBitmapFactory artBitmapFactory;
            PoolFactory poolFactory = this.f2069c.f2044p;
            PlatformDecoder j = m1955j();
            if (VERSION.SDK_INT >= 21) {
                artBitmapFactory = new ArtBitmapFactory(poolFactory.m2424a());
            } else if (VERSION.SDK_INT >= 11) {
                artBitmapFactory = new HoneycombBitmapFactory(new EmptyJpegGenerator(poolFactory.m2426c()), j);
            } else {
                artBitmapFactory = new GingerbreadBitmapFactory();
            }
            this.f2082p = artBitmapFactory;
        }
        return this.f2082p;
    }

    private PlatformDecoder m1955j() {
        if (this.f2083q == null) {
            PlatformDecoder artDecoder;
            PoolFactory poolFactory = this.f2069c.f2044p;
            boolean z = this.f2069c.f2034f;
            boolean z2 = this.f2069c.f2049u.f2061b;
            ImagePipelineExperiments imagePipelineExperiments = this.f2069c.f2049u;
            if (VERSION.SDK_INT >= 21) {
                int b = poolFactory.m2425b();
                artDecoder = new ArtDecoder(poolFactory.m2424a(), b, new SynchronizedPool(b));
            } else if (!z || VERSION.SDK_INT >= 19) {
                if (poolFactory.f2486b == null) {
                    poolFactory.f2486b = new FlexByteArrayPool(poolFactory.f2485a.f2480d, poolFactory.f2485a.f2479c);
                }
                artDecoder = new KitKatPurgeableDecoder(poolFactory.f2486b);
            } else {
                artDecoder = new GingerbreadPurgeableDecoder(z2);
            }
            this.f2083q = artDecoder;
        }
        return this.f2083q;
    }

    public final FileCache m1960e() {
        if (this.f2081o == null) {
            this.f2081o = this.f2069c.f2035g.m1940a(this.f2069c.f2048t);
        }
        return this.f2081o;
    }

    private BufferedDiskCache m1956k() {
        if (this.f2080n == null) {
            this.f2080n = new BufferedDiskCache(m1960e(), this.f2069c.f2044p.m2426c(), this.f2069c.f2044p.m2427d(), this.f2069c.f2037i.m1930a(), this.f2069c.f2037i.m1931b(), this.f2069c.f2038j);
        }
        return this.f2080n;
    }
}
