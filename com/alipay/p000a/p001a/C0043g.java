package com.alipay.p000a.p001a;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.TreeMap;
import org.json.alipay.C0751b;

/* renamed from: com.alipay.a.a.g */
public final class C0043g implements C0035i, C0036j {
    public final Object m22a(Object obj) {
        Map treeMap = new TreeMap();
        Class cls = obj.getClass();
        Field[] declaredFields = cls.getDeclaredFields();
        while (!cls.equals(Object.class)) {
            if (declaredFields != null && declaredFields.length > 0) {
                for (Field field : declaredFields) {
                    Object obj2;
                    if (field == null || obj == null) {
                        obj2 = null;
                    } else {
                        if ("this$0".equals(field.getName())) {
                            obj2 = null;
                        } else {
                            boolean isAccessible = field.isAccessible();
                            field.setAccessible(true);
                            Object obj3 = field.get(obj);
                            if (obj3 == null) {
                                obj2 = null;
                            } else {
                                field.setAccessible(isAccessible);
                                obj2 = C0042f.m21b(obj3);
                            }
                        }
                    }
                    if (obj2 != null) {
                        treeMap.put(field.getName(), obj2);
                    }
                }
            }
            cls = cls.getSuperclass();
            declaredFields = cls.getDeclaredFields();
        }
        return treeMap;
    }

    public final Object m23a(Object obj, Type type) {
        if (!obj.getClass().equals(C0751b.class)) {
            return null;
        }
        C0751b c0751b = (C0751b) obj;
        Class cls = (Class) type;
        Object newInstance = cls.newInstance();
        while (!cls.equals(Object.class)) {
            Field[] declaredFields = cls.getDeclaredFields();
            if (declaredFields != null && declaredFields.length > 0) {
                for (Field field : declaredFields) {
                    String name = field.getName();
                    Type genericType = field.getGenericType();
                    if (c0751b.m2654b(name)) {
                        field.setAccessible(true);
                        field.set(newInstance, C0041e.m18a(c0751b.m2652a(name), genericType));
                    }
                }
            }
            cls = cls.getSuperclass();
        }
        return newInstance;
    }

    public final boolean m24a(Class<?> cls) {
        return true;
    }
}
