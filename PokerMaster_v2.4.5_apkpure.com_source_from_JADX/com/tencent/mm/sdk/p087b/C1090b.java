package com.tencent.mm.sdk.p087b;

import android.os.Build;
import android.os.Build.VERSION;
import android.os.Looper;
import android.os.Process;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;

/* renamed from: com.tencent.mm.sdk.b.b */
public final class C1090b {
    private static C1089a aG;
    private static C1089a aH;
    private static final String aI;
    private static int level;

    /* renamed from: com.tencent.mm.sdk.b.b.a */
    public interface C1089a {
        void m5869f(String str, String str2);

        void m5870g(String str, String str2);

        int getLogLevel();

        void m5871h(String str, String str2);

        void m5872i(String str, String str2);
    }

    static {
        level = 6;
        C1089a c1091c = new C1091c();
        aG = c1091c;
        aH = c1091c;
        StringBuilder stringBuilder = new StringBuilder();
        try {
            stringBuilder.append("VERSION.RELEASE:[" + VERSION.RELEASE);
            stringBuilder.append("] VERSION.CODENAME:[" + VERSION.CODENAME);
            stringBuilder.append("] VERSION.INCREMENTAL:[" + VERSION.INCREMENTAL);
            stringBuilder.append("] BOARD:[" + Build.BOARD);
            stringBuilder.append("] DEVICE:[" + Build.DEVICE);
            stringBuilder.append("] DISPLAY:[" + Build.DISPLAY);
            stringBuilder.append("] FINGERPRINT:[" + Build.FINGERPRINT);
            stringBuilder.append("] HOST:[" + Build.HOST);
            stringBuilder.append("] MANUFACTURER:[" + Build.MANUFACTURER);
            stringBuilder.append("] MODEL:[" + Build.MODEL);
            stringBuilder.append("] PRODUCT:[" + Build.PRODUCT);
            stringBuilder.append("] TAGS:[" + Build.TAGS);
            stringBuilder.append("] TYPE:[" + Build.TYPE);
            stringBuilder.append("] USER:[" + Build.USER + "]");
        } catch (Throwable th) {
            th.printStackTrace();
        }
        aI = stringBuilder.toString();
    }

    public static void m5873a(String str, String str2, Object... objArr) {
        if (aH != null && aH.getLogLevel() <= 4) {
            String format = objArr == null ? str2 : String.format(str2, objArr);
            if (format == null) {
                format = LetterIndexBar.SEARCH_ICON_LETTER;
            }
            C1089a c1089a = aH;
            Process.myPid();
            Thread.currentThread().getId();
            Looper.getMainLooper().getThread().getId();
            c1089a.m5872i(str, format);
        }
    }

    public static void m5874b(String str, String str2) {
        C1090b.m5873a(str, str2, null);
    }

    public static void m5875c(String str, String str2) {
        if (aH != null && aH.getLogLevel() <= 3) {
            C1089a c1089a = aH;
            Process.myPid();
            Thread.currentThread().getId();
            Looper.getMainLooper().getThread().getId();
            c1089a.m5871h(str, str2);
        }
    }

    public static void m5876d(String str, String str2) {
        if (aH != null && aH.getLogLevel() <= 2) {
            C1089a c1089a = aH;
            Process.myPid();
            Thread.currentThread().getId();
            Looper.getMainLooper().getThread().getId();
            c1089a.m5869f(str, str2);
        }
    }

    public static void m5877e(String str, String str2) {
        if (aH != null && aH.getLogLevel() <= 1) {
            if (str2 == null) {
                str2 = LetterIndexBar.SEARCH_ICON_LETTER;
            }
            C1089a c1089a = aH;
            Process.myPid();
            Thread.currentThread().getId();
            Looper.getMainLooper().getThread().getId();
            c1089a.m5870g(str, str2);
        }
    }
}
