package com.tencent.wxop.stat.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;

/* renamed from: com.tencent.wxop.stat.common.p */
public class C0644p {
    private static SharedPreferences f2069a;

    static {
        f2069a = null;
    }

    public static int m2439a(Context context, String str, int i) {
        return C0644p.m2441a(context).getInt(C0639k.m2394a(context, new StringBuilder(StatConstants.MTA_COOPERATION_TAG).append(str).toString()), i);
    }

    public static long m2440a(Context context, String str, long j) {
        return C0644p.m2441a(context).getLong(C0639k.m2394a(context, new StringBuilder(StatConstants.MTA_COOPERATION_TAG).append(str).toString()), j);
    }

    static synchronized SharedPreferences m2441a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (C0644p.class) {
            sharedPreferences = context.getSharedPreferences(".mta-wxop", 0);
            f2069a = sharedPreferences;
            if (sharedPreferences == null) {
                f2069a = PreferenceManager.getDefaultSharedPreferences(context);
            }
            sharedPreferences = f2069a;
        }
        return sharedPreferences;
    }

    public static String m2442a(Context context, String str, String str2) {
        return C0644p.m2441a(context).getString(C0639k.m2394a(context, new StringBuilder(StatConstants.MTA_COOPERATION_TAG).append(str).toString()), str2);
    }

    public static void m2443b(Context context, String str, int i) {
        String a = C0639k.m2394a(context, new StringBuilder(StatConstants.MTA_COOPERATION_TAG).append(str).toString());
        Editor edit = C0644p.m2441a(context).edit();
        edit.putInt(a, i);
        edit.commit();
    }

    public static void m2444b(Context context, String str, long j) {
        String a = C0639k.m2394a(context, new StringBuilder(StatConstants.MTA_COOPERATION_TAG).append(str).toString());
        Editor edit = C0644p.m2441a(context).edit();
        edit.putLong(a, j);
        edit.commit();
    }

    public static void m2445b(Context context, String str, String str2) {
        String a = C0639k.m2394a(context, new StringBuilder(StatConstants.MTA_COOPERATION_TAG).append(str).toString());
        Editor edit = C0644p.m2441a(context).edit();
        edit.putString(a, str2);
        edit.commit();
    }
}
