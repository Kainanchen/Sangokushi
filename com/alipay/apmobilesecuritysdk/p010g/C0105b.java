package com.alipay.apmobilesecuritysdk.p010g;

import java.util.LinkedList;

/* renamed from: com.alipay.apmobilesecuritysdk.g.b */
public final class C0105b {
    private static C0105b f137a;
    private Thread f138b;
    private LinkedList<Runnable> f139c;

    static {
        f137a = new C0105b();
    }

    public C0105b() {
        this.f138b = null;
        this.f139c = new LinkedList();
    }

    public static C0105b m220a() {
        return f137a;
    }

    public final synchronized void m223a(Runnable runnable) {
        this.f139c.add(runnable);
        if (this.f138b == null) {
            this.f138b = new Thread(new C0106c(this));
            this.f138b.start();
        }
    }
}
