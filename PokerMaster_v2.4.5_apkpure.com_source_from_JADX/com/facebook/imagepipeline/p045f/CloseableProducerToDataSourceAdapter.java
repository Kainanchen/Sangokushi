package com.facebook.imagepipeline.p045f;

import com.facebook.common.p017h.CloseableReference;
import com.facebook.imagepipeline.p044k.ag;
import com.facebook.imagepipeline.p044k.al;
import com.facebook.imagepipeline.p048i.RequestListener;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* renamed from: com.facebook.imagepipeline.f.c */
public final class CloseableProducerToDataSourceAdapter<T> extends AbstractProducerToDataSourceAdapter<CloseableReference<T>> {
    protected final /* synthetic */ void m2003a(Object obj) {
        CloseableReference.m1097c((CloseableReference) obj);
    }

    protected final /* bridge */ /* synthetic */ void m2004b(Object obj, boolean z) {
        super.m1998b(CloseableReference.m1096b((CloseableReference) obj), z);
    }

    public CloseableProducerToDataSourceAdapter(ag<CloseableReference<T>> agVar, al alVar, RequestListener requestListener) {
        super(agVar, alVar, requestListener);
    }

    @Nullable
    public final /* synthetic */ Object m2005d() {
        return CloseableReference.m1096b((CloseableReference) super.m1166d());
    }
}
