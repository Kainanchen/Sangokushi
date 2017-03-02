package com.igexin.p022a.p023a.p027b.p028a.p029a;

import com.igexin.p022a.p023a.p027b.C0234f;
import com.igexin.p022a.p023a.p030c.C0247a;

/* renamed from: com.igexin.a.a.b.a.a.c */
public class C0235c extends C0234f {
    C0238e f576e;

    public C0235c(String str) {
        super(str, null);
        this.a = this.a.replaceFirst("disConnect", "socket");
        this.C = true;
    }

    public void a_() {
        super.a_();
        if (this.f576e == null) {
            C0247a.m838b("DisSocketTask|run, nioSocketTask = null, return");
            return;
        }
        C0247a.m836a("DisSocketTask|run|" + this.f576e.f585f.get());
        if (!this.f576e.f585f.get()) {
            int i = 0;
            while (!this.f576e.f585f.compareAndSet(false, true)) {
                int i2 = i + 1;
                if (i > 10) {
                    break;
                }
                i = i2;
            }
        }
        C0247a.m836a("DisSocketTask|run2|" + this.f576e.f585f.get());
        if (this.f576e.f585f.get()) {
            C0247a.m838b("DisSocketTask|nioSocketTask wakeUp");
            this.f576e.m777i();
        }
    }

    public final int m758b() {
        return -2045;
    }

    public void m759d() {
        super.m742d();
        this.f576e = C0238e.m769h();
        C0247a.m838b("DisSocketTask|initTask");
    }

    protected void m760e() {
    }
}
