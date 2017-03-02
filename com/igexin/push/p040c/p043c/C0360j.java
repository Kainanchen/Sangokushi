package com.igexin.push.p040c.p043c;

/* renamed from: com.igexin.push.c.c.j */
public class C0360j extends C0351e {
    public byte f974a;
    public Object f975b;

    public void m1207a(byte[] bArr) {
    }

    public byte[] m1208d() {
        Object obj = null;
        if (this.f974a == (byte) 1) {
            obj = ((String) this.f975b).getBytes();
        } else if (!(this.f974a == (byte) 2 || this.f974a == 3 || this.f974a != 4)) {
            obj = ((String) this.f975b).getBytes();
        }
        Object obj2 = new byte[(obj.length + 2)];
        obj2[0] = this.f974a;
        obj2[1] = (byte) obj.length;
        System.arraycopy(obj, 0, obj2, 2, obj.length);
        return obj2;
    }
}
