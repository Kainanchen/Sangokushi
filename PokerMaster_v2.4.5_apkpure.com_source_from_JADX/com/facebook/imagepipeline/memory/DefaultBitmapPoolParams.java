package com.facebook.imagepipeline.memory;

import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.util.SparseIntArray;

/* renamed from: com.facebook.imagepipeline.memory.g */
public final class DefaultBitmapPoolParams {
    private static final SparseIntArray f2453a;

    static {
        f2453a = new SparseIntArray(0);
    }

    public static PoolParams m2377a() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min > AccessibilityEventCompat.TYPE_ASSIST_READING_CONTEXT) {
            min = (min / 4) * 3;
        } else {
            min /= 2;
        }
        return new PoolParams(0, min, f2453a);
    }
}
