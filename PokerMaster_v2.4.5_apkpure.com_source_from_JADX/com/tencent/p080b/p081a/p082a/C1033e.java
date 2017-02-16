package com.tencent.p080b.p081a.p082a;

import android.support.v4.view.PointerIconCompat;
import com.sina.weibo.sdk.utils.AidTask;

/* renamed from: com.tencent.b.a.a.e */
public enum C1033e {
    PAGE_VIEW(1),
    SESSION_ENV(2),
    ERROR(3),
    CUSTOM(PointerIconCompat.TYPE_DEFAULT),
    ADDITION(AidTask.WHAT_LOAD_AID_SUC),
    MONITOR_STAT(AidTask.WHAT_LOAD_AID_ERR),
    MTA_GAME_USER(PointerIconCompat.TYPE_HELP),
    NETWORK_MONITOR(PointerIconCompat.TYPE_WAIT),
    NETWORK_DETECTOR(1005);
    
    public int f7981j;

    private C1033e(int i) {
        this.f7981j = i;
    }
}
