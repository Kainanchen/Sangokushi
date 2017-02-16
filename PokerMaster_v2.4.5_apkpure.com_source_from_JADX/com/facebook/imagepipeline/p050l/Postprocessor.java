package com.facebook.imagepipeline.p050l;

import android.graphics.Bitmap;
import com.facebook.common.p017h.CloseableReference;
import com.facebook.p007c.p008a.CacheKey;
import javax.annotation.Nullable;

/* renamed from: com.facebook.imagepipeline.l.c */
public interface Postprocessor {
    CloseableReference<Bitmap> m2332a();

    String m2333b();

    @Nullable
    CacheKey m2334c();
}
