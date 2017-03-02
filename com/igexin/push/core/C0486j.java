package com.igexin.push.core;

/* renamed from: com.igexin.push.core.j */
/* synthetic */ class C0486j {
    static final /* synthetic */ int[] f1346a;
    static final /* synthetic */ int[] f1347b;

    static {
        f1347b = new int[C0488l.m1737a().length];
        try {
            f1347b[C0488l.DETECT.ordinal()] = 1;
        } catch (NoSuchFieldError e) {
        }
        try {
            f1347b[C0488l.STABLE.ordinal()] = 2;
        } catch (NoSuchFieldError e2) {
        }
        try {
            f1347b[C0488l.PENDING.ordinal()] = 3;
        } catch (NoSuchFieldError e3) {
        }
        f1346a = new int[C0487k.m1736a().length];
        try {
            f1346a[C0487k.HEARTBEAT_OK.ordinal()] = 1;
        } catch (NoSuchFieldError e4) {
        }
        try {
            f1346a[C0487k.HEARTBEAT_TIMEOUT.ordinal()] = 2;
        } catch (NoSuchFieldError e5) {
        }
        try {
            f1346a[C0487k.NETWORK_ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError e6) {
        }
        try {
            f1346a[C0487k.NETWORK_SWITCH.ordinal()] = 4;
        } catch (NoSuchFieldError e7) {
        }
    }
}
