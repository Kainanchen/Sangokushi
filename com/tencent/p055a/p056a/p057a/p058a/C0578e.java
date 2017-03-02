package com.tencent.p055a.p056a.p057a.p058a;

import android.content.Context;
import android.provider.Settings.System;
import android.util.Log;

/* renamed from: com.tencent.a.a.a.a.e */
public final class C0578e extends C0574f {
    public C0578e(Context context) {
        super(context);
    }

    protected final void m1918a(String str) {
        synchronized (this) {
            Log.i("MID", "write mid to Settings.System");
            System.putString(this.a.getContentResolver(), C0580h.m1932f("4kU71lN96TJUomD1vOU9lgj9Tw=="), str);
        }
    }

    protected final boolean m1919a() {
        return C0580h.m1928a(this.a, "android.permission.WRITE_SETTINGS");
    }

    protected final String m1920b() {
        String string;
        synchronized (this) {
            Log.i("MID", "read mid from Settings.System");
            string = System.getString(this.a.getContentResolver(), C0580h.m1932f("4kU71lN96TJUomD1vOU9lgj9Tw=="));
        }
        return string;
    }
}
