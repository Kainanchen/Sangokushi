package com.tencent.android.tpush.service.channel.security;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.tencent.android.tpush.common.Constants;
import com.tencent.android.tpush.encrypt.Rijndael;
import com.tencent.android.tpush.p067a.ProGuard;
import java.io.File;
import java.math.BigInteger;
import java.security.Key;
import java.security.KeyFactory;
import java.security.spec.RSAPublicKeySpec;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: ProGuard */
public class TpnsSecurity {
    private static final String DEVICE_ID_KEY_NAME = "deviceId_v1";
    private static final String DEVICE_ID_PREFIX = "deviceId_";
    private static final String DEVICE_ID_VERSION = "v1";
    private static final String SETTINGS_DEVICE_ID_KEY_NAME = ".com.tencent.tpush.cache.deviceId_v1";
    private static final String SETTINGS_DEVICE_ID_PREFIX = ".com.tencent.tpush.cache";
    private static final String SHAREPREFERENCE_FILE_NAME = "device_id";
    private static boolean loadedTpnsSecuritySo = false;
    public static ProGuard tea = null;
    public static final String tpnsSecurityLibFullName = "libtpnsSecurity.so";
    private static final String tpnsSecurityLibName = "tpnsSecurity";
    protected byte[] encKey;
    protected long inc;
    protected long incRemote;
    protected byte[] iv;
    protected byte[] key;
    String modulusStr;
    protected long random;

    public static native byte[] generateAESKey();

    public static native byte[] generateIV(long j);

    public static native String generateLocalSocketServieNameNative(Object obj);

    public static native String getBusinessDeviceIdNative(Object obj);

    public static native String getEncryptAPKSignatureNative(Object obj);

    public static native byte[] oiSymmetryDecrypt2Byte(byte[] bArr);

    public static native byte[] oiSymmetryEncrypt2Byte(String str);

    public native byte[] decryptByAES(byte[] bArr, long j);

    public native byte[] encryptByAES(byte[] bArr, long j);

    public native byte[] encryptByRSA(byte[] bArr);

    static {
        loadedTpnsSecuritySo = false;
        try {
            System.loadLibrary(tpnsSecurityLibName);
            loadedTpnsSecuritySo = true;
        } catch (Throwable th) {
            ProGuard.m4716c(Constants.ServiceLogTag, "can not load library,error:", th);
            loadedTpnsSecuritySo = false;
        }
        tea = null;
    }

    public static boolean checkTpnsSecurityLibSo(Context context) {
        if (loadedTpnsSecuritySo) {
            return true;
        }
        if (context != null) {
            String str = LetterIndexBar.SEARCH_ICON_LETTER;
            try {
                str = context.getDir("lib", 0).getParentFile().getAbsolutePath() + File.separator + "lib" + File.separator + tpnsSecurityLibFullName;
                System.load(str);
                loadedTpnsSecuritySo = true;
            } catch (Throwable th) {
                loadedTpnsSecuritySo = false;
                ProGuard.m4723h(Constants.ServiceLogTag, "can not load library from " + str + ",error:" + th);
            }
        }
        return loadedTpnsSecuritySo;
    }

    public TpnsSecurity() {
        this.inc = 0;
        this.modulusStr = "C0EF17C0E492C4D366E236902188EF567990289AF267DDC48134C78F3D5632BACB469E1961DD7D61EFEC6B045A138C4DC2E53CC850E796B20664B8F8F58B96F81C9827F7F0C3A15CC4B5BDB5DA2AED5D70E804765F6025613522779A381F5EF3A20A9B043ECA001DB50F873E1CDF335AD382AC66BE3E419CA8F67009BFF3253F";
    }

    public long getRandom() {
        return this.random;
    }

    public byte[] getEncKey() {
        return this.encKey;
    }

    public long getInc() {
        long j = this.inc + 1;
        this.inc = j;
        return j;
    }

    public void checkRemoteInc(long j) {
        if (j <= this.incRemote) {
            throw new SecurityException("\u68c0\u67e5\u7684inc\u5c0f\u4e8e\u7b49\u4e8e\u5f53\u524d\u8bb0\u5f55\u7684\u8fdc\u7aefinc");
        }
        this.incRemote = j;
    }

    public void reset() {
        this.random = 0;
    }

    public boolean needsUpdate() {
        return this.random == 0;
    }

    public void update() {
        this.random = 0;
        while (this.random == 0) {
            this.random = (long) (Math.random() * 2.147483647E9d);
        }
        this.iv = java_generateIV(this.random);
        try {
            this.key = generateAESKey();
            this.encKey = encryptByRSA(this.key);
        } catch (Throwable th) {
            ProGuard.m4716c(Constants.ServiceLogTag, "update error:", th);
        }
    }

    public byte[] decryptData(byte[] bArr) {
        try {
            bArr = decryptByAES(bArr, this.random);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return bArr;
    }

    public byte[] encryptData(byte[] bArr) {
        try {
            bArr = encryptByAES(bArr, this.random);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return bArr;
    }

    private static String toCharsString(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[(length * 2)];
        for (int i = 0; i < length; i++) {
            byte b = bArr[i];
            int i2 = (b >> 4) & 15;
            cArr[i * 2] = (char) (i2 >= 10 ? (i2 + 97) - 10 : i2 + 48);
            i2 = b & 15;
            int i3 = (i * 2) + 1;
            if (i2 >= 10) {
                i2 = (i2 + 97) - 10;
            } else {
                i2 += 48;
            }
            cArr[i3] = (char) i2;
        }
        return new String(cArr);
    }

    public static String oiSymmetryEncrypt2(String str) {
        if (str != null) {
            try {
                if (str.length() > 0) {
                    byte[] oiSymmetryEncrypt2Byte = oiSymmetryEncrypt2Byte(str);
                    if (oiSymmetryEncrypt2Byte == null) {
                        ProGuard.m4723h(Constants.ServiceLogTag, ">> oiSymmetryEncrypt2 \u52a0\u5bc6\u5931\u8d25\uff0c\u8fd4\u56de\u7a7a\u5b57\u7b26\u4e32 inBuff:" + str);
                        return "failed";
                    }
                    String a = ProGuard.m5279a(oiSymmetryEncrypt2Byte);
                    if (a != null) {
                        return a;
                    }
                    ProGuard.m4723h(Constants.ServiceLogTag, ">> oiSymmetryEncrypt2 Base64\u7f16\u7801\u5931\u8d25\uff0c\u8fd4\u56de\u7a7a\u5b57\u7b26\u4e32");
                    return "failed";
                }
            } catch (Throwable th) {
                ProGuard.m4716c(Constants.ServiceLogTag, ">> oiSymmetryEncrypt2 \u672a\u77e5\u9519\u8bef", th);
                return "failed";
            }
        }
        ProGuard.m4723h(Constants.ServiceLogTag, ">> oiSymmetryEncrypt2 \u52a0\u5bc6\u5185\u5bb9\u8f93\u5165\u4e3a\u7a7a");
        return LetterIndexBar.SEARCH_ICON_LETTER;
    }

    public static String oiSymmetryDecrypt2(String str) {
        LetterIndexBar.SEARCH_ICON_LETTER.getBytes();
        if (str != null) {
            try {
                if (str.length() > 0) {
                    byte[] a = ProGuard.m5278a(str);
                    if (a == null || a.length <= 0) {
                        ProGuard.m4723h(Constants.ServiceLogTag, ">> oiSymmetryDecrypt2 \u89e3\u7801\u5931\u8d25\uff0c\u8fd4\u56de\u7a7a\u5b57\u7b26\u4e32");
                        return "failed";
                    }
                    byte[] oiSymmetryDecrypt2Byte = oiSymmetryDecrypt2Byte(a);
                    if (oiSymmetryDecrypt2Byte != null && oiSymmetryDecrypt2Byte.length > 0) {
                        return new String(oiSymmetryDecrypt2Byte);
                    }
                    ProGuard.m4723h(Constants.ServiceLogTag, ">> oiSymmetryDecrypt2 \u89e3\u5bc6\u5931\u8d25\uff0c\u8fd4\u56de\u7a7a\u5b57\u7b26\u4e32");
                    return "failed";
                }
            } catch (Throwable th) {
                ProGuard.m4716c(Constants.ServiceLogTag, ">> oiSymmetryEncrypt2 \u672a\u77e5\u9519\u8bef", th);
                return "failed";
            }
        }
        ProGuard.m4723h(Constants.ServiceLogTag, ">> oiSymmetryDecrypt2 \u89e3\u5bc6\u5185\u5bb9\u8f93\u5165\u4e3a\u7a7a");
        return LetterIndexBar.SEARCH_ICON_LETTER;
    }

    public static String generateLocalSocketServieName(Context context) {
        if (context != null) {
            try {
                return generateLocalSocketServieNameNative(context);
            } catch (Throwable th) {
                ProGuard.m4716c(Constants.ServiceLogTag, "generateLocalSocketServieName \u672a\u77e5\u9519\u8bef", th);
            }
        }
        throw new SecurityException("generate local socket server name error");
    }

    public static String getBusinessDeviceId(Context context) {
        if (context == null) {
            throw new SecurityException("get device id error cause context is null");
        }
        String settingsLocalDeviceId = getSettingsLocalDeviceId(context);
        if (settingsLocalDeviceId != null) {
            return settingsLocalDeviceId;
        }
        settingsLocalDeviceId = getPreferenceLocalDeviceId(context);
        if (settingsLocalDeviceId != null) {
            setSettingsLocalDeviceId(context, settingsLocalDeviceId);
            return settingsLocalDeviceId;
        }
        settingsLocalDeviceId = getBusinessDeviceIdNative(context);
        setPreferenceLocalDeviceId(context, settingsLocalDeviceId);
        setSettingsLocalDeviceId(context, settingsLocalDeviceId);
        return settingsLocalDeviceId;
    }

    private static String getPreferenceLocalDeviceId(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(SHAREPREFERENCE_FILE_NAME, 0);
        if (!sharedPreferences.contains(com.tencent.android.tpush.encrypt.ProGuard.m4849a(DEVICE_ID_KEY_NAME))) {
            return null;
        }
        String string = sharedPreferences.getString(com.tencent.android.tpush.encrypt.ProGuard.m4849a(DEVICE_ID_KEY_NAME), null);
        if (string == null || string.trim().equals(LetterIndexBar.SEARCH_ICON_LETTER)) {
            return null;
        }
        string = Rijndael.decrypt(string);
        if (com.tencent.android.tpush.service.p077d.ProGuard.m5317a(string)) {
            return null;
        }
        return string;
    }

    private static void setPreferenceLocalDeviceId(Context context, String str) {
        Editor edit = context.getSharedPreferences(SHAREPREFERENCE_FILE_NAME, 0).edit();
        edit.putString(com.tencent.android.tpush.encrypt.ProGuard.m4849a(DEVICE_ID_KEY_NAME), Rijndael.encrypt(str));
        edit.commit();
    }

    private static String getSettingsLocalDeviceId(Context context) {
        String a = com.tencent.android.tpush.service.p077d.ProGuard.m5307a(context, SETTINGS_DEVICE_ID_KEY_NAME, true);
        if (a == null) {
            return null;
        }
        a = Rijndael.decrypt(a);
        if (com.tencent.android.tpush.service.p077d.ProGuard.m5317a(a)) {
            return null;
        }
        return a;
    }

    private static void setSettingsLocalDeviceId(Context context, String str) {
        com.tencent.android.tpush.service.p077d.ProGuard.m5315a(context, SETTINGS_DEVICE_ID_KEY_NAME, Rijndael.encrypt(str), true);
    }

    public static String getEncryptAPKSignature(Context context) {
        if (context != null) {
            return getEncryptAPKSignatureNative(context);
        }
        throw new SecurityException("get encrypt apk signature error");
    }

    public static byte[] java_generateAESKey() {
        KeyGenerator instance = KeyGenerator.getInstance("AES");
        instance.init(AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS);
        return instance.generateKey().getEncoded();
    }

    public static byte[] java_generateIV(long j) {
        byte[] bArr = new byte[16];
        for (int i = 0; i < 4; i++) {
            int i2 = i * 4;
            byte b = (byte) ((int) ((j >> (i * 8)) & 255));
            bArr[i2] = b;
            bArr[i2 + 1] = b;
            bArr[i2 + 2] = b;
            bArr[i2 + 3] = b;
        }
        return bArr;
    }

    public byte[] java_encryptByRSA(byte[] bArr) {
        Key generatePublic = KeyFactory.getInstance("RSA").generatePublic(new RSAPublicKeySpec(new BigInteger(this.modulusStr, 16), new BigInteger("010001", 16)));
        Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1PADDING");
        instance.init(1, generatePublic);
        return instance.doFinal(bArr);
    }

    public byte[] java_encryptByAES(byte[] bArr, long j) {
        Key secretKeySpec = new SecretKeySpec(this.key, "AES");
        Cipher instance = Cipher.getInstance("AES/CFB8/NoPadding");
        instance.init(1, secretKeySpec, new IvParameterSpec(this.iv));
        return instance.doFinal(bArr);
    }

    public byte[] java_decryptByAES(byte[] bArr, long j) {
        Key secretKeySpec = new SecretKeySpec(this.key, "AES");
        Cipher instance = Cipher.getInstance("AES/CFB8/NoPadding");
        instance.init(2, secretKeySpec, new IvParameterSpec(this.iv));
        return instance.doFinal(bArr);
    }

    public static ProGuard getTEA() {
        if (tea == null) {
            tea = new ProGuard("0123456789abcdef".getBytes());
        }
        return tea;
    }

    public static byte[] java_oiSymmetryEncrypt2Byte(String str) {
        return getTEA().m5285a(str.getBytes());
    }

    public static byte[] java_oiSymmetryDecrypt2Byte(byte[] bArr) {
        return getTEA().m5288b(bArr);
    }
}
