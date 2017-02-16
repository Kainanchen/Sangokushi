package com.amap.p003a;

import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;

/* compiled from: MD5 */
/* renamed from: com.amap.a.cg */
public final class cg {
    public static String m584a(String str) {
        FileInputStream fileInputStream;
        Throwable th;
        String str2 = null;
        try {
            if (!TextUtils.isEmpty(str)) {
                File file = new File(str);
                if (file.isFile() && file.exists()) {
                    byte[] bArr = new byte[AccessibilityNodeInfoCompat.ACTION_PREVIOUS_HTML_ELEMENT];
                    MessageDigest instance = MessageDigest.getInstance("MD5");
                    fileInputStream = new FileInputStream(file);
                    while (true) {
                        try {
                            int read = fileInputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            instance.update(bArr, 0, read);
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                    str2 = ck.m632d(instance.digest());
                    try {
                        fileInputStream.close();
                    } catch (Throwable th3) {
                        cm.m637a(th3, "MD5", "getMd5FromFile");
                    }
                }
            }
        } catch (Throwable th32) {
            fileInputStream = str2;
            th = th32;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            throw th;
        }
        return str2;
    }

    public static byte[] m585a(byte[] bArr, String str) {
        byte[] bArr2 = null;
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            instance.update(bArr);
            bArr2 = instance.digest();
        } catch (Throwable th) {
            cm.m637a(th, "MD5", "getMd5Bytes1");
        }
        return bArr2;
    }

    public static String m586b(String str) {
        return str == null ? null : ck.m632d(cg.m588d(str));
    }

    static byte[] m587c(String str) {
        try {
            return cg.m589e(str);
        } catch (Throwable th) {
            th.printStackTrace();
            return new byte[0];
        }
    }

    private static byte[] m588d(String str) {
        try {
            return cg.m589e(str);
        } catch (Throwable th) {
            cm.m637a(th, "MD5", "getMd5Bytes");
            return new byte[0];
        }
    }

    private static byte[] m589e(String str) {
        if (str == null) {
            return null;
        }
        MessageDigest instance = MessageDigest.getInstance("MD5");
        instance.update(ck.m624a(str));
        return instance.digest();
    }
}
