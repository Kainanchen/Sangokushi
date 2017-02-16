package com.illuminate.texaspoker.utils;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import com.illuminate.texaspoker.application.BaseApplication;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;

/* renamed from: com.illuminate.texaspoker.utils.c */
public final class DeviceUtils {
    private static int f6661a;

    static {
        f6661a = -1;
    }

    public static int m4234a() {
        if (-1 == f6661a) {
            f6661a = VERSION.SDK_INT;
        }
        return f6661a;
    }

    public static String m4235b() {
        return Build.MODEL;
    }

    public static String m4236c() {
        try {
            TelephonyManager telephonyManager;
            Context a = BaseApplication.m3548a();
            if (a != null) {
                telephonyManager = (TelephonyManager) a.getSystemService("phone");
            } else {
                telephonyManager = null;
            }
            if (telephonyManager == null) {
                return LetterIndexBar.SEARCH_ICON_LETTER;
            }
            return telephonyManager.getDeviceId();
        } catch (Exception e) {
            return LetterIndexBar.SEARCH_ICON_LETTER;
        }
    }
}
