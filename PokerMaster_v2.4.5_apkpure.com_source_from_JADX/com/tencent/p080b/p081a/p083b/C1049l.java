package com.tencent.p080b.p081a.p083b;

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
import android.support.v4.os.EnvironmentCompat;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.PointerIconCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.WindowManager;
import com.google.protobuf.CodedOutputStream;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.tencent.android.tpush.common.Constants;
import com.tencent.p080b.p081a.C1058c;
import com.tencent.p080b.p081a.C1061f;
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

/* renamed from: com.tencent.b.a.b.l */
public final class C1049l {
    private static String f8075a;
    private static String f8076b;
    private static String f8077c;
    private static String f8078d;
    private static Random f8079e;
    private static DisplayMetrics f8080f;
    private static String f8081g;
    private static String f8082h;
    private static String f8083i;
    private static int f8084j;
    private static C1039b f8085k;
    private static String f8086l;
    private static String f8087m;
    private static volatile int f8088n;
    private static String f8089o;
    private static String f8090p;
    private static long f8091q;
    private static String f8092r;
    private static C1052o f8093s;
    private static String f8094t;
    private static int f8095u;
    private static long f8096v;
    private static int f8097w;
    private static String f8098x;

    static {
        f8075a = null;
        f8076b = null;
        f8077c = null;
        f8078d = null;
        f8079e = null;
        f8080f = null;
        f8081g = null;
        f8082h = LetterIndexBar.SEARCH_ICON_LETTER;
        f8083i = LetterIndexBar.SEARCH_ICON_LETTER;
        f8084j = -1;
        f8085k = null;
        f8086l = null;
        f8087m = null;
        f8088n = -1;
        f8089o = null;
        f8090p = null;
        f8091q = -1;
        f8092r = LetterIndexBar.SEARCH_ICON_LETTER;
        f8093s = null;
        f8094t = "__MTA_FIRST_ACTIVATE__";
        f8095u = -1;
        f8096v = -1;
        f8097w = 0;
        f8098x = LetterIndexBar.SEARCH_ICON_LETTER;
    }

    public static int m5680a() {
        return C1049l.m5707i().nextInt(ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    }

    public static int m5681a(Context context, boolean z) {
        if (z) {
            f8097w = C1054q.m5728a(context, "mta.qq.com.difftime", 0);
        }
        return f8097w;
    }

    private static Long m5682a(String str, String str2, Long l) {
        if (str == null) {
            return l;
        }
        if (str2.equalsIgnoreCase(".") || str2.equalsIgnoreCase("|")) {
            str2 = "\\" + str2;
        }
        String[] split = str.split(str2);
        if (split.length != 3) {
            return l;
        }
        try {
            Long valueOf = Long.valueOf(0);
            int i = 0;
            while (i < split.length) {
                Long valueOf2 = Long.valueOf(100 * (valueOf.longValue() + Long.valueOf(split[i]).longValue()));
                i++;
                valueOf = valueOf2;
            }
            return valueOf;
        } catch (NumberFormatException e) {
            return l;
        }
    }

    public static String m5683a(long j) {
        return new SimpleDateFormat("yyyyMMdd").format(new Date(j));
    }

    public static String m5684a(Context context, String str) {
        if (!C1058c.m5785t()) {
            return str;
        }
        if (f8087m == null) {
            f8087m = C1049l.m5713n(context);
        }
        return f8087m != null ? str + "_" + f8087m : str;
    }

    public static String m5685a(String str) {
        if (str == null) {
            return "0";
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : digest) {
                int i = b & MotionEventCompat.ACTION_MASK;
                if (i < 16) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(Integer.toHexString(i));
            }
            return stringBuffer.toString();
        } catch (Throwable th) {
            return "0";
        }
    }

    public static HttpHost m5686a(Context context) {
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
            f8085k.m5665b(th);
        }
    }

    public static void m5687a(Context context, int i) {
        f8097w = i;
        C1054q.m5733b(context, "mta.qq.com.difftime", i);
    }

    public static boolean m5688a(C1061f c1061f) {
        return c1061f == null ? false : C1049l.m5695c(c1061f.f8182a);
    }

    public static byte[] m5689a(byte[] bArr) {
        InputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
        byte[] bArr2 = new byte[CodedOutputStream.DEFAULT_BUFFER_SIZE];
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

    public static int m5690b() {
        if (f8084j != -1) {
            return f8084j;
        }
        try {
            if (C1053p.m5727a()) {
                f8084j = 1;
            }
        } catch (Throwable th) {
            f8085k.m5665b(th);
        }
        f8084j = 0;
        return 0;
    }

    public static long m5691b(String str) {
        return C1049l.m5682a(str, ".", Long.valueOf(0)).longValue();
    }

    public static synchronized String m5692b(Context context) {
        String a;
        synchronized (C1049l.class) {
            if (f8075a == null || f8075a.trim().length() == 0) {
                a = C1055r.m5735a(context);
                f8075a = a;
                if (a == null || f8075a.trim().length() == 0) {
                    f8075a = Integer.toString(C1049l.m5707i().nextInt(ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED));
                }
                a = f8075a;
            } else {
                a = f8075a;
            }
        }
        return a;
    }

    public static synchronized C1039b m5693c() {
        C1039b c1039b;
        synchronized (C1049l.class) {
            if (f8085k == null) {
                c1039b = new C1039b("MtaSDK");
                f8085k = c1039b;
                c1039b.f8022a = false;
            }
            c1039b = f8085k;
        }
        return c1039b;
    }

    public static synchronized String m5694c(Context context) {
        String str;
        synchronized (C1049l.class) {
            if (f8077c == null || f8077c.trim().length() == 0) {
                f8077c = C1055r.m5739b(context);
            }
            str = f8077c;
        }
        return str;
    }

    public static boolean m5695c(String str) {
        return (str == null || str.trim().length() == 0) ? false : true;
    }

    public static long m5696d() {
        try {
            Calendar instance = Calendar.getInstance();
            instance.set(11, 0);
            instance.set(12, 0);
            instance.set(13, 0);
            instance.set(14, 0);
            return instance.getTimeInMillis() + LogBuilder.MAX_INTERVAL;
        } catch (Throwable th) {
            f8085k.m5665b(th);
            return System.currentTimeMillis() + LogBuilder.MAX_INTERVAL;
        }
    }

    public static DisplayMetrics m5697d(Context context) {
        if (f8080f == null) {
            f8080f = new DisplayMetrics();
            ((WindowManager) context.getApplicationContext().getSystemService("window")).getDefaultDisplay().getMetrics(f8080f);
        }
        return f8080f;
    }

    public static String m5698e() {
        Calendar instance = Calendar.getInstance();
        instance.roll(6, 0);
        return new SimpleDateFormat("yyyyMMdd").format(instance.getTime());
    }

    public static boolean m5699e(Context context) {
        try {
            if (C1055r.m5738a(context, "android.permission.ACCESS_WIFI_STATE")) {
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
            f8085k.m5664b((Object) "can not get the permission of android.permission.ACCESS_WIFI_STATE");
            return false;
        } catch (Throwable th) {
            f8085k.m5665b(th);
        }
    }

    public static String m5700f() {
        if (C1049l.m5695c(f8090p)) {
            return f8090p;
        }
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = (((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize())) / 1000000;
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        String str = String.valueOf((((long) statFs2.getAvailableBlocks()) * ((long) statFs2.getBlockSize())) / 1000000) + "/" + String.valueOf(blockCount);
        f8090p = str;
        return str;
    }

    public static String m5701f(Context context) {
        if (f8076b != null) {
            return f8076b;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS);
            if (applicationInfo != null) {
                String string = applicationInfo.metaData.getString("TA_APPKEY");
                if (string != null) {
                    f8076b = string;
                    return string;
                }
                f8085k.m5662a((Object) "Could not read APPKEY meta-data from AndroidManifest.xml");
            }
        } catch (Throwable th) {
            f8085k.m5662a((Object) "Could not read APPKEY meta-data from AndroidManifest.xml");
        }
        return null;
    }

    public static String m5702g(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS);
            if (applicationInfo != null) {
                Object obj = applicationInfo.metaData.get("InstallChannel");
                if (obj != null) {
                    return obj.toString();
                }
                f8085k.m5666c("Could not read InstallChannel meta-data from AndroidManifest.xml");
            }
        } catch (Throwable th) {
            f8085k.m5668e("Could not read InstallChannel meta-data from AndroidManifest.xml");
        }
        return null;
    }

    public static JSONObject m5703g() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("n", C1050m.m5723a());
            String d = C1050m.m5726d();
            if (d != null && d.length() > 0) {
                jSONObject.put("na", d);
            }
            int b = C1050m.m5724b();
            if (b > 0) {
                jSONObject.put("fx", b / 1000000);
            }
            b = C1050m.m5725c();
            if (b > 0) {
                jSONObject.put("fn", b / 1000000);
            }
        } catch (Throwable th) {
            Log.w("MtaSDK", "get cpu error", th);
        }
        return jSONObject;
    }

    public static String m5705h(Context context) {
        if (f8081g != null) {
            return f8081g;
        }
        try {
            if (C1055r.m5738a(context, "android.permission.READ_PHONE_STATE")) {
                if ((context.getPackageManager().checkPermission("android.permission.READ_PHONE_STATE", context.getPackageName()) != 0 ? null : 1) != null) {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    if (telephonyManager != null) {
                        f8081g = telephonyManager.getSimOperator();
                    }
                }
            } else {
                f8085k.m5668e("Could not get permission of android.permission.READ_PHONE_STATE");
            }
        } catch (Throwable th) {
            f8085k.m5665b(th);
        }
        return f8081g;
    }

    public static String m5706i(Context context) {
        if (C1049l.m5695c(f8082h)) {
            return f8082h;
        }
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            f8082h = str;
            if (str == null) {
                return LetterIndexBar.SEARCH_ICON_LETTER;
            }
        } catch (Throwable th) {
            f8085k.m5665b(th);
        }
        return f8082h;
    }

    private static synchronized Random m5707i() {
        Random random;
        synchronized (C1049l.class) {
            if (f8079e == null) {
                f8079e = new Random();
            }
            random = f8079e;
        }
        return random;
    }

    private static long m5708j() {
        if (f8091q > 0) {
            return f8091q;
        }
        long j = 1;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/meminfo"), AccessibilityNodeInfoCompat.ACTION_SCROLL_BACKWARD);
            j = (long) (Integer.valueOf(bufferedReader.readLine().split("\\s+")[1]).intValue() * AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT);
            bufferedReader.close();
        } catch (Exception e) {
        }
        f8091q = j;
        return j;
    }

    public static String m5709j(Context context) {
        String str = LetterIndexBar.SEARCH_ICON_LETTER;
        try {
            if (C1055r.m5738a(context, "android.permission.INTERNET") && C1055r.m5738a(context, "android.permission.ACCESS_NETWORK_STATE")) {
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
            f8085k.m5668e("can not get the permission of android.permission.ACCESS_WIFI_STATE");
            return str;
        } catch (Throwable th) {
            f8085k.m5665b(th);
            return str;
        }
    }

    public static Integer m5710k(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                return Integer.valueOf(telephonyManager.getNetworkType());
            }
        } catch (Throwable th) {
        }
        return null;
    }

    public static String m5711l(Context context) {
        if (C1049l.m5695c(f8083i)) {
            return f8083i;
        }
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            f8083i = str;
            if (str == null || f8083i.length() == 0) {
                return EnvironmentCompat.MEDIA_UNKNOWN;
            }
        } catch (Throwable th) {
            f8085k.m5665b(th);
        }
        return f8083i;
    }

    public static String m5712m(Context context) {
        if (C1049l.m5695c(f8086l)) {
            return f8086l;
        }
        try {
            if (C1055r.m5738a(context, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                String externalStorageState = Environment.getExternalStorageState();
                if (externalStorageState != null && externalStorageState.equals("mounted")) {
                    externalStorageState = Environment.getExternalStorageDirectory().getPath();
                    if (externalStorageState != null) {
                        StatFs statFs = new StatFs(externalStorageState);
                        long blockCount = (((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize())) / 1000000;
                        externalStorageState = String.valueOf((((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks())) / 1000000) + "/" + String.valueOf(blockCount);
                        f8086l = externalStorageState;
                        return externalStorageState;
                    }
                }
                return null;
            }
            f8085k.m5664b((Object) "can not get the permission of android.permission.WRITE_EXTERNAL_STORAGE");
            return null;
        } catch (Throwable th) {
            f8085k.m5665b(th);
        }
    }

    static String m5713n(Context context) {
        try {
            if (f8087m != null) {
                return f8087m;
            }
            int myPid = Process.myPid();
            for (RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService(Constants.FLAG_ACTIVITY_NAME)).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    f8087m = runningAppProcessInfo.processName;
                    break;
                }
            }
            return f8087m;
        } catch (Throwable th) {
        }
    }

    public static String m5714o(Context context) {
        return C1049l.m5684a(context, C1038a.f8021b);
    }

    public static synchronized Integer m5715p(Context context) {
        Integer valueOf;
        int i = 0;
        synchronized (C1049l.class) {
            if (f8088n <= 0) {
                f8088n = C1054q.m5728a(context, "MTA_EVENT_INDEX", 0);
                C1054q.m5733b(context, "MTA_EVENT_INDEX", f8088n + PointerIconCompat.TYPE_DEFAULT);
            } else if (f8088n % PointerIconCompat.TYPE_DEFAULT == 0) {
                try {
                    int i2 = f8088n + PointerIconCompat.TYPE_DEFAULT;
                    if (f8088n < 2147383647) {
                        i = i2;
                    }
                    C1054q.m5733b(context, "MTA_EVENT_INDEX", i);
                } catch (Throwable th) {
                    f8085k.m5666c(th);
                }
            }
            i = f8088n + 1;
            f8088n = i;
            valueOf = Integer.valueOf(i);
        }
        return valueOf;
    }

    public static String m5717r(Context context) {
        if (C1049l.m5695c(f8092r)) {
            return f8092r;
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
                    f8092r = stringBuilder.toString();
                }
            }
        } catch (Throwable th) {
            f8085k.m5665b(th);
        }
        return f8092r;
    }

    public static synchronized int m5718s(Context context) {
        int i;
        synchronized (C1049l.class) {
            if (f8095u != -1) {
                i = f8095u;
            } else {
                C1049l.m5719t(context);
                i = f8095u;
            }
        }
        return i;
    }

    public static void m5719t(Context context) {
        int a = C1054q.m5728a(context, f8094t, 1);
        f8095u = a;
        if (a == 1) {
            C1054q.m5733b(context, f8094t, 0);
        }
    }

    public static boolean m5720u(Context context) {
        if (f8096v < 0) {
            f8096v = C1054q.m5729a(context, "mta.qq.com.checktime");
        }
        return Math.abs(System.currentTimeMillis() - f8096v) > LogBuilder.MAX_INTERVAL;
    }

    public static void m5721v(Context context) {
        f8096v = System.currentTimeMillis();
        C1054q.m5732a(context, "mta.qq.com.checktime", f8096v);
    }

    public static String m5722w(Context context) {
        if (context == null) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 0);
        return (resolveActivity.activityInfo == null || resolveActivity.activityInfo.packageName.equals("android")) ? null : resolveActivity.activityInfo.packageName;
    }

    public static String m5716q(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(Constants.FLAG_ACTIVITY_NAME);
            MemoryInfo memoryInfo = new MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            return String.valueOf(memoryInfo.availMem / 1000000) + "/" + String.valueOf(C1049l.m5708j() / 1000000);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
