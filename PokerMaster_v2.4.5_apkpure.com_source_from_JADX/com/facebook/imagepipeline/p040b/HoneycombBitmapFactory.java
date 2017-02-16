package com.facebook.imagepipeline.p040b;

import android.annotation.TargetApi;
import com.facebook.imagepipeline.p049j.PlatformDecoder;
import javax.annotation.concurrent.ThreadSafe;

@TargetApi(11)
@ThreadSafe
/* renamed from: com.facebook.imagepipeline.b.d */
public final class HoneycombBitmapFactory extends PlatformBitmapFactory {
    private final EmptyJpegGenerator f1902a;
    private final PlatformDecoder f1903b;

    public HoneycombBitmapFactory(EmptyJpegGenerator emptyJpegGenerator, PlatformDecoder platformDecoder) {
        this.f1902a = emptyJpegGenerator;
        this.f1903b = platformDecoder;
    }
}
