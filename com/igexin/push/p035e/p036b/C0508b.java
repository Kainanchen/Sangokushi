package com.igexin.push.p035e.p036b;

import com.igexin.push.core.bean.PushTaskBean;
import com.igexin.push.core.p045a.C0402e;

/* renamed from: com.igexin.push.e.b.b */
public class C0508b extends C0395f {
    private PushTaskBean f1407a;
    private String f1408b;

    public C0508b(PushTaskBean pushTaskBean, String str, long j) {
        super(j);
        this.z = false;
        this.f1407a = pushTaskBean;
        this.f1408b = str;
    }

    protected void m1818a() {
        C0402e.m1330a().m1374b(this.f1407a, this.f1408b);
    }

    public int m1819b() {
        return 0;
    }

    public void m1820c() {
        super.m741c();
    }
}
