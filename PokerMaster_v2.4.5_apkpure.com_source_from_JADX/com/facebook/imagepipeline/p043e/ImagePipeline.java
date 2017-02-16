package com.facebook.imagepipeline.p043e;

import com.facebook.common.p011d.Preconditions;
import com.facebook.common.p011d.Supplier;
import com.facebook.common.p015f.MediaUtils;
import com.facebook.common.p017h.CloseableReference;
import com.facebook.common.p021l.UriUtil;
import com.facebook.imagepipeline.memory.PooledByteBuffer;
import com.facebook.imagepipeline.p041c.BufferedDiskCache;
import com.facebook.imagepipeline.p041c.CacheKeyFactory;
import com.facebook.imagepipeline.p041c.MemoryCache;
import com.facebook.imagepipeline.p044k.ag;
import com.facebook.imagepipeline.p044k.al;
import com.facebook.imagepipeline.p044k.ao;
import com.facebook.imagepipeline.p045f.CloseableProducerToDataSourceAdapter;
import com.facebook.imagepipeline.p047h.CloseableImage;
import com.facebook.imagepipeline.p048i.ForwardingRequestListener;
import com.facebook.imagepipeline.p048i.RequestListener;
import com.facebook.imagepipeline.p050l.ImageRequest;
import com.facebook.p007c.p008a.CacheKey;
import com.facebook.p023d.DataSource;
import com.facebook.p023d.DataSources;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* renamed from: com.facebook.imagepipeline.e.g */
public final class ImagePipeline {
    private static final CancellationException f1992c;
    public final MemoryCache<CacheKey, CloseableImage> f1993a;
    public final CacheKeyFactory f1994b;
    private final ProducerSequenceFactory f1995d;
    private final RequestListener f1996e;
    private final Supplier<Boolean> f1997f;
    private final MemoryCache<CacheKey, PooledByteBuffer> f1998g;
    private final BufferedDiskCache f1999h;
    private final BufferedDiskCache f2000i;
    private final ao f2001j;
    private AtomicLong f2002k;

    static {
        f1992c = new CancellationException("Prefetching is not enabled");
    }

    public ImagePipeline(ProducerSequenceFactory producerSequenceFactory, Set<RequestListener> set, Supplier<Boolean> supplier, MemoryCache<CacheKey, CloseableImage> memoryCache, MemoryCache<CacheKey, PooledByteBuffer> memoryCache2, BufferedDiskCache bufferedDiskCache, BufferedDiskCache bufferedDiskCache2, CacheKeyFactory cacheKeyFactory, ao aoVar) {
        this.f2002k = new AtomicLong();
        this.f1995d = producerSequenceFactory;
        this.f1996e = new ForwardingRequestListener((Set) set);
        this.f1997f = supplier;
        this.f1993a = memoryCache;
        this.f1998g = memoryCache2;
        this.f1999h = bufferedDiskCache;
        this.f2000i = bufferedDiskCache2;
        this.f1994b = cacheKeyFactory;
        this.f2001j = aoVar;
    }

    public final DataSource<CloseableReference<CloseableImage>> m1945a(ImageRequest imageRequest, Object obj, ImageRequest.ImageRequest imageRequest2) {
        try {
            ag a;
            ProducerSequenceFactory producerSequenceFactory = this.f1995d;
            Preconditions.m1030a((Object) imageRequest);
            Object obj2 = imageRequest.f2401b;
            Preconditions.m1031a(obj2, (Object) "Uri is null.");
            if (UriUtil.m1122a(obj2)) {
                a = producerSequenceFactory.m1972a();
            } else if (UriUtil.m1123b(obj2)) {
                if (MediaUtils.m1087a(MediaUtils.m1088b(obj2.getPath()))) {
                    a = producerSequenceFactory.m1975c();
                } else {
                    a = producerSequenceFactory.m1974b();
                }
            } else if (UriUtil.m1124c(obj2)) {
                a = producerSequenceFactory.m1976d();
            } else if (UriUtil.m1127f(obj2)) {
                a = producerSequenceFactory.m1978f();
            } else if (UriUtil.m1128g(obj2)) {
                a = producerSequenceFactory.m1977e();
            } else if (UriUtil.m1129h(obj2)) {
                a = producerSequenceFactory.m1979g();
            } else {
                StringBuilder stringBuilder = new StringBuilder("Unsupported uri scheme! Uri is: ");
                String valueOf = String.valueOf(obj2);
                if (valueOf.length() > 30) {
                    valueOf = valueOf.substring(0, 30) + "...";
                }
                throw new IllegalArgumentException(stringBuilder.append(valueOf).toString());
            }
            if (imageRequest.f2410k != null) {
                a = producerSequenceFactory.m1973a(a);
            }
            return m1944a(a, imageRequest, imageRequest2, obj);
        } catch (Throwable e) {
            return DataSources.m1179a(e);
        }
    }

    private <T> DataSource<CloseableReference<T>> m1944a(ag<CloseableReference<T>> agVar, ImageRequest imageRequest, ImageRequest.ImageRequest imageRequest2, Object obj) {
        Object obj2;
        boolean z = false;
        if (imageRequest.f2411l == null) {
            obj2 = this.f1996e;
        } else {
            obj2 = new ForwardingRequestListener(this.f1996e, imageRequest.f2411l);
        }
        try {
            ImageRequest.ImageRequest a = ImageRequest.ImageRequest.m2326a(imageRequest.f2408i, imageRequest2);
            String valueOf = String.valueOf(this.f2002k.getAndIncrement());
            if (imageRequest.f2402c || !UriUtil.m1122a(imageRequest.f2401b)) {
                z = true;
            }
            return new CloseableProducerToDataSourceAdapter(agVar, new al(imageRequest, valueOf, obj2, obj, a, z, imageRequest.f2407h), obj2);
        } catch (Throwable e) {
            return DataSources.m1179a(e);
        }
    }
}
