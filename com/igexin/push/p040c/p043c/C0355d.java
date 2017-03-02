package com.igexin.push.p040c.p043c;

import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.igexin.download.Downloads;
import com.igexin.p022a.p023a.p027b.C0246g;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.tencent.connect.common.Constants;

/* renamed from: com.igexin.push.c.c.d */
public class C0355d extends C0351e {
    public int f948a;
    public int f949b;
    public long f950c;
    public String f951d;
    public Object f952e;
    public Object f953f;
    public String f954g;
    public String f955h;

    public C0355d() {
        this.f954g = Constants.STR_EMPTY;
        this.f955h = AsyncHttpResponseHandler.DEFAULT_CHARSET;
        this.i = 25;
        this.j = (byte) 52;
    }

    public final void m1192a() {
        this.f949b = AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS;
    }

    public void m1193a(byte[] bArr) {
        this.f948a = C0246g.m830b(bArr, 0);
        this.f949b = bArr[2] & Downloads.STATUS_RUNNING;
        this.f955h = m1173a(bArr[2]);
        this.f950c = C0246g.m834d(bArr, 3);
        int i = bArr[11] & MotionEventCompat.ACTION_MASK;
        try {
            this.f951d = new String(bArr, 12, i, this.f955h);
        } catch (Exception e) {
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
            if (this.f949b == Downloads.STATUS_RUNNING) {
                this.f952e = new byte[i];
                System.arraycopy(bArr, i2, this.f952e, 0, i);
            } else {
                try {
                    this.f952e = new String(bArr, i2, i, this.f955h);
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
            this.f953f = new byte[i];
            System.arraycopy(bArr, i2, this.f953f, 0, i);
        }
        i += i2;
        if (bArr.length > i) {
            int i3 = i + 1;
            i = bArr[i] & MotionEventCompat.ACTION_MASK;
            try {
                this.f954g = new String(bArr, i3, i, this.f955h);
            } catch (Exception e3) {
            }
            i += i3;
        }
    }

    public byte[] m1194d() {
        byte[] bArr;
        int i = 0;
        try {
            byte[] bytes = this.f951d.getBytes(this.f955h);
            r5 = !Constants.STR_EMPTY.equals(this.f952e) ? this.f949b == Downloads.STATUS_RUNNING ? (byte[]) this.f952e : ((String) this.f952e).getBytes(this.f955h) : null;
            byte[] bArr2 = this.f953f != null ? (byte[]) this.f953f : null;
            byte[] bytes2 = this.f954g.getBytes(this.f955h);
            int length = r5 == null ? 0 : r5.length;
            if (bArr2 != null) {
                i = bArr2.length;
            }
            byte[] a = C0246g.m826a(length);
            byte[] a2 = C0246g.m826a(i);
            bArr = new byte[((((((bytes.length + 13) + a.length) + length) + a2.length) + i) + bytes2.length)];
            try {
                int b = C0246g.m829b(this.f948a, bArr, 0);
                b += C0246g.m832c(this.f949b | m1172a(this.f955h), bArr, b);
                b += C0246g.m820a(this.f950c, bArr, b);
                b += C0246g.m832c(bytes.length, bArr, b);
                b += C0246g.m822a(bytes, 0, bArr, b, bytes.length);
                b += C0246g.m822a(a, 0, bArr, b, a.length);
                if (length > 0) {
                    b += C0246g.m822a(r5, 0, bArr, b, length);
                }
                b += C0246g.m822a(a2, 0, bArr, b, a2.length);
                if (i > 0) {
                    b += C0246g.m822a(bArr2, 0, bArr, b, i);
                }
                b += C0246g.m832c(bytes2.length, bArr, b);
                b += C0246g.m822a(bytes2, 0, bArr, b, bytes2.length);
            } catch (Exception e) {
            }
        } catch (Exception e2) {
            bArr = null;
        }
        if (bArr != null && bArr.length >= AccessibilityNodeInfoCompat.ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY) {
            this.j = (byte) (this.j | AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS);
        }
        return bArr;
    }
}
