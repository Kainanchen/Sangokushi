package com.igexin.push.p035e.p036b;

import com.igexin.p022a.p023a.p027b.C0244d;
import com.igexin.push.core.p045a.C0402e;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.igexin.push.e.b.a */
public class C0507a extends C0395f {
    private static C0507a f1405b;
    private List f1406a;

    private C0507a() {
        super(360000);
        this.z = true;
        this.f1406a = new ArrayList();
    }

    public static C0507a m1813g() {
        if (f1405b == null) {
            f1405b = new C0507a();
        }
        return f1405b;
    }

    private void m1814h() {
        m734a(360000, TimeUnit.MILLISECONDS);
    }

    protected void m1815a() {
        C0402e.m1330a().m1342B();
        for (C0335d c0335d : this.f1406a) {
            if (c0335d.m1125b()) {
                c0335d.m1123a();
                c0335d.m1124a(System.currentTimeMillis());
            }
        }
        m1814h();
        C0244d.m802c().m797a((Object) this);
    }

    public boolean m1816a(C0335d c0335d) {
        return (this.f1406a == null || this.f1406a.contains(c0335d) || !this.f1406a.add(c0335d)) ? false : true;
    }

    public int m1817b() {
        return 0;
    }
}
