package com.alipay.p000a.p001a;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import org.json.alipay.C0749a;

/* renamed from: com.alipay.a.a.a */
public final class C0037a implements C0035i, C0036j {
    public final Object m5a(Object obj) {
        Object[] objArr = (Object[]) obj;
        List arrayList = new ArrayList();
        for (Object b : objArr) {
            arrayList.add(C0042f.m21b(b));
        }
        return arrayList;
    }

    public final Object m6a(Object obj, Type type) {
        if (!obj.getClass().equals(C0749a.class)) {
            return null;
        }
        C0749a c0749a = (C0749a) obj;
        if (type instanceof GenericArrayType) {
            throw new IllegalArgumentException("Does not support generic array!");
        }
        Type componentType = ((Class) type).getComponentType();
        int a = c0749a.m2647a();
        Object newInstance = Array.newInstance(componentType, a);
        for (int i = 0; i < a; i++) {
            Array.set(newInstance, i, C0041e.m18a(c0749a.m2648a(i), componentType));
        }
        return newInstance;
    }

    public final boolean m7a(Class<?> cls) {
        return cls.isArray();
    }
}
