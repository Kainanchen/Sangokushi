package com.facebook.imagepipeline.memory;

/* renamed from: com.facebook.imagepipeline.memory.o */
public final class NoOpPoolStatsTracker implements PoolStatsTracker {
    private static NoOpPoolStatsTracker f2467a;

    static {
        f2467a = null;
    }

    private NoOpPoolStatsTracker() {
    }

    public static synchronized NoOpPoolStatsTracker m2421a() {
        NoOpPoolStatsTracker noOpPoolStatsTracker;
        synchronized (NoOpPoolStatsTracker.class) {
            if (f2467a == null) {
                f2467a = new NoOpPoolStatsTracker();
            }
            noOpPoolStatsTracker = f2467a;
        }
        return noOpPoolStatsTracker;
    }
}
