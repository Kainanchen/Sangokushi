package com.facebook.imagepipeline.memory;

import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.util.SparseIntArray;
import com.facebook.common.p016g.MemoryTrimmableRegistry;
import com.facebook.common.p016g.NoOpMemoryTrimmableRegistry;
import com.google.protobuf.CodedOutputStream;
import com.tencent.mm.sdk.modelmsg.WXMediaMessage;
import javax.annotation.concurrent.Immutable;

@Immutable
/* renamed from: com.facebook.imagepipeline.memory.r */
public final class PoolConfig {
    final PoolParams f2477a;
    final PoolStatsTracker f2478b;
    public final PoolParams f2479c;
    public final MemoryTrimmableRegistry f2480d;
    final PoolParams f2481e;
    final PoolStatsTracker f2482f;
    final PoolParams f2483g;
    final PoolStatsTracker f2484h;

    /* renamed from: com.facebook.imagepipeline.memory.r.a */
    public static class PoolConfig {
        PoolParams f2469a;
        PoolStatsTracker f2470b;
        PoolParams f2471c;
        MemoryTrimmableRegistry f2472d;
        PoolParams f2473e;
        PoolStatsTracker f2474f;
        PoolParams f2475g;
        PoolStatsTracker f2476h;

        private PoolConfig() {
        }
    }

    private PoolConfig(PoolConfig poolConfig) {
        PoolParams a;
        PoolStatsTracker a2;
        MemoryTrimmableRegistry a3;
        if (poolConfig.f2469a == null) {
            a = DefaultBitmapPoolParams.m2377a();
        } else {
            a = poolConfig.f2469a;
        }
        this.f2477a = a;
        if (poolConfig.f2470b == null) {
            a2 = NoOpPoolStatsTracker.m2421a();
        } else {
            a2 = poolConfig.f2470b;
        }
        this.f2478b = a2;
        if (poolConfig.f2471c == null) {
            a = DefaultFlexByteArrayPoolParams.m2379a();
        } else {
            a = poolConfig.f2471c;
        }
        this.f2479c = a;
        if (poolConfig.f2472d == null) {
            a3 = NoOpMemoryTrimmableRegistry.m1090a();
        } else {
            a3 = poolConfig.f2472d;
        }
        this.f2480d = a3;
        if (poolConfig.f2473e == null) {
            SparseIntArray sparseIntArray = new SparseIntArray();
            sparseIntArray.put(AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT, 5);
            sparseIntArray.put(AccessibilityNodeInfoCompat.ACTION_PREVIOUS_HTML_ELEMENT, 5);
            sparseIntArray.put(CodedOutputStream.DEFAULT_BUFFER_SIZE, 5);
            sparseIntArray.put(AccessibilityNodeInfoCompat.ACTION_SCROLL_BACKWARD, 5);
            sparseIntArray.put(AccessibilityNodeInfoCompat.ACTION_COPY, 5);
            sparseIntArray.put(WXMediaMessage.THUMB_LENGTH_LIMIT, 5);
            sparseIntArray.put(AccessibilityNodeInfoCompat.ACTION_CUT, 5);
            sparseIntArray.put(AccessibilityNodeInfoCompat.ACTION_SET_SELECTION, 5);
            sparseIntArray.put(AccessibilityNodeInfoCompat.ACTION_EXPAND, 2);
            sparseIntArray.put(AccessibilityNodeInfoCompat.ACTION_COLLAPSE, 2);
            sparseIntArray.put(AccessibilityNodeInfoCompat.ACTION_DISMISS, 2);
            int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
            if (min < AccessibilityEventCompat.TYPE_ASSIST_READING_CONTEXT) {
                min = 3145728;
            } else if (min < 33554432) {
                min = 6291456;
            } else {
                min = 12582912;
            }
            int min2 = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
            if (min2 < AccessibilityEventCompat.TYPE_ASSIST_READING_CONTEXT) {
                min2 /= 2;
            } else {
                min2 = (min2 / 4) * 3;
            }
            a = new PoolParams(min, min2, sparseIntArray);
        } else {
            a = poolConfig.f2473e;
        }
        this.f2481e = a;
        if (poolConfig.f2474f == null) {
            a2 = NoOpPoolStatsTracker.m2421a();
        } else {
            a2 = poolConfig.f2474f;
        }
        this.f2482f = a2;
        if (poolConfig.f2475g == null) {
            SparseIntArray sparseIntArray2 = new SparseIntArray();
            sparseIntArray2.put(AccessibilityNodeInfoCompat.ACTION_COPY, 5);
            a = new PoolParams(81920, AccessibilityNodeInfoCompat.ACTION_DISMISS, sparseIntArray2);
        } else {
            a = poolConfig.f2475g;
        }
        this.f2483g = a;
        if (poolConfig.f2476h == null) {
            a2 = NoOpPoolStatsTracker.m2421a();
        } else {
            a2 = poolConfig.f2476h;
        }
        this.f2484h = a2;
    }
}
