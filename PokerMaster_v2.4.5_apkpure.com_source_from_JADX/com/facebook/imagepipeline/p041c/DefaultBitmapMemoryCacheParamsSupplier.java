package com.facebook.imagepipeline.p041c;

import android.app.ActivityManager;
import android.os.Build.VERSION;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.common.p011d.Supplier;

/* renamed from: com.facebook.imagepipeline.c.i */
public final class DefaultBitmapMemoryCacheParamsSupplier implements Supplier<MemoryCacheParams> {
    private final ActivityManager f1953a;

    public final /* synthetic */ Object m1911a() {
        int min = Math.min(this.f1953a.getMemoryClass() * AccessibilityNodeInfoCompat.ACTION_DISMISS, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
        if (min < 33554432) {
            min = AccessibilityEventCompat.TYPE_WINDOWS_CHANGED;
        } else if (min < 67108864) {
            min = 6291456;
        } else if (VERSION.SDK_INT < 11) {
            min = AccessibilityEventCompat.TYPE_VIEW_CONTEXT_CLICKED;
        } else {
            min /= 4;
        }
        return new MemoryCacheParams(min, AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    }

    public DefaultBitmapMemoryCacheParamsSupplier(ActivityManager activityManager) {
        this.f1953a = activityManager;
    }
}
