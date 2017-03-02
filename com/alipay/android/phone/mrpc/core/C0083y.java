package com.alipay.android.phone.mrpc.core;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* renamed from: com.alipay.android.phone.mrpc.core.y */
public final class C0083y implements InvocationHandler {
    protected C0065g f93a;
    protected Class<?> f94b;
    protected C0084z f95c;

    public C0083y(C0065g c0065g, Class<?> cls, C0084z c0084z) {
        this.f93a = c0065g;
        this.f94b = cls;
        this.f95c = c0084z;
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        C0084z c0084z = this.f95c;
        Class cls = this.f94b;
        return c0084z.m127a(method, objArr);
    }
}
