package com.igexin.getuiext.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Environment;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.tencent.connect.common.Constants;
import com.ut.device.AidConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.igexin.getuiext.util.h */
public class C0334h {
    public static int m1112a(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionCode;
        } catch (NameNotFoundException e) {
            return -1;
        }
    }

    public static int m1113a(Context context, String str, String str2) {
        ArrayList arrayList = new ArrayList();
        List installedPackages = context.getPackageManager().getInstalledPackages(0);
        int intValue = Integer.valueOf(str2).intValue();
        int i = 0;
        while (i < installedPackages.size()) {
            PackageInfo packageInfo = (PackageInfo) installedPackages.get(i);
            if (str.equals(packageInfo.packageName)) {
                return packageInfo.versionCode < intValue ? packageInfo.versionCode : -2;
            } else {
                i++;
            }
        }
        return -1;
    }

    public static String m1114a(Context context) {
        String str = null;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getApplicationContext().getPackageName(), AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS);
            if (applicationInfo.metaData != null) {
                str = applicationInfo.metaData.getString("PUSH_APPID");
            }
        } catch (NameNotFoundException e) {
        }
        return str;
    }

    public static JSONObject m1115a(Context context, String str, String str2, boolean z) {
        int a = C0334h.m1113a(context, str, str2);
        if (a == -2 || (!z && a == -1)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("packageName", str);
            jSONObject.put("checksum", a == -1 ? Constants.STR_EMPTY : C0334h.m1116b(context, str));
            jSONObject.put("versionCode", a);
            return jSONObject;
        } catch (JSONException e) {
            return jSONObject;
        }
    }

    public static String m1116b(Context context, String str) {
        String a = C0331e.m1105a(context, str);
        return a != null ? C0334h.m1117b(context, str, a) : Constants.VIA_RESULT_SUCCESS;
    }

    public static String m1117b(Context context, String str, String str2) {
        String str3 = Constants.VIA_RESULT_SUCCESS;
        File file = new File(str2);
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            if (instance != null) {
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    Object obj = new byte[10240];
                    while (true) {
                        int read = fileInputStream.read(obj);
                        if (read <= 0) {
                            break;
                        } else if (read < 10240) {
                            Object obj2 = new byte[read];
                            System.arraycopy(obj, 0, obj2, 0, read);
                            instance.update(obj2);
                        } else {
                            instance.update(obj);
                        }
                    }
                    byte[] digest = instance.digest();
                    str3 = C0333g.m1110a(digest, 0, digest.length);
                    fileInputStream.close();
                } catch (FileNotFoundException e) {
                } catch (IOException e2) {
                }
            }
        } catch (NoSuchAlgorithmException e3) {
        }
        return str3;
    }

    public static boolean m1118b(Context context) {
        if (context != null) {
            NetworkInfo networkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getNetworkInfo(1);
            if (networkInfo != null) {
                return networkInfo.isAvailable();
            }
        }
        return false;
    }

    public static int m1119c() {
        return new Random(System.currentTimeMillis()).nextInt(AidConstants.EVENT_REQUEST_STARTED);
    }

    public static boolean m1120c(Context context, String str) {
        try {
            if (context.getPackageManager().getPackageInfo(str, 1) != null) {
                return true;
            }
        } catch (NameNotFoundException e) {
        }
        return false;
    }

    public void m1121a() {
        File file = new File(Environment.getExternalStorageDirectory().getPath() + "/libs");
        if (!file.exists()) {
            file.mkdir();
        }
        File file2 = new File(file.getPath() + "/notify.db");
        if (file2.exists()) {
            file2.delete();
        }
        try {
            if (file2.createNewFile()) {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                fileOutputStream.write(String.valueOf(System.currentTimeMillis()).getBytes());
                fileOutputStream.close();
            }
        } catch (FileNotFoundException e) {
        } catch (IOException e2) {
        }
    }

    public long m1122b() {
        int i = 0;
        File file = new File(Environment.getExternalStorageDirectory().getPath() + "/libs/notify.db");
        if (!file.exists()) {
            return 0;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            Object obj = new byte[30];
            while (true) {
                int read = fileInputStream.read(obj, i, 15);
                if (read != -1) {
                    i += read;
                } else {
                    Object obj2 = new byte[i];
                    System.arraycopy(obj, 0, obj2, 0, i);
                    long parseLong = Long.parseLong(new String(obj2));
                    fileInputStream.close();
                    return parseLong;
                }
            }
        } catch (FileNotFoundException e) {
            return 0;
        } catch (IOException e2) {
            return 0;
        } catch (Exception e3) {
            return 0;
        }
    }
}
