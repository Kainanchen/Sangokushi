package com.facebook.common.p011d;

import javax.annotation.Nullable;

/* renamed from: com.facebook.common.d.j */
public final class Throwables {
    private static <X extends Throwable> void m1038a(@Nullable Throwable th, Class<X> cls) {
        if (th != null && cls.isInstance(th)) {
            throw ((Throwable) cls.cast(th));
        }
    }

    public static void m1037a(@Nullable Throwable th) {
        Throwables.m1038a(th, Error.class);
        Throwables.m1038a(th, RuntimeException.class);
    }

    public static RuntimeException m1039b(Throwable th) {
        Throwables.m1037a((Throwable) Preconditions.m1030a((Object) th));
        throw new RuntimeException(th);
    }
}
