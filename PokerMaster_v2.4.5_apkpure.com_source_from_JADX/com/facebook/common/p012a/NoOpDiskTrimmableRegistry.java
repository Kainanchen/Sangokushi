package com.facebook.common.p012a;

/* renamed from: com.facebook.common.a.b */
public final class NoOpDiskTrimmableRegistry implements DiskTrimmableRegistry {
    private static NoOpDiskTrimmableRegistry f1100a;

    static {
        f1100a = null;
    }

    private NoOpDiskTrimmableRegistry() {
    }

    public static synchronized NoOpDiskTrimmableRegistry m1004a() {
        NoOpDiskTrimmableRegistry noOpDiskTrimmableRegistry;
        synchronized (NoOpDiskTrimmableRegistry.class) {
            if (f1100a == null) {
                f1100a = new NoOpDiskTrimmableRegistry();
            }
            noOpDiskTrimmableRegistry = f1100a;
        }
        return noOpDiskTrimmableRegistry;
    }
}
