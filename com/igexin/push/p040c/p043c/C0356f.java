package com.igexin.push.p040c.p043c;

import com.igexin.p022a.p023a.p027b.C0246g;
import com.tencent.connect.common.Constants;

/* renamed from: com.igexin.push.c.c.f */
public class C0356f extends C0351e {
    String f956a;
    String f957b;
    String f958c;
    String f959d;

    public C0356f() {
        this.i = 6;
        this.j = (byte) 52;
        this.f956a = Constants.STR_EMPTY;
        this.f957b = Constants.STR_EMPTY;
        this.f958c = Constants.STR_EMPTY;
        this.f959d = Constants.STR_EMPTY;
    }

    public C0356f(String str, String str2, String str3, String str4) {
        this.i = 6;
        this.j = (byte) 52;
        if (str == null) {
            str = Constants.STR_EMPTY;
        }
        this.f956a = str;
        if (str2 == null) {
            str2 = Constants.STR_EMPTY;
        }
        this.f957b = str2;
        if (str3 == null) {
            str3 = Constants.STR_EMPTY;
        }
        this.f958c = str3;
        if (str4 == null) {
            str4 = Constants.STR_EMPTY;
        }
        this.f959d = str4;
    }

    public String m1195a() {
        return this.f958c;
    }

    public void m1196a(byte[] bArr) {
        try {
            int a = C0246g.m821a(bArr, 0);
            this.f956a = new String(bArr, 1, a, "utf-8");
            a++;
            int a2 = C0246g.m821a(bArr, a);
            a++;
            this.f957b = new String(bArr, a, a2, "utf-8");
            a += a2;
            a2 = C0246g.m821a(bArr, a);
            a++;
            this.f958c = new String(bArr, a, a2, "utf-8");
            a += a2;
            a2 = C0246g.m821a(bArr, a);
            a++;
            this.f959d = new String(bArr, a, a2, "utf-8");
            a += a2;
        } catch (Exception e) {
        }
    }

    public byte[] m1197d() {
        Object bytes = this.f957b.getBytes();
        Object bytes2 = this.f956a.getBytes();
        Object bytes3 = this.f958c.getBytes();
        Object bytes4 = this.f959d.getBytes();
        Object obj = new byte[((((bytes.length + bytes2.length) + bytes3.length) + bytes4.length) + 4)];
        C0246g.m832c(bytes.length, obj, 0);
        System.arraycopy(bytes, 0, obj, 1, bytes.length);
        int length = bytes.length + 1;
        int i = length + 1;
        C0246g.m832c(bytes2.length, obj, length);
        System.arraycopy(bytes2, 0, obj, i, bytes2.length);
        length = bytes2.length + i;
        int i2 = length + 1;
        C0246g.m832c(bytes3.length, obj, length);
        System.arraycopy(bytes3, 0, obj, i2, bytes3.length);
        length = bytes3.length + i2;
        int i3 = length + 1;
        C0246g.m832c(bytes4.length, obj, length);
        System.arraycopy(bytes4, 0, obj, i3, bytes4.length);
        length = bytes4.length + i3;
        return obj;
    }
}
