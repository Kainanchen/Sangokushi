package com.alipay.sdk.util;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

/* renamed from: com.alipay.sdk.util.c */
public final class C0196c {
    public static final boolean f479a = false;
    public static final String f480b = "mspstd";

    private static void m640a() {
    }

    private static void m642b() {
    }

    private static void m643c() {
    }

    private static void m644d() {
    }

    private static void m645e() {
    }

    private static void m646f() {
    }

    private static void m647g() {
    }

    private static void m641a(Object obj) {
        if (!(obj instanceof Exception)) {
        }
    }

    private static void m648h() {
    }

    private static String m639a(Throwable th) {
        Writer stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }
}
