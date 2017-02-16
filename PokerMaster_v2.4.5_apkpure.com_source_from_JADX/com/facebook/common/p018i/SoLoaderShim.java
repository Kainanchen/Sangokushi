package com.facebook.common.p018i;

/* renamed from: com.facebook.common.i.a */
public final class SoLoaderShim {
    private static volatile SoLoaderShim f1134a;

    /* renamed from: com.facebook.common.i.a.b */
    public interface SoLoaderShim {
        void m1109a(String str);
    }

    /* renamed from: com.facebook.common.i.a.a */
    public static class SoLoaderShim implements SoLoaderShim {
        public final void m1110a(String str) {
            System.loadLibrary(str);
        }
    }

    static {
        f1134a = new SoLoaderShim();
    }

    public static void m1111a(String str) {
        f1134a.m1109a(str);
    }
}
