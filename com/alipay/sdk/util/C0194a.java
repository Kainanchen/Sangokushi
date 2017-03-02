package com.alipay.sdk.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.tencent.connect.common.Constants;

/* renamed from: com.alipay.sdk.util.a */
public final class C0194a {
    private static final String f474b = "00:00:00:00:00:00";
    private static C0194a f475e;
    public String f476a;
    private String f477c;
    private String f478d;

    static {
        f475e = null;
    }

    public static C0194a m628a(Context context) {
        if (f475e == null) {
            f475e = new C0194a(context);
        }
        return f475e;
    }

    private C0194a(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            m631b(telephonyManager.getDeviceId());
            String subscriberId = telephonyManager.getSubscriberId();
            if (subscriberId != null) {
                subscriberId = (subscriberId + "000000000000000").substring(0, 15);
            }
            this.f477c = subscriberId;
            this.f476a = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo().getMacAddress();
            if (TextUtils.isEmpty(this.f476a)) {
                this.f476a = f474b;
            }
        } catch (Exception e) {
            e.printStackTrace();
            if (TextUtils.isEmpty(this.f476a)) {
                this.f476a = f474b;
            }
        } catch (Throwable th) {
            if (TextUtils.isEmpty(this.f476a)) {
                this.f476a = f474b;
            }
        }
    }

    public final String m636a() {
        if (TextUtils.isEmpty(this.f477c)) {
            this.f477c = "000000000000000";
        }
        return this.f477c;
    }

    public final String m637b() {
        if (TextUtils.isEmpty(this.f478d)) {
            this.f478d = "000000000000000";
        }
        return this.f478d;
    }

    private void m629a(String str) {
        if (str != null) {
            str = (str + "000000000000000").substring(0, 15);
        }
        this.f477c = str;
    }

    private void m631b(String str) {
        if (str != null) {
            byte[] bytes = str.getBytes();
            int i = 0;
            while (i < bytes.length) {
                if (bytes[i] < (byte) 48 || bytes[i] > 57) {
                    bytes[i] = (byte) 48;
                }
                i++;
            }
            str = (new String(bytes) + "000000000000000").substring(0, 15);
        }
        this.f478d = str;
    }

    private String m632c() {
        String str = m637b() + "|";
        Object a = m636a();
        if (TextUtils.isEmpty(a)) {
            return str + "000000000000000";
        }
        return str + a;
    }

    private String m634d() {
        return this.f476a;
    }

    public static C0197d m630b(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.getType() == 0) {
                return C0197d.m650a(activeNetworkInfo.getSubtype());
            }
            if (activeNetworkInfo == null || activeNetworkInfo.getType() != 1) {
                return C0197d.NONE;
            }
            return C0197d.WIFI;
        } catch (Exception e) {
            return C0197d.NONE;
        }
    }

    public static String m633c(Context context) {
        C0194a a = C0194a.m628a(context);
        String str = a.m637b() + "|";
        Object a2 = a.m636a();
        return (TextUtils.isEmpty(a2) ? str + "000000000000000" : str + a2).substring(0, 8);
    }

    public static String m635d(Context context) {
        if (context == null) {
            return Constants.STR_EMPTY;
        }
        try {
            return context.getResources().getConfiguration().locale.toString();
        } catch (Throwable th) {
            return Constants.STR_EMPTY;
        }
    }
}
