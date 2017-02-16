package com.facebook.p035g;

import android.support.v4.view.MotionEventCompat;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.facebook.g.c */
final class StreamProcessor {
    public static int m1466a(InputStream inputStream, int i, boolean z) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            int read = inputStream.read();
            if (read == -1) {
                throw new IOException("no more bytes");
            }
            if (z) {
                i2 |= (read & MotionEventCompat.ACTION_MASK) << (i3 * 8);
            } else {
                i2 = (i2 << 8) | (read & MotionEventCompat.ACTION_MASK);
            }
        }
        return i2;
    }
}
