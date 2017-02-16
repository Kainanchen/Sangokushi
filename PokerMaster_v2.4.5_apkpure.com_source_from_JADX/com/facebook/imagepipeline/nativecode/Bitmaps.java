package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import com.facebook.common.p011d.DoNotStrip;
import com.facebook.common.p011d.Preconditions;
import java.nio.ByteBuffer;

@DoNotStrip
public class Bitmaps {
    @DoNotStrip
    private static native void nativeCopyBitmap(Bitmap bitmap, int i, Bitmap bitmap2, int i2, int i3);

    @DoNotStrip
    private static native ByteBuffer nativeGetByteBuffer(Bitmap bitmap, long j, long j2);

    @DoNotStrip
    private static native void nativePinBitmap(Bitmap bitmap);

    @DoNotStrip
    private static native void nativeReleaseByteBuffer(Bitmap bitmap);

    static {
        ImagePipelineNativeLoader.m2433a();
    }

    public static void m2431a(Bitmap bitmap) {
        Preconditions.m1030a((Object) bitmap);
        nativePinBitmap(bitmap);
    }
}
