package com.amap.p003a;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.sina.weibo.sdk.exception.WeiboAuthException;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.tencent.android.tpush.XGPushNotificationBuilder;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: LocNetManager */
/* renamed from: com.amap.a.bj */
public final class bj {
    private static bj f383i;
    ah f384a;
    aj f385b;
    boolean f386c;
    long f387d;
    boolean f388e;
    public String f389f;
    int f390g;
    boolean f391h;
    private Object f392j;
    private String f393k;
    private int f394l;

    static {
        f383i = null;
    }

    private bj(Context context) {
        this.f384a = null;
        this.f385b = null;
        this.f392j = null;
        this.f393k = "apilocatesrc.amap.com";
        this.f386c = false;
        this.f387d = 0;
        this.f388e = true;
        this.f389f = "com.autonavi.httpdns.HttpDnsManager";
        this.f390g = 0;
        this.f394l = bc.f351e;
        this.f391h = false;
        try {
            if (this.f392j == null && !this.f391h) {
                cj a = bc.m324a("HttpDNS", "1.0.0");
                this.f391h = br.m438a(context, a);
                if (this.f391h) {
                    this.f392j = InstanceFactory.m717a(context, a, this.f389f, null, new Class[]{Context.class}, new Object[]{context});
                    br.m434a(context, "HttpDns", this.f392j == null ? 0 : 1);
                } else {
                    this.f391h = true;
                }
            }
        } catch (Throwable th) {
            bc.m330a(th, "APS", "initHttpDns");
        }
        this.f384a = ah.m149a();
    }

    public static int m362a(NetworkInfo networkInfo) {
        return (networkInfo != null && networkInfo.isAvailable() && networkInfo.isConnected()) ? networkInfo.getType() : -1;
    }

    public static synchronized bj m363a(Context context) {
        bj bjVar;
        synchronized (bj.class) {
            if (f383i == null) {
                f383i = new bj(context);
            }
            bjVar = f383i;
        }
        return bjVar;
    }

    private String m364a(Context context, String str) {
        if (m367c(context)) {
            try {
                return (String) bp.m426a(this.f392j, "getIpByHostAsync", str);
            } catch (Throwable th) {
                br.m440b(context, "HttpDns", 0);
            }
        }
        return null;
    }

    public static String m365a(byte[] bArr, Context context, String str, boolean z) {
        if (bj.m362a(bu.m486c(context)) == -1) {
            return null;
        }
        String str2;
        Map hashMap = new HashMap();
        am bkVar = new bk(context, bc.m324a("loc", "3.0.0"));
        hashMap.clear();
        hashMap.put("Content-Type", "application/x-www-form-urlencoded");
        hashMap.put("Connection", "Keep-Alive");
        if (z) {
            hashMap.put("User-Agent", "AMAP_Location_SDK_Android 3.0.0");
            Map hashMap2 = new HashMap();
            hashMap2.put(XGPushNotificationBuilder.CUSTOM_NOTIFICATION_BUILDER_TYPE, "26260A1F00020002");
            hashMap2.put("key", cb.m523f(context));
            String a = cd.m536a();
            String a2 = cd.m537a(context, a, ck.m626b(hashMap2));
            hashMap2.put("ts", a);
            hashMap2.put("scode", a2);
            bkVar.m371b(bArr);
            bkVar.f399j = true;
            bkVar.f400k = String.format(Locale.US, "platform=Android&sdkversion=%s&product=%s&loc_channel=%s", new Object[]{"3.0.0", "loc", Integer.valueOf(3)});
            bkVar.f401l = hashMap2;
        }
        bkVar.f395f = hashMap;
        bkVar.f396g = str;
        if (!z) {
            bkVar.f397h = bArr;
        }
        bkVar.f179e = ch.m591a(context);
        bkVar.f177c = bc.f351e;
        bkVar.f178d = bc.f351e;
        try {
            str2 = new String(ah.m151a(bkVar), "utf-8");
        } catch (Throwable th) {
            bc.m330a(th, "LocNetManager", "post");
            str2 = null;
        }
        return str2;
    }

    private static boolean m366b(Context context) {
        int parseInt;
        String str = null;
        try {
            if (VERSION.SDK_INT >= 14) {
                str = System.getProperty("http.proxyHost");
                String property = System.getProperty("http.proxyPort");
                if (property == null) {
                    property = WeiboAuthException.DEFAULT_AUTH_ERROR_CODE;
                }
                parseInt = Integer.parseInt(property);
            } else {
                str = Proxy.getHost(context);
                parseInt = Proxy.getPort(context);
            }
        } catch (Throwable th) {
            th.printStackTrace();
            parseInt = -1;
        }
        return (str == null || parseInt == -1) ? false : true;
    }

    private boolean m367c(Context context) {
        return (this.f392j == null || bj.m366b(context)) ? false : true;
    }

    public final an m368a(Context context, JSONObject jSONObject, bm bmVar, String str, boolean z) {
        if (bu.m473a(jSONObject, "httptimeout")) {
            try {
                this.f394l = jSONObject.getInt("httptimeout");
            } catch (Throwable th) {
                bc.m330a(th, "LocNetManager", "req");
            }
        }
        if (bj.m362a(bu.m486c(context)) == -1) {
            return null;
        }
        Map hashMap = new HashMap();
        am bkVar = new bk(context, bc.m324a("loc", "3.0.0"));
        hashMap.clear();
        hashMap.put("Content-Type", "application/octet-stream");
        hashMap.put("Accept-Encoding", "gzip");
        hashMap.put("gzipped", "1");
        hashMap.put("Connection", "Keep-Alive");
        hashMap.put("User-Agent", "AMAP_Location_SDK_Android 3.0.0");
        hashMap.put("KEY", cb.m523f(context));
        hashMap.put("enginever", "4.2");
        String a = cd.m536a();
        String a2 = cd.m537a(context, a, "key=" + cb.m523f(context));
        hashMap.put("ts", a);
        hashMap.put("scode", a2);
        a = "loc";
        if (!z) {
            a = "locf";
        }
        hashMap.put("encr", "1");
        bkVar.f399j = z;
        bkVar.f400k = String.format(Locale.US, "platform=Android&sdkversion=%s&product=%s&loc_channel=%s", new Object[]{"3.0.0", a, Integer.valueOf(3)});
        bkVar.f395f = hashMap;
        bkVar.f396g = str;
        bkVar.f397h = bu.m475a(bmVar.m384a());
        bkVar.f179e = ch.m591a(context);
        Map hashMap2 = new HashMap();
        hashMap2.put("output", "bin");
        hashMap2.put("policy", "2103");
        bkVar.f401l = hashMap2;
        bkVar.f177c = this.f394l;
        bkVar.f178d = this.f394l;
        this.f386c = false;
        boolean optBoolean = jSONObject.optBoolean("locationProtocol", false);
        if (optBoolean) {
            bkVar.f396g = bkVar.f396g.replace("http", "https");
        } else {
            Object obj = (!bu.m481b(bt.m449a(context, "pref", "dns_faile_time"), System.currentTimeMillis()) || bt.m449a(context, "pref", "dns_faile_count") < 3) ? 1 : null;
            if (obj != null && m367c(context)) {
                CharSequence a3 = m364a(context, this.f393k);
                if (!z && TextUtils.isEmpty(a3)) {
                    a3 = bt.m450a(context, "ip", "last_ip", LetterIndexBar.SEARCH_ICON_LETTER);
                }
                if (!TextUtils.isEmpty(a3)) {
                    this.f386c = true;
                    String str2 = "last_ip";
                    try {
                        Editor edit = context.getSharedPreferences("ip", 0).edit();
                        edit.putString(str2, a3);
                        bt.m454a(edit);
                    } catch (Throwable th2) {
                        bc.m330a(th2, "SPUtil", "setPrefsInt");
                    }
                    bkVar.f396g = bc.m333b().replace("apilocatesrc.amap.com", a3);
                    bkVar.f395f.put("host", "apilocatesrc.amap.com");
                }
            }
        }
        long b = bu.m477b();
        try {
            an a4 = ah.m150a(bkVar, optBoolean);
            this.f390g = Long.valueOf(bu.m477b() - b).intValue();
            if (!this.f386c) {
                return a4;
            }
            bt.m452a(context, "pref", "dns_faile_time", 0);
            bt.m452a(context, "pref", "dns_faile_count", 0);
            this.f388e = true;
            this.f387d = 0;
            return a4;
        } catch (Throwable th3) {
            if (this.f386c) {
                this.f387d = bt.m449a(context, "pref", "dns_faile_count");
                long a5 = bt.m449a(context, "pref", "dns_faile_time");
                b = System.currentTimeMillis();
                if (a5 == 0) {
                    bt.m452a(context, "pref", "dns_faile_time", b);
                }
                if (bu.m481b(a5, b)) {
                    this.f388e = bt.m456b(context, "pref", "dns_last_success", true);
                } else {
                    if (this.f387d >= 3) {
                        this.f388e = false;
                    } else {
                        this.f388e = true;
                    }
                    bt.m453a(context, "pref", "dns_last_success", this.f388e);
                    this.f387d = 0;
                }
                this.f387d++;
                bt.m452a(context, "pref", "dns_faile_count", this.f387d);
                bt.m452a(context, "pref", "dns_faile_time", b);
                if (this.f387d >= 3 && !this.f388e) {
                    bs.m444a(context, "HttpDNS", "dns faile too much");
                }
            }
        }
    }
}
