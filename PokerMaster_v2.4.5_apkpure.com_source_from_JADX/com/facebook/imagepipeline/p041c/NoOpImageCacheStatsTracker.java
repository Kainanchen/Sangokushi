package com.facebook.imagepipeline.p041c;

/* renamed from: com.facebook.imagepipeline.c.t */
public final class NoOpImageCacheStatsTracker implements ImageCacheStatsTracker {
    private static NoOpImageCacheStatsTracker f1963a;

    static {
        f1963a = null;
    }

    private NoOpImageCacheStatsTracker() {
    }

    public static synchronized NoOpImageCacheStatsTracker m1920a() {
        NoOpImageCacheStatsTracker noOpImageCacheStatsTracker;
        synchronized (NoOpImageCacheStatsTracker.class) {
            if (f1963a == null) {
                f1963a = new NoOpImageCacheStatsTracker();
            }
            noOpImageCacheStatsTracker = f1963a;
        }
        return noOpImageCacheStatsTracker;
    }
}
