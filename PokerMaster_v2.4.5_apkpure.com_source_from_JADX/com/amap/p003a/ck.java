package com.amap.p003a;

import android.content.Context;
import android.support.v4.view.MotionEventCompat;
import android.text.TextUtils;
import android.util.Log;
import com.sina.weibo.sdk.component.GameManager;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.spec.X509EncodedKeySpec;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.json.JSONObject;

/* compiled from: Utils */
/* renamed from: com.amap.a.ck */
public final class ck {
    static String f638a;

    static {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 80; i++) {
            stringBuilder.append("=");
        }
        f638a = stringBuilder.toString();
    }

    public static String m615a(long j) {
        String str = null;
        try {
            str = new SimpleDateFormat("yyyyMMdd HH:mm:ss:SSS", Locale.CHINA).format(new Date(j));
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return str;
    }

    public static String m616a(Throwable th) {
        Writer stringWriter;
        Throwable th2;
        String str = null;
        PrintWriter printWriter;
        Throwable cause;
        try {
            stringWriter = new StringWriter();
            try {
                printWriter = new PrintWriter(stringWriter);
                try {
                    th.printStackTrace(printWriter);
                    for (cause = th.getCause(); cause != null; cause = cause.getCause()) {
                        cause.printStackTrace(printWriter);
                    }
                    str = stringWriter.toString();
                    if (stringWriter != null) {
                        try {
                            stringWriter.close();
                        } catch (Throwable cause2) {
                            cause2.printStackTrace();
                        }
                    }
                    if (printWriter != null) {
                        try {
                            printWriter.close();
                        } catch (Throwable th3) {
                            cause2 = th3;
                            cause2.printStackTrace();
                            return str;
                        }
                    }
                } catch (Throwable th4) {
                    cause2 = th4;
                    try {
                        cause2.printStackTrace();
                        if (stringWriter != null) {
                            try {
                                stringWriter.close();
                            } catch (Throwable cause22) {
                                cause22.printStackTrace();
                            }
                        }
                        if (printWriter != null) {
                            try {
                                printWriter.close();
                            } catch (Throwable th5) {
                                cause22 = th5;
                                cause22.printStackTrace();
                                return str;
                            }
                        }
                        return str;
                    } catch (Throwable th6) {
                        th2 = th6;
                        if (stringWriter != null) {
                            try {
                                stringWriter.close();
                            } catch (Throwable cause222) {
                                cause222.printStackTrace();
                            }
                        }
                        if (printWriter != null) {
                            try {
                                printWriter.close();
                            } catch (Throwable cause2222) {
                                cause2222.printStackTrace();
                            }
                        }
                        throw th2;
                    }
                }
            } catch (Throwable cause22222) {
                printWriter = null;
                th2 = cause22222;
                if (stringWriter != null) {
                    stringWriter.close();
                }
                if (printWriter != null) {
                    printWriter.close();
                }
                throw th2;
            }
        } catch (Throwable cause222222) {
            printWriter = null;
            stringWriter = null;
            th2 = cause222222;
            if (stringWriter != null) {
                stringWriter.close();
            }
            if (printWriter != null) {
                printWriter.close();
            }
            throw th2;
        }
        return str;
    }

    public static String m617a(Map<String, String> map) {
        if (map == null || map.size() == 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            Object obj = 1;
            for (Entry entry : map.entrySet()) {
                if (obj != null) {
                    obj = null;
                    stringBuffer.append((String) entry.getKey()).append("=").append((String) entry.getValue());
                } else {
                    stringBuffer.append("&").append((String) entry.getKey()).append("=").append((String) entry.getValue());
                }
            }
        } catch (Throwable th) {
            cm.m637a(th, "Utils", "assembleParams");
        }
        return stringBuffer.toString();
    }

    public static String m618a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return LetterIndexBar.SEARCH_ICON_LETTER;
        }
        try {
            return new String(bArr, GameManager.DEFAULT_CHARSET);
        } catch (UnsupportedEncodingException e) {
            return new String(bArr);
        }
    }

    public static void m619a(Context context, String str, String str2, String str3) {
        Log.i("authErrLog", f638a);
        Log.i("authErrLog", "                                   \u9274\u6743\u9519\u8bef\u4fe1\u606f                                  ");
        Log.i("authErrLog", f638a);
        ck.m634e("SHA1Package:" + cb.m522e(context));
        ck.m634e("key:" + cb.m523f(context));
        ck.m634e("csid:" + str);
        ck.m634e("gsid:" + str2);
        ck.m634e("json:" + str3);
        Log.i("authErrLog", "                                                                               ");
        Log.i("authErrLog", "\u8bf7\u4ed4\u7ec6\u68c0\u67e5 SHA1Package\u4e0eKey\u7533\u8bf7\u4fe1\u606f\u662f\u5426\u5bf9\u5e94\uff0cKey\u662f\u5426\u5220\u9664\uff0c\u5e73\u53f0\u662f\u5426\u5339\u914d                ");
        Log.i("authErrLog", "\u5982\u82e5\u786e\u8ba4\u65e0\u8bef\uff0c\u4ecd\u5b58\u5728\u95ee\u9898\uff0c\u8bf7\u5c06\u5168\u90e8log\u4fe1\u606f\u63d0\u4ea4\u5230\u5de5\u5355\u7cfb\u7edf\uff0c\u591a\u8c22\u5408\u4f5c                       ");
        Log.i("authErrLog", f638a);
    }

    public static void m620a(ByteArrayOutputStream byteArrayOutputStream, byte b, byte[] bArr) {
        try {
            byteArrayOutputStream.write(new byte[]{b});
            int i = b & MotionEventCompat.ACTION_MASK;
            if (i < MotionEventCompat.ACTION_MASK && i > 0) {
                byteArrayOutputStream.write(bArr);
            } else if (i == MotionEventCompat.ACTION_MASK) {
                byteArrayOutputStream.write(bArr, 0, MotionEventCompat.ACTION_MASK);
            }
        } catch (Throwable e) {
            cm.m637a(e, "Utils", "writeField");
        }
    }

    public static void m621a(ByteArrayOutputStream byteArrayOutputStream, String str) {
        int i = MotionEventCompat.ACTION_MASK;
        if (TextUtils.isEmpty(str)) {
            try {
                byteArrayOutputStream.write(new byte[]{(byte) 0});
                return;
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
        }
        int length = str.length();
        if (length <= MotionEventCompat.ACTION_MASK) {
            i = length;
        }
        ck.m620a(byteArrayOutputStream, (byte) i, ck.m624a(str));
    }

    public static boolean m622a(JSONObject jSONObject, String str) {
        return jSONObject != null && jSONObject.has(str);
    }

    public static byte[] m623a() {
        int i = 0;
        try {
            String[] split = new StringBuffer("16,16,18,77,15,911,121,77,121,911,38,77,911,99,86,67,611,96,48,77,84,911,38,67,021,301,86,67,611,98,48,77,511,77,48,97,511,58,48,97,511,84,501,87,511,96,48,77,221,911,38,77,121,37,86,67,25,301,86,67,021,96,86,67,021,701,86,67,35,56,86,67,611,37,221,87").reverse().toString().split(",");
            byte[] bArr = new byte[split.length];
            for (int i2 = 0; i2 < split.length; i2++) {
                bArr[i2] = Byte.parseByte(split[i2]);
            }
            split = new StringBuffer(new String(cf.m581b(new String(bArr)))).reverse().toString().split(",");
            byte[] bArr2 = new byte[split.length];
            while (i < split.length) {
                bArr2[i] = Byte.parseByte(split[i]);
                i++;
            }
            return bArr2;
        } catch (Throwable th) {
            cm.m637a(th, "Utils", "getIV");
            return new byte[16];
        }
    }

    public static byte[] m624a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        try {
            return str.getBytes(GameManager.DEFAULT_CHARSET);
        } catch (UnsupportedEncodingException e) {
            return str.getBytes();
        }
    }

    public static String m625b(String str) {
        if (str == null) {
            return null;
        }
        String b = cf.m580b(ck.m624a(str));
        return ((char) ((b.length() % 26) + 65)) + b;
    }

    static PublicKey m627b() {
        InputStream byteArrayInputStream;
        Throwable th;
        Throwable th2;
        PublicKey publicKey = null;
        try {
            byteArrayInputStream = new ByteArrayInputStream(cf.m581b("MIICnjCCAgegAwIBAgIJAJ0Pdzos7ZfYMA0GCSqGSIb3DQEBBQUAMGgxCzAJBgNVBAYTAkNOMRMwEQYDVQQIDApTb21lLVN0YXRlMRAwDgYDVQQHDAdCZWlqaW5nMREwDwYDVQQKDAhBdXRvbmF2aTEfMB0GA1UEAwwWY29tLmF1dG9uYXZpLmFwaXNlcnZlcjAeFw0xMzA4MTUwNzU2NTVaFw0yMzA4MTMwNzU2NTVaMGgxCzAJBgNVBAYTAkNOMRMwEQYDVQQIDApTb21lLVN0YXRlMRAwDgYDVQQHDAdCZWlqaW5nMREwDwYDVQQKDAhBdXRvbmF2aTEfMB0GA1UEAwwWY29tLmF1dG9uYXZpLmFwaXNlcnZlcjCBnzANBgkqhkiG9w0BAQEFAAOBjQAwgYkCgYEA8eWAyHbFPoFPfdx5AD+D4nYFq4dbJ1p7SIKt19Oz1oivF/6H43v5Fo7s50pD1UF8+Qu4JoUQxlAgOt8OCyQ8DYdkaeB74XKb1wxkIYg/foUwN1CMHPZ9O9ehgna6K4EJXZxR7Y7XVZnbjHZIVn3VpPU/Rdr2v37LjTw+qrABJxMCAwEAAaNQME4wHQYDVR0OBBYEFOM/MLGP8xpVFuVd+3qZkw7uBvOTMB8GA1UdIwQYMBaAFOM/MLGP8xpVFuVd+3qZkw7uBvOTMAwGA1UdEwQFMAMBAf8wDQYJKoZIhvcNAQEFBQADgYEA4LY3g8aAD8JkxAOqUXDDyLuCCGOc2pTIhn0TwMNaVdH4hZlpTeC/wuRD5LJ0z3j+IQ0vLvuQA5uDjVyEOlBrvVIGwSem/1XGUo13DfzgAJ5k1161S5l+sFUo5TxpHOXr8Z5nqJMjieXmhnE/I99GFyHpQmw4cC6rhYUhdhtg+Zk="));
            try {
                CertificateFactory instance = CertificateFactory.getInstance("X.509");
                KeyFactory instance2 = KeyFactory.getInstance("RSA");
                Certificate generateCertificate = instance.generateCertificate(byteArrayInputStream);
                if (generateCertificate == null || instance2 == null) {
                    if (byteArrayInputStream != null) {
                        try {
                            byteArrayInputStream.close();
                        } catch (Throwable th3) {
                            th = th3;
                            th.printStackTrace();
                            return publicKey;
                        }
                    }
                    return publicKey;
                }
                publicKey = instance2.generatePublic(new X509EncodedKeySpec(generateCertificate.getPublicKey().getEncoded()));
                if (byteArrayInputStream != null) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th4) {
                        th = th4;
                        th.printStackTrace();
                        return publicKey;
                    }
                }
                return publicKey;
            } catch (Throwable th5) {
                th = th5;
                try {
                    th.printStackTrace();
                    if (byteArrayInputStream != null) {
                        try {
                            byteArrayInputStream.close();
                        } catch (Throwable th6) {
                            th = th6;
                            th.printStackTrace();
                            return publicKey;
                        }
                    }
                    return publicKey;
                } catch (Throwable th7) {
                    th2 = th7;
                    if (byteArrayInputStream != null) {
                        try {
                            byteArrayInputStream.close();
                        } catch (Throwable th8) {
                            th8.printStackTrace();
                        }
                    }
                    throw th2;
                }
            }
        } catch (Throwable th82) {
            byteArrayInputStream = publicKey;
            th2 = th82;
            if (byteArrayInputStream != null) {
                byteArrayInputStream.close();
            }
            throw th2;
        }
    }

    public static byte[] m628b(byte[] bArr) {
        try {
            return ck.m636g(bArr);
        } catch (Throwable th) {
            cm.m637a(th, "Utils", "gZip");
            return new byte[0];
        }
    }

    public static String m629c(String str) {
        return str.length() < 2 ? LetterIndexBar.SEARCH_ICON_LETTER : cf.m576a(str.substring(1));
    }

    public static byte[] m630c(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream;
        ZipOutputStream zipOutputStream;
        Throwable th;
        String str;
        String str2;
        Throwable th2;
        byte[] bArr2 = null;
        if (!(bArr == null || bArr.length == 0)) {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    zipOutputStream = new ZipOutputStream(byteArrayOutputStream);
                } catch (Throwable th3) {
                    zipOutputStream = bArr2;
                    th2 = th3;
                    if (zipOutputStream != null) {
                        zipOutputStream.close();
                    }
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                    throw th2;
                }
                try {
                    zipOutputStream.putNextEntry(new ZipEntry("log"));
                    zipOutputStream.write(bArr);
                    zipOutputStream.closeEntry();
                    zipOutputStream.finish();
                    bArr2 = byteArrayOutputStream.toByteArray();
                    if (zipOutputStream != null) {
                        try {
                            zipOutputStream.close();
                        } catch (Throwable th32) {
                            cm.m637a(th32, "Utils", "zip1");
                        }
                    }
                    if (byteArrayOutputStream != null) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable th4) {
                            th32 = th4;
                            str = "Utils";
                            str2 = "zip2";
                            cm.m637a(th32, str, str2);
                            return bArr2;
                        }
                    }
                } catch (Throwable th5) {
                    th32 = th5;
                    cm.m637a(th32, "Utils", "zip");
                    if (zipOutputStream != null) {
                        zipOutputStream.close();
                    }
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                    return bArr2;
                }
            } catch (Throwable th322) {
                byteArrayOutputStream = bArr2;
                zipOutputStream = bArr2;
                th2 = th322;
                if (zipOutputStream != null) {
                    zipOutputStream.close();
                }
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.close();
                }
                throw th2;
            }
        }
        return bArr2;
    }

    private static String m631d(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return LetterIndexBar.SEARCH_ICON_LETTER;
            }
            String[] split = str.split("&");
            Arrays.sort(split);
            StringBuffer stringBuffer = new StringBuffer();
            for (String append : split) {
                stringBuffer.append(append);
                stringBuffer.append("&");
            }
            String stringBuffer2 = stringBuffer.toString();
            if (stringBuffer2.length() > 1) {
                return (String) stringBuffer2.subSequence(0, stringBuffer2.length() - 1);
            }
            return str;
        } catch (Throwable th) {
            cm.m637a(th, "Utils", "sortParams");
        }
    }

    static String m632d(byte[] bArr) {
        try {
            return ck.m635f(bArr);
        } catch (Throwable th) {
            cm.m637a(th, "Utils", "HexString");
            return null;
        }
    }

    static String m633e(byte[] bArr) {
        try {
            return ck.m635f(bArr);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private static void m634e(String str) {
        int i = 0;
        while (str.length() >= 78) {
            String str2 = "authErrLog";
            Log.i(str2, "|" + str.substring(0, 78) + "|");
            str = str.substring(78);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("|").append(str);
        while (i < 78 - str.length()) {
            stringBuilder.append(" ");
            i++;
        }
        stringBuilder.append("|");
        Log.i("authErrLog", stringBuilder.toString());
    }

    private static String m635f(byte[] bArr) {
        StringBuilder stringBuilder = new StringBuilder();
        if (bArr == null) {
            return null;
        }
        for (byte b : bArr) {
            String toHexString = Integer.toHexString(b & MotionEventCompat.ACTION_MASK);
            if (toHexString.length() == 1) {
                toHexString = "0" + toHexString;
            }
            stringBuilder.append(toHexString);
        }
        return stringBuilder.toString();
    }

    private static byte[] m636g(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream;
        Throwable th;
        Throwable th2;
        byte[] bArr2 = null;
        if (bArr != null) {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    try {
                        gZIPOutputStream.write(bArr);
                        gZIPOutputStream.finish();
                        bArr2 = byteArrayOutputStream.toByteArray();
                        if (gZIPOutputStream != null) {
                            gZIPOutputStream.close();
                        }
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            throw th;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    }
                } catch (Throwable th5) {
                    th2 = th5;
                    gZIPOutputStream = null;
                    th = th2;
                    if (gZIPOutputStream != null) {
                        gZIPOutputStream.close();
                    }
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th52) {
                byteArrayOutputStream = null;
                th = th52;
                gZIPOutputStream = null;
                if (gZIPOutputStream != null) {
                    gZIPOutputStream.close();
                }
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.close();
                }
                throw th;
            }
        }
        return bArr2;
    }

    public static String m626b(Map<String, String> map) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Entry entry : map.entrySet()) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append("&");
            }
            stringBuilder.append((String) entry.getKey());
            stringBuilder.append("=");
            stringBuilder.append((String) entry.getValue());
        }
        return ck.m631d(stringBuilder.toString());
    }
}
