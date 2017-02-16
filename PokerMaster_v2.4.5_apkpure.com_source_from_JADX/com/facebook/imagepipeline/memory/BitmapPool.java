package com.facebook.imagepipeline.memory;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.facebook.common.p011d.Preconditions;
import com.facebook.common.p016g.MemoryTrimmableRegistry;
import javax.annotation.concurrent.ThreadSafe;

@TargetApi(21)
@ThreadSafe
/* renamed from: com.facebook.imagepipeline.memory.d */
public final class BitmapPool extends BasePool<Bitmap> {
    protected final /* synthetic */ void m2369b(Object obj) {
        obj = (Bitmap) obj;
        Preconditions.m1030a(obj);
        obj.recycle();
    }

    protected final /* synthetic */ int m2371c(Object obj) {
        obj = (Bitmap) obj;
        Preconditions.m1030a(obj);
        return obj.getAllocationByteCount();
    }

    protected final /* synthetic */ boolean m2373d(Object obj) {
        obj = (Bitmap) obj;
        Preconditions.m1030a(obj);
        return !obj.isRecycled() && obj.isMutable();
    }

    public BitmapPool(MemoryTrimmableRegistry memoryTrimmableRegistry, PoolParams poolParams, PoolStatsTracker poolStatsTracker) {
        super(memoryTrimmableRegistry, poolParams, poolStatsTracker);
    }

    protected final int m2370c(int i) {
        return i;
    }

    protected final int m2372d(int i) {
        return i;
    }

    protected final /* synthetic */ Object m2368b(int i) {
        return Bitmap.createBitmap(1, (int) Math.ceil(((double) i) / 2.0d), Config.RGB_565);
    }
}
