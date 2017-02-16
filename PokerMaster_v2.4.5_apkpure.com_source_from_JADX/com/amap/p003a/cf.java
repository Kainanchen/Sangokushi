package com.amap.p003a;

import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: Encrypt */
/* renamed from: com.amap.a.cf */
public final class cf {
    private static final char[] f609a;
    private static final byte[] f610b;

    static {
        int i;
        f609a = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
        f610b = new byte[AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS];
        for (i = 0; i < AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS; i++) {
            f610b[i] = (byte) -1;
        }
        for (i = 65; i <= 90; i++) {
            f610b[i] = (byte) (i - 65);
        }
        for (i = 97; i <= 122; i++) {
            f610b[i] = (byte) ((i - 97) + 26);
        }
        for (i = 48; i <= 57; i++) {
            f610b[i] = (byte) ((i - 48) + 52);
        }
        f610b[43] = (byte) 62;
        f610b[47] = (byte) 63;
    }

    public static String m576a(String str) {
        return ck.m618a(cf.m581b(str));
    }

    public static String m577a(byte[] bArr) {
        try {
            return cf.m583c(bArr);
        } catch (Throwable th) {
            cm.m637a(th, "Encrypt", "encodeBase64");
            return null;
        }
    }

    static byte[] m578a(byte[] bArr, Key key) {
        Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        instance.init(1, key);
        return instance.doFinal(bArr);
    }

    static byte[] m579a(byte[] bArr, byte[] bArr2) {
        try {
            return cf.m582b(bArr, bArr2);
        } catch (Throwable th) {
            cm.m637a(th, "Encrypt", "aesEncrypt");
            return null;
        }
    }

    public static String m580b(byte[] bArr) {
        try {
            return cf.m583c(bArr);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m581b(java.lang.String r9) {
        /*
        r8 = 61;
        r0 = 0;
        r7 = -1;
        if (r9 != 0) goto L_0x0009;
    L_0x0006:
        r0 = new byte[r0];
    L_0x0008:
        return r0;
    L_0x0009:
        r2 = com.amap.p003a.ck.m624a(r9);
        r3 = r2.length;
        r4 = new java.io.ByteArrayOutputStream;
        r4.<init>(r3);
    L_0x0013:
        if (r0 >= r3) goto L_0x007a;
    L_0x0015:
        r5 = f610b;
        r1 = r0 + 1;
        r0 = r2[r0];
        r5 = r5[r0];
        if (r1 >= r3) goto L_0x0021;
    L_0x001f:
        if (r5 == r7) goto L_0x0085;
    L_0x0021:
        if (r5 == r7) goto L_0x007a;
    L_0x0023:
        r6 = f610b;
        r0 = r1 + 1;
        r1 = r2[r1];
        r6 = r6[r1];
        if (r0 >= r3) goto L_0x002f;
    L_0x002d:
        if (r6 == r7) goto L_0x0083;
    L_0x002f:
        if (r6 == r7) goto L_0x007a;
    L_0x0031:
        r1 = r5 << 2;
        r5 = r6 & 48;
        r5 = r5 >>> 4;
        r1 = r1 | r5;
        r4.write(r1);
    L_0x003b:
        r1 = r0 + 1;
        r0 = r2[r0];
        if (r0 != r8) goto L_0x0046;
    L_0x0041:
        r0 = r4.toByteArray();
        goto L_0x0008;
    L_0x0046:
        r5 = f610b;
        r5 = r5[r0];
        if (r1 >= r3) goto L_0x004e;
    L_0x004c:
        if (r5 == r7) goto L_0x0081;
    L_0x004e:
        if (r5 == r7) goto L_0x007a;
    L_0x0050:
        r0 = r6 & 15;
        r0 = r0 << 4;
        r6 = r5 & 60;
        r6 = r6 >>> 2;
        r0 = r0 | r6;
        r4.write(r0);
    L_0x005c:
        r0 = r1 + 1;
        r1 = r2[r1];
        if (r1 != r8) goto L_0x0067;
    L_0x0062:
        r0 = r4.toByteArray();
        goto L_0x0008;
    L_0x0067:
        r6 = f610b;
        r1 = r6[r1];
        if (r0 >= r3) goto L_0x006f;
    L_0x006d:
        if (r1 == r7) goto L_0x007f;
    L_0x006f:
        if (r1 == r7) goto L_0x007a;
    L_0x0071:
        r5 = r5 & 3;
        r5 = r5 << 6;
        r1 = r1 | r5;
        r4.write(r1);
        goto L_0x0013;
    L_0x007a:
        r0 = r4.toByteArray();
        goto L_0x0008;
    L_0x007f:
        r1 = r0;
        goto L_0x005c;
    L_0x0081:
        r0 = r1;
        goto L_0x003b;
    L_0x0083:
        r1 = r0;
        goto L_0x0023;
    L_0x0085:
        r0 = r1;
        goto L_0x0015;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.a.cf.b(java.lang.String):byte[]");
    }

    private static byte[] m582b(byte[] bArr, byte[] bArr2) {
        AlgorithmParameterSpec ivParameterSpec = new IvParameterSpec(ck.m623a());
        Key secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        try {
            instance.init(1, secretKeySpec, ivParameterSpec);
        } catch (InvalidAlgorithmParameterException e) {
            e.printStackTrace();
        }
        return instance.doFinal(bArr2);
    }

    private static String m583c(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            int i3 = bArr[i] & MotionEventCompat.ACTION_MASK;
            if (i2 == length) {
                stringBuffer.append(f609a[i3 >>> 2]);
                stringBuffer.append(f609a[(i3 & 3) << 4]);
                stringBuffer.append("==");
                break;
            }
            int i4 = i2 + 1;
            i2 = bArr[i2] & MotionEventCompat.ACTION_MASK;
            if (i4 == length) {
                stringBuffer.append(f609a[i3 >>> 2]);
                stringBuffer.append(f609a[((i3 & 3) << 4) | ((i2 & 240) >>> 4)]);
                stringBuffer.append(f609a[(i2 & 15) << 2]);
                stringBuffer.append("=");
                break;
            }
            i = i4 + 1;
            i4 = bArr[i4] & MotionEventCompat.ACTION_MASK;
            stringBuffer.append(f609a[i3 >>> 2]);
            stringBuffer.append(f609a[((i3 & 3) << 4) | ((i2 & 240) >>> 4)]);
            stringBuffer.append(f609a[((i2 & 15) << 2) | ((i4 & 192) >>> 6)]);
            stringBuffer.append(f609a[i4 & 63]);
        }
        return stringBuffer.toString();
    }
}
