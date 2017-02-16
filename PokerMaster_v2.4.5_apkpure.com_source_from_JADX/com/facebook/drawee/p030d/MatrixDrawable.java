package com.facebook.drawee.p030d;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.common.p011d.Preconditions;

/* renamed from: com.facebook.drawee.d.h */
public final class MatrixDrawable extends ForwardingDrawable {
    private Matrix f1357a;
    private Matrix f1358c;
    private int f1359d;
    private int f1360e;

    public MatrixDrawable(Drawable drawable, Matrix matrix) {
        super((Drawable) Preconditions.m1030a((Object) drawable));
        this.f1359d = 0;
        this.f1360e = 0;
        this.f1357a = matrix;
    }

    public final Drawable m1350b(Drawable drawable) {
        Drawable b = super.m1335b(drawable);
        m1348b();
        return b;
    }

    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m1348b();
    }

    private void m1348b() {
        Drawable current = getCurrent();
        Rect bounds = getBounds();
        int intrinsicWidth = current.getIntrinsicWidth();
        this.f1359d = intrinsicWidth;
        int intrinsicHeight = current.getIntrinsicHeight();
        this.f1360e = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            current.setBounds(bounds);
            this.f1358c = null;
            return;
        }
        current.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        this.f1358c = this.f1357a;
    }

    public final void m1349a(Matrix matrix) {
        super.m1332a(matrix);
        if (this.f1358c != null) {
            matrix.preConcat(this.f1358c);
        }
    }

    public final void draw(Canvas canvas) {
        if (!(this.f1359d == getCurrent().getIntrinsicWidth() && this.f1360e == getCurrent().getIntrinsicHeight())) {
            m1348b();
        }
        if (this.f1358c != null) {
            int save = canvas.save();
            canvas.clipRect(getBounds());
            canvas.concat(this.f1358c);
            super.draw(canvas);
            canvas.restoreToCount(save);
            return;
        }
        super.draw(canvas);
    }
}
