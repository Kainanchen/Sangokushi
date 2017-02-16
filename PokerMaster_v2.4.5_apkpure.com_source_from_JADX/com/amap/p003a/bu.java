package com.amap.p003a;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.location.Location;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.SystemClock;
import android.support.v4.view.MotionEventCompat;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import android.util.Base64;
import com.amap.api.location.AMapLocation;
import com.autonavi.aps.amapapi.model.AMapLocationServer;
import com.sina.weibo.sdk.component.GameManager;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.tencent.android.tpush.common.Constants;
import java.io.File;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Hashtable;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import org.json.JSONObject;

/* compiled from: Utils */
/* renamed from: com.amap.a.bu */
public final class bu {
    private static int f510a;
    private static String[] f511b;
    private static Hashtable<String, Long> f512c;
    private static DecimalFormat f513d;
    private static SimpleDateFormat f514e;
    private static String[] f515f;

    static {
        f510a = 0;
        f511b = null;
        f512c = new Hashtable();
        f513d = null;
        f514e = null;
        f515f = new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
    }

    public static double m457a(double d) {
        return ((double) ((long) (d * 1000000.0d))) / 1000000.0d;
    }

    public static float m458a(AMapLocation aMapLocation, AMapLocation aMapLocation2) {
        return bu.m459a(new double[]{aMapLocation.getLatitude(), aMapLocation.getLongitude(), aMapLocation2.getLatitude(), aMapLocation2.getLongitude()});
    }

    public static float m459a(double[] dArr) {
        float[] fArr = new float[1];
        Location.distanceBetween(dArr[0], dArr[1], dArr[2], dArr[3], fArr);
        return fArr[0];
    }

    public static int m460a(int i) {
        return (i * 2) - 113;
    }

    public static int m461a(int i, int i2) {
        return new Random().nextInt((i2 - i) + 1) + i;
    }

    public static int m462a(NetworkInfo networkInfo) {
        return (networkInfo != null && networkInfo.isAvailable() && networkInfo.isConnected()) ? networkInfo.getType() : -1;
    }

    public static int m463a(boolean z, CellLocation cellLocation) {
        if (z || cellLocation == null) {
            return 9;
        }
        if (cellLocation instanceof GsmCellLocation) {
            return 1;
        }
        try {
            Class.forName("android.telephony.cdma.CdmaCellLocation");
            return 2;
        } catch (Throwable th) {
            bc.m330a(th, "Utils", "getCellLocT");
            return 9;
        }
    }

    public static long m464a() {
        return System.currentTimeMillis();
    }

    public static Object m465a(Context context, String str) {
        Object obj = null;
        if (context != null) {
            try {
                obj = context.getApplicationContext().getSystemService(str);
            } catch (Throwable th) {
                bc.m330a(th, "Utils", "getServ");
            }
        }
        return obj;
    }

    public static synchronized void m466a(Context context, int i) {
        synchronized (bu.class) {
            if (context != null) {
                try {
                    DBOperation dBOperation = new DBOperation(context, DBOperation.m675a(bi.class), bu.m502i());
                    Object beVar = new be();
                    beVar.f374a = i;
                    dBOperation.m683a(beVar, "_id=1");
                } catch (Throwable th) {
                    bc.m330a(th, "Utils", "getDBConfigVersion");
                }
            }
        }
    }

    public static synchronized boolean m467a(long j, long j2) {
        boolean z;
        synchronized (bu.class) {
            String str = "yyyyMMddHH";
            z = false;
            if (f514e == null) {
                try {
                    f514e = new SimpleDateFormat(str, Locale.CHINA);
                } catch (Throwable th) {
                    bc.m330a(th, "Utils", "isSameDay part1");
                }
            } else {
                f514e.applyPattern(str);
            }
            try {
                if (f514e != null) {
                    z = f514e.format(Long.valueOf(j)).equals(f514e.format(Long.valueOf(j2)));
                }
            } catch (Throwable th2) {
                bc.m330a(th2, "Utils", "isSameHour");
            }
        }
        return z;
    }

    public static boolean m468a(Context context) {
        if (context == null) {
            return false;
        }
        try {
            return bu.m485c() < 17 ? bu.m490c(context, "android.provider.Settings$System") : bu.m490c(context, "android.provider.Settings$Global");
        } catch (Throwable th) {
            return false;
        }
    }

    public static boolean m469a(ScanResult scanResult) {
        return (scanResult == null || TextUtils.isEmpty(scanResult.BSSID) || scanResult.BSSID.equals("00:00:00:00:00:00") || scanResult.BSSID.contains(" :")) ? false : true;
    }

    public static boolean m470a(AMapLocation aMapLocation) {
        return (aMapLocation != null && aMapLocation.getErrorCode() == 0) ? bu.m483b(aMapLocation) : false;
    }

    public static boolean m471a(AMapLocationServer aMapLocationServer) {
        return (aMapLocationServer == null || aMapLocationServer.m790c().equals("8") || aMapLocationServer.m790c().equals("5") || aMapLocationServer.m790c().equals("6")) ? false : bu.m483b((AMapLocation) aMapLocationServer);
    }

    public static boolean m472a(String str) {
        return (!TextUtils.isEmpty(str) && TextUtils.isDigitsOnly(str)) ? ",111,123,134,199,202,204,206,208,212,213,214,216,218,219,220,222,225,226,228,230,231,232,234,235,238,240,242,244,246,247,248,250,255,257,259,260,262,266,268,270,272,274,276,278,280,282,283,284,286,288,289,290,292,293,294,295,297,302,308,310,311,312,313,314,315,316,310,330,332,334,338,340,342,344,346,348,350,352,354,356,358,360,362,363,364,365,366,368,370,372,374,376,400,401,402,404,405,406,410,412,413,414,415,416,417,418,419,420,421,422,424,425,426,427,428,429,430,431,432,434,436,437,438,440,441,450,452,454,455,456,457,466,467,470,472,502,505,510,514,515,520,525,528,530,534,535,536,537,539,540,541,542,543,544,545,546,547,548,549,550,551,552,553,555,560,598,602,603,604,605,606,607,608,609,610,611,612,613,614,615,616,617,618,619,620,621,622,623,624,625,626,627,628,629,630,631,632,633,634,635,636,637,638,639,640,641,642,643,645,646,647,648,649,650,651,652,653,654,655,657,659,665,702,704,706,708,710,712,714,716,722,724,730,732,734,736,738,740,742,744,746,748,750,850,901,".contains("," + str + ",") : false;
    }

    public static boolean m473a(JSONObject jSONObject, String str) {
        return ck.m622a(jSONObject, str);
    }

    public static byte[] m474a(long j) {
        byte[] bArr = new byte[8];
        for (int i = 0; i < 8; i++) {
            bArr[i] = (byte) ((int) ((j >> (i * 8)) & 255));
        }
        return bArr;
    }

    public static byte[] m475a(byte[] bArr) {
        byte[] bArr2 = null;
        try {
            bArr2 = ck.m628b(bArr);
        } catch (Throwable th) {
            bc.m330a(th, "Utils", "gz");
        }
        return bArr2;
    }

    public static String[] m476a(TelephonyManager telephonyManager) {
        int parseInt;
        Object obj = null;
        if (telephonyManager != null) {
            obj = telephonyManager.getNetworkOperator();
        }
        String[] strArr = new String[]{"0", "0"};
        int i = TextUtils.isEmpty(obj) ? 0 : !TextUtils.isDigitsOnly(obj) ? 0 : obj.length() <= 4 ? 0 : 1;
        if (i != 0) {
            strArr[0] = obj.substring(0, 3);
            char[] toCharArray = obj.substring(3).toCharArray();
            i = 0;
            while (i < toCharArray.length && Character.isDigit(toCharArray[i])) {
                i++;
            }
            strArr[1] = obj.substring(3, i + 3);
        }
        try {
            parseInt = Integer.parseInt(strArr[0]);
        } catch (Throwable th) {
            bc.m330a(th, "Utils", "getMccMnc");
            parseInt = 0;
        }
        if (parseInt == 0) {
            strArr[0] = "0";
        }
        if (strArr[0].equals("0") || strArr[1].equals("0")) {
            return (strArr[0].equals("0") && strArr[1].equals("0") && f511b != null) ? f511b : strArr;
        } else {
            f511b = strArr;
            return strArr;
        }
    }

    public static long m477b() {
        return SystemClock.elapsedRealtime();
    }

    public static String m478b(Context context) {
        CharSequence charSequence = null;
        if (!TextUtils.isEmpty(bc.f352f)) {
            return bc.f352f;
        }
        if (context == null) {
            return null;
        }
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 64);
        } catch (Throwable th) {
            bc.m330a(th, "Utils", "getAppName part");
            packageInfo = null;
        }
        try {
            if (TextUtils.isEmpty(bc.f353g)) {
                bc.f353g = null;
            }
        } catch (Throwable th2) {
            bc.m330a(th2, "Utils", "getAppName");
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (packageInfo != null) {
            if (packageInfo.applicationInfo != null) {
                charSequence = packageInfo.applicationInfo.loadLabel(context.getPackageManager());
            }
            if (charSequence != null) {
                stringBuilder.append(charSequence.toString());
            }
            if (!TextUtils.isEmpty(packageInfo.versionName)) {
                stringBuilder.append(packageInfo.versionName);
            }
        }
        Object c = cb.m520c(context);
        if (!TextUtils.isEmpty(c)) {
            stringBuilder.append(",").append(c);
        }
        if (!TextUtils.isEmpty(bc.f353g)) {
            stringBuilder.append(",").append(bc.f353g);
        }
        String stringBuilder2 = stringBuilder.toString();
        bc.f352f = stringBuilder2;
        return stringBuilder2;
    }

    public static String m479b(TelephonyManager telephonyManager) {
        int i = 0;
        if (telephonyManager != null) {
            i = telephonyManager.getNetworkType();
        }
        return (String) bc.f359m.get(i, "UNKWN");
    }

    public static String m480b(String str) {
        return bu.m497f(str);
    }

    public static synchronized boolean m481b(long j, long j2) {
        boolean z;
        synchronized (bu.class) {
            String str = "yyyyMMdd";
            z = false;
            if (f514e == null) {
                try {
                    f514e = new SimpleDateFormat(str, Locale.CHINA);
                } catch (Throwable th) {
                    bc.m330a(th, "Utils", "isSameDay part1");
                }
            } else {
                f514e.applyPattern(str);
            }
            try {
                if (f514e != null) {
                    z = f514e.format(Long.valueOf(j)).equals(f514e.format(Long.valueOf(j2)));
                }
            } catch (Throwable th2) {
                bc.m330a(th2, "Utils", "isSameDay");
            }
        }
        return z;
    }

    public static synchronized boolean m482b(Context context, String str) {
        boolean z = false;
        synchronized (bu.class) {
            try {
                if (context.getPackageManager().getPackageInfo(str, 0) != null) {
                    z = true;
                }
            } catch (Throwable th) {
            }
        }
        return z;
    }

    private static boolean m483b(AMapLocation aMapLocation) {
        double longitude = aMapLocation.getLongitude();
        double latitude = aMapLocation.getLatitude();
        return !(longitude == 0.0d && latitude == 0.0d && ((double) aMapLocation.getAccuracy()) == 0.0d) && longitude <= 180.0d && latitude <= 90.0d && longitude >= -180.0d && latitude >= -90.0d;
    }

    public static byte[] m484b(int i) {
        byte[] bArr = new byte[2];
        for (int i2 = 0; i2 < 2; i2++) {
            bArr[i2] = (byte) ((i >> (i2 * 8)) & MotionEventCompat.ACTION_MASK);
        }
        return bArr;
    }

    public static int m485c() {
        if (f510a > 0) {
            return f510a;
        }
        int i = 0;
        String str = "android.os.Build$VERSION";
        try {
            return bp.m430b(str, "SDK_INT");
        } catch (Throwable th) {
            return i;
        }
    }

    public static NetworkInfo m486c(Context context) {
        NetworkInfo networkInfo = null;
        try {
            networkInfo = ce.m564n(context);
        } catch (Throwable th) {
            bc.m330a(th, "Utils", "getNetWorkInfo");
        }
        return networkInfo;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.lang.String m487c(int r2) {
        /*
        r1 = com.amap.p003a.bu.class;
        monitor-enter(r1);
        r0 = "\u5176\u4ed6\u9519\u8bef";
        switch(r2) {
            case 0: goto L_0x000a;
            case 1: goto L_0x000d;
            case 2: goto L_0x0010;
            case 3: goto L_0x0013;
            case 4: goto L_0x0016;
            case 5: goto L_0x0019;
            case 6: goto L_0x001c;
            case 7: goto L_0x001f;
            case 8: goto L_0x0022;
            case 9: goto L_0x0025;
            case 10: goto L_0x0028;
            case 11: goto L_0x002e;
            case 12: goto L_0x002b;
            case 13: goto L_0x0031;
            default: goto L_0x0008;
        };
    L_0x0008:
        monitor-exit(r1);
        return r0;
    L_0x000a:
        r0 = "success";
        goto L_0x0008;
    L_0x000d:
        r0 = "\u91cd\u8981\u53c2\u6570\u4e3a\u7a7a";
        goto L_0x0008;
    L_0x0010:
        r0 = "WIFI\u4fe1\u606f\u4e0d\u8db3";
        goto L_0x0008;
    L_0x0013:
        r0 = "\u8bf7\u6c42\u53c2\u6570\u83b7\u53d6\u51fa\u73b0\u5f02\u5e38";
        goto L_0x0008;
    L_0x0016:
        r0 = "\u7f51\u7edc\u8fde\u63a5\u5f02\u5e38";
        goto L_0x0008;
    L_0x0019:
        r0 = "\u89e3\u6790\u6570\u636e\u5f02\u5e38";
        goto L_0x0008;
    L_0x001c:
        r0 = "\u5b9a\u4f4d\u7ed3\u679c\u9519\u8bef";
        goto L_0x0008;
    L_0x001f:
        r0 = "KEY\u9519\u8bef";
        goto L_0x0008;
    L_0x0022:
        r0 = "\u5176\u4ed6\u9519\u8bef";
        goto L_0x0008;
    L_0x0025:
        r0 = "\u521d\u59cb\u5316\u5f02\u5e38";
        goto L_0x0008;
    L_0x0028:
        r0 = "\u5b9a\u4f4d\u670d\u52a1\u542f\u52a8\u5931\u8d25";
        goto L_0x0008;
    L_0x002b:
        r0 = "\u7f3a\u5c11\u5b9a\u4f4d\u6743\u9650";
        goto L_0x0008;
    L_0x002e:
        r0 = "\u9519\u8bef\u7684\u57fa\u7ad9\u4fe1\u606f\uff0c\u8bf7\u68c0\u67e5\u662f\u5426\u63d2\u5165SIM\u5361";
        goto L_0x0008;
    L_0x0031:
        r0 = "\u7f51\u7edc\u5b9a\u4f4d\u5931\u8d25\uff0c\u8bf7\u68c0\u67e5\u8bbe\u5907\u662f\u5426\u63d2\u5165sim\u5361\uff0c\u662f\u5426\u5f00\u542f\u79fb\u52a8\u7f51\u7edc\u6216\u5f00\u542f\u4e86wifi\u6a21\u5757";
        goto L_0x0008;
    L_0x0034:
        r0 = move-exception;
        monitor-exit(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.a.bu.c(int):java.lang.String");
    }

    public static String m488c(String str) {
        if (str == null || str.length() == 0) {
            return LetterIndexBar.SEARCH_ICON_LETTER;
        }
        try {
            return new String(Base64.decode(str, 0), GameManager.DEFAULT_CHARSET);
        } catch (Throwable th) {
            bc.m330a(th, "Utils", "base642Str");
            return null;
        }
    }

    public static synchronized boolean m489c(long j, long j2) {
        boolean z = true;
        boolean z2 = false;
        synchronized (bu.class) {
            if (bu.m481b(j, j2)) {
                Calendar instance = Calendar.getInstance(Locale.CHINA);
                instance.setTimeInMillis(j);
                int i = instance.get(11);
                instance.setTimeInMillis(j2);
                int i2 = instance.get(11);
                if (i <= 12 ? i2 <= 12 : i2 > 12) {
                    z = false;
                }
                z2 = z;
            }
        }
        return z2;
    }

    private static boolean m490c(Context context, String str) {
        ContentResolver contentResolver = context.getContentResolver();
        String str2 = ((String) bp.m427a(str, "AIRPLANE_MODE_ON")).toString();
        return ((Integer) bp.m428a(str, "getInt", new Object[]{contentResolver, str2}, new Class[]{ContentResolver.class, String.class})).intValue() == 1;
    }

    public static String m491d() {
        return Build.MODEL;
    }

    public static boolean m492d(Context context) {
        try {
            for (RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService(Constants.FLAG_ACTIVITY_NAME)).getRunningAppProcesses()) {
                if (runningAppProcessInfo.processName.equals(context.getPackageName())) {
                    return runningAppProcessInfo.importance != 100;
                }
            }
            return false;
        } catch (Throwable th) {
            bc.m330a(th, "Utils", "isApplicationBroughtToBackground");
            return true;
        }
    }

    public static byte[] m493d(String str) {
        return bu.m484b(Integer.parseInt(str));
    }

    public static synchronized int m494e(Context context) {
        int i;
        synchronized (bu.class) {
            try {
                List a = new DBOperation(context, DBOperation.m675a(bi.class), bu.m502i()).m681a("_id=1", be.class, false);
                if (a.size() > 0) {
                    i = ((be) a.get(0)).f374a;
                }
            } catch (Throwable th) {
                bc.m330a(th, "Utils", "getDBConfigVersion");
            }
            i = -1;
        }
        return i;
    }

    public static String m495e() {
        return VERSION.RELEASE;
    }

    public static byte[] m496e(String str) {
        int parseInt = Integer.parseInt(str);
        byte[] bArr = new byte[4];
        for (int i = 0; i < 4; i++) {
            bArr[i] = (byte) ((parseInt >> (i * 8)) & MotionEventCompat.ACTION_MASK);
        }
        return bArr;
    }

    private static String m497f(String str) {
        byte[] bArr = null;
        try {
            bArr = str.getBytes(GameManager.DEFAULT_CHARSET);
        } catch (Throwable th) {
            bc.m330a(th, "Utils", "str2Base64");
        }
        return Base64.encodeToString(bArr, 0);
    }

    public static boolean m498f() {
        return bu.m461a(0, 1) == 1;
    }

    public static synchronized boolean m499f(Context context) {
        boolean z = false;
        synchronized (bu.class) {
            if (VERSION.SDK_INT < 23 || context.getApplicationInfo().targetSdkVersion < 23) {
                for (String checkCallingOrSelfPermission : f515f) {
                    if (context.checkCallingOrSelfPermission(checkCallingOrSelfPermission) != 0) {
                        break;
                    }
                }
                z = true;
            } else {
                Application application = (Application) context;
                for (Object obj : f515f) {
                    int b;
                    try {
                        b = bp.m429b(application.getBaseContext(), "checkSelfPermission", obj);
                    } catch (Throwable th) {
                        b = 0;
                    }
                    if (b != 0) {
                        break;
                    }
                }
                z = true;
            }
        }
        return z;
    }

    public static void m500g() {
        f512c.clear();
    }

    public static String m501h() {
        try {
            return cf.m577a("S128DF1572465B890OE3F7A13167KLEI".getBytes(GameManager.DEFAULT_CHARSET)).substring(20);
        } catch (Throwable th) {
            return LetterIndexBar.SEARCH_ICON_LETTER;
        }
    }

    public static String m502i() {
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(Environment.getExternalStorageDirectory().getAbsolutePath()).append(File.separator);
        stringBuilder.append("amap").append(File.separator);
        stringBuilder.append("openamaplocationsdk").append(File.separator);
        return stringBuilder.toString();
    }
}
