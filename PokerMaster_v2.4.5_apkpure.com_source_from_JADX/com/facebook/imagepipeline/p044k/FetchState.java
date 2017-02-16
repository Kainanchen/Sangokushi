package com.facebook.imagepipeline.p044k;

import com.facebook.imagepipeline.p047h.EncodedImage;

/* renamed from: com.facebook.imagepipeline.k.q */
public final class FetchState {
    final Consumer<EncodedImage> f2339a;
    final ah f2340b;
    long f2341c;

    public FetchState(Consumer<EncodedImage> consumer, ah ahVar) {
        this.f2339a = consumer;
        this.f2340b = ahVar;
        this.f2341c = 0;
    }

    public final String m2281a() {
        return this.f2340b.m2172b();
    }

    public final aj m2282b() {
        return this.f2340b.m2173c();
    }
}
