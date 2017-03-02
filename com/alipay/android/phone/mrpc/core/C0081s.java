package com.alipay.android.phone.mrpc.core;

import android.content.Context;

/* renamed from: com.alipay.android.phone.mrpc.core.s */
public final class C0081s {
    private static Boolean f90a;

    static {
        f90a = null;
    }

    public static final boolean m124a(Context context) {
        if (f90a != null) {
            return f90a.booleanValue();
        }
        try {
            Boolean valueOf = Boolean.valueOf((context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 2) != 0);
            f90a = valueOf;
            return valueOf.booleanValue();
        } catch (Exception e) {
            return false;
        }
    }
}
