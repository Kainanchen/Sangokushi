package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import com.facebook.common.p011d.DoNotStrip;

@DoNotStrip
public class NativeBlurFilter {
    @DoNotStrip
    private static native void nativeIterativeBoxBlur(Bitmap bitmap, int i, int i2);

    static {
        ImagePipelineNativeLoader.m2433a();
    }
}
