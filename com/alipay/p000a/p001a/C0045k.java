package com.alipay.p000a.p001a;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.json.alipay.C0749a;

/* renamed from: com.alipay.a.a.k */
public final class C0045k implements C0035i {
    public final Object m29a(Object obj, Type type) {
        int i = 0;
        if (!obj.getClass().equals(C0749a.class)) {
            return null;
        }
        C0749a c0749a = (C0749a) obj;
        Collection hashSet = new HashSet();
        Type type2 = type instanceof ParameterizedType ? ((ParameterizedType) type).getActualTypeArguments()[0] : Object.class;
        while (i < c0749a.m2647a()) {
            hashSet.add(C0041e.m18a(c0749a.m2648a(i), type2));
            i++;
        }
        return hashSet;
    }

    public final boolean m30a(Class<?> cls) {
        return Set.class.isAssignableFrom(cls);
    }
}
