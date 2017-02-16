package com.facebook.drawee.p030d;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.facebook.common.p011d.Preconditions;

/* renamed from: com.facebook.drawee.d.b */
public final class AutoRotateDrawable extends ForwardingDrawable implements Runnable {
    float f1339a;
    private int f1340c;
    private boolean f1341d;
    private boolean f1342e;

    public AutoRotateDrawable(Drawable drawable, int i) {
        this(drawable, i, (byte) 0);
    }

    private AutoRotateDrawable(Drawable drawable, int i, byte b) {
        super((Drawable) Preconditions.m1030a((Object) drawable));
        this.f1339a = 0.0f;
        this.f1342e = false;
        this.f1340c = i;
        this.f1341d = true;
    }

    public final void draw(Canvas canvas) {
        int save = canvas.save();
        Rect bounds = getBounds();
        int i = bounds.right - bounds.left;
        int i2 = bounds.bottom - bounds.top;
        float f = this.f1339a;
        if (!this.f1341d) {
            f = 360.0f - this.f1339a;
        }
        canvas.rotate(f, (float) ((i / 2) + bounds.left), (float) (bounds.top + (i2 / 2)));
        super.draw(canvas);
        canvas.restoreToCount(save);
        if (!this.f1342e) {
            this.f1342e = true;
            scheduleSelf(this, SystemClock.uptimeMillis() + 20);
        }
    }

    public final void run() {
        this.f1342e = false;
        this.f1339a += (float) ((int) ((20.0f / ((float) this.f1340c)) * 360.0f));
        invalidateSelf();
    }
}
