package com.amap.p003a;

import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.qq.taf.jce.JceStruct;
import com.sina.weibo.sdk.component.GameManager;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import java.io.ByteArrayOutputStream;
import java.security.Key;
import java.security.KeyFactory;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.PKCS8EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: Encrypt */
/* renamed from: com.amap.a.bb */
public final class bb {
    private static final char[] f344a;
    private static final byte[] f345b;
    private static final IvParameterSpec f346c;

    static {
        f344a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        f345b = new byte[]{(byte) 0, (byte) 1, (byte) 1, (byte) 2, (byte) 3, (byte) 5, (byte) 8, JceStruct.SIMPLE_LIST, (byte) 8, (byte) 7, (byte) 6, (byte) 5, (byte) 4, (byte) 3, (byte) 2, (byte) 1};
        f346c = new IvParameterSpec(f345b);
    }

    public static String m315a(String str) {
        String str2 = null;
        if (str != null) {
            try {
                if (str.length() != 0) {
                    str2 = bb.m316a("MD5", bb.m316a("SHA1", str) + str);
                }
            } catch (Throwable th) {
                bc.m330a(th, "Encrypt", "generatorKey");
            }
        }
        return str2;
    }

    public static String m316a(String str, String str2) {
        String str3 = null;
        if (str2 != null) {
            try {
                byte[] a = cg.m585a(str2.getBytes(GameManager.DEFAULT_CHARSET), str);
                int length = a.length;
                StringBuilder stringBuilder = new StringBuilder(length * 2);
                for (int i = 0; i < length; i++) {
                    stringBuilder.append(f344a[(a[i] >> 4) & 15]);
                    stringBuilder.append(f344a[a[i] & 15]);
                }
                str3 = stringBuilder.toString();
            } catch (Throwable th) {
                bc.m330a(th, "Encrypt", "encode");
            }
        }
        return str3;
    }

    public static byte[] m317a(byte[] bArr) {
        try {
            Object obj = new byte[16];
            Object obj2 = new byte[(bArr.length - 16)];
            System.arraycopy(bArr, 0, obj, 0, 16);
            System.arraycopy(bArr, 16, obj2, 0, bArr.length - 16);
            Key secretKeySpec = new SecretKeySpec(obj, "AES");
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(2, secretKeySpec, new IvParameterSpec(ck.m623a()));
            return instance.doFinal(obj2);
        } catch (Throwable th) {
            bc.m330a(th, "Encrypt", "decryptRsponse");
            return null;
        }
    }

    public static synchronized byte[] m318a(byte[] bArr, String str) {
        byte[] doFinal;
        int i = 0;
        synchronized (bb.class) {
            Key generatePrivate = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(cf.m581b(str)));
            Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            instance.init(1, generatePrivate);
            int length = bArr.length;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i2 = 0;
            while (length - i > 0) {
                doFinal = length - i > 245 ? instance.doFinal(bArr, i, 245) : instance.doFinal(bArr, i, length - i);
                byteArrayOutputStream.write(doFinal, 0, doFinal.length);
                i = i2 + 1;
                int i3 = i;
                i *= 245;
                i2 = i3;
            }
            doFinal = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
        }
        return doFinal;
    }

    public static byte[] m319a(byte[] bArr, byte[] bArr2) {
        Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
        instance.init(2, new SecretKeySpec(bArr, "AES"), f346c);
        return instance.doFinal(bArr2);
    }

    private static SecretKeySpec m320b(String str) {
        byte[] bArr = null;
        if (str == null) {
            str = LetterIndexBar.SEARCH_ICON_LETTER;
        }
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append(str);
        while (stringBuffer.length() < 16) {
            stringBuffer.append("0");
        }
        if (stringBuffer.length() > 16) {
            stringBuffer.setLength(16);
        }
        try {
            bArr = stringBuffer.toString().getBytes(GameManager.DEFAULT_CHARSET);
        } catch (Throwable th) {
            bc.m330a(th, "Encrypt", "createKey");
        }
        return new SecretKeySpec(bArr, "AES");
    }

    public static synchronized byte[] m321b(byte[] bArr, String str) {
        byte[] doFinal;
        int i = 0;
        synchronized (bb.class) {
            Key generatePrivate = KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(cf.m581b(str)));
            Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            instance.init(2, generatePrivate);
            int length = bArr.length;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i2 = 0;
            while (length - i > 0) {
                doFinal = length - i > AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY ? instance.doFinal(bArr, i, AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) : instance.doFinal(bArr, i, length - i);
                byteArrayOutputStream.write(doFinal, 0, doFinal.length);
                i = i2 + 1;
                int i3 = i;
                i *= AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY;
                i2 = i3;
            }
            doFinal = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
        }
        return doFinal;
    }

    public static byte[] m322c(byte[] bArr, String str) {
        try {
            Key b = bb.m320b(str);
            AlgorithmParameterSpec ivParameterSpec = new IvParameterSpec(ck.m623a());
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(1, b, ivParameterSpec);
            return instance.doFinal(bArr);
        } catch (Throwable th) {
            bc.m330a(th, "Encrypt", "aesEncrypt");
            return null;
        }
    }

    public static byte[] m323d(byte[] bArr, String str) {
        try {
            Key b = bb.m320b(str);
            AlgorithmParameterSpec ivParameterSpec = new IvParameterSpec(ck.m623a());
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(2, b, ivParameterSpec);
            return instance.doFinal(bArr);
        } catch (Throwable th) {
            bc.m330a(th, "Encrypt", "aesDecrypt");
            return null;
        }
    }
}
