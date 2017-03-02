package com.alipay.p000a.p001a;

import com.alipay.p000a.p002b.C0047a;
import com.alipay.sdk.util.C0201h;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import org.json.alipay.C0749a;
import org.json.alipay.C0751b;

/* renamed from: com.alipay.a.a.e */
public final class C0041e {
    static List<C0035i> f3a;

    static {
        List arrayList = new ArrayList();
        f3a = arrayList;
        arrayList.add(new C0046l());
        f3a.add(new C0040d());
        f3a.add(new C0039c());
        f3a.add(new C0044h());
        f3a.add(new C0045k());
        f3a.add(new C0038b());
        f3a.add(new C0037a());
        f3a.add(new C0043g());
    }

    public static final <T> T m18a(Object obj, Type type) {
        for (C0035i c0035i : f3a) {
            if (c0035i.m2a(C0047a.m34a(type))) {
                T a = c0035i.m1a(obj, type);
                if (a != null) {
                    return a;
                }
            }
        }
        return null;
    }

    public static final Object m19a(String str, Type type) {
        if (str == null || str.length() == 0) {
            return null;
        }
        Object trim = str.trim();
        return (trim.startsWith("[") && trim.endsWith("]")) ? C0041e.m18a(new C0749a((String) trim), type) : (trim.startsWith("{") && trim.endsWith(C0201h.f512d)) ? C0041e.m18a(new C0751b((String) trim), type) : C0041e.m18a(trim, type);
    }
}
