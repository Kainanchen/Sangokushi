package com.facebook.drawee.p030d;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.common.p011d.Preconditions;

/* renamed from: com.facebook.drawee.d.i */
public final class OrientedDrawable extends ForwardingDrawable {
    final Matrix f1361a;
    private int f1362c;
    private final Matrix f1363d;
    private final RectF f1364e;

    public OrientedDrawable(Drawable drawable, int i) {
        super(drawable);
        this.f1363d = new Matrix();
        this.f1364e = new RectF();
        Preconditions.m1033a(i % 90 == 0);
        this.f1361a = new Matrix();
        this.f1362c = i;
    }

    public final void draw(Canvas canvas) {
        if (this.f1362c <= 0) {
            super.draw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.concat(this.f1361a);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    public final int getIntrinsicWidth() {
        return this.f1362c % 180 == 0 ? super.getIntrinsicWidth() : super.getIntrinsicHeight();
    }

    public final int getIntrinsicHeight() {
        return this.f1362c % 180 == 0 ? super.getIntrinsicHeight() : super.getIntrinsicWidth();
    }

    protected final void onBoundsChange(Rect rect) {
        Drawable current = getCurrent();
        if (this.f1362c > 0) {
            this.f1361a.setRotate((float) this.f1362c, (float) rect.centerX(), (float) rect.centerY());
            this.f1363d.reset();
            this.f1361a.invert(this.f1363d);
            this.f1364e.set(rect);
            this.f1363d.mapRect(this.f1364e);
            current.setBounds((int) this.f1364e.left, (int) this.f1364e.top, (int) this.f1364e.right, (int) this.f1364e.bottom);
            return;
        }
        current.setBounds(rect);
    }

    public final void m1351a(Matrix matrix) {
        m1336b(matrix);
        if (!this.f1361a.isIdentity()) {
            matrix.preConcat(this.f1361a);
        }
    }
}
