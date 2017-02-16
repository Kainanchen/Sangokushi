package com.tencent.p080b.p081a.p083b;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.util.Log;
import com.sina.weibo.sdk.component.GameManager;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.tencent.b.a.b.r */
public final class C1055r {
    private static String f8101a;

    static {
        f8101a = LetterIndexBar.SEARCH_ICON_LETTER;
    }

    public static String m5735a(Context context) {
        try {
            if (C1055r.m5738a(context, "android.permission.READ_PHONE_STATE")) {
                String deviceId = ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
                if (deviceId != null) {
                    return deviceId;
                }
            }
            Log.e("MtaSDK", "Could not get permission of android.permission.READ_PHONE_STATE");
        } catch (Throwable th) {
            Log.e("MtaSDK", "get device id error", th);
        }
        return null;
    }

    public static String m5736a(String str) {
        if (str == null) {
            return null;
        }
        if (VERSION.SDK_INT < 8) {
            return str;
        }
        try {
            return new String(C1044g.m5677b(C1045h.m5678a(str.getBytes(GameManager.DEFAULT_CHARSET))), GameManager.DEFAULT_CHARSET);
        } catch (Throwable th) {
            Log.e("MtaSDK", "decode error", th);
            return str;
        }
    }

    public static void m5737a(JSONObject jSONObject, String str, String str2) {
        if (str2 != null) {
            try {
                if (str2.length() > 0) {
                    jSONObject.put(str, str2);
                }
            } catch (Throwable th) {
                Log.e("MtaSDK", "jsonPut error", th);
            }
        }
    }

    public static boolean m5738a(Context context, String str) {
        try {
            return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
        } catch (Throwable th) {
            Log.e("MtaSDK", "checkPermission error", th);
            return false;
        }
    }

    public static String m5739b(Context context) {
        if (C1055r.m5738a(context, "android.permission.ACCESS_WIFI_STATE")) {
            try {
                WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
                return wifiManager == null ? LetterIndexBar.SEARCH_ICON_LETTER : wifiManager.getConnectionInfo().getMacAddress();
            } catch (Throwable e) {
                Log.e("MtaSDK", "get wifi address error", e);
                return LetterIndexBar.SEARCH_ICON_LETTER;
            }
        }
        Log.e("MtaSDK", "Could not get permission of android.permission.ACCESS_WIFI_STATE");
        return LetterIndexBar.SEARCH_ICON_LETTER;
    }

    public static String m5740b(String str) {
        if (str == null) {
            return null;
        }
        if (VERSION.SDK_INT < 8) {
            return str;
        }
        try {
            return new String(C1045h.m5679b(C1044g.m5675a(str.getBytes(GameManager.DEFAULT_CHARSET))), GameManager.DEFAULT_CHARSET);
        } catch (Throwable th) {
            Log.e("MtaSDK", "encode error", th);
            return str;
        }
    }

    public static String m5741c(Context context) {
        try {
            WifiInfo g = C1055r.m5745g(context);
            if (g != null) {
                return g.getBSSID();
            }
        } catch (Throwable th) {
            Log.e("MtaSDK", "encode error", th);
        }
        return null;
    }

    public static String m5742d(Context context) {
        try {
            WifiInfo g = C1055r.m5745g(context);
            if (g != null) {
                return g.getSSID();
            }
        } catch (Throwable th) {
            Log.e("MtaSDK", "encode error", th);
        }
        return null;
    }

    public static boolean m5743e(Context context) {
        try {
            if (C1055r.m5738a(context, "android.permission.INTERNET") && C1055r.m5738a(context, "android.permission.ACCESS_NETWORK_STATE")) {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                        return true;
                    }
                    Log.w("MtaSDK", "Network error");
                    return false;
                }
                return false;
            }
            Log.e("MtaSDK", "can not get the permisson of android.permission.INTERNET");
            return false;
        } catch (Throwable th) {
            Log.e("MtaSDK", "isNetworkAvailable error", th);
        }
    }

    public static JSONArray m5744f(Context context) {
        try {
            if (C1055r.m5738a(context, "android.permission.INTERNET") && C1055r.m5738a(context, "android.permission.ACCESS_NETWORK_STATE")) {
                WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
                if (wifiManager != null) {
                    List scanResults = wifiManager.getScanResults();
                    if (scanResults != null && scanResults.size() > 0) {
                        Collections.sort(scanResults, new C1056s());
                        JSONArray jSONArray = new JSONArray();
                        int i = 0;
                        while (i < scanResults.size() && i < 10) {
                            ScanResult scanResult = (ScanResult) scanResults.get(i);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("bs", scanResult.BSSID);
                            jSONObject.put("ss", scanResult.SSID);
                            jSONArray.put(jSONObject);
                            i++;
                        }
                        return jSONArray;
                    }
                }
                return null;
            }
            Log.e("MtaSDK", "can not get the permisson of android.permission.INTERNET");
            return null;
        } catch (Throwable th) {
            Log.e("MtaSDK", "isWifiNet error", th);
        }
    }

    private static WifiInfo m5745g(Context context) {
        if (C1055r.m5738a(context, "android.permission.ACCESS_WIFI_STATE")) {
            WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
            if (wifiManager != null) {
                return wifiManager.getConnectionInfo();
            }
        }
        return null;
    }
}
