package com.facebook.imagepipeline.p044k;

import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.imagepipeline.p042d.ResizeOptions;
import com.facebook.imagepipeline.p047h.EncodedImage;
import com.illuminate.texaspoker.R.R;

/* compiled from: ThumbnailSizeChecker */
/* renamed from: com.facebook.imagepipeline.k.as */
public final class as {
    public static boolean m2222a(int i, int i2, ResizeOptions resizeOptions) {
        if (resizeOptions == null) {
            if (((float) ((int) (((float) i) * 1.3333334f))) < 2048.0f || ((int) (((float) i2) * 1.3333334f)) < AccessibilityNodeInfoCompat.ACTION_PREVIOUS_HTML_ELEMENT) {
                return false;
            }
            return true;
        } else if (((int) (((float) i) * 1.3333334f)) < resizeOptions.f1981a || ((int) (((float) i2) * 1.3333334f)) < resizeOptions.f1982b) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean m2223a(EncodedImage encodedImage, ResizeOptions resizeOptions) {
        if (encodedImage == null) {
            return false;
        }
        switch (encodedImage.f2145d) {
            case R.AppCompatTheme_colorSwitchThumbNormal /*90*/:
            case 270:
                return as.m2222a(encodedImage.f2147f, encodedImage.f2146e, resizeOptions);
            default:
                return as.m2222a(encodedImage.f2146e, encodedImage.f2147f, resizeOptions);
        }
    }
}
