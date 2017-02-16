package com.facebook.p007c.p008a;

/* renamed from: com.facebook.c.a.f */
public final class NoOpCacheErrorLogger implements CacheErrorLogger {
    private static NoOpCacheErrorLogger f991a;

    static {
        f991a = null;
    }

    private NoOpCacheErrorLogger() {
    }

    public static synchronized NoOpCacheErrorLogger m910a() {
        NoOpCacheErrorLogger noOpCacheErrorLogger;
        synchronized (NoOpCacheErrorLogger.class) {
            if (f991a == null) {
                f991a = new NoOpCacheErrorLogger();
            }
            noOpCacheErrorLogger = f991a;
        }
        return noOpCacheErrorLogger;
    }
}
