package com.facebook.imagepipeline.p044k;

import com.facebook.common.p011d.Preconditions;
import com.facebook.imagepipeline.p042d.ResizeOptions;
import com.facebook.imagepipeline.p047h.EncodedImage;

/* compiled from: ThumbnailBranchProducer */
/* renamed from: com.facebook.imagepipeline.k.aq */
public final class aq implements ag<EncodedImage> {
    private final ar<EncodedImage>[] f2265a;

    /* renamed from: com.facebook.imagepipeline.k.aq.a */
    private class ThumbnailBranchProducer extends DelegatingConsumer<EncodedImage, EncodedImage> {
        final /* synthetic */ aq f2261a;
        private final ah f2262b;
        private final int f2263c;
        private final ResizeOptions f2264d;

        protected final /* synthetic */ void m2217a(Object obj, boolean z) {
            EncodedImage encodedImage = (EncodedImage) obj;
            if (encodedImage != null && (!z || as.m2223a(encodedImage, this.f2264d))) {
                this.f2163e.m1982b(encodedImage, z);
            } else if (z) {
                EncodedImage.m2029d(encodedImage);
                if (!this.f2261a.m2220a(this.f2263c + 1, this.f2163e, this.f2262b)) {
                    this.f2163e.m1982b(null, true);
                }
            }
        }

        public ThumbnailBranchProducer(aq aqVar, Consumer<EncodedImage> consumer, ah ahVar, int i) {
            this.f2261a = aqVar;
            super(consumer);
            this.f2262b = ahVar;
            this.f2263c = i;
            this.f2264d = this.f2262b.m2170a().f2405f;
        }

        protected final void m2218a(Throwable th) {
            if (!this.f2261a.m2220a(this.f2263c + 1, this.f2163e, this.f2262b)) {
                this.f2163e.m1983b(th);
            }
        }
    }

    public aq(ar<EncodedImage>... arVarArr) {
        this.f2265a = (ar[]) Preconditions.m1030a((Object) arVarArr);
        int length = this.f2265a.length;
        String str = "index";
        if (length > 0) {
            return;
        }
        if (length < 0) {
            throw new IllegalArgumentException("negative size: " + length);
        }
        throw new IndexOutOfBoundsException(Preconditions.m1032a("%s (%s) must be less than size (%s)", str, Integer.valueOf(0), Integer.valueOf(length)));
    }

    public final void m2219a(Consumer<EncodedImage> consumer, ah ahVar) {
        if (ahVar.m2170a().f2405f == null) {
            consumer.m1982b(null, true);
        } else if (!m2220a(0, consumer, ahVar)) {
            consumer.m1982b(null, true);
        }
    }

    final boolean m2220a(int i, Consumer<EncodedImage> consumer, ah ahVar) {
        ResizeOptions resizeOptions = ahVar.m2170a().f2405f;
        while (i < this.f2265a.length) {
            if (this.f2265a[i].m2221a(resizeOptions)) {
                break;
            }
            i++;
        }
        i = -1;
        if (i == -1) {
            return false;
        }
        this.f2265a[i].m2094a(new ThumbnailBranchProducer(this, consumer, ahVar, i), ahVar);
        return true;
    }
}
