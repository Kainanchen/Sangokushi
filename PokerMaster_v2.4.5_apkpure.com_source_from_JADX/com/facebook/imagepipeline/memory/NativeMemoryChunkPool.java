package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.common.p011d.Preconditions;
import com.facebook.common.p016g.MemoryTrimmableRegistry;
import com.facebook.imagepipeline.memory.BasePool.BasePool;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* renamed from: com.facebook.imagepipeline.memory.k */
public final class NativeMemoryChunkPool extends BasePool<NativeMemoryChunk> {
    final int[] f2459g;

    protected final /* synthetic */ void m2389b(Object obj) {
        obj = (NativeMemoryChunk) obj;
        Preconditions.m1030a(obj);
        obj.close();
    }

    protected final /* synthetic */ int m2391c(Object obj) {
        obj = (NativeMemoryChunk) obj;
        Preconditions.m1030a(obj);
        return obj.f2426b;
    }

    protected final /* synthetic */ boolean m2393d(Object obj) {
        obj = (NativeMemoryChunk) obj;
        Preconditions.m1030a(obj);
        return !obj.m2340a();
    }

    public NativeMemoryChunkPool(MemoryTrimmableRegistry memoryTrimmableRegistry, PoolParams poolParams, PoolStatsTracker poolStatsTracker) {
        super(memoryTrimmableRegistry, poolParams, poolStatsTracker);
        SparseIntArray sparseIntArray = poolParams.f2494c;
        this.f2459g = new int[sparseIntArray.size()];
        for (int i = 0; i < this.f2459g.length; i++) {
            this.f2459g[i] = sparseIntArray.keyAt(i);
        }
    }

    protected final int m2392d(int i) {
        return i;
    }

    protected final int m2390c(int i) {
        if (i <= 0) {
            throw new BasePool(Integer.valueOf(i));
        }
        for (int i2 : this.f2459g) {
            if (i2 >= i) {
                return i2;
            }
        }
        return i;
    }

    protected final /* synthetic */ Object m2388b(int i) {
        return new NativeMemoryChunk(i);
    }
}
