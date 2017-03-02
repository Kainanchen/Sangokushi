package com.igexin.getuiext.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.igexin.getuiext.util.g */
public class C0333g {
    public static String m1109a(String str) {
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

    public static String m1110a(byte[] bArr, int i, int i2) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i3 = i; i3 < i + i2; i3++) {
            stringBuilder.append(String.format("%02x", new Object[]{Byte.valueOf(bArr[i3])}));
        }
        return stringBuilder.toString();
    }

    public static byte[] m1111a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        Object a = C0330d.m1103a(bArr);
        if (a == null) {
            return null;
        }
        String a2 = C0333g.m1109a(String.valueOf(System.currentTimeMillis()));
        int length = a.length;
        Object obj = new byte[(length + 16)];
        Object bytes = a2.substring(0, 8).getBytes();
        Object bytes2 = a2.substring(24, 32).getBytes();
        System.arraycopy(bytes, 0, obj, 0, 8);
        System.arraycopy(a, 0, obj, 8, length);
        System.arraycopy(bytes2, 0, obj, length + 8, 8);
        return obj;
    }
}
