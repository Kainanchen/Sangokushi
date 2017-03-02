package com.tencent.wxop.stat.common;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowManager;
import com.igexin.download.Downloads;
import com.igexin.getuiext.data.Consts;
import com.loopj.android.http.AsyncHttpClient;
import com.tencent.connect.common.Constants;
import com.tencent.wxop.stat.StatConfig;
import com.tencent.wxop.stat.StatSpecifyReportedInfo;
import com.ut.device.AidConstants;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.zip.GZIPInputStream;
import org.apache.http.HttpHost;
import org.json.JSONObject;

/* renamed from: com.tencent.wxop.stat.common.k */
public class C0639k {
    private static String f2044a;
    private static String f2045b;
    private static String f2046c;
    private static String f2047d;
    private static Random f2048e;
    private static DisplayMetrics f2049f;
    private static String f2050g;
    private static String f2051h;
    private static String f2052i;
    private static int f2053j;
    private static StatLogger f2054k;
    private static String f2055l;
    private static String f2056m;
    private static volatile int f2057n;
    private static String f2058o;
    private static String f2059p;
    private static long f2060q;
    private static String f2061r;
    private static C0642n f2062s;
    private static String f2063t;
    private static int f2064u;
    private static long f2065v;
    private static int f2066w;
    private static String f2067x;

    static {
        f2044a = null;
        f2045b = null;
        f2046c = null;
        f2047d = null;
        f2048e = null;
        f2049f = null;
        f2050g = null;
        f2051h = Constants.STR_EMPTY;
        f2052i = Constants.STR_EMPTY;
        f2053j = -1;
        f2054k = null;
        f2055l = null;
        f2056m = null;
        f2057n = -1;
        f2058o = null;
        f2059p = null;
        f2060q = -1;
        f2061r = Constants.STR_EMPTY;
        f2062s = null;
        f2063t = "__MTA_FIRST_ACTIVATE__";
        f2064u = -1;
        f2065v = -1;
        f2066w = 0;
        f2067x = Constants.STR_EMPTY;
    }

    public static int m2385A(Context context) {
        return C0644p.m2439a(context, "mta.qq.com.difftime", 0);
    }

    public static boolean m2386B(Context context) {
        if (context == null) {
            return false;
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return false;
        }
        String packageName = context.getPackageName();
        for (RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
            if (runningAppProcessInfo.processName.startsWith(packageName)) {
                return runningAppProcessInfo.importance == Downloads.STATUS_BAD_REQUEST;
            }
        }
        return false;
    }

    public static String m2387C(Context context) {
        if (context == null) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 0);
        return (resolveActivity.activityInfo == null || resolveActivity.activityInfo.packageName.equals("android")) ? null : resolveActivity.activityInfo.packageName;
    }

    private static long m2388D(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        MemoryInfo memoryInfo = new MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.availMem;
    }

    public static int m2389a() {
        return C0639k.m2413g().nextInt(Integer.MAX_VALUE);
    }

    public static int m2390a(Context context, boolean z) {
        if (z) {
            f2066w = C0639k.m2385A(context);
        }
        return f2066w;
    }

    public static Long m2391a(String str, String str2, int i, int i2, Long l) {
        if (str == null || str2 == null) {
            return l;
        }
        if (str2.equalsIgnoreCase(".") || str2.equalsIgnoreCase("|")) {
            str2 = "\\" + str2;
        }
        String[] split = str.split(str2);
        if (split.length != i2) {
            return l;
        }
        try {
            Long valueOf = Long.valueOf(0);
            int i3 = 0;
            while (i3 < split.length) {
                Long valueOf2 = Long.valueOf(((long) i) * (valueOf.longValue() + Long.valueOf(split[i3]).longValue()));
                i3++;
                valueOf = valueOf2;
            }
            return valueOf;
        } catch (NumberFormatException e) {
            return l;
        }
    }

    public static String m2392a(int i) {
        Calendar instance = Calendar.getInstance();
        instance.roll(6, i);
        return new SimpleDateFormat("yyyyMMdd").format(instance.getTime());
    }

    public static String m2393a(long j) {
        return new SimpleDateFormat("yyyyMMdd").format(new Date(j));
    }

    public static String m2394a(Context context, String str) {
        if (!StatConfig.isEnableConcurrentProcess()) {
            return str;
        }
        if (f2056m == null) {
            f2056m = C0639k.m2424q(context);
        }
        return f2056m != null ? str + "_" + f2056m : str;
    }

    public static String m2395a(String str) {
        if (str == null) {
            return Constants.VIA_RESULT_SUCCESS;
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : digest) {
                int i = b & MotionEventCompat.ACTION_MASK;
                if (i < 16) {
                    stringBuffer.append(Constants.VIA_RESULT_SUCCESS);
                }
                stringBuffer.append(Integer.toHexString(i));
            }
            return stringBuffer.toString();
        } catch (Throwable th) {
            return Constants.VIA_RESULT_SUCCESS;
        }
    }

    public static HttpHost m2396a(Context context) {
        if (context == null) {
            return null;
        }
        try {
            if (context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) != 0) {
                return null;
            }
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return null;
            }
            if (activeNetworkInfo.getTypeName() != null && activeNetworkInfo.getTypeName().equalsIgnoreCase("WIFI")) {
                return null;
            }
            String extraInfo = activeNetworkInfo.getExtraInfo();
            if (extraInfo == null) {
                return null;
            }
            if (extraInfo.equals("cmwap") || extraInfo.equals("3gwap") || extraInfo.equals("uniwap")) {
                return new HttpHost("10.0.0.172", 80);
            }
            if (extraInfo.equals("ctwap")) {
                return new HttpHost("10.0.0.200", 80);
            }
            String defaultHost = Proxy.getDefaultHost();
            if (defaultHost != null && defaultHost.trim().length() > 0) {
                return new HttpHost(defaultHost, Proxy.getDefaultPort());
            }
            return null;
        } catch (Throwable th) {
            f2054k.m2360e(th);
        }
    }

    public static void m2397a(Context context, int i) {
        f2066w = i;
        C0644p.m2443b(context, "mta.qq.com.difftime", i);
    }

    public static boolean m2398a(StatSpecifyReportedInfo statSpecifyReportedInfo) {
        return statSpecifyReportedInfo == null ? false : C0639k.m2405c(statSpecifyReportedInfo.getAppKey());
    }

    public static byte[] m2399a(byte[] bArr) {
        InputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
        byte[] bArr2 = new byte[AccessibilityNodeInfoCompat.ACTION_SCROLL_FORWARD];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length * 2);
        while (true) {
            int read = gZIPInputStream.read(bArr2);
            if (read != -1) {
                byteArrayOutputStream.write(bArr2, 0, read);
            } else {
                bArr2 = byteArrayOutputStream.toByteArray();
                byteArrayInputStream.close();
                gZIPInputStream.close();
                byteArrayOutputStream.close();
                return bArr2;
            }
        }
    }

    public static long m2400b(String str) {
        return C0639k.m2391a(str, ".", 100, 3, Long.valueOf(0)).longValue();
    }

    public static synchronized StatLogger m2401b() {
        StatLogger statLogger;
        synchronized (C0639k.class) {
            if (f2054k == null) {
                statLogger = new StatLogger(StatConstants.LOG_TAG);
                f2054k = statLogger;
                statLogger.setDebugEnable(false);
            }
            statLogger = f2054k;
        }
        return statLogger;
    }

    public static synchronized String m2402b(Context context) {
        String a;
        synchronized (C0639k.class) {
            if (f2044a == null || f2044a.trim().length() == 0) {
                a = C0645q.m2446a(context);
                f2044a = a;
                if (a == null || f2044a.trim().length() == 0) {
                    f2044a = Integer.toString(C0639k.m2413g().nextInt(Integer.MAX_VALUE));
                }
                a = f2044a;
            } else {
                a = f2044a;
            }
        }
        return a;
    }

    public static long m2403c() {
        try {
            Calendar instance = Calendar.getInstance();
            instance.set(11, 0);
            instance.set(12, 0);
            instance.set(13, 0);
            instance.set(14, 0);
            return instance.getTimeInMillis() + Consts.TIME_24HOUR;
        } catch (Throwable th) {
            f2054k.m2360e(th);
            return System.currentTimeMillis() + Consts.TIME_24HOUR;
        }
    }

    public static synchronized String m2404c(Context context) {
        String str;
        synchronized (C0639k.class) {
            if (f2046c == null || f2046c.trim().length() == 0) {
                f2046c = C0645q.m2451b(context);
            }
            str = f2046c;
        }
        return str;
    }

    public static boolean m2405c(String str) {
        return (str == null || str.trim().length() == 0) ? false : true;
    }

    public static DisplayMetrics m2406d(Context context) {
        if (f2049f == null) {
            f2049f = new DisplayMetrics();
            ((WindowManager) context.getApplicationContext().getSystemService("window")).getDefaultDisplay().getMetrics(f2049f);
        }
        return f2049f;
    }

    public static String m2407d() {
        if (C0639k.m2405c(f2059p)) {
            return f2059p;
        }
        long e = C0639k.m2408e() / 1000000;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        String str = String.valueOf((((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize())) / 1000000) + "/" + String.valueOf(e);
        f2059p = str;
        return str;
    }

    public static long m2408e() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
    }

    public static boolean m2409e(Context context) {
        try {
            if (C0645q.m2450a(context, "android.permission.ACCESS_WIFI_STATE")) {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
                if (connectivityManager != null) {
                    NetworkInfo[] allNetworkInfo = connectivityManager.getAllNetworkInfo();
                    if (allNetworkInfo != null) {
                        int i = 0;
                        while (i < allNetworkInfo.length) {
                            if (allNetworkInfo[i].getTypeName().equalsIgnoreCase("WIFI") && allNetworkInfo[i].isConnected()) {
                                return true;
                            }
                            i++;
                        }
                    }
                }
                return false;
            }
            f2054k.warn("can not get the permission of android.permission.ACCESS_WIFI_STATE");
            return false;
        } catch (Throwable th) {
            f2054k.m2360e(th);
        }
    }

    public static String m2411f(Context context) {
        if (f2045b != null) {
            return f2045b;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS);
            if (applicationInfo != null) {
                String string = applicationInfo.metaData.getString("TA_APPKEY");
                if (string != null) {
                    f2045b = string;
                    return string;
                }
                f2054k.m2361i("Could not read APPKEY meta-data from AndroidManifest.xml");
            }
        } catch (Throwable th) {
            f2054k.m2361i("Could not read APPKEY meta-data from AndroidManifest.xml");
        }
        return null;
    }

    public static String m2412g(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS);
            if (applicationInfo != null) {
                Object obj = applicationInfo.metaData.get("InstallChannel");
                if (obj != null) {
                    return obj.toString();
                }
                f2054k.m2363w("Could not read InstallChannel meta-data from AndroidManifest.xml");
            }
        } catch (Throwable th) {
            f2054k.m2359e((Object) "Could not read InstallChannel meta-data from AndroidManifest.xml");
        }
        return null;
    }

    private static synchronized Random m2413g() {
        Random random;
        synchronized (C0639k.class) {
            if (f2048e == null) {
                f2048e = new Random();
            }
            random = f2048e;
        }
        return random;
    }

    private static long m2414h() {
        if (f2060q > 0) {
            return f2060q;
        }
        long j = 1;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/meminfo"), AsyncHttpClient.DEFAULT_SOCKET_BUFFER_SIZE);
            j = (long) (Integer.valueOf(bufferedReader.readLine().split("\\s+")[1]).intValue() * AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT);
            bufferedReader.close();
        } catch (Exception e) {
        }
        f2060q = j;
        return j;
    }

    public static String m2415h(Context context) {
        return context == null ? null : context.getClass().getName();
    }

    public static String m2416i(Context context) {
        if (f2050g != null) {
            return f2050g;
        }
        try {
            if (!C0645q.m2450a(context, "android.permission.READ_PHONE_STATE")) {
                f2054k.m2359e((Object) "Could not get permission of android.permission.READ_PHONE_STATE");
            } else if (C0639k.m2418k(context)) {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager != null) {
                    f2050g = telephonyManager.getSimOperator();
                }
            }
        } catch (Throwable th) {
            f2054k.m2360e(th);
        }
        return f2050g;
    }

    public static String m2417j(Context context) {
        if (C0639k.m2405c(f2051h)) {
            return f2051h;
        }
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            f2051h = str;
            if (str == null) {
                return Constants.STR_EMPTY;
            }
        } catch (Throwable th) {
            f2054k.m2360e(th);
        }
        return f2051h;
    }

    public static boolean m2418k(Context context) {
        return context.getPackageManager().checkPermission("android.permission.READ_PHONE_STATE", context.getPackageName()) == 0;
    }

    public static String m2419l(Context context) {
        String str = Constants.STR_EMPTY;
        try {
            if (C0645q.m2450a(context, "android.permission.INTERNET") && C0645q.m2450a(context, "android.permission.ACCESS_NETWORK_STATE")) {
                String typeName;
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    typeName = activeNetworkInfo.getTypeName();
                    String extraInfo = activeNetworkInfo.getExtraInfo();
                    if (typeName != null) {
                        if (typeName.equalsIgnoreCase("WIFI")) {
                            return "WIFI";
                        }
                        if (typeName.equalsIgnoreCase("MOBILE")) {
                            return extraInfo != null ? extraInfo : "MOBILE";
                        } else {
                            if (extraInfo != null) {
                                return extraInfo;
                            }
                            return typeName;
                        }
                    }
                }
                typeName = str;
                return typeName;
            }
            f2054k.m2359e((Object) "can not get the permission of android.permission.ACCESS_WIFI_STATE");
            return str;
        } catch (Throwable th) {
            f2054k.m2360e(th);
            return str;
        }
    }

    public static Integer m2420m(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                return Integer.valueOf(telephonyManager.getNetworkType());
            }
        } catch (Throwable th) {
        }
        return null;
    }

    public static String m2421n(Context context) {
        if (C0639k.m2405c(f2052i)) {
            return f2052i;
        }
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            f2052i = str;
            if (str == null || f2052i.length() == 0) {
                return "unknown";
            }
        } catch (Throwable th) {
            f2054k.m2360e(th);
        }
        return f2052i;
    }

    public static int m2422o(Context context) {
        if (f2053j != -1) {
            return f2053j;
        }
        try {
            if (C0643o.m2438a()) {
                f2053j = 1;
            }
        } catch (Throwable th) {
            f2054k.m2360e(th);
        }
        f2053j = 0;
        return 0;
    }

    public static String m2423p(Context context) {
        if (C0639k.m2405c(f2055l)) {
            return f2055l;
        }
        try {
            if (C0645q.m2450a(context, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                String externalStorageState = Environment.getExternalStorageState();
                if (externalStorageState != null && externalStorageState.equals("mounted")) {
                    externalStorageState = Environment.getExternalStorageDirectory().getPath();
                    if (externalStorageState != null) {
                        StatFs statFs = new StatFs(externalStorageState);
                        long blockCount = (((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize())) / 1000000;
                        externalStorageState = String.valueOf((((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks())) / 1000000) + "/" + String.valueOf(blockCount);
                        f2055l = externalStorageState;
                        return externalStorageState;
                    }
                }
                return null;
            }
            f2054k.warn("can not get the permission of android.permission.WRITE_EXTERNAL_STORAGE");
            return null;
        } catch (Throwable th) {
            f2054k.m2360e(th);
        }
    }

    static String m2424q(Context context) {
        try {
            if (f2056m != null) {
                return f2056m;
            }
            int myPid = Process.myPid();
            for (RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    f2056m = runningAppProcessInfo.processName;
                    break;
                }
            }
            return f2056m;
        } catch (Throwable th) {
        }
    }

    public static String m2425r(Context context) {
        return C0639k.m2394a(context, StatConstants.DATABASE_NAME);
    }

    public static synchronized Integer m2426s(Context context) {
        Integer valueOf;
        int i = 0;
        synchronized (C0639k.class) {
            if (f2057n <= 0) {
                f2057n = C0644p.m2439a(context, "MTA_EVENT_INDEX", 0);
                C0644p.m2443b(context, "MTA_EVENT_INDEX", f2057n + AidConstants.EVENT_REQUEST_STARTED);
            } else if (f2057n % AidConstants.EVENT_REQUEST_STARTED == 0) {
                try {
                    int i2 = f2057n + AidConstants.EVENT_REQUEST_STARTED;
                    if (f2057n < 2147383647) {
                        i = i2;
                    }
                    C0644p.m2443b(context, "MTA_EVENT_INDEX", i);
                } catch (Throwable th) {
                    f2054k.m2363w(th);
                }
            }
            i = f2057n + 1;
            f2057n = i;
            valueOf = Integer.valueOf(i);
        }
        return valueOf;
    }

    public static String m2427t(Context context) {
        try {
            return String.valueOf(C0639k.m2388D(context) / 1000000) + "/" + String.valueOf(C0639k.m2414h() / 1000000);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static JSONObject m2428u(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("n", C0640l.m2434a());
            String d = C0640l.m2437d();
            if (d != null && d.length() > 0) {
                jSONObject.put("na", d);
            }
            int b = C0640l.m2435b();
            if (b > 0) {
                jSONObject.put("fx", b / 1000000);
            }
            b = C0640l.m2436c();
            if (b > 0) {
                jSONObject.put("fn", b / 1000000);
            }
        } catch (Throwable th) {
            Log.w(StatConstants.LOG_TAG, "get cpu error", th);
        }
        return jSONObject;
    }

    public static String m2429v(Context context) {
        if (C0639k.m2405c(f2061r)) {
            return f2061r;
        }
        try {
            SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
            if (sensorManager != null) {
                List sensorList = sensorManager.getSensorList(-1);
                if (sensorList != null) {
                    StringBuilder stringBuilder = new StringBuilder(sensorList.size() * 10);
                    for (int i = 0; i < sensorList.size(); i++) {
                        stringBuilder.append(((Sensor) sensorList.get(i)).getType());
                        if (i != sensorList.size() - 1) {
                            stringBuilder.append(",");
                        }
                    }
                    f2061r = stringBuilder.toString();
                }
            }
        } catch (Throwable th) {
            f2054k.m2360e(th);
        }
        return f2061r;
    }

    public static synchronized int m2430w(Context context) {
        int i;
        synchronized (C0639k.class) {
            if (f2064u != -1) {
                i = f2064u;
            } else {
                C0639k.m2431x(context);
                i = f2064u;
            }
        }
        return i;
    }

    public static void m2431x(Context context) {
        int a = C0644p.m2439a(context, f2063t, 1);
        f2064u = a;
        if (a == 1) {
            C0644p.m2443b(context, f2063t, 0);
        }
    }

    public static boolean m2432y(Context context) {
        if (f2065v < 0) {
            f2065v = C0644p.m2440a(context, "mta.qq.com.checktime", 0);
        }
        return Math.abs(System.currentTimeMillis() - f2065v) > Consts.TIME_24HOUR;
    }

    public static void m2433z(Context context) {
        f2065v = System.currentTimeMillis();
        C0644p.m2444b(context, "mta.qq.com.checktime", f2065v);
    }
}
