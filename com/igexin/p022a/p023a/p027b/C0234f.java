package com.igexin.p022a.p023a.p027b;

import com.igexin.p022a.p023a.p025d.C0233d;

/* renamed from: com.igexin.a.a.b.f */
public abstract class C0234f extends C0233d {
    public String f572a;
    public C0242c f573b;
    public Object f574c;
    public C0245e f575d;

    public C0234f(int i, String str, C0242c c0242c) {
        super(i);
        if (str != null) {
            this.f572a = m756a(str);
        }
        this.f573b = c0242c;
    }

    public C0234f(String str, C0242c c0242c) {
        this(0, str, c0242c);
    }

    private final String m756a(String str) {
        return C0246g.m823a(C0246g.m828a(str));
    }

    public void m757f() {
        if (this.f573b != null) {
            this.f573b.m786a(false);
        }
        this.f573b = null;
        this.f575d = null;
        this.f574c = null;
        this.f572a = null;
        super.m744f();
    }
}
