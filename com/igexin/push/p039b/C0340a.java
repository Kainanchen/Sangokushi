package com.igexin.push.p039b;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.igexin.p022a.p023a.p025d.C0233d;
import com.igexin.p022a.p023a.p027b.C0244d;
import com.igexin.push.config.C0377k;
import com.igexin.push.core.C0482f;
import com.igexin.push.core.p044c.C0366a;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.igexin.push.b.a */
public class C0340a extends C0233d {
    private static final String f905e;
    protected SQLiteDatabase f906a;
    protected Cursor f907b;
    List f908c;
    boolean f909d;

    static {
        f905e = C0377k.f1013a;
    }

    public C0340a() {
        super(1);
        this.f908c = new LinkedList();
    }

    public void m1140a(C0366a c0366a) {
        this.f908c.add(c0366a);
    }

    public void a_() {
        super.a_();
        this.f906a = C0482f.m1694a().m1716k().getWritableDatabase();
        this.f906a.setVersion(2);
        for (C0366a a : this.f908c) {
            a.m1221a(this.f906a);
        }
        for (C0366a a2 : this.f908c) {
            if (this.f909d) {
                a2.m1223c(this.f906a);
            } else {
                a2.m1222b(this.f906a);
            }
        }
        C0244d.m802c().m797a((Object) new C0342c(-980948));
        C0244d.m802c().m814d();
    }

    public final int m1141b() {
        return -2147483639;
    }

    public void m1142c() {
        super.m741c();
        if (this.f907b != null) {
            try {
                this.f907b.close();
            } catch (Exception e) {
            }
        }
    }

    public void m1143d() {
        super.m742d();
        this.y = true;
        this.T = true;
    }

    protected void m1144e() {
    }
}
