package com.facebook.p036h;

import android.content.Intent;
import java.util.UUID;

/* renamed from: com.facebook.h.a */
public final class AppCall {
    private static AppCall f1534d;
    public UUID f1535a;
    public Intent f1536b;
    int f1537c;

    public AppCall(int i) {
        this(i, UUID.randomUUID());
    }

    private AppCall(int i, UUID uuid) {
        this.f1535a = uuid;
        this.f1537c = i;
    }

    public static synchronized AppCall m1471a(UUID uuid, int i) {
        AppCall appCall;
        synchronized (AppCall.class) {
            appCall = f1534d;
            if (appCall != null && appCall.f1535a.equals(uuid) && appCall.f1537c == i) {
                AppCall.m1472a(null);
            } else {
                appCall = null;
            }
        }
        return appCall;
    }

    static synchronized boolean m1472a(AppCall appCall) {
        boolean z;
        synchronized (AppCall.class) {
            AppCall appCall2 = f1534d;
            f1534d = appCall;
            z = appCall2 != null;
        }
        return z;
    }
}
