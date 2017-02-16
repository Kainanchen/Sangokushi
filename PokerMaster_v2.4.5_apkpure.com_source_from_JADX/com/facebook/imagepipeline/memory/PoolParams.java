package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.common.p011d.Preconditions;
import javax.annotation.Nullable;

/* renamed from: com.facebook.imagepipeline.memory.t */
public final class PoolParams {
    public final int f2492a;
    public final int f2493b;
    public final SparseIntArray f2494c;
    public final int f2495d;
    public final int f2496e;
    public final int f2497f;

    public PoolParams(int i, int i2, @Nullable SparseIntArray sparseIntArray) {
        this(i, i2, sparseIntArray, 0, ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, -1);
    }

    public PoolParams(int i, int i2, @Nullable SparseIntArray sparseIntArray, int i3, int i4, int i5) {
        boolean z = i >= 0 && i2 >= i;
        Preconditions.m1035b(z);
        this.f2493b = i;
        this.f2492a = i2;
        this.f2494c = sparseIntArray;
        this.f2495d = i3;
        this.f2496e = i4;
        this.f2497f = i5;
    }
}
