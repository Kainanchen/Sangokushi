package com.facebook.drawee.p031e;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.p030d.ScalingUtils.ScalingUtils;
import java.util.List;
import javax.annotation.Nullable;

/* renamed from: com.facebook.drawee.e.b */
public final class GenericDraweeHierarchyBuilder {
    public static final ScalingUtils f1447a;
    public static final ScalingUtils f1448b;
    Resources f1449c;
    int f1450d;
    public float f1451e;
    Drawable f1452f;
    @Nullable
    ScalingUtils f1453g;
    Drawable f1454h;
    ScalingUtils f1455i;
    Drawable f1456j;
    ScalingUtils f1457k;
    Drawable f1458l;
    ScalingUtils f1459m;
    ScalingUtils f1460n;
    Matrix f1461o;
    PointF f1462p;
    ColorFilter f1463q;
    Drawable f1464r;
    public List<Drawable> f1465s;
    Drawable f1466t;
    RoundingParams f1467u;

    static {
        f1447a = ScalingUtils.f1430f;
        f1448b = ScalingUtils.f1431g;
    }

    public GenericDraweeHierarchyBuilder(Resources resources) {
        this.f1449c = resources;
        this.f1450d = 300;
        this.f1451e = 0.0f;
        this.f1452f = null;
        this.f1453g = f1447a;
        this.f1454h = null;
        this.f1455i = f1447a;
        this.f1456j = null;
        this.f1457k = f1447a;
        this.f1458l = null;
        this.f1459m = f1447a;
        this.f1460n = f1448b;
        this.f1461o = null;
        this.f1462p = null;
        this.f1463q = null;
        this.f1464r = null;
        this.f1465s = null;
        this.f1466t = null;
        this.f1467u = null;
    }
}
