package com.alipay.sdk.util;

import android.content.Context;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.alipay.sdk.app.statistic.C0144a;
import com.alipay.sdk.app.statistic.C0146c;
import com.alipay.sdk.encrypt.C0176e;
import com.tencent.connect.common.Constants;

/* renamed from: com.alipay.sdk.util.i */
public final class C0202i {
    private static String f516a;

    static {
        f516a = null;
    }

    private static boolean m666b(Context context, String str) {
        boolean z = false;
        try {
            z = PreferenceManager.getDefaultSharedPreferences(context).contains(str);
        } catch (Throwable th) {
        }
        return z;
    }

    public static void m663a(Context context, String str) {
        try {
            PreferenceManager.getDefaultSharedPreferences(context).edit().remove(str).commit();
        } catch (Throwable th) {
        }
    }

    public static void m664a(Context context, String str, String str2) {
        try {
            Object a = C0176e.m508a(C0202i.m662a(context), str2);
            if (!TextUtils.isEmpty(str2) && TextUtils.isEmpty(a)) {
                C0144a.m398a(C0146c.f243c, C0146c.f263w, String.format("%s,%s", new Object[]{str, str2}));
            }
            PreferenceManager.getDefaultSharedPreferences(context).edit().putString(str, a).commit();
        } catch (Throwable th) {
        }
    }

    public static String m665b(Context context, String str, String str2) {
        String str3 = null;
        try {
            String string = PreferenceManager.getDefaultSharedPreferences(context).getString(str, str2);
            if (!TextUtils.isEmpty(string)) {
                str3 = C0176e.m510b(C0202i.m662a(context), string);
            }
            if (!TextUtils.isEmpty(string) && TextUtils.isEmpty(r0)) {
                C0144a.m398a(C0146c.f243c, C0146c.f262v, String.format("%s,%s", new Object[]{str, string}));
            }
        } catch (Exception e) {
        }
        return str3;
    }

    private static String m662a(Context context) {
        if (TextUtils.isEmpty(f516a)) {
            String str = Constants.STR_EMPTY;
            try {
                str = context.getApplicationContext().getPackageName();
            } catch (Throwable th) {
            }
            f516a = (str + "0000000000000000000000000000").substring(0, 24);
        }
        return f516a;
    }
}
