package com.facebook.drawee.p030d;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.support.v4.view.MotionEventCompat;
import com.android.volley.DefaultRetryPolicy;
import com.facebook.common.p011d.Preconditions;
import java.util.Arrays;
import net.sqlcipher.database.SQLiteDatabase;

/* renamed from: com.facebook.drawee.d.f */
public final class FadeDrawable extends ArrayDrawable {
    public int f1348b;
    public int f1349c;
    long f1350d;
    int[] f1351e;
    int[] f1352f;
    int f1353g;
    public boolean[] f1354h;
    int f1355i;
    private final Drawable[] f1356j;

    public FadeDrawable(Drawable[] drawableArr) {
        super(drawableArr);
        Preconditions.m1036b(drawableArr.length > 0, "At least one layer required!");
        this.f1356j = drawableArr;
        this.f1351e = new int[drawableArr.length];
        this.f1352f = new int[drawableArr.length];
        this.f1353g = MotionEventCompat.ACTION_MASK;
        this.f1354h = new boolean[drawableArr.length];
        this.f1355i = 0;
        this.f1348b = 2;
        Arrays.fill(this.f1351e, 0);
        this.f1351e[0] = MotionEventCompat.ACTION_MASK;
        Arrays.fill(this.f1352f, 0);
        this.f1352f[0] = MotionEventCompat.ACTION_MASK;
        Arrays.fill(this.f1354h, false);
        this.f1354h[0] = true;
    }

    public final void invalidateSelf() {
        if (this.f1355i == 0) {
            super.invalidateSelf();
        }
    }

    public final void m1345a() {
        this.f1355i++;
    }

    public final void m1346b() {
        this.f1355i--;
        invalidateSelf();
    }

    public final void m1347c() {
        this.f1348b = 2;
        for (int i = 0; i < this.f1356j.length; i++) {
            int i2;
            int[] iArr = this.f1352f;
            if (this.f1354h[i]) {
                i2 = MotionEventCompat.ACTION_MASK;
            } else {
                i2 = 0;
            }
            iArr[i] = i2;
        }
        invalidateSelf();
    }

    private boolean m1344a(float f) {
        int i = 0;
        boolean z = true;
        while (i < this.f1356j.length) {
            this.f1352f[i] = (int) ((((float) ((this.f1354h[i] ? 1 : -1) * MotionEventCompat.ACTION_MASK)) * f) + ((float) this.f1351e[i]));
            if (this.f1352f[i] < 0) {
                this.f1352f[i] = 0;
            }
            if (this.f1352f[i] > 255) {
                this.f1352f[i] = MotionEventCompat.ACTION_MASK;
            }
            if (this.f1354h[i] && this.f1352f[i] < 255) {
                z = false;
            }
            if (!this.f1354h[i] && this.f1352f[i] > 0) {
                z = false;
            }
            i++;
        }
        return z;
    }

    public final void draw(Canvas canvas) {
        int i = 2;
        int i2 = 0;
        boolean z = true;
        switch (this.f1348b) {
            case SQLiteDatabase.OPEN_READWRITE /*0*/:
                int i3;
                System.arraycopy(this.f1352f, 0, this.f1351e, 0, this.f1356j.length);
                this.f1350d = SystemClock.uptimeMillis();
                boolean a = m1344a(this.f1349c == 0 ? DefaultRetryPolicy.DEFAULT_BACKOFF_MULT : 0.0f);
                if (a) {
                    i3 = 2;
                } else {
                    i3 = 1;
                }
                this.f1348b = i3;
                z = a;
                break;
            case SQLiteDatabase.OPEN_READONLY /*1*/:
                boolean z2;
                if (this.f1349c > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Preconditions.m1035b(z2);
                z2 = m1344a(((float) (SystemClock.uptimeMillis() - this.f1350d)) / ((float) this.f1349c));
                if (!z2) {
                    i = 1;
                }
                this.f1348b = i;
                z = z2;
                break;
        }
        while (i2 < this.f1356j.length) {
            Drawable drawable = this.f1356j[i2];
            i = (this.f1352f[i2] * this.f1353g) / MotionEventCompat.ACTION_MASK;
            if (drawable != null && i > 0) {
                this.f1355i++;
                drawable.mutate().setAlpha(i);
                this.f1355i--;
                drawable.draw(canvas);
            }
            i2++;
        }
        if (!z) {
            invalidateSelf();
        }
    }

    public final void setAlpha(int i) {
        if (this.f1353g != i) {
            this.f1353g = i;
            invalidateSelf();
        }
    }

    public final int getAlpha() {
        return this.f1353g;
    }
}
