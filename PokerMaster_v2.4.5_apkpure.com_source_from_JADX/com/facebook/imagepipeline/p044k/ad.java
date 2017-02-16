package com.facebook.imagepipeline.p044k;

import com.facebook.imagepipeline.p047h.EncodedImage;
import java.io.InputStream;

/* compiled from: NetworkFetcher */
/* renamed from: com.facebook.imagepipeline.k.ad */
public interface ad<FETCH_STATE extends FetchState> {

    /* renamed from: com.facebook.imagepipeline.k.ad.a */
    public interface NetworkFetcher {
        void m2138a();

        void m2139a(InputStream inputStream);

        void m2140a(Throwable th);
    }

    FETCH_STATE m2146a(Consumer<EncodedImage> consumer, ah ahVar);

    void m2147a(FETCH_STATE fetch_state, NetworkFetcher networkFetcher);
}
