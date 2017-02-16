package com.facebook.p034f;

import com.facebook.common.p011d.ByteStreams;
import com.facebook.common.p011d.Preconditions;
import com.facebook.common.p011d.Throwables;
import com.facebook.common.p022m.WebpSupportStatus;
import com.facebook.p034f.ImageFormat.ImageFormat;
import com.qq.taf.jce.JceStruct;
import java.io.InputStream;

/* renamed from: com.facebook.f.d */
public final class ImageFormatChecker {
    private static final ImageFormat f1521a;
    private static final byte[] f1522b;
    private static final byte[] f1523c;
    private static final byte[] f1524d;
    private static final byte[] f1525e;
    private static final byte[] f1526f;
    private static final int f1527g;

    /* renamed from: com.facebook.f.d.1 */
    static class ImageFormatChecker implements ImageFormat {
        ImageFormatChecker() {
        }

        public final ImageFormat m1452a(byte[] bArr, int i) {
            Preconditions.m1030a((Object) bArr);
            if (WebpSupportStatus.m1137b(bArr, i)) {
                return ImageFormatChecker.m1455a(bArr, i);
            }
            if (ImageFormatChecker.m1458b(bArr, i)) {
                return DefaultImageFormats.f1506a;
            }
            if (ImageFormatChecker.m1459c(bArr, i)) {
                return DefaultImageFormats.f1507b;
            }
            if (ImageFormatChecker.m1460d(bArr, i)) {
                return DefaultImageFormats.f1508c;
            }
            if (ImageFormatChecker.m1461e(bArr, i)) {
                return DefaultImageFormats.f1509d;
            }
            return ImageFormat.f1518a;
        }
    }

    static {
        f1521a = new ImageFormatChecker();
        f1522b = new byte[]{(byte) -1, (byte) -40, (byte) -1};
        f1523c = new byte[]{(byte) -119, (byte) 80, (byte) 78, (byte) 71, JceStruct.SIMPLE_LIST, (byte) 10, (byte) 26, (byte) 10};
        f1524d = ImageFormatChecker.m1457a("GIF87a");
        f1525e = ImageFormatChecker.m1457a("GIF89a");
        f1526f = ImageFormatChecker.m1457a("BM");
        int[] iArr = new int[]{21, 20, f1522b.length, f1523c.length, 6, f1526f.length};
        Preconditions.m1033a(true);
        int i = iArr[0];
        for (int i2 = true; i2 < 6; i2++) {
            if (iArr[i2] > i) {
                i = iArr[i2];
            }
        }
        f1527g = i;
    }

    private static int m1453a(InputStream inputStream, byte[] bArr) {
        Preconditions.m1030a((Object) inputStream);
        Preconditions.m1030a((Object) bArr);
        Preconditions.m1033a(bArr.length >= f1527g);
        if (!inputStream.markSupported()) {
            return ByteStreams.m1019a(inputStream, bArr, f1527g);
        }
        try {
            inputStream.mark(f1527g);
            int a = ByteStreams.m1019a(inputStream, bArr, f1527g);
            return a;
        } finally {
            inputStream.reset();
        }
    }

    private static boolean m1456a(byte[] bArr, byte[] bArr2) {
        Preconditions.m1030a((Object) bArr);
        Preconditions.m1030a((Object) bArr2);
        Preconditions.m1033a(true);
        if (bArr2.length + 0 > bArr.length) {
            return false;
        }
        for (int i = 0; i < bArr2.length; i++) {
            if (bArr[i + 0] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    private static byte[] m1457a(String str) {
        Preconditions.m1030a((Object) str);
        try {
            return str.getBytes("ASCII");
        } catch (Throwable e) {
            throw new RuntimeException("ASCII not found!", e);
        }
    }

    public static ImageFormat m1454a(InputStream inputStream) {
        try {
            Preconditions.m1030a((Object) inputStream);
            byte[] bArr = new byte[f1527g];
            return f1521a.m1451a(bArr, ImageFormatChecker.m1453a(inputStream, bArr));
        } catch (Throwable e) {
            throw Throwables.m1039b(e);
        }
    }

    static /* synthetic */ ImageFormat m1455a(byte[] bArr, int i) {
        Preconditions.m1033a(WebpSupportStatus.m1137b(bArr, i));
        if (WebpSupportStatus.m1136b(bArr)) {
            return DefaultImageFormats.f1510e;
        }
        if (WebpSupportStatus.m1138c(bArr)) {
            return DefaultImageFormats.f1511f;
        }
        if (!WebpSupportStatus.m1133a(bArr, i)) {
            return ImageFormat.f1518a;
        }
        if (WebpSupportStatus.m1132a(bArr)) {
            return DefaultImageFormats.f1514i;
        }
        if (WebpSupportStatus.m1139d(bArr)) {
            return DefaultImageFormats.f1513h;
        }
        return DefaultImageFormats.f1512g;
    }

    static /* synthetic */ boolean m1458b(byte[] bArr, int i) {
        return i >= f1522b.length && ImageFormatChecker.m1456a(bArr, f1522b);
    }

    static /* synthetic */ boolean m1459c(byte[] bArr, int i) {
        return i >= f1523c.length && ImageFormatChecker.m1456a(bArr, f1523c);
    }

    static /* synthetic */ boolean m1460d(byte[] bArr, int i) {
        return i >= 6 && (ImageFormatChecker.m1456a(bArr, f1524d) || ImageFormatChecker.m1456a(bArr, f1525e));
    }

    static /* synthetic */ boolean m1461e(byte[] bArr, int i) {
        if (i < f1526f.length) {
            return false;
        }
        return ImageFormatChecker.m1456a(bArr, f1526f);
    }
}
