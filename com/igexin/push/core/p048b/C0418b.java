package com.igexin.push.core.p048b;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.igexin.push.core.b.b */
public class C0418b {
    public static C0418b f1089a;
    private Map f1090b;

    public C0418b() {
        this.f1090b = new HashMap();
    }

    public static C0418b m1433a() {
        if (f1089a == null) {
            f1089a = new C0418b();
        }
        return f1089a;
    }

    public C0417a m1434a(String str) {
        return (C0417a) this.f1090b.get(str);
    }

    public void m1435a(String str, C0417a c0417a) {
        this.f1090b.put(str, c0417a);
    }
}
