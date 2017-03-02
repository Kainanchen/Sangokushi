package com.alipay.p011b.p012a.p013a.p016b;

import android.content.Context;

/* renamed from: com.alipay.b.a.a.b.a */
public final class C0112a {
    private static C0112a f144a;

    static {
        f144a = new C0112a();
    }

    private C0112a() {
    }

    public static C0112a m243a() {
        return f144a;
    }

    public static String m244a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16).versionName;
        } catch (Exception e) {
            return "0.0.0";
        }
    }
}
