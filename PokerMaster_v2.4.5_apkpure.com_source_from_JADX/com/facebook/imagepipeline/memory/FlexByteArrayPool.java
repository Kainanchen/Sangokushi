package com.facebook.imagepipeline.memory;

import com.facebook.common.p011d.Preconditions;
import com.facebook.common.p016g.MemoryTrimmableRegistry;
import com.facebook.common.p017h.CloseableReference;
import com.facebook.common.p017h.ResourceReleaser;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* renamed from: com.facebook.imagepipeline.memory.i */
public final class FlexByteArrayPool {
    final FlexByteArrayPool f2457a;
    private final ResourceReleaser<byte[]> f2458b;

    /* renamed from: com.facebook.imagepipeline.memory.i.1 */
    class FlexByteArrayPool implements ResourceReleaser<byte[]> {
        final /* synthetic */ FlexByteArrayPool f2455a;

        FlexByteArrayPool(FlexByteArrayPool flexByteArrayPool) {
            this.f2455a = flexByteArrayPool;
        }

        public final /* bridge */ /* synthetic */ void m2380a(Object obj) {
            this.f2455a.f2457a.m2355a((Object) (byte[]) obj);
        }
    }

    /* renamed from: com.facebook.imagepipeline.memory.i.a */
    static class FlexByteArrayPool extends GenericByteArrayPool {
        public FlexByteArrayPool(MemoryTrimmableRegistry memoryTrimmableRegistry, PoolParams poolParams, PoolStatsTracker poolStatsTracker) {
            super(memoryTrimmableRegistry, poolParams, poolStatsTracker);
        }

        final Bucket<byte[]> m2386e(int i) {
            return new OOMSoftReferenceBucket(i, this.b.f2497f);
        }
    }

    public FlexByteArrayPool(MemoryTrimmableRegistry memoryTrimmableRegistry, PoolParams poolParams) {
        Preconditions.m1033a(poolParams.f2497f > 0);
        this.f2457a = new FlexByteArrayPool(memoryTrimmableRegistry, poolParams, NoOpPoolStatsTracker.m2421a());
        this.f2458b = new FlexByteArrayPool(this);
    }

    public final CloseableReference<byte[]> m2387a(int i) {
        return CloseableReference.m1094a(this.f2457a.m2354a(i), this.f2458b);
    }
}
