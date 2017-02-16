package com.facebook.imagepipeline.p044k;

import com.facebook.common.p011d.Preconditions;
import com.facebook.common.p017h.CloseableReference;
import com.facebook.common.p021l.TriState;
import com.facebook.imagepipeline.memory.PooledByteBufferFactory;
import com.facebook.imagepipeline.memory.PooledByteBufferOutputStream;
import com.facebook.imagepipeline.nativecode.WebpTranscoder;
import com.facebook.imagepipeline.nativecode.WebpTranscoderFactory;
import com.facebook.imagepipeline.p047h.EncodedImage;
import com.facebook.p034f.DefaultImageFormats;
import com.facebook.p034f.ImageFormat;
import com.facebook.p034f.ImageFormatChecker;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* compiled from: WebpTranscodeProducer */
/* renamed from: com.facebook.imagepipeline.k.at */
public final class at implements ag<EncodedImage> {
    final Executor f2271a;
    final PooledByteBufferFactory f2272b;
    final int f2273c;
    private final ag<EncodedImage> f2274d;

    /* renamed from: com.facebook.imagepipeline.k.at.1 */
    class WebpTranscodeProducer extends am<EncodedImage> {
        final /* synthetic */ EncodedImage f2266b;
        final /* synthetic */ at f2267c;

        WebpTranscodeProducer(at atVar, Consumer consumer, aj ajVar, String str, String str2, EncodedImage encodedImage) {
            this.f2267c = atVar;
            this.f2266b = encodedImage;
            super(consumer, ajVar, str, str2);
        }

        protected final /* synthetic */ void m2226a(Object obj) {
            obj = (EncodedImage) obj;
            EncodedImage.m2029d(this.f2266b);
            super.m2097a(obj);
        }

        protected final /* synthetic */ void m2228b(Object obj) {
            EncodedImage.m2029d((EncodedImage) obj);
        }

        protected final /* synthetic */ Object m2229c() {
            return m2224d();
        }

        private EncodedImage m2224d() {
            PooledByteBufferOutputStream a = this.f2267c.f2272b.m2406a();
            CloseableReference a2;
            try {
                EncodedImage encodedImage = this.f2266b;
                int i = this.f2267c.f2273c;
                ImageFormat a3 = ImageFormatChecker.m1454a(encodedImage.m2032a());
                if (a3 == DefaultImageFormats.f1510e || a3 == DefaultImageFormats.f1512g) {
                    if (i == 0) {
                        WebpTranscoderFactory.m2435a();
                    }
                } else if (a3 == DefaultImageFormats.f1511f || a3 == DefaultImageFormats.f1513h) {
                    WebpTranscoderFactory.m2435a();
                } else {
                    throw new IllegalArgumentException("Wrong image format");
                }
                a2 = CloseableReference.m1093a(a.m2416c());
                encodedImage = new EncodedImage(a2);
                encodedImage.m2034b(this.f2266b);
                CloseableReference.m1097c(a2);
                a.close();
                return encodedImage;
            } catch (Throwable th) {
                a.close();
            }
        }

        protected final void m2225a(Exception exception) {
            EncodedImage.m2029d(this.f2266b);
            super.m2096a(exception);
        }

        protected final void m2227b() {
            EncodedImage.m2029d(this.f2266b);
            super.m2098b();
        }
    }

    /* renamed from: com.facebook.imagepipeline.k.at.a */
    private class WebpTranscodeProducer extends DelegatingConsumer<EncodedImage, EncodedImage> {
        final /* synthetic */ at f2268a;
        private final ah f2269b;
        private TriState f2270c;

        protected final /* synthetic */ void m2230a(@Nullable Object obj, boolean z) {
            obj = (EncodedImage) obj;
            if (this.f2270c == TriState.UNSET && obj != null) {
                TriState a;
                Preconditions.m1030a(obj);
                ImageFormat a2 = ImageFormatChecker.m1454a(obj.m2032a());
                if (DefaultImageFormats.m1448b(a2)) {
                    WebpTranscoder a3 = WebpTranscoderFactory.m2435a();
                    if (a3 != null) {
                        a = TriState.m1120a(!a3.m2434a());
                    }
                    a = TriState.NO;
                } else {
                    if (a2 == ImageFormat.f1518a) {
                        a = TriState.UNSET;
                    }
                    a = TriState.NO;
                }
                this.f2270c = a;
            }
            if (this.f2270c != TriState.NO) {
                if (!z) {
                    return;
                }
                if (this.f2270c == TriState.YES && obj != null) {
                    at atVar = this.f2268a;
                    Consumer consumer = this.f2163e;
                    ah ahVar = this.f2269b;
                    Preconditions.m1030a(obj);
                    atVar.f2271a.execute(new WebpTranscodeProducer(atVar, consumer, ahVar.m2173c(), "WebpTranscodeProducer", ahVar.m2172b(), EncodedImage.m2026a(obj)));
                    return;
                }
            }
            this.f2163e.m1982b(obj, z);
        }

        public WebpTranscodeProducer(at atVar, Consumer<EncodedImage> consumer, ah ahVar) {
            this.f2268a = atVar;
            super(consumer);
            this.f2269b = ahVar;
            this.f2270c = TriState.UNSET;
        }
    }

    public at(Executor executor, PooledByteBufferFactory pooledByteBufferFactory, ag<EncodedImage> agVar, int i) {
        this.f2271a = (Executor) Preconditions.m1030a((Object) executor);
        this.f2272b = (PooledByteBufferFactory) Preconditions.m1030a((Object) pooledByteBufferFactory);
        this.f2274d = (ag) Preconditions.m1030a((Object) agVar);
        this.f2273c = i;
    }

    public final void m2231a(Consumer<EncodedImage> consumer, ah ahVar) {
        this.f2274d.m2094a(new WebpTranscodeProducer(this, consumer, ahVar), ahVar);
    }
}
