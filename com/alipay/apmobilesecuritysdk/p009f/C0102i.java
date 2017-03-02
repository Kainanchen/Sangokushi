package com.alipay.apmobilesecuritysdk.p009f;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.p006c.C0087a;
import com.igexin.getuiext.data.Consts;
import com.tencent.connect.common.Constants;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.alipay.apmobilesecuritysdk.f.i */
public final class C0102i {
    private static String f124a;
    private static String f125b;
    private static String f126c;
    private static String f127d;
    private static String f128e;
    private static Map<String, String> f129f;

    static {
        f124a = Constants.STR_EMPTY;
        f125b = Constants.STR_EMPTY;
        f126c = Constants.STR_EMPTY;
        f127d = Constants.STR_EMPTY;
        f128e = Constants.STR_EMPTY;
        f129f = new HashMap();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.lang.String m197a(java.lang.String r3) {
        /*
        r1 = com.alipay.apmobilesecuritysdk.p009f.C0102i.class;
        monitor-enter(r1);
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x002d }
        r2 = "apdidTokenCache";
        r0.<init>(r2);	 Catch:{ all -> 0x002d }
        r0 = r0.append(r3);	 Catch:{ all -> 0x002d }
        r0 = r0.toString();	 Catch:{ all -> 0x002d }
        r2 = f129f;	 Catch:{ all -> 0x002d }
        r2 = r2.containsKey(r0);	 Catch:{ all -> 0x002d }
        if (r2 == 0) goto L_0x002a;
    L_0x001a:
        r2 = f129f;	 Catch:{ all -> 0x002d }
        r0 = r2.get(r0);	 Catch:{ all -> 0x002d }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x002d }
        r2 = com.alipay.p011b.p012a.p013a.p014a.C0110a.m237b(r0);	 Catch:{ all -> 0x002d }
        if (r2 == 0) goto L_0x002a;
    L_0x0028:
        monitor-exit(r1);
        return r0;
    L_0x002a:
        r0 = "";
        goto L_0x0028;
    L_0x002d:
        r0 = move-exception;
        monitor-exit(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.apmobilesecuritysdk.f.i.a(java.lang.String):java.lang.String");
    }

    public static synchronized void m198a() {
        synchronized (C0102i.class) {
        }
    }

    public static synchronized void m199a(C0095b c0095b) {
        synchronized (C0102i.class) {
            if (c0095b != null) {
                f124a = c0095b.m159a();
                f125b = c0095b.m160b();
                f126c = c0095b.m161c();
            }
        }
    }

    public static synchronized void m200a(C0096c c0096c) {
        synchronized (C0102i.class) {
            if (c0096c != null) {
                f124a = c0096c.m162a();
                f125b = c0096c.m163b();
                f127d = c0096c.m165d();
                f128e = c0096c.m166e();
                f126c = c0096c.m164c();
            }
        }
    }

    public static synchronized void m201a(String str, String str2) {
        synchronized (C0102i.class) {
            String str3 = "apdidTokenCache" + str;
            if (f129f.containsKey(str3)) {
                f129f.remove(str3);
            }
            f129f.put(str3, str2);
        }
    }

    public static synchronized boolean m202a(Context context, String str) {
        boolean z;
        synchronized (C0102i.class) {
            try {
                if (Math.abs(System.currentTimeMillis() - C0101h.m195c(context, str)) < Consts.TIME_24HOUR) {
                    z = true;
                }
            } catch (Throwable th) {
                C0087a.m140a(th);
            }
            z = false;
        }
        return z;
    }

    public static synchronized String m203b() {
        String str;
        synchronized (C0102i.class) {
            str = f124a;
        }
        return str;
    }

    public static void m204b(String str) {
        f124a = str;
    }

    public static synchronized String m205c() {
        String str;
        synchronized (C0102i.class) {
            str = f125b;
        }
        return str;
    }

    public static void m206c(String str) {
        f125b = str;
    }

    public static synchronized String m207d() {
        String str;
        synchronized (C0102i.class) {
            str = f127d;
        }
        return str;
    }

    public static void m208d(String str) {
        f126c = str;
    }

    public static synchronized String m209e() {
        String str;
        synchronized (C0102i.class) {
            str = f128e;
        }
        return str;
    }

    public static void m210e(String str) {
        f127d = str;
    }

    public static synchronized String m211f() {
        String str;
        synchronized (C0102i.class) {
            str = f126c;
        }
        return str;
    }

    public static void m212f(String str) {
        f128e = str;
    }

    public static synchronized C0096c m213g() {
        C0096c c0096c;
        synchronized (C0102i.class) {
            c0096c = new C0096c(f124a, f125b, f126c, f127d, f128e);
        }
        return c0096c;
    }

    public static void m214h() {
        f129f.clear();
        f124a = Constants.STR_EMPTY;
        f125b = Constants.STR_EMPTY;
        f127d = Constants.STR_EMPTY;
        f128e = Constants.STR_EMPTY;
        f126c = Constants.STR_EMPTY;
    }
}
