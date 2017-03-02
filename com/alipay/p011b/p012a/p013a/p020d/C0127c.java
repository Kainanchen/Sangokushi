package com.alipay.p011b.p012a.p013a.p020d;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import java.util.Map;

/* renamed from: com.alipay.b.a.a.d.c */
public final class C0127c {
    public static String m343a(Context context, String str, String str2, String str3) {
        return context.getSharedPreferences(str, 0).getString(str2, str3);
    }

    public static void m344a(Context context, String str, Map<String, String> map) {
        Editor edit = context.getSharedPreferences(str, 0).edit();
        if (edit != null) {
            edit.clear();
            for (String str2 : map.keySet()) {
                edit.putString(str2, (String) map.get(str2));
            }
            edit.commit();
        }
    }
}
