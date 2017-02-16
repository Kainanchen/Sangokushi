package com.facebook.common.time;

/* renamed from: com.facebook.common.time.b */
public final class SystemClock implements Clock {
    private static final SystemClock f1169a;

    static {
        f1169a = new SystemClock();
    }

    private SystemClock() {
    }

    public static SystemClock m1142b() {
        return f1169a;
    }

    public final long m1143a() {
        return System.currentTimeMillis();
    }
}
