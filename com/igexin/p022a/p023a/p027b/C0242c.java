package com.igexin.p022a.p023a.p027b;

/* renamed from: com.igexin.a.a.b.c */
public abstract class C0242c {
    protected String f608a;
    protected C0242c f609b;
    protected C0242c f610c;
    protected boolean f611d;

    public C0242c(String str, boolean z) {
        this.f608a = str;
        this.f611d = z;
    }

    public abstract Object m784a(C0234f c0234f, C0245e c0245e, Object obj);

    protected final void m785a(C0242c c0242c) {
        if (c0242c != null) {
            C0242c c0242c2 = c0242c.f609b;
            c0242c.f609b = this;
            this.f610c = c0242c;
            this.f609b = c0242c2;
        }
    }

    public void m786a(boolean z) {
        if (!this.f611d || z) {
            while (this.f609b != null) {
                C0242c c0242c = this.f609b.f609b;
                this.f609b.f609b = null;
                this.f609b = c0242c;
            }
        }
    }

    public abstract Object m787c(C0234f c0234f, C0245e c0245e, Object obj);

    public final Object m788d(C0234f c0234f, C0245e c0245e, Object obj) {
        if (obj == null) {
            throw new NullPointerException("Nothing to encode!");
        }
        if (this.f609b != null) {
            obj = this.f609b.m788d(c0234f, c0245e, obj);
        }
        return m784a(c0234f, c0245e, obj);
    }
}
