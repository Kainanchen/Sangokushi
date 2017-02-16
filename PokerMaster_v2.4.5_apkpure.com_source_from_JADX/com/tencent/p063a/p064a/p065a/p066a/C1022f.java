package com.tencent.p063a.p064a.p065a.p066a;

import android.content.Context;

/* renamed from: com.tencent.a.a.a.a.f */
public abstract class C1022f {
    protected Context f7172a;

    protected C1022f(Context context) {
        this.f7172a = null;
        this.f7172a = context;
    }

    public final void m4628a(C1024c c1024c) {
        if (c1024c != null) {
            String c1024c2 = c1024c.toString();
            if (m4630a()) {
                m4629a(C1028h.m4656d(c1024c2));
            }
        }
    }

    protected abstract void m4629a(String str);

    protected abstract boolean m4630a();

    protected abstract String m4631b();

    public final C1024c m4632c() {
        String c = m4630a() ? C1028h.m4655c(m4631b()) : null;
        return c != null ? C1024c.m4636a(c) : null;
    }
}
