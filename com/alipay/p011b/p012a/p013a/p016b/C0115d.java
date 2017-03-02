package com.alipay.p011b.p012a.p013a.p016b;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import com.alipay.p011b.p012a.p013a.p014a.C0110a;
import com.tencent.connect.common.Constants;
import java.io.File;

/* renamed from: com.alipay.b.a.a.b.d */
public final class C0115d {
    private static C0115d f147a;

    static {
        f147a = new C0115d();
    }

    private C0115d() {
    }

    public static C0115d m292a() {
        return f147a;
    }

    private static String m293a(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class, String.class}).invoke(null, new Object[]{str, str2});
        } catch (Exception e) {
            return str2;
        }
    }

    public static boolean m294a(Context context) {
        try {
            if (Build.HARDWARE.contains("goldfish") || Build.PRODUCT.contains("sdk") || Build.FINGERPRINT.contains("generic")) {
                return true;
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                Object obj;
                String deviceId = telephonyManager.getDeviceId();
                if (deviceId != null) {
                    int length = deviceId.length();
                    if (length != 0) {
                        int i = 0;
                        while (i < length) {
                            if (!Character.isWhitespace(deviceId.charAt(i)) && deviceId.charAt(i) != '0') {
                                obj = null;
                                break;
                            }
                            i++;
                        }
                        i = 1;
                        if (obj != null) {
                            return true;
                        }
                    }
                }
                obj = 1;
                if (obj != null) {
                    return true;
                }
            }
            return C0110a.m234a(Secure.getString(context.getContentResolver(), "android_id"));
        } catch (Exception e) {
            return false;
        }
    }

    public static String m295b() {
        return "android";
    }

    public static boolean m296c() {
        String[] strArr = new String[]{"/system/bin/", "/system/xbin/", "/system/sbin/", "/sbin/", "/vendor/bin/"};
        int i = 0;
        while (i < 5) {
            try {
                if (new File(strArr[i] + "su").exists()) {
                    return true;
                }
                i++;
            } catch (Exception e) {
            }
        }
        return false;
    }

    public static String m297d() {
        return Build.BOARD;
    }

    public static String m298e() {
        return Build.BRAND;
    }

    public static String m299f() {
        return Build.DEVICE;
    }

    public static String m300g() {
        return Build.DISPLAY;
    }

    public static String m301h() {
        return VERSION.INCREMENTAL;
    }

    public static String m302i() {
        return Build.MANUFACTURER;
    }

    public static String m303j() {
        return Build.MODEL;
    }

    public static String m304k() {
        return Build.PRODUCT;
    }

    public static String m305l() {
        return VERSION.RELEASE;
    }

    public static String m306m() {
        return VERSION.SDK;
    }

    public static String m307n() {
        return Build.TAGS;
    }

    public static String m308o() {
        return C0115d.m293a("ro.kernel.qemu", Constants.VIA_RESULT_SUCCESS);
    }
}
