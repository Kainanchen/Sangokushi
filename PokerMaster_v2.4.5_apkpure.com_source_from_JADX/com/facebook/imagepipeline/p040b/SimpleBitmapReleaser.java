package com.facebook.imagepipeline.p040b;

import android.graphics.Bitmap;
import com.facebook.common.p017h.ResourceReleaser;

/* renamed from: com.facebook.imagepipeline.b.f */
public final class SimpleBitmapReleaser implements ResourceReleaser<Bitmap> {
    public static SimpleBitmapReleaser f1904a;

    public final /* synthetic */ void m1864a(Object obj) {
        ((Bitmap) obj).recycle();
    }
}
