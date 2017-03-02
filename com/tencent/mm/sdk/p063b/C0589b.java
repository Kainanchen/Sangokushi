package com.tencent.mm.sdk.p063b;

import android.os.Build;
import android.os.Build.VERSION;
import android.os.Looper;
import android.os.Process;
import com.tencent.connect.common.Constants;

/* renamed from: com.tencent.mm.sdk.b.b */
public final class C0589b {
    private static C0588a aG;
    private static C0588a aH;
    private static final String aI;
    private static int level;

    /* renamed from: com.tencent.mm.sdk.b.b.a */
    public interface C0588a {
        void m2013f(String str, String str2);

        void m2014g(String str, String str2);

        int getLogLevel();

        void m2015h(String str, String str2);

        void m2016i(String str, String str2);
    }

    static {
        level = 6;
        C0588a c0590c = new C0590c();
        aG = c0590c;
        aH = c0590c;
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

    public static void m2017a(String str, String str2, Object... objArr) {
        if (aH != null && aH.getLogLevel() <= 4) {
            String format = objArr == null ? str2 : String.format(str2, objArr);
            if (format == null) {
                format = Constants.STR_EMPTY;
            }
            C0588a c0588a = aH;
            Process.myPid();
            Thread.currentThread().getId();
            Looper.getMainLooper().getThread().getId();
            c0588a.m2016i(str, format);
        }
    }

    public static void m2018b(String str, String str2) {
        C0589b.m2017a(str, str2, null);
    }

    public static void m2019c(String str, String str2) {
        if (aH != null && aH.getLogLevel() <= 3) {
            C0588a c0588a = aH;
            Process.myPid();
            Thread.currentThread().getId();
            Looper.getMainLooper().getThread().getId();
            c0588a.m2015h(str, str2);
        }
    }

    public static void m2020d(String str, String str2) {
        if (aH != null && aH.getLogLevel() <= 2) {
            C0588a c0588a = aH;
            Process.myPid();
            Thread.currentThread().getId();
            Looper.getMainLooper().getThread().getId();
            c0588a.m2013f(str, str2);
        }
    }

    public static void m2021e(String str, String str2) {
        if (aH != null && aH.getLogLevel() <= 1) {
            if (str2 == null) {
                str2 = Constants.STR_EMPTY;
            }
            C0588a c0588a = aH;
            Process.myPid();
            Thread.currentThread().getId();
            Looper.getMainLooper().getThread().getId();
            c0588a.m2014g(str, str2);
        }
    }
}
