package com.alipay.sdk.encrypt;

import com.loopj.android.http.AsyncHttpResponseHandler;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

/* renamed from: com.alipay.sdk.encrypt.d */
public final class C0175d {
    private static final String f407a = "RSA";

    private static PublicKey m507b(String str, String str2) throws NoSuchAlgorithmException, Exception {
        return KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(C0172a.m498a(str2)));
    }

    public static byte[] m506a(String str, String str2) {
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th;
        byte[] bArr = null;
        try {
            String str3 = f407a;
            Key generatePublic = KeyFactory.getInstance(str3).generatePublic(new X509EncodedKeySpec(C0172a.m498a(str2)));
            Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            instance.init(1, generatePublic);
            byte[] bytes = str.getBytes(AsyncHttpResponseHandler.DEFAULT_CHARSET);
            int blockSize = instance.getBlockSize();
            byteArrayOutputStream = new ByteArrayOutputStream();
            int i = 0;
            while (i < bytes.length) {
                try {
                    int length;
                    if (bytes.length - i < blockSize) {
                        length = bytes.length - i;
                    } else {
                        length = blockSize;
                    }
                    byteArrayOutputStream.write(instance.doFinal(bytes, i, length));
                    i += blockSize;
                } catch (Exception e) {
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            bArr = byteArrayOutputStream.toByteArray();
            try {
                byteArrayOutputStream.close();
            } catch (IOException e2) {
            }
        } catch (Exception e3) {
            byteArrayOutputStream = null;
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e4) {
                }
            }
            return bArr;
        } catch (Throwable th3) {
            Throwable th4 = th3;
            byteArrayOutputStream = null;
            th = th4;
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e5) {
                }
            }
            throw th;
        }
        return bArr;
    }
}
