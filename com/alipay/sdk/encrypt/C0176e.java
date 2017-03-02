package com.alipay.sdk.encrypt;

import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.alipay.sdk.encrypt.e */
public final class C0176e {
    private static String f408a;

    static {
        f408a = "DESede/CBC/PKCS5Padding";
    }

    public static byte[] m509a(String str, byte[] bArr) {
        byte[] bArr2 = null;
        try {
            Key secretKeySpec = new SecretKeySpec(str.getBytes(), "DESede");
            AlgorithmParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
            Cipher instance = Cipher.getInstance(f408a);
            instance.init(1, secretKeySpec, ivParameterSpec);
            bArr2 = instance.doFinal(bArr);
        } catch (Exception e) {
        }
        return bArr2;
    }

    public static byte[] m511b(String str, byte[] bArr) {
        byte[] bArr2 = null;
        try {
            Key secretKeySpec = new SecretKeySpec(str.getBytes(), "DESede");
            AlgorithmParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
            Cipher instance = Cipher.getInstance(f408a);
            instance.init(2, secretKeySpec, ivParameterSpec);
            bArr2 = instance.doFinal(bArr);
        } catch (Exception e) {
        }
        return bArr2;
    }

    public static String m508a(String str, String str2) {
        String str3 = null;
        try {
            str3 = C0172a.m496a(C0176e.m509a(str, str2.getBytes()));
        } catch (Exception e) {
        }
        return str3;
    }

    public static String m510b(String str, String str2) {
        try {
            return new String(C0176e.m511b(str, C0172a.m498a(str2)));
        } catch (Exception e) {
            return null;
        }
    }
}
