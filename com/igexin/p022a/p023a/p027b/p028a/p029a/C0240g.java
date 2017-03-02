package com.igexin.p022a.p023a.p027b.p028a.p029a;

import com.igexin.p022a.p023a.p027b.C0234f;
import com.igexin.p022a.p023a.p027b.C0242c;
import com.igexin.p022a.p023a.p027b.C0244d;
import java.nio.ByteBuffer;

/* renamed from: com.igexin.a.a.b.a.a.g */
public final class C0240g extends C0234f {
    C0238e f601e;
    ByteBuffer f602f;

    public C0240g(String str, C0242c c0242c) {
        super(str, c0242c);
        this.C = true;
    }

    public void a_() {
        super.a_();
        this.f601e.f593o.offer(this);
        if (!this.f601e.m751r() && !C0244d.m802c().m794a(this.f601e, true)) {
            throw new IllegalStateException("NioSocketTask is invalid");
        } else if (this.f601e.f587h) {
            this.f601e.m777i();
        }
    }

    public final int m779b() {
        return -2046;
    }

    public final void m780d() {
        super.m742d();
        this.f601e = C0238e.m768a(this.a, this.b);
    }

    protected void m781e() {
    }

    public void m782f() {
        this.f601e = null;
        super.m757f();
    }
}
