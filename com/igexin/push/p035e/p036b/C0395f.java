package com.igexin.push.p035e.p036b;

import com.igexin.p022a.p023a.p025d.C0233d;
import java.util.concurrent.TimeUnit;

/* renamed from: com.igexin.push.e.b.f */
public abstract class C0395f extends C0233d {
    long f1051e;

    public C0395f(long j) {
        this(0, j);
    }

    public C0395f(long j, long j2) {
        super(5);
        if (j > 0) {
            j2 += j - System.currentTimeMillis();
        }
        this.f1051e = j2;
        m734a(this.f1051e, TimeUnit.MILLISECONDS);
    }

    protected abstract void m1314a();

    public final void a_() {
        super.a_();
        m1314a();
    }

    protected void m1315e() {
    }
}
