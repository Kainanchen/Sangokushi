package org.apache.mina.proxy.handlers.http.ntlm;

import java.security.Key;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.apache.mina.proxy.handlers.socks.SocksProxyConstants;

public class NTLMResponses {
    public static final byte[] LM_HASH_MAGIC_CONSTANT;

    static {
        LM_HASH_MAGIC_CONSTANT = new byte[]{(byte) 75, (byte) 71, (byte) 83, (byte) 33, (byte) 64, (byte) 35, (byte) 36, (byte) 37};
    }

    public static byte[] getLMResponse(String str, byte[] bArr) {
        return lmResponse(lmHash(str), bArr);
    }

    public static byte[] getNTLMResponse(String str, byte[] bArr) {
        return lmResponse(ntlmHash(str), bArr);
    }

    public static byte[] getNTLMv2Response(String str, String str2, String str3, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return getNTLMv2Response(str, str2, str3, bArr, bArr2, bArr3, System.currentTimeMillis());
    }

    public static byte[] getNTLMv2Response(String str, String str2, String str3, byte[] bArr, byte[] bArr2, byte[] bArr3, long j) {
        return lmv2Response(ntlmv2Hash(str, str2, str3), createBlob(bArr, bArr3, j), bArr2);
    }

    public static byte[] getLMv2Response(String str, String str2, String str3, byte[] bArr, byte[] bArr2) {
        return lmv2Response(ntlmv2Hash(str, str2, str3), bArr2, bArr);
    }

    public static byte[] getNTLM2SessionResponse(String str, byte[] bArr, byte[] bArr2) {
        byte[] ntlmHash = ntlmHash(str);
        MessageDigest instance = MessageDigest.getInstance("MD5");
        instance.update(bArr);
        instance.update(bArr2);
        Object obj = new byte[8];
        System.arraycopy(instance.digest(), 0, obj, 0, 8);
        return lmResponse(ntlmHash, obj);
    }

    private static byte[] lmHash(String str) {
        Object bytes = str.toUpperCase().getBytes("US-ASCII");
        Object obj = new byte[14];
        System.arraycopy(bytes, 0, obj, 0, Math.min(bytes.length, 14));
        Key createDESKey = createDESKey(obj, 0);
        Key createDESKey2 = createDESKey(obj, 7);
        Cipher instance = Cipher.getInstance("DES/ECB/NoPadding");
        instance.init(1, createDESKey);
        bytes = instance.doFinal(LM_HASH_MAGIC_CONSTANT);
        instance.init(1, createDESKey2);
        Object doFinal = instance.doFinal(LM_HASH_MAGIC_CONSTANT);
        obj = new byte[16];
        System.arraycopy(bytes, 0, obj, 0, 8);
        System.arraycopy(doFinal, 0, obj, 8, 8);
        return obj;
    }

    private static byte[] ntlmHash(String str) {
        return MessageDigest.getInstance("MD4").digest(str.getBytes("UnicodeLittleUnmarked"));
    }

    private static byte[] ntlmv2Hash(String str, String str2, String str3) {
        return hmacMD5((str2.toUpperCase() + str).getBytes("UnicodeLittleUnmarked"), ntlmHash(str3));
    }

    private static byte[] lmResponse(byte[] bArr, byte[] bArr2) {
        Object obj = new byte[21];
        System.arraycopy(bArr, 0, obj, 0, 16);
        Key createDESKey = createDESKey(obj, 0);
        Key createDESKey2 = createDESKey(obj, 7);
        Key createDESKey3 = createDESKey(obj, 14);
        Cipher instance = Cipher.getInstance("DES/ECB/NoPadding");
        instance.init(1, createDESKey);
        Object doFinal = instance.doFinal(bArr2);
        instance.init(1, createDESKey2);
        Object doFinal2 = instance.doFinal(bArr2);
        instance.init(1, createDESKey3);
        obj = instance.doFinal(bArr2);
        Object obj2 = new byte[24];
        System.arraycopy(doFinal, 0, obj2, 0, 8);
        System.arraycopy(doFinal2, 0, obj2, 8, 8);
        System.arraycopy(obj, 0, obj2, 16, 8);
        return obj2;
    }

    private static byte[] lmv2Response(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        Object obj = new byte[(bArr3.length + bArr2.length)];
        System.arraycopy(bArr3, 0, obj, 0, bArr3.length);
        System.arraycopy(bArr2, 0, obj, bArr3.length, bArr2.length);
        obj = hmacMD5(obj, bArr);
        Object obj2 = new byte[(obj.length + bArr2.length)];
        System.arraycopy(obj, 0, obj2, 0, obj.length);
        System.arraycopy(bArr2, 0, obj2, obj.length, bArr2.length);
        return obj2;
    }

    private static byte[] createBlob(byte[] bArr, byte[] bArr2, long j) {
        Object obj = new byte[]{(byte) 1, (byte) 1, (byte) 0, (byte) 0};
        Object obj2 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0};
        Object obj3 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0};
        Object obj4 = new byte[]{(byte) 0, (byte) 0, (byte) 0, (byte) 0};
        long j2 = (11644473600000L + j) * 10000;
        Object obj5 = new byte[8];
        for (int i = 0; i < 8; i++) {
            obj5[i] = (byte) ((int) j2);
            j2 >>>= 8;
        }
        Object obj6 = new byte[((((bArr2.length + 16) + 4) + bArr.length) + 4)];
        System.arraycopy(obj, 0, obj6, 0, 4);
        System.arraycopy(obj2, 0, obj6, 4, 4);
        System.arraycopy(obj5, 0, obj6, 8, 8);
        System.arraycopy(bArr2, 0, obj6, 16, bArr2.length);
        int length = bArr2.length + 16;
        System.arraycopy(obj3, 0, obj6, length, 4);
        length += 4;
        System.arraycopy(bArr, 0, obj6, length, bArr.length);
        System.arraycopy(obj4, 0, obj6, length + bArr.length, 4);
        return obj6;
    }

    public static byte[] hmacMD5(byte[] bArr, byte[] bArr2) {
        Object obj = new byte[64];
        Object obj2 = new byte[64];
        for (int i = 0; i < 64; i++) {
            if (i < bArr2.length) {
                obj[i] = (byte) (bArr2[i] ^ 54);
                obj2[i] = (byte) (bArr2[i] ^ 92);
            } else {
                obj[i] = (byte) 54;
                obj2[i] = SocksProxyConstants.V4_REPLY_REQUEST_FAILED_NO_IDENTD;
            }
        }
        Object obj3 = new byte[(bArr.length + 64)];
        System.arraycopy(obj, 0, obj3, 0, 64);
        System.arraycopy(bArr, 0, obj3, 64, bArr.length);
        MessageDigest instance = MessageDigest.getInstance("MD5");
        obj3 = instance.digest(obj3);
        Object obj4 = new byte[(obj3.length + 64)];
        System.arraycopy(obj2, 0, obj4, 0, 64);
        System.arraycopy(obj3, 0, obj4, 64, obj3.length);
        return instance.digest(obj4);
    }

    private static Key createDESKey(byte[] bArr, int i) {
        r0 = new byte[7];
        System.arraycopy(bArr, i, r0, 0, 7);
        byte[] bArr2 = new byte[]{r0[0], (byte) ((r0[0] << 7) | ((r0[1] & 255) >>> 1)), (byte) ((r0[1] << 6) | ((r0[2] & 255) >>> 2)), (byte) ((r0[2] << 5) | ((r0[3] & 255) >>> 3)), (byte) ((r0[3] << 4) | ((r0[4] & 255) >>> 4)), (byte) ((r0[4] << 3) | ((r0[5] & 255) >>> 5)), (byte) ((r0[5] << 2) | ((r0[6] & 255) >>> 6)), (byte) (r0[6] << 1)};
        oddParity(bArr2);
        return new SecretKeySpec(bArr2, "DES");
    }

    private static void oddParity(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            Object obj;
            byte b = bArr[i];
            if ((((b >>> 1) ^ ((((((b >>> 7) ^ (b >>> 6)) ^ (b >>> 5)) ^ (b >>> 4)) ^ (b >>> 3)) ^ (b >>> 2))) & 1) == 0) {
                obj = 1;
            } else {
                obj = null;
            }
            if (obj != null) {
                bArr[i] = (byte) (bArr[i] | 1);
            } else {
                bArr[i] = (byte) (bArr[i] & -2);
            }
        }
    }
}
