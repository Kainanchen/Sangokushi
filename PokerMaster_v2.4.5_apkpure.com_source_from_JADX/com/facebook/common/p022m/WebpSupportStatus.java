package com.facebook.common.p022m;

import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.Build.VERSION;
import android.util.Base64;

/* renamed from: com.facebook.common.m.b */
public final class WebpSupportStatus {
    public static final boolean f1158a;
    public static final boolean f1159b;
    public static final boolean f1160c;
    public static WebpBitmapFactory f1161d;
    public static boolean f1162e;
    private static final byte[] f1163f;
    private static final byte[] f1164g;
    private static final byte[] f1165h;
    private static final byte[] f1166i;
    private static final byte[] f1167j;

    static {
        boolean z;
        boolean z2 = true;
        f1158a = VERSION.SDK_INT <= 17;
        if (VERSION.SDK_INT >= 14) {
            z = true;
        } else {
            z = false;
        }
        f1159b = z;
        if (VERSION.SDK_INT < 17) {
            z2 = false;
        } else if (VERSION.SDK_INT == 17) {
            byte[] decode = Base64.decode("UklGRkoAAABXRUJQVlA4WAoAAAAQAAAAAAAAAAAAQUxQSAwAAAARBxAR/Q9ERP8DAABWUDggGAAAABQBAJ0BKgEAAQAAAP4AAA3AAP7mtQAAAA==", 0);
            Options options = new Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
            if (!(options.outHeight == 1 && options.outWidth == 1)) {
                z2 = false;
            }
        }
        f1160c = z2;
        f1161d = null;
        f1162e = false;
        try {
            f1161d = (WebpBitmapFactory) Class.forName("com.facebook.webpsupport.WebpBitmapFactoryImpl").newInstance();
            f1162e = true;
        } catch (Throwable th) {
            f1162e = false;
        }
        f1163f = WebpSupportStatus.m1135a("RIFF");
        f1164g = WebpSupportStatus.m1135a("WEBP");
        f1165h = WebpSupportStatus.m1135a("VP8 ");
        f1166i = WebpSupportStatus.m1135a("VP8L");
        f1167j = WebpSupportStatus.m1135a("VP8X");
    }

    private static byte[] m1135a(String str) {
        try {
            return str.getBytes("ASCII");
        } catch (Throwable e) {
            throw new RuntimeException("ASCII not found!", e);
        }
    }

    public static boolean m1132a(byte[] bArr) {
        boolean a = WebpSupportStatus.m1134a(bArr, 12, f1167j);
        boolean z;
        if ((bArr[20] & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        if (a && r2) {
            return true;
        }
        return false;
    }

    public static boolean m1136b(byte[] bArr) {
        return WebpSupportStatus.m1134a(bArr, 12, f1165h);
    }

    public static boolean m1138c(byte[] bArr) {
        return WebpSupportStatus.m1134a(bArr, 12, f1166i);
    }

    public static boolean m1133a(byte[] bArr, int i) {
        return i >= 21 && WebpSupportStatus.m1134a(bArr, 12, f1167j);
    }

    public static boolean m1139d(byte[] bArr) {
        boolean a = WebpSupportStatus.m1134a(bArr, 12, f1167j);
        boolean z;
        if ((bArr[20] & 16) == 16) {
            z = true;
        } else {
            z = false;
        }
        if (a && r2) {
            return true;
        }
        return false;
    }

    public static boolean m1137b(byte[] bArr, int i) {
        if (i >= 20 && WebpSupportStatus.m1134a(bArr, 0, f1163f) && WebpSupportStatus.m1134a(bArr, 8, f1164g)) {
            return true;
        }
        return false;
    }

    private static boolean m1134a(byte[] bArr, int i, byte[] bArr2) {
        if (bArr2 == null || bArr == null || bArr2.length + i > bArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            if (bArr[i2 + i] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }
}
