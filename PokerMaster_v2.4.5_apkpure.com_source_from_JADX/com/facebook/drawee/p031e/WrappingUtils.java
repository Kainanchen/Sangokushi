package com.facebook.drawee.p031e;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import com.facebook.common.p011d.Objects;
import com.facebook.drawee.p030d.MatrixDrawable;
import com.facebook.drawee.p030d.Rounded;
import com.facebook.drawee.p030d.RoundedBitmapDrawable;
import com.facebook.drawee.p030d.RoundedColorDrawable;
import com.facebook.drawee.p030d.RoundedCornersDrawable;
import com.facebook.drawee.p030d.ScaleTypeDrawable;
import com.facebook.drawee.p030d.ScalingUtils.ScalingUtils;
import com.facebook.drawee.p031e.RoundingParams.RoundingParams;
import javax.annotation.Nullable;

/* renamed from: com.facebook.drawee.e.f */
public final class WrappingUtils {
    private static final Drawable f1480a;

    static {
        f1480a = new ColorDrawable(0);
    }

    @Nullable
    static Drawable m1419a(@Nullable Drawable drawable, @Nullable ScalingUtils scalingUtils) {
        return WrappingUtils.m1420a(drawable, scalingUtils, null);
    }

    @Nullable
    static Drawable m1420a(@Nullable Drawable drawable, @Nullable ScalingUtils scalingUtils, @Nullable PointF pointF) {
        if (drawable == null || scalingUtils == null) {
            return drawable;
        }
        Drawable scaleTypeDrawable = new ScaleTypeDrawable(drawable, scalingUtils);
        if (!(pointF == null || Objects.m1029a(scaleTypeDrawable.f1420d, pointF))) {
            if (scaleTypeDrawable.f1420d == null) {
                scaleTypeDrawable.f1420d = new PointF();
            }
            scaleTypeDrawable.f1420d.set(pointF);
            scaleTypeDrawable.m1376b();
            scaleTypeDrawable.invalidateSelf();
        }
        return scaleTypeDrawable;
    }

    @Nullable
    static Drawable m1418a(@Nullable Drawable drawable, @Nullable Matrix matrix) {
        return (drawable == null || matrix == null) ? drawable : new MatrixDrawable(drawable, matrix);
    }

    static Drawable m1421a(@Nullable Drawable drawable, @Nullable RoundingParams roundingParams) {
        if (drawable == null || roundingParams == null || roundingParams.f1473a != RoundingParams.OVERLAY_COLOR) {
            return drawable;
        }
        Rounded roundedCornersDrawable = new RoundedCornersDrawable(drawable);
        WrappingUtils.m1423a(roundedCornersDrawable, roundingParams);
        roundedCornersDrawable.f1409e = roundingParams.f1476d;
        roundedCornersDrawable.invalidateSelf();
        return roundedCornersDrawable;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.graphics.drawable.Drawable m1422a(@javax.annotation.Nullable android.graphics.drawable.Drawable r3, @javax.annotation.Nullable com.facebook.drawee.p031e.RoundingParams r4, android.content.res.Resources r5) {
        /*
        if (r3 == 0) goto L_0x000a;
    L_0x0002:
        if (r4 == 0) goto L_0x000a;
    L_0x0004:
        r0 = r4.f1473a;
        r1 = com.facebook.drawee.p031e.RoundingParams.RoundingParams.BITMAP_ONLY;
        if (r0 == r1) goto L_0x000b;
    L_0x000a:
        return r3;
    L_0x000b:
        r0 = r3 instanceof com.facebook.drawee.p030d.ForwardingDrawable;
        if (r0 == 0) goto L_0x002f;
    L_0x000f:
        r0 = r3;
        r0 = (com.facebook.drawee.p030d.ForwardingDrawable) r0;
        r1 = r0;
    L_0x0013:
        r0 = r1.m1318a();
        if (r0 == r1) goto L_0x0021;
    L_0x0019:
        r2 = r0 instanceof com.facebook.drawee.p030d.DrawableParent;
        if (r2 == 0) goto L_0x0021;
    L_0x001d:
        r0 = (com.facebook.drawee.p030d.DrawableParent) r0;
        r1 = r0;
        goto L_0x0013;
    L_0x0021:
        r0 = f1480a;
        r0 = r1.m1319a(r0);
        r0 = com.facebook.drawee.p031e.WrappingUtils.m1424b(r0, r4, r5);
        r1.m1319a(r0);
        goto L_0x000a;
    L_0x002f:
        r3 = com.facebook.drawee.p031e.WrappingUtils.m1424b(r3, r4, r5);
        goto L_0x000a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.drawee.e.f.a(android.graphics.drawable.Drawable, com.facebook.drawee.e.e, android.content.res.Resources):android.graphics.drawable.Drawable");
    }

    private static Drawable m1424b(Drawable drawable, RoundingParams roundingParams, Resources resources) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Rounded roundedBitmapDrawable = new RoundedBitmapDrawable(resources, bitmapDrawable.getBitmap(), bitmapDrawable.getPaint());
            WrappingUtils.m1423a(roundedBitmapDrawable, roundingParams);
            return roundedBitmapDrawable;
        } else if (!(drawable instanceof ColorDrawable) || VERSION.SDK_INT < 11) {
            return drawable;
        } else {
            Rounded a = RoundedColorDrawable.m1361a((ColorDrawable) drawable);
            WrappingUtils.m1423a(a, roundingParams);
            return a;
        }
    }

    private static void m1423a(Rounded rounded, RoundingParams roundingParams) {
        rounded.m1354a(roundingParams.f1474b);
        rounded.m1355a(roundingParams.f1475c);
        rounded.m1353a(roundingParams.f1478f, roundingParams.f1477e);
        rounded.m1352a(roundingParams.f1479g);
    }
}
