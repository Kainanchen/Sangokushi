package com.tencent.p063a.p064a.p065a.p066a;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.util.Base64;
import android.util.Log;
import com.sina.weibo.sdk.component.GameManager;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.tencent.p080b.p081a.p083b.C1044g;
import org.json.JSONObject;

/* renamed from: com.tencent.a.a.a.a.h */
public final class C1028h {
    static String m4648a(Context context) {
        try {
            if (C1028h.m4651a(context, "android.permission.READ_PHONE_STATE")) {
                String deviceId = ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
                if (deviceId != null) {
                    return deviceId;
                }
            }
            Log.i("MID", "Could not get permission of android.permission.READ_PHONE_STATE");
        } catch (Throwable th) {
            Log.w("MID", th);
        }
        return LetterIndexBar.SEARCH_ICON_LETTER;
    }

    private static void m4649a(String str, Throwable th) {
        Log.e("MID", str, th);
    }

    static void m4650a(JSONObject jSONObject, String str, String str2) {
        if (C1028h.m4652a(str2)) {
            jSONObject.put(str, str2);
        }
    }

    static boolean m4651a(Context context, String str) {
        try {
            return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
        } catch (Throwable th) {
            C1028h.m4649a("checkPermission error", th);
            return false;
        }
    }

    static boolean m4652a(String str) {
        return (str == null || str.trim().length() == 0) ? false : true;
    }

    static String m4653b(Context context) {
        if (C1028h.m4651a(context, "android.permission.ACCESS_WIFI_STATE")) {
            try {
                WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
                return wifiManager == null ? LetterIndexBar.SEARCH_ICON_LETTER : wifiManager.getConnectionInfo().getMacAddress();
            } catch (Exception e) {
                Log.i("MID", "get wifi address error" + e);
                return LetterIndexBar.SEARCH_ICON_LETTER;
            }
        }
        Log.i("MID", "Could not get permission of android.permission.ACCESS_WIFI_STATE");
        return LetterIndexBar.SEARCH_ICON_LETTER;
    }

    public static boolean m4654b(String str) {
        return str != null && str.trim().length() >= 40;
    }

    static String m4655c(String str) {
        if (str == null) {
            return null;
        }
        if (VERSION.SDK_INT < 8) {
            return str;
        }
        try {
            return new String(C1044g.m5677b(Base64.decode(str.getBytes(GameManager.DEFAULT_CHARSET), 0)), GameManager.DEFAULT_CHARSET).trim().replace("\t", LetterIndexBar.SEARCH_ICON_LETTER).replace("\n", LetterIndexBar.SEARCH_ICON_LETTER).replace("\r", LetterIndexBar.SEARCH_ICON_LETTER);
        } catch (Throwable th) {
            C1028h.m4649a("decode error", th);
            return str;
        }
    }

    static String m4656d(String str) {
        if (str == null) {
            return null;
        }
        if (VERSION.SDK_INT < 8) {
            return str;
        }
        try {
            return new String(Base64.encode(C1044g.m5676a(str.getBytes(GameManager.DEFAULT_CHARSET), Base64.decode("MDNhOTc2NTExZTJjYmUzYTdmMjY4MDhmYjdhZjNjMDU=", 0)), 0), GameManager.DEFAULT_CHARSET).trim().replace("\t", LetterIndexBar.SEARCH_ICON_LETTER).replace("\n", LetterIndexBar.SEARCH_ICON_LETTER).replace("\r", LetterIndexBar.SEARCH_ICON_LETTER);
        } catch (Throwable th) {
            C1028h.m4649a("decode error", th);
            return str;
        }
    }
}
