package com.igexin.push.p040c.p043c;

import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.igexin.p022a.p023a.p027b.C0246g;

/* renamed from: com.igexin.push.c.c.k */
public class C0361k extends C0351e {
    public boolean f976a;
    public boolean f977b;
    public String f978c;
    public String f979d;
    public long f980e;

    public C0361k() {
        this.i = 5;
    }

    public void m1209a(byte[] bArr) {
        int i = 1;
        boolean z = false;
        byte b = bArr[0];
        this.f976a = (b & 64) != 0;
        if ((b & AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS) != 0) {
            z = true;
        }
        this.f977b = z;
        if (this.f977b) {
            this.f978c = m1173a(b);
            int b2 = C0246g.m830b(bArr, 1);
            i = (b2 + 2) + 1;
            try {
                this.f979d = new String(bArr, 3, b2, this.f978c);
            } catch (Exception e) {
            }
        }
        if (bArr.length > i) {
            this.f980e = C0246g.m834d(bArr, i);
            b2 = i + 8;
        }
    }

    public byte[] m1210d() {
        int i;
        byte[] bytes;
        int i2;
        byte a;
        int i3;
        byte[] bArr;
        int i4 = this.f976a ? (byte) 64 : 0;
        if (this.f977b) {
            byte b = (byte) (i4 | AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS);
            i = 3;
            try {
                bytes = this.f979d.getBytes(this.f978c);
                try {
                    i = bytes.length;
                    i2 = i + 3;
                } catch (Exception e) {
                    i2 = i;
                    i = 0;
                    a = (byte) (b | m1172a(this.f978c));
                    i3 = i2;
                    i2 = a;
                    bArr = new byte[(i3 + 8)];
                    i2 = C0246g.m832c(i2, bArr, 0);
                    if (this.f977b) {
                        i2 = C0246g.m829b(i, bArr, i2);
                        if (bytes != null) {
                            i4 = C0246g.m822a(bytes, 0, bArr, i2, i) + i2;
                            i4 += C0246g.m820a(this.f980e, bArr, i4);
                            return bArr;
                        }
                    }
                    i4 = i2;
                    i4 += C0246g.m820a(this.f980e, bArr, i4);
                    return bArr;
                }
            } catch (Exception e2) {
                bytes = null;
                i2 = i;
                i = 0;
                a = (byte) (b | m1172a(this.f978c));
                i3 = i2;
                i2 = a;
                bArr = new byte[(i3 + 8)];
                i2 = C0246g.m832c(i2, bArr, 0);
                if (this.f977b) {
                    i2 = C0246g.m829b(i, bArr, i2);
                    if (bytes != null) {
                        i4 = C0246g.m822a(bytes, 0, bArr, i2, i) + i2;
                        i4 += C0246g.m820a(this.f980e, bArr, i4);
                        return bArr;
                    }
                }
                i4 = i2;
                i4 += C0246g.m820a(this.f980e, bArr, i4);
                return bArr;
            }
            a = (byte) (b | m1172a(this.f978c));
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
        if (this.f977b) {
            i2 = C0246g.m829b(i, bArr, i2);
            if (bytes != null) {
                i4 = C0246g.m822a(bytes, 0, bArr, i2, i) + i2;
                i4 += C0246g.m820a(this.f980e, bArr, i4);
                return bArr;
            }
        }
        i4 = i2;
        i4 += C0246g.m820a(this.f980e, bArr, i4);
        return bArr;
    }
}
