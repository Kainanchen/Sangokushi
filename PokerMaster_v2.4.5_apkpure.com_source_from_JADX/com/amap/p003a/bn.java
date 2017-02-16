package com.amap.p003a;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.os.Build;
import android.support.v4.view.PointerIconCompat;
import android.text.TextUtils;
import com.amap.p003a.cc.AuthConfigManager;
import com.sina.weibo.sdk.constant.WBPageConstants.ParamKey;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: AuthUtil */
/* renamed from: com.amap.a.bn */
public final class bn {
    private static boolean f440A;
    private static int f441B;
    private static long f442C;
    private static ArrayList<String> f443D;
    private static String f444E;
    private static String f445F;
    private static boolean f446G;
    private static boolean f447H;
    private static int f448I;
    private static int f449J;
    private static boolean f450K;
    private static long f451L;
    private static int f452M;
    private static boolean f453N;
    private static boolean f454O;
    private static boolean f455P;
    private static boolean f456Q;
    private static List<bo> f457R;
    private static boolean f458S;
    private static long f459T;
    private static int f460U;
    private static int f461V;
    private static List<String> f462W;
    private static boolean f463X;
    private static int f464Y;
    static boolean f465a;
    private static String f466b;
    private static String f467c;
    private static String f468d;
    private static String f469e;
    private static String f470f;
    private static String f471g;
    private static boolean f472h;
    private static long f473i;
    private static long f474j;
    private static long f475k;
    private static boolean f476l;
    private static int f477m;
    private static boolean f478n;
    private static int f479o;
    private static boolean f480p;
    private static boolean f481q;
    private static int f482r;
    private static int f483s;
    private static int f484t;
    private static boolean f485u;
    private static boolean f486v;
    private static boolean f487w;
    private static int f488x;
    private static long f489y;
    private static ArrayList<String> f490z;

    /* renamed from: com.amap.a.bn.a */
    static class AuthUtil {
        boolean f436a;
        String f437b;
        boolean f438c;
        int f439d;

        AuthUtil() {
            this.f436a = false;
            this.f437b = "0";
            this.f438c = false;
            this.f439d = 5;
        }
    }

    static {
        f466b = "\u63d0\u793a\u4fe1\u606f";
        f467c = "\u786e\u8ba4";
        f468d = "\u53d6\u6d88";
        f469e = LetterIndexBar.SEARCH_ICON_LETTER;
        f470f = LetterIndexBar.SEARCH_ICON_LETTER;
        f471g = LetterIndexBar.SEARCH_ICON_LETTER;
        f472h = false;
        f473i = 0;
        f474j = 0;
        f475k = 5000;
        f476l = false;
        f477m = 0;
        f478n = false;
        f479o = 0;
        f480p = false;
        f481q = true;
        f482r = 3600000;
        f483s = 0;
        f484t = 0;
        f485u = true;
        f486v = true;
        f487w = true;
        f488x = -1;
        f489y = 0;
        f490z = new ArrayList();
        f440A = true;
        f441B = -1;
        f442C = 0;
        f443D = new ArrayList();
        f446G = false;
        f447H = false;
        f448I = 3000;
        f449J = 3000;
        f450K = true;
        f451L = 300000;
        f452M = -1;
        f453N = false;
        f454O = false;
        f455P = false;
        f456Q = false;
        f465a = false;
        f457R = new ArrayList();
        f458S = false;
        f459T = 0;
        f460U = 0;
        f461V = 0;
        f462W = new ArrayList();
        f463X = true;
        f464Y = 80;
    }

    private static AuthUtil m385a(JSONObject jSONObject, String str) {
        AuthUtil authUtil;
        Throwable th;
        if (jSONObject != null) {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject(str);
                if (jSONObject2 != null) {
                    authUtil = new AuthUtil();
                    try {
                        authUtil.f436a = cc.m535a(jSONObject2.optString("b"), false);
                        authUtil.f437b = jSONObject2.optString("t");
                        authUtil.f438c = cc.m535a(jSONObject2.getString("st"), false);
                        authUtil.f439d = jSONObject2.optInt("i", 0);
                        return authUtil;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
            } catch (Throwable th3) {
                Throwable th4 = th3;
                authUtil = null;
                th = th4;
                bc.m330a(th, "AuthUtil", "getLocateObj");
                return authUtil;
            }
        }
        return null;
    }

    private static void m386a(AuthConfigManager authConfigManager) {
        int i = 0;
        try {
            JSONObject jSONObject = authConfigManager.f562e;
            if (jSONObject != null) {
                f458S = cc.m535a(jSONObject.getString("able"), false);
                f459T = jSONObject.optLong("sysTime", bu.m464a());
                f460U = jSONObject.optInt("n", 1);
                f461V = jSONObject.optInt("nh", 1);
                if (!f458S) {
                    return;
                }
                if (f460U == -1 || f460U >= f461V) {
                    JSONArray jSONArray = jSONObject.getJSONArray("l");
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        try {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                            bo boVar = new bo();
                            boolean a = cc.m535a(jSONObject2.optString("able", "false"), false);
                            boVar.f491a = a;
                            if (a) {
                                boVar.f492b = jSONObject2.optString("pn", LetterIndexBar.SEARCH_ICON_LETTER);
                                boVar.f493c = jSONObject2.optString("cn", LetterIndexBar.SEARCH_ICON_LETTER);
                                boVar.f495e = jSONObject2.optString("a", LetterIndexBar.SEARCH_ICON_LETTER);
                                JSONArray optJSONArray = jSONObject2.optJSONArray("b");
                                if (optJSONArray != null) {
                                    List arrayList = new ArrayList();
                                    for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                                        JSONObject jSONObject3 = optJSONArray.getJSONObject(i3);
                                        Map hashMap = new HashMap();
                                        try {
                                            hashMap.put(jSONObject3.getString("k"), jSONObject3.getString("v"));
                                            arrayList.add(hashMap);
                                        } catch (Throwable th) {
                                        }
                                    }
                                    boVar.f494d = arrayList;
                                }
                                boVar.f496f = cc.m535a(jSONObject2.optString("is", "false"), false);
                                f457R.add(boVar);
                            }
                        } catch (Throwable th2) {
                        }
                    }
                    JSONArray optJSONArray2 = jSONObject.optJSONArray("sl");
                    if (optJSONArray2 != null) {
                        while (i < optJSONArray2.length()) {
                            CharSequence optString = optJSONArray2.getJSONObject(i).optString("pan");
                            if (!TextUtils.isEmpty(optString)) {
                                f462W.add(optString);
                            }
                            i++;
                        }
                    }
                }
            }
        } catch (Throwable th3) {
            bc.m330a(th3, "AuthUtil", "loadConfigData_otherServiceList");
        }
    }

    public static boolean m387a() {
        return f476l;
    }

    public static boolean m388a(long j) {
        long b = bu.m477b();
        return f472h && b - f474j <= f473i && b - j >= f475k;
    }

    public static synchronized boolean m389a(Context context) {
        boolean z;
        synchronized (bn.class) {
            z = false;
            f486v = true;
            try {
                AuthConfigManager a = cc.m531a(context, bc.m324a("loc", "3.0.0"), bc.m334b(context));
                f452M = a.f559b;
                z = bn.m392a(context, a);
            } catch (Throwable th) {
                bc.m330a(th, "AuthUtil", "getConfig");
            }
        }
        return z;
    }

    public static boolean m390a(Context context, long j) {
        if (!f447H) {
            return false;
        }
        long a = bu.m464a();
        if (a - j < ((long) f448I)) {
            return false;
        }
        if (f449J == -1) {
            return true;
        }
        if (bu.m489c(a, bt.m449a(context, "pref", "ngpsTime"))) {
            int b = bt.m455b(context, "pref", "ngpsCount");
            if (b >= f449J) {
                return false;
            }
            bt.m451a(context, "pref", "ngpsCount", b + 1);
            return true;
        }
        try {
            Editor edit = context.getSharedPreferences("pref", 0).edit();
            edit.putLong("ngpsTime", a);
            edit.putInt("ngpsCount", 0);
            bt.m454a(edit);
        } catch (Throwable th) {
            bc.m330a(th, "AuthUtil", "resetPrefsNGPS");
        }
        bt.m451a(context, "pref", "ngpsCount", 1);
        return true;
    }

    private static boolean m391a(Context context, AuthConfigManager.AuthConfigManager authConfigManager, String str, String str2) {
        boolean z = false;
        if (authConfigManager != null) {
            try {
                z = authConfigManager.f549a;
                Object obj = authConfigManager.f550b;
                Object obj2 = authConfigManager.f551c;
                CharSequence charSequence = authConfigManager.f552d;
                if (!(!z || TextUtils.isEmpty(obj2) || TextUtils.isEmpty(obj) || TextUtils.isEmpty(charSequence))) {
                    InstanceFactory.m720a(context, new DexDownloadItem(obj, obj2), bc.m324a(str, str2));
                }
            } catch (Throwable th) {
                bc.m330a(th, "AuthUtil", "downLoadPluginDex");
            }
        }
        return z;
    }

    private static boolean m392a(Context context, AuthConfigManager authConfigManager) {
        JSONObject jSONObject;
        AuthConfigManager.AuthConfigManager authConfigManager2;
        boolean a;
        JSONArray jSONArray;
        int i;
        int optInt;
        try {
            jSONObject = authConfigManager.f566i;
            if (jSONObject != null) {
                boolean a2 = cc.m535a(jSONObject.getString("opflag"), true);
                f481q = a2;
                av.f292a = a2;
            }
        } catch (Throwable th) {
            bc.m330a(th, "AuthUtil", "loadconfig");
            return false;
        }
        if (f481q) {
            try {
                authConfigManager2 = authConfigManager.f576s;
                if (authConfigManager2 != null) {
                    f454O = bn.m391a(context, authConfigManager2, "OfflineLocation", "1.0.0");
                    bt.m453a(context, "pref", "oAble", f454O);
                }
            } catch (Throwable th2) {
                bc.m330a(th2, "AuthUtil", "loadConfigData_OfflineDex");
            }
        }
        try {
            jSONObject = authConfigManager.f560c;
            if (jSONObject != null) {
                a = cc.m535a(jSONObject.getString("callamapflag"), true);
                f487w = a;
                if (a) {
                    f488x = jSONObject.getInt(ParamKey.COUNT);
                    f489y = jSONObject.getLong("sysTime");
                    jSONArray = jSONObject.getJSONArray("sn");
                    if (jSONArray != null && jSONArray.length() > 0) {
                        for (i = 0; i < jSONArray.length(); i++) {
                            f490z.add(jSONArray.getString(i));
                        }
                    }
                    if (!(f488x == -1 || f489y == 0)) {
                        if (!bu.m481b(f489y, bt.m449a(context, "pref", "nowtime"))) {
                            bn.m407h(context);
                        }
                    }
                }
            }
        } catch (Throwable th22) {
            bc.m330a(th22, "AuthUtil", "loadConfigData_callAMapSer");
        }
        try {
            jSONObject = authConfigManager.f563f;
            if (jSONObject != null) {
                a = cc.m535a(jSONObject.getString("amappushflag"), false);
                f440A = a;
                if (a) {
                    f441B = jSONObject.getInt(ParamKey.COUNT);
                    f442C = jSONObject.getLong("sysTime");
                    jSONArray = jSONObject.getJSONArray("sn");
                    if (jSONArray != null && jSONArray.length() > 0) {
                        for (i = 0; i < jSONArray.length(); i++) {
                            f443D.add(jSONArray.getString(i));
                        }
                    }
                    if (!(f441B == -1 || f442C == 0)) {
                        if (!bu.m481b(f442C, bt.m449a(context, "pref", "pushSerTime"))) {
                            bn.m409i(context);
                        }
                    }
                }
            }
        } catch (Throwable th222) {
            bc.m330a(th222, "AuthUtil", "loadConfigData_callAMapPush");
        }
        try {
            jSONObject = authConfigManager.f564g;
            if (jSONObject != null) {
                f446G = cc.m535a(jSONObject.getString("f"), false);
                f483s = jSONObject.optInt("mco", 0);
                f484t = jSONObject.optInt("co", 0);
                optInt = jSONObject.optInt("it", 3600) * PointerIconCompat.TYPE_DEFAULT;
                f482r = optInt;
                if (optInt < 3600000) {
                    f482r = 3600000;
                }
                f466b = jSONObject.optString("a", "\u63d0\u793a\u4fe1\u606f");
                f467c = jSONObject.optString("o", "\u786e\u8ba4");
                f468d = jSONObject.optString("c", "\u53d6\u6d88");
                f469e = jSONObject.optString("i", LetterIndexBar.SEARCH_ICON_LETTER);
                f470f = jSONObject.optString("u", LetterIndexBar.SEARCH_ICON_LETTER);
                f471g = jSONObject.optString("t", LetterIndexBar.SEARCH_ICON_LETTER);
                if (((TextUtils.isEmpty(f469e) || "null".equals(f469e)) && (TextUtils.isEmpty(f470f) || "null".equals(f470f))) || f484t > f483s) {
                    f446G = false;
                }
            }
        } catch (Throwable th2222) {
            bc.m330a(th2222, "AuthUtil", "loadConfigData_openAMap");
        }
        try {
            cj a3 = bc.m324a("loc", "3.0.0");
            AuthConfigManager.AuthConfigManager authConfigManager3 = authConfigManager.f573p;
            AuthConfigManager.AuthConfigManager authConfigManager4;
            ci ciVar;
            AuthConfigManager.AuthConfigManager authConfigManager5;
            JSONObject jSONObject2;
            AuthUtil a4;
            if (authConfigManager3 != null) {
                Object obj = authConfigManager3.f556b;
                Object obj2 = authConfigManager3.f555a;
                CharSequence charSequence = authConfigManager3.f557c;
                if (TextUtils.isEmpty(obj) || TextUtils.isEmpty(obj2) || TextUtils.isEmpty(charSequence)) {
                    InstanceFactory.m720a(context, null, a3);
                    try {
                        authConfigManager4 = authConfigManager.f574q;
                        if (authConfigManager4 != null) {
                            f444E = authConfigManager4.f553a;
                            f445F = authConfigManager4.f554b;
                            if (!(TextUtils.isEmpty(f444E) || TextUtils.isEmpty(f445F))) {
                                ciVar = new ci(context, "loc", f444E, f445F);
                                if (ciVar.f614a != null && !TextUtils.isEmpty(ciVar.f614a.f611a) && ciVar.f614a.f611a.contains("libJni_wgs2gcj.so") && ciVar.f614a.f611a.contains(Build.CPU_ABI)) {
                                    if (!new File(ciVar.f615b).exists()) {
                                        ciVar.start();
                                    }
                                }
                            }
                        }
                    } catch (Throwable th22222) {
                        bc.m330a(th22222, "AuthUtil", "loadConfigData_groupOffset");
                    }
                    try {
                        authConfigManager5 = authConfigManager.f572o;
                        if (authConfigManager5 != null) {
                            f485u = authConfigManager5.f547a;
                            bt.m453a(context, "pref", "exception", f485u);
                        }
                    } catch (Throwable th222222) {
                        bc.m330a(th222222, "AuthUtil", "loadConfigData_uploadException");
                    }
                    try {
                        jSONObject2 = authConfigManager.f565h;
                        if (jSONObject2 != null && cc.m535a(jSONObject2.getString("able"), false)) {
                            a4 = bn.m385a(jSONObject2, "fs");
                            if (a4 != null) {
                                f476l = a4.f438c;
                                f477m = Integer.parseInt(a4.f437b);
                            }
                            a4 = bn.m385a(jSONObject2, "us");
                            if (a4 != null) {
                                f478n = a4.f438c;
                                f480p = a4.f436a;
                                try {
                                    f479o = Integer.parseInt(a4.f437b);
                                } catch (Throwable th2222222) {
                                    bc.m330a(th2222222, "AuthUtil", "loadconfig part1");
                                }
                                if (f479o < 2) {
                                    f478n = false;
                                }
                            }
                            a4 = bn.m385a(jSONObject2, "rs");
                            if (a4 != null) {
                                a = a4.f438c;
                                f472h = a;
                                if (a) {
                                    f474j = bu.m477b();
                                    f475k = (long) (a4.f439d * PointerIconCompat.TYPE_DEFAULT);
                                }
                                try {
                                    f473i = (long) (Integer.parseInt(a4.f437b) * PointerIconCompat.TYPE_DEFAULT);
                                } catch (Throwable th22222222) {
                                    bc.m330a(th22222222, "AuthUtil", "loadconfig part");
                                }
                            }
                        }
                    } catch (Throwable th222222222) {
                        bc.m330a(th222222222, "AuthUtil", "loadConfigData_locate");
                    }
                    try {
                        jSONObject = authConfigManager.f567j;
                        if (jSONObject != null) {
                            a = cc.m535a(jSONObject.getString("able"), false);
                            f447H = a;
                            if (a) {
                                optInt = jSONObject.getInt("c");
                                if (optInt == 0) {
                                    f448I = 3000;
                                } else {
                                    f448I = optInt * PointerIconCompat.TYPE_DEFAULT;
                                }
                                f449J = jSONObject.getInt("t") / 2;
                            }
                        }
                    } catch (Throwable th2222222222) {
                        bc.m330a(th2222222222, "AuthUtil", "loadConfigData_ngps");
                    }
                    try {
                        jSONObject = authConfigManager.f568k;
                        if (jSONObject != null) {
                            a = cc.m535a(jSONObject.getString("able"), true);
                            f450K = a;
                            if (a) {
                                f451L = (long) (jSONObject.getInt("c") * PointerIconCompat.TYPE_DEFAULT);
                            }
                        }
                    } catch (Throwable th22222222222) {
                        bc.m330a(th22222222222, "AuthUtil", "loadConfigData_cacheAble");
                    }
                    try {
                        authConfigManager2 = authConfigManager.f575r;
                        if (authConfigManager2 != null) {
                            f453N = bn.m391a(context, authConfigManager2, "Collection", "1.0.0");
                        }
                    } catch (Throwable th222222222222) {
                        bc.m330a(th222222222222, "AuthUtil", "loadConfigData_CollectorDex");
                    }
                    try {
                        authConfigManager2 = authConfigManager.f577t;
                        if (authConfigManager2 != null) {
                            a2 = bn.m391a(context, authConfigManager2, "HttpDNS", "1.0.0");
                            f455P = a2;
                            if (!a2 && br.m438a(context, bc.m324a("HttpDNS", "1.0.0"))) {
                                bs.m444a(context, "HttpDNS", "config|get dnsDex able is false");
                            }
                        }
                    } catch (Throwable th2222222222222) {
                        bc.m330a(th2222222222222, "AuthUtil", "loadConfigData_dnsDex");
                    }
                    try {
                        jSONObject = authConfigManager.f569l;
                        if (jSONObject != null) {
                            a2 = cc.m535a(jSONObject.getString("able"), true);
                            f465a = a2;
                            if (a2) {
                                InstanceFactory.m721a(context, "loc");
                            }
                        }
                    } catch (Throwable th22222222222222) {
                        bc.m330a(th22222222222222, "AuthUtil", "loadConfigData_CallBackDex");
                    }
                    bn.m386a(authConfigManager);
                    try {
                        jSONObject = authConfigManager.f561d;
                        if (jSONObject != null) {
                            a = cc.m535a(jSONObject.getString("able"), true);
                            f463X = a;
                            if (a) {
                                f464Y = jSONObject.getInt("c");
                            }
                        }
                    } catch (Throwable th222222222222222) {
                        bc.m330a(th222222222222222, "AuthUtil", "loadConfigData_gpsGeoAble");
                    }
                    return true;
                }
                InstanceFactory.m720a(context, new DexDownloadItem(obj2, obj), a3);
                authConfigManager4 = authConfigManager.f574q;
                if (authConfigManager4 != null) {
                    f444E = authConfigManager4.f553a;
                    f445F = authConfigManager4.f554b;
                    ciVar = new ci(context, "loc", f444E, f445F);
                    if (new File(ciVar.f615b).exists()) {
                        ciVar.start();
                    }
                }
                authConfigManager5 = authConfigManager.f572o;
                if (authConfigManager5 != null) {
                    f485u = authConfigManager5.f547a;
                    bt.m453a(context, "pref", "exception", f485u);
                }
                jSONObject2 = authConfigManager.f565h;
                a4 = bn.m385a(jSONObject2, "fs");
                if (a4 != null) {
                    f476l = a4.f438c;
                    f477m = Integer.parseInt(a4.f437b);
                }
                a4 = bn.m385a(jSONObject2, "us");
                if (a4 != null) {
                    f478n = a4.f438c;
                    f480p = a4.f436a;
                    f479o = Integer.parseInt(a4.f437b);
                    if (f479o < 2) {
                        f478n = false;
                    }
                }
                a4 = bn.m385a(jSONObject2, "rs");
                if (a4 != null) {
                    a = a4.f438c;
                    f472h = a;
                    if (a) {
                        f474j = bu.m477b();
                        f475k = (long) (a4.f439d * PointerIconCompat.TYPE_DEFAULT);
                    }
                    f473i = (long) (Integer.parseInt(a4.f437b) * PointerIconCompat.TYPE_DEFAULT);
                }
                jSONObject = authConfigManager.f567j;
                if (jSONObject != null) {
                    a = cc.m535a(jSONObject.getString("able"), false);
                    f447H = a;
                    if (a) {
                        optInt = jSONObject.getInt("c");
                        if (optInt == 0) {
                            f448I = optInt * PointerIconCompat.TYPE_DEFAULT;
                        } else {
                            f448I = 3000;
                        }
                        f449J = jSONObject.getInt("t") / 2;
                    }
                }
                jSONObject = authConfigManager.f568k;
                if (jSONObject != null) {
                    a = cc.m535a(jSONObject.getString("able"), true);
                    f450K = a;
                    if (a) {
                        f451L = (long) (jSONObject.getInt("c") * PointerIconCompat.TYPE_DEFAULT);
                    }
                }
                authConfigManager2 = authConfigManager.f575r;
                if (authConfigManager2 != null) {
                    f453N = bn.m391a(context, authConfigManager2, "Collection", "1.0.0");
                }
                authConfigManager2 = authConfigManager.f577t;
                if (authConfigManager2 != null) {
                    a2 = bn.m391a(context, authConfigManager2, "HttpDNS", "1.0.0");
                    f455P = a2;
                    bs.m444a(context, "HttpDNS", "config|get dnsDex able is false");
                }
                jSONObject = authConfigManager.f569l;
                if (jSONObject != null) {
                    a2 = cc.m535a(jSONObject.getString("able"), true);
                    f465a = a2;
                    if (a2) {
                        InstanceFactory.m721a(context, "loc");
                    }
                }
                bn.m386a(authConfigManager);
                jSONObject = authConfigManager.f561d;
                if (jSONObject != null) {
                    a = cc.m535a(jSONObject.getString("able"), true);
                    f463X = a;
                    if (a) {
                        f464Y = jSONObject.getInt("c");
                    }
                }
                return true;
            }
            InstanceFactory.m720a(context, null, a3);
            authConfigManager4 = authConfigManager.f574q;
            if (authConfigManager4 != null) {
                f444E = authConfigManager4.f553a;
                f445F = authConfigManager4.f554b;
                ciVar = new ci(context, "loc", f444E, f445F);
                if (new File(ciVar.f615b).exists()) {
                    ciVar.start();
                }
            }
            authConfigManager5 = authConfigManager.f572o;
            if (authConfigManager5 != null) {
                f485u = authConfigManager5.f547a;
                bt.m453a(context, "pref", "exception", f485u);
            }
            jSONObject2 = authConfigManager.f565h;
            a4 = bn.m385a(jSONObject2, "fs");
            if (a4 != null) {
                f476l = a4.f438c;
                f477m = Integer.parseInt(a4.f437b);
            }
            a4 = bn.m385a(jSONObject2, "us");
            if (a4 != null) {
                f478n = a4.f438c;
                f480p = a4.f436a;
                f479o = Integer.parseInt(a4.f437b);
                if (f479o < 2) {
                    f478n = false;
                }
            }
            a4 = bn.m385a(jSONObject2, "rs");
            if (a4 != null) {
                a = a4.f438c;
                f472h = a;
                if (a) {
                    f474j = bu.m477b();
                    f475k = (long) (a4.f439d * PointerIconCompat.TYPE_DEFAULT);
                }
                f473i = (long) (Integer.parseInt(a4.f437b) * PointerIconCompat.TYPE_DEFAULT);
            }
            jSONObject = authConfigManager.f567j;
            if (jSONObject != null) {
                a = cc.m535a(jSONObject.getString("able"), false);
                f447H = a;
                if (a) {
                    optInt = jSONObject.getInt("c");
                    if (optInt == 0) {
                        f448I = 3000;
                    } else {
                        f448I = optInt * PointerIconCompat.TYPE_DEFAULT;
                    }
                    f449J = jSONObject.getInt("t") / 2;
                }
            }
            jSONObject = authConfigManager.f568k;
            if (jSONObject != null) {
                a = cc.m535a(jSONObject.getString("able"), true);
                f450K = a;
                if (a) {
                    f451L = (long) (jSONObject.getInt("c") * PointerIconCompat.TYPE_DEFAULT);
                }
            }
            authConfigManager2 = authConfigManager.f575r;
            if (authConfigManager2 != null) {
                f453N = bn.m391a(context, authConfigManager2, "Collection", "1.0.0");
            }
            authConfigManager2 = authConfigManager.f577t;
            if (authConfigManager2 != null) {
                a2 = bn.m391a(context, authConfigManager2, "HttpDNS", "1.0.0");
                f455P = a2;
                bs.m444a(context, "HttpDNS", "config|get dnsDex able is false");
            }
            jSONObject = authConfigManager.f569l;
            if (jSONObject != null) {
                a2 = cc.m535a(jSONObject.getString("able"), true);
                f465a = a2;
                if (a2) {
                    InstanceFactory.m721a(context, "loc");
                }
            }
            bn.m386a(authConfigManager);
            jSONObject = authConfigManager.f561d;
            if (jSONObject != null) {
                a = cc.m535a(jSONObject.getString("able"), true);
                f463X = a;
                if (a) {
                    f464Y = jSONObject.getInt("c");
                }
            }
            return true;
        } catch (Throwable th2222222222222222) {
            bc.m330a(th2222222222222222, "AuthUtil", "loadConfigData_sdkUpdate");
        }
    }

    public static int m393b() {
        return f477m;
    }

    public static boolean m394b(long j) {
        if (!f450K) {
            return false;
        }
        return f451L < 0 || bu.m464a() - j < f451L;
    }

    public static boolean m395b(Context context) {
        if (!f487w) {
            return false;
        }
        if (f488x == -1 || f489y == 0) {
            return true;
        }
        if (bu.m481b(f489y, bt.m449a(context, "pref", "nowtime"))) {
            int b = bt.m455b(context, "pref", ParamKey.COUNT);
            if (b >= f488x) {
                return false;
            }
            bt.m451a(context, "pref", ParamKey.COUNT, b + 1);
            return true;
        }
        bn.m407h(context);
        bt.m451a(context, "pref", ParamKey.COUNT, 1);
        return true;
    }

    public static boolean m396c() {
        return f478n;
    }

    public static boolean m397c(Context context) {
        if (!f440A) {
            return false;
        }
        if (f441B == -1 || f442C == 0) {
            return true;
        }
        if (bu.m481b(f442C, bt.m449a(context, "pref", "pushSerTime"))) {
            int b = bt.m455b(context, "pref", "pushCount");
            if (b >= f441B) {
                return false;
            }
            bt.m451a(context, "pref", "pushCount", b + 1);
            return true;
        }
        bn.m409i(context);
        bt.m451a(context, "pref", "pushCount", 1);
        return true;
    }

    public static int m398d() {
        return f479o;
    }

    public static synchronized boolean m399d(Context context) {
        boolean z = false;
        synchronized (bn.class) {
            if (f446G) {
                if (f484t > 0 && f483s > 0 && f484t <= f483s) {
                    long a = bt.m449a(context, "abcd", "lct");
                    long a2 = bt.m449a(context, "abcd", "lst");
                    long b = bu.m477b();
                    if (b < a) {
                        bt.m452a(context, "abcd", "lct", b);
                    } else {
                        if (b - a > LogBuilder.MAX_INTERVAL) {
                            bt.m452a(context, "abcd", "lct", b);
                            bt.m451a(context, "abcd", "t", 0);
                        }
                        if (b - a2 >= ((long) f482r)) {
                            int b2 = bt.m455b(context, "abcd", "t") + 1;
                            if (b2 <= f483s) {
                                bt.m452a(context, "abcd", "lst", b);
                                bt.m451a(context, "abcd", "t", b2);
                                z = true;
                            }
                        }
                    }
                }
            }
        }
        return z;
    }

    public static void m400e(Context context) {
        try {
            f485u = bt.m456b(context, "pref", "exception", true);
            bn.m402f(context);
        } catch (Throwable th) {
            bc.m330a(th, "AuthUtil", "loadLastAbleState p1");
        }
        try {
            f454O = bt.m456b(context, "pref", "oAble", false);
        } catch (Throwable th2) {
            bc.m330a(th2, "AuthUtil", "loadLastAbleState p2");
        }
    }

    public static boolean m401e() {
        return f480p;
    }

    public static synchronized void m402f(Context context) {
        synchronized (bn.class) {
            try {
                cj a = bc.m324a("loc", "3.0.0");
                a.f627a = f485u ? 1 : 0;
                cp.m656a(context, a);
            } catch (Throwable th) {
            }
        }
    }

    public static boolean m403f() {
        av.f292a = f481q;
        return f481q;
    }

    public static String m404g() {
        return f466b;
    }

    public static synchronized boolean m405g(Context context) {
        boolean z;
        synchronized (bn.class) {
            if (!f458S || f460U == 0 || f461V == 0 || f459T == 0 || (f460U != -1 && f460U < f461V)) {
                z = false;
            } else {
                if (f462W != null && f462W.size() > 0) {
                    for (String b : f462W) {
                        if (bu.m482b(context, b)) {
                            z = false;
                            break;
                        }
                    }
                }
                if (f460U == -1 && f461V == -1) {
                    z = true;
                } else {
                    long a = bt.m449a(context, "pref", "ots");
                    long a2 = bt.m449a(context, "pref", "otsh");
                    int b2 = bt.m455b(context, "pref", "otn");
                    int b3 = bt.m455b(context, "pref", "otnh");
                    if (f460U != -1) {
                        if (!bu.m481b(f459T, a)) {
                            try {
                                Editor edit = context.getSharedPreferences("pref", 0).edit();
                                edit.putLong("ots", f459T);
                                edit.putLong("otsh", f459T);
                                edit.putInt("otn", 0);
                                edit.putInt("otnh", 0);
                                bt.m454a(edit);
                            } catch (Throwable th) {
                                bc.m330a(th, "AuthUtil", "resetPrefsBind");
                            }
                            bt.m451a(context, "pref", "otn", 1);
                            bt.m451a(context, "pref", "otnh", 1);
                            z = true;
                        } else if (b2 < f460U) {
                            if (f461V == -1) {
                                bt.m451a(context, "pref", "otn", b2 + 1);
                                bt.m451a(context, "pref", "otnh", 0);
                                z = true;
                            } else if (!bu.m467a(f459T, a2)) {
                                bt.m452a(context, "pref", "otsh", f459T);
                                bt.m451a(context, "pref", "otn", b2 + 1);
                                bt.m451a(context, "pref", "otnh", 1);
                                z = true;
                            } else if (b3 < f461V) {
                                int i = b3 + 1;
                                bt.m451a(context, "pref", "otn", b2 + 1);
                                bt.m451a(context, "pref", "otnh", i);
                                z = true;
                            }
                        }
                    }
                    if (f460U == -1) {
                        bt.m451a(context, "pref", "otn", 0);
                        if (f461V == -1) {
                            bt.m451a(context, "pref", "otnh", 0);
                            z = true;
                        } else if (!bu.m467a(f459T, a2)) {
                            bt.m452a(context, "pref", "otsh", f459T);
                            bt.m451a(context, "pref", "otnh", 1);
                            z = true;
                        } else if (b3 < f461V) {
                            bt.m451a(context, "pref", "otnh", b3 + 1);
                            z = true;
                        }
                    }
                    z = false;
                }
            }
        }
        return z;
    }

    public static String m406h() {
        return f467c;
    }

    private static void m407h(Context context) {
        try {
            Editor edit = context.getSharedPreferences("pref", 0).edit();
            edit.putLong("nowtime", f489y);
            edit.putInt(ParamKey.COUNT, 0);
            bt.m454a(edit);
        } catch (Throwable th) {
            bc.m330a(th, "AuthUtil", "resetPrefsBind");
        }
    }

    public static String m408i() {
        return f468d;
    }

    private static void m409i(Context context) {
        try {
            Editor edit = context.getSharedPreferences("pref", 0).edit();
            edit.putLong("pushSerTime", f442C);
            edit.putInt("pushCount", 0);
            bt.m454a(edit);
        } catch (Throwable th) {
            bc.m330a(th, "AuthUtil", "resetPrefsBind");
        }
    }

    public static String m410j() {
        return f469e;
    }

    public static String m411k() {
        return f470f;
    }

    public static String m412l() {
        return f471g;
    }

    public static ArrayList<String> m413m() {
        return f490z;
    }

    public static ArrayList<String> m414n() {
        return f443D;
    }

    public static boolean m415o() {
        return f485u;
    }

    public static boolean m416p() {
        return f486v;
    }

    public static void m417q() {
        f486v = false;
    }

    public static boolean m418r() {
        return f447H;
    }

    public static boolean m419s() {
        return f450K;
    }

    public static synchronized int m420t() {
        int i;
        synchronized (bn.class) {
            i = f452M;
        }
        return i;
    }

    public static boolean m421u() {
        return f453N;
    }

    public static boolean m422v() {
        return f454O;
    }

    public static synchronized List<bo> m423w() {
        List<bo> list;
        synchronized (bn.class) {
            list = f457R;
        }
        return list;
    }

    public static boolean m424x() {
        return f463X;
    }

    public static int m425y() {
        return f464Y;
    }
}
