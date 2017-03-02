package com.alipay.p000a.p001a;

import java.lang.reflect.Type;

/* renamed from: com.alipay.a.a.d */
public final class C0040d implements C0035i, C0036j {
    public final Object m15a(Object obj) {
        return ((Enum) obj).name();
    }

    public final Object m16a(Object obj, Type type) {
        return Enum.valueOf((Class) type, obj.toString());
    }

    public final boolean m17a(Class<?> cls) {
        return Enum.class.isAssignableFrom(cls);
    }
}
