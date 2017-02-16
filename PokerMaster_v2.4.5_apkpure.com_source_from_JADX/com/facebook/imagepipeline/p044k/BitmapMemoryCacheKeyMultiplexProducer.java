package com.facebook.imagepipeline.p044k;

import android.util.Pair;
import com.facebook.common.p017h.CloseableReference;
import com.facebook.imagepipeline.p041c.CacheKeyFactory;
import com.facebook.imagepipeline.p047h.CloseableImage;
import com.facebook.imagepipeline.p050l.ImageRequest.ImageRequest;
import com.facebook.p007c.p008a.CacheKey;
import java.io.Closeable;

/* renamed from: com.facebook.imagepipeline.k.g */
public final class BitmapMemoryCacheKeyMultiplexProducer extends ab<Pair<CacheKey, ImageRequest>, CloseableReference<CloseableImage>> {
    private final CacheKeyFactory f2278c;

    public final /* synthetic */ Closeable m2237a(Closeable closeable) {
        return CloseableReference.m1096b((CloseableReference) closeable);
    }

    public BitmapMemoryCacheKeyMultiplexProducer(CacheKeyFactory cacheKeyFactory, ag agVar) {
        super(agVar);
        this.f2278c = cacheKeyFactory;
    }

    protected final /* synthetic */ Object m2238a(ah ahVar) {
        return Pair.create(this.f2278c.m1880a(ahVar.m2170a(), ahVar.m2174d()), ahVar.m2175e());
    }
}
