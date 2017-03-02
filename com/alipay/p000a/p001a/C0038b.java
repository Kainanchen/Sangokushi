package com.alipay.p000a.p001a;

import com.alipay.p000a.p002b.C0047a;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;
import org.json.alipay.C0749a;

/* renamed from: com.alipay.a.a.b */
public final class C0038b implements C0035i, C0036j {
    private static Collection<Object> m8a(Class<?> cls, Type type) {
        if (cls == AbstractCollection.class) {
            return new ArrayList();
        }
        if (cls.isAssignableFrom(HashSet.class)) {
            return new HashSet();
        }
        if (cls.isAssignableFrom(LinkedHashSet.class)) {
            return new LinkedHashSet();
        }
        if (cls.isAssignableFrom(TreeSet.class)) {
            return new TreeSet();
        }
        if (cls.isAssignableFrom(ArrayList.class)) {
            return new ArrayList();
        }
        if (cls.isAssignableFrom(EnumSet.class)) {
            return EnumSet.noneOf(type instanceof ParameterizedType ? ((ParameterizedType) type).getActualTypeArguments()[0] : Object.class);
        }
        try {
            return (Collection) cls.newInstance();
        } catch (Exception e) {
            throw new IllegalArgumentException("create instane error, class " + cls.getName());
        }
    }

    public final Object m9a(Object obj) {
        List arrayList = new ArrayList();
        for (Object b : (Iterable) obj) {
            arrayList.add(C0042f.m21b(b));
        }
        return arrayList;
    }

    public final Object m10a(Object obj, Type type) {
        int i = 0;
        if (!obj.getClass().equals(C0749a.class)) {
            return null;
        }
        C0749a c0749a = (C0749a) obj;
        Collection a = C0038b.m8a(C0047a.m34a(type), type);
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            while (i < c0749a.m2647a()) {
                a.add(C0041e.m18a(c0749a.m2648a(i), type2));
                i++;
            }
            return a;
        }
        throw new IllegalArgumentException("Does not support the implement for generics.");
    }

    public final boolean m11a(Class<?> cls) {
        return Collection.class.isAssignableFrom(cls);
    }
}
