package com.facebook.drawee.p030d;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Path.FillType;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import com.facebook.common.p011d.Preconditions;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import javax.annotation.Nullable;

/* renamed from: com.facebook.drawee.d.k */
public final class RoundedBitmapDrawable extends BitmapDrawable implements Rounded, TransformAwareDrawable {
    final float[] f1365a;
    final RectF f1366b;
    final RectF f1367c;
    final RectF f1368d;
    final RectF f1369e;
    final Matrix f1370f;
    final Matrix f1371g;
    final Matrix f1372h;
    final Matrix f1373i;
    final Matrix f1374j;
    final Matrix f1375k;
    private boolean f1376l;
    private boolean f1377m;
    private final float[] f1378n;
    private float f1379o;
    private int f1380p;
    private float f1381q;
    private final Path f1382r;
    private final Path f1383s;
    private boolean f1384t;
    private final Paint f1385u;
    private final Paint f1386v;
    private boolean f1387w;
    private WeakReference<Bitmap> f1388x;
    @Nullable
    private TransformCallback f1389y;

    public RoundedBitmapDrawable(Resources resources, Bitmap bitmap, @Nullable Paint paint) {
        super(resources, bitmap);
        this.f1376l = false;
        this.f1377m = false;
        this.f1378n = new float[8];
        this.f1365a = new float[8];
        this.f1366b = new RectF();
        this.f1367c = new RectF();
        this.f1368d = new RectF();
        this.f1369e = new RectF();
        this.f1370f = new Matrix();
        this.f1371g = new Matrix();
        this.f1372h = new Matrix();
        this.f1373i = new Matrix();
        this.f1374j = new Matrix();
        this.f1375k = new Matrix();
        this.f1379o = 0.0f;
        this.f1380p = 0;
        this.f1381q = 0.0f;
        this.f1382r = new Path();
        this.f1383s = new Path();
        this.f1384t = true;
        this.f1385u = new Paint();
        this.f1386v = new Paint(1);
        this.f1387w = true;
        if (paint != null) {
            this.f1385u.set(paint);
        }
        this.f1385u.setFlags(1);
        this.f1386v.setStyle(Style.STROKE);
    }

    public final void m1359a(boolean z) {
        this.f1376l = z;
        this.f1384t = true;
        invalidateSelf();
    }

    public final void m1360a(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f1378n, 0.0f);
            this.f1377m = false;
        } else {
            boolean z;
            if (fArr.length == 8) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.m1034a(z, (Object) "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f1378n, 0, 8);
            this.f1377m = false;
            for (int i = 0; i < 8; i++) {
                int i2;
                boolean z2 = this.f1377m;
                if (fArr[i] > 0.0f) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                this.f1377m = i2 | z2;
            }
        }
        this.f1384t = true;
        invalidateSelf();
    }

    public final void m1357a(int i, float f) {
        if (this.f1380p != i || this.f1379o != f) {
            this.f1380p = i;
            this.f1379o = f;
            this.f1384t = true;
            invalidateSelf();
        }
    }

    public final void m1356a(float f) {
        if (this.f1381q != f) {
            this.f1381q = f;
            this.f1384t = true;
            invalidateSelf();
        }
    }

    public final void m1358a(@Nullable TransformCallback transformCallback) {
        this.f1389y = transformCallback;
    }

    public final void setAlpha(int i) {
        if (i != this.f1385u.getAlpha()) {
            this.f1385u.setAlpha(i);
            super.setAlpha(i);
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f1385u.setColorFilter(colorFilter);
        super.setColorFilter(colorFilter);
    }

    public final void draw(Canvas canvas) {
        boolean z;
        if (this.f1376l || this.f1377m || this.f1379o > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i;
            if (this.f1389y != null) {
                this.f1389y.m1323a(this.f1372h);
                this.f1389y.m1324a(this.f1366b);
            } else {
                this.f1372h.reset();
                this.f1366b.set(getBounds());
            }
            this.f1368d.set(0.0f, 0.0f, (float) getBitmap().getWidth(), (float) getBitmap().getHeight());
            this.f1369e.set(getBounds());
            this.f1370f.setRectToRect(this.f1368d, this.f1369e, ScaleToFit.FILL);
            if (!(this.f1372h.equals(this.f1373i) && this.f1370f.equals(this.f1371g))) {
                this.f1387w = true;
                this.f1372h.invert(this.f1374j);
                this.f1375k.set(this.f1372h);
                this.f1375k.preConcat(this.f1370f);
                this.f1373i.set(this.f1372h);
                this.f1371g.set(this.f1370f);
            }
            if (!this.f1366b.equals(this.f1367c)) {
                this.f1384t = true;
                this.f1367c.set(this.f1366b);
            }
            if (this.f1384t) {
                this.f1383s.reset();
                this.f1366b.inset(this.f1379o / 2.0f, this.f1379o / 2.0f);
                if (this.f1376l) {
                    this.f1383s.addCircle(this.f1366b.centerX(), this.f1366b.centerY(), Math.min(this.f1366b.width(), this.f1366b.height()) / 2.0f, Direction.CW);
                } else {
                    for (i = 0; i < this.f1365a.length; i++) {
                        this.f1365a[i] = (this.f1378n[i] + this.f1381q) - (this.f1379o / 2.0f);
                    }
                    this.f1383s.addRoundRect(this.f1366b, this.f1365a, Direction.CW);
                }
                this.f1366b.inset((-this.f1379o) / 2.0f, (-this.f1379o) / 2.0f);
                this.f1382r.reset();
                this.f1366b.inset(this.f1381q, this.f1381q);
                if (this.f1376l) {
                    this.f1382r.addCircle(this.f1366b.centerX(), this.f1366b.centerY(), Math.min(this.f1366b.width(), this.f1366b.height()) / 2.0f, Direction.CW);
                } else {
                    this.f1382r.addRoundRect(this.f1366b, this.f1378n, Direction.CW);
                }
                this.f1366b.inset(-this.f1381q, -this.f1381q);
                this.f1382r.setFillType(FillType.WINDING);
                this.f1384t = false;
            }
            Bitmap bitmap = getBitmap();
            if (this.f1388x == null || this.f1388x.get() != bitmap) {
                this.f1388x = new WeakReference(bitmap);
                this.f1385u.setShader(new BitmapShader(bitmap, TileMode.CLAMP, TileMode.CLAMP));
                this.f1387w = true;
            }
            if (this.f1387w) {
                this.f1385u.getShader().setLocalMatrix(this.f1375k);
                this.f1387w = false;
            }
            i = canvas.save();
            canvas.concat(this.f1374j);
            canvas.drawPath(this.f1382r, this.f1385u);
            if (this.f1379o > 0.0f) {
                this.f1386v.setStrokeWidth(this.f1379o);
                this.f1386v.setColor(DrawableUtils.m1340a(this.f1380p, this.f1385u.getAlpha()));
                canvas.drawPath(this.f1383s, this.f1386v);
            }
            canvas.restoreToCount(i);
            return;
        }
        super.draw(canvas);
    }
}
