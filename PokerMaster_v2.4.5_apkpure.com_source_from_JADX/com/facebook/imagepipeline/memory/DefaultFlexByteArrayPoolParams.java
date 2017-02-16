package com.facebook.imagepipeline.memory;

import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.util.SparseIntArray;

/* renamed from: com.facebook.imagepipeline.memory.h */
public final class DefaultFlexByteArrayPoolParams {
    public static final int f2454a;

    static {
        f2454a = Runtime.getRuntime().availableProcessors();
    }

    private static SparseIntArray m2378a(int i) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        for (int i2 = AccessibilityNodeInfoCompat.ACTION_SET_SELECTION; i2 <= AccessibilityEventCompat.TYPE_WINDOWS_CHANGED; i2 *= 2) {
            sparseIntArray.put(i2, i);
        }
        return sparseIntArray;
    }

    public static PoolParams m2379a() {
        return new PoolParams(AccessibilityEventCompat.TYPE_WINDOWS_CHANGED, f2454a * AccessibilityEventCompat.TYPE_WINDOWS_CHANGED, DefaultFlexByteArrayPoolParams.m2378a(f2454a), AccessibilityNodeInfoCompat.ACTION_SET_SELECTION, AccessibilityEventCompat.TYPE_WINDOWS_CHANGED, f2454a);
    }
}
