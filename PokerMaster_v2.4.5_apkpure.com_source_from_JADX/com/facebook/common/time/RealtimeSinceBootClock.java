package com.facebook.common.time;

import android.os.SystemClock;
import com.facebook.common.p011d.DoNotStrip;

@DoNotStrip
public class RealtimeSinceBootClock {
    private static final RealtimeSinceBootClock f1168a;

    static {
        f1168a = new RealtimeSinceBootClock();
    }

    private RealtimeSinceBootClock() {
    }

    @DoNotStrip
    public static RealtimeSinceBootClock get() {
        return f1168a;
    }

    public static long m1140a() {
        return SystemClock.elapsedRealtime();
    }
}
