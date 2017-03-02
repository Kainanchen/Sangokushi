package com.unity3d.player;

import android.os.Build.VERSION;

/* renamed from: com.unity3d.player.q */
public final class C0714q {
    static final boolean f2291a;
    static final boolean f2292b;
    static final boolean f2293c;
    static final boolean f2294d;
    static final boolean f2295e;
    static final boolean f2296f;
    static final boolean f2297g;
    static final boolean f2298h;
    static final C0695f f2299i;
    static final C0691e f2300j;
    static final C0698h f2301k;
    static final C0697g f2302l;
    static final C0699i f2303m;

    static {
        C0699i c0699i = null;
        boolean z = true;
        f2291a = VERSION.SDK_INT >= 11;
        f2292b = VERSION.SDK_INT >= 12;
        f2293c = VERSION.SDK_INT >= 14;
        f2294d = VERSION.SDK_INT >= 16;
        f2295e = VERSION.SDK_INT >= 17;
        f2296f = VERSION.SDK_INT >= 19;
        f2297g = VERSION.SDK_INT >= 21;
        if (VERSION.SDK_INT < 23) {
            z = false;
        }
        f2298h = z;
        f2299i = f2291a ? new C0696d() : null;
        f2300j = f2292b ? new C0692c() : null;
        f2301k = f2294d ? new C0707l() : null;
        f2302l = f2295e ? new C0705k() : null;
        if (f2298h) {
            c0699i = new C0710n();
        }
        f2303m = c0699i;
    }
}
