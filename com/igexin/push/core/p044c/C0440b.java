package com.igexin.push.core.p044c;

import android.database.sqlite.SQLiteDatabase;
import com.igexin.push.p052f.C0514c;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.igexin.push.core.c.b */
public class C0440b implements C0366a {
    private static C0440b f1198c;
    C0514c f1199a;
    private Map f1200b;

    private C0440b() {
        this.f1200b = new HashMap();
        this.f1199a = new C0514c();
    }

    public static C0440b m1561a() {
        if (f1198c == null) {
            f1198c = new C0440b();
        }
        return f1198c;
    }

    public void m1562a(SQLiteDatabase sQLiteDatabase) {
    }

    public void m1563b(SQLiteDatabase sQLiteDatabase) {
    }

    public void m1564c(SQLiteDatabase sQLiteDatabase) {
    }
}
