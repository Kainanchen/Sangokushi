package com.tencent.p080b.p081a;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.support.v4.view.PointerIconCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.protobuf.CodedOutputStream;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.tencent.p063a.p064a.p065a.p066a.C1027g;
import com.tencent.p080b.p081a.p083b.C1039b;
import com.tencent.p080b.p081a.p083b.C1049l;
import com.tencent.p080b.p081a.p083b.C1054q;
import com.tencent.p080b.p081a.p083b.C1055r;
import java.net.URI;
import java.util.Iterator;
import java.util.Random;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.b.a.c */
public final class C1058c {
    private static int f8107A;
    private static String f8108B;
    private static String f8109C;
    private static String f8110D;
    private static String f8111E;
    private static int f8112F;
    private static int f8113G;
    private static long f8114H;
    private static long f8115I;
    private static volatile String f8116J;
    private static int f8117K;
    private static volatile int f8118L;
    private static int f8119M;
    private static int f8120N;
    private static boolean f8121O;
    private static int f8122P;
    private static boolean f8123Q;
    private static String f8124R;
    private static boolean f8125S;
    private static ag f8126T;
    static af f8127a;
    static af f8128b;
    static String f8129c;
    static String f8130d;
    static String f8131e;
    static String f8132f;
    static boolean f8133g;
    static int f8134h;
    static long f8135i;
    static boolean f8136j;
    public static boolean f8137k;
    static volatile String f8138l;
    static boolean f8139m;
    static int f8140n;
    static long f8141o;
    static int f8142p;
    private static C1039b f8143q;
    private static C1059d f8144r;
    private static boolean f8145s;
    private static boolean f8146t;
    private static int f8147u;
    private static int f8148v;
    private static int f8149w;
    private static int f8150x;
    private static int f8151y;
    private static int f8152z;

    static {
        f8143q = C1049l.m5693c();
        f8127a = new af(2);
        f8128b = new af(1);
        f8144r = C1059d.APP_LAUNCH;
        f8145s = false;
        f8146t = true;
        f8147u = 30000;
        f8148v = 100000;
        f8149w = 30;
        f8150x = 10;
        f8151y = 100;
        f8152z = 30;
        f8107A = 1;
        f8129c = "__HIBERNATE__";
        f8130d = "__HIBERNATE__TIME";
        f8131e = "__MTA_KILL__";
        f8108B = null;
        f8111E = "mta_channel";
        f8132f = LetterIndexBar.SEARCH_ICON_LETTER;
        f8112F = 180;
        f8133g = false;
        f8134h = 100;
        f8135i = 10000;
        f8113G = AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT;
        f8136j = true;
        f8114H = 0;
        f8115I = 300000;
        f8137k = true;
        f8138l = "pingma.qq.com:80";
        f8116J = "http://pingma.qq.com:80/mstat/report";
        f8117K = 0;
        f8118L = 0;
        f8119M = 20;
        f8120N = 0;
        f8121O = false;
        f8122P = CodedOutputStream.DEFAULT_BUFFER_SIZE;
        f8123Q = false;
        f8124R = null;
        f8125S = false;
        f8126T = null;
        f8139m = true;
        f8140n = 0;
        f8141o = 10000;
        f8142p = AccessibilityNodeInfoCompat.ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY;
    }

    public static C1059d m5747a() {
        return f8144r;
    }

    public static synchronized String m5748a(Context context) {
        String str;
        synchronized (C1058c.class) {
            if (f8109C != null) {
                str = f8109C;
            } else {
                if (context != null) {
                    if (f8109C == null) {
                        f8109C = C1049l.m5701f(context);
                    }
                }
                if (f8109C == null || f8109C.trim().length() == 0) {
                    f8143q.m5667d("AppKey can not be null or empty, please read Developer's Guide first!");
                }
                str = f8109C;
            }
        }
        return str;
    }

    static String m5749a(String str) {
        try {
            String string = f8128b.f8000b.getString(str);
            if (string != null) {
                return string;
            }
        } catch (Throwable th) {
            f8143q.m5666c("can't find custom key:" + str);
        }
        return null;
    }

    private static void m5750a(long j) {
        C1054q.m5732a(ai.m5654a(), f8129c, j);
        C1058c.m5757a(false);
        f8143q.m5664b((Object) "MTA is disable for current SDK version");
    }

    static void m5751a(Context context, af afVar) {
        if (afVar.f7999a == f8128b.f7999a) {
            f8128b = afVar;
            C1058c.m5756a(afVar.f8000b);
            if (!f8128b.f8000b.isNull("iplist")) {
                C1062g a = C1062g.m5813a(context);
                String string = f8128b.f8000b.getString("iplist");
                if (f8145s) {
                    a.f8194g.m5662a("updateIpList " + string);
                }
                try {
                    if (C1049l.m5695c(string)) {
                        JSONObject jSONObject = new JSONObject(string);
                        if (jSONObject.length() > 0) {
                            Iterator keys = jSONObject.keys();
                            while (keys.hasNext()) {
                                string = jSONObject.getString((String) keys.next());
                                if (C1049l.m5695c(string)) {
                                    for (String str : string.split(";")) {
                                        String str2;
                                        if (C1049l.m5695c(str2)) {
                                            String[] split = str2.split(":");
                                            if (split.length > 1) {
                                                str2 = split[0];
                                                if (C1062g.m5814a(str2) && !a.f8188a.contains(str2)) {
                                                    if (f8145s) {
                                                        a.f8194g.m5662a("add new ip:" + str2);
                                                    }
                                                    a.f8188a.add(str2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable e) {
                    a.f8194g.m5665b(e);
                }
                a.f8192e = new Random().nextInt(a.f8188a.size());
            }
        } else if (afVar.f7999a == f8127a.f7999a) {
            f8127a = afVar;
        }
    }

    private static void m5752a(Context context, af afVar, JSONObject jSONObject) {
        try {
            String str;
            Object obj;
            Iterator keys = jSONObject.keys();
            Object obj2 = null;
            while (keys.hasNext()) {
                str = (String) keys.next();
                if (str.equalsIgnoreCase("v")) {
                    int i = jSONObject.getInt(str);
                    if (afVar.f8002d != i) {
                        obj = 1;
                    } else {
                        obj = obj2;
                    }
                    afVar.f8002d = i;
                    obj2 = obj;
                } else if (str.equalsIgnoreCase("c")) {
                    str = jSONObject.getString("c");
                    if (str.length() > 0) {
                        afVar.f8000b = new JSONObject(str);
                    }
                } else {
                    try {
                        if (str.equalsIgnoreCase("m")) {
                            afVar.f8001c = jSONObject.getString("m");
                        }
                    } catch (JSONException e) {
                        f8143q.m5670g("__HIBERNATE__ not found.");
                    } catch (Throwable th) {
                        f8143q.m5665b(th);
                    }
                }
            }
            if (obj2 == 1) {
                C1073r a = C1073r.m5835a(ai.m5654a());
                if (!(a == null || afVar == null)) {
                    a.f8217a.m5674a(new C1078w(a, afVar));
                }
                if (afVar.f7999a == f8128b.f7999a) {
                    C1058c.m5756a(afVar.f8000b);
                    JSONObject jSONObject2 = afVar.f8000b;
                    if (!(jSONObject2 == null || jSONObject2.length() == 0)) {
                        Context a2 = ai.m5654a();
                        try {
                            str = jSONObject2.optString(f8131e);
                            if (C1049l.m5695c(str)) {
                                JSONObject jSONObject3 = new JSONObject(str);
                                if (jSONObject3.length() != 0) {
                                    if (!jSONObject3.isNull("sm")) {
                                        obj = jSONObject3.get("sm");
                                        int intValue = obj instanceof Integer ? ((Integer) obj).intValue() : obj instanceof String ? Integer.valueOf((String) obj).intValue() : 0;
                                        if (intValue > 0) {
                                            if (f8145s) {
                                                f8143q.m5662a("match sleepTime:" + intValue + " minutes");
                                            }
                                            C1054q.m5732a(a2, f8130d, System.currentTimeMillis() + ((long) ((intValue * 60) * PointerIconCompat.TYPE_DEFAULT)));
                                            C1058c.m5757a(false);
                                            f8143q.m5664b((Object) "MTA is disable for current SDK version");
                                        }
                                    }
                                    if (C1058c.m5758a(jSONObject3, "sv", "2.0.3")) {
                                        f8143q.m5662a((Object) "match sdk version:2.0.3");
                                        obj = 1;
                                    } else {
                                        obj = null;
                                    }
                                    if (C1058c.m5758a(jSONObject3, "md", Build.MODEL)) {
                                        f8143q.m5662a("match MODEL:" + Build.MODEL);
                                        obj = 1;
                                    }
                                    if (C1058c.m5758a(jSONObject3, "av", C1049l.m5706i(a2))) {
                                        f8143q.m5662a("match app version:" + C1049l.m5706i(a2));
                                        obj = 1;
                                    }
                                    if (C1058c.m5758a(jSONObject3, "mf", Build.MANUFACTURER)) {
                                        f8143q.m5662a("match MANUFACTURER:" + Build.MANUFACTURER);
                                        obj = 1;
                                    }
                                    if (C1058c.m5758a(jSONObject3, "osv", VERSION.SDK_INT)) {
                                        f8143q.m5662a("match android SDK version:" + VERSION.SDK_INT);
                                        obj = 1;
                                    }
                                    if (C1058c.m5758a(jSONObject3, "ov", VERSION.SDK_INT)) {
                                        f8143q.m5662a("match android SDK version:" + VERSION.SDK_INT);
                                        obj = 1;
                                    }
                                    if (C1058c.m5758a(jSONObject3, "ui", C1073r.m5835a(a2).m5860b(a2).f8025a)) {
                                        f8143q.m5662a("match imei:" + C1073r.m5835a(a2).m5860b(a2).f8025a);
                                        obj = 1;
                                    }
                                    if (C1058c.m5758a(jSONObject3, "mid", C1058c.m5770e(a2))) {
                                        f8143q.m5662a("match mid:" + C1058c.m5770e(a2));
                                        obj = 1;
                                    }
                                    if (obj != null) {
                                        C1058c.m5750a(C1049l.m5691b("2.0.3"));
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            f8143q.m5665b(th2);
                        }
                        str = jSONObject2.getString(f8129c);
                        if (f8145s) {
                            f8143q.m5670g("hibernateVer:" + str + ", current version:2.0.3");
                        }
                        long b = C1049l.m5691b(str);
                        if (C1049l.m5691b("2.0.3") <= b) {
                            C1058c.m5750a(b);
                        }
                    }
                }
            }
            C1058c.m5751a(context, afVar);
        } catch (Throwable th22) {
            f8143q.m5665b(th22);
        } catch (Throwable th222) {
            f8143q.m5665b(th222);
        }
    }

    public static void m5753a(Context context, String str) {
        if (context == null) {
            f8143q.m5667d("ctx in StatConfig.setAppKey() is null");
        } else if (str == null || str.length() > AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) {
            f8143q.m5667d("appkey in StatConfig.setAppKey() is null or exceed 256 bytes");
        } else {
            if (f8109C == null) {
                f8109C = C1055r.m5736a(C1054q.m5731a(context, "_mta_ky_tag_", null));
            }
            if ((C1058c.m5768d(str) | C1058c.m5768d(C1049l.m5701f(context))) != 0) {
                String str2 = f8109C;
                if (str2 != null) {
                    C1054q.m5734b(context, "_mta_ky_tag_", C1055r.m5740b(str2));
                }
            }
        }
    }

    static void m5754a(Context context, JSONObject jSONObject) {
        try {
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                if (str.equalsIgnoreCase(Integer.toString(f8128b.f7999a))) {
                    C1058c.m5752a(context, f8128b, jSONObject.getJSONObject(str));
                } else if (str.equalsIgnoreCase(Integer.toString(f8127a.f7999a))) {
                    C1058c.m5752a(context, f8127a, jSONObject.getJSONObject(str));
                } else if (str.equalsIgnoreCase("rs")) {
                    C1059d a = C1059d.m5787a(jSONObject.getInt(str));
                    if (a != null) {
                        f8144r = a;
                        if (f8145s) {
                            f8143q.m5670g("Change to ReportStrategy:" + a.name());
                        }
                    }
                } else {
                    return;
                }
            }
        } catch (Throwable e) {
            f8143q.m5665b(e);
        }
    }

    public static void m5755a(C1059d c1059d) {
        f8144r = c1059d;
        if (c1059d != C1059d.PERIOD) {
            C1060e.f8164c = 0;
        }
        if (f8145s) {
            f8143q.m5670g("Change to statSendStrategy: " + c1059d);
        }
    }

    private static void m5756a(JSONObject jSONObject) {
        try {
            C1059d a = C1059d.m5787a(jSONObject.getInt("rs"));
            if (a != null) {
                C1058c.m5755a(a);
            }
        } catch (JSONException e) {
            if (f8145s) {
                f8143q.m5662a((Object) "rs not found.");
            }
        }
    }

    public static void m5757a(boolean z) {
        f8146t = z;
        if (!z) {
            f8143q.m5664b((Object) "!!!!!!MTA StatService has been disabled!!!!!!");
        }
    }

    private static boolean m5758a(JSONObject jSONObject, String str, String str2) {
        if (!jSONObject.isNull(str)) {
            String optString = jSONObject.optString(str);
            if (C1049l.m5695c(str2) && C1049l.m5695c(optString) && str2.equalsIgnoreCase(optString)) {
                return true;
            }
        }
        return false;
    }

    public static synchronized String m5759b(Context context) {
        String str;
        synchronized (C1058c.class) {
            if (f8110D != null) {
                str = f8110D;
            } else {
                str = C1054q.m5731a(context, f8111E, LetterIndexBar.SEARCH_ICON_LETTER);
                f8110D = str;
                if (str == null || f8110D.trim().length() == 0) {
                    f8110D = C1049l.m5702g(context);
                }
                if (f8110D == null || f8110D.trim().length() == 0) {
                    f8143q.m5666c("installChannel can not be null or empty, please read Developer's Guide first!");
                }
                str = f8110D;
            }
        }
        return str;
    }

    public static void m5760b(Context context, String str) {
        if (str.length() > AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS) {
            f8143q.m5667d("the length of installChannel can not exceed the range of 128 bytes.");
            return;
        }
        f8110D = str;
        C1054q.m5734b(context, f8111E, str);
    }

    public static void m5761b(String str) {
        if (str.length() > AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS) {
            f8143q.m5667d("the length of installChannel can not exceed the range of 128 bytes.");
        } else {
            f8110D = str;
        }
    }

    public static boolean m5762b() {
        return f8145s;
    }

    public static String m5763c(Context context) {
        return C1054q.m5731a(context, "mta.acc.qq", f8132f);
    }

    public static void m5764c(String str) {
        if (str == null || str.length() == 0) {
            f8143q.m5667d("statReportUrl cannot be null or empty.");
            return;
        }
        f8116J = str;
        try {
            f8138l = new URI(f8116J).getHost();
        } catch (Exception e) {
            f8143q.m5666c(e);
        }
        if (f8145s) {
            f8143q.m5662a("url:" + f8116J + ", domain:" + f8138l);
        }
    }

    public static boolean m5765c() {
        return f8146t;
    }

    public static int m5766d() {
        return f8151y;
    }

    public static String m5767d(Context context) {
        if (context == null) {
            f8143q.m5667d("Context for getCustomUid is null.");
            return null;
        }
        if (f8124R == null) {
            f8124R = C1054q.m5731a(context, "MTA_CUSTOM_UID", LetterIndexBar.SEARCH_ICON_LETTER);
        }
        return f8124R;
    }

    private static boolean m5768d(String str) {
        if (str == null) {
            return false;
        }
        if (f8109C == null) {
            f8109C = str;
            return true;
        } else if (f8109C.contains(str)) {
            return false;
        } else {
            f8109C += "|" + str;
            return true;
        }
    }

    public static int m5769e() {
        return f8152z;
    }

    public static String m5770e(Context context) {
        return context != null ? C1027g.m4645a(context).m4646a().f7175c : "0";
    }

    public static int m5771f() {
        return f8150x;
    }

    public static int m5772g() {
        return f8107A;
    }

    static int m5773h() {
        return f8149w;
    }

    public static int m5774i() {
        return f8148v;
    }

    public static void m5775j() {
        f8112F = 60;
    }

    public static int m5776k() {
        return f8112F;
    }

    public static void m5777l() {
        f8136j = true;
    }

    public static boolean m5778m() {
        return f8137k;
    }

    public static String m5779n() {
        return f8116J;
    }

    static synchronized void m5780o() {
        synchronized (C1058c.class) {
            f8118L = 0;
        }
    }

    public static int m5781p() {
        return f8119M;
    }

    static void m5782q() {
        f8120N++;
    }

    static void m5783r() {
        f8120N = 0;
    }

    static int m5784s() {
        return f8120N;
    }

    public static boolean m5785t() {
        return f8123Q;
    }

    public static ag m5786u() {
        return f8126T;
    }
}
