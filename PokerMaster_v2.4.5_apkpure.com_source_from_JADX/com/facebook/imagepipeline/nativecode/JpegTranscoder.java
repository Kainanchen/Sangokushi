package com.facebook.imagepipeline.nativecode;

import com.facebook.common.p011d.DoNotStrip;
import com.facebook.common.p011d.Preconditions;
import java.io.InputStream;
import java.io.OutputStream;

@DoNotStrip
public class JpegTranscoder {
    @DoNotStrip
    private static native void nativeTranscodeJpeg(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3);

    static {
        ImagePipelineNativeLoader.m2433a();
    }

    public static void m2432a(InputStream inputStream, OutputStream outputStream, int i, int i2) {
        boolean z;
        boolean z2 = false;
        Preconditions.m1033a(i2 > 0);
        if (i2 <= 16) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.m1033a(z);
        Preconditions.m1033a(true);
        Preconditions.m1033a(true);
        if (i < 0 || i > 270 || i % 90 != 0) {
            z = false;
        } else {
            z = true;
        }
        Preconditions.m1033a(z);
        if (!(i2 == 8 && i == 0)) {
            z2 = true;
        }
        Preconditions.m1034a(z2, (Object) "no transformation requested");
        nativeTranscodeJpeg((InputStream) Preconditions.m1030a((Object) inputStream), (OutputStream) Preconditions.m1030a((Object) outputStream), i, i2, 85);
    }
}
