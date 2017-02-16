package com.tencent.android.tpush.stat.event;

import android.support.v4.view.PointerIconCompat;
import com.sina.weibo.sdk.utils.AidTask;

/* compiled from: ProGuard */
public enum EventType {
    PAGE_VIEW(1),
    SESSION_ENV(2),
    ERROR(3),
    CUSTOM(PointerIconCompat.TYPE_DEFAULT),
    ADDITION(AidTask.WHAT_LOAD_AID_SUC),
    MONITOR_STAT(AidTask.WHAT_LOAD_AID_ERR),
    MTA_GAME_USER(PointerIconCompat.TYPE_HELP),
    NETWORK_MONITOR(PointerIconCompat.TYPE_WAIT),
    NETWORK_DETECTOR(1005);
    
    private int f7880v;

    private EventType(int i) {
        this.f7880v = i;
    }

    public final int m5574a() {
        return this.f7880v;
    }
}
