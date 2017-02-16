package com.facebook.common.p021l;

import android.util.Base64;
import java.security.MessageDigest;

/* renamed from: com.facebook.common.l.b */
public final class SecureHashUtil {
    static final byte[] f1152a;

    public static String m1118a(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.update(bArr, 0, bArr.length);
            return Base64.encodeToString(instance.digest(), 11);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    static {
        f1152a = new byte[]{(byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 97, (byte) 98, (byte) 99, (byte) 100, (byte) 101, (byte) 102};
    }
}
