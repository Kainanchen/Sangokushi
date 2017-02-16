package com.tencent.android.tpush.stat;

/* compiled from: ProGuard */
public enum StatReportStrategy {
    INSTANT(1),
    ONLY_WIFI(2),
    BATCH(3),
    APP_LAUNCH(4),
    DEVELOPER(5),
    PERIOD(6),
    ONLY_WIFI_NO_CACHE(7);
    
    int f7806v;

    private StatReportStrategy(int i) {
        this.f7806v = i;
    }

    public final int m5446a() {
        return this.f7806v;
    }

    public static StatReportStrategy m5445a(int i) {
        for (StatReportStrategy statReportStrategy : values()) {
            if (i == statReportStrategy.m5446a()) {
                return statReportStrategy;
            }
        }
        return null;
    }
}
