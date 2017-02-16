package com.facebook.imagepipeline.p042d;

import javax.annotation.Nullable;

/* renamed from: com.facebook.imagepipeline.d.c */
public final class Priority {
    public static final int f1977a;
    public static final int f1978b;
    public static final int f1979c;
    private static final /* synthetic */ int[] f1980d;

    static {
        f1977a = 1;
        f1978b = 2;
        f1979c = 3;
        f1980d = new int[]{f1977a, f1978b, f1979c};
    }

    public static int m1928a(@Nullable int i, @Nullable int i2) {
        if (i == 0) {
            return i2;
        }
        if (i2 == 0) {
            return i;
        }
        if (i - 1 > i2 - 1) {
            return i;
        }
        return i2;
    }
}
