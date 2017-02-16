package com.amap.p003a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import java.security.MessageDigest;
import java.util.Locale;

/* compiled from: AppInfo */
/* renamed from: com.amap.a.cb */
public final class cb {
    private static String f542a;
    private static String f543b;
    private static String f544c;
    private static String f545d;
    private static String f546e;

    static {
        f542a = LetterIndexBar.SEARCH_ICON_LETTER;
        f543b = LetterIndexBar.SEARCH_ICON_LETTER;
        f544c = LetterIndexBar.SEARCH_ICON_LETTER;
        f545d = LetterIndexBar.SEARCH_ICON_LETTER;
        f546e = null;
    }

    public static String m516a(Context context) {
        try {
            return cb.m524g(context);
        } catch (Throwable th) {
            th.printStackTrace();
            return f545d;
        }
    }

    public static void m517a(String str) {
        f543b = str;
    }

    public static String m518b(Context context) {
        try {
            if (!LetterIndexBar.SEARCH_ICON_LETTER.equals(f542a)) {
                return f542a;
            }
            PackageManager packageManager = context.getPackageManager();
            f542a = (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 0));
            return f542a;
        } catch (Throwable th) {
            cm.m637a(th, "AppInfo", "getApplicationName");
        }
    }

    static void m519b(String str) {
        f545d = str;
    }

    public static String m520c(Context context) {
        try {
            if (f543b != null && !LetterIndexBar.SEARCH_ICON_LETTER.equals(f543b)) {
                return f543b;
            }
            f543b = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).packageName;
            return f543b;
        } catch (Throwable th) {
            cm.m637a(th, "AppInfo", "getpckn");
        }
    }

    public static String m521d(Context context) {
        try {
            if (!LetterIndexBar.SEARCH_ICON_LETTER.equals(f544c)) {
                return f544c;
            }
            f544c = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            return f544c == null ? LetterIndexBar.SEARCH_ICON_LETTER : f544c;
        } catch (Throwable th) {
            cm.m637a(th, "AppInfo", "getApplicationVersion");
        }
    }

    public static String m522e(Context context) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures[0].toByteArray());
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : digest) {
                String toUpperCase = Integer.toHexString(b & MotionEventCompat.ACTION_MASK).toUpperCase(Locale.US);
                if (toUpperCase.length() == 1) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(toUpperCase);
                stringBuffer.append(":");
            }
            stringBuffer.append(cb.m520c(context));
            String stringBuffer2 = stringBuffer.toString();
            f546e = stringBuffer2;
            return stringBuffer2;
        } catch (Throwable th) {
            cm.m637a(th, "AppInfo", "getpck");
            return f546e;
        }
    }

    public static String m523f(Context context) {
        try {
            return cb.m524g(context);
        } catch (Throwable th) {
            cm.m637a(th, "AppInfo", "getKey");
            return f545d;
        }
    }

    private static String m524g(Context context) {
        if (f545d == null || f545d.equals(LetterIndexBar.SEARCH_ICON_LETTER)) {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS);
            if (applicationInfo == null || applicationInfo.metaData == null) {
                return f545d;
            }
            String string = applicationInfo.metaData.getString("com.amap.api.v2.apikey");
            f545d = string;
            if (string == null) {
                f545d = LetterIndexBar.SEARCH_ICON_LETTER;
            }
        }
        return f545d;
    }
}
