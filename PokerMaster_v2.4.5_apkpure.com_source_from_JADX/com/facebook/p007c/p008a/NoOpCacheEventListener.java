package com.facebook.p007c.p008a;

/* renamed from: com.facebook.c.a.g */
public final class NoOpCacheEventListener implements CacheEventListener {
    private static NoOpCacheEventListener f992a;

    static {
        f992a = null;
    }

    private NoOpCacheEventListener() {
    }

    public static synchronized NoOpCacheEventListener m911a() {
        NoOpCacheEventListener noOpCacheEventListener;
        synchronized (NoOpCacheEventListener.class) {
            if (f992a == null) {
                f992a = new NoOpCacheEventListener();
            }
            noOpCacheEventListener = f992a;
        }
        return noOpCacheEventListener;
    }
}
