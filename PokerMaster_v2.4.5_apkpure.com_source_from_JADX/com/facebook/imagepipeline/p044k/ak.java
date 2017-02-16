package com.facebook.imagepipeline.p044k;

import com.android.volley.DefaultRetryPolicy;
import com.facebook.common.p011d.Preconditions;
import com.facebook.imagepipeline.memory.PooledByteBufferFactory;
import com.facebook.imagepipeline.p042d.ResizeOptions;
import com.facebook.imagepipeline.p042d.RotationOptions;
import com.facebook.imagepipeline.p044k.JobScheduler.JobScheduler;
import com.facebook.imagepipeline.p047h.EncodedImage;
import com.facebook.imagepipeline.p050l.ImageRequest;
import com.illuminate.texaspoker.R.R;
import java.util.concurrent.Executor;

/* compiled from: ResizeAndRotateProducer */
/* renamed from: com.facebook.imagepipeline.k.ak */
public final class ak implements ag<EncodedImage> {
    final Executor f2227a;
    final PooledByteBufferFactory f2228b;
    final boolean f2229c;
    private final ag<EncodedImage> f2230d;

    /* renamed from: com.facebook.imagepipeline.k.ak.a */
    private class ResizeAndRotateProducer extends DelegatingConsumer<EncodedImage, EncodedImage> {
        final ah f2223a;
        boolean f2224b;
        final JobScheduler f2225c;
        final /* synthetic */ ak f2226d;

        /* renamed from: com.facebook.imagepipeline.k.ak.a.1 */
        class ResizeAndRotateProducer implements JobScheduler {
            final /* synthetic */ ak f2218a;
            final /* synthetic */ ResizeAndRotateProducer f2219b;

            ResizeAndRotateProducer(ResizeAndRotateProducer resizeAndRotateProducer, ak akVar) {
                this.f2219b = resizeAndRotateProducer;
                this.f2218a = akVar;
            }

            /* JADX WARNING: inconsistent code. */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void m2180a(com.facebook.imagepipeline.p047h.EncodedImage r19, boolean r20) {
                /*
                r18 = this;
                r0 = r18;
                r12 = r0.f2219b;
                r2 = r12.f2223a;
                r2 = r2.m2173c();
                r3 = r12.f2223a;
                r3 = r3.m2172b();
                r4 = "ResizeAndRotateProducer";
                r2.m2043a(r3, r4);
                r2 = r12.f2223a;
                r13 = r2.m2170a();
                r2 = r12.f2226d;
                r2 = r2.f2228b;
                r14 = r2.m2406a();
                r11 = 0;
                r10 = 0;
                r2 = r12.f2226d;	 Catch:{ Exception -> 0x0133, all -> 0x0128 }
                r2 = r2.f2229c;	 Catch:{ Exception -> 0x0133, all -> 0x0128 }
                r0 = r19;
                r15 = com.facebook.imagepipeline.p044k.ak.m2185a(r13, r0, r2);	 Catch:{ Exception -> 0x0133, all -> 0x0128 }
                r2 = r12.f2223a;	 Catch:{ Exception -> 0x0133, all -> 0x0128 }
                r2 = r2.m2173c();	 Catch:{ Exception -> 0x0133, all -> 0x0128 }
                r3 = r12.f2223a;	 Catch:{ Exception -> 0x0133, all -> 0x0128 }
                r3 = r3.m2172b();	 Catch:{ Exception -> 0x0133, all -> 0x0128 }
                r2 = r2.m2048b(r3);	 Catch:{ Exception -> 0x0133, all -> 0x0128 }
                if (r2 != 0) goto L_0x008a;
            L_0x0041:
                r4 = 0;
            L_0x0042:
                r3 = r19.m2032a();	 Catch:{ Exception -> 0x0137, all -> 0x0128 }
                r2 = r13.f2406g;	 Catch:{ Exception -> 0x0109 }
                r0 = r19;
                r2 = com.facebook.imagepipeline.p044k.ak.m2184a(r2, r0);	 Catch:{ Exception -> 0x0109 }
                com.facebook.imagepipeline.nativecode.JpegTranscoder.m2432a(r3, r14, r2, r15);	 Catch:{ Exception -> 0x0109 }
                r2 = r14.m2416c();	 Catch:{ Exception -> 0x0109 }
                r5 = com.facebook.common.p017h.CloseableReference.m1093a(r2);	 Catch:{ Exception -> 0x0109 }
                r6 = new com.facebook.imagepipeline.h.d;	 Catch:{ all -> 0x0104 }
                r6.<init>(r5);	 Catch:{ all -> 0x0104 }
                r2 = com.facebook.p034f.DefaultImageFormats.f1506a;	 Catch:{ all -> 0x0104 }
                r6.f2144c = r2;	 Catch:{ all -> 0x0104 }
                r6.m2035c();	 Catch:{ all -> 0x00ff }
                r2 = r12.f2223a;	 Catch:{ all -> 0x00ff }
                r2 = r2.m2173c();	 Catch:{ all -> 0x00ff }
                r7 = r12.f2223a;	 Catch:{ all -> 0x00ff }
                r7 = r7.m2172b();	 Catch:{ all -> 0x00ff }
                r8 = "ResizeAndRotateProducer";
                r2.m2046a(r7, r8, r4);	 Catch:{ all -> 0x00ff }
                r2 = r12.f2163e;	 Catch:{ all -> 0x00ff }
                r0 = r20;
                r2.m1982b(r6, r0);	 Catch:{ all -> 0x00ff }
                com.facebook.imagepipeline.p047h.EncodedImage.m2029d(r6);	 Catch:{ all -> 0x0104 }
                com.facebook.common.p017h.CloseableReference.m1097c(r5);	 Catch:{ Exception -> 0x0109 }
                com.facebook.common.p011d.Closeables.m1022a(r3);
                r14.close();
            L_0x0089:
                return;
            L_0x008a:
                r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0133, all -> 0x0128 }
                r2.<init>();	 Catch:{ Exception -> 0x0133, all -> 0x0128 }
                r0 = r19;
                r3 = r0.f2146e;	 Catch:{ Exception -> 0x0133, all -> 0x0128 }
                r2 = r2.append(r3);	 Catch:{ Exception -> 0x0133, all -> 0x0128 }
                r3 = "x";
                r2 = r2.append(r3);	 Catch:{ Exception -> 0x0133, all -> 0x0128 }
                r0 = r19;
                r3 = r0.f2147f;	 Catch:{ Exception -> 0x0133, all -> 0x0128 }
                r2 = r2.append(r3);	 Catch:{ Exception -> 0x0133, all -> 0x0128 }
                r3 = r2.toString();	 Catch:{ Exception -> 0x0133, all -> 0x0128 }
                r2 = r13.f2405f;	 Catch:{ Exception -> 0x0133, all -> 0x0128 }
                if (r2 == 0) goto L_0x00f9;
            L_0x00ad:
                r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0133, all -> 0x0128 }
                r2.<init>();	 Catch:{ Exception -> 0x0133, all -> 0x0128 }
                r4 = r13.f2405f;	 Catch:{ Exception -> 0x0133, all -> 0x0128 }
                r4 = r4.f1981a;	 Catch:{ Exception -> 0x0133, all -> 0x0128 }
                r2 = r2.append(r4);	 Catch:{ Exception -> 0x0133, all -> 0x0128 }
                r4 = "x";
                r2 = r2.append(r4);	 Catch:{ Exception -> 0x0133, all -> 0x0128 }
                r4 = r13.f2405f;	 Catch:{ Exception -> 0x0133, all -> 0x0128 }
                r4 = r4.f1982b;	 Catch:{ Exception -> 0x0133, all -> 0x0128 }
                r2 = r2.append(r4);	 Catch:{ Exception -> 0x0133, all -> 0x0128 }
                r5 = r2.toString();	 Catch:{ Exception -> 0x0133, all -> 0x0128 }
            L_0x00cc:
                if (r15 <= 0) goto L_0x00fc;
            L_0x00ce:
                r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0133, all -> 0x0128 }
                r2.<init>();	 Catch:{ Exception -> 0x0133, all -> 0x0128 }
                r2 = r2.append(r15);	 Catch:{ Exception -> 0x0133, all -> 0x0128 }
                r4 = "/8";
                r2 = r2.append(r4);	 Catch:{ Exception -> 0x0133, all -> 0x0128 }
                r7 = r2.toString();	 Catch:{ Exception -> 0x0133, all -> 0x0128 }
            L_0x00e1:
                r2 = "Original size";
                r4 = "Requested size";
                r6 = "Fraction";
                r8 = "queueTime";
                r9 = r12.f2225c;	 Catch:{ Exception -> 0x0133, all -> 0x0128 }
                r16 = r9.m2294d();	 Catch:{ Exception -> 0x0133, all -> 0x0128 }
                r9 = java.lang.String.valueOf(r16);	 Catch:{ Exception -> 0x0133, all -> 0x0128 }
                r4 = com.facebook.common.p011d.ImmutableMap.m1024a(r2, r3, r4, r5, r6, r7, r8, r9);	 Catch:{ Exception -> 0x0133, all -> 0x0128 }
                goto L_0x0042;
            L_0x00f9:
                r5 = "Unspecified";
                goto L_0x00cc;
            L_0x00fc:
                r7 = "";
                goto L_0x00e1;
            L_0x00ff:
                r2 = move-exception;
                com.facebook.imagepipeline.p047h.EncodedImage.m2029d(r6);	 Catch:{ all -> 0x0104 }
                throw r2;	 Catch:{ all -> 0x0104 }
            L_0x0104:
                r2 = move-exception;
                com.facebook.common.p017h.CloseableReference.m1097c(r5);	 Catch:{ Exception -> 0x0109 }
                throw r2;	 Catch:{ Exception -> 0x0109 }
            L_0x0109:
                r2 = move-exception;
            L_0x010a:
                r5 = r12.f2223a;	 Catch:{ all -> 0x0130 }
                r5 = r5.m2173c();	 Catch:{ all -> 0x0130 }
                r6 = r12.f2223a;	 Catch:{ all -> 0x0130 }
                r6 = r6.m2172b();	 Catch:{ all -> 0x0130 }
                r7 = "ResizeAndRotateProducer";
                r5.m2045a(r6, r7, r2, r4);	 Catch:{ all -> 0x0130 }
                r4 = r12.f2163e;	 Catch:{ all -> 0x0130 }
                r4.m1983b(r2);	 Catch:{ all -> 0x0130 }
                com.facebook.common.p011d.Closeables.m1022a(r3);
                r14.close();
                goto L_0x0089;
            L_0x0128:
                r2 = move-exception;
            L_0x0129:
                com.facebook.common.p011d.Closeables.m1022a(r10);
                r14.close();
                throw r2;
            L_0x0130:
                r2 = move-exception;
                r10 = r3;
                goto L_0x0129;
            L_0x0133:
                r2 = move-exception;
                r3 = r10;
                r4 = r11;
                goto L_0x010a;
            L_0x0137:
                r2 = move-exception;
                r3 = r10;
                goto L_0x010a;
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.k.ak.a.1.a(com.facebook.imagepipeline.h.d, boolean):void");
            }
        }

        /* renamed from: com.facebook.imagepipeline.k.ak.a.2 */
        class ResizeAndRotateProducer extends BaseProducerContextCallbacks {
            final /* synthetic */ ak f2220a;
            final /* synthetic */ Consumer f2221b;
            final /* synthetic */ ResizeAndRotateProducer f2222c;

            ResizeAndRotateProducer(ResizeAndRotateProducer resizeAndRotateProducer, ak akVar, Consumer consumer) {
                this.f2222c = resizeAndRotateProducer;
                this.f2220a = akVar;
                this.f2221b = consumer;
            }

            public final void m2182c() {
                if (this.f2222c.f2223a.m2178h()) {
                    this.f2222c.f2225c.m2292b();
                }
            }

            public final void m2181a() {
                this.f2222c.f2225c.m2290a();
                this.f2222c.f2224b = true;
                this.f2221b.m1980b();
            }
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        protected final /* synthetic */ void m2183a(@javax.annotation.Nullable java.lang.Object r7, boolean r8) {
            /*
            r6 = this;
            r0 = 0;
            r1 = 1;
            r7 = (com.facebook.imagepipeline.p047h.EncodedImage) r7;
            r2 = r6.f2224b;
            if (r2 != 0) goto L_0x0012;
        L_0x0008:
            if (r7 != 0) goto L_0x0013;
        L_0x000a:
            if (r8 == 0) goto L_0x0012;
        L_0x000c:
            r0 = r6.f2163e;
            r2 = 0;
            r0.m1982b(r2, r1);
        L_0x0012:
            return;
        L_0x0013:
            r2 = r6.f2223a;
            r3 = r2.m2170a();
            r2 = r6.f2226d;
            r4 = r2.f2229c;
            if (r7 == 0) goto L_0x0025;
        L_0x001f:
            r2 = r7.f2144c;
            r5 = com.facebook.p034f.ImageFormat.f1518a;
            if (r2 != r5) goto L_0x0037;
        L_0x0025:
            r0 = com.facebook.common.p021l.TriState.UNSET;
        L_0x0027:
            if (r8 != 0) goto L_0x002d;
        L_0x0029:
            r1 = com.facebook.common.p021l.TriState.UNSET;
            if (r0 == r1) goto L_0x0012;
        L_0x002d:
            r1 = com.facebook.common.p021l.TriState.YES;
            if (r0 == r1) goto L_0x0064;
        L_0x0031:
            r0 = r6.f2163e;
            r0.m1982b(r7, r8);
            goto L_0x0012;
        L_0x0037:
            r2 = r7.f2144c;
            r5 = com.facebook.p034f.DefaultImageFormats.f1506a;
            if (r2 == r5) goto L_0x0040;
        L_0x003d:
            r0 = com.facebook.common.p021l.TriState.NO;
            goto L_0x0027;
        L_0x0040:
            r2 = r3.f2406g;
            r5 = r2.f1986b;
            if (r5 != 0) goto L_0x0060;
        L_0x0046:
            r2 = com.facebook.imagepipeline.p044k.ak.m2184a(r2, r7);
            if (r2 == 0) goto L_0x0060;
        L_0x004c:
            r2 = r1;
        L_0x004d:
            if (r2 != 0) goto L_0x005a;
        L_0x004f:
            r2 = com.facebook.imagepipeline.p044k.ak.m2185a(r3, r7, r4);
            r3 = 8;
            if (r2 >= r3) goto L_0x0062;
        L_0x0057:
            r2 = r1;
        L_0x0058:
            if (r2 == 0) goto L_0x005b;
        L_0x005a:
            r0 = r1;
        L_0x005b:
            r0 = com.facebook.common.p021l.TriState.m1120a(r0);
            goto L_0x0027;
        L_0x0060:
            r2 = r0;
            goto L_0x004d;
        L_0x0062:
            r2 = r0;
            goto L_0x0058;
        L_0x0064:
            r0 = r6.f2225c;
            r0 = r0.m2291a(r7, r8);
            if (r0 == 0) goto L_0x0012;
        L_0x006c:
            if (r8 != 0) goto L_0x0076;
        L_0x006e:
            r0 = r6.f2223a;
            r0 = r0.m2178h();
            if (r0 == 0) goto L_0x0012;
        L_0x0076:
            r0 = r6.f2225c;
            r0.m2292b();
            goto L_0x0012;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.k.ak.a.a(java.lang.Object, boolean):void");
        }

        public ResizeAndRotateProducer(ak akVar, Consumer<EncodedImage> consumer, ah ahVar) {
            this.f2226d = akVar;
            super(consumer);
            this.f2224b = false;
            this.f2223a = ahVar;
            this.f2225c = new JobScheduler(akVar.f2227a, new ResizeAndRotateProducer(this, akVar), 100);
            this.f2223a.m2171a(new ResizeAndRotateProducer(this, akVar, consumer));
        }
    }

    public ak(Executor executor, PooledByteBufferFactory pooledByteBufferFactory, boolean z, ag<EncodedImage> agVar) {
        this.f2227a = (Executor) Preconditions.m1030a((Object) executor);
        this.f2228b = (PooledByteBufferFactory) Preconditions.m1030a((Object) pooledByteBufferFactory);
        this.f2229c = z;
        this.f2230d = (ag) Preconditions.m1030a((Object) agVar);
    }

    public final void m2186a(Consumer<EncodedImage> consumer, ah ahVar) {
        this.f2230d.m2094a(new ResizeAndRotateProducer(this, consumer, ahVar), ahVar);
    }

    static int m2185a(ImageRequest imageRequest, EncodedImage encodedImage, boolean z) {
        if (!z) {
            return 8;
        }
        ResizeOptions resizeOptions = imageRequest.f2405f;
        if (resizeOptions == null) {
            return 8;
        }
        Object obj;
        int i;
        int i2;
        float f;
        int a = ak.m2184a(imageRequest.f2406g, encodedImage);
        if (a == 90 || a == 270) {
            obj = 1;
        } else {
            obj = null;
        }
        if (obj != null) {
            i = encodedImage.f2147f;
        } else {
            i = encodedImage.f2146e;
        }
        if (obj != null) {
            i2 = encodedImage.f2146e;
        } else {
            i2 = encodedImage.f2147f;
        }
        if (resizeOptions == null) {
            f = DefaultRetryPolicy.DEFAULT_BACKOFF_MULT;
        } else {
            f = Math.max(((float) resizeOptions.f1981a) / ((float) i), ((float) resizeOptions.f1982b) / ((float) i2));
            if (((float) i) * f > resizeOptions.f1983c) {
                f = resizeOptions.f1983c / ((float) i);
            }
            if (((float) i2) * f > resizeOptions.f1983c) {
                f = resizeOptions.f1983c / ((float) i2);
            }
        }
        a = (int) ((f * 8.0f) + resizeOptions.f1984d);
        if (a > 8) {
            return 8;
        }
        return a <= 0 ? 1 : a;
    }

    static int m2184a(RotationOptions rotationOptions, EncodedImage encodedImage) {
        if (rotationOptions.m1929a()) {
            int i = encodedImage.f2145d;
            switch (i) {
                case R.AppCompatTheme_colorSwitchThumbNormal /*90*/:
                case 180:
                case 270:
                    return i;
                default:
                    return 0;
            }
        } else if (!rotationOptions.m1929a()) {
            return rotationOptions.f1985a;
        } else {
            throw new IllegalStateException("Rotation is set to use EXIF");
        }
    }
}
