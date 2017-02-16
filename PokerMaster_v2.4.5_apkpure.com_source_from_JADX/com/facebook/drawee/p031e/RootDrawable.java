package com.facebook.drawee.p031e;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.p030d.ForwardingDrawable;
import com.facebook.drawee.p030d.VisibilityAwareDrawable;
import com.facebook.drawee.p030d.VisibilityCallback;
import javax.annotation.Nullable;

/* renamed from: com.facebook.drawee.e.d */
public final class RootDrawable extends ForwardingDrawable implements VisibilityAwareDrawable {
    @Nullable
    Drawable f1468a;
    @Nullable
    private VisibilityCallback f1469c;

    public RootDrawable(Drawable drawable) {
        super(drawable);
        this.f1468a = null;
    }

    public final int getIntrinsicWidth() {
        return -1;
    }

    public final int getIntrinsicHeight() {
        return -1;
    }

    public final void m1417a(@Nullable VisibilityCallback visibilityCallback) {
        this.f1469c = visibilityCallback;
    }

    public final boolean setVisible(boolean z, boolean z2) {
        if (this.f1469c != null) {
            this.f1469c.m1391a(z);
        }
        return super.setVisible(z, z2);
    }

    @SuppressLint({"WrongCall"})
    public final void draw(Canvas canvas) {
        if (isVisible()) {
            if (this.f1469c != null) {
                this.f1469c.m1390a();
            }
            super.draw(canvas);
            if (this.f1468a != null) {
                this.f1468a.setBounds(getBounds());
                this.f1468a.draw(canvas);
            }
        }
    }
}
