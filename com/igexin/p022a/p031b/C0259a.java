package com.igexin.p022a.p031b;

import android.content.Context;
import com.igexin.p022a.p023a.p027b.C0246g;
import com.tencent.connect.common.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

/* renamed from: com.igexin.a.b.a */
public class C0259a {
    private static final char[] f678a;

    static {
        f678a = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    }

    public static String m875a(int i) {
        int i2 = i < 0 ? 100 : i;
        if (i2 > 100) {
            i2 = 10;
        }
        Random random = new Random();
        char[] cArr = new char[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            cArr[i3] = f678a[random.nextInt(f678a.length)];
        }
        return new String(cArr);
    }

    public static String m876a(Context context, String str) {
        String str2 = Constants.VIA_RESULT_SUCCESS;
        File file = new File(str);
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            if (instance != null) {
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    Object obj = new byte[10240];
                    while (true) {
                        int read = fileInputStream.read(obj);
                        if (read <= 0) {
                            break;
                        } else if (read < 10240) {
                            Object obj2 = new byte[read];
                            System.arraycopy(obj, 0, obj2, 0, read);
                            instance.update(obj2);
                        } else {
                            instance.update(obj);
                        }
                    }
                    byte[] digest = instance.digest();
                    str2 = C0259a.m878a(digest, 0, digest.length);
                    fileInputStream.close();
                } catch (FileNotFoundException e) {
                } catch (IOException e2) {
                }
            }
        } catch (NoSuchAlgorithmException e3) {
        }
        return str2;
    }

    public static String m877a(String str) {
        MessageDigest instance;
        int i = 0;
        byte[] bytes = str.getBytes();
        char[] cArr = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            instance = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            instance = null;
        }
        if (instance == null) {
            return null;
        }
        instance.update(bytes);
        byte[] digest = instance.digest();
        char[] cArr2 = new char[32];
        for (int i2 = 0; i2 < 16; i2++) {
            byte b = digest[i2];
            int i3 = i + 1;
            cArr2[i] = cArr[(b >>> 4) & 15];
            i = i3 + 1;
            cArr2[i3] = cArr[b & 15];
        }
        return new String(cArr2);
    }

    public static String m878a(byte[] bArr, int i, int i2) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i3 = i; i3 < i + i2; i3++) {
            stringBuilder.append(String.format("%02X", new Object[]{Byte.valueOf(bArr[i3])}));
        }
        return stringBuilder.toString();
    }

    public static byte[] m879a(byte[] bArr) {
        MessageDigest instance;
        try {
            instance = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            instance = null;
        }
        if (instance == null) {
            return null;
        }
        instance.update(bArr);
        return instance.digest();
    }

    public static boolean m880b(String str) {
        return str == null ? true : Constants.STR_EMPTY.equals(str);
    }

    public static byte[] m881b(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        Object a = C0246g.m827a(bArr);
        if (a == null) {
            return null;
        }
        String a2 = C0259a.m877a(String.valueOf(System.currentTimeMillis()));
        int length = a.length;
        Object obj = new byte[(length + 16)];
        Object bytes = a2.substring(0, 8).getBytes();
        Object bytes2 = a2.substring(24, 32).getBytes();
        System.arraycopy(bytes, 0, obj, 0, 8);
        System.arraycopy(a, 0, obj, 8, length);
        System.arraycopy(bytes2, 0, obj, length + 8, 8);
        return obj;
    }

    public static byte[] m882c(byte[] bArr) {
        if (bArr == null || bArr.length < 16) {
            return null;
        }
        Object obj = new byte[(bArr.length - 16)];
        System.arraycopy(bArr, 8, obj, 0, bArr.length - 16);
        return C0246g.m831b(obj);
    }
}
