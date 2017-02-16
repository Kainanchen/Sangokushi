package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.common.p011d.Preconditions;
import com.facebook.common.p016g.MemoryTrimmableRegistry;
import com.facebook.imagepipeline.memory.BasePool.BasePool;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* renamed from: com.facebook.imagepipeline.memory.j */
public class GenericByteArrayPool extends BasePool<byte[]> implements ByteArrayPool {
    private final int[] f2456g;

    protected final /* synthetic */ void m2382b(Object obj) {
        Preconditions.m1030a((byte[]) obj);
    }

    protected final /* synthetic */ int m2384c(Object obj) {
        obj = (byte[]) obj;
        Preconditions.m1030a(obj);
        return obj.length;
    }

    public GenericByteArrayPool(MemoryTrimmableRegistry memoryTrimmableRegistry, PoolParams poolParams, PoolStatsTracker poolStatsTracker) {
        super(memoryTrimmableRegistry, poolParams, poolStatsTracker);
        SparseIntArray sparseIntArray = poolParams.f2494c;
        this.f2456g = new int[sparseIntArray.size()];
        for (int i = 0; i < sparseIntArray.size(); i++) {
            this.f2456g[i] = sparseIntArray.keyAt(i);
        }
    }

    protected final int m2385d(int i) {
        return i;
    }

    protected final int m2383c(int i) {
        if (i <= 0) {
            throw new BasePool(Integer.valueOf(i));
        }
        for (int i2 : this.f2456g) {
            if (i2 >= i) {
                return i2;
            }
        }
        return i;
    }
}
