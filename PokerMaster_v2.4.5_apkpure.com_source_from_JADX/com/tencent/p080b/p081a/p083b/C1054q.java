package com.tencent.p080b.p081a.p083b;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;

/* renamed from: com.tencent.b.a.b.q */
public final class C1054q {
    private static SharedPreferences f8100a;

    static {
        f8100a = null;
    }

    public static int m5728a(Context context, String str, int i) {
        return C1054q.m5730a(context).getInt(C1049l.m5684a(context, "wxop_" + str), i);
    }

    public static long m5729a(Context context, String str) {
        return C1054q.m5730a(context).getLong(C1049l.m5684a(context, "wxop_" + str), 0);
    }

    private static synchronized SharedPreferences m5730a(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (C1054q.class) {
            sharedPreferences = context.getSharedPreferences(".mta-wxop", 0);
            f8100a = sharedPreferences;
            if (sharedPreferences == null) {
                f8100a = PreferenceManager.getDefaultSharedPreferences(context);
            }
            sharedPreferences = f8100a;
        }
        return sharedPreferences;
    }

    public static String m5731a(Context context, String str, String str2) {
        return C1054q.m5730a(context).getString(C1049l.m5684a(context, "wxop_" + str), str2);
    }

    public static void m5732a(Context context, String str, long j) {
        String a = C1049l.m5684a(context, "wxop_" + str);
        Editor edit = C1054q.m5730a(context).edit();
        edit.putLong(a, j);
        edit.commit();
    }

    public static void m5733b(Context context, String str, int i) {
        String a = C1049l.m5684a(context, "wxop_" + str);
        Editor edit = C1054q.m5730a(context).edit();
        edit.putInt(a, i);
        edit.commit();
    }

    public static void m5734b(Context context, String str, String str2) {
        String a = C1049l.m5684a(context, "wxop_" + str);
        Editor edit = C1054q.m5730a(context).edit();
        edit.putString(a, str2);
        edit.commit();
    }
}
