package com.facebook.imagepipeline.p049j;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.facebook.common.p017h.CloseableReference;
import com.facebook.imagepipeline.p047h.EncodedImage;

/* renamed from: com.facebook.imagepipeline.j.e */
public interface PlatformDecoder {
    CloseableReference<Bitmap> m2063a(EncodedImage encodedImage, Config config);

    CloseableReference<Bitmap> m2064a(EncodedImage encodedImage, Config config, int i);
}
