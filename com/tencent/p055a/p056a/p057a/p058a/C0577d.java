package com.tencent.p055a.p056a.p057a.p058a;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import android.util.Log;

/* renamed from: com.tencent.a.a.a.a.d */
final class C0577d extends C0574f {
    public C0577d(Context context) {
        super(context);
    }

    protected final void m1915a(String str) {
        synchronized (this) {
            Log.i("MID", "write mid to sharedPreferences");
            Editor edit = PreferenceManager.getDefaultSharedPreferences(this.a).edit();
            edit.putString(C0580h.m1932f("4kU71lN96TJUomD1vOU9lgj9Tw=="), str);
            edit.commit();
        }
    }

    protected final boolean m1916a() {
        return true;
    }

    protected final String m1917b() {
        String string;
        synchronized (this) {
            Log.i("MID", "read mid from sharedPreferences");
            string = PreferenceManager.getDefaultSharedPreferences(this.a).getString(C0580h.m1932f("4kU71lN96TJUomD1vOU9lgj9Tw=="), null);
        }
        return string;
    }
}
