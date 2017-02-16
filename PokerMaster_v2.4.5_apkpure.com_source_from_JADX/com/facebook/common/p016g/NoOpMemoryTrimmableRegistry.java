package com.facebook.common.p016g;

/* renamed from: com.facebook.common.g.d */
public final class NoOpMemoryTrimmableRegistry implements MemoryTrimmableRegistry {
    private static NoOpMemoryTrimmableRegistry f1122a;

    static {
        f1122a = null;
    }

    public static synchronized NoOpMemoryTrimmableRegistry m1090a() {
        NoOpMemoryTrimmableRegistry noOpMemoryTrimmableRegistry;
        synchronized (NoOpMemoryTrimmableRegistry.class) {
            if (f1122a == null) {
                f1122a = new NoOpMemoryTrimmableRegistry();
            }
            noOpMemoryTrimmableRegistry = f1122a;
        }
        return noOpMemoryTrimmableRegistry;
    }
}
