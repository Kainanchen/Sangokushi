package com.igexin.push.p040c.p043c;

import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.igexin.download.Downloads;
import com.igexin.p022a.p023a.p027b.C0246g;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.tencent.connect.common.Constants;

/* renamed from: com.igexin.push.c.c.n */
public class C0364n extends C0351e {
    public int f987a;
    public int f988b;
    public long f989c;
    public String f990d;
    public Object f991e;
    public Object f992f;
    public String f993g;
    public String f994h;

    public C0364n() {
        this.f994h = AsyncHttpResponseHandler.DEFAULT_CHARSET;
        this.i = 26;
    }

    public void m1215a(byte[] bArr) {
        this.f987a = C0246g.m830b(bArr, 0);
        this.f988b = bArr[2] & Downloads.STATUS_RUNNING;
        this.f994h = m1173a(bArr[2]);
        this.f989c = C0246g.m834d(bArr, 3);
        int i = bArr[11] & MotionEventCompat.ACTION_MASK;
        try {
            this.f990d = new String(bArr, 12, i, this.f994h);
        } catch (Exception e) {
            this.f990d = Constants.STR_EMPTY;
        }
        int i2 = i + 12;
        i = 0;
        while (true) {
            i |= bArr[i2] & 127;
            if ((bArr[i2] & AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS) == 0) {
                break;
            }
            i <<= 7;
            i2++;
        }
        i2++;
        if (i > 0) {
            if (this.f988b == Downloads.STATUS_RUNNING) {
                this.f991e = new byte[i];
                System.arraycopy(bArr, i2, this.f991e, 0, i);
            } else {
                try {
                    this.f991e = new String(bArr, i2, i, this.f994h);
                } catch (Exception e2) {
                }
            }
        }
        i2 = i + i2;
        i = 0;
        while (true) {
            i |= bArr[i2] & 127;
            if ((bArr[i2] & AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS) == 0) {
                break;
            }
            i <<= 7;
            i2++;
        }
        i2++;
        if (i > 0) {
            this.f992f = new byte[i];
            System.arraycopy(bArr, i2, this.f992f, 0, i);
        }
        i += i2;
        if (bArr.length > i) {
            int i3 = i + 1;
            i = bArr[i] & MotionEventCompat.ACTION_MASK;
            try {
                this.f993g = new String(bArr, i3, i, this.f994h);
            } catch (Exception e3) {
            }
            i += i3;
        }
    }

    public final boolean m1216a() {
        return this.f988b == AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS;
    }

    public byte[] m1217d() {
        int i = 0;
        try {
            byte[] bytes = this.f990d.getBytes(this.f994h);
            byte[] bytes2 = this.f993g.getBytes(this.f994h);
            r5 = !Constants.STR_EMPTY.equals(this.f991e) ? this.f988b == Downloads.STATUS_RUNNING ? (byte[]) this.f991e : ((String) this.f991e).getBytes(this.f994h) : null;
            byte[] bArr = this.f992f != null ? (byte[]) this.f992f : null;
            int length = r5 == null ? 0 : r5.length;
            if (bArr != null) {
                i = bArr.length;
            }
            byte[] a = C0246g.m826a(length);
            byte[] a2 = C0246g.m826a(i);
            byte[] bArr2 = new byte[((((((bytes.length + 13) + a.length) + length) + a2.length) + i) + bytes2.length)];
            try {
                int b = C0246g.m829b(this.f987a, bArr2, 0);
                b += C0246g.m832c(this.f988b | m1172a(this.f994h), bArr2, b);
                b += C0246g.m820a(this.f989c, bArr2, b);
                b += C0246g.m832c(bytes.length, bArr2, b);
                b += C0246g.m822a(bytes, 0, bArr2, b, bytes.length);
                b += C0246g.m822a(a, 0, bArr2, b, a.length);
                if (length > 0) {
                    b += C0246g.m822a(r5, 0, bArr2, b, length);
                }
                b += C0246g.m822a(a2, 0, bArr2, b, a2.length);
                if (i > 0) {
                    b += C0246g.m822a(bArr, 0, bArr2, b, i);
                }
                b += C0246g.m832c(bytes2.length, bArr2, b);
                b += C0246g.m822a(bytes2, 0, bArr2, b, bytes2.length);
                return bArr2;
            } catch (Exception e) {
                return bArr2;
            }
        } catch (Exception e2) {
            return null;
        }
    }
}
