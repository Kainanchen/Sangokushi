package com.alipay.android.phone.mrpc.core;

import java.lang.reflect.Method;

/* renamed from: com.alipay.android.phone.mrpc.core.a */
public abstract class C0057a implements C0056v {
    protected Method f13a;
    protected byte[] f14b;
    protected String f15c;
    protected int f16d;
    protected String f17e;
    protected boolean f18f;

    public C0057a(Method method, int i, String str, byte[] bArr, String str2, boolean z) {
        this.f13a = method;
        this.f16d = i;
        this.f15c = str;
        this.f14b = bArr;
        this.f17e = str2;
        this.f18f = z;
    }
}
