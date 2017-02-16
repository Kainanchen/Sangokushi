package com.tencent.p080b.p081a;

/* renamed from: com.tencent.b.a.d */
public enum C1059d {
    INSTANT(1),
    ONLY_WIFI(2),
    BATCH(3),
    APP_LAUNCH(4),
    DEVELOPER(5),
    PERIOD(6),
    ONLY_WIFI_NO_CACHE(7);
    
    int f8161h;

    private C1059d(int i) {
        this.f8161h = i;
    }

    public static C1059d m5787a(int i) {
        for (C1059d c1059d : C1059d.values()) {
            if (i == c1059d.f8161h) {
                return c1059d;
            }
        }
        return null;
    }
}
