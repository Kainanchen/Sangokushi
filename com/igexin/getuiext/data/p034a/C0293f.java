package com.igexin.getuiext.data.p034a;

import java.util.Locale;

/* renamed from: com.igexin.getuiext.data.a.f */
public enum C0293f {
    FULL,
    DIFF;

    public static C0293f m999a(String str) {
        return (str == null || !str.toUpperCase(Locale.US).equals("DIFF")) ? FULL : DIFF;
    }

    public static C0293f[] m1000a() {
        return (C0293f[]) f790c.clone();
    }
}
