package com.alipay.p011b.p012a.p013a.p014a.p015a;

import com.alipay.p011b.p012a.p013a.p014a.C0110a;
import com.loopj.android.http.AsyncHttpResponseHandler;
import java.security.MessageDigest;

/* renamed from: com.alipay.b.a.a.a.a.b */
public final class C0108b {
    public static String m225a(String str) {
        String str2 = null;
        try {
            if (!C0110a.m234a(str)) {
                MessageDigest instance = MessageDigest.getInstance("SHA-1");
                instance.update(str.getBytes(AsyncHttpResponseHandler.DEFAULT_CHARSET));
                byte[] digest = instance.digest();
                StringBuilder stringBuilder = new StringBuilder();
                for (int i = 0; i < digest.length; i++) {
                    stringBuilder.append(String.format("%02x", new Object[]{Byte.valueOf(digest[i])}));
                }
                str2 = stringBuilder.toString();
            }
        } catch (Exception e) {
        }
        return str2;
    }
}
