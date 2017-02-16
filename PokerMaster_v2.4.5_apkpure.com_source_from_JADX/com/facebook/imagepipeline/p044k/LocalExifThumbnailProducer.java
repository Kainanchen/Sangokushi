package com.facebook.imagepipeline.p044k;

import android.content.ContentResolver;
import android.media.ExifInterface;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.common.p011d.ImmutableMap;
import com.facebook.common.p017h.CloseableReference;
import com.facebook.common.p021l.UriUtil;
import com.facebook.imagepipeline.memory.PooledByteBuffer;
import com.facebook.imagepipeline.memory.PooledByteBufferFactory;
import com.facebook.imagepipeline.memory.PooledByteBufferInputStream;
import com.facebook.imagepipeline.p042d.ResizeOptions;
import com.facebook.imagepipeline.p047h.EncodedImage;
import com.facebook.imagepipeline.p050l.ImageRequest;
import com.facebook.p034f.DefaultImageFormats;
import com.facebook.p035g.BitmapUtil;
import com.facebook.p035g.TiffUtil;
import java.io.Closeable;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.k.w */
public final class LocalExifThumbnailProducer implements ar<EncodedImage> {
    final PooledByteBufferFactory f2381a;
    final ContentResolver f2382b;
    private final Executor f2383c;

    /* renamed from: com.facebook.imagepipeline.k.w.1 */
    class LocalExifThumbnailProducer extends am<EncodedImage> {
        final /* synthetic */ ImageRequest f2377b;
        final /* synthetic */ LocalExifThumbnailProducer f2378c;

        LocalExifThumbnailProducer(LocalExifThumbnailProducer localExifThumbnailProducer, Consumer consumer, aj ajVar, String str, String str2, ImageRequest imageRequest) {
            this.f2378c = localExifThumbnailProducer;
            this.f2377b = imageRequest;
            super(consumer, ajVar, str, str2);
        }

        protected final /* synthetic */ void m2308b(Object obj) {
            EncodedImage.m2029d((EncodedImage) obj);
        }

        protected final /* synthetic */ Object m2309c() {
            Object obj;
            ExifInterface exifInterface;
            String a = UriUtil.m1121a(this.f2378c.f2382b, this.f2377b.f2401b);
            if (a != null) {
                File file = new File(a);
                if (file.exists() && file.canRead()) {
                    obj = 1;
                    if (obj == null) {
                        exifInterface = new ExifInterface(a);
                    } else {
                        exifInterface = null;
                    }
                    if (exifInterface == null && exifInterface.hasThumbnail()) {
                        return LocalExifThumbnailProducer.m2312a(this.f2378c.f2381a.m2405a(exifInterface.getThumbnail()), exifInterface);
                    }
                }
            }
            obj = null;
            if (obj == null) {
                exifInterface = null;
            } else {
                exifInterface = new ExifInterface(a);
            }
            return exifInterface == null ? null : null;
        }

        protected final /* synthetic */ Map m2310c(Object obj) {
            boolean z;
            String str = "createdThumbnail";
            if (((EncodedImage) obj) != null) {
                z = true;
            } else {
                z = false;
            }
            return ImmutableMap.m1023a(str, Boolean.toString(z));
        }
    }

    /* renamed from: com.facebook.imagepipeline.k.w.2 */
    class LocalExifThumbnailProducer extends BaseProducerContextCallbacks {
        final /* synthetic */ am f2379a;
        final /* synthetic */ LocalExifThumbnailProducer f2380b;

        LocalExifThumbnailProducer(LocalExifThumbnailProducer localExifThumbnailProducer, am amVar) {
            this.f2380b = localExifThumbnailProducer;
            this.f2379a = amVar;
        }

        public final void m2311a() {
            this.f2379a.m1009a();
        }
    }

    public LocalExifThumbnailProducer(Executor executor, PooledByteBufferFactory pooledByteBufferFactory, ContentResolver contentResolver) {
        this.f2383c = executor;
        this.f2381a = pooledByteBufferFactory;
        this.f2382b = contentResolver;
    }

    public final boolean m2314a(ResizeOptions resizeOptions) {
        return as.m2222a(AccessibilityNodeInfoCompat.ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY, AccessibilityNodeInfoCompat.ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY, resizeOptions);
    }

    public final void m2313a(Consumer<EncodedImage> consumer, ah ahVar) {
        Consumer<EncodedImage> consumer2 = consumer;
        Runnable localExifThumbnailProducer = new LocalExifThumbnailProducer(this, consumer2, ahVar.m2173c(), "LocalExifThumbnailProducer", ahVar.m2172b(), ahVar.m2170a());
        ahVar.m2171a(new LocalExifThumbnailProducer(this, localExifThumbnailProducer));
        this.f2383c.execute(localExifThumbnailProducer);
    }

    static EncodedImage m2312a(PooledByteBuffer pooledByteBuffer, ExifInterface exifInterface) {
        int intValue;
        EncodedImage a = BitmapUtil.m1464a(new PooledByteBufferInputStream(pooledByteBuffer));
        int a2 = TiffUtil.m1467a(Integer.parseInt(exifInterface.getAttribute("Orientation")));
        int intValue2 = a != null ? ((Integer) a.first).intValue() : -1;
        if (a != null) {
            intValue = ((Integer) a.second).intValue();
        } else {
            intValue = -1;
        }
        CloseableReference a3 = CloseableReference.m1093a((Closeable) pooledByteBuffer);
        try {
            a = new EncodedImage(a3);
            a.f2144c = DefaultImageFormats.f1506a;
            a.f2145d = a2;
            a.f2146e = intValue2;
            a.f2147f = intValue;
            return a;
        } finally {
            CloseableReference.m1097c(a3);
        }
    }
}
