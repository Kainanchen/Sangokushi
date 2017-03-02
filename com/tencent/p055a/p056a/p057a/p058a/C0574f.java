package com.tencent.p055a.p056a.p057a.p058a;

import android.content.Context;

/* renamed from: com.tencent.a.a.a.a.f */
public abstract class C0574f {
    protected Context f1452a;

    protected C0574f(Context context) {
        this.f1452a = null;
        this.f1452a = context;
    }

    public final void m1904a(C0576c c0576c) {
        if (c0576c != null) {
            String c0576c2 = c0576c.toString();
            if (m1906a()) {
                m1905a(C0580h.m1933g(c0576c2));
            }
        }
    }

    protected abstract void m1905a(String str);

    protected abstract boolean m1906a();

    protected abstract String m1907b();

    public final C0576c m1908o() {
        String f = m1906a() ? C0580h.m1932f(m1907b()) : null;
        return f != null ? C0576c.m1912e(f) : null;
    }
}
