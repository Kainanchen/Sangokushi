package com.alipay.sdk.encrypt;

import com.loopj.android.http.AsyncHttpResponseHandler;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.alipay.sdk.encrypt.b */
public final class C0173b {
    private static String m502a(String str, String str2) {
        return C0173b.m501a(1, str, str2);
    }

    private static String m503b(String str, String str2) {
        return C0173b.m501a(2, str, str2);
    }

    public static String m501a(int i, String str, String str2) {
        try {
            byte[] a;
            Key secretKeySpec = new SecretKeySpec(str2.getBytes(), "DES");
            Cipher instance = Cipher.getInstance("DES");
            instance.init(i, secretKeySpec);
            if (i == 2) {
                a = C0172a.m498a(str);
            } else {
                a = str.getBytes(AsyncHttpResponseHandler.DEFAULT_CHARSET);
            }
            byte[] doFinal = instance.doFinal(a);
            if (i == 2) {
                return new String(doFinal);
            }
            return C0172a.m496a(doFinal);
        } catch (Exception e) {
            return null;
        }
    }
}
