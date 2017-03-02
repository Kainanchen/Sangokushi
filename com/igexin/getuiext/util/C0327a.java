package com.igexin.getuiext.util;

import android.support.v4.view.MotionEventCompat;
import java.io.OutputStream;

/* renamed from: com.igexin.getuiext.util.a */
public class C0327a extends OutputStream {
    private OutputStream f892a;
    private int f893b;
    private int f894c;
    private int f895d;
    private int f896e;

    public C0327a(OutputStream outputStream, int i) {
        this.f892a = null;
        this.f893b = 0;
        this.f894c = 0;
        this.f895d = 0;
        this.f896e = 0;
        this.f892a = outputStream;
        this.f896e = i;
    }

    protected void m1090a() {
        int i = 61;
        if (this.f894c > 0) {
            if (this.f896e > 0 && this.f895d == this.f896e) {
                this.f892a.write("\r\n".getBytes());
                this.f895d = 0;
            }
            char charAt = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((this.f893b << 8) >>> 26);
            char charAt2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((this.f893b << 14) >>> 26);
            int charAt3 = this.f894c < 2 ? 61 : "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((this.f893b << 20) >>> 26);
            if (this.f894c >= 3) {
                i = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((this.f893b << 26) >>> 26);
            }
            this.f892a.write(charAt);
            this.f892a.write(charAt2);
            this.f892a.write(charAt3);
            this.f892a.write(i);
            this.f895d += 4;
            this.f894c = 0;
            this.f893b = 0;
        }
    }

    public void close() {
        m1090a();
        this.f892a.close();
    }

    public void write(int i) {
        this.f893b = ((i & MotionEventCompat.ACTION_MASK) << (16 - (this.f894c * 8))) | this.f893b;
        this.f894c++;
        if (this.f894c == 3) {
            m1090a();
        }
    }
}
