package com.igexin.push.p040c.p043c;

import com.igexin.p022a.p023a.p027b.C0246g;

/* renamed from: com.igexin.push.c.c.b */
public class C0353b {
    public int f937a;
    public byte f938b;
    public byte f939c;
    public byte[] f940d;

    public void m1183a(byte[] bArr) {
        if (bArr == null) {
            this.f937a = 0;
            return;
        }
        this.f940d = bArr;
        this.f937a = bArr.length;
    }

    public byte[] m1184a() {
        if (this.f940d == null) {
            return null;
        }
        byte[] bArr = new byte[(this.f937a + 3)];
        C0246g.m829b(this.f937a, bArr, 0);
        C0246g.m832c(this.f938b, bArr, 2);
        C0246g.m822a(this.f940d, 0, bArr, 3, this.f940d.length);
        return bArr;
    }
}
