package com.facebook.common.time;

import android.os.SystemClock;
import com.facebook.common.p011d.DoNotStrip;

@DoNotStrip
public class AwakeTimeSinceBootClock {
    @DoNotStrip
    private static final AwakeTimeSinceBootClock INSTANCE;

    static {
        INSTANCE = new AwakeTimeSinceBootClock();
    }

    private AwakeTimeSinceBootClock() {
    }

    @DoNotStrip
    public static AwakeTimeSinceBootClock get() {
        return INSTANCE;
    }

    @DoNotStrip
    public long now() {
        return SystemClock.uptimeMillis();
    }
}
