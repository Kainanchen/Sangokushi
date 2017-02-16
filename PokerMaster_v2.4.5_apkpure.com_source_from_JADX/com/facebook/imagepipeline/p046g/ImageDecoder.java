package com.facebook.imagepipeline.p046g;

import android.graphics.Bitmap.Config;
import com.facebook.common.p011d.Closeables;
import com.facebook.common.p017h.CloseableReference;
import com.facebook.imagepipeline.p038a.p039a.AnimatedImageFactory;
import com.facebook.imagepipeline.p042d.ImageDecodeOptions;
import com.facebook.imagepipeline.p047h.CloseableImage;
import com.facebook.imagepipeline.p047h.CloseableStaticBitmap;
import com.facebook.imagepipeline.p047h.EncodedImage;
import com.facebook.imagepipeline.p047h.ImmutableQualityInfo;
import com.facebook.imagepipeline.p047h.QualityInfo;
import com.facebook.imagepipeline.p049j.PlatformDecoder;
import com.facebook.p034f.GifFormatChecker;
import java.io.InputStream;

/* renamed from: com.facebook.imagepipeline.g.a */
public final class ImageDecoder {
    public final AnimatedImageFactory f2127a;
    private final Config f2128b;
    private final PlatformDecoder f2129c;

    public ImageDecoder(AnimatedImageFactory animatedImageFactory, PlatformDecoder platformDecoder, Config config) {
        this.f2127a = animatedImageFactory;
        this.f2128b = config;
        this.f2129c = platformDecoder;
    }

    public final CloseableImage m2006a(EncodedImage encodedImage, ImageDecodeOptions imageDecodeOptions) {
        InputStream a = encodedImage.m2032a();
        if (a == null) {
            return null;
        }
        try {
            CloseableImage a2;
            if (imageDecodeOptions.f1971e || this.f2127a == null || !GifFormatChecker.m1449a(a)) {
                a2 = m2007a(encodedImage);
                Closeables.m1022a(a);
                return a2;
            }
            a2 = this.f2127a.m1861a();
            return a2;
        } finally {
            Closeables.m1022a(a);
        }
    }

    public final CloseableStaticBitmap m2007a(EncodedImage encodedImage) {
        CloseableReference a = this.f2129c.m2063a(encodedImage, this.f2128b);
        try {
            CloseableStaticBitmap closeableStaticBitmap = new CloseableStaticBitmap(a, ImmutableQualityInfo.f2150a, encodedImage.f2145d);
            return closeableStaticBitmap;
        } finally {
            a.close();
        }
    }

    public final CloseableStaticBitmap m2008a(EncodedImage encodedImage, int i, QualityInfo qualityInfo) {
        CloseableReference a = this.f2129c.m2064a(encodedImage, this.f2128b, i);
        try {
            CloseableStaticBitmap closeableStaticBitmap = new CloseableStaticBitmap(a, qualityInfo, encodedImage.f2145d);
            return closeableStaticBitmap;
        } finally {
            a.close();
        }
    }
}
