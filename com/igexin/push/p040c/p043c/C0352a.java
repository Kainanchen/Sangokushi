package com.igexin.push.p040c.p043c;

import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.igexin.download.Downloads;
import com.igexin.p022a.p023a.p027b.C0246g;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.tencent.connect.common.Constants;

/* renamed from: com.igexin.push.c.c.a */
public class C0352a extends C0351e {
    public int f930a;
    public int f931b;
    public Object f932c;
    public String f933d;
    public String f934e;
    private int f935f;
    private int f936g;

    public C0352a() {
        this.f935f = 0;
        this.f936g = 0;
        this.f934e = AsyncHttpResponseHandler.DEFAULT_CHARSET;
        this.i = 28;
    }

    public int m1177a() {
        return this.f935f;
    }

    public void m1178a(int i) {
        this.f935f = i;
    }

    public void m1179a(byte[] bArr) {
        this.f930a = C0246g.m830b(bArr, 0);
        this.f931b = bArr[2] & Downloads.STATUS_RUNNING;
        this.f934e = m1173a(bArr[2]);
        int i = 3;
        int i2 = 0;
        while (true) {
            i2 |= bArr[i] & 127;
            if ((bArr[i] & AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS) == 0) {
                break;
            }
            i2 <<= 7;
            i++;
        }
        i++;
        if (i2 > 0) {
            if (this.f931b == Downloads.STATUS_RUNNING) {
                this.f932c = new byte[i2];
                System.arraycopy(bArr, i, this.f932c, 0, i2);
            } else {
                try {
                    this.f932c = new String(bArr, i, i2, this.f934e);
                } catch (Exception e) {
                }
            }
        }
        i2 += i;
        int i3 = bArr[i2] & MotionEventCompat.ACTION_MASK;
        i2++;
        if (bArr.length > i2) {
            try {
                this.f933d = new String(bArr, i2, i3, this.f934e);
            } catch (Exception e2) {
            }
            i2 += i3;
        }
    }

    public void m1180b(int i) {
        this.f936g = i;
    }

    public int m1181c() {
        return this.f936g;
    }

    public byte[] m1182d() {
        int i = 0;
        try {
            byte[] bytes = this.f933d.getBytes(this.f934e);
            r3 = !Constants.STR_EMPTY.equals(this.f932c) ? this.f931b == Downloads.STATUS_RUNNING ? (byte[]) this.f932c : ((String) this.f932c).getBytes(this.f934e) : null;
            if (r3 != null) {
                i = r3.length;
            }
            byte[] a = C0246g.m826a(i);
            byte[] bArr = new byte[(((a.length + 4) + i) + bytes.length)];
            try {
                int b = C0246g.m829b(this.f930a, bArr, 0);
                b += C0246g.m832c(this.f931b | m1172a(this.f934e), bArr, b);
                b += C0246g.m822a(a, 0, bArr, b, a.length);
                if (i > 0) {
                    b += C0246g.m822a(r3, 0, bArr, b, i);
                }
                b += C0246g.m832c(bytes.length, bArr, b);
                b += C0246g.m822a(bytes, 0, bArr, b, bytes.length);
                return bArr;
            } catch (Exception e) {
                return bArr;
            }
        } catch (Exception e2) {
            return null;
        }
    }
}
