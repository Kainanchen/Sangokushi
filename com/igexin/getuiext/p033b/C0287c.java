package com.igexin.getuiext.p033b;

import android.content.Context;
import com.igexin.getuiext.data.C0294a;

/* renamed from: com.igexin.getuiext.b.c */
public class C0287c {
    private static C0287c f759e;
    private C0294a f760a;
    private C0286b f761b;
    private C0285a f762c;
    private boolean f763d;

    static {
        f759e = new C0287c();
    }

    private C0287c() {
        this.f763d = false;
    }

    public static C0287c m994d() {
        return f759e;
    }

    public C0294a m995a() {
        return this.f760a;
    }

    public synchronized void m996a(Context context) {
        if (!this.f763d) {
            this.f760a = new C0294a(context);
            this.f761b = new C0286b(this.f760a);
            this.f762c = new C0285a(this.f760a);
            this.f763d = true;
        }
    }

    public C0286b m997b() {
        return this.f761b;
    }

    public C0285a m998c() {
        return this.f762c;
    }
}
