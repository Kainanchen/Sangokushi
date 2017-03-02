package com.igexin.push.config;

import com.igexin.push.core.C0483g;

/* renamed from: com.igexin.push.config.j */
public class C0376j {
    private static C0376j f1012a;

    private C0376j() {
    }

    public static synchronized C0376j m1250a() {
        C0376j c0376j;
        synchronized (C0376j.class) {
            if (f1012a == null) {
                f1012a = new C0376j();
            }
            c0376j = f1012a;
        }
        return c0376j;
    }

    public boolean m1251b() {
        C0381o.m1257a();
        C0379m.m1252a();
        C0379m.m1253a(C0483g.f1321g);
        return true;
    }
}
