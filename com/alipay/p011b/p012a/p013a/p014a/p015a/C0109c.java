package com.alipay.p011b.p012a.p013a.p014a.p015a;

import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.tencent.connect.common.Constants;
import java.lang.reflect.Method;
import java.security.Key;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.alipay.b.a.a.a.a.c */
public final class C0109c {
    private static String f143a;

    static {
        f143a = new String("idnjfhncnsfuobcnt847y929o449u474w7j3h22aoddc98euk#%&&)*&^%#");
    }

    public static String m226a() {
        String str = new String();
        for (int i = 0; i < f143a.length() - 1; i += 4) {
            str = str + f143a.charAt(i);
        }
        return str;
    }

    public static String m227a(String str, String str2) {
        byte[] bArr = null;
        try {
            byte[] a = C0109c.m228a(str.getBytes());
            byte[] bytes = str2.getBytes();
            Key secretKeySpec = new SecretKeySpec(a, "AES");
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(1, secretKeySpec, new IvParameterSpec(new byte[instance.getBlockSize()]));
            bArr = instance.doFinal(bytes);
        } catch (Exception e) {
        }
        return C0109c.m230b(bArr);
    }

    private static byte[] m228a(byte[] bArr) {
        KeyGenerator instance = KeyGenerator.getInstance("AES");
        SecureRandom instance2 = SecureRandom.getInstance("SHA1PRNG", "Crypto");
        Method method = SecureRandom.class.getMethod("setSeed", new Class[]{bArr.getClass()});
        method.setAccessible(true);
        method.invoke(instance2, new Object[]{bArr});
        instance.init(AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS, instance2);
        return instance.generateKey().getEncoded();
    }

    public static String m229b(String str, String str2) {
        try {
            byte[] a = C0109c.m228a(str.getBytes());
            int length = str2.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                bArr[i] = Integer.valueOf(str2.substring(i * 2, (i * 2) + 2), 16).byteValue();
            }
            Key secretKeySpec = new SecretKeySpec(a, "AES");
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(2, secretKeySpec, new IvParameterSpec(new byte[instance.getBlockSize()]));
            return new String(instance.doFinal(bArr));
        } catch (Exception e) {
            return null;
        }
    }

    private static String m230b(byte[] bArr) {
        if (bArr == null) {
            return Constants.STR_EMPTY;
        }
        StringBuffer stringBuffer = new StringBuffer(bArr.length * 2);
        for (byte b : bArr) {
            stringBuffer.append("0123456789ABCDEF".charAt((b >> 4) & 15)).append("0123456789ABCDEF".charAt(b & 15));
        }
        return stringBuffer.toString();
    }
}
