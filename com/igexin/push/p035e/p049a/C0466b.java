package com.igexin.push.p035e.p049a;

import com.igexin.p022a.p023a.p025d.C0230a;
import java.io.InputStream;

/* renamed from: com.igexin.push.e.a.b */
public abstract class C0466b extends C0230a {
    String f1247e;
    byte[] f1248f;
    InputStream f1249g;
    long f1250h;
    public boolean f1251i;

    public C0466b(String str) {
        this.f1247e = str;
    }

    public void m1636a(Exception exception) {
    }

    public void m1637a(byte[] bArr) {
        this.f1251i = false;
        if (bArr != null && bArr.length >= 7 && bArr[5] == 111 && bArr[6] == 107) {
            this.f1251i = true;
        }
    }

    public void m1638b(byte[] bArr) {
        this.f1248f = bArr;
    }

    public String m1639c() {
        return this.f1247e;
    }

    public byte[] m1640d() {
        return this.f1248f;
    }

    public InputStream m1641e() {
        return this.f1249g;
    }

    public long m1642f() {
        return this.f1250h;
    }
}
