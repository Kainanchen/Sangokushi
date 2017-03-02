package com.alipay.apmobilesecuritysdk.p006c;

import android.content.Context;
import android.os.Build;
import com.alipay.p011b.p012a.p013a.p021e.C0128a;
import com.alipay.p011b.p012a.p013a.p021e.C0131d;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/* renamed from: com.alipay.apmobilesecuritysdk.c.a */
public final class C0087a {
    public static synchronized void m138a(Context context, String str, String str2, String str3) {
        synchronized (C0087a.class) {
            C0128a c0128a = new C0128a(Build.MODEL, context.getApplicationContext().getApplicationInfo().packageName, "security-sdk-token", "3.2.0-20160621", str, str2, str3);
            C0131d.m350a(context.getFilesDir().getAbsolutePath() + "/log/ap", new SimpleDateFormat("yyyyMMdd").format(Calendar.getInstance().getTime()) + ".log", c0128a.toString());
        }
    }

    public static synchronized void m139a(String str) {
        synchronized (C0087a.class) {
            C0131d.m349a(str);
        }
    }

    public static synchronized void m140a(Throwable th) {
        synchronized (C0087a.class) {
            C0131d.m351a(th);
        }
    }
}
