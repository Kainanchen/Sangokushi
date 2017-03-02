package com.igexin.getuiext.util;

import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.igexin.getuiext.util.d */
public final class C0330d {
    private static void m1101a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public static void m1102a(InputStream inputStream, OutputStream outputStream, int i) {
        OutputStream c0327a = new C0327a(outputStream, i);
        C0330d.m1101a(inputStream, c0327a);
        c0327a.m1090a();
    }

    public static byte[] m1103a(byte[] bArr) {
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr2 = null;
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            bArr2 = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return bArr2;
        } catch (IOException e) {
            return bArr2;
        }
    }

    public static byte[] m1104a(byte[] bArr, int i) {
        InputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            C0330d.m1102a(byteArrayInputStream, byteArrayOutputStream, i);
            try {
                byteArrayInputStream.close();
            } catch (Throwable th) {
            }
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
            }
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable e) {
            throw new RuntimeException("Unexpected I/O error", e);
        } catch (Throwable th3) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th4) {
            }
            byteArrayOutputStream.close();
        }
    }
}
