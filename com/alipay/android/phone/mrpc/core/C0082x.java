package com.alipay.android.phone.mrpc.core;

import java.lang.reflect.Proxy;

/* renamed from: com.alipay.android.phone.mrpc.core.x */
public final class C0082x {
    private C0065g f91a;
    private C0084z f92b;

    public C0082x(C0065g c0065g) {
        this.f91a = c0065g;
        this.f92b = new C0084z(this);
    }

    public final C0065g m125a() {
        return this.f91a;
    }

    public final <T> T m126a(Class<T> cls) {
        return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C0083y(this.f91a, cls, this.f92b));
    }
}
