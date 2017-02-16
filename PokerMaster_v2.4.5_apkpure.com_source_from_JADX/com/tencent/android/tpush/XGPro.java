package com.tencent.android.tpush;

import android.content.Context;

/* compiled from: ProGuard */
public class XGPro {
    private static boolean f7252a;

    static {
        f7252a = false;
    }

    public static void enableXGPro(Context context, boolean z) {
        f7252a = z;
    }

    public static boolean isEnableXGPro(Context context) {
        return f7252a;
    }
}
