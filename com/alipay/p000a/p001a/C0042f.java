package com.alipay.p000a.p001a;

import com.alipay.p000a.p002b.C0047a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.alipay.C0749a;
import org.json.alipay.C0751b;

/* renamed from: com.alipay.a.a.f */
public final class C0042f {
    private static List<C0036j> f4a;

    static {
        List arrayList = new ArrayList();
        f4a = arrayList;
        arrayList.add(new C0046l());
        f4a.add(new C0040d());
        f4a.add(new C0039c());
        f4a.add(new C0044h());
        f4a.add(new C0038b());
        f4a.add(new C0037a());
        f4a.add(new C0043g());
    }

    public static String m20a(Object obj) {
        if (obj == null) {
            return null;
        }
        Object b = C0042f.m21b(obj);
        if (C0047a.m35a(b.getClass())) {
            return C0751b.m2651c(b.toString());
        }
        if (Collection.class.isAssignableFrom(b.getClass())) {
            return new C0749a((List) b).toString();
        }
        if (Map.class.isAssignableFrom(b.getClass())) {
            return new C0751b((Map) b).toString();
        }
        throw new IllegalArgumentException("Unsupported Class : " + b.getClass());
    }

    public static Object m21b(Object obj) {
        if (obj == null) {
            return null;
        }
        for (C0036j c0036j : f4a) {
            if (c0036j.m4a(obj.getClass())) {
                Object a = c0036j.m3a(obj);
                if (a != null) {
                    return a;
                }
            }
        }
        throw new IllegalArgumentException("Unsupported Class : " + obj.getClass());
    }
}
