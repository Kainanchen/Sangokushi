package com.alipay.sdk.encrypt;

import com.igexin.download.Downloads;
import com.tencent.connect.common.Constants;

/* renamed from: com.alipay.sdk.encrypt.a */
public final class C0172a {
    private static final int f397a = 128;
    private static final int f398b = 64;
    private static final int f399c = 24;
    private static final int f400d = 8;
    private static final int f401e = 16;
    private static final int f402f = 4;
    private static final int f403g = -128;
    private static final char f404h = '=';
    private static final byte[] f405i;
    private static final char[] f406j;

    static {
        int i;
        int i2 = 0;
        f405i = new byte[f397a];
        f406j = new char[f398b];
        for (i = 0; i < f397a; i++) {
            f405i[i] = (byte) -1;
        }
        for (i = 90; i >= 65; i--) {
            f405i[i] = (byte) (i - 65);
        }
        for (i = 122; i >= 97; i--) {
            f405i[i] = (byte) ((i - 97) + 26);
        }
        for (i = 57; i >= 48; i--) {
            f405i[i] = (byte) ((i - 48) + 52);
        }
        f405i[43] = (byte) 62;
        f405i[47] = (byte) 63;
        for (i = 0; i <= 25; i++) {
            f406j[i] = (char) (i + 65);
        }
        int i3 = 26;
        i = 0;
        while (i3 <= 51) {
            f406j[i3] = (char) (i + 97);
            i3++;
            i++;
        }
        i = 52;
        while (i <= 61) {
            f406j[i] = (char) (i2 + 48);
            i++;
            i2++;
        }
        f406j[62] = '+';
        f406j[63] = '/';
    }

    private static boolean m497a(char c) {
        return c == ' ' || c == '\r' || c == '\n' || c == '\t';
    }

    private static boolean m499b(char c) {
        return c == f404h;
    }

    private static boolean m500c(char c) {
        return c < '\u0080' && f405i[c] != -1;
    }

    public static String m496a(byte[] bArr) {
        int i = 0;
        if (bArr == null) {
            return null;
        }
        int length = bArr.length * f400d;
        if (length == 0) {
            return Constants.STR_EMPTY;
        }
        int i2 = length % f399c;
        int i3 = length / f399c;
        char[] cArr = new char[((i2 != 0 ? i3 + 1 : i3) * f402f)];
        int i4 = 0;
        int i5 = 0;
        while (i4 < i3) {
            length = i + 1;
            byte b = bArr[i];
            int i6 = length + 1;
            byte b2 = bArr[length];
            int i7 = i6 + 1;
            byte b3 = bArr[i6];
            byte b4 = (byte) (b2 & 15);
            byte b5 = (byte) (b & 3);
            if ((b & f403g) == 0) {
                i6 = (byte) (b >> 2);
            } else {
                byte b6 = (byte) ((b >> 2) ^ Downloads.STATUS_RUNNING);
            }
            if ((b2 & f403g) == 0) {
                i = (byte) (b2 >> f402f);
            } else {
                b = (byte) ((b2 >> f402f) ^ 240);
            }
            if ((b3 & f403g) == 0) {
                length = (byte) (b3 >> 6);
            } else {
                length = (byte) ((b3 >> 6) ^ 252);
            }
            int i8 = i5 + 1;
            cArr[i5] = f406j[i6];
            i6 = i8 + 1;
            cArr[i8] = f406j[i | (b5 << f402f)];
            i5 = i6 + 1;
            cArr[i6] = f406j[length | (b4 << 2)];
            i = i5 + 1;
            cArr[i5] = f406j[b3 & 63];
            i4++;
            i5 = i;
            i = i7;
        }
        byte b7;
        byte b8;
        if (i2 == f400d) {
            b7 = bArr[i];
            b8 = (byte) (b7 & 3);
            i = i5 + 1;
            cArr[i5] = f406j[(b7 & f403g) == 0 ? (byte) (b7 >> 2) : (byte) ((b7 >> 2) ^ Downloads.STATUS_RUNNING)];
            length = i + 1;
            cArr[i] = f406j[b8 << f402f];
            i3 = length + 1;
            cArr[length] = f404h;
            cArr[i3] = f404h;
        } else if (i2 == f401e) {
            b7 = bArr[i];
            b = bArr[i + 1];
            b6 = (byte) (b & 15);
            byte b9 = (byte) (b7 & 3);
            if ((b7 & f403g) == 0) {
                i3 = (byte) (b7 >> 2);
            } else {
                b8 = (byte) ((b7 >> 2) ^ Downloads.STATUS_RUNNING);
            }
            length = (b & f403g) == 0 ? (byte) (b >> f402f) : (byte) ((b >> f402f) ^ 240);
            i = i5 + 1;
            cArr[i5] = f406j[i3];
            i3 = i + 1;
            cArr[i] = f406j[length | (b9 << f402f)];
            length = i3 + 1;
            cArr[i3] = f406j[b6 << 2];
            cArr[length] = f404h;
        }
        return new String(cArr);
    }

    public static byte[] m498a(String str) {
        if (str == null) {
            return null;
        }
        int i;
        int length;
        int i2;
        int i3;
        char[] toCharArray = str.toCharArray();
        if (toCharArray == null) {
            i = 0;
        } else {
            length = toCharArray.length;
            i2 = 0;
            i = 0;
            while (i2 < length) {
                char c = toCharArray[i2];
                i3 = (c == ' ' || c == '\r' || c == '\n' || c == '\t') ? 1 : 0;
                if (i3 == 0) {
                    i3 = i + 1;
                    toCharArray[i] = toCharArray[i2];
                } else {
                    i3 = i;
                }
                i2++;
                i = i3;
            }
        }
        if (i % f402f != 0) {
            return null;
        }
        int i4 = i / f402f;
        if (i4 == 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[(i4 * 3)];
        i = 0;
        i2 = 0;
        length = 0;
        while (length < i4 - 1) {
            char c2;
            int i5 = i + 1;
            char c3 = toCharArray[i];
            if (C0172a.m500c(c3)) {
                i = i5 + 1;
                c2 = toCharArray[i5];
                if (C0172a.m500c(c2)) {
                    int i6 = i + 1;
                    char c4 = toCharArray[i];
                    if (C0172a.m500c(c4)) {
                        i = i6 + 1;
                        char c5 = toCharArray[i6];
                        if (C0172a.m500c(c5)) {
                            byte b = f405i[c3];
                            byte b2 = f405i[c2];
                            byte b3 = f405i[c4];
                            byte b4 = f405i[c5];
                            int i7 = i2 + 1;
                            bArr[i2] = (byte) ((b << 2) | (b2 >> f402f));
                            int i8 = i7 + 1;
                            bArr[i7] = (byte) (((b2 & 15) << f402f) | ((b3 >> 2) & 15));
                            i2 = i8 + 1;
                            bArr[i8] = (byte) ((b3 << 6) | b4);
                            length++;
                        }
                    }
                }
            }
            return null;
        }
        i4 = i + 1;
        char c6 = toCharArray[i];
        if (C0172a.m500c(c6)) {
            i5 = i4 + 1;
            char c7 = toCharArray[i4];
            if (C0172a.m500c(c7)) {
                b = f405i[c6];
                byte b5 = f405i[c7];
                i = i5 + 1;
                c2 = toCharArray[i5];
                c6 = toCharArray[i];
                if (C0172a.m500c(c2) && C0172a.m500c(c6)) {
                    byte b6 = f405i[c2];
                    byte b7 = f405i[c6];
                    int i9 = i2 + 1;
                    bArr[i2] = (byte) ((b << 2) | (b5 >> f402f));
                    i2 = i9 + 1;
                    bArr[i9] = (byte) (((b5 & 15) << f402f) | ((b6 >> 2) & 15));
                    bArr[i2] = (byte) (b7 | (b6 << 6));
                    return bArr;
                } else if (C0172a.m499b(c2) && C0172a.m499b(c6)) {
                    if ((b5 & 15) != 0) {
                        return null;
                    }
                    r1 = new byte[((length * 3) + 1)];
                    System.arraycopy(bArr, 0, r1, 0, length * 3);
                    r1[i2] = (byte) ((b << 2) | (b5 >> f402f));
                    return r1;
                } else if (C0172a.m499b(c2) || !C0172a.m499b(c6)) {
                    return null;
                } else {
                    byte b8 = f405i[c2];
                    if ((b8 & 3) != 0) {
                        return null;
                    }
                    r1 = new byte[((length * 3) + 2)];
                    System.arraycopy(bArr, 0, r1, 0, length * 3);
                    i3 = i2 + 1;
                    r1[i2] = (byte) ((b << 2) | (b5 >> f402f));
                    r1[i3] = (byte) (((b5 & 15) << f402f) | ((b8 >> 2) & 15));
                    return r1;
                }
            }
        }
        return null;
    }

    private static int m495a(char[] cArr) {
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            Object obj;
            int i3;
            char c = cArr[i];
            if (c == ' ' || c == '\r' || c == '\n' || c == '\t') {
                obj = 1;
            } else {
                obj = null;
            }
            if (obj == null) {
                i3 = i2 + 1;
                cArr[i2] = cArr[i];
            } else {
                i3 = i2;
            }
            i++;
            i2 = i3;
        }
        return i2;
    }
}
