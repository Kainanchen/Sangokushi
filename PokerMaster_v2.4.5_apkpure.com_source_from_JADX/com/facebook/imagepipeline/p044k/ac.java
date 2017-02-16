package com.facebook.imagepipeline.p044k;

import android.os.SystemClock;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.android.volley.DefaultRetryPolicy;
import com.facebook.common.p017h.CloseableReference;
import com.facebook.imagepipeline.memory.ByteArrayPool;
import com.facebook.imagepipeline.memory.PooledByteBufferFactory;
import com.facebook.imagepipeline.memory.PooledByteBufferOutputStream;
import com.facebook.imagepipeline.p044k.ad.NetworkFetcher;
import com.facebook.imagepipeline.p047h.EncodedImage;
import java.io.InputStream;

/* compiled from: NetworkFetchProducer */
/* renamed from: com.facebook.imagepipeline.k.ac */
public final class ac implements ag<EncodedImage> {
    final PooledByteBufferFactory f2188a;
    final ByteArrayPool f2189b;
    private final ad f2190c;

    /* renamed from: com.facebook.imagepipeline.k.ac.1 */
    class NetworkFetchProducer implements NetworkFetcher {
        final /* synthetic */ FetchState f2186a;
        final /* synthetic */ ac f2187b;

        NetworkFetchProducer(ac acVar, FetchState fetchState) {
            this.f2187b = acVar;
            this.f2186a = fetchState;
        }

        public final void m2142a(InputStream inputStream) {
            ac acVar = this.f2187b;
            FetchState fetchState = this.f2186a;
            PooledByteBufferOutputStream a = acVar.f2188a.m2406a();
            byte[] bArr = (byte[]) acVar.f2189b.m2344a((int) AccessibilityNodeInfoCompat.ACTION_COPY);
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read < 0) {
                        break;
                    } else if (read > 0) {
                        Object obj;
                        a.write(bArr, 0, read);
                        long uptimeMillis = SystemClock.uptimeMillis();
                        if (fetchState.f2340b.m2170a().f2402c) {
                            read = 1;
                        } else {
                            obj = null;
                        }
                        if (obj != null && uptimeMillis - fetchState.f2341c >= 100) {
                            fetchState.f2341c = uptimeMillis;
                            fetchState.m2282b().m2044a(fetchState.m2281a(), "NetworkFetchProducer", "intermediate_result");
                            ac.m2144a(a, false, fetchState.f2339a);
                        }
                        fetchState.f2339a.m1981b(DefaultRetryPolicy.DEFAULT_BACKOFF_MULT - ((float) Math.exp(((double) (-a.m2415b())) / 50000.0d)));
                    }
                } finally {
                    acVar.f2189b.m2345a((Object) bArr);
                    a.close();
                }
            }
            fetchState.m2282b().m2048b(fetchState.m2281a());
            fetchState.m2282b().m2046a(fetchState.m2281a(), "NetworkFetchProducer", null);
            ac.m2144a(a, true, fetchState.f2339a);
        }

        public final void m2143a(Throwable th) {
            FetchState fetchState = this.f2186a;
            fetchState.m2282b().m2045a(fetchState.m2281a(), "NetworkFetchProducer", th, null);
            fetchState.f2339a.m1983b(th);
        }

        public final void m2141a() {
            FetchState fetchState = this.f2186a;
            fetchState.m2282b().m2047b(fetchState.m2281a(), "NetworkFetchProducer", null);
            fetchState.f2339a.m1980b();
        }
    }

    public ac(PooledByteBufferFactory pooledByteBufferFactory, ByteArrayPool byteArrayPool, ad adVar) {
        this.f2188a = pooledByteBufferFactory;
        this.f2189b = byteArrayPool;
        this.f2190c = adVar;
    }

    public final void m2145a(Consumer<EncodedImage> consumer, ah ahVar) {
        ahVar.m2173c().m2043a(ahVar.m2172b(), "NetworkFetchProducer");
        FetchState a = this.f2190c.m2146a((Consumer) consumer, ahVar);
        this.f2190c.m2147a(a, new NetworkFetchProducer(this, a));
    }

    static void m2144a(PooledByteBufferOutputStream pooledByteBufferOutputStream, boolean z, Consumer<EncodedImage> consumer) {
        Throwable th;
        CloseableReference a = CloseableReference.m1093a(pooledByteBufferOutputStream.m2416c());
        EncodedImage encodedImage;
        try {
            encodedImage = new EncodedImage(a);
            try {
                encodedImage.m2035c();
                consumer.m1982b(encodedImage, z);
                EncodedImage.m2029d(encodedImage);
                CloseableReference.m1097c(a);
            } catch (Throwable th2) {
                th = th2;
                EncodedImage.m2029d(encodedImage);
                CloseableReference.m1097c(a);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            encodedImage = null;
            EncodedImage.m2029d(encodedImage);
            CloseableReference.m1097c(a);
            throw th;
        }
    }
}
