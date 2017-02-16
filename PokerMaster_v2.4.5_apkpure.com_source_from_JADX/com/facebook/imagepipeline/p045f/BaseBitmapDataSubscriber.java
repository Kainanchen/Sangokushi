package com.facebook.imagepipeline.p045f;

import com.facebook.common.p017h.CloseableReference;
import com.facebook.imagepipeline.p047h.CloseableBitmap;
import com.facebook.imagepipeline.p047h.CloseableImage;
import com.facebook.p023d.BaseDataSubscriber;
import com.facebook.p023d.DataSource;

/* renamed from: com.facebook.imagepipeline.f.b */
public abstract class BaseBitmapDataSubscriber extends BaseDataSubscriber<CloseableReference<CloseableImage>> {
    public abstract void m2001a();

    public final void m2002d(DataSource<CloseableReference<CloseableImage>> dataSource) {
        if (dataSource.m1145b()) {
            CloseableReference closeableReference = (CloseableReference) dataSource.m1147d();
            if (closeableReference != null && (closeableReference.m1099a() instanceof CloseableBitmap)) {
                ((CloseableBitmap) closeableReference.m1099a()).m2020a();
            }
            try {
                m2001a();
            } finally {
                CloseableReference.m1097c(closeableReference);
            }
        }
    }
}
