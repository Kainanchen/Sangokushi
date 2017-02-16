package com.tencent.p063a.p064a.p065a.p066a;

import android.content.Context;
import android.provider.Settings.System;
import android.util.Log;

/* renamed from: com.tencent.a.a.a.a.e */
public final class C1026e extends C1022f {
    public C1026e(Context context) {
        super(context);
    }

    protected final void m4641a(String str) {
        synchronized (this) {
            Log.i("MID", "write mid to Settings.System");
            System.putString(this.a.getContentResolver(), C1028h.m4655c("4kU71lN96TJUomD1vOU9lgj9Tw=="), str);
        }
    }

    protected final boolean m4642a() {
        return C1028h.m4651a(this.a, "android.permission.WRITE_SETTINGS");
    }

    protected final String m4643b() {
        String string;
        synchronized (this) {
            Log.i("MID", "read mid from Settings.System");
            string = System.getString(this.a.getContentResolver(), C1028h.m4655c("4kU71lN96TJUomD1vOU9lgj9Tw=="));
        }
        return string;
    }
}
