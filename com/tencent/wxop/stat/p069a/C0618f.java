package com.tencent.wxop.stat.p069a;

import com.ut.device.AidConstants;

/* renamed from: com.tencent.wxop.stat.a.f */
public enum C0618f {
    PAGE_VIEW(1),
    SESSION_ENV(2),
    ERROR(3),
    CUSTOM(AidConstants.EVENT_REQUEST_STARTED),
    ADDITION(AidConstants.EVENT_REQUEST_SUCCESS),
    MONITOR_STAT(AidConstants.EVENT_REQUEST_FAILED),
    MTA_GAME_USER(AidConstants.EVENT_NETWORK_ERROR),
    NETWORK_MONITOR(1004),
    NETWORK_DETECTOR(1005);
    
    private int f1880j;

    private C0618f(int i) {
        this.f1880j = i;
    }

    public final int m2269a() {
        return this.f1880j;
    }
}
