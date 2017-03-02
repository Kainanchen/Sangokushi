package com.alipay.p000a.p001a;

import java.lang.reflect.Type;
import java.util.Date;

/* renamed from: com.alipay.a.a.c */
public final class C0039c implements C0035i, C0036j {
    public final Object m12a(Object obj) {
        return Long.valueOf(((Date) obj).getTime());
    }

    public final Object m13a(Object obj, Type type) {
        return new Date(((Long) obj).longValue());
    }

    public final boolean m14a(Class<?> cls) {
        return Date.class.isAssignableFrom(cls);
    }
}
