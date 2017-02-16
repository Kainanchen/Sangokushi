package com.amap.p003a;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: Reflect */
/* renamed from: com.amap.a.bp */
public final class bp {
    public static Object m426a(Object obj, String str, Object... objArr) {
        Class cls = obj.getClass();
        Class[] clsArr = new Class[objArr.length];
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            clsArr[i] = objArr[i].getClass();
            if (clsArr[i] == Integer.class) {
                clsArr[i] = Integer.TYPE;
            }
        }
        Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
        if (!declaredMethod.isAccessible()) {
            declaredMethod.setAccessible(true);
        }
        try {
            return declaredMethod.invoke(obj, objArr);
        } catch (Throwable th) {
            return null;
        }
    }

    public static Object m427a(String str, String str2) {
        Class cls = Class.forName(str);
        Field field = cls.getField(str2);
        field.setAccessible(true);
        return field.get(cls);
    }

    public static Object m428a(String str, String str2, Object[] objArr, Class<?>[] clsArr) {
        Method declaredMethod = Class.forName(str).getDeclaredMethod(str2, clsArr);
        if (!declaredMethod.isAccessible()) {
            declaredMethod.setAccessible(true);
        }
        return declaredMethod.invoke(null, objArr);
    }

    public static int m429b(Object obj, String str, Object... objArr) {
        return ((Integer) bp.m426a(obj, str, objArr)).intValue();
    }

    public static int m430b(String str, String str2) {
        return ((Integer) bp.m427a(str, str2)).intValue();
    }
}
