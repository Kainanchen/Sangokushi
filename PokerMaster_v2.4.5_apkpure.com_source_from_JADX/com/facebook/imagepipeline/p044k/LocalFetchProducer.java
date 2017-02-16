package com.facebook.imagepipeline.p044k;

import android.os.Build.VERSION;
import com.facebook.common.p011d.Closeables;
import com.facebook.common.p011d.Supplier;
import com.facebook.common.p017h.CloseableReference;
import com.facebook.imagepipeline.memory.PooledByteBufferFactory;
import com.facebook.imagepipeline.p047h.EncodedImage;
import com.facebook.imagepipeline.p050l.ImageRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.k.x */
public abstract class LocalFetchProducer implements ag<EncodedImage> {
    private final Executor f2285a;
    private final PooledByteBufferFactory f2286b;
    private final boolean f2287c;

    /* renamed from: com.facebook.imagepipeline.k.x.1 */
    class LocalFetchProducer extends am<EncodedImage> {
        final /* synthetic */ ImageRequest f2384b;
        final /* synthetic */ LocalFetchProducer f2385c;

        LocalFetchProducer(LocalFetchProducer localFetchProducer, Consumer consumer, aj ajVar, String str, String str2, ImageRequest imageRequest) {
            this.f2385c = localFetchProducer;
            this.f2384b = imageRequest;
            super(consumer, ajVar, str, str2);
        }

        protected final /* synthetic */ void m2315b(Object obj) {
            EncodedImage.m2029d((EncodedImage) obj);
        }

        protected final /* synthetic */ Object m2316c() {
            Object a = this.f2385c.m2243a(this.f2384b);
            if (a == null) {
                return null;
            }
            a.m2035c();
            return a;
        }
    }

    /* renamed from: com.facebook.imagepipeline.k.x.2 */
    class LocalFetchProducer extends BaseProducerContextCallbacks {
        final /* synthetic */ am f2386a;
        final /* synthetic */ LocalFetchProducer f2387b;

        LocalFetchProducer(LocalFetchProducer localFetchProducer, am amVar) {
            this.f2387b = localFetchProducer;
            this.f2386a = amVar;
        }

        public final void m2317a() {
            this.f2386a.m1009a();
        }
    }

    /* renamed from: com.facebook.imagepipeline.k.x.3 */
    class LocalFetchProducer implements Supplier<FileInputStream> {
        final /* synthetic */ File f2388a;
        final /* synthetic */ LocalFetchProducer f2389b;

        LocalFetchProducer(LocalFetchProducer localFetchProducer, File file) {
            this.f2389b = localFetchProducer;
            this.f2388a = file;
        }

        public final /* synthetic */ Object m2319a() {
            return m2318b();
        }

        private FileInputStream m2318b() {
            try {
                return new FileInputStream(this.f2388a);
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
    }

    protected abstract EncodedImage m2243a(ImageRequest imageRequest);

    protected abstract String m2245a();

    protected LocalFetchProducer(Executor executor, PooledByteBufferFactory pooledByteBufferFactory, boolean z) {
        this.f2285a = executor;
        this.f2286b = pooledByteBufferFactory;
        boolean z2 = z && VERSION.SDK_INT == 19;
        this.f2287c = z2;
    }

    public final void m2246a(Consumer<EncodedImage> consumer, ah ahVar) {
        Consumer<EncodedImage> consumer2 = consumer;
        Runnable localFetchProducer = new LocalFetchProducer(this, consumer2, ahVar.m2173c(), m2245a(), ahVar.m2172b(), ahVar.m2170a());
        ahVar.m2171a(new LocalFetchProducer(this, localFetchProducer));
        this.f2285a.execute(localFetchProducer);
    }

    protected final EncodedImage m2244a(InputStream inputStream, int i) {
        CloseableReference closeableReference = null;
        if (i <= 0) {
            try {
                closeableReference = CloseableReference.m1093a(this.f2286b.m2403a(inputStream));
            } catch (Throwable th) {
                Closeables.m1022a(inputStream);
                CloseableReference.m1097c(closeableReference);
            }
        } else {
            closeableReference = CloseableReference.m1093a(this.f2286b.m2404a(inputStream, i));
        }
        EncodedImage encodedImage = new EncodedImage(closeableReference);
        Closeables.m1022a(inputStream);
        CloseableReference.m1097c(closeableReference);
        return encodedImage;
    }

    protected final EncodedImage m2247b(InputStream inputStream, int i) {
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory();
        return (this.f2287c && (inputStream instanceof FileInputStream) && maxMemory >= Math.min(maxMemory - (runtime.totalMemory() - runtime.freeMemory()), 8388608) * 64) ? new EncodedImage(new LocalFetchProducer(this, new File(inputStream.toString())), i) : m2244a(inputStream, i);
    }
}
