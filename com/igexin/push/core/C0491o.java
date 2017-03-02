package com.igexin.push.core;

import com.igexin.push.config.C0377k;
import com.igexin.sdk.aidl.C0492c;

/* renamed from: com.igexin.push.core.o */
public class C0491o {
    private static String f1359a;
    private static C0492c f1360b;

    static {
        f1359a = C0377k.f1013a;
    }

    public static C0492c m1740a() {
        if (f1360b == null) {
            f1360b = new C0493p();
        }
        return f1360b;
    }
}
