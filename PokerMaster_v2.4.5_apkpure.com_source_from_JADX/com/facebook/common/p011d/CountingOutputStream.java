package com.facebook.common.p011d;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* renamed from: com.facebook.common.d.c */
public final class CountingOutputStream extends FilterOutputStream {
    public long f1108a;

    public CountingOutputStream(OutputStream outputStream) {
        super(outputStream);
        this.f1108a = 0;
    }

    public final void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
        this.f1108a += (long) i2;
    }

    public final void write(int i) {
        this.out.write(i);
        this.f1108a++;
    }

    public final void close() {
        this.out.close();
    }
}
