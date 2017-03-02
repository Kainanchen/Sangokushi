package com.tencent.mm.sdk.p063b;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.tencent.mm.sdk.p063b.C0589b.C0588a;

/* renamed from: com.tencent.mm.sdk.b.c */
final class C0590c implements C0588a {
    private Handler handler;

    C0590c() {
        this.handler = new Handler(Looper.getMainLooper());
    }

    public final void m2023f(String str, String str2) {
        if (C0589b.level <= 2) {
            Log.i(str, str2);
        }
    }

    public final void m2024g(String str, String str2) {
        if (C0589b.level <= 1) {
            Log.d(str, str2);
        }
    }

    public final int getLogLevel() {
        return C0589b.level;
    }

    public final void m2025h(String str, String str2) {
        if (C0589b.level <= 3) {
            Log.w(str, str2);
        }
    }

    public final void m2026i(String str, String str2) {
        if (C0589b.level <= 4) {
            Log.e(str, str2);
        }
    }
}
