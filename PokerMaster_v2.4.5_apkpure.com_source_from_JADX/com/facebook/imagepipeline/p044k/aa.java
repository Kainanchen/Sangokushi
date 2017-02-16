package com.facebook.imagepipeline.p044k;

import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.common.p011d.ImmutableMap;
import com.facebook.common.p017h.CloseableReference;
import com.facebook.imagepipeline.p040b.SimpleBitmapReleaser;
import com.facebook.imagepipeline.p047h.CloseableImage;
import com.facebook.imagepipeline.p047h.CloseableStaticBitmap;
import com.facebook.imagepipeline.p047h.ImmutableQualityInfo;
import com.facebook.imagepipeline.p050l.ImageRequest;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: LocalVideoThumbnailProducer */
/* renamed from: com.facebook.imagepipeline.k.aa */
public final class aa implements ag<CloseableReference<CloseableImage>> {
    private final Executor f2173a;

    /* renamed from: com.facebook.imagepipeline.k.aa.1 */
    class LocalVideoThumbnailProducer extends am<CloseableReference<CloseableImage>> {
        final /* synthetic */ ImageRequest f2169b;
        final /* synthetic */ aa f2170c;

        LocalVideoThumbnailProducer(aa aaVar, Consumer consumer, aj ajVar, String str, String str2, ImageRequest imageRequest) {
            this.f2170c = aaVar;
            this.f2169b = imageRequest;
            super(consumer, ajVar, str, str2);
        }

        protected final /* synthetic */ void m2101b(Object obj) {
            CloseableReference.m1097c((CloseableReference) obj);
        }

        protected final /* synthetic */ Object m2102c() {
            int i;
            Bitmap createVideoThumbnail;
            int i2 = AccessibilityNodeInfoCompat.ACTION_PREVIOUS_HTML_ELEMENT;
            String path = this.f2169b.m2329a().getPath();
            ImageRequest imageRequest = this.f2169b;
            if (imageRequest.f2405f != null) {
                i = imageRequest.f2405f.f1981a;
            } else {
                i = AccessibilityNodeInfoCompat.ACTION_PREVIOUS_HTML_ELEMENT;
            }
            if (i <= 96) {
                if (imageRequest.f2405f != null) {
                    i2 = imageRequest.f2405f.f1982b;
                }
                if (i2 <= 96) {
                    i2 = 3;
                    createVideoThumbnail = ThumbnailUtils.createVideoThumbnail(path, i2);
                    if (createVideoThumbnail == null) {
                        return null;
                    }
                    if (SimpleBitmapReleaser.f1904a == null) {
                        SimpleBitmapReleaser.f1904a = new SimpleBitmapReleaser();
                    }
                    return CloseableReference.m1093a(new CloseableStaticBitmap(createVideoThumbnail, SimpleBitmapReleaser.f1904a, ImmutableQualityInfo.f2150a));
                }
            }
            i2 = 1;
            createVideoThumbnail = ThumbnailUtils.createVideoThumbnail(path, i2);
            if (createVideoThumbnail == null) {
                return null;
            }
            if (SimpleBitmapReleaser.f1904a == null) {
                SimpleBitmapReleaser.f1904a = new SimpleBitmapReleaser();
            }
            return CloseableReference.m1093a(new CloseableStaticBitmap(createVideoThumbnail, SimpleBitmapReleaser.f1904a, ImmutableQualityInfo.f2150a));
        }

        protected final /* synthetic */ Map m2103c(Object obj) {
            boolean z;
            String str = "createdThumbnail";
            if (((CloseableReference) obj) != null) {
                z = true;
            } else {
                z = false;
            }
            return ImmutableMap.m1023a(str, String.valueOf(z));
        }
    }

    /* renamed from: com.facebook.imagepipeline.k.aa.2 */
    class LocalVideoThumbnailProducer extends BaseProducerContextCallbacks {
        final /* synthetic */ am f2171a;
        final /* synthetic */ aa f2172b;

        LocalVideoThumbnailProducer(aa aaVar, am amVar) {
            this.f2172b = aaVar;
            this.f2171a = amVar;
        }

        public final void m2112a() {
            this.f2171a.m1009a();
        }
    }

    public aa(Executor executor) {
        this.f2173a = executor;
    }

    public final void m2113a(Consumer<CloseableReference<CloseableImage>> consumer, ah ahVar) {
        Consumer<CloseableReference<CloseableImage>> consumer2 = consumer;
        Runnable localVideoThumbnailProducer = new LocalVideoThumbnailProducer(this, consumer2, ahVar.m2173c(), "VideoThumbnailProducer", ahVar.m2172b(), ahVar.m2170a());
        ahVar.m2171a(new LocalVideoThumbnailProducer(this, localVideoThumbnailProducer));
        this.f2173a.execute(localVideoThumbnailProducer);
    }
}
