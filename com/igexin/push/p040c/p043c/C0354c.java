package com.igexin.push.p040c.p043c;

import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.igexin.download.Downloads;
import com.igexin.p022a.p023a.p027b.C0246g;
import com.igexin.push.p035e.p036b.C0508b;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.tencent.connect.common.Constants;

/* renamed from: com.igexin.push.c.c.c */
public class C0354c extends C0351e {
    public int f941a;
    public int f942b;
    public Object f943c;
    public String f944d;
    public String f945e;
    public int f946f;
    public C0508b f947g;

    public C0354c() {
        this.f945e = AsyncHttpResponseHandler.DEFAULT_CHARSET;
        this.f946f = 1;
        this.i = 27;
        this.j = (byte) 52;
    }

    public final void m1185a() {
        this.f942b = 64;
    }

    public void m1186a(int i) {
        this.f946f = i;
    }

    public void m1187a(C0508b c0508b) {
        this.f947g = c0508b;
    }

    public void m1188a(byte[] bArr) {
        this.f941a = C0246g.m830b(bArr, 0);
        this.f942b = bArr[2] & Downloads.STATUS_RUNNING;
        this.f945e = m1173a(bArr[2]);
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
            if (this.f942b == Downloads.STATUS_RUNNING) {
                this.f943c = new byte[i2];
                System.arraycopy(bArr, i, this.f943c, 0, i2);
            } else {
                try {
                    this.f943c = new String(bArr, i, i2, this.f945e);
                } catch (Exception e) {
                }
            }
        }
        i2 += i;
        int i3 = bArr[i2] & MotionEventCompat.ACTION_MASK;
        i2++;
        if (bArr.length > i2) {
            try {
                this.f944d = new String(bArr, i2, i3, this.f945e);
            } catch (Exception e2) {
            }
            i2 += i3;
        }
    }

    public int m1189c() {
        return this.f946f;
    }

    public byte[] m1190d() {
        byte[] bArr;
        int i = 0;
        try {
            byte[] bytes = this.f944d.getBytes(this.f945e);
            r3 = !Constants.STR_EMPTY.equals(this.f943c) ? this.f942b == Downloads.STATUS_RUNNING ? (byte[]) this.f943c : ((String) this.f943c).getBytes(this.f945e) : null;
            if (r3 != null) {
                i = r3.length;
            }
            byte[] a = C0246g.m826a(i);
            bArr = new byte[(((a.length + 4) + i) + bytes.length)];
            try {
                int b = C0246g.m829b(this.f941a, bArr, 0);
                b += C0246g.m832c(this.f942b | m1172a(this.f945e), bArr, b);
                b += C0246g.m822a(a, 0, bArr, b, a.length);
                if (i > 0) {
                    b += C0246g.m822a(r3, 0, bArr, b, i);
                }
                b += C0246g.m832c(bytes.length, bArr, b);
                b += C0246g.m822a(bytes, 0, bArr, b, bytes.length);
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

    public C0508b m1191e() {
        return this.f947g;
    }
}
