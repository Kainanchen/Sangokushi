package com.facebook.imagepipeline.p044k;

import android.util.Pair;
import com.facebook.imagepipeline.p041c.CacheKeyFactory;
import com.facebook.imagepipeline.p047h.EncodedImage;
import com.facebook.imagepipeline.p050l.ImageRequest.ImageRequest;
import com.facebook.p007c.p008a.CacheKey;

/* renamed from: com.facebook.imagepipeline.k.o */
public final class EncodedCacheKeyMultiplexProducer extends ab<Pair<CacheKey, ImageRequest>, EncodedImage> {
    private final CacheKeyFactory f2333c;

    public EncodedCacheKeyMultiplexProducer(CacheKeyFactory cacheKeyFactory, ag agVar) {
        super(agVar);
        this.f2333c = cacheKeyFactory;
    }

    protected final /* synthetic */ Object m2278a(ah ahVar) {
        return Pair.create(this.f2333c.m1879a(ahVar.m2170a()), ahVar.m2175e());
    }
}
