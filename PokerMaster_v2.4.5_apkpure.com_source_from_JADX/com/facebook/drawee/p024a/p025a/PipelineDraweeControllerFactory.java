package com.facebook.drawee.p024a.p025a;

import android.content.res.Resources;
import com.facebook.common.p011d.ImmutableList;
import com.facebook.drawee.p026b.DeferredReleaser;
import com.facebook.imagepipeline.p038a.p039a.AnimatedDrawableFactory;
import com.facebook.imagepipeline.p041c.MemoryCache;
import com.facebook.imagepipeline.p047h.CloseableImage;
import com.facebook.p007c.p008a.CacheKey;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* renamed from: com.facebook.drawee.a.a.f */
public final class PipelineDraweeControllerFactory {
    Resources f1268a;
    DeferredReleaser f1269b;
    AnimatedDrawableFactory f1270c;
    Executor f1271d;
    MemoryCache<CacheKey, CloseableImage> f1272e;
    @Nullable
    ImmutableList<DrawableFactory> f1273f;

    public PipelineDraweeControllerFactory(Resources resources, DeferredReleaser deferredReleaser, AnimatedDrawableFactory animatedDrawableFactory, Executor executor, MemoryCache<CacheKey, CloseableImage> memoryCache, @Nullable ImmutableList<DrawableFactory> immutableList) {
        this.f1268a = resources;
        this.f1269b = deferredReleaser;
        this.f1270c = animatedDrawableFactory;
        this.f1271d = executor;
        this.f1272e = memoryCache;
        this.f1273f = null;
    }
}
