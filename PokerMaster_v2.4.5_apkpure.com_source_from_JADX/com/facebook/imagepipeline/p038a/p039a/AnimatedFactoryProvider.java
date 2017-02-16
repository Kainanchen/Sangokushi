package com.facebook.imagepipeline.p038a.p039a;

import com.facebook.imagepipeline.p040b.PlatformBitmapFactory;
import com.facebook.imagepipeline.p043e.ExecutorSupplier;

/* renamed from: com.facebook.imagepipeline.a.a.c */
public final class AnimatedFactoryProvider {
    private static boolean f1895a;
    private static AnimatedFactory f1896b;

    static {
        f1896b = null;
    }

    public static AnimatedFactory m1860a(PlatformBitmapFactory platformBitmapFactory, ExecutorSupplier executorSupplier) {
        if (!f1895a) {
            try {
                f1896b = (AnimatedFactory) Class.forName("com.facebook.imagepipeline.animated.factory.AnimatedFactoryImplSupport").getConstructor(new Class[]{PlatformBitmapFactory.class, ExecutorSupplier.class}).newInstance(new Object[]{platformBitmapFactory, executorSupplier});
            } catch (Throwable th) {
            }
            if (f1896b != null) {
                f1895a = true;
                return f1896b;
            }
            try {
                f1896b = (AnimatedFactory) Class.forName("com.facebook.imagepipeline.animated.factory.AnimatedFactoryImpl").getConstructor(new Class[]{PlatformBitmapFactory.class, ExecutorSupplier.class}).newInstance(new Object[]{platformBitmapFactory, executorSupplier});
            } catch (Throwable th2) {
            }
            f1895a = true;
        }
        return f1896b;
    }
}
