package com.facebook.drawee.p030d;

import android.annotation.TargetApi;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import com.facebook.common.p011d.Preconditions;
import javax.annotation.Nullable;

/* renamed from: com.facebook.drawee.d.a */
public class ArrayDrawable extends Drawable implements Callback, TransformAwareDrawable, TransformCallback {
    public final DrawableParent[] f1327a;
    private TransformCallback f1328b;
    private final DrawableProperties f1329c;
    private final Drawable[] f1330d;
    private final Rect f1331e;
    private boolean f1332f;
    private boolean f1333g;
    private boolean f1334h;

    /* renamed from: com.facebook.drawee.d.a.1 */
    class ArrayDrawable implements DrawableParent {
        final /* synthetic */ int f1325a;
        final /* synthetic */ ArrayDrawable f1326b;

        public ArrayDrawable(ArrayDrawable arrayDrawable) {
            this.f1326b = arrayDrawable;
            this.f1325a = 1;
        }

        public final Drawable m1321a(Drawable drawable) {
            return this.f1326b.m1326a(this.f1325a, drawable);
        }

        public final Drawable m1320a() {
            return this.f1326b.m1325a(this.f1325a);
        }
    }

    public ArrayDrawable(Drawable[] drawableArr) {
        int i = 0;
        this.f1329c = new DrawableProperties();
        this.f1331e = new Rect();
        this.f1332f = false;
        this.f1333g = false;
        this.f1334h = false;
        Preconditions.m1030a((Object) drawableArr);
        this.f1330d = drawableArr;
        while (i < this.f1330d.length) {
            DrawableUtils.m1341a(this.f1330d[i], this, this);
            i++;
        }
        this.f1327a = new DrawableParent[this.f1330d.length];
    }

    @Nullable
    public final Drawable m1325a(int i) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.m1033a(z);
        if (i >= this.f1330d.length) {
            z2 = false;
        }
        Preconditions.m1033a(z2);
        return this.f1330d[i];
    }

    @Nullable
    public final Drawable m1326a(int i, @Nullable Drawable drawable) {
        boolean z = true;
        Preconditions.m1033a(i >= 0);
        if (i >= this.f1330d.length) {
            z = false;
        }
        Preconditions.m1033a(z);
        Drawable drawable2 = this.f1330d[i];
        if (drawable != drawable2) {
            if (drawable != null && this.f1334h) {
                drawable.mutate();
            }
            DrawableUtils.m1341a(this.f1330d[i], null, null);
            DrawableUtils.m1341a(drawable, null, null);
            DrawableUtils.m1343a(drawable, this.f1329c);
            DrawableUtils.m1342a(drawable, (Drawable) this);
            DrawableUtils.m1341a(drawable, this, this);
            this.f1333g = false;
            this.f1330d[i] = drawable;
            invalidateSelf();
        }
        return drawable2;
    }

    public int getIntrinsicWidth() {
        int i = -1;
        for (Drawable drawable : this.f1330d) {
            if (drawable != null) {
                i = Math.max(i, drawable.getIntrinsicWidth());
            }
        }
        return i > 0 ? i : -1;
    }

    public int getIntrinsicHeight() {
        int i = -1;
        for (Drawable drawable : this.f1330d) {
            if (drawable != null) {
                i = Math.max(i, drawable.getIntrinsicHeight());
            }
        }
        return i > 0 ? i : -1;
    }

    protected void onBoundsChange(Rect rect) {
        for (Drawable drawable : this.f1330d) {
            if (drawable != null) {
                drawable.setBounds(rect);
            }
        }
    }

    public boolean isStateful() {
        if (!this.f1333g) {
            this.f1332f = false;
            for (Drawable drawable : this.f1330d) {
                int i;
                boolean z = this.f1332f;
                if (drawable == null || !drawable.isStateful()) {
                    i = 0;
                } else {
                    i = 1;
                }
                this.f1332f = i | z;
            }
            this.f1333g = true;
        }
        return this.f1332f;
    }

    protected boolean onStateChange(int[] iArr) {
        int i = 0;
        boolean z = false;
        while (i < this.f1330d.length) {
            Drawable drawable = this.f1330d[i];
            if (drawable != null && drawable.setState(iArr)) {
                z = true;
            }
            i++;
        }
        return z;
    }

    protected boolean onLevelChange(int i) {
        int i2 = 0;
        boolean z = false;
        while (i2 < this.f1330d.length) {
            Drawable drawable = this.f1330d[i2];
            if (drawable != null && drawable.setLevel(i)) {
                z = true;
            }
            i2++;
        }
        return z;
    }

    public void draw(Canvas canvas) {
        for (Drawable drawable : this.f1330d) {
            if (drawable != null) {
                drawable.draw(canvas);
            }
        }
    }

    public boolean getPadding(Rect rect) {
        int i = 0;
        rect.left = 0;
        rect.top = 0;
        rect.right = 0;
        rect.bottom = 0;
        Rect rect2 = this.f1331e;
        while (i < this.f1330d.length) {
            Drawable drawable = this.f1330d[i];
            if (drawable != null) {
                drawable.getPadding(rect2);
                rect.left = Math.max(rect.left, rect2.left);
                rect.top = Math.max(rect.top, rect2.top);
                rect.right = Math.max(rect.right, rect2.right);
                rect.bottom = Math.max(rect.bottom, rect2.bottom);
            }
            i++;
        }
        return true;
    }

    public Drawable mutate() {
        for (Drawable drawable : this.f1330d) {
            if (drawable != null) {
                drawable.mutate();
            }
        }
        this.f1334h = true;
        return this;
    }

    public int getOpacity() {
        if (this.f1330d.length == 0) {
            return -2;
        }
        int i = -1;
        for (int i2 = 1; i2 < this.f1330d.length; i2++) {
            Drawable drawable = this.f1330d[i2];
            if (drawable != null) {
                i = Drawable.resolveOpacity(i, drawable.getOpacity());
            }
        }
        return i;
    }

    public void setAlpha(int i) {
        this.f1329c.f1343a = i;
        for (Drawable drawable : this.f1330d) {
            if (drawable != null) {
                drawable.setAlpha(i);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1329c.m1337a(colorFilter);
        for (Drawable drawable : this.f1330d) {
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z) {
        this.f1329c.m1338a(z);
        for (Drawable drawable : this.f1330d) {
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    public void setFilterBitmap(boolean z) {
        this.f1329c.m1339b(z);
        for (Drawable drawable : this.f1330d) {
            if (drawable != null) {
                drawable.setFilterBitmap(z);
            }
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        for (Drawable drawable : this.f1330d) {
            if (drawable != null) {
                drawable.setVisible(z, z2);
            }
        }
        return visible;
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

    public final void m1329a(TransformCallback transformCallback) {
        this.f1328b = transformCallback;
    }

    public final void m1327a(Matrix matrix) {
        if (this.f1328b != null) {
            this.f1328b.m1323a(matrix);
        } else {
            matrix.reset();
        }
    }

    public final void m1328a(RectF rectF) {
        if (this.f1328b != null) {
            this.f1328b.m1324a(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @TargetApi(21)
    public void setHotspot(float f, float f2) {
        for (Drawable drawable : this.f1330d) {
            if (drawable != null) {
                drawable.setHotspot(f, f2);
            }
        }
    }
}
