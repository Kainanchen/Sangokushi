package com.igexin.push.core;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.igexin.p022a.p031b.C0259a;
import com.igexin.push.config.C0378l;
import com.igexin.push.config.C0382p;
import com.igexin.push.config.SDKUrlConfig;
import com.igexin.push.core.bean.C0432f;
import com.igexin.push.p035e.p036b.C0395f;
import com.igexin.sdk.p053a.C0518c;
import com.igexin.sdk.p053a.C0519d;
import com.tencent.connect.common.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.igexin.push.core.g */
public class C0483g {
    public static String f1289A;
    public static String f1290B;
    public static String f1291C;
    public static long f1292D;
    public static long f1293E;
    public static long f1294F;
    public static long f1295G;
    public static long f1296H;
    public static long f1297I;
    public static long f1298J;
    public static long f1299K;
    public static long f1300L;
    public static String f1301M;
    public static boolean f1302N;
    public static long f1303O;
    public static long f1304P;
    public static long f1305Q;
    public static long f1306R;
    public static String f1307S;
    public static long f1308T;
    public static int f1309U;
    public static long f1310V;
    public static String f1311W;
    public static String f1312X;
    public static String f1313Y;
    public static String f1314Z;
    public static String f1315a;
    public static String aa;
    public static String ab;
    public static String ac;
    public static String ad;
    public static byte[] ae;
    public static boolean af;
    public static boolean ag;
    public static boolean ah;
    public static Map ai;
    public static Map aj;
    public static HashMap ak;
    public static HashMap al;
    public static HashMap am;
    public static int an;
    public static Map ao;
    public static int ap;
    public static int aq;
    public static int ar;
    public static C0432f as;
    public static boolean at;
    public static String au;
    public static C0395f av;
    public static long aw;
    public static volatile boolean ax;
    private static HashMap ay;
    private static Map az;
    public static String f1316b;
    public static String f1317c;
    public static String f1318d;
    public static String f1319e;
    public static boolean f1320f;
    public static Context f1321g;
    public static AtomicBoolean f1322h;
    public static boolean f1323i;
    public static boolean f1324j;
    public static boolean f1325k;
    public static boolean f1326l;
    public static boolean f1327m;
    public static boolean f1328n;
    public static boolean f1329o;
    public static int f1330p;
    public static int f1331q;
    public static long f1332r;
    public static String f1333s;
    public static String f1334t;
    public static String f1335u;
    public static String f1336v;
    public static String f1337w;
    public static String f1338x;
    public static String f1339y;
    public static String f1340z;

    static {
        f1315a = Constants.STR_EMPTY;
        f1316b = Constants.STR_EMPTY;
        f1317c = Constants.STR_EMPTY;
        f1318d = Constants.STR_EMPTY;
        f1319e = Constants.STR_EMPTY;
        f1320f = false;
        f1322h = new AtomicBoolean(false);
        f1323i = true;
        f1324j = false;
        f1325k = false;
        f1326l = true;
        f1327m = false;
        f1328n = false;
        f1329o = true;
        f1330p = 0;
        f1331q = 0;
        f1332r = 0;
        f1291C = Constants.STR_EMPTY;
        f1292D = -1;
        f1293E = -1;
        f1294F = 0;
        f1295G = 0;
        f1296H = 0;
        f1297I = 0;
        f1298J = 0;
        f1299K = 0;
        f1300L = 0;
        f1301M = null;
        f1302N = C0382p.f1039a.equals("debug");
        f1303O = 0;
        f1306R = 0;
        f1308T = 0;
        f1309U = 0;
        an = 0;
        ap = 0;
        aq = 0;
        ar = 0;
        ay = new HashMap();
    }

    public static int m1722a(String str, boolean z) {
        int intValue;
        synchronized (az) {
            if (az.get(str) == null) {
                az.put(str, Integer.valueOf(0));
            }
            intValue = ((Integer) az.get(str)).intValue();
            if (z) {
                intValue--;
                az.put(str, Integer.valueOf(intValue));
                if (intValue == 0) {
                    az.remove(str);
                }
            }
        }
        return intValue;
    }

    public static String m1723a() {
        return SDKUrlConfig.getConfigServiceUrl();
    }

    public static void m1724a(long j) {
        f1332r = j;
        f1333s = C0259a.m877a(String.valueOf(f1332r));
    }

    public static boolean m1725a(Context context) {
        String str = null;
        boolean z = false;
        f1321g = context;
        f1319e = context.getPackageName();
        String str2 = Constants.STR_EMPTY;
        str2 = Constants.STR_EMPTY;
        str2 = Constants.STR_EMPTY;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(f1319e, AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS);
            if (applicationInfo == null || applicationInfo.metaData == null) {
                return false;
            }
            String string = applicationInfo.metaData.getString("PUSH_APPID");
            str2 = applicationInfo.metaData.getString("PUSH_APPSECRET");
            if (applicationInfo.metaData.get("PUSH_APPKEY") != null) {
                str = applicationInfo.metaData.get("PUSH_APPKEY").toString();
            }
            if (string != null) {
                string = string.trim();
            }
            if (str2 != null) {
                str2 = str2.trim();
            }
            if (str != null) {
                str = str.trim();
            }
            if (string == null || str2 == null || str == null) {
                return false;
            }
            f1315a = string;
            f1316b = str;
            f1317c = str2;
            f1318d = SDKUrlConfig.getLocation();
            ae = C0259a.m877a(string + str2 + str + context.getPackageName()).getBytes();
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(f1319e, AccessibilityNodeInfoCompat.ACTION_SCROLL_FORWARD);
                if (packageInfo == null || packageInfo.requestedPermissions == null) {
                    return false;
                }
                for (String equals : packageInfo.requestedPermissions) {
                    if (equals.equals("android.permission.CALL_PHONE")) {
                        f1320f = true;
                        break;
                    }
                }
                context.getFilesDir();
                File file = new File("/sdcard/libs");
                if (!file.exists()) {
                    try {
                        file.mkdir();
                    } catch (Exception e) {
                    }
                }
                file = new File(Environment.getExternalStorageDirectory().getPath() + "/system/tmp/local");
                if (!file.exists()) {
                    try {
                        file.mkdirs();
                    } catch (Exception e2) {
                    }
                }
                ac = file.getAbsolutePath();
                ad = context.getFilesDir().getPath();
                f1313Y = "/sdcard/libs/" + f1319e + ".db";
                f1314Z = "/sdcard/libs/com.igexin.sdk.deviceId.db";
                aa = "/sdcard/libs/app.db";
                ab = "/sdcard/libs/imsi.db";
                f1312X = "/sdcard/libs/" + f1319e + ".properties";
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    f1335u = telephonyManager.getDeviceId();
                    f1336v = telephonyManager.getSubscriberId();
                    if (TextUtils.isEmpty(f1339y)) {
                        if (C0378l.f1020g) {
                            HashMap b = C0483g.m1727b();
                            if (!(b == null || TextUtils.isEmpty(f1336v))) {
                                f1339y = (String) b.get(f1336v);
                            }
                            if (f1339y == null || !f1339y.equals(Constants.STR_EMPTY)) {
                                f1339y = null;
                            }
                        } else {
                            f1339y = null;
                        }
                    }
                    f1337w = Build.MODEL;
                    ConnectivityManager j = C0482f.m1694a().m1715j();
                    if (j != null) {
                        NetworkInfo activeNetworkInfo = j.getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                            z = true;
                        }
                        f1323i = z;
                    } else {
                        f1323i = false;
                    }
                } catch (Throwable th) {
                }
                ai = new HashMap();
                aj = new HashMap();
                ak = new HashMap();
                al = new HashMap();
                am = new HashMap();
                ao = new HashMap();
                f1310V = System.currentTimeMillis();
                f1311W = "com.igexin.sdk.action.snlresponse." + f1319e;
                f1324j = new C0519d(context).m1880c();
                f1325k = new C0518c(context).m1877c();
                az = new HashMap();
                ax = true;
                return true;
            } catch (Exception e3) {
                return false;
            }
        } catch (Exception e4) {
            return false;
        }
    }

    public static boolean m1726a(String str, Integer num, boolean z) {
        boolean z2;
        synchronized (az) {
            int intValue = num.intValue();
            if (z && az.get(str) != null) {
                intValue = ((Integer) az.get(str)).intValue() + num.intValue();
                if (intValue == 0) {
                    az.remove(str);
                    z2 = false;
                }
            }
            az.put(str, Integer.valueOf(intValue));
            z2 = true;
        }
        return z2;
    }

    public static HashMap m1727b() {
        if (!new File(ab).exists()) {
            return null;
        }
        try {
            ObjectInput objectInputStream = new ObjectInputStream(new FileInputStream(ab));
            HashMap hashMap = (HashMap) objectInputStream.readObject();
            try {
                objectInputStream.close();
                return hashMap;
            } catch (Exception e) {
                return hashMap;
            }
        } catch (Exception e2) {
            return null;
        }
    }

    public static HashMap m1728c() {
        return ay;
    }
}
