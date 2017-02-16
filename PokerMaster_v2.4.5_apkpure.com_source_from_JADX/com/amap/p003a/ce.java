package com.amap.p003a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.os.Environment;
import android.provider.Settings.System;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.sina.weibo.sdk.register.mobile.SelectCountryActivity;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

/* compiled from: DeviceInfo */
/* renamed from: com.amap.a.ce */
public final class ce {
    private static String f603a;
    private static boolean f604b;
    private static String f605c;
    private static String f606d;
    private static String f607e;
    private static String f608f;

    /* renamed from: com.amap.a.ce.a */
    static class DeviceInfo extends DefaultHandler {
        DeviceInfo() {
        }

        public final void characters(char[] cArr, int i, int i2) {
            if (ce.f604b) {
                ce.f603a = new String(cArr, i, i2);
            }
        }

        public final void endElement(String str, String str2, String str3) {
            ce.f604b = false;
        }

        public final void startElement(String str, String str2, String str3, Attributes attributes) {
            if (str2.equals("string") && "UTDID".equals(attributes.getValue(SelectCountryActivity.EXTRA_COUNTRY_NAME))) {
                ce.f604b = true;
            }
        }
    }

    static {
        f603a = LetterIndexBar.SEARCH_ICON_LETTER;
        f604b = false;
        f605c = LetterIndexBar.SEARCH_ICON_LETTER;
        f606d = LetterIndexBar.SEARCH_ICON_LETTER;
        f607e = LetterIndexBar.SEARCH_ICON_LETTER;
        f608f = LetterIndexBar.SEARCH_ICON_LETTER;
    }

    public static String m545a(Context context) {
        try {
            return ce.m571u(context);
        } catch (Throwable th) {
            th.printStackTrace();
            return LetterIndexBar.SEARCH_ICON_LETTER;
        }
    }

    private static List<ScanResult> m547a(List<ScanResult> list) {
        int size = list.size();
        for (int i = 0; i < size - 1; i++) {
            for (int i2 = 1; i2 < size - i; i2++) {
                if (((ScanResult) list.get(i2 - 1)).level > ((ScanResult) list.get(i2)).level) {
                    ScanResult scanResult = (ScanResult) list.get(i2 - 1);
                    list.set(i2 - 1, list.get(i2));
                    list.set(i2, scanResult);
                }
            }
        }
        return list;
    }

    public static void m548a() {
        try {
            if (VERSION.SDK_INT > 14) {
                TrafficStats.class.getDeclaredMethod("setThreadStatsTag", new Class[]{Integer.TYPE}).invoke(null, new Object[]{Integer.valueOf(40964)});
            }
        } catch (Throwable th) {
            cm.m637a(th, "DeviceInfo", "setTraficTag");
        }
    }

    private static boolean m549a(Context context, String str) {
        return context != null && context.checkCallingOrSelfPermission(str) == 0;
    }

    public static String m551b(Context context) {
        String str = LetterIndexBar.SEARCH_ICON_LETTER;
        try {
            String str2 = LetterIndexBar.SEARCH_ICON_LETTER;
            String r = ce.m568r(context);
            return (r == null || r.length() < 5) ? str2 : r.substring(3, 5);
        } catch (Throwable th) {
            th.printStackTrace();
            return str;
        }
    }

    public static int m553c(Context context) {
        try {
            return ce.m574x(context);
        } catch (Throwable th) {
            th.printStackTrace();
            return -1;
        }
    }

    public static int m554d(Context context) {
        try {
            return ce.m572v(context);
        } catch (Throwable th) {
            th.printStackTrace();
            return -1;
        }
    }

    public static String m555e(Context context) {
        try {
            return ce.m570t(context);
        } catch (Throwable th) {
            th.printStackTrace();
            return LetterIndexBar.SEARCH_ICON_LETTER;
        }
    }

    public static String m556f(Context context) {
        try {
            if (f603a != null && !LetterIndexBar.SEARCH_ICON_LETTER.equals(f603a)) {
                return f603a;
            }
            if (ce.m549a(context, "android.permission.WRITE_SETTINGS")) {
                f603a = System.getString(context.getContentResolver(), "mqBRboGZkQPcAkyk");
            }
            if (!(f603a == null || LetterIndexBar.SEARCH_ICON_LETTER.equals(f603a))) {
                return f603a;
            }
            try {
                if ("mounted".equals(Environment.getExternalStorageState())) {
                    File file = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/.UTSystemConfig/Global/Alvin2.xml");
                    if (file.exists()) {
                        SAXParserFactory.newInstance().newSAXParser().parse(file, new DeviceInfo());
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (Throwable th) {
                cm.m637a(th, "DeviceInfo", "getUTDID");
            }
            return f603a == null ? LetterIndexBar.SEARCH_ICON_LETTER : f603a;
        } catch (Throwable th2) {
            cm.m637a(th2, "DeviceInfo", "getUTDID");
        }
    }

    static String m557g(Context context) {
        String str = LetterIndexBar.SEARCH_ICON_LETTER;
        if (context == null) {
            return str;
        }
        try {
            if (!ce.m549a(context, "android.permission.ACCESS_WIFI_STATE")) {
                return str;
            }
            WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
            if (wifiManager == null) {
                return str;
            }
            String bssid;
            if (wifiManager.isWifiEnabled()) {
                bssid = wifiManager.getConnectionInfo().getBSSID();
                return bssid;
            }
            bssid = str;
            return bssid;
        } catch (Throwable th) {
            cm.m637a(th, "DeviceInfo", "getWifiMacs");
        }
    }

    static String m558h(Context context) {
        StringBuilder stringBuilder = new StringBuilder();
        if (context != null) {
            try {
                if (ce.m549a(context, "android.permission.ACCESS_WIFI_STATE")) {
                    WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
                    if (wifiManager == null) {
                        return LetterIndexBar.SEARCH_ICON_LETTER;
                    }
                    if (wifiManager.isWifiEnabled()) {
                        List scanResults = wifiManager.getScanResults();
                        if (scanResults == null || scanResults.size() == 0) {
                            return stringBuilder.toString();
                        }
                        List a = ce.m547a(scanResults);
                        Object obj = 1;
                        int i = 0;
                        while (i < a.size() && i < 7) {
                            ScanResult scanResult = (ScanResult) a.get(i);
                            if (obj != null) {
                                obj = null;
                            } else {
                                stringBuilder.append(";");
                            }
                            stringBuilder.append(scanResult.BSSID);
                            i++;
                        }
                    }
                    return stringBuilder.toString();
                }
            } catch (Throwable th) {
                cm.m637a(th, "DeviceInfo", "getWifiMacs");
            }
        }
        return stringBuilder.toString();
    }

    public static String m559i(Context context) {
        try {
            if (f605c != null && !LetterIndexBar.SEARCH_ICON_LETTER.equals(f605c)) {
                return f605c;
            }
            if (!ce.m549a(context, "android.permission.ACCESS_WIFI_STATE")) {
                return f605c;
            }
            WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
            if (wifiManager == null) {
                return LetterIndexBar.SEARCH_ICON_LETTER;
            }
            f605c = wifiManager.getConnectionInfo().getMacAddress();
            return f605c;
        } catch (Throwable th) {
            cm.m637a(th, "DeviceInfo", "getDeviceMac");
        }
    }

    static String[] m560j(Context context) {
        try {
            if (ce.m549a(context, "android.permission.READ_PHONE_STATE") && ce.m549a(context, "android.permission.ACCESS_COARSE_LOCATION")) {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager == null) {
                    return new String[]{LetterIndexBar.SEARCH_ICON_LETTER, LetterIndexBar.SEARCH_ICON_LETTER};
                }
                CellLocation cellLocation = telephonyManager.getCellLocation();
                int cid;
                int lac;
                if (cellLocation instanceof GsmCellLocation) {
                    GsmCellLocation gsmCellLocation = (GsmCellLocation) cellLocation;
                    cid = gsmCellLocation.getCid();
                    lac = gsmCellLocation.getLac();
                    return new String[]{lac + "||" + cid, "gsm"};
                }
                if (cellLocation instanceof CdmaCellLocation) {
                    CdmaCellLocation cdmaCellLocation = (CdmaCellLocation) cellLocation;
                    cid = cdmaCellLocation.getSystemId();
                    lac = cdmaCellLocation.getNetworkId();
                    int baseStationId = cdmaCellLocation.getBaseStationId();
                    return new String[]{cid + "||" + lac + "||" + baseStationId, "cdma"};
                }
                return new String[]{LetterIndexBar.SEARCH_ICON_LETTER, LetterIndexBar.SEARCH_ICON_LETTER};
            }
            return new String[]{LetterIndexBar.SEARCH_ICON_LETTER, LetterIndexBar.SEARCH_ICON_LETTER};
        } catch (Throwable th) {
            cm.m637a(th, "DeviceInfo", "cellInfo");
        }
    }

    static String m561k(Context context) {
        String str = LetterIndexBar.SEARCH_ICON_LETTER;
        try {
            if (!ce.m549a(context, "android.permission.READ_PHONE_STATE")) {
                return str;
            }
            TelephonyManager y = ce.m575y(context);
            if (y == null) {
                return LetterIndexBar.SEARCH_ICON_LETTER;
            }
            String networkOperator = y.getNetworkOperator();
            return (TextUtils.isEmpty(networkOperator) || networkOperator.length() < 3) ? str : networkOperator.substring(3);
        } catch (Throwable th) {
            cm.m637a(th, "DeviceInfo", "getMNC");
            return str;
        }
    }

    public static int m562l(Context context) {
        try {
            return ce.m574x(context);
        } catch (Throwable th) {
            cm.m637a(th, "DeviceInfo", "getNetWorkType");
            return -1;
        }
    }

    public static int m563m(Context context) {
        try {
            return ce.m572v(context);
        } catch (Throwable th) {
            cm.m637a(th, "DeviceInfo", "getActiveNetWorkType");
            return -1;
        }
    }

    public static NetworkInfo m564n(Context context) {
        if (!ce.m549a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return null;
        }
        ConnectivityManager w = ce.m573w(context);
        return w != null ? w.getActiveNetworkInfo() : null;
    }

    static String m565o(Context context) {
        String str = null;
        try {
            NetworkInfo n = ce.m564n(context);
            if (n != null) {
                str = n.getExtraInfo();
            }
        } catch (Throwable th) {
            cm.m637a(th, "DeviceInfo", "getNetworkExtraInfo");
        }
        return str;
    }

    static String m566p(Context context) {
        try {
            if (f606d != null && !LetterIndexBar.SEARCH_ICON_LETTER.equals(f606d)) {
                return f606d;
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager == null) {
                return LetterIndexBar.SEARCH_ICON_LETTER;
            }
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            f606d = i2 > i ? i + "*" + i2 : i2 + "*" + i;
            return f606d;
        } catch (Throwable th) {
            cm.m637a(th, "DeviceInfo", "getReslution");
        }
    }

    public static String m567q(Context context) {
        try {
            if (f607e != null && !LetterIndexBar.SEARCH_ICON_LETTER.equals(f607e)) {
                return f607e;
            }
            if (!ce.m549a(context, "android.permission.READ_PHONE_STATE")) {
                return f607e;
            }
            TelephonyManager y = ce.m575y(context);
            if (y == null) {
                return LetterIndexBar.SEARCH_ICON_LETTER;
            }
            String deviceId = y.getDeviceId();
            f607e = deviceId;
            if (deviceId == null) {
                f607e = LetterIndexBar.SEARCH_ICON_LETTER;
            }
            return f607e;
        } catch (Throwable th) {
            cm.m637a(th, "DeviceInfo", "getDeviceID");
        }
    }

    public static String m568r(Context context) {
        String str = LetterIndexBar.SEARCH_ICON_LETTER;
        try {
            str = ce.m570t(context);
        } catch (Throwable th) {
            cm.m637a(th, "DeviceInfo", "getSubscriberId");
        }
        return str;
    }

    static String m569s(Context context) {
        try {
            return ce.m571u(context);
        } catch (Throwable th) {
            cm.m637a(th, "DeviceInfo", "getNetworkOperatorName");
            return LetterIndexBar.SEARCH_ICON_LETTER;
        }
    }

    private static String m570t(Context context) {
        if (f608f != null && !LetterIndexBar.SEARCH_ICON_LETTER.equals(f608f)) {
            return f608f;
        }
        if (!ce.m549a(context, "android.permission.READ_PHONE_STATE")) {
            return f608f;
        }
        TelephonyManager y = ce.m575y(context);
        if (y == null) {
            return LetterIndexBar.SEARCH_ICON_LETTER;
        }
        String subscriberId = y.getSubscriberId();
        f608f = subscriberId;
        if (subscriberId == null) {
            f608f = LetterIndexBar.SEARCH_ICON_LETTER;
        }
        return f608f;
    }

    private static String m571u(Context context) {
        if (!ce.m549a(context, "android.permission.READ_PHONE_STATE")) {
            return null;
        }
        TelephonyManager y = ce.m575y(context);
        if (y == null) {
            return LetterIndexBar.SEARCH_ICON_LETTER;
        }
        Object simOperatorName = y.getSimOperatorName();
        return TextUtils.isEmpty(simOperatorName) ? y.getNetworkOperatorName() : simOperatorName;
    }

    private static int m572v(Context context) {
        if (context == null || !ce.m549a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return -1;
        }
        ConnectivityManager w = ce.m573w(context);
        if (w == null) {
            return -1;
        }
        NetworkInfo activeNetworkInfo = w.getActiveNetworkInfo();
        return activeNetworkInfo != null ? activeNetworkInfo.getType() : -1;
    }

    private static ConnectivityManager m573w(Context context) {
        return (ConnectivityManager) context.getSystemService("connectivity");
    }

    private static int m574x(Context context) {
        if (!ce.m549a(context, "android.permission.READ_PHONE_STATE")) {
            return -1;
        }
        TelephonyManager y = ce.m575y(context);
        return y != null ? y.getNetworkType() : -1;
    }

    private static TelephonyManager m575y(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }
}
