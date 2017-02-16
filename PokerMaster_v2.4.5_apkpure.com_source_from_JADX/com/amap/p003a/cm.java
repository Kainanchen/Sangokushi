package com.amap.p003a;

import a.does.not.Exists2;
import android.content.Context;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import java.lang.Thread.UncaughtExceptionHandler;

/* compiled from: BasicLogHandler */
/* renamed from: com.amap.a.cm */
public class cm {
    protected static cm f641a;
    protected UncaughtExceptionHandler f642b;
    protected boolean f643c;

    static {
        fixHelper.fixfunc(new int[]{1304, 1305, 1306, 1307});
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    public static void m637a(Throwable th, String str, String str2) {
        th.printStackTrace();
        if (f641a != null) {
            f641a.m640a(th, 1, str, str2);
        }
    }

    protected native void m638a(Context context, cj cjVar, boolean z);

    protected native void m639a(cj cjVar, String str, String str2);

    protected native void m640a(Throwable th, int i, String str, String str2);
}
