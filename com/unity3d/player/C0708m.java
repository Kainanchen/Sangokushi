package com.unity3d.player;

import android.util.Log;

/* renamed from: com.unity3d.player.m */
final class C0708m {
    protected static boolean f2281a;

    static {
        f2281a = false;
    }

    protected static void Log(int i, String str) {
        if (!f2281a) {
            if (i == 6) {
                Log.e("Unity", str);
            }
            if (i == 5) {
                Log.w("Unity", str);
            }
        }
    }
}
