package com.facebook.p034f;

import com.facebook.common.p011d.Preconditions;
import java.io.InputStream;

/* renamed from: com.facebook.f.b */
public final class GifFormatChecker {
    private static final byte[] f1515a;
    private static final byte[] f1516b;
    private static final byte[] f1517c;

    static {
        f1515a = new byte[]{(byte) 0, (byte) 33, (byte) -7, (byte) 4};
        f1516b = new byte[]{(byte) 0, (byte) 44};
        f1517c = new byte[]{(byte) 0, (byte) 33};
    }

    public static boolean m1449a(InputStream inputStream) {
        byte[] bArr = new byte[10];
        try {
            inputStream.read(bArr, 0, 10);
            int i = 0;
            int i2 = 0;
            while (inputStream.read(bArr, i2, 1) > 0) {
                if (GifFormatChecker.m1450a(bArr, i2 + 1, f1515a) && (GifFormatChecker.m1450a(bArr, i2 + 9, f1516b) || GifFormatChecker.m1450a(bArr, i2 + 9, f1517c))) {
                    i++;
                    if (i > 1) {
                        return true;
                    }
                }
                i2 = (i2 + 1) % 10;
            }
            return false;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean m1450a(byte[] bArr, int i, byte[] bArr2) {
        Preconditions.m1030a((Object) bArr);
        Preconditions.m1030a((Object) bArr2);
        Preconditions.m1033a(i >= 0);
        if (bArr2.length > 10) {
            return false;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if (bArr[(i2 + i) % 10] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }
}
