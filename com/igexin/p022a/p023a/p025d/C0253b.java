package com.igexin.p022a.p023a.p025d;

import com.igexin.p022a.p023a.p025d.p026a.C0252g;
import java.util.concurrent.TimeUnit;

/* renamed from: com.igexin.a.a.d.b */
public abstract class C0253b implements C0252g {
    protected boolean f649a;

    public C0253b() {
        this.f649a = true;
    }

    public void m852a() {
        this.f649a = false;
    }

    public boolean m853a(long j, C0233d c0233d) {
        return TimeUnit.SECONDS.toMillis((long) c0233d.f554J) < j - c0233d.f552H;
    }

    public long m854b(long j, C0233d c0233d) {
        return (TimeUnit.SECONDS.toMillis((long) c0233d.f554J) + c0233d.f552H) - j;
    }

    public boolean m855b() {
        return this.f649a;
    }
}
