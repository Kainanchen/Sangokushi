package com.igexin.push.p039b;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.igexin.p022a.p023a.p025d.C0233d;
import com.igexin.p022a.p023a.p027b.C0244d;
import com.igexin.push.config.C0377k;
import com.igexin.push.core.C0482f;

/* renamed from: com.igexin.push.b.d */
public abstract class C0343d extends C0233d {
    private static final String f912a;
    protected SQLiteDatabase f913c;
    protected Cursor f914d;
    protected ContentValues f915e;
    public C0342c f916f;

    static {
        f912a = C0377k.f1013a;
    }

    public C0343d() {
        super(1);
    }

    public C0343d(ContentValues contentValues) {
        super(1);
        this.f915e = contentValues;
    }

    public abstract void m1151a();

    public void a_() {
        super.a_();
        this.f913c = C0482f.m1694a().m1716k().getWritableDatabase();
        m1151a();
        if (this.f916f != null) {
            C0244d.m802c().m797a((Object) this.f916f);
            C0244d.m802c().m814d();
        }
    }

    public final int m1152b() {
        return -2147483640;
    }

    public void m1153c() {
        super.m741c();
        if (this.f914d != null && !this.f914d.isClosed()) {
            try {
                this.f914d.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void m1154d() {
        this.y = true;
        this.T = true;
    }

    protected void m1155e() {
    }
}
