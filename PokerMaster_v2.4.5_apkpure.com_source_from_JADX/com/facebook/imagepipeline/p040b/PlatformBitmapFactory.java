package com.facebook.imagepipeline.p040b;

/* renamed from: com.facebook.imagepipeline.b.e */
public abstract class PlatformBitmapFactory {
    private static PlatformBitmapFactory f1897a;

    /* renamed from: com.facebook.imagepipeline.b.e.a */
    public interface PlatformBitmapFactory {
    }

    public static void m1863a(PlatformBitmapFactory platformBitmapFactory) {
        if (f1897a == null) {
            f1897a = platformBitmapFactory;
        }
    }
}
