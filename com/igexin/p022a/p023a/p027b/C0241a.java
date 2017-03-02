package com.igexin.p022a.p023a.p027b;

import android.support.v4.view.MotionEventCompat;
import java.io.OutputStream;

/* renamed from: com.igexin.a.a.b.a */
public class C0241a extends OutputStream {
    private OutputStream f603a;
    private int f604b;
    private int f605c;
    private int f606d;
    private int f607e;

    public C0241a(OutputStream outputStream, int i) {
        this.f603a = null;
        this.f604b = 0;
        this.f605c = 0;
        this.f606d = 0;
        this.f607e = 0;
        this.f603a = outputStream;
        this.f607e = i;
    }

    protected void m783a() {
        int i = 61;
        if (this.f605c > 0) {
            if (this.f607e > 0 && this.f606d == this.f607e) {
                this.f603a.write("\r\n".getBytes());
                this.f606d = 0;
            }
            char charAt = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((this.f604b << 8) >>> 26);
            char charAt2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((this.f604b << 14) >>> 26);
            int charAt3 = this.f605c < 2 ? 61 : "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((this.f604b << 20) >>> 26);
            if (this.f605c >= 3) {
                i = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((this.f604b << 26) >>> 26);
            }
            this.f603a.write(charAt);
            this.f603a.write(charAt2);
            this.f603a.write(charAt3);
            this.f603a.write(i);
            this.f606d += 4;
            this.f605c = 0;
            this.f604b = 0;
        }
    }

    public void close() {
        m783a();
        this.f603a.close();
    }

    public void write(int i) {
        this.f604b = ((i & MotionEventCompat.ACTION_MASK) << (16 - (this.f605c * 8))) | this.f604b;
        this.f605c++;
        if (this.f605c == 3) {
            m783a();
        }
    }
}
