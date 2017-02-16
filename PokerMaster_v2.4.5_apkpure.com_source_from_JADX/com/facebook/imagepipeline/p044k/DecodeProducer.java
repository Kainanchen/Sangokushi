package com.facebook.imagepipeline.p044k;

import android.graphics.Bitmap;
import com.android.volley.DefaultRetryPolicy;
import com.facebook.common.p011d.ImmutableMap;
import com.facebook.common.p011d.Preconditions;
import com.facebook.common.p014e.FLog;
import com.facebook.common.p017h.CloseableReference;
import com.facebook.common.p021l.UriUtil;
import com.facebook.imagepipeline.memory.ByteArrayPool;
import com.facebook.imagepipeline.p042d.ImageDecodeOptions;
import com.facebook.imagepipeline.p042d.ResizeOptions;
import com.facebook.imagepipeline.p044k.JobScheduler.JobScheduler;
import com.facebook.imagepipeline.p046g.ImageDecoder;
import com.facebook.imagepipeline.p046g.ProgressiveJpegConfig;
import com.facebook.imagepipeline.p046g.ProgressiveJpegParser;
import com.facebook.imagepipeline.p047h.CloseableImage;
import com.facebook.imagepipeline.p047h.CloseableStaticBitmap;
import com.facebook.imagepipeline.p047h.EncodedImage;
import com.facebook.imagepipeline.p047h.ImmutableQualityInfo;
import com.facebook.imagepipeline.p047h.QualityInfo;
import com.facebook.imagepipeline.p050l.ImageRequest;
import com.facebook.p034f.DefaultImageFormats;
import com.facebook.p034f.ImageFormat;
import com.facebook.p034f.ImageFormatChecker;
import java.io.Closeable;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.facebook.imagepipeline.k.l */
public final class DecodeProducer implements ag<CloseableReference<CloseableImage>> {
    final Executor f2304a;
    final ImageDecoder f2305b;
    final boolean f2306c;
    final boolean f2307d;
    private final ByteArrayPool f2308e;
    private final ProgressiveJpegConfig f2309f;
    private final ag<EncodedImage> f2310g;

    /* renamed from: com.facebook.imagepipeline.k.l.c */
    private abstract class DecodeProducer extends DelegatingConsumer<EncodedImage, CloseableReference<CloseableImage>> {
        private final aj f2288a;
        final ah f2289b;
        final JobScheduler f2290c;
        final /* synthetic */ DecodeProducer f2291d;
        private final ImageDecodeOptions f2292f;
        @GuardedBy("this")
        private boolean f2293g;

        /* renamed from: com.facebook.imagepipeline.k.l.c.1 */
        class DecodeProducer implements JobScheduler {
            final /* synthetic */ DecodeProducer f2299a;
            final /* synthetic */ ah f2300b;
            final /* synthetic */ DecodeProducer f2301c;

            DecodeProducer(DecodeProducer decodeProducer, DecodeProducer decodeProducer2, ah ahVar) {
                this.f2301c = decodeProducer;
                this.f2299a = decodeProducer2;
                this.f2300b = ahVar;
            }

            public final void m2268a(EncodedImage encodedImage, boolean z) {
                if (encodedImage != null) {
                    if (this.f2301c.f2291d.f2306c) {
                        ImageRequest a = this.f2300b.m2170a();
                        if (this.f2301c.f2291d.f2307d || !UriUtil.m1122a(a.f2401b)) {
                            int i;
                            if (EncodedImage.m2027c(encodedImage)) {
                                float f;
                                int i2;
                                Preconditions.m1033a(EncodedImage.m2027c(encodedImage));
                                ResizeOptions resizeOptions = a.f2405f;
                                if (resizeOptions == null || resizeOptions.f1982b <= 0 || resizeOptions.f1981a <= 0 || encodedImage.f2146e == 0 || encodedImage.f2147f == 0) {
                                    f = DefaultRetryPolicy.DEFAULT_BACKOFF_MULT;
                                } else {
                                    Object obj;
                                    int i3;
                                    if (a.f2406g.m1929a()) {
                                        i2 = encodedImage.f2145d;
                                        boolean z2 = i2 == 0 || i2 == 90 || i2 == 180 || i2 == 270;
                                        Preconditions.m1033a(z2);
                                        i = i2;
                                    } else {
                                        i = 0;
                                    }
                                    if (i == 90 || i == 270) {
                                        obj = 1;
                                    } else {
                                        obj = null;
                                    }
                                    if (obj != null) {
                                        i3 = encodedImage.f2147f;
                                    } else {
                                        i3 = encodedImage.f2146e;
                                    }
                                    if (obj != null) {
                                        i = encodedImage.f2146e;
                                    } else {
                                        i = encodedImage.f2147f;
                                    }
                                    FLog.m1050a("DownsampleUtil", "Downsample - Specified size: %dx%d, image size: %dx%d ratio: %.1f x %.1f, ratio: %.3f for %s", Integer.valueOf(resizeOptions.f1981a), Integer.valueOf(resizeOptions.f1982b), Integer.valueOf(i3), Integer.valueOf(i), Float.valueOf(((float) resizeOptions.f1981a) / ((float) i3)), Float.valueOf(((float) resizeOptions.f1982b) / ((float) i)), Float.valueOf(Math.max(((float) resizeOptions.f1981a) / ((float) i3), ((float) resizeOptions.f1982b) / ((float) i))), a.f2401b.toString());
                                    f = r1;
                                }
                                if (encodedImage.f2144c == DefaultImageFormats.f1506a) {
                                    if (f > 0.6666667f) {
                                        i = 1;
                                    } else {
                                        i2 = 2;
                                        while (true) {
                                            if (((1.0d / ((double) (i2 * 2))) * 0.3333333432674408d) + (1.0d / ((double) (i2 * 2))) <= ((double) f)) {
                                                break;
                                            }
                                            i2 *= 2;
                                        }
                                        i = i2;
                                    }
                                } else if (f > 0.6666667f) {
                                    i = 1;
                                } else {
                                    i2 = 2;
                                    while (true) {
                                        if (((1.0d / (Math.pow((double) i2, 2.0d) - ((double) i2))) * 0.3333333432674408d) + (1.0d / ((double) i2)) <= ((double) f)) {
                                            break;
                                        }
                                        i2++;
                                    }
                                    i = i2 - 1;
                                }
                                i2 = Math.max(encodedImage.f2147f, encodedImage.f2146e);
                                while (((float) (i2 / i)) > 2048.0f) {
                                    if (encodedImage.f2144c == DefaultImageFormats.f1506a) {
                                        i *= 2;
                                    } else {
                                        i++;
                                    }
                                }
                            } else {
                                i = 1;
                            }
                            encodedImage.f2148g = i;
                        }
                    }
                    DecodeProducer.m2251a(this.f2301c, encodedImage, z);
                }
            }
        }

        /* renamed from: com.facebook.imagepipeline.k.l.c.2 */
        class DecodeProducer extends BaseProducerContextCallbacks {
            final /* synthetic */ DecodeProducer f2302a;
            final /* synthetic */ DecodeProducer f2303b;

            DecodeProducer(DecodeProducer decodeProducer, DecodeProducer decodeProducer2) {
                this.f2303b = decodeProducer;
                this.f2302a = decodeProducer2;
            }

            public final void m2269c() {
                if (this.f2303b.f2289b.m2178h()) {
                    this.f2303b.f2290c.m2292b();
                }
            }
        }

        protected abstract int m2255a(EncodedImage encodedImage);

        protected abstract QualityInfo m2261c();

        public final /* synthetic */ void m2258a(Object obj, boolean z) {
            EncodedImage encodedImage = (EncodedImage) obj;
            if (z && !EncodedImage.m2031e(encodedImage)) {
                m2253c(new NullPointerException("Encoded image is not valid."));
            } else if (!m2260a(encodedImage, z)) {
            } else {
                if (z || this.f2289b.m2178h()) {
                    this.f2290c.m2292b();
                }
            }
        }

        public DecodeProducer(DecodeProducer decodeProducer, Consumer<CloseableReference<CloseableImage>> consumer, ah ahVar) {
            this.f2291d = decodeProducer;
            super(consumer);
            this.f2289b = ahVar;
            this.f2288a = ahVar.m2173c();
            this.f2292f = ahVar.m2170a().f2404e;
            this.f2293g = false;
            this.f2290c = new JobScheduler(decodeProducer.f2304a, new DecodeProducer(this, decodeProducer, ahVar), this.f2292f.f1967a);
            this.f2289b.m2171a(new DecodeProducer(this, decodeProducer));
        }

        protected final void m2257a(float f) {
            super.m2091a(0.99f * f);
        }

        public final void m2259a(Throwable th) {
            m2253c(th);
        }

        protected boolean m2260a(EncodedImage encodedImage, boolean z) {
            return this.f2290c.m2291a(encodedImage, z);
        }

        private Map<String, String> m2250a(@Nullable CloseableImage closeableImage, long j, QualityInfo qualityInfo, boolean z) {
            if (!this.f2288a.m2048b(this.f2289b.m2172b())) {
                return null;
            }
            String valueOf = String.valueOf(j);
            String valueOf2 = String.valueOf(qualityInfo.m2037b());
            String valueOf3 = String.valueOf(z);
            String valueOf4 = String.valueOf(this.f2289b.m2170a().f2400a);
            if (!(closeableImage instanceof CloseableStaticBitmap)) {
                return ImmutableMap.m1024a("queueTime", valueOf, "hasGoodQuality", valueOf2, "isFinal", valueOf3, "imageType", valueOf4);
            }
            Bitmap bitmap = ((CloseableStaticBitmap) closeableImage).f2138a;
            return ImmutableMap.m1025a("bitmapSize", bitmap.getWidth() + "x" + bitmap.getHeight(), "queueTime", valueOf, "hasGoodQuality", valueOf2, "isFinal", valueOf3, "imageType", valueOf4);
        }

        private synchronized boolean m2254d() {
            return this.f2293g;
        }

        private void m2252a(boolean z) {
            synchronized (this) {
                if (z) {
                    if (!this.f2293g) {
                        this.f2163e.m1981b((float) DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
                        this.f2293g = true;
                        this.f2290c.m2290a();
                        return;
                    }
                }
            }
        }

        private void m2253c(Throwable th) {
            m2252a(true);
            this.f2163e.m1983b(th);
        }

        public final void m2256a() {
            m2252a(true);
            this.f2163e.m1980b();
        }

        static /* synthetic */ void m2251a(DecodeProducer decodeProducer, EncodedImage encodedImage, boolean z) {
            long d;
            if (!decodeProducer.m2254d() && EncodedImage.m2031e(encodedImage)) {
                QualityInfo c;
                CloseableReference a;
                try {
                    Closeable a2;
                    d = decodeProducer.f2290c.m2294d();
                    int b = z ? encodedImage.m2033b() : decodeProducer.m2255a(encodedImage);
                    c = z ? ImmutableQualityInfo.f2150a : decodeProducer.m2261c();
                    decodeProducer.f2288a.m2043a(decodeProducer.f2289b.m2172b(), "DecodeProducer");
                    ImageDecoder imageDecoder = decodeProducer.f2291d.f2305b;
                    ImageDecodeOptions imageDecodeOptions = decodeProducer.f2292f;
                    ImageFormat imageFormat = encodedImage.f2144c;
                    if (imageFormat == null || imageFormat == ImageFormat.f1518a) {
                        imageFormat = ImageFormatChecker.m1454a(encodedImage.m2032a());
                        encodedImage.f2144c = imageFormat;
                    }
                    if (imageFormat == DefaultImageFormats.f1506a) {
                        a2 = imageDecoder.m2008a(encodedImage, b, c);
                    } else if (imageFormat == DefaultImageFormats.f1508c) {
                        a2 = imageDecoder.m2006a(encodedImage, imageDecodeOptions);
                    } else if (imageFormat == DefaultImageFormats.f1514i) {
                        a2 = imageDecoder.f2127a.m1862b();
                    } else if (imageFormat == ImageFormat.f1518a) {
                        throw new IllegalArgumentException("unknown image format");
                    } else {
                        a2 = imageDecoder.m2007a(encodedImage);
                    }
                    decodeProducer.f2288a.m2046a(decodeProducer.f2289b.m2172b(), "DecodeProducer", decodeProducer.m2250a(a2, d, c, z));
                    a = CloseableReference.m1093a(a2);
                    decodeProducer.m2252a(z);
                    decodeProducer.f2163e.m1982b(a, z);
                    CloseableReference.m1097c(a);
                    EncodedImage.m2029d(encodedImage);
                } catch (Throwable e) {
                    Throwable th = e;
                    decodeProducer.f2288a.m2045a(decodeProducer.f2289b.m2172b(), "DecodeProducer", th, decodeProducer.m2250a(null, d, c, z));
                    decodeProducer.m2253c(th);
                    EncodedImage.m2029d(encodedImage);
                } catch (Throwable th2) {
                    EncodedImage.m2029d(encodedImage);
                }
            }
        }
    }

    /* renamed from: com.facebook.imagepipeline.k.l.a */
    private class DecodeProducer extends DecodeProducer {
        final /* synthetic */ DecodeProducer f2294a;

        public DecodeProducer(DecodeProducer decodeProducer, Consumer<CloseableReference<CloseableImage>> consumer, ah ahVar) {
            this.f2294a = decodeProducer;
            super(decodeProducer, consumer, ahVar);
        }

        protected final synchronized boolean m2263a(EncodedImage encodedImage, boolean z) {
            boolean a;
            if (z) {
                a = super.m2260a(encodedImage, z);
            } else {
                a = false;
            }
            return a;
        }

        protected final int m2262a(EncodedImage encodedImage) {
            return encodedImage.m2033b();
        }

        protected final QualityInfo m2264c() {
            return ImmutableQualityInfo.m2039a(0, false, false);
        }
    }

    /* renamed from: com.facebook.imagepipeline.k.l.b */
    private class DecodeProducer extends DecodeProducer {
        final /* synthetic */ DecodeProducer f2295a;
        private final ProgressiveJpegParser f2296f;
        private final ProgressiveJpegConfig f2297g;
        private int f2298h;

        public DecodeProducer(DecodeProducer decodeProducer, Consumer<CloseableReference<CloseableImage>> consumer, ah ahVar, ProgressiveJpegParser progressiveJpegParser, ProgressiveJpegConfig progressiveJpegConfig) {
            this.f2295a = decodeProducer;
            super(decodeProducer, consumer, ahVar);
            this.f2296f = (ProgressiveJpegParser) Preconditions.m1030a((Object) progressiveJpegParser);
            this.f2297g = (ProgressiveJpegConfig) Preconditions.m1030a((Object) progressiveJpegConfig);
            this.f2298h = 0;
        }

        protected final synchronized boolean m2266a(EncodedImage encodedImage, boolean z) {
            boolean z2 = false;
            synchronized (this) {
                boolean a = super.m2260a(encodedImage, z);
                if (!z && EncodedImage.m2031e(encodedImage)) {
                    if (this.f2296f.m2012a(encodedImage)) {
                        int i = this.f2296f.f2130a;
                        if (i > this.f2298h && i >= this.f2297g.m2009a(this.f2298h)) {
                            this.f2298h = i;
                        }
                    }
                }
                z2 = a;
            }
            return z2;
        }

        protected final int m2265a(EncodedImage encodedImage) {
            return this.f2296f.f2131b;
        }

        protected final QualityInfo m2267c() {
            return this.f2297g.m2010b(this.f2296f.f2130a);
        }
    }

    public DecodeProducer(ByteArrayPool byteArrayPool, Executor executor, ImageDecoder imageDecoder, ProgressiveJpegConfig progressiveJpegConfig, boolean z, boolean z2, ag<EncodedImage> agVar) {
        this.f2308e = (ByteArrayPool) Preconditions.m1030a((Object) byteArrayPool);
        this.f2304a = (Executor) Preconditions.m1030a((Object) executor);
        this.f2305b = (ImageDecoder) Preconditions.m1030a((Object) imageDecoder);
        this.f2309f = (ProgressiveJpegConfig) Preconditions.m1030a((Object) progressiveJpegConfig);
        this.f2306c = z;
        this.f2307d = z2;
        this.f2310g = (ag) Preconditions.m1030a((Object) agVar);
    }

    public final void m2270a(Consumer<CloseableReference<CloseableImage>> consumer, ah ahVar) {
        Consumer decodeProducer;
        if (UriUtil.m1122a(ahVar.m2170a().f2401b)) {
            decodeProducer = new DecodeProducer(this, consumer, ahVar, new ProgressiveJpegParser(this.f2308e), this.f2309f);
        } else {
            decodeProducer = new DecodeProducer(this, consumer, ahVar);
        }
        this.f2310g.m2094a(decodeProducer, ahVar);
    }
}
