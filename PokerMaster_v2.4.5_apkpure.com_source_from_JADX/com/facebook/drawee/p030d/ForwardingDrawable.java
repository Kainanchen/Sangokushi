package com.facebook.drawee.p030d;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;

/* renamed from: com.facebook.drawee.d.g */
public class ForwardingDrawable extends Drawable implements Callback, DrawableParent, TransformAwareDrawable, TransformCallback {
    private static final Matrix f1335d;
    private Drawable f1336a;
    protected TransformCallback f1337b;
    private final DrawableProperties f1338c;

    static {
        f1335d = new Matrix();
    }

    public ForwardingDrawable(Drawable drawable) {
        this.f1338c = new DrawableProperties();
        this.f1336a = drawable;
        DrawableUtils.m1341a(this.f1336a, this, this);
    }

    public Drawable m1335b(Drawable drawable) {
        Drawable drawable2 = this.f1336a;
        DrawableUtils.m1341a(drawable2, null, null);
        DrawableUtils.m1341a(drawable, null, null);
        DrawableUtils.m1343a(drawable, this.f1338c);
        DrawableUtils.m1342a(drawable, (Drawable) this);
        DrawableUtils.m1341a(drawable, this, this);
        this.f1336a = drawable;
        invalidateSelf();
        return drawable2;
    }

    public int getOpacity() {
        return this.f1336a.getOpacity();
    }

    public void setAlpha(int i) {
        this.f1338c.f1343a = i;
        this.f1336a.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1338c.m1337a(colorFilter);
        this.f1336a.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f1338c.m1338a(z);
        this.f1336a.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f1338c.m1339b(z);
        this.f1336a.setFilterBitmap(z);
    }

    public boolean setVisible(boolean z, boolean z2) {
        super.setVisible(z, z2);
        return this.f1336a.setVisible(z, z2);
    }

    protected void onBoundsChange(Rect rect) {
        this.f1336a.setBounds(rect);
    }

    public boolean isStateful() {
        return this.f1336a.isStateful();
    }

    protected boolean onStateChange(int[] iArr) {
        return this.f1336a.setState(iArr);
    }

    protected boolean onLevelChange(int i) {
        return this.f1336a.setLevel(i);
    }

    public void draw(Canvas canvas) {
        this.f1336a.draw(canvas);
    }

    public int getIntrinsicWidth() {
        return this.f1336a.getIntrinsicWidth();
    }

    public int getIntrinsicHeight() {
        return this.f1336a.getIntrinsicHeight();
    }

    public boolean getPadding(Rect rect) {
        return this.f1336a.getPadding(rect);
    }

    public Drawable mutate() {
        this.f1336a.mutate();
        return this;
    }

    public Drawable getCurrent() {
        return this.f1336a;
    }

    public final Drawable m1331a(Drawable drawable) {
        return m1335b(drawable);
    }

    public final Drawable m1330a() {
        return getCurrent();
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public final void m1334a(TransformCallback transformCallback) {
        this.f1337b = transformCallback;
    }

    protected final void m1336b(Matrix matrix) {
        if (this.f1337b != null) {
            this.f1337b.m1323a(matrix);
        } else {
            matrix.reset();
        }
    }

    public void m1332a(Matrix matrix) {
        m1336b(matrix);
    }

    public final void m1333a(RectF rectF) {
        if (this.f1337b != null) {
            this.f1337b.m1324a(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @TargetApi(21)
    public void setHotspot(float f, float f2) {
        this.f1336a.setHotspot(f, f2);
    }
}
