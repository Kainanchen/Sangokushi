package com.facebook.imagepipeline.p047h;

import android.graphics.Bitmap;
import com.facebook.common.p011d.Preconditions;
import com.facebook.common.p017h.CloseableReference;
import com.facebook.common.p017h.ResourceReleaser;
import com.facebook.p035g.BitmapUtil;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* renamed from: com.facebook.imagepipeline.h.c */
public final class CloseableStaticBitmap extends CloseableBitmap {
    public volatile Bitmap f2138a;
    public final int f2139b;
    @GuardedBy("this")
    private CloseableReference<Bitmap> f2140c;
    private final QualityInfo f2141d;

    public CloseableStaticBitmap(Bitmap bitmap, ResourceReleaser<Bitmap> resourceReleaser, QualityInfo qualityInfo) {
        this.f2138a = (Bitmap) Preconditions.m1030a((Object) bitmap);
        this.f2140c = CloseableReference.m1094a(this.f2138a, (ResourceReleaser) Preconditions.m1030a((Object) resourceReleaser));
        this.f2141d = qualityInfo;
        this.f2139b = 0;
    }

    public CloseableStaticBitmap(CloseableReference<Bitmap> closeableReference, QualityInfo qualityInfo, int i) {
        this.f2140c = (CloseableReference) Preconditions.m1030a(closeableReference.m1101c());
        this.f2138a = (Bitmap) this.f2140c.m1099a();
        this.f2141d = qualityInfo;
        this.f2139b = i;
    }

    public final void close() {
        CloseableReference e = m2021e();
        if (e != null) {
            e.close();
        }
    }

    private synchronized CloseableReference<Bitmap> m2021e() {
        CloseableReference<Bitmap> closeableReference;
        closeableReference = this.f2140c;
        this.f2140c = null;
        this.f2138a = null;
        return closeableReference;
    }

    public final synchronized boolean m2024c() {
        return this.f2140c == null;
    }

    public final Bitmap m2022a() {
        return this.f2138a;
    }

    public final int m2023b() {
        return BitmapUtil.m1463a(this.f2138a);
    }

    public final QualityInfo m2025d() {
        return this.f2141d;
    }
}
