package com.tencent.mm.sdk.p087b;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.tencent.mm.sdk.p087b.C1090b.C1089a;

/* renamed from: com.tencent.mm.sdk.b.c */
final class C1091c implements C1089a {
    private Handler handler;

    C1091c() {
        this.handler = new Handler(Looper.getMainLooper());
    }

    public final void m5879f(String str, String str2) {
        if (C1090b.level <= 2) {
            Log.i(str, str2);
        }
    }

    public final void m5880g(String str, String str2) {
        C1090b.level;
    }

    public final int getLogLevel() {
        return C1090b.level;
    }

    public final void m5881h(String str, String str2) {
        if (C1090b.level <= 3) {
            Log.w(str, str2);
        }
    }

    public final void m5882i(String str, String str2) {
        if (C1090b.level <= 4) {
            Log.e(str, str2);
        }
    }
}
