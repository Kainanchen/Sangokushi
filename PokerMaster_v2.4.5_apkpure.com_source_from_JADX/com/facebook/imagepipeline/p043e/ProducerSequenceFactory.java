package com.facebook.imagepipeline.p043e;

import android.os.Build.VERSION;
import com.facebook.common.p017h.CloseableReference;
import com.facebook.imagepipeline.p044k.BitmapMemoryCacheGetProducer;
import com.facebook.imagepipeline.p044k.BitmapMemoryCacheKeyMultiplexProducer;
import com.facebook.imagepipeline.p044k.BitmapMemoryCacheProducer;
import com.facebook.imagepipeline.p044k.BranchOnSeparateImagesProducer;
import com.facebook.imagepipeline.p044k.DataFetchProducer;
import com.facebook.imagepipeline.p044k.DecodeProducer;
import com.facebook.imagepipeline.p044k.DiskCacheProducer;
import com.facebook.imagepipeline.p044k.EncodedCacheKeyMultiplexProducer;
import com.facebook.imagepipeline.p044k.EncodedMemoryCacheProducer;
import com.facebook.imagepipeline.p044k.LocalAssetFetchProducer;
import com.facebook.imagepipeline.p044k.LocalContentUriFetchProducer;
import com.facebook.imagepipeline.p044k.LocalContentUriThumbnailFetchProducer;
import com.facebook.imagepipeline.p044k.LocalFileFetchProducer;
import com.facebook.imagepipeline.p044k.LocalResourceFetchProducer;
import com.facebook.imagepipeline.p044k.aa;
import com.facebook.imagepipeline.p044k.ac;
import com.facebook.imagepipeline.p044k.ad;
import com.facebook.imagepipeline.p044k.ae;
import com.facebook.imagepipeline.p044k.af;
import com.facebook.imagepipeline.p044k.ag;
import com.facebook.imagepipeline.p044k.an;
import com.facebook.imagepipeline.p044k.ao;
import com.facebook.imagepipeline.p044k.ap;
import com.facebook.imagepipeline.p044k.aq;
import com.facebook.imagepipeline.p044k.ar;
import com.facebook.imagepipeline.p047h.CloseableImage;
import com.facebook.imagepipeline.p047h.EncodedImage;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.imagepipeline.e.m */
public final class ProducerSequenceFactory {
    ag<CloseableReference<CloseableImage>> f2107a;
    ag<CloseableReference<CloseableImage>> f2108b;
    ag<CloseableReference<CloseableImage>> f2109c;
    ag<CloseableReference<CloseableImage>> f2110d;
    ag<CloseableReference<CloseableImage>> f2111e;
    ag<CloseableReference<CloseableImage>> f2112f;
    ag<CloseableReference<CloseableImage>> f2113g;
    Map<ag<CloseableReference<CloseableImage>>, ag<CloseableReference<CloseableImage>>> f2114h;
    Map<ag<CloseableReference<CloseableImage>>, ag<Void>> f2115i;
    private final ProducerFactory f2116j;
    private final ad f2117k;
    private final boolean f2118l;
    private final boolean f2119m;
    private final ao f2120n;
    private final int f2121o;
    private ag<EncodedImage> f2122p;

    public ProducerSequenceFactory(ProducerFactory producerFactory, ad adVar, boolean z, boolean z2, ao aoVar, int i) {
        this.f2116j = producerFactory;
        this.f2117k = adVar;
        this.f2118l = z;
        this.f2119m = z2;
        this.f2114h = new HashMap();
        this.f2115i = new HashMap();
        this.f2120n = aoVar;
        this.f2121o = i;
    }

    final synchronized ag<CloseableReference<CloseableImage>> m1972a() {
        if (this.f2107a == null) {
            this.f2107a = m1968c(m1971h());
        }
        return this.f2107a;
    }

    private synchronized ag<EncodedImage> m1971h() {
        if (this.f2122p == null) {
            ProducerFactory producerFactory = this.f2116j;
            this.f2122p = ProducerFactory.m1962a(m1969d(new ac(producerFactory.f2098k, producerFactory.f2091d, this.f2117k)));
            this.f2122p = this.f2116j.m1963a(this.f2122p, this.f2118l);
        }
        return this.f2122p;
    }

    final synchronized ag<CloseableReference<CloseableImage>> m1974b() {
        if (this.f2108b == null) {
            ProducerFactory producerFactory = this.f2116j;
            this.f2108b = m1967b(new LocalFileFetchProducer(producerFactory.f2097j.m1930a(), producerFactory.f2098k, producerFactory.f2096i));
        }
        return this.f2108b;
    }

    final synchronized ag<CloseableReference<CloseableImage>> m1975c() {
        if (this.f2109c == null) {
            this.f2109c = m1970e(new aa(this.f2116j.f2097j.m1930a()));
        }
        return this.f2109c;
    }

    final synchronized ag<CloseableReference<CloseableImage>> m1976d() {
        if (this.f2110d == null) {
            ProducerFactory producerFactory = this.f2116j;
            ag localContentUriFetchProducer = new LocalContentUriFetchProducer(producerFactory.f2097j.m1930a(), producerFactory.f2098k, producerFactory.f2088a, producerFactory.f2096i);
            r0 = new ar[2];
            ProducerFactory producerFactory2 = this.f2116j;
            r0[0] = new LocalContentUriThumbnailFetchProducer(producerFactory2.f2097j.m1930a(), producerFactory2.f2098k, producerFactory2.f2088a, producerFactory2.f2096i);
            r0[1] = this.f2116j.m1964a();
            this.f2110d = m1966a(localContentUriFetchProducer, r0);
        }
        return this.f2110d;
    }

    final synchronized ag<CloseableReference<CloseableImage>> m1977e() {
        if (this.f2111e == null) {
            ProducerFactory producerFactory = this.f2116j;
            this.f2111e = m1967b(new LocalResourceFetchProducer(producerFactory.f2097j.m1930a(), producerFactory.f2098k, producerFactory.f2089b, producerFactory.f2096i));
        }
        return this.f2111e;
    }

    final synchronized ag<CloseableReference<CloseableImage>> m1978f() {
        if (this.f2112f == null) {
            ProducerFactory producerFactory = this.f2116j;
            this.f2112f = m1967b(new LocalAssetFetchProducer(producerFactory.f2097j.m1930a(), producerFactory.f2098k, producerFactory.f2090c, producerFactory.f2096i));
        }
        return this.f2112f;
    }

    final synchronized ag<CloseableReference<CloseableImage>> m1979g() {
        if (this.f2113g == null) {
            ProducerFactory producerFactory = this.f2116j;
            ag dataFetchProducer = new DataFetchProducer(producerFactory.f2098k, producerFactory.f2096i);
            if (VERSION.SDK_INT < 18 && !this.f2119m) {
                dataFetchProducer = this.f2116j.m1965b(dataFetchProducer);
            }
            this.f2113g = m1968c(this.f2116j.m1963a(ProducerFactory.m1962a(dataFetchProducer), true));
        }
        return this.f2113g;
    }

    private ag<CloseableReference<CloseableImage>> m1967b(ag<EncodedImage> agVar) {
        return m1966a(agVar, new ar[]{this.f2116j.m1964a()});
    }

    private ag<CloseableReference<CloseableImage>> m1966a(ag<EncodedImage> agVar, ar<EncodedImage>[] arVarArr) {
        return m1968c(new BranchOnSeparateImagesProducer(this.f2116j.m1963a(new aq(arVarArr), true), new ap(this.f2121o, this.f2116j.f2097j.m1934e(), this.f2116j.m1963a(ProducerFactory.m1962a(m1969d(agVar)), true))));
    }

    private ag<CloseableReference<CloseableImage>> m1968c(ag<EncodedImage> agVar) {
        ProducerFactory producerFactory = this.f2116j;
        return m1970e(new DecodeProducer(producerFactory.f2091d, producerFactory.f2097j.m1932c(), producerFactory.f2092e, producerFactory.f2093f, producerFactory.f2094g, producerFactory.f2095h, agVar));
    }

    private ag<EncodedImage> m1969d(ag<EncodedImage> agVar) {
        ag b;
        if (VERSION.SDK_INT >= 18 || this.f2119m) {
            ag<EncodedImage> agVar2 = agVar;
        } else {
            b = this.f2116j.m1965b(agVar);
        }
        ProducerFactory producerFactory = this.f2116j;
        ag diskCacheProducer = new DiskCacheProducer(producerFactory.f2099l, producerFactory.f2100m, producerFactory.f2103p, b, producerFactory.f2104q);
        ProducerFactory producerFactory2 = this.f2116j;
        return new EncodedCacheKeyMultiplexProducer(this.f2116j.f2103p, new EncodedMemoryCacheProducer(producerFactory2.f2101n, producerFactory2.f2103p, diskCacheProducer));
    }

    private ag<CloseableReference<CloseableImage>> m1970e(ag<CloseableReference<CloseableImage>> agVar) {
        ProducerFactory producerFactory = this.f2116j;
        ag anVar = new an(new BitmapMemoryCacheKeyMultiplexProducer(this.f2116j.f2103p, new BitmapMemoryCacheProducer(producerFactory.f2102o, producerFactory.f2103p, agVar)), this.f2120n);
        producerFactory = this.f2116j;
        return new BitmapMemoryCacheGetProducer(producerFactory.f2102o, producerFactory.f2103p, anVar);
    }

    final synchronized ag<CloseableReference<CloseableImage>> m1973a(ag<CloseableReference<CloseableImage>> agVar) {
        if (!this.f2114h.containsKey(agVar)) {
            ProducerFactory producerFactory = this.f2116j;
            ag afVar = new af(agVar, producerFactory.f2105r, producerFactory.f2097j.m1933d());
            producerFactory = this.f2116j;
            this.f2114h.put(agVar, new ae(producerFactory.f2102o, producerFactory.f2103p, afVar));
        }
        return (ag) this.f2114h.get(agVar);
    }
}
