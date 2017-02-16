package com.amap.p003a;

import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* compiled from: StrictLineReader */
/* renamed from: com.amap.a.af */
public final class af implements Closeable {
    final Charset f169a;
    private final InputStream f170b;
    private byte[] f171c;
    private int f172d;
    private int f173e;

    /* renamed from: com.amap.a.af.1 */
    class StrictLineReader extends ByteArrayOutputStream {
        final /* synthetic */ af f168a;

        StrictLineReader(af afVar, int i) {
            this.f168a = afVar;
            super(i);
        }

        public final String toString() {
            int i = (this.count <= 0 || this.buf[this.count - 1] != 13) ? this.count : this.count - 1;
            try {
                return new String(this.buf, 0, i, this.f168a.f169a.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public af(InputStream inputStream, Charset charset) {
        this(inputStream, charset, (byte) 0);
    }

    private af(InputStream inputStream, Charset charset, byte b) {
        if (inputStream == null || charset == null) {
            throw new NullPointerException();
        } else if (charset.equals(ag.f174a)) {
            this.f170b = inputStream;
            this.f169a = charset;
            this.f171c = new byte[AccessibilityNodeInfoCompat.ACTION_SCROLL_BACKWARD];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    private void m144b() {
        int read = this.f170b.read(this.f171c, 0, this.f171c.length);
        if (read == -1) {
            throw new EOFException();
        }
        this.f172d = 0;
        this.f173e = read;
    }

    public final String m145a() {
        String str;
        synchronized (this.f170b) {
            if (this.f171c == null) {
                throw new IOException("LineReader is closed");
            }
            int i;
            if (this.f172d >= this.f173e) {
                m144b();
            }
            int i2 = this.f172d;
            while (i2 != this.f173e) {
                if (this.f171c[i2] == (byte) 10) {
                    int i3 = (i2 == this.f172d || this.f171c[i2 - 1] != 13) ? i2 : i2 - 1;
                    str = new String(this.f171c, this.f172d, i3 - this.f172d, this.f169a.name());
                    this.f172d = i2 + 1;
                } else {
                    i2++;
                }
            }
            ByteArrayOutputStream strictLineReader = new StrictLineReader(this, (this.f173e - this.f172d) + 80);
            loop1:
            while (true) {
                strictLineReader.write(this.f171c, this.f172d, this.f173e - this.f172d);
                this.f173e = -1;
                m144b();
                i = this.f172d;
                while (i != this.f173e) {
                    if (this.f171c[i] == (byte) 10) {
                        break loop1;
                    }
                    i++;
                }
            }
            if (i != this.f172d) {
                strictLineReader.write(this.f171c, this.f172d, i - this.f172d);
            }
            this.f172d = i + 1;
            str = strictLineReader.toString();
        }
        return str;
    }

    public final void close() {
        synchronized (this.f170b) {
            if (this.f171c != null) {
                this.f171c = null;
                this.f170b.close();
            }
        }
    }
}
