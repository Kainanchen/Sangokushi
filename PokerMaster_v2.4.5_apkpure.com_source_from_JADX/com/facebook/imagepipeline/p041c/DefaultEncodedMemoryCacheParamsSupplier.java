package com.facebook.imagepipeline.p041c;

import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.common.p011d.Supplier;

/* renamed from: com.facebook.imagepipeline.c.k */
public final class DefaultEncodedMemoryCacheParamsSupplier implements Supplier<MemoryCacheParams> {
    public final /* synthetic */ Object m1916a() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min < AccessibilityEventCompat.TYPE_ASSIST_READING_CONTEXT) {
            min = AccessibilityNodeInfoCompat.ACTION_DISMISS;
        } else if (min < 33554432) {
            min = AccessibilityNodeInfoCompat.ACTION_SET_TEXT;
        } else {
            min = AccessibilityEventCompat.TYPE_WINDOWS_CHANGED;
        }
        return new MemoryCacheParams(min, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, min, min / 8);
    }
}
