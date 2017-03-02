package com.alipay.p011b.p012a.p013a.p016b;

import android.app.KeyguardManager;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings.Secure;
import android.provider.Settings.System;
import android.support.v4.view.MotionEventCompat;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.alipay.p011b.p012a.p013a.p014a.C0110a;
import com.alipay.sdk.authjs.C0161a;
import com.alipay.sdk.cons.C0167c;
import com.igexin.download.Downloads;
import com.loopj.android.http.AsyncHttpClient;
import com.tencent.connect.common.Constants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.alipay.b.a.a.b.b */
public final class C0113b {
    private static C0113b f145a;

    static {
        f145a = new C0113b();
    }

    private C0113b() {
    }

    public static C0113b m245a() {
        return f145a;
    }

    public static String m246a(Context context) {
        if (C0113b.m247a(context, "android.permission.READ_PHONE_STATE")) {
            return Constants.STR_EMPTY;
        }
        String deviceId;
        if (context != null) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager != null) {
                    deviceId = telephonyManager.getDeviceId();
                    return deviceId != null ? Constants.STR_EMPTY : deviceId;
                }
            } catch (Exception e) {
            }
        }
        deviceId = null;
        if (deviceId != null) {
        }
    }

    private static boolean m247a(Context context, String str) {
        return !(context.getPackageManager().checkPermission(str, context.getPackageName()) == 0);
    }

    public static String m248b() {
        long j = 0;
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            j = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        } catch (Exception e) {
        }
        return String.valueOf(j);
    }

    public static String m249b(Context context) {
        String str = Constants.STR_EMPTY;
        if (C0113b.m247a(context, "android.permission.READ_PHONE_STATE")) {
            return Constants.STR_EMPTY;
        }
        String subscriberId;
        if (context != null) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager != null) {
                    subscriberId = telephonyManager.getSubscriberId();
                    return subscriberId != null ? Constants.STR_EMPTY : subscriberId;
                }
            } catch (Exception e) {
            }
        }
        subscriberId = str;
        if (subscriberId != null) {
        }
    }

    public static String m250c() {
        long j = 0;
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                StatFs statFs = new StatFs(C0110a.m231a().getPath());
                j = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
            }
        } catch (Exception e) {
        }
        return String.valueOf(j);
    }

    public static String m251c(Context context) {
        int i = 0;
        try {
            i = System.getInt(context.getContentResolver(), "airplane_mode_on", 0);
        } catch (Exception e) {
        }
        return i == 1 ? Constants.VIA_TO_TYPE_QQ_GROUP : Constants.VIA_RESULT_SUCCESS;
    }

    public static String m252d() {
        InputStreamReader inputStreamReader;
        LineNumberReader lineNumberReader;
        InputStreamReader inputStreamReader2;
        FileInputStream fileInputStream;
        Throwable th;
        String str;
        LineNumberReader lineNumberReader2 = null;
        String str2 = "0000000000000000";
        FileInputStream fileInputStream2;
        try {
            fileInputStream2 = new FileInputStream(new File("/proc/cpuinfo"));
            try {
                inputStreamReader = new InputStreamReader(fileInputStream2);
                try {
                    String trim;
                    lineNumberReader = new LineNumberReader(inputStreamReader);
                    int i = 1;
                    while (i < 100) {
                        try {
                            String readLine = lineNumberReader.readLine();
                            if (readLine == null) {
                                break;
                            } else if (readLine.indexOf("Serial") >= 0) {
                                trim = readLine.substring(readLine.indexOf(":") + 1, readLine.length()).trim();
                                break;
                            } else {
                                i++;
                            }
                        } catch (Exception e) {
                            inputStreamReader2 = inputStreamReader;
                            fileInputStream = fileInputStream2;
                        } catch (Throwable th2) {
                            Throwable th3 = th2;
                            lineNumberReader2 = lineNumberReader;
                            th = th3;
                        }
                    }
                    trim = str2;
                    try {
                        lineNumberReader.close();
                    } catch (Exception e2) {
                    }
                    try {
                        inputStreamReader.close();
                    } catch (Exception e3) {
                    }
                    try {
                        fileInputStream2.close();
                        str = trim;
                    } catch (Exception e4) {
                        str = trim;
                    }
                } catch (Exception e5) {
                    lineNumberReader = null;
                    inputStreamReader2 = inputStreamReader;
                    fileInputStream = fileInputStream2;
                    if (lineNumberReader != null) {
                        try {
                            lineNumberReader.close();
                        } catch (Exception e6) {
                        }
                    }
                    if (inputStreamReader2 != null) {
                        try {
                            inputStreamReader2.close();
                        } catch (Exception e7) {
                        }
                    }
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                            str = str2;
                        } catch (Exception e8) {
                            str = str2;
                        }
                    } else {
                        str = str2;
                    }
                    return str != null ? str : Constants.STR_EMPTY;
                } catch (Throwable th4) {
                    th = th4;
                    if (lineNumberReader2 != null) {
                        try {
                            lineNumberReader2.close();
                        } catch (Exception e9) {
                        }
                    }
                    if (inputStreamReader != null) {
                        try {
                            inputStreamReader.close();
                        } catch (Exception e10) {
                        }
                    }
                    if (fileInputStream2 != null) {
                        try {
                            fileInputStream2.close();
                        } catch (Exception e11) {
                        }
                    }
                    throw th;
                }
            } catch (Exception e12) {
                lineNumberReader = null;
                fileInputStream = fileInputStream2;
                if (lineNumberReader != null) {
                    lineNumberReader.close();
                }
                if (inputStreamReader2 != null) {
                    inputStreamReader2.close();
                }
                if (fileInputStream != null) {
                    fileInputStream.close();
                    str = str2;
                } else {
                    str = str2;
                }
                if (str != null) {
                }
            } catch (Throwable th5) {
                th = th5;
                inputStreamReader = null;
                if (lineNumberReader2 != null) {
                    lineNumberReader2.close();
                }
                if (inputStreamReader != null) {
                    inputStreamReader.close();
                }
                if (fileInputStream2 != null) {
                    fileInputStream2.close();
                }
                throw th;
            }
        } catch (Exception e13) {
            lineNumberReader = null;
            fileInputStream = null;
            if (lineNumberReader != null) {
                lineNumberReader.close();
            }
            if (inputStreamReader2 != null) {
                inputStreamReader2.close();
            }
            if (fileInputStream != null) {
                str = str2;
            } else {
                fileInputStream.close();
                str = str2;
            }
            if (str != null) {
            }
        } catch (Throwable th6) {
            th = th6;
            inputStreamReader = null;
            fileInputStream2 = null;
            if (lineNumberReader2 != null) {
                lineNumberReader2.close();
            }
            if (inputStreamReader != null) {
                inputStreamReader.close();
            }
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            throw th;
        }
        if (str != null) {
        }
    }

    public static String m253d(Context context) {
        int i = 1;
        JSONObject jSONObject = new JSONObject();
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager.getRingerMode() != 0) {
                i = 0;
            }
            int streamVolume = audioManager.getStreamVolume(0);
            int streamVolume2 = audioManager.getStreamVolume(1);
            int streamVolume3 = audioManager.getStreamVolume(2);
            int streamVolume4 = audioManager.getStreamVolume(3);
            int streamVolume5 = audioManager.getStreamVolume(4);
            jSONObject.put("ringermode", String.valueOf(i));
            jSONObject.put(C0161a.f316b, String.valueOf(streamVolume));
            jSONObject.put("system", String.valueOf(streamVolume2));
            jSONObject.put("ring", String.valueOf(streamVolume3));
            jSONObject.put("music", String.valueOf(streamVolume4));
            jSONObject.put("alarm", String.valueOf(streamVolume5));
        } catch (Exception e) {
        }
        return jSONObject.toString();
    }

    public static String m254e(Context context) {
        String networkOperatorName;
        if (context != null) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager != null) {
                    networkOperatorName = telephonyManager.getNetworkOperatorName();
                    return (networkOperatorName != null || "null".equals(networkOperatorName)) ? Constants.STR_EMPTY : networkOperatorName;
                }
            } catch (Exception e) {
            }
        }
        networkOperatorName = null;
        if (networkOperatorName != null) {
        }
    }

    public static String m255f() {
        String w = C0113b.m287w();
        return !C0110a.m234a(w) ? w : C0113b.m288x();
    }

    public static String m256f(Context context) {
        if (C0113b.m247a(context, "android.permission.READ_PHONE_STATE")) {
            return Constants.STR_EMPTY;
        }
        String line1Number;
        String str = Constants.STR_EMPTY;
        if (context != null) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager != null) {
                    line1Number = telephonyManager.getLine1Number();
                    return line1Number != null ? Constants.STR_EMPTY : line1Number;
                }
            } catch (Exception e) {
            }
        }
        line1Number = str;
        if (line1Number != null) {
        }
    }

    public static String m257g() {
        FileReader fileReader;
        BufferedReader bufferedReader;
        FileReader fileReader2;
        Throwable th;
        BufferedReader bufferedReader2 = null;
        try {
            fileReader = new FileReader("/proc/cpuinfo");
            try {
                bufferedReader = new BufferedReader(fileReader);
                try {
                    String[] split = bufferedReader.readLine().split(":\\s+", 2);
                    if (split == null || split.length <= 1) {
                        try {
                            fileReader.close();
                        } catch (Exception e) {
                        }
                        try {
                            bufferedReader.close();
                        } catch (Exception e2) {
                        }
                        return Constants.STR_EMPTY;
                    }
                    String str = split[1];
                    try {
                        fileReader.close();
                    } catch (Exception e3) {
                    }
                    try {
                        bufferedReader.close();
                        return str;
                    } catch (Exception e4) {
                        return str;
                    }
                } catch (Exception e5) {
                    bufferedReader2 = bufferedReader;
                    fileReader2 = fileReader;
                    if (fileReader2 != null) {
                        try {
                            fileReader2.close();
                        } catch (Exception e6) {
                        }
                    }
                    if (bufferedReader2 != null) {
                        try {
                            bufferedReader2.close();
                        } catch (Exception e7) {
                        }
                    }
                    return Constants.STR_EMPTY;
                } catch (Throwable th2) {
                    th = th2;
                    if (fileReader != null) {
                        try {
                            fileReader.close();
                        } catch (Exception e8) {
                        }
                    }
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Exception e9) {
                        }
                    }
                    throw th;
                }
            } catch (Exception e10) {
                fileReader2 = fileReader;
                if (fileReader2 != null) {
                    fileReader2.close();
                }
                if (bufferedReader2 != null) {
                    bufferedReader2.close();
                }
                return Constants.STR_EMPTY;
            } catch (Throwable th3) {
                Throwable th4 = th3;
                bufferedReader = null;
                th = th4;
                if (fileReader != null) {
                    fileReader.close();
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                throw th;
            }
        } catch (Exception e11) {
            fileReader2 = null;
            if (fileReader2 != null) {
                fileReader2.close();
            }
            if (bufferedReader2 != null) {
                bufferedReader2.close();
            }
            return Constants.STR_EMPTY;
        } catch (Throwable th32) {
            fileReader = null;
            th = th32;
            bufferedReader = null;
            if (fileReader != null) {
                fileReader.close();
            }
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            throw th;
        }
    }

    public static String m258g(Context context) {
        String d;
        if (context != null) {
            try {
                SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
                if (sensorManager != null) {
                    List<Sensor> sensorList = sensorManager.getSensorList(-1);
                    if (sensorList != null && sensorList.size() > 0) {
                        StringBuilder stringBuilder = new StringBuilder();
                        for (Sensor sensor : sensorList) {
                            stringBuilder.append(sensor.getName());
                            stringBuilder.append(sensor.getVersion());
                            stringBuilder.append(sensor.getVendor());
                        }
                        d = C0110a.m239d(stringBuilder.toString());
                        return d != null ? Constants.STR_EMPTY : d;
                    }
                }
            } catch (Exception e) {
            }
        }
        d = null;
        if (d != null) {
        }
    }

    public static String m259h() {
        FileReader fileReader;
        BufferedReader bufferedReader;
        Throwable th;
        BufferedReader bufferedReader2 = null;
        long j = 0;
        try {
            fileReader = new FileReader("/proc/meminfo");
            try {
                bufferedReader = new BufferedReader(fileReader, AsyncHttpClient.DEFAULT_SOCKET_BUFFER_SIZE);
            } catch (Exception e) {
                if (fileReader != null) {
                    try {
                        fileReader.close();
                    } catch (Exception e2) {
                    }
                }
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (Exception e3) {
                    }
                }
                return String.valueOf(j);
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
                if (fileReader != null) {
                    try {
                        fileReader.close();
                    } catch (Exception e4) {
                    }
                }
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (Exception e5) {
                    }
                }
                throw th;
            }
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    j = (long) Integer.parseInt(readLine.split("\\s+")[1]);
                }
                try {
                    fileReader.close();
                } catch (Exception e6) {
                }
                try {
                    bufferedReader.close();
                } catch (Exception e7) {
                }
            } catch (Exception e8) {
                bufferedReader2 = bufferedReader;
                if (fileReader != null) {
                    fileReader.close();
                }
                if (bufferedReader2 != null) {
                    bufferedReader2.close();
                }
                return String.valueOf(j);
            } catch (Throwable th3) {
                th = th3;
                if (fileReader != null) {
                    fileReader.close();
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                throw th;
            }
        } catch (Exception e9) {
            fileReader = null;
            if (fileReader != null) {
                fileReader.close();
            }
            if (bufferedReader2 != null) {
                bufferedReader2.close();
            }
            return String.valueOf(j);
        } catch (Throwable th4) {
            th = th4;
            fileReader = null;
            bufferedReader = null;
            if (fileReader != null) {
                fileReader.close();
            }
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            throw th;
        }
        return String.valueOf(j);
    }

    public static String m260h(Context context) {
        JSONArray jSONArray = new JSONArray();
        if (context != null) {
            try {
                SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
                if (sensorManager != null) {
                    List<Sensor> sensorList = sensorManager.getSensorList(-1);
                    if (sensorList != null && sensorList.size() > 0) {
                        for (Sensor sensor : sensorList) {
                            if (sensor != null) {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put(C0167c.f364e, sensor.getName());
                                jSONObject.put("version", sensor.getVersion());
                                jSONObject.put("vendor", sensor.getVendor());
                                jSONArray.put(jSONObject);
                            }
                        }
                    }
                }
            } catch (Exception e) {
            }
        }
        return jSONArray.toString();
    }

    public static String m261i() {
        long j = 0;
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            j = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        } catch (Exception e) {
        }
        return String.valueOf(j);
    }

    public static String m262i(Context context) {
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            return Integer.toString(displayMetrics.widthPixels) + "*" + Integer.toString(displayMetrics.heightPixels);
        } catch (Exception e) {
            return Constants.STR_EMPTY;
        }
    }

    public static String m263j() {
        long j = 0;
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                j = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
            }
        } catch (Exception e) {
        }
        return String.valueOf(j);
    }

    public static String m264j(Context context) {
        try {
            return context.getResources().getDisplayMetrics().widthPixels;
        } catch (Exception e) {
            return Constants.STR_EMPTY;
        }
    }

    public static String m265k() {
        String str;
        String str2 = Constants.STR_EMPTY;
        try {
            Class cls = Class.forName("android.os.SystemProperties");
            str = (String) cls.getMethod("get", new Class[]{String.class, String.class}).invoke(cls.newInstance(), new Object[]{"gsm.version.baseband", "no message"});
        } catch (Exception e) {
            str = str2;
        }
        return str == null ? Constants.STR_EMPTY : str;
    }

    public static String m266k(Context context) {
        try {
            return context.getResources().getDisplayMetrics().heightPixels;
        } catch (Exception e) {
            return Constants.STR_EMPTY;
        }
    }

    public static String m267l() {
        String str = Constants.STR_EMPTY;
        try {
            str = Build.SERIAL;
        } catch (Exception e) {
        }
        return str == null ? Constants.STR_EMPTY : str;
    }

    public static String m268l(Context context) {
        if (C0113b.m247a(context, "android.permission.ACCESS_WIFI_STATE")) {
            return Constants.STR_EMPTY;
        }
        String str = Constants.STR_EMPTY;
        try {
            String macAddress = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo().getMacAddress();
            if (macAddress != null) {
                try {
                    if (!(macAddress.length() == 0 || "02:00:00:00:00:00".equals(macAddress))) {
                        return macAddress;
                    }
                } catch (Exception e) {
                    return macAddress;
                }
            }
            return C0113b.m286v();
        } catch (Exception e2) {
            return str;
        }
    }

    public static String m269m() {
        String str = Constants.STR_EMPTY;
        try {
            str = Locale.getDefault().toString();
        } catch (Exception e) {
        }
        return str == null ? Constants.STR_EMPTY : str;
    }

    public static String m270m(Context context) {
        if (C0113b.m247a(context, "android.permission.READ_PHONE_STATE")) {
            return Constants.STR_EMPTY;
        }
        String str = Constants.STR_EMPTY;
        try {
            String simSerialNumber = ((TelephonyManager) context.getSystemService("phone")).getSimSerialNumber();
            if (simSerialNumber != null) {
                if (simSerialNumber == null) {
                    return simSerialNumber;
                }
                try {
                    if (simSerialNumber.length() != 0) {
                        return simSerialNumber;
                    }
                } catch (Exception e) {
                    return simSerialNumber;
                }
            }
            return Constants.STR_EMPTY;
        } catch (Exception e2) {
            return str;
        }
    }

    public static String m271n() {
        String str = Constants.STR_EMPTY;
        try {
            str = TimeZone.getDefault().getDisplayName(false, 0);
        } catch (Exception e) {
        }
        return str == null ? Constants.STR_EMPTY : str;
    }

    public static String m272n(Context context) {
        String str = Constants.STR_EMPTY;
        try {
            str = Secure.getString(context.getContentResolver(), "android_id");
        } catch (Exception e) {
        }
        return str == null ? Constants.STR_EMPTY : str;
    }

    public static String m273o() {
        try {
            long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
            return (currentTimeMillis - (currentTimeMillis % 1000));
        } catch (Exception e) {
            return Constants.STR_EMPTY;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m274o(android.content.Context r3) {
        /*
        r0 = "android.permission.BLUETOOTH";
        r0 = com.alipay.p011b.p012a.p013a.p016b.C0113b.m247a(r3, r0);
        if (r0 == 0) goto L_0x000b;
    L_0x0008:
        r0 = "";
    L_0x000a:
        return r0;
    L_0x000b:
        r0 = com.alipay.p011b.p012a.p013a.p016b.C0113b.m289y();
        if (r0 == 0) goto L_0x001f;
    L_0x0011:
        r1 = r0.length();	 Catch:{ Exception -> 0x002e }
        if (r1 == 0) goto L_0x001f;
    L_0x0017:
        r1 = "02:00:00:00:00:00";
        r1 = r1.equals(r0);	 Catch:{ Exception -> 0x002e }
        if (r1 == 0) goto L_0x0029;
    L_0x001f:
        r1 = r3.getContentResolver();	 Catch:{ Exception -> 0x002e }
        r2 = "bluetooth_address";
        r0 = android.provider.Settings.Secure.getString(r1, r2);	 Catch:{ Exception -> 0x002e }
    L_0x0029:
        if (r0 != 0) goto L_0x000a;
    L_0x002b:
        r0 = "";
        goto L_0x000a;
    L_0x002e:
        r1 = move-exception;
        goto L_0x000a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.b.a.a.b.b.o(android.content.Context):java.lang.String");
    }

    public static String m275p() {
        try {
            return SystemClock.elapsedRealtime();
        } catch (Exception e) {
            return Constants.STR_EMPTY;
        }
    }

    public static String m276p(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                return String.valueOf(telephonyManager.getNetworkType());
            }
        } catch (Exception e) {
        }
        return Constants.STR_EMPTY;
    }

    public static String m277q() {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            String[] strArr = new String[]{"/dev/qemu_pipe", "/dev/socket/qemud", "/system/lib/libc_malloc_debug_qemu.so", "/sys/qemu_trace", "/system/bin/qemu-props", "/dev/socket/genyd", "/dev/socket/baseband_genyd"};
            stringBuilder.append("00" + ":");
            for (int i = 0; i < 7; i++) {
                if (new File(strArr[i]).exists()) {
                    stringBuilder.append(Constants.VIA_TO_TYPE_QQ_GROUP);
                } else {
                    stringBuilder.append(Constants.VIA_RESULT_SUCCESS);
                }
            }
            return stringBuilder.toString();
        } catch (Exception e) {
            return Constants.STR_EMPTY;
        }
    }

    public static String m278q(Context context) {
        String str = Constants.STR_EMPTY;
        if (C0113b.m247a(context, "android.permission.ACCESS_WIFI_STATE")) {
            return Constants.STR_EMPTY;
        }
        String bssid;
        try {
            WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
            if (wifiManager.isWifiEnabled()) {
                bssid = wifiManager.getConnectionInfo().getBSSID();
                return bssid != null ? Constants.STR_EMPTY : bssid;
            }
        } catch (Throwable th) {
        }
        bssid = str;
        if (bssid != null) {
        }
    }

    public static String m279r() {
        String[] strArr = new String[]{"dalvik.system.Taint"};
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("00");
        stringBuilder.append(":");
        for (int i = 0; i <= 0; i++) {
            try {
                Class.forName(strArr[0]);
                stringBuilder.append(Constants.VIA_TO_TYPE_QQ_GROUP);
            } catch (Exception e) {
                stringBuilder.append(Constants.VIA_RESULT_SUCCESS);
            }
        }
        return stringBuilder.toString();
    }

    public static String m280r(Context context) {
        String str = Constants.STR_EMPTY;
        try {
            String str2;
            if (C0113b.m247a(context, "android.permission.ACCESS_NETWORK_STATE")) {
                str2 = Constants.STR_EMPTY;
            } else {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null) {
                    str2 = null;
                } else if (activeNetworkInfo.getType() == 1) {
                    str2 = "WIFI";
                } else if (activeNetworkInfo.getType() == 0) {
                    int subtype = activeNetworkInfo.getSubtype();
                    str2 = (subtype == 4 || subtype == 1 || subtype == 2 || subtype == 7 || subtype == 11) ? "2G" : (subtype == 3 || subtype == 5 || subtype == 6 || subtype == 8 || subtype == 9 || subtype == 10 || subtype == 12 || subtype == 14 || subtype == 15) ? "3G" : subtype == 13 ? "4G" : "UNKNOW";
                } else {
                    str2 = null;
                }
            }
            String z = C0113b.m290z();
            if (C0110a.m237b(str2) && C0110a.m237b(z)) {
                return str2 + ":" + C0113b.m290z();
            }
        } catch (Exception e) {
        }
        return str;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m281s() {
        /*
        r2 = 48;
        r0 = "00";
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r5 = new java.util.LinkedHashMap;
        r5.<init>();
        r1 = "/system/build.prop";
        r3 = "ro.product.name=sdk";
        r5.put(r1, r3);
        r1 = "/proc/tty/drivers";
        r3 = "goldfish";
        r5.put(r1, r3);
        r1 = "/proc/cpuinfo";
        r3 = "goldfish";
        r5.put(r1, r3);
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = r1.append(r0);
        r1 = ":";
        r0 = r0.append(r1);
        r0 = r0.toString();
        r4.append(r0);
        r0 = r5.keySet();
        r6 = r0.iterator();
    L_0x0041:
        r0 = r6.hasNext();
        if (r0 == 0) goto L_0x0095;
    L_0x0047:
        r0 = r6.next();
        r0 = (java.lang.String) r0;
        r1 = 0;
        r3 = new java.io.LineNumberReader;	 Catch:{ Exception -> 0x007e, all -> 0x008b }
        r7 = new java.io.InputStreamReader;	 Catch:{ Exception -> 0x007e, all -> 0x008b }
        r8 = new java.io.FileInputStream;	 Catch:{ Exception -> 0x007e, all -> 0x008b }
        r8.<init>(r0);	 Catch:{ Exception -> 0x007e, all -> 0x008b }
        r7.<init>(r8);	 Catch:{ Exception -> 0x007e, all -> 0x008b }
        r3.<init>(r7);	 Catch:{ Exception -> 0x007e, all -> 0x008b }
    L_0x005d:
        r1 = r3.readLine();	 Catch:{ Exception -> 0x009f, all -> 0x009c }
        if (r1 == 0) goto L_0x00a2;
    L_0x0063:
        r7 = r1.toLowerCase();	 Catch:{ Exception -> 0x009f, all -> 0x009c }
        r1 = r5.get(r0);	 Catch:{ Exception -> 0x009f, all -> 0x009c }
        r1 = (java.lang.CharSequence) r1;	 Catch:{ Exception -> 0x009f, all -> 0x009c }
        r1 = r7.contains(r1);	 Catch:{ Exception -> 0x009f, all -> 0x009c }
        if (r1 == 0) goto L_0x005d;
    L_0x0073:
        r0 = 49;
    L_0x0075:
        r4.append(r0);
        r3.close();	 Catch:{ Exception -> 0x007c }
        goto L_0x0041;
    L_0x007c:
        r0 = move-exception;
        goto L_0x0041;
    L_0x007e:
        r0 = move-exception;
        r0 = r1;
    L_0x0080:
        r4.append(r2);
        if (r0 == 0) goto L_0x0041;
    L_0x0085:
        r0.close();	 Catch:{ Exception -> 0x0089 }
        goto L_0x0041;
    L_0x0089:
        r0 = move-exception;
        goto L_0x0041;
    L_0x008b:
        r0 = move-exception;
    L_0x008c:
        r4.append(r2);
        if (r1 == 0) goto L_0x0094;
    L_0x0091:
        r1.close();	 Catch:{ Exception -> 0x009a }
    L_0x0094:
        throw r0;
    L_0x0095:
        r0 = r4.toString();
        return r0;
    L_0x009a:
        r1 = move-exception;
        goto L_0x0094;
    L_0x009c:
        r0 = move-exception;
        r1 = r3;
        goto L_0x008c;
    L_0x009f:
        r0 = move-exception;
        r0 = r3;
        goto L_0x0080;
    L_0x00a2:
        r0 = r2;
        goto L_0x0075;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.b.a.a.b.b.s():java.lang.String");
    }

    public static String m282s(Context context) {
        if (!((KeyguardManager) context.getSystemService("keyguard")).isKeyguardSecure()) {
            return "0:0";
        }
        String[] strArr = new String[]{"/data/system/password.key", "/data/system/gesture.key", "/data/system/gatekeeper.password.key", "/data/system/gatekeeper.gesture.key", "/data/system/gatekeeper.pattern.key"};
        int i = 0;
        long j = 0;
        while (i < 5) {
            long j2 = -1;
            try {
                j2 = new File(strArr[i]).lastModified();
            } catch (Exception e) {
            }
            i++;
            j = Math.max(j2, j);
        }
        return "1:" + j;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m283t() {
        /*
        r3 = 0;
        r2 = 48;
        r0 = "00";
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = r1.append(r0);
        r1 = ":";
        r0 = r0.append(r1);
        r0 = r0.toString();
        r4.append(r0);
        r5 = new java.util.LinkedHashMap;
        r5.<init>();
        r0 = "BRAND";
        r1 = "generic";
        r5.put(r0, r1);
        r0 = "BOARD";
        r1 = "unknown";
        r5.put(r0, r1);
        r0 = "DEVICE";
        r1 = "generic";
        r5.put(r0, r1);
        r0 = "HARDWARE";
        r1 = "goldfish";
        r5.put(r0, r1);
        r0 = "PRODUCT";
        r1 = "sdk";
        r5.put(r0, r1);
        r0 = "MODEL";
        r1 = "sdk";
        r5.put(r0, r1);
        r0 = r5.keySet();
        r6 = r0.iterator();
    L_0x0057:
        r0 = r6.hasNext();
        if (r0 == 0) goto L_0x0094;
    L_0x005d:
        r0 = r6.next();
        r0 = (java.lang.String) r0;
        r1 = android.os.Build.class;
        r1 = r1.getField(r0);	 Catch:{ Exception -> 0x008a, all -> 0x008f }
        r7 = 0;
        r1 = r1.get(r7);	 Catch:{ Exception -> 0x008a, all -> 0x008f }
        r1 = (java.lang.String) r1;	 Catch:{ Exception -> 0x008a, all -> 0x008f }
        r0 = r5.get(r0);	 Catch:{ Exception -> 0x008a, all -> 0x008f }
        r0 = (java.lang.String) r0;	 Catch:{ Exception -> 0x008a, all -> 0x008f }
        if (r1 == 0) goto L_0x009b;
    L_0x0078:
        r1 = r1.toLowerCase();	 Catch:{ Exception -> 0x008a, all -> 0x008f }
    L_0x007c:
        if (r1 == 0) goto L_0x0099;
    L_0x007e:
        r0 = r1.contains(r0);	 Catch:{ Exception -> 0x008a, all -> 0x008f }
        if (r0 == 0) goto L_0x0099;
    L_0x0084:
        r0 = 49;
    L_0x0086:
        r4.append(r0);
        goto L_0x0057;
    L_0x008a:
        r0 = move-exception;
        r4.append(r2);
        goto L_0x0057;
    L_0x008f:
        r0 = move-exception;
        r4.append(r2);
        throw r0;
    L_0x0094:
        r0 = r4.toString();
        return r0;
    L_0x0099:
        r0 = r2;
        goto L_0x0086;
    L_0x009b:
        r1 = r3;
        goto L_0x007c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.b.a.a.b.b.t():java.lang.String");
    }

    public static String m284t(Context context) {
        try {
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = registerReceiver.getIntExtra("level", -1);
            int intExtra2 = registerReceiver.getIntExtra(Downloads.COLUMN_STATUS, -1);
            Object obj = (intExtra2 == 2 || intExtra2 == 5) ? 1 : null;
            return (obj != null ? Constants.VIA_TO_TYPE_QQ_GROUP : Constants.VIA_RESULT_SUCCESS) + ":" + intExtra;
        } catch (Exception e) {
            return Constants.STR_EMPTY;
        }
    }

    public static String m285u() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("00" + ":");
        Map linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("ro.hardware", "goldfish");
        linkedHashMap.put("ro.kernel.qemu", Constants.VIA_TO_TYPE_QQ_GROUP);
        linkedHashMap.put("ro.product.device", "generic");
        linkedHashMap.put("ro.product.model", "sdk");
        linkedHashMap.put("ro.product.brand", "generic");
        linkedHashMap.put("ro.product.name", "sdk");
        linkedHashMap.put("ro.build.fingerprint", "test-keys");
        linkedHashMap.put("ro.product.manufacturer", "unknow");
        for (String str : linkedHashMap.keySet()) {
            String str2 = (String) linkedHashMap.get(str);
            String str3 = C0110a.m236b(str3, Constants.STR_EMPTY);
            char c = (str3 == null || !str3.contains(str2)) ? '0' : '1';
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

    private static String m286v() {
        try {
            List<NetworkInterface> list = Collections.list(NetworkInterface.getNetworkInterfaces());
            if (list != null) {
                for (NetworkInterface networkInterface : list) {
                    if (networkInterface != null && networkInterface.getName() != null && networkInterface.getName().equalsIgnoreCase("wlan0")) {
                        byte[] hardwareAddress = networkInterface.getHardwareAddress();
                        if (hardwareAddress == null) {
                            return "02:00:00:00:00:00";
                        }
                        StringBuilder stringBuilder = new StringBuilder();
                        int length = hardwareAddress.length;
                        for (int i = 0; i < length; i++) {
                            stringBuilder.append(String.format("%02X:", new Object[]{Integer.valueOf(hardwareAddress[i] & MotionEventCompat.ACTION_MASK)}));
                        }
                        if (stringBuilder.length() > 0) {
                            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                        }
                        return stringBuilder.toString();
                    }
                }
            }
        } catch (Exception e) {
        }
        return "02:00:00:00:00:00";
    }

    private static String m287w() {
        FileReader fileReader;
        Throwable th;
        BufferedReader bufferedReader = null;
        FileReader fileReader2;
        BufferedReader bufferedReader2;
        try {
            fileReader2 = new FileReader("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq");
            try {
                bufferedReader2 = new BufferedReader(fileReader2, AsyncHttpClient.DEFAULT_SOCKET_BUFFER_SIZE);
                try {
                    String readLine = bufferedReader2.readLine();
                    if (C0110a.m234a(readLine)) {
                        try {
                            bufferedReader2.close();
                        } catch (Exception e) {
                        }
                        try {
                            fileReader2.close();
                        } catch (Exception e2) {
                        }
                        return Constants.STR_EMPTY;
                    }
                    readLine = readLine.trim();
                    try {
                        bufferedReader2.close();
                    } catch (Exception e3) {
                    }
                    try {
                        fileReader2.close();
                        return readLine;
                    } catch (Exception e4) {
                        return readLine;
                    }
                } catch (Exception e5) {
                    bufferedReader = bufferedReader2;
                    fileReader = fileReader2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (Exception e6) {
                        }
                    }
                    if (fileReader != null) {
                        try {
                            fileReader.close();
                        } catch (Exception e7) {
                        }
                    }
                    return Constants.STR_EMPTY;
                } catch (Throwable th2) {
                    th = th2;
                    if (bufferedReader2 != null) {
                        try {
                            bufferedReader2.close();
                        } catch (Exception e8) {
                        }
                    }
                    if (fileReader2 != null) {
                        try {
                            fileReader2.close();
                        } catch (Exception e9) {
                        }
                    }
                    throw th;
                }
            } catch (Exception e10) {
                fileReader = fileReader2;
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                if (fileReader != null) {
                    fileReader.close();
                }
                return Constants.STR_EMPTY;
            } catch (Throwable th3) {
                Throwable th4 = th3;
                bufferedReader2 = null;
                th = th4;
                if (bufferedReader2 != null) {
                    bufferedReader2.close();
                }
                if (fileReader2 != null) {
                    fileReader2.close();
                }
                throw th;
            }
        } catch (Exception e11) {
            fileReader = null;
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            if (fileReader != null) {
                fileReader.close();
            }
            return Constants.STR_EMPTY;
        } catch (Throwable th32) {
            fileReader2 = null;
            th = th32;
            bufferedReader2 = null;
            if (bufferedReader2 != null) {
                bufferedReader2.close();
            }
            if (fileReader2 != null) {
                fileReader2.close();
            }
            throw th;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m288x() {
        /*
        r2 = 0;
        r6 = 1;
        r1 = "/proc/cpuinfo";
        r0 = "";
        r3 = new java.io.FileReader;	 Catch:{ Exception -> 0x0042, all -> 0x0051 }
        r3.<init>(r1);	 Catch:{ Exception -> 0x0042, all -> 0x0051 }
        r1 = new java.io.BufferedReader;	 Catch:{ Exception -> 0x006e, all -> 0x0069 }
        r4 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;
        r1.<init>(r3, r4);	 Catch:{ Exception -> 0x006e, all -> 0x0069 }
    L_0x0012:
        r2 = r1.readLine();	 Catch:{ Exception -> 0x0072, all -> 0x006c }
        if (r2 == 0) goto L_0x003b;
    L_0x0018:
        r4 = com.alipay.p011b.p012a.p013a.p014a.C0110a.m234a(r2);	 Catch:{ Exception -> 0x0072, all -> 0x006c }
        if (r4 != 0) goto L_0x0012;
    L_0x001e:
        r4 = ":";
        r2 = r2.split(r4);	 Catch:{ Exception -> 0x0072, all -> 0x006c }
        if (r2 == 0) goto L_0x0012;
    L_0x0026:
        r4 = r2.length;	 Catch:{ Exception -> 0x0072, all -> 0x006c }
        if (r4 <= r6) goto L_0x0012;
    L_0x0029:
        r4 = 0;
        r4 = r2[r4];	 Catch:{ Exception -> 0x0072, all -> 0x006c }
        r5 = "BogoMIPS";
        r4 = r4.contains(r5);	 Catch:{ Exception -> 0x0072, all -> 0x006c }
        if (r4 == 0) goto L_0x0012;
    L_0x0034:
        r4 = 1;
        r2 = r2[r4];	 Catch:{ Exception -> 0x0072, all -> 0x006c }
        r0 = r2.trim();	 Catch:{ Exception -> 0x0072, all -> 0x006c }
    L_0x003b:
        r3.close();	 Catch:{ Exception -> 0x005f }
    L_0x003e:
        r1.close();	 Catch:{ Exception -> 0x0061 }
    L_0x0041:
        return r0;
    L_0x0042:
        r1 = move-exception;
        r1 = r2;
    L_0x0044:
        if (r2 == 0) goto L_0x0049;
    L_0x0046:
        r2.close();	 Catch:{ Exception -> 0x0063 }
    L_0x0049:
        if (r1 == 0) goto L_0x0041;
    L_0x004b:
        r1.close();	 Catch:{ Exception -> 0x004f }
        goto L_0x0041;
    L_0x004f:
        r1 = move-exception;
        goto L_0x0041;
    L_0x0051:
        r0 = move-exception;
        r1 = r2;
        r3 = r2;
    L_0x0054:
        if (r3 == 0) goto L_0x0059;
    L_0x0056:
        r3.close();	 Catch:{ Exception -> 0x0065 }
    L_0x0059:
        if (r1 == 0) goto L_0x005e;
    L_0x005b:
        r1.close();	 Catch:{ Exception -> 0x0067 }
    L_0x005e:
        throw r0;
    L_0x005f:
        r2 = move-exception;
        goto L_0x003e;
    L_0x0061:
        r1 = move-exception;
        goto L_0x0041;
    L_0x0063:
        r2 = move-exception;
        goto L_0x0049;
    L_0x0065:
        r2 = move-exception;
        goto L_0x0059;
    L_0x0067:
        r1 = move-exception;
        goto L_0x005e;
    L_0x0069:
        r0 = move-exception;
        r1 = r2;
        goto L_0x0054;
    L_0x006c:
        r0 = move-exception;
        goto L_0x0054;
    L_0x006e:
        r1 = move-exception;
        r1 = r2;
        r2 = r3;
        goto L_0x0044;
    L_0x0072:
        r2 = move-exception;
        r2 = r3;
        goto L_0x0044;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.b.a.a.b.b.x():java.lang.String");
    }

    private static String m289y() {
        String str = Constants.STR_EMPTY;
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null && !defaultAdapter.isEnabled()) {
                return Constants.STR_EMPTY;
            }
            str = defaultAdapter.getAddress();
            return str == null ? Constants.STR_EMPTY : str;
        } catch (Exception e) {
        }
    }

    private static String m290z() {
        try {
            Enumeration networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration inetAddresses = ((NetworkInterface) networkInterfaces.nextElement()).getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddress = (InetAddress) inetAddresses.nextElement();
                    if (!inetAddress.isLoopbackAddress() && (inetAddress instanceof Inet4Address)) {
                        return inetAddress.getHostAddress().toString();
                    }
                }
            }
        } catch (Exception e) {
        }
        return Constants.STR_EMPTY;
    }

    public final String m291e() {
        try {
            return String.valueOf(new File("/sys/devices/system/cpu/").listFiles(new C0114c(this)).length);
        } catch (Exception e) {
            return Constants.VIA_TO_TYPE_QQ_GROUP;
        }
    }
}
