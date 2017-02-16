package com.facebook.drawee.p030d;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Path.FillType;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.common.p011d.Preconditions;
import java.util.Arrays;
import net.sqlcipher.database.SQLiteDatabase;

/* renamed from: com.facebook.drawee.d.m */
public final class RoundedCornersDrawable extends ForwardingDrawable implements Rounded {
    int f1406a;
    final float[] f1407c;
    final Paint f1408d;
    public int f1409e;
    private final float[] f1410f;
    private boolean f1411g;
    private float f1412h;
    private int f1413i;
    private float f1414j;
    private final Path f1415k;
    private final Path f1416l;
    private final RectF f1417m;

    /* renamed from: com.facebook.drawee.d.m.1 */
    static /* synthetic */ class RoundedCornersDrawable {
        static final /* synthetic */ int[] f1402a;

        static {
            f1402a = new int[RoundedCornersDrawable.m1367a().length];
            try {
                f1402a[RoundedCornersDrawable.f1404b - 1] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f1402a[RoundedCornersDrawable.f1403a - 1] = 2;
            } catch (NoSuchFieldError e2) {
            }
        }
    }

    /* renamed from: com.facebook.drawee.d.m.a */
    public enum RoundedCornersDrawable {
        ;

        public static int[] m1367a() {
            return (int[]) f1405c.clone();
        }

        static {
            f1403a = 1;
            f1404b = 2;
            f1405c = new int[]{f1403a, f1404b};
        }
    }

    public RoundedCornersDrawable(Drawable drawable) {
        super((Drawable) Preconditions.m1030a((Object) drawable));
        this.f1406a = RoundedCornersDrawable.f1403a;
        this.f1410f = new float[8];
        this.f1407c = new float[8];
        this.f1408d = new Paint(1);
        this.f1411g = false;
        this.f1412h = 0.0f;
        this.f1413i = 0;
        this.f1409e = 0;
        this.f1414j = 0.0f;
        this.f1415k = new Path();
        this.f1416l = new Path();
        this.f1417m = new RectF();
    }

    public final void m1371a(boolean z) {
        this.f1411g = z;
        m1368b();
        invalidateSelf();
    }

    public final void m1372a(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f1410f, 0.0f);
        } else {
            boolean z;
            if (fArr.length == 8) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.m1034a(z, (Object) "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f1410f, 0, 8);
        }
        m1368b();
        invalidateSelf();
    }

    public final void m1370a(int i, float f) {
        this.f1413i = i;
        this.f1412h = f;
        m1368b();
        invalidateSelf();
    }

    public final void m1369a(float f) {
        this.f1414j = f;
        m1368b();
        invalidateSelf();
    }

    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m1368b();
    }

    private void m1368b() {
        this.f1415k.reset();
        this.f1416l.reset();
        this.f1417m.set(getBounds());
        this.f1417m.inset(this.f1414j, this.f1414j);
        if (this.f1411g) {
            this.f1415k.addCircle(this.f1417m.centerX(), this.f1417m.centerY(), Math.min(this.f1417m.width(), this.f1417m.height()) / 2.0f, Direction.CW);
        } else {
            this.f1415k.addRoundRect(this.f1417m, this.f1410f, Direction.CW);
        }
        this.f1417m.inset(-this.f1414j, -this.f1414j);
        this.f1417m.inset(this.f1412h / 2.0f, this.f1412h / 2.0f);
        if (this.f1411g) {
            this.f1416l.addCircle(this.f1417m.centerX(), this.f1417m.centerY(), Math.min(this.f1417m.width(), this.f1417m.height()) / 2.0f, Direction.CW);
        } else {
            for (int i = 0; i < this.f1407c.length; i++) {
                this.f1407c[i] = (this.f1410f[i] + this.f1414j) - (this.f1412h / 2.0f);
            }
            this.f1416l.addRoundRect(this.f1417m, this.f1407c, Direction.CW);
        }
        this.f1417m.inset((-this.f1412h) / 2.0f, (-this.f1412h) / 2.0f);
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        switch (RoundedCornersDrawable.f1402a[this.f1406a - 1]) {
            case SQLiteDatabase.OPEN_READONLY /*1*/:
                int save = canvas.save();
                this.f1415k.setFillType(FillType.EVEN_ODD);
                canvas.clipPath(this.f1415k);
                super.draw(canvas);
                canvas.restoreToCount(save);
                break;
            case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                super.draw(canvas);
                this.f1408d.setColor(this.f1409e);
                this.f1408d.setStyle(Style.FILL);
                this.f1415k.setFillType(FillType.INVERSE_EVEN_ODD);
                canvas.drawPath(this.f1415k, this.f1408d);
                if (this.f1411g) {
                    float width = (((float) (bounds.width() - bounds.height())) + this.f1412h) / 2.0f;
                    float height = (((float) (bounds.height() - bounds.width())) + this.f1412h) / 2.0f;
                    if (width > 0.0f) {
                        canvas.drawRect((float) bounds.left, (float) bounds.top, ((float) bounds.left) + width, (float) bounds.bottom, this.f1408d);
                        canvas.drawRect(((float) bounds.right) - width, (float) bounds.top, (float) bounds.right, (float) bounds.bottom, this.f1408d);
                    }
                    if (height > 0.0f) {
                        canvas.drawRect((float) bounds.left, (float) bounds.top, (float) bounds.right, ((float) bounds.top) + height, this.f1408d);
                        canvas.drawRect((float) bounds.left, ((float) bounds.bottom) - height, (float) bounds.right, (float) bounds.bottom, this.f1408d);
                        break;
                    }
                }
                break;
        }
        if (this.f1413i != 0) {
            this.f1408d.setStyle(Style.STROKE);
            this.f1408d.setColor(this.f1413i);
            this.f1408d.setStrokeWidth(this.f1412h);
            this.f1415k.setFillType(FillType.EVEN_ODD);
            canvas.drawPath(this.f1416l, this.f1408d);
        }
    }
}
