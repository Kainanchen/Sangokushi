package com.facebook.common.p020k;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.facebook.common.k.a */
public final class LimitedInputStream extends FilterInputStream {
    private int f1147a;
    private int f1148b;

    public LimitedInputStream(InputStream inputStream, int i) {
        super(inputStream);
        if (inputStream == null) {
            throw new NullPointerException();
        } else if (i < 0) {
            throw new IllegalArgumentException("limit must be >= 0");
        } else {
            this.f1147a = i;
            this.f1148b = -1;
        }
    }

    public final int read() {
        if (this.f1147a == 0) {
            return -1;
        }
        int read = this.in.read();
        if (read != -1) {
            this.f1147a--;
        }
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (this.f1147a == 0) {
            return -1;
        }
        int read = this.in.read(bArr, i, Math.min(i2, this.f1147a));
        if (read <= 0) {
            return read;
        }
        this.f1147a -= read;
        return read;
    }

    public final long skip(long j) {
        long skip = this.in.skip(Math.min(j, (long) this.f1147a));
        this.f1147a = (int) (((long) this.f1147a) - skip);
        return skip;
    }

    public final int available() {
        return Math.min(this.in.available(), this.f1147a);
    }

    public final void mark(int i) {
        if (this.in.markSupported()) {
            this.in.mark(i);
            this.f1148b = this.f1147a;
        }
    }

    public final void reset() {
        if (!this.in.markSupported()) {
            throw new IOException("mark is not supported");
        } else if (this.f1148b == -1) {
            throw new IOException("mark not set");
        } else {
            this.in.reset();
            this.f1147a = this.f1148b;
        }
    }
}
