package com.tencent.p055a.p056a.p057a.p058a;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.util.Base64;
import android.util.Log;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.tencent.connect.common.Constants;
import com.tencent.wxop.stat.common.C0634f;
import org.json.JSONObject;

/* renamed from: com.tencent.a.a.a.a.h */
public final class C0580h {
    static String m1925a(Context context) {
        try {
            if (C0580h.m1928a(context, "android.permission.READ_PHONE_STATE")) {
                String deviceId = ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
                if (deviceId != null) {
                    return deviceId;
                }
            }
            Log.i("MID", "Could not get permission of android.permission.READ_PHONE_STATE");
        } catch (Throwable th) {
            Log.w("MID", th);
        }
        return Constants.STR_EMPTY;
    }

    private static void m1926a(String str, Throwable th) {
        Log.e("MID", str, th);
    }

    static void m1927a(JSONObject jSONObject, String str, String str2) {
        if (C0580h.m1930b(str2)) {
            jSONObject.put(str, str2);
        }
    }

    static boolean m1928a(Context context, String str) {
        try {
            return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
        } catch (Throwable th) {
            C0580h.m1926a("checkPermission error", th);
            return false;
        }
    }

    static String m1929b(Context context) {
        if (C0580h.m1928a(context, "android.permission.ACCESS_WIFI_STATE")) {
            try {
                WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
                return wifiManager == null ? Constants.STR_EMPTY : wifiManager.getConnectionInfo().getMacAddress();
            } catch (Exception e) {
                Log.i("MID", "get wifi address error" + e);
                return Constants.STR_EMPTY;
            }
        }
        Log.i("MID", "Could not get permission of android.permission.ACCESS_WIFI_STATE");
        return Constants.STR_EMPTY;
    }

    static boolean m1930b(String str) {
        return (str == null || str.trim().length() == 0) ? false : true;
    }

    public static boolean m1931c(String str) {
        return str != null && str.trim().length() >= 40;
    }

    static String m1932f(String str) {
        if (str == null) {
            return null;
        }
        if (VERSION.SDK_INT < 8) {
            return str;
        }
        try {
            return new String(C0634f.m2377b(Base64.decode(str.getBytes(AsyncHttpResponseHandler.DEFAULT_CHARSET), 0)), AsyncHttpResponseHandler.DEFAULT_CHARSET).trim().replace("\t", Constants.STR_EMPTY).replace("\n", Constants.STR_EMPTY).replace("\r", Constants.STR_EMPTY);
        } catch (Throwable th) {
            C0580h.m1926a("decode error", th);
            return str;
        }
    }

    static String m1933g(String str) {
        if (str == null) {
            return null;
        }
        if (VERSION.SDK_INT < 8) {
            return str;
        }
        try {
            return new String(Base64.encode(C0634f.m2375a(str.getBytes(AsyncHttpResponseHandler.DEFAULT_CHARSET)), 0), AsyncHttpResponseHandler.DEFAULT_CHARSET).trim().replace("\t", Constants.STR_EMPTY).replace("\n", Constants.STR_EMPTY).replace("\r", Constants.STR_EMPTY);
        } catch (Throwable th) {
            C0580h.m1926a("decode error", th);
            return str;
        }
    }
}
