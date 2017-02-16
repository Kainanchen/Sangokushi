package com.facebook.drawee.p030d;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.common.p011d.Preconditions;
import com.facebook.drawee.p030d.ScalingUtils.ScalingUtils;

/* renamed from: com.facebook.drawee.d.n */
public final class ScaleTypeDrawable extends ForwardingDrawable {
    ScalingUtils f1418a;
    Object f1419c;
    public PointF f1420d;
    int f1421e;
    int f1422f;
    Matrix f1423g;
    private Matrix f1424h;

    public ScaleTypeDrawable(Drawable drawable, ScalingUtils scalingUtils) {
        super((Drawable) Preconditions.m1030a((Object) drawable));
        this.f1420d = null;
        this.f1421e = 0;
        this.f1422f = 0;
        this.f1424h = new Matrix();
        this.f1418a = scalingUtils;
    }

    public final Drawable m1375b(Drawable drawable) {
        Drawable b = super.m1335b(drawable);
        m1376b();
        return b;
    }

    public final void draw(Canvas canvas) {
        m1373c();
        if (this.f1423g != null) {
            int save = canvas.save();
            canvas.clipRect(getBounds());
            canvas.concat(this.f1423g);
            super.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.draw(canvas);
    }

    protected final void onBoundsChange(Rect rect) {
        m1376b();
    }

    private void m1373c() {
        Object obj = null;
        Object obj2;
        if (this.f1418a instanceof ScalingUtils) {
            Object a = ((ScalingUtils) this.f1418a).m1388a();
            obj2 = (a == null || !a.equals(this.f1419c)) ? 1 : null;
            this.f1419c = a;
        } else {
            obj2 = null;
        }
        if (!(this.f1421e == getCurrent().getIntrinsicWidth() && this.f1422f == getCurrent().getIntrinsicHeight())) {
            obj = 1;
        }
        if (obj != null || r0 != null) {
            m1376b();
        }
    }

    public final void m1376b() {
        float f = 0.5f;
        Drawable current = getCurrent();
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.f1421e = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.f1422f = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
            this.f1423g = null;
        } else if (intrinsicWidth == width && intrinsicHeight == height) {
            current.setBounds(bounds);
            this.f1423g = null;
        } else if (this.f1418a == ScalingUtils.f1425a) {
            current.setBounds(bounds);
            this.f1423g = null;
        } else {
            current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            ScalingUtils scalingUtils = this.f1418a;
            Matrix matrix = this.f1424h;
            float f2 = this.f1420d != null ? this.f1420d.x : 0.5f;
            if (this.f1420d != null) {
                f = this.f1420d.y;
            }
            scalingUtils.m1377a(matrix, bounds, intrinsicWidth, intrinsicHeight, f2, f);
            this.f1423g = this.f1424h;
        }
    }

    public final void m1374a(Matrix matrix) {
        m1336b(matrix);
        m1373c();
        if (this.f1423g != null) {
            matrix.preConcat(this.f1423g);
        }
    }
}
