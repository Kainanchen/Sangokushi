package com.facebook.drawee.p031e;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import com.facebook.common.p011d.Preconditions;
import com.facebook.drawee.R.R;
import com.facebook.drawee.p030d.AutoRotateDrawable;
import com.facebook.drawee.p030d.ScalingUtils.ScalingUtils;
import com.facebook.drawee.p031e.RoundingParams.RoundingParams;
import com.tencent.mm.sdk.modelpay.PayReq.Options;
import com.texaspoker.moment.TexasPoker.QuickGameRoomPushMsg;
import com.texaspoker.moment.TexasPoker.SCGameActionRsp;
import java.util.Arrays;
import javax.annotation.Nullable;
import net.sqlcipher.database.SQLiteDatabase;

/* renamed from: com.facebook.drawee.e.c */
public final class GenericDraweeHierarchyInflater {
    public static GenericDraweeHierarchyBuilder m1415a(GenericDraweeHierarchyBuilder genericDraweeHierarchyBuilder, Context context, @Nullable AttributeSet attributeSet) {
        int i = 0;
        int i2 = 0;
        boolean z = true;
        boolean z2 = true;
        boolean z3 = true;
        boolean z4 = true;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.GenericDraweeHierarchy);
            try {
                int indexCount = obtainStyledAttributes.getIndexCount();
                for (int i3 = 0; i3 < indexCount; i3++) {
                    int index = obtainStyledAttributes.getIndex(i3);
                    if (index == R.GenericDraweeHierarchy_actualImageScaleType) {
                        genericDraweeHierarchyBuilder.f1460n = GenericDraweeHierarchyInflater.m1414a(obtainStyledAttributes, index);
                        genericDraweeHierarchyBuilder.f1461o = null;
                    } else if (index == R.GenericDraweeHierarchy_placeholderImage) {
                        genericDraweeHierarchyBuilder.f1452f = GenericDraweeHierarchyInflater.m1413a(context, obtainStyledAttributes, index);
                    } else if (index == R.GenericDraweeHierarchy_pressedStateOverlayImage) {
                        Drawable a = GenericDraweeHierarchyInflater.m1413a(context, obtainStyledAttributes, index);
                        if (a == null) {
                            genericDraweeHierarchyBuilder.f1466t = null;
                        } else {
                            Drawable stateListDrawable = new StateListDrawable();
                            stateListDrawable.addState(new int[]{16842919}, a);
                            genericDraweeHierarchyBuilder.f1466t = stateListDrawable;
                        }
                    } else if (index == R.GenericDraweeHierarchy_progressBarImage) {
                        genericDraweeHierarchyBuilder.f1458l = GenericDraweeHierarchyInflater.m1413a(context, obtainStyledAttributes, index);
                    } else if (index == R.GenericDraweeHierarchy_fadeDuration) {
                        genericDraweeHierarchyBuilder.f1450d = obtainStyledAttributes.getInt(index, 0);
                    } else if (index == R.GenericDraweeHierarchy_viewAspectRatio) {
                        genericDraweeHierarchyBuilder.f1451e = obtainStyledAttributes.getFloat(index, 0.0f);
                    } else if (index == R.GenericDraweeHierarchy_placeholderImageScaleType) {
                        genericDraweeHierarchyBuilder.f1453g = GenericDraweeHierarchyInflater.m1414a(obtainStyledAttributes, index);
                    } else if (index == R.GenericDraweeHierarchy_retryImage) {
                        genericDraweeHierarchyBuilder.f1454h = GenericDraweeHierarchyInflater.m1413a(context, obtainStyledAttributes, index);
                    } else if (index == R.GenericDraweeHierarchy_retryImageScaleType) {
                        genericDraweeHierarchyBuilder.f1455i = GenericDraweeHierarchyInflater.m1414a(obtainStyledAttributes, index);
                    } else if (index == R.GenericDraweeHierarchy_failureImage) {
                        genericDraweeHierarchyBuilder.f1456j = GenericDraweeHierarchyInflater.m1413a(context, obtainStyledAttributes, index);
                    } else if (index == R.GenericDraweeHierarchy_failureImageScaleType) {
                        genericDraweeHierarchyBuilder.f1457k = GenericDraweeHierarchyInflater.m1414a(obtainStyledAttributes, index);
                    } else if (index == R.GenericDraweeHierarchy_progressBarImageScaleType) {
                        genericDraweeHierarchyBuilder.f1459m = GenericDraweeHierarchyInflater.m1414a(obtainStyledAttributes, index);
                    } else if (index == R.GenericDraweeHierarchy_progressBarAutoRotateInterval) {
                        i = obtainStyledAttributes.getInteger(index, i);
                    } else if (index == R.GenericDraweeHierarchy_backgroundImage) {
                        genericDraweeHierarchyBuilder.f1464r = GenericDraweeHierarchyInflater.m1413a(context, obtainStyledAttributes, index);
                    } else if (index == R.GenericDraweeHierarchy_overlayImage) {
                        if (GenericDraweeHierarchyInflater.m1413a(context, obtainStyledAttributes, index) == null) {
                            genericDraweeHierarchyBuilder.f1465s = null;
                        } else {
                            genericDraweeHierarchyBuilder.f1465s = Arrays.asList(new Drawable[]{GenericDraweeHierarchyInflater.m1413a(context, obtainStyledAttributes, index)});
                        }
                    } else if (index == R.GenericDraweeHierarchy_roundAsCircle) {
                        GenericDraweeHierarchyInflater.m1416a(genericDraweeHierarchyBuilder).f1474b = obtainStyledAttributes.getBoolean(index, false);
                    } else if (index == R.GenericDraweeHierarchy_roundedCornerRadius) {
                        i2 = obtainStyledAttributes.getDimensionPixelSize(index, i2);
                    } else if (index == R.GenericDraweeHierarchy_roundTopLeft) {
                        z = obtainStyledAttributes.getBoolean(index, z);
                    } else if (index == R.GenericDraweeHierarchy_roundTopRight) {
                        z2 = obtainStyledAttributes.getBoolean(index, z2);
                    } else if (index == R.GenericDraweeHierarchy_roundBottomLeft) {
                        z3 = obtainStyledAttributes.getBoolean(index, z3);
                    } else if (index == R.GenericDraweeHierarchy_roundBottomRight) {
                        z4 = obtainStyledAttributes.getBoolean(index, z4);
                    } else if (index == R.GenericDraweeHierarchy_roundWithOverlayColor) {
                        r12 = GenericDraweeHierarchyInflater.m1416a(genericDraweeHierarchyBuilder);
                        r12.f1476d = obtainStyledAttributes.getColor(index, 0);
                        r12.f1473a = RoundingParams.OVERLAY_COLOR;
                    } else if (index == R.GenericDraweeHierarchy_roundingBorderWidth) {
                        r12 = GenericDraweeHierarchyInflater.m1416a(genericDraweeHierarchyBuilder);
                        r13 = (float) obtainStyledAttributes.getDimensionPixelSize(index, 0);
                        Preconditions.m1034a(r13 >= 0.0f, (Object) "the border width cannot be < 0");
                        r12.f1477e = r13;
                    } else if (index == R.GenericDraweeHierarchy_roundingBorderColor) {
                        GenericDraweeHierarchyInflater.m1416a(genericDraweeHierarchyBuilder).f1478f = obtainStyledAttributes.getColor(index, 0);
                    } else if (index == R.GenericDraweeHierarchy_roundingBorderPadding) {
                        r12 = GenericDraweeHierarchyInflater.m1416a(genericDraweeHierarchyBuilder);
                        r13 = (float) obtainStyledAttributes.getDimensionPixelSize(index, 0);
                        Preconditions.m1034a(r13 >= 0.0f, (Object) "the padding cannot be < 0");
                        r12.f1479g = r13;
                    }
                }
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        if (genericDraweeHierarchyBuilder.f1458l != null && i > 0) {
            genericDraweeHierarchyBuilder.f1458l = new AutoRotateDrawable(genericDraweeHierarchyBuilder.f1458l, i);
        }
        if (i2 > 0) {
            float f;
            float f2;
            float f3;
            float f4;
            RoundingParams a2 = GenericDraweeHierarchyInflater.m1416a(genericDraweeHierarchyBuilder);
            if (z) {
                f = (float) i2;
            } else {
                f = 0.0f;
            }
            if (z2) {
                f2 = (float) i2;
            } else {
                f2 = 0.0f;
            }
            if (z4) {
                f3 = (float) i2;
            } else {
                f3 = 0.0f;
            }
            if (z3) {
                f4 = (float) i2;
            } else {
                f4 = 0.0f;
            }
            if (a2.f1475c == null) {
                a2.f1475c = new float[8];
            }
            float[] fArr = a2.f1475c;
            fArr[1] = f;
            fArr[0] = f;
            fArr[3] = f2;
            fArr[2] = f2;
            fArr[5] = f3;
            fArr[4] = f3;
            fArr[7] = f4;
            fArr[6] = f4;
        }
        return genericDraweeHierarchyBuilder;
    }

    @Nullable
    private static Drawable m1413a(Context context, TypedArray typedArray, int i) {
        int resourceId = typedArray.getResourceId(i, 0);
        return resourceId == 0 ? null : context.getResources().getDrawable(resourceId);
    }

    @Nullable
    private static ScalingUtils m1414a(TypedArray typedArray, int i) {
        switch (typedArray.getInt(i, -2)) {
            case Options.INVALID_FLAGS /*-1*/:
                return null;
            case SQLiteDatabase.OPEN_READWRITE /*0*/:
                return ScalingUtils.f1425a;
            case SQLiteDatabase.OPEN_READONLY /*1*/:
                return ScalingUtils.f1426b;
            case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                return ScalingUtils.f1427c;
            case SQLiteDatabase.CONFLICT_FAIL /*3*/:
                return ScalingUtils.f1428d;
            case SQLiteDatabase.CONFLICT_IGNORE /*4*/:
                return ScalingUtils.f1429e;
            case SQLiteDatabase.CONFLICT_REPLACE /*5*/:
                return ScalingUtils.f1430f;
            case SCGameActionRsp.LBETTINGID_FIELD_NUMBER /*6*/:
                return ScalingUtils.f1431g;
            case QuickGameRoomPushMsg.STFROMUSER_FIELD_NUMBER /*7*/:
                return ScalingUtils.f1432h;
            default:
                throw new RuntimeException("XML attribute not specified!");
        }
    }

    private static RoundingParams m1416a(GenericDraweeHierarchyBuilder genericDraweeHierarchyBuilder) {
        if (genericDraweeHierarchyBuilder.f1467u == null) {
            genericDraweeHierarchyBuilder.f1467u = new RoundingParams();
        }
        return genericDraweeHierarchyBuilder.f1467u;
    }
}
