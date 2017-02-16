package com.amap.p003a;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import java.lang.reflect.Method;

/* compiled from: SPUtil */
/* renamed from: com.amap.a.bt */
public final class bt {
    private static Method f509a;

    /* renamed from: com.amap.a.bt.1 */
    static class SPUtil extends AsyncTask<Void, Void, Void> {
        final /* synthetic */ Editor f508a;

        SPUtil(Editor editor) {
            this.f508a = editor;
        }

        private Void m448a() {
            try {
                if (this.f508a != null) {
                    this.f508a.commit();
                }
            } catch (Throwable th) {
                bc.m330a(th, "SPUtil", "commit");
            }
            return null;
        }

        protected final /* synthetic */ Object doInBackground(Object[] objArr) {
            return m448a();
        }
    }

    public static long m449a(Context context, String str, String str2) {
        long j = 0;
        try {
            j = context.getSharedPreferences(str, 0).getLong(str2, 0);
        } catch (Throwable th) {
            bc.m330a(th, "SPUtil", "getPrefsLong");
        }
        return j;
    }

    public static String m450a(Context context, String str, String str2, String str3) {
        try {
            str3 = context.getSharedPreferences(str, 0).getString(str2, str3);
        } catch (Throwable th) {
            bc.m330a(th, "SPUtil", "getPrefsInt");
        }
        return str3;
    }

    public static void m451a(Context context, String str, String str2, int i) {
        try {
            Editor edit = context.getSharedPreferences(str, 0).edit();
            edit.putInt(str2, i);
            bt.m454a(edit);
        } catch (Throwable th) {
            bc.m330a(th, "SPUtil", "setPrefsInt");
        }
    }

    public static void m452a(Context context, String str, String str2, long j) {
        try {
            Editor edit = context.getSharedPreferences(str, 0).edit();
            edit.putLong(str2, j);
            bt.m454a(edit);
        } catch (Throwable th) {
            bc.m330a(th, "SPUtil", "setPrefsLong");
        }
    }

    public static void m453a(Context context, String str, String str2, boolean z) {
        try {
            Editor edit = context.getSharedPreferences(str, 0).edit();
            edit.putBoolean(str2, z);
            bt.m454a(edit);
        } catch (Throwable th) {
            bc.m330a(th, "SPUtil", "updatePrefsBoolean");
        }
    }

    public static void m454a(Editor editor) {
        if (editor != null) {
            if (VERSION.SDK_INT >= 9) {
                try {
                    if (f509a == null) {
                        f509a = Editor.class.getDeclaredMethod("apply", new Class[0]);
                    }
                    f509a.invoke(editor, new Object[0]);
                    return;
                } catch (Throwable th) {
                    bc.m330a(th, "SPUtil", "applySharedPreference");
                }
            }
            try {
                new SPUtil(editor).execute(new Void[]{null, null, null});
            } catch (Throwable th2) {
                bc.m330a(th2, "SPUtil", "commit1");
            }
        }
    }

    public static int m455b(Context context, String str, String str2) {
        int i = 0;
        try {
            i = context.getSharedPreferences(str, 0).getInt(str2, 0);
        } catch (Throwable th) {
            bc.m330a(th, "SPUtil", "getPrefsInt");
        }
        return i;
    }

    public static boolean m456b(Context context, String str, String str2, boolean z) {
        try {
            z = context.getSharedPreferences(str, 0).getBoolean(str2, z);
        } catch (Throwable th) {
            bc.m330a(th, "SPUtil", "getPrefsBoolean");
        }
        return z;
    }
}
