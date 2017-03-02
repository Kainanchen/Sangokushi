package com.alipay.sdk.data;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.widget.TextView;
import com.alipay.mobilesecuritysdk.face.SecurityClientMobile;
import com.alipay.sdk.app.statistic.C0144a;
import com.alipay.sdk.app.statistic.C0146c;
import com.alipay.sdk.cons.C0165a;
import com.alipay.sdk.cons.C0166b;
import com.alipay.sdk.sys.C0191b;
import com.alipay.sdk.tid.C0193b;
import com.alipay.sdk.util.C0194a;
import com.alipay.sdk.util.C0201h;
import com.alipay.sdk.util.C0204k;
import com.alipay.sdk.util.C0206l;
import com.tencent.connect.common.Constants;
import com.ut.device.AidConstants;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: com.alipay.sdk.data.c */
public final class C0170c {
    private static final String f387d = "virtualImeiAndImsi";
    private static final String f388e = "virtual_imei";
    private static final String f389f = "virtual_imsi";
    private static C0170c f390g;
    public String f391a;
    public String f392b;
    public String f393c;

    private String m485c() {
        return this.f393c;
    }

    private C0170c() {
        this.f392b = "sdk-and-lite";
    }

    public static synchronized C0170c m479a() {
        C0170c c0170c;
        synchronized (C0170c.class) {
            if (f390g == null) {
                f390g = new C0170c();
            }
            c0170c = f390g;
        }
        return c0170c;
    }

    public final synchronized void m492a(String str) {
        if (!TextUtils.isEmpty(str)) {
            PreferenceManager.getDefaultSharedPreferences(C0191b.m600a().f467a).edit().putString(C0166b.f358i, str).commit();
            C0165a.f336b = str;
        }
    }

    private static String m488d() {
        return Constants.VIA_TO_TYPE_QQ_GROUP;
    }

    private static String m480a(Context context) {
        return Float.toString(new TextView(context).getTextSize());
    }

    private static String m489e() {
        return "-1;-1";
    }

    private String m482a(C0193b c0193b) {
        String e;
        String a;
        Context context = C0191b.m600a().f467a;
        C0194a a2 = C0194a.m628a(context);
        if (TextUtils.isEmpty(this.f391a)) {
            String a3 = C0206l.m676a();
            String b = C0206l.m685b();
            e = C0206l.m695e(context);
            a = C0204k.m671a(context);
            this.f391a = "Msp/15.2.2" + " (" + a3 + C0201h.f510b + b + C0201h.f510b + e + C0201h.f510b + a.substring(0, a.indexOf("://")) + C0201h.f510b + C0206l.m696f(context) + C0201h.f510b + Float.toString(new TextView(context).getTextSize());
        }
        e = C0194a.m630b(context).f497p;
        a = "-1;-1";
        String str = Constants.VIA_TO_TYPE_QQ_GROUP;
        String a4 = a2.m636a();
        String b2 = a2.m637b();
        Context context2 = C0191b.m600a().f467a;
        SharedPreferences sharedPreferences = context2.getSharedPreferences(f387d, 0);
        CharSequence string = sharedPreferences.getString(f389f, null);
        if (TextUtils.isEmpty(string)) {
            if (TextUtils.isEmpty(C0193b.m619a().f472a)) {
                Object c = C0191b.m600a().m606c();
                string = TextUtils.isEmpty(c) ? C0170c.m483b() : c.substring(3, 18);
            } else {
                string = C0194a.m628a(context2).m636a();
            }
            sharedPreferences.edit().putString(f389f, string).commit();
        }
        CharSequence charSequence = string;
        Context context3 = C0191b.m600a().f467a;
        SharedPreferences sharedPreferences2 = context3.getSharedPreferences(f387d, 0);
        string = sharedPreferences2.getString(f388e, null);
        if (TextUtils.isEmpty(string)) {
            if (TextUtils.isEmpty(C0193b.m619a().f472a)) {
                string = C0170c.m483b();
            } else {
                string = C0194a.m628a(context3).m637b();
            }
            sharedPreferences2.edit().putString(f388e, string).commit();
        }
        CharSequence charSequence2 = string;
        if (c0193b != null) {
            this.f393c = c0193b.f473b;
        }
        String replace = Build.MANUFACTURER.replace(C0201h.f510b, " ");
        String replace2 = Build.MODEL.replace(C0201h.f510b, " ");
        boolean b3 = C0191b.m602b();
        String str2 = a2.f476a;
        WifiInfo connectionInfo = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo();
        String ssid = connectionInfo != null ? connectionInfo.getSSID() : "-1";
        connectionInfo = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo();
        String bssid = connectionInfo != null ? connectionInfo.getBSSID() : "00";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f391a).append(C0201h.f510b).append(e).append(C0201h.f510b).append(a).append(C0201h.f510b).append(str).append(C0201h.f510b).append(a4).append(C0201h.f510b).append(b2).append(C0201h.f510b).append(this.f393c).append(C0201h.f510b).append(replace).append(C0201h.f510b).append(replace2).append(C0201h.f510b).append(b3).append(C0201h.f510b).append(str2).append(";-1;-1;").append(this.f392b).append(C0201h.f510b).append(charSequence).append(C0201h.f510b).append(charSequence2).append(C0201h.f510b).append(ssid).append(C0201h.f510b).append(bssid);
        if (c0193b != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(C0166b.f352c, c0193b.f472a);
            hashMap.put(C0166b.f356g, C0191b.m600a().m606c());
            c = m493b(context, hashMap);
            if (!TextUtils.isEmpty(c)) {
                stringBuilder.append(C0201h.f510b).append(c);
            }
        }
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    private static String m490f() {
        Context context = C0191b.m600a().f467a;
        SharedPreferences sharedPreferences = context.getSharedPreferences(f387d, 0);
        String string = sharedPreferences.getString(f388e, null);
        if (TextUtils.isEmpty(string)) {
            if (TextUtils.isEmpty(C0193b.m619a().f472a)) {
                string = C0170c.m483b();
            } else {
                string = C0194a.m628a(context).m637b();
            }
            sharedPreferences.edit().putString(f388e, string).commit();
        }
        return string;
    }

    private static String m491g() {
        Context context = C0191b.m600a().f467a;
        SharedPreferences sharedPreferences = context.getSharedPreferences(f387d, 0);
        String string = sharedPreferences.getString(f389f, null);
        if (TextUtils.isEmpty(string)) {
            if (TextUtils.isEmpty(C0193b.m619a().f472a)) {
                Object c = C0191b.m600a().m606c();
                if (TextUtils.isEmpty(c)) {
                    string = C0170c.m483b();
                } else {
                    string = c.substring(3, 18);
                }
            } else {
                string = C0194a.m628a(context).m636a();
            }
            sharedPreferences.edit().putString(f389f, string).commit();
        }
        return string;
    }

    public static String m483b() {
        return Long.toHexString(System.currentTimeMillis()) + (new Random().nextInt(9000) + AidConstants.EVENT_REQUEST_STARTED);
    }

    private static String m484b(Context context) {
        WifiInfo connectionInfo = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo();
        if (connectionInfo != null) {
            return connectionInfo.getSSID();
        }
        return "-1";
    }

    private static String m486c(Context context) {
        WifiInfo connectionInfo = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo();
        if (connectionInfo != null) {
            return connectionInfo.getBSSID();
        }
        return "00";
    }

    static String m481a(Context context, HashMap<String, String> hashMap) {
        Object obj = Constants.STR_EMPTY;
        try {
            obj = SecurityClientMobile.GetApdid(context, hashMap);
        } catch (Throwable th) {
            C0144a.m399a(C0146c.f245e, C0146c.f247g, th);
        }
        if (TextUtils.isEmpty(obj)) {
            C0144a.m398a(C0146c.f245e, C0146c.f248h, "apdid == null");
        }
        return obj;
    }

    public final String m493b(Context context, HashMap<String, String> hashMap) {
        Future submit = Executors.newFixedThreadPool(2).submit(new C0171d(this, context, hashMap));
        String str = Constants.STR_EMPTY;
        try {
            return (String) submit.get(3000, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            C0144a.m399a(C0146c.f245e, C0146c.f249i, th);
            return str;
        }
    }
}
