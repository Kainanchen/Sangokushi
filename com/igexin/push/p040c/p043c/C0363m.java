package com.igexin.push.p040c.p043c;

import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.igexin.p022a.p023a.p027b.C0246g;

/* renamed from: com.igexin.push.c.c.m */
public class C0363m extends C0351e {
    public boolean f982a;
    public boolean f983b;
    public String f984c;
    public String f985d;
    public long f986e;

    public C0363m() {
        this.i = 37;
    }

    public void m1213a(byte[] bArr) {
        int i = 1;
        boolean z = false;
        byte b = bArr[0];
        this.f982a = (b & 64) != 0;
        if ((b & AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS) != 0) {
            z = true;
        }
        this.f983b = z;
        if (this.f983b) {
            this.f984c = m1173a(b);
            int b2 = C0246g.m830b(bArr, 1);
            i = (b2 + 2) + 1;
            try {
                this.f985d = new String(bArr, 3, b2, this.f984c);
            } catch (Exception e) {
            }
        }
        if (bArr.length > i) {
            this.f986e = C0246g.m834d(bArr, i);
            b2 = i + 8;
        }
    }

    public byte[] m1214d() {
        int i;
        byte[] bytes;
        int i2;
        byte a;
        int i3;
        byte[] bArr;
        int i4 = this.f982a ? (byte) 64 : 0;
        if (this.f983b) {
            byte b = (byte) (i4 | AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS);
            i = 3;
            try {
                bytes = this.f985d.getBytes(this.f984c);
                try {
                    i = bytes.length;
                    i2 = i + 3;
                } catch (Exception e) {
                    i2 = i;
                    i = 0;
                    a = (byte) (b | m1172a(this.f984c));
                    i3 = i2;
                    i2 = a;
                    bArr = new byte[(i3 + 8)];
                    i2 = C0246g.m832c(i2, bArr, 0);
                    if (this.f983b) {
                        i2 = C0246g.m829b(i, bArr, i2);
                        if (bytes != null) {
                            i4 = C0246g.m822a(bytes, 0, bArr, i2, i) + i2;
                            i4 += C0246g.m820a(this.f986e, bArr, i4);
                            return bArr;
                        }
                    }
                    i4 = i2;
                    i4 += C0246g.m820a(this.f986e, bArr, i4);
                    return bArr;
                }
            } catch (Exception e2) {
                bytes = null;
                i2 = i;
                i = 0;
                a = (byte) (b | m1172a(this.f984c));
                i3 = i2;
                i2 = a;
                bArr = new byte[(i3 + 8)];
                i2 = C0246g.m832c(i2, bArr, 0);
                if (this.f983b) {
                    i2 = C0246g.m829b(i, bArr, i2);
                    if (bytes != null) {
                        i4 = C0246g.m822a(bytes, 0, bArr, i2, i) + i2;
                        i4 += C0246g.m820a(this.f986e, bArr, i4);
                        return bArr;
                    }
                }
                i4 = i2;
                i4 += C0246g.m820a(this.f986e, bArr, i4);
                return bArr;
            }
            a = (byte) (b | m1172a(this.f984c));
            i3 = i2;
            i2 = a;
        } else {
            i3 = 1;
            i = 0;
            int i5 = i4;
            bytes = null;
            i2 = i5;
        }
        bArr = new byte[(i3 + 8)];
        i2 = C0246g.m832c(i2, bArr, 0);
        if (this.f983b) {
            i2 = C0246g.m829b(i, bArr, i2);
            if (bytes != null) {
                i4 = C0246g.m822a(bytes, 0, bArr, i2, i) + i2;
                i4 += C0246g.m820a(this.f986e, bArr, i4);
                return bArr;
            }
        }
        i4 = i2;
        i4 += C0246g.m820a(this.f986e, bArr, i4);
        return bArr;
    }
}
