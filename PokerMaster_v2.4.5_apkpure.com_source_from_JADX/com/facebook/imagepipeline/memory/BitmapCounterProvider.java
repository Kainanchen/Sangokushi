package com.facebook.imagepipeline.memory;

/* renamed from: com.facebook.imagepipeline.memory.c */
public final class BitmapCounterProvider {
    public static final int f2447a;
    private static BitmapCounter f2448b;

    public static BitmapCounter m2367a() {
        if (f2448b == null) {
            f2448b = new BitmapCounter(f2447a);
        }
        return f2448b;
    }

    static {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (((long) min) > 16777216) {
            min = (min / 4) * 3;
        } else {
            min /= 2;
        }
        f2447a = min;
    }
}
