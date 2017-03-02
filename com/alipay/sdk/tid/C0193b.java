package com.alipay.sdk.tid;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.alipay.sdk.sys.C0191b;
import com.alipay.sdk.util.C0194a;
import com.tencent.connect.common.Constants;

/* renamed from: com.alipay.sdk.tid.b */
public final class C0193b {
    private static C0193b f471c;
    public String f472a;
    public String f473b;

    private C0193b() {
    }

    private String m622b() {
        return this.f472a;
    }

    private void m621a(String str) {
        this.f472a = str;
    }

    private String m624c() {
        return this.f473b;
    }

    private void m623b(String str) {
        this.f473b = str;
    }

    private void m620a(Context context) {
        C0192a c0192a = new C0192a(context);
        try {
            c0192a.m617a(C0194a.m628a(context).m636a(), C0194a.m628a(context).m637b(), this.f472a, this.f473b);
        } catch (Exception e) {
        } finally {
            c0192a.close();
        }
    }

    private boolean m625d() {
        return TextUtils.isEmpty(this.f472a);
    }

    public static synchronized C0193b m619a() {
        C0193b c0193b;
        synchronized (C0193b.class) {
            if (f471c == null) {
                f471c = new C0193b();
                Context context = C0191b.m600a().f467a;
                C0192a c0192a = new C0192a(context);
                String a = C0194a.m628a(context).m636a();
                String b = C0194a.m628a(context).m637b();
                f471c.f472a = c0192a.m615a(a, b);
                f471c.f473b = c0192a.m618b(a, b);
                if (TextUtils.isEmpty(f471c.f473b)) {
                    C0193b c0193b2 = f471c;
                    String toHexString = Long.toHexString(System.currentTimeMillis());
                    if (toHexString.length() > 10) {
                        toHexString = toHexString.substring(toHexString.length() - 10);
                    }
                    c0193b2.f473b = toHexString;
                }
                c0192a.m617a(a, b, f471c.f472a, f471c.f473b);
            }
            c0193b = f471c;
        }
        return c0193b;
    }

    private static void m626e() {
        Context context = C0191b.m600a().f467a;
        String a = C0194a.m628a(context).m636a();
        String b = C0194a.m628a(context).m637b();
        C0192a c0192a = new C0192a(context);
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabase = c0192a.getWritableDatabase();
            c0192a.m616a(sQLiteDatabase, a, b, Constants.STR_EMPTY, Constants.STR_EMPTY);
            C0192a.m609a(sQLiteDatabase, C0192a.m612c(a, b));
            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                sQLiteDatabase.close();
            }
        } catch (Exception e) {
            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                sQLiteDatabase.close();
            }
        } catch (Throwable th) {
            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                sQLiteDatabase.close();
            }
        }
        c0192a.close();
    }

    private static String m627f() {
        String toHexString = Long.toHexString(System.currentTimeMillis());
        if (toHexString.length() > 10) {
            return toHexString.substring(toHexString.length() - 10);
        }
        return toHexString;
    }
}
