package com.igexin.push.p040c.p043c;

import com.igexin.p022a.p023a.p027b.C0246g;

/* renamed from: com.igexin.push.c.c.l */
public class C0362l extends C0351e {
    public long f981a;

    public C0362l() {
        this.i = 36;
        this.j = (byte) 52;
    }

    public void m1211a(byte[] bArr) {
        this.f981a = C0246g.m834d(bArr, 0);
    }

    public byte[] m1212d() {
        byte[] bArr = new byte[8];
        C0246g.m820a(this.f981a, bArr, 0);
        return bArr;
    }
}
