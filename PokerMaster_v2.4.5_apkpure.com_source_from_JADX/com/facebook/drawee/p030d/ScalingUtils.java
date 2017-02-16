package com.facebook.drawee.p030d;

import android.graphics.Matrix;
import android.graphics.Rect;
import com.android.volley.DefaultRetryPolicy;

/* renamed from: com.facebook.drawee.d.o */
public final class ScalingUtils {

    /* renamed from: com.facebook.drawee.d.o.b */
    public interface ScalingUtils {
        public static final ScalingUtils f1425a;
        public static final ScalingUtils f1426b;
        public static final ScalingUtils f1427c;
        public static final ScalingUtils f1428d;
        public static final ScalingUtils f1429e;
        public static final ScalingUtils f1430f;
        public static final ScalingUtils f1431g;
        public static final ScalingUtils f1432h;

        Matrix m1377a(Matrix matrix, Rect rect, int i, int i2, float f, float f2);

        static {
            f1425a = ScalingUtils.f1439i;
            f1426b = ScalingUtils.f1438i;
            f1427c = ScalingUtils.f1436i;
            f1428d = ScalingUtils.f1437i;
            f1429e = ScalingUtils.f1433i;
            f1430f = ScalingUtils.f1435i;
            f1431g = ScalingUtils.f1434i;
            f1432h = ScalingUtils.f1440i;
        }
    }

    /* renamed from: com.facebook.drawee.d.o.a */
    public static abstract class ScalingUtils implements ScalingUtils {
        public abstract void m1379a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4);

        public final Matrix m1378a(Matrix matrix, Rect rect, int i, int i2, float f, float f2) {
            m1379a(matrix, rect, i, i2, f, f2, ((float) rect.width()) / ((float) i), ((float) rect.height()) / ((float) i2));
            return matrix;
        }
    }

    /* renamed from: com.facebook.drawee.d.o.c */
    private static class ScalingUtils extends ScalingUtils {
        public static final ScalingUtils f1433i;

        private ScalingUtils() {
        }

        static {
            f1433i = new ScalingUtils();
        }

        public final void m1380a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            matrix.setTranslate((float) ((int) ((((float) rect.left) + (((float) (rect.width() - i)) * 0.5f)) + 0.5f)), (float) ((int) ((((float) rect.top) + (((float) (rect.height() - i2)) * 0.5f)) + 0.5f)));
        }
    }

    /* renamed from: com.facebook.drawee.d.o.d */
    private static class ScalingUtils extends ScalingUtils {
        public static final ScalingUtils f1434i;

        private ScalingUtils() {
        }

        static {
            f1434i = new ScalingUtils();
        }

        public final void m1381a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float width;
            float f5;
            if (f4 > f3) {
                width = ((float) rect.left) + ((((float) rect.width()) - (((float) i) * f4)) * 0.5f);
                f5 = (float) rect.top;
            } else {
                width = (float) rect.left;
                f5 = ((float) rect.top) + ((((float) rect.height()) - (((float) i2) * f3)) * 0.5f);
                f4 = f3;
            }
            matrix.setScale(f4, f4);
            matrix.postTranslate((float) ((int) (width + 0.5f)), (float) ((int) (f5 + 0.5f)));
        }
    }

    /* renamed from: com.facebook.drawee.d.o.e */
    private static class ScalingUtils extends ScalingUtils {
        public static final ScalingUtils f1435i;

        private ScalingUtils() {
        }

        static {
            f1435i = new ScalingUtils();
        }

        public final void m1382a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(Math.min(f3, f4), DefaultRetryPolicy.DEFAULT_BACKOFF_MULT);
            float width = ((float) rect.left) + ((((float) rect.width()) - (((float) i) * min)) * 0.5f);
            float height = ((float) rect.top) + ((((float) rect.height()) - (((float) i2) * min)) * 0.5f);
            matrix.setScale(min, min);
            matrix.postTranslate((float) ((int) (width + 0.5f)), (float) ((int) (height + 0.5f)));
        }
    }

    /* renamed from: com.facebook.drawee.d.o.f */
    private static class ScalingUtils extends ScalingUtils {
        public static final ScalingUtils f1436i;

        private ScalingUtils() {
        }

        static {
            f1436i = new ScalingUtils();
        }

        public final void m1383a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(f3, f4);
            float width = ((float) rect.left) + ((((float) rect.width()) - (((float) i) * min)) * 0.5f);
            float height = ((float) rect.top) + ((((float) rect.height()) - (((float) i2) * min)) * 0.5f);
            matrix.setScale(min, min);
            matrix.postTranslate((float) ((int) (width + 0.5f)), (float) ((int) (height + 0.5f)));
        }
    }

    /* renamed from: com.facebook.drawee.d.o.g */
    private static class ScalingUtils extends ScalingUtils {
        public static final ScalingUtils f1437i;

        private ScalingUtils() {
        }

        static {
            f1437i = new ScalingUtils();
        }

        public final void m1384a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(f3, f4);
            float width = ((float) rect.left) + (((float) rect.width()) - (((float) i) * min));
            float height = ((float) rect.top) + (((float) rect.height()) - (((float) i2) * min));
            matrix.setScale(min, min);
            matrix.postTranslate((float) ((int) (width + 0.5f)), (float) ((int) (height + 0.5f)));
        }
    }

    /* renamed from: com.facebook.drawee.d.o.h */
    private static class ScalingUtils extends ScalingUtils {
        public static final ScalingUtils f1438i;

        private ScalingUtils() {
        }

        static {
            f1438i = new ScalingUtils();
        }

        public final void m1385a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(f3, f4);
            float f5 = (float) rect.left;
            float f6 = (float) rect.top;
            matrix.setScale(min, min);
            matrix.postTranslate((float) ((int) (f5 + 0.5f)), (float) ((int) (f6 + 0.5f)));
        }
    }

    /* renamed from: com.facebook.drawee.d.o.i */
    private static class ScalingUtils extends ScalingUtils {
        public static final ScalingUtils f1439i;

        private ScalingUtils() {
        }

        static {
            f1439i = new ScalingUtils();
        }

        public final void m1386a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float f5 = (float) rect.left;
            float f6 = (float) rect.top;
            matrix.setScale(f3, f4);
            matrix.postTranslate((float) ((int) (f5 + 0.5f)), (float) ((int) (f6 + 0.5f)));
        }
    }

    /* renamed from: com.facebook.drawee.d.o.j */
    private static class ScalingUtils extends ScalingUtils {
        public static final ScalingUtils f1440i;

        private ScalingUtils() {
        }

        static {
            f1440i = new ScalingUtils();
        }

        public final void m1387a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float f5;
            float max;
            if (f4 > f3) {
                f5 = (float) rect.left;
                max = Math.max(Math.min((((float) rect.width()) * 0.5f) - ((((float) i) * f4) * f), 0.0f), ((float) rect.width()) - (((float) i) * f4)) + f5;
                f5 = (float) rect.top;
            } else {
                max = (float) rect.left;
                float f6 = (float) rect.top;
                f5 = Math.max(Math.min((((float) rect.height()) * 0.5f) - ((((float) i2) * f3) * f2), 0.0f), ((float) rect.height()) - (((float) i2) * f3)) + f6;
                f4 = f3;
            }
            matrix.setScale(f4, f4);
            matrix.postTranslate((float) ((int) (max + 0.5f)), (float) ((int) (f5 + 0.5f)));
        }
    }

    /* renamed from: com.facebook.drawee.d.o.k */
    public interface ScalingUtils {
        Object m1388a();
    }
}
