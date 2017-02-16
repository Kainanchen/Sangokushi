package com.facebook.drawee.p030d;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.view.MotionEventCompat;
import com.facebook.common.p011d.Preconditions;
import java.util.Arrays;

/* renamed from: com.facebook.drawee.d.l */
public final class RoundedColorDrawable extends Drawable implements Rounded {
    final float[] f1390a;
    final Paint f1391b;
    final Path f1392c;
    final Path f1393d;
    private final float[] f1394e;
    private boolean f1395f;
    private float f1396g;
    private float f1397h;
    private int f1398i;
    private int f1399j;
    private final RectF f1400k;
    private int f1401l;

    private RoundedColorDrawable(int i) {
        this.f1394e = new float[8];
        this.f1390a = new float[8];
        this.f1391b = new Paint(1);
        this.f1395f = false;
        this.f1396g = 0.0f;
        this.f1397h = 0.0f;
        this.f1398i = 0;
        this.f1392c = new Path();
        this.f1393d = new Path();
        this.f1399j = 0;
        this.f1400k = new RectF();
        this.f1401l = MotionEventCompat.ACTION_MASK;
        if (this.f1399j != i) {
            this.f1399j = i;
            invalidateSelf();
        }
    }

    public static RoundedColorDrawable m1361a(ColorDrawable colorDrawable) {
        return new RoundedColorDrawable(colorDrawable.getColor());
    }

    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m1362a();
    }

    public final void draw(Canvas canvas) {
        this.f1391b.setColor(DrawableUtils.m1340a(this.f1399j, this.f1401l));
        this.f1391b.setStyle(Style.FILL);
        canvas.drawPath(this.f1392c, this.f1391b);
        if (this.f1396g != 0.0f) {
            this.f1391b.setColor(DrawableUtils.m1340a(this.f1398i, this.f1401l));
            this.f1391b.setStyle(Style.STROKE);
            this.f1391b.setStrokeWidth(this.f1396g);
            canvas.drawPath(this.f1393d, this.f1391b);
        }
    }

    public final void m1365a(boolean z) {
        this.f1395f = z;
        m1362a();
        invalidateSelf();
    }

    public final void m1366a(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f1394e, 0.0f);
        } else {
            boolean z;
            if (fArr.length == 8) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.m1034a(z, (Object) "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f1394e, 0, 8);
        }
        m1362a();
        invalidateSelf();
    }

    public final void m1364a(int i, float f) {
        if (this.f1398i != i) {
            this.f1398i = i;
            invalidateSelf();
        }
        if (this.f1396g != f) {
            this.f1396g = f;
            m1362a();
            invalidateSelf();
        }
    }

    public final void m1363a(float f) {
        if (this.f1397h != f) {
            this.f1397h = f;
            m1362a();
            invalidateSelf();
        }
    }

    public final void setAlpha(int i) {
        if (i != this.f1401l) {
            this.f1401l = i;
            invalidateSelf();
        }
    }

    public final int getAlpha() {
        return this.f1401l;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final int getOpacity() {
        int a = DrawableUtils.m1340a(this.f1399j, this.f1401l) >>> 24;
        if (a == MotionEventCompat.ACTION_MASK) {
            return -1;
        }
        if (a == 0) {
            return -2;
        }
        return -3;
    }

    private void m1362a() {
        this.f1392c.reset();
        this.f1393d.reset();
        this.f1400k.set(getBounds());
        this.f1400k.inset(this.f1396g / 2.0f, this.f1396g / 2.0f);
        if (this.f1395f) {
            this.f1393d.addCircle(this.f1400k.centerX(), this.f1400k.centerY(), Math.min(this.f1400k.width(), this.f1400k.height()) / 2.0f, Direction.CW);
        } else {
            for (int i = 0; i < this.f1390a.length; i++) {
                this.f1390a[i] = (this.f1394e[i] + this.f1397h) - (this.f1396g / 2.0f);
            }
            this.f1393d.addRoundRect(this.f1400k, this.f1390a, Direction.CW);
        }
        this.f1400k.inset((-this.f1396g) / 2.0f, (-this.f1396g) / 2.0f);
        this.f1400k.inset(this.f1397h, this.f1397h);
        if (this.f1395f) {
            this.f1392c.addCircle(this.f1400k.centerX(), this.f1400k.centerY(), Math.min(this.f1400k.width(), this.f1400k.height()) / 2.0f, Direction.CW);
        } else {
            this.f1392c.addRoundRect(this.f1400k, this.f1394e, Direction.CW);
        }
        this.f1400k.inset(-this.f1397h, -this.f1397h);
    }
}
