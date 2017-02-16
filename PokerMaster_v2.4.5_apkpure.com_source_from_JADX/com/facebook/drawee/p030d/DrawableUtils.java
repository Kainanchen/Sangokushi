package com.facebook.drawee.p030d;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import javax.annotation.Nullable;

/* renamed from: com.facebook.drawee.d.e */
public final class DrawableUtils {
    public static void m1342a(Drawable drawable, Drawable drawable2) {
        if (drawable2 != null && drawable != null && drawable != drawable2) {
            drawable.setBounds(drawable2.getBounds());
            drawable.setChangingConfigurations(drawable2.getChangingConfigurations());
            drawable.setLevel(drawable2.getLevel());
            drawable.setVisible(drawable2.isVisible(), false);
            drawable.setState(drawable2.getState());
        }
    }

    public static void m1343a(Drawable drawable, DrawableProperties drawableProperties) {
        boolean z = true;
        if (drawable != null && drawableProperties != null && drawable != null) {
            if (drawableProperties.f1343a != -1) {
                drawable.setAlpha(drawableProperties.f1343a);
            }
            if (drawableProperties.f1344b) {
                drawable.setColorFilter(drawableProperties.f1345c);
            }
            if (drawableProperties.f1346d != -1) {
                boolean z2;
                if (drawableProperties.f1346d != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                drawable.setDither(z2);
            }
            if (drawableProperties.f1347e != -1) {
                if (drawableProperties.f1347e == 0) {
                    z = false;
                }
                drawable.setFilterBitmap(z);
            }
        }
    }

    public static void m1341a(Drawable drawable, @Nullable Callback callback, @Nullable TransformCallback transformCallback) {
        if (drawable != null) {
            drawable.setCallback(callback);
            if (drawable instanceof TransformAwareDrawable) {
                ((TransformAwareDrawable) drawable).m1322a(transformCallback);
            }
        }
    }

    public static int m1340a(int i, int i2) {
        if (i2 == MotionEventCompat.ACTION_MASK) {
            return i;
        }
        if (i2 == 0) {
            return i & ViewCompat.MEASURED_SIZE_MASK;
        }
        return (((((i2 >> 7) + i2) * (i >>> 24)) >> 8) << 24) | (i & ViewCompat.MEASURED_SIZE_MASK);
    }
}
