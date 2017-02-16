package com.facebook.imagepipeline.p044k;

import bolts.Continuation;
import bolts.Task;
import com.android.volley.DefaultRetryPolicy;
import com.facebook.common.p011d.ImmutableMap;
import com.facebook.imagepipeline.p041c.BufferedDiskCache;
import com.facebook.imagepipeline.p041c.CacheKeyFactory;
import com.facebook.imagepipeline.p047h.EncodedImage;
import com.facebook.imagepipeline.p050l.ImageRequest;
import com.facebook.p007c.p008a.CacheKey;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.imagepipeline.k.n */
public final class DiskCacheProducer implements ag<EncodedImage> {
    final BufferedDiskCache f2327a;
    final BufferedDiskCache f2328b;
    final boolean f2329c;
    final int f2330d;
    private final CacheKeyFactory f2331e;
    private final ag<EncodedImage> f2332f;

    /* renamed from: com.facebook.imagepipeline.k.n.1 */
    class DiskCacheProducer implements Continuation<EncodedImage, Task<EncodedImage>> {
        final /* synthetic */ BufferedDiskCache f2311a;
        final /* synthetic */ CacheKey f2312b;
        final /* synthetic */ AtomicBoolean f2313c;
        final /* synthetic */ DiskCacheProducer f2314d;

        DiskCacheProducer(DiskCacheProducer diskCacheProducer, BufferedDiskCache bufferedDiskCache, CacheKey cacheKey, AtomicBoolean atomicBoolean) {
            this.f2314d = diskCacheProducer;
            this.f2311a = bufferedDiskCache;
            this.f2312b = cacheKey;
            this.f2313c = atomicBoolean;
        }

        public final /* synthetic */ Object then(Task task) {
            if (DiskCacheProducer.m2274a(task)) {
                return task;
            }
            if (task.isFaulted() || task.getResult() == null) {
                return this.f2311a.m1876a(this.f2312b, this.f2313c);
            }
            return task;
        }
    }

    /* renamed from: com.facebook.imagepipeline.k.n.2 */
    class DiskCacheProducer implements Continuation<EncodedImage, Void> {
        final /* synthetic */ aj f2315a;
        final /* synthetic */ String f2316b;
        final /* synthetic */ Consumer f2317c;
        final /* synthetic */ BufferedDiskCache f2318d;
        final /* synthetic */ CacheKey f2319e;
        final /* synthetic */ ah f2320f;
        final /* synthetic */ DiskCacheProducer f2321g;

        DiskCacheProducer(DiskCacheProducer diskCacheProducer, aj ajVar, String str, Consumer consumer, BufferedDiskCache bufferedDiskCache, CacheKey cacheKey, ah ahVar) {
            this.f2321g = diskCacheProducer;
            this.f2315a = ajVar;
            this.f2316b = str;
            this.f2317c = consumer;
            this.f2318d = bufferedDiskCache;
            this.f2319e = cacheKey;
            this.f2320f = ahVar;
        }

        public final /* synthetic */ Object then(Task task) {
            if (DiskCacheProducer.m2274a(task)) {
                this.f2315a.m2047b(this.f2316b, "DiskCacheProducer", null);
                this.f2317c.m1980b();
            } else if (task.isFaulted()) {
                this.f2315a.m2045a(this.f2316b, "DiskCacheProducer", task.getError(), null);
                this.f2321g.m2276a(this.f2317c, new DiskCacheProducer(this.f2317c, this.f2318d, this.f2319e, (byte) 0), this.f2320f);
            } else {
                EncodedImage encodedImage = (EncodedImage) task.getResult();
                if (encodedImage != null) {
                    this.f2315a.m2046a(this.f2316b, "DiskCacheProducer", DiskCacheProducer.m2273a(this.f2315a, this.f2316b, true));
                    this.f2317c.m1981b((float) DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
                    this.f2317c.m1982b(encodedImage, true);
                    encodedImage.close();
                } else {
                    this.f2315a.m2046a(this.f2316b, "DiskCacheProducer", DiskCacheProducer.m2273a(this.f2315a, this.f2316b, false));
                    this.f2321g.m2276a(this.f2317c, new DiskCacheProducer(this.f2317c, this.f2318d, this.f2319e, (byte) 0), this.f2320f);
                }
            }
            return null;
        }
    }

    /* renamed from: com.facebook.imagepipeline.k.n.3 */
    class DiskCacheProducer extends BaseProducerContextCallbacks {
        final /* synthetic */ AtomicBoolean f2322a;
        final /* synthetic */ DiskCacheProducer f2323b;

        DiskCacheProducer(DiskCacheProducer diskCacheProducer, AtomicBoolean atomicBoolean) {
            this.f2323b = diskCacheProducer;
            this.f2322a = atomicBoolean;
        }

        public final void m2271a() {
            this.f2322a.set(true);
        }
    }

    /* renamed from: com.facebook.imagepipeline.k.n.a */
    private class DiskCacheProducer extends DelegatingConsumer<EncodedImage, EncodedImage> {
        final /* synthetic */ DiskCacheProducer f2324a;
        private final BufferedDiskCache f2325b;
        private final CacheKey f2326c;

        public final /* synthetic */ void m2272a(Object obj, boolean z) {
            EncodedImage encodedImage = (EncodedImage) obj;
            if (encodedImage != null && z) {
                if (this.f2324a.f2329c) {
                    int b = encodedImage.m2033b();
                    if (b <= 0 || b >= this.f2324a.f2330d) {
                        this.f2324a.f2327a.m1877a(this.f2326c, encodedImage);
                    } else {
                        this.f2324a.f2328b.m1877a(this.f2326c, encodedImage);
                    }
                } else {
                    this.f2325b.m1877a(this.f2326c, encodedImage);
                }
            }
            this.f2163e.m1982b(encodedImage, z);
        }

        private DiskCacheProducer(DiskCacheProducer diskCacheProducer, Consumer<EncodedImage> consumer, BufferedDiskCache bufferedDiskCache, CacheKey cacheKey) {
            this.f2324a = diskCacheProducer;
            super(consumer);
            this.f2325b = bufferedDiskCache;
            this.f2326c = cacheKey;
        }
    }

    public DiskCacheProducer(BufferedDiskCache bufferedDiskCache, BufferedDiskCache bufferedDiskCache2, CacheKeyFactory cacheKeyFactory, ag<EncodedImage> agVar, int i) {
        this.f2327a = bufferedDiskCache;
        this.f2328b = bufferedDiskCache2;
        this.f2331e = cacheKeyFactory;
        this.f2332f = agVar;
        this.f2330d = i;
        this.f2329c = i > 0;
    }

    public final void m2275a(Consumer<EncodedImage> consumer, ah ahVar) {
        ImageRequest a = ahVar.m2170a();
        if (a.f2409j) {
            Task continueWithTask;
            ahVar.m2173c().m2043a(ahVar.m2172b(), "DiskCacheProducer");
            CacheKey a2 = this.f2331e.m1879a(a);
            BufferedDiskCache bufferedDiskCache = a.f2400a == ImageRequest.ImageRequest.SMALL ? this.f2328b : this.f2327a;
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            if (this.f2329c) {
                BufferedDiskCache bufferedDiskCache2;
                BufferedDiskCache bufferedDiskCache3;
                boolean a3 = this.f2328b.m1878a(a2);
                boolean a4 = this.f2327a.m1878a(a2);
                if (a3 || !a4) {
                    bufferedDiskCache2 = this.f2328b;
                    bufferedDiskCache3 = this.f2327a;
                } else {
                    bufferedDiskCache2 = this.f2327a;
                    bufferedDiskCache3 = this.f2328b;
                }
                continueWithTask = bufferedDiskCache2.m1876a(a2, atomicBoolean).continueWithTask(new DiskCacheProducer(this, bufferedDiskCache3, a2, atomicBoolean));
            } else {
                continueWithTask = bufferedDiskCache.m1876a(a2, atomicBoolean);
            }
            continueWithTask.continueWith(new DiskCacheProducer(this, ahVar.m2173c(), ahVar.m2172b(), consumer, bufferedDiskCache, a2, ahVar));
            ahVar.m2171a(new DiskCacheProducer(this, atomicBoolean));
            return;
        }
        m2276a((Consumer) consumer, (Consumer) consumer, ahVar);
    }

    final void m2276a(Consumer<EncodedImage> consumer, Consumer<EncodedImage> consumer2, ah ahVar) {
        if (ahVar.m2175e().f2399e >= ImageRequest.ImageRequest.DISK_CACHE.f2399e) {
            consumer.m1982b(null, true);
        } else {
            this.f2332f.m2094a(consumer2, ahVar);
        }
    }

    static Map<String, String> m2273a(aj ajVar, String str, boolean z) {
        if (ajVar.m2048b(str)) {
            return ImmutableMap.m1023a("cached_value_found", String.valueOf(z));
        }
        return null;
    }

    static /* synthetic */ boolean m2274a(Task task) {
        return task.isCancelled() || (task.isFaulted() && (task.getError() instanceof CancellationException));
    }
}
