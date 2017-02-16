package com.facebook.imagepipeline.p044k;

import com.facebook.imagepipeline.p047h.EncodedImage;

/* renamed from: com.facebook.imagepipeline.k.a */
public final class AddImageTransformMetaDataProducer implements ag<EncodedImage> {
    private final ag<EncodedImage> f2164a;

    /* renamed from: com.facebook.imagepipeline.k.a.a */
    private static class AddImageTransformMetaDataProducer extends DelegatingConsumer<EncodedImage, EncodedImage> {
        protected final /* synthetic */ void m2093a(Object obj, boolean z) {
            EncodedImage encodedImage = (EncodedImage) obj;
            if (encodedImage == null) {
                this.f2163e.m1982b(null, z);
                return;
            }
            if (!EncodedImage.m2027c(encodedImage)) {
                encodedImage.m2035c();
            }
            this.f2163e.m1982b(encodedImage, z);
        }

        private AddImageTransformMetaDataProducer(Consumer<EncodedImage> consumer) {
            super(consumer);
        }
    }

    public AddImageTransformMetaDataProducer(ag<EncodedImage> agVar) {
        this.f2164a = agVar;
    }

    public final void m2095a(Consumer<EncodedImage> consumer, ah ahVar) {
        this.f2164a.m2094a(new AddImageTransformMetaDataProducer((byte) 0), ahVar);
    }
}
