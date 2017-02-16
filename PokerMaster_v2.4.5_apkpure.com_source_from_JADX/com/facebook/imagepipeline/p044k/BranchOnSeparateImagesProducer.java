package com.facebook.imagepipeline.p044k;

import com.facebook.imagepipeline.p047h.EncodedImage;
import com.facebook.imagepipeline.p050l.ImageRequest;

/* renamed from: com.facebook.imagepipeline.k.i */
public final class BranchOnSeparateImagesProducer implements ag<EncodedImage> {
    final ag<EncodedImage> f2283a;
    private final ag<EncodedImage> f2284b;

    /* renamed from: com.facebook.imagepipeline.k.i.a */
    private class BranchOnSeparateImagesProducer extends DelegatingConsumer<EncodedImage, EncodedImage> {
        final /* synthetic */ BranchOnSeparateImagesProducer f2281a;
        private ah f2282b;

        protected final /* synthetic */ void m2240a(Object obj, boolean z) {
            EncodedImage encodedImage = (EncodedImage) obj;
            ImageRequest a = this.f2282b.m2170a();
            boolean a2 = as.m2223a(encodedImage, a.f2405f);
            if (encodedImage != null && (a2 || a.f2403d)) {
                Consumer consumer = this.f2163e;
                boolean z2 = z && a2;
                consumer.m1982b(encodedImage, z2);
            }
            if (z && !a2) {
                EncodedImage.m2029d(encodedImage);
                this.f2281a.f2283a.m2094a(this.f2163e, this.f2282b);
            }
        }

        private BranchOnSeparateImagesProducer(BranchOnSeparateImagesProducer branchOnSeparateImagesProducer, Consumer<EncodedImage> consumer, ah ahVar) {
            this.f2281a = branchOnSeparateImagesProducer;
            super(consumer);
            this.f2282b = ahVar;
        }

        protected final void m2241a(Throwable th) {
            this.f2281a.f2283a.m2094a(this.f2163e, this.f2282b);
        }
    }

    public BranchOnSeparateImagesProducer(ag<EncodedImage> agVar, ag<EncodedImage> agVar2) {
        this.f2284b = agVar;
        this.f2283a = agVar2;
    }

    public final void m2242a(Consumer<EncodedImage> consumer, ah ahVar) {
        this.f2284b.m2094a(new BranchOnSeparateImagesProducer(consumer, ahVar, (byte) 0), ahVar);
    }
}
