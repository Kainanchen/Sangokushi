package com.alipay.p011b.p012a.p013a.p014a;

import android.os.Environment;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.util.Base64;
import com.alipay.p011b.p012a.p013a.p014a.p015a.C0107a;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.tencent.connect.common.Constants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.alipay.b.a.a.a.a */
public final class C0110a {
    public static File m231a() {
        try {
            return (File) Environment.class.getMethod(new String(C0107a.m224a("Z2V0RXh0ZXJuYWxTdG9yYWdlRGlyZWN0b3J5")), new Class[0]).invoke(null, new Object[0]);
        } catch (Exception e) {
            return null;
        }
    }

    public static String m232a(Throwable th) {
        Writer stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String m233a(Map<String, String> map, String str, String str2) {
        if (map == null) {
            return str2;
        }
        String str3 = (String) map.get(str);
        return str3 != null ? str3 : str2;
    }

    public static boolean m234a(String str) {
        if (str != null) {
            int length = str.length();
            if (length != 0) {
                for (int i = 0; i < length; i++) {
                    if (!Character.isWhitespace(str.charAt(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return true;
    }

    public static boolean m235a(String str, String str2) {
        return str == null ? str2 == null : str.equals(str2);
    }

    public static String m236b(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class, String.class}).invoke(null, new Object[]{str, str2});
        } catch (Exception e) {
            return str2;
        }
    }

    public static boolean m237b(String str) {
        return !C0110a.m234a(str);
    }

    public static String m238c(String str) {
        return str == null ? Constants.STR_EMPTY : str;
    }

    public static String m239d(String str) {
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

    public static String m240e(String str) {
        try {
            Object array = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(str.length()).array();
            OutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes(AsyncHttpResponseHandler.DEFAULT_CHARSET));
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            Object obj = new byte[(byteArrayOutputStream.toByteArray().length + 4)];
            System.arraycopy(array, 0, obj, 0, 4);
            System.arraycopy(byteArrayOutputStream.toByteArray(), 0, obj, 4, byteArrayOutputStream.toByteArray().length);
            return Base64.encodeToString(obj, 8);
        } catch (Exception e) {
            return Constants.STR_EMPTY;
        }
    }

    public static String m241f(String str) {
        String str2 = Constants.STR_EMPTY;
        if (C0110a.m234a(str)) {
            return Constants.STR_EMPTY;
        }
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes("utf-8"));
            OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            byte[] bArr = new byte[AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT];
            while (true) {
                int read = byteArrayInputStream.read(bArr, 0, AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT);
                if (read != -1) {
                    gZIPOutputStream.write(bArr, 0, read);
                } else {
                    gZIPOutputStream.flush();
                    gZIPOutputStream.close();
                    byte[] toByteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.flush();
                    byteArrayOutputStream.close();
                    byteArrayInputStream.close();
                    return new String(Base64.encode(toByteArray, 2));
                }
            }
        } catch (Exception e) {
            return str2;
        }
    }
}
