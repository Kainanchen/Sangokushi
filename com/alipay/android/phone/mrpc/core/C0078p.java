package com.alipay.android.phone.mrpc.core;

/* renamed from: com.alipay.android.phone.mrpc.core.p */
public final class C0078p extends C0077u {
    private int f67c;
    private String f68d;
    private long f69e;
    private long f70f;
    private String f71g;
    private HttpUrlHeader f72h;

    public C0078p(HttpUrlHeader httpUrlHeader, int i, String str, byte[] bArr) {
        this.f72h = httpUrlHeader;
        this.f67c = i;
        this.f68d = str;
        this.a = bArr;
    }

    public final HttpUrlHeader m104a() {
        return this.f72h;
    }

    public final void m105a(long j) {
        this.f69e = j;
    }

    public final void m106a(String str) {
        this.f71g = str;
    }

    public final void m107b(long j) {
        this.f70f = j;
    }
}
