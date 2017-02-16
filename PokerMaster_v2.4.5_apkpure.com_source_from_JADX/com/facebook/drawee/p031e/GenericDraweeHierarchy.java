package com.facebook.drawee.p031e;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.facebook.common.p011d.Preconditions;
import com.facebook.drawee.p028g.SettableDraweeHierarchy;
import com.facebook.drawee.p030d.ArrayDrawable;
import com.facebook.drawee.p030d.DrawableParent;
import com.facebook.drawee.p030d.FadeDrawable;
import com.facebook.drawee.p030d.ForwardingDrawable;
import com.facebook.drawee.p030d.MatrixDrawable;
import com.facebook.drawee.p030d.ScaleTypeDrawable;
import com.facebook.drawee.p030d.ScalingUtils.ScalingUtils;
import java.util.Arrays;
import javax.annotation.Nullable;

/* renamed from: com.facebook.drawee.e.a */
public final class GenericDraweeHierarchy implements SettableDraweeHierarchy {
    private final Drawable f1441a;
    private final Resources f1442b;
    @Nullable
    private RoundingParams f1443c;
    private final RootDrawable f1444d;
    private final FadeDrawable f1445e;
    private final ForwardingDrawable f1446f;

    public GenericDraweeHierarchy(GenericDraweeHierarchyBuilder genericDraweeHierarchyBuilder) {
        int i;
        this.f1441a = new ColorDrawable(0);
        this.f1442b = genericDraweeHierarchyBuilder.f1449c;
        this.f1443c = genericDraweeHierarchyBuilder.f1467u;
        this.f1446f = new ForwardingDrawable(this.f1441a);
        int size = genericDraweeHierarchyBuilder.f1465s != null ? genericDraweeHierarchyBuilder.f1465s.size() : 1;
        if (genericDraweeHierarchyBuilder.f1466t != null) {
            i = 1;
        } else {
            i = 0;
        }
        size += i;
        Drawable[] drawableArr = new Drawable[(size + 6)];
        drawableArr[0] = m1399a(genericDraweeHierarchyBuilder.f1464r, null);
        drawableArr[1] = m1399a(genericDraweeHierarchyBuilder.f1452f, genericDraweeHierarchyBuilder.f1453g);
        Drawable drawable = this.f1446f;
        ScalingUtils scalingUtils = genericDraweeHierarchyBuilder.f1460n;
        PointF pointF = genericDraweeHierarchyBuilder.f1462p;
        Matrix matrix = genericDraweeHierarchyBuilder.f1461o;
        drawable.setColorFilter(genericDraweeHierarchyBuilder.f1463q);
        drawableArr[2] = WrappingUtils.m1418a(WrappingUtils.m1420a(drawable, scalingUtils, pointF), matrix);
        drawableArr[3] = m1399a(genericDraweeHierarchyBuilder.f1458l, genericDraweeHierarchyBuilder.f1459m);
        drawableArr[4] = m1399a(genericDraweeHierarchyBuilder.f1454h, genericDraweeHierarchyBuilder.f1455i);
        drawableArr[5] = m1399a(genericDraweeHierarchyBuilder.f1456j, genericDraweeHierarchyBuilder.f1457k);
        if (size > 0) {
            if (genericDraweeHierarchyBuilder.f1465s != null) {
                i = 0;
                for (Drawable a : genericDraweeHierarchyBuilder.f1465s) {
                    int i2 = i + 1;
                    drawableArr[i + 6] = m1399a(a, null);
                    i = i2;
                }
            } else {
                i = 1;
            }
            if (genericDraweeHierarchyBuilder.f1466t != null) {
                drawableArr[i + 6] = m1399a(genericDraweeHierarchyBuilder.f1466t, null);
            }
        }
        this.f1445e = new FadeDrawable(drawableArr);
        FadeDrawable fadeDrawable = this.f1445e;
        fadeDrawable.f1349c = genericDraweeHierarchyBuilder.f1450d;
        if (fadeDrawable.f1348b == 1) {
            fadeDrawable.f1348b = 0;
        }
        this.f1444d = new RootDrawable(WrappingUtils.m1421a(this.f1445e, this.f1443c));
        this.f1444d.mutate();
        m1403e();
    }

    @Nullable
    private Drawable m1399a(@Nullable Drawable drawable, @Nullable ScalingUtils scalingUtils) {
        return WrappingUtils.m1419a(WrappingUtils.m1422a(drawable, this.f1443c, this.f1442b), scalingUtils);
    }

    private void m1403e() {
        if (this.f1445e != null) {
            this.f1445e.m1345a();
            FadeDrawable fadeDrawable = this.f1445e;
            fadeDrawable.f1348b = 0;
            Arrays.fill(fadeDrawable.f1354h, true);
            fadeDrawable.invalidateSelf();
            m1404f();
            m1401b(1);
            this.f1445e.m1347c();
            this.f1445e.m1346b();
        }
    }

    private void m1404f() {
        m1402c(1);
        m1402c(2);
        m1402c(3);
        m1402c(4);
        m1402c(5);
    }

    private void m1401b(int i) {
        if (i >= 0) {
            FadeDrawable fadeDrawable = this.f1445e;
            fadeDrawable.f1348b = 0;
            fadeDrawable.f1354h[i] = true;
            fadeDrawable.invalidateSelf();
        }
    }

    private void m1402c(int i) {
        if (i >= 0) {
            FadeDrawable fadeDrawable = this.f1445e;
            fadeDrawable.f1348b = 0;
            fadeDrawable.f1354h[i] = false;
            fadeDrawable.invalidateSelf();
        }
    }

    private void m1400a(float f) {
        Drawable a = this.f1445e.m1325a(3);
        if (a != null) {
            if (f >= 0.999f) {
                if (a instanceof Animatable) {
                    ((Animatable) a).stop();
                }
                m1402c(3);
            } else {
                if (a instanceof Animatable) {
                    ((Animatable) a).start();
                }
                m1401b(3);
            }
            a.setLevel(Math.round(10000.0f * f));
        }
    }

    public final Drawable m1405a() {
        return this.f1444d;
    }

    public final void m1409a(Drawable drawable, float f, boolean z) {
        Drawable a = WrappingUtils.m1422a(drawable, this.f1443c, this.f1442b);
        a.mutate();
        this.f1446f.m1335b(a);
        this.f1445e.m1345a();
        m1404f();
        m1401b(2);
        m1400a(f);
        if (z) {
            this.f1445e.m1347c();
        }
        this.f1445e.m1346b();
    }

    public final void m1406a(float f, boolean z) {
        if (this.f1445e.m1325a(3) != null) {
            this.f1445e.m1345a();
            m1400a(f);
            if (z) {
                this.f1445e.m1347c();
            }
            this.f1445e.m1346b();
        }
    }

    public final void m1411c() {
        this.f1445e.m1345a();
        m1404f();
        if (this.f1445e.m1325a(5) != null) {
            m1401b(5);
        } else {
            m1401b(1);
        }
        this.f1445e.m1346b();
    }

    public final void m1412d() {
        this.f1445e.m1345a();
        m1404f();
        if (this.f1445e.m1325a(4) != null) {
            m1401b(4);
        } else {
            m1401b(1);
        }
        this.f1445e.m1346b();
    }

    public final void m1408a(@Nullable Drawable drawable) {
        RootDrawable rootDrawable = this.f1444d;
        rootDrawable.f1468a = drawable;
        rootDrawable.invalidateSelf();
    }

    public final void m1407a(int i) {
        Drawable drawable = this.f1442b.getDrawable(i);
        if (drawable == null) {
            this.f1445e.m1326a(1, null);
            return;
        }
        Drawable a = WrappingUtils.m1422a(drawable, this.f1443c, this.f1442b);
        ArrayDrawable arrayDrawable = this.f1445e;
        Preconditions.m1033a(true);
        Preconditions.m1033a(1 < arrayDrawable.f1327a.length);
        if (arrayDrawable.f1327a[1] == null) {
            arrayDrawable.f1327a[1] = new ArrayDrawable.ArrayDrawable(arrayDrawable);
        }
        DrawableParent drawableParent = arrayDrawable.f1327a[1];
        if (drawableParent.m1318a() instanceof MatrixDrawable) {
            drawableParent = (MatrixDrawable) drawableParent.m1318a();
        }
        if (drawableParent.m1318a() instanceof ScaleTypeDrawable) {
            drawableParent = (ScaleTypeDrawable) drawableParent.m1318a();
        }
        drawableParent.m1319a(a);
    }

    public final void m1410b() {
        this.f1446f.m1335b(this.f1441a);
        m1403e();
    }
}
