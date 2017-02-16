package com.amap.p003a;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.sina.weibo.sdk.constant.WBPageConstants.ParamKey;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.tencent.android.tpush.common.Constants;
import java.lang.reflect.Field;
import java.net.URLDecoder;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONObject;

/* compiled from: AuthConfigManager */
/* renamed from: com.amap.a.cc */
public final class cc {
    public static int f581a;
    public static String f582b;

    /* renamed from: com.amap.a.cc.a */
    public static class AuthConfigManager {
        public String f558a;
        public int f559b;
        public JSONObject f560c;
        public JSONObject f561d;
        public JSONObject f562e;
        public JSONObject f563f;
        public JSONObject f564g;
        public JSONObject f565h;
        public JSONObject f566i;
        public JSONObject f567j;
        public JSONObject f568k;
        public JSONObject f569l;
        public JSONObject f570m;
        public JSONObject f571n;
        public AuthConfigManager f572o;
        public AuthConfigManager f573p;
        public AuthConfigManager f574q;
        public AuthConfigManager f575r;
        public AuthConfigManager f576s;
        public AuthConfigManager f577t;
        public AuthConfigManager f578u;

        /* renamed from: com.amap.a.cc.a.a */
        public static class AuthConfigManager {
            public boolean f547a;
            public boolean f548b;
        }

        /* renamed from: com.amap.a.cc.a.b */
        public static class AuthConfigManager {
            public boolean f549a;
            public String f550b;
            public String f551c;
            public String f552d;
        }

        /* renamed from: com.amap.a.cc.a.c */
        public static class AuthConfigManager {
            public String f553a;
            public String f554b;
        }

        /* renamed from: com.amap.a.cc.a.d */
        public static class AuthConfigManager {
            public String f555a;
            public String f556b;
            public String f557c;
        }

        public AuthConfigManager() {
            this.f559b = -1;
        }
    }

    /* renamed from: com.amap.a.cc.b */
    static class AuthConfigManager extends ai {
        private String f579f;
        private Map<String, String> f580g;

        AuthConfigManager(Context context, cj cjVar, String str) {
            super(context, cjVar);
            this.f579f = str;
            this.f580g = null;
        }

        private Map<String, String> m525j() {
            Object q = ce.m567q(this.a);
            if (!TextUtils.isEmpty(q)) {
                q = cg.m586b(new StringBuilder(q).reverse().toString());
            }
            Map<String, String> hashMap = new HashMap();
            hashMap.put("authkey", this.f579f);
            hashMap.put("plattype", "android");
            hashMap.put("product", this.b.m611a());
            hashMap.put(LogBuilder.KEY_VERSION, this.b.m612b());
            hashMap.put("output", "json");
            hashMap.put("androidversion", VERSION.SDK_INT);
            hashMap.put(Constants.FLAG_DEVICE_ID, q);
            if (!(this.f580g == null || this.f580g.isEmpty())) {
                hashMap.putAll(this.f580g);
            }
            if (VERSION.SDK_INT >= 21) {
                try {
                    ApplicationInfo applicationInfo = this.a.getApplicationInfo();
                    Field declaredField = Class.forName(ApplicationInfo.class.getName()).getDeclaredField("primaryCpuAbi");
                    declaredField.setAccessible(true);
                    q = (String) declaredField.get(applicationInfo);
                } catch (Throwable th) {
                    cm.m637a(th, "ConfigManager", "getcpu");
                }
                if (TextUtils.isEmpty(q)) {
                    q = Build.CPU_ABI;
                }
                hashMap.put("abitype", q);
                hashMap.put("ext", this.b.m613c());
                return hashMap;
            }
            q = null;
            if (TextUtils.isEmpty(q)) {
                q = Build.CPU_ABI;
            }
            hashMap.put("abitype", q);
            hashMap.put("ext", this.b.m613c());
            return hashMap;
        }

        public final Map<String, String> m526b() {
            return null;
        }

        public final String m527c() {
            return "https://restapi.amap.com/v3/iasdkauth";
        }

        protected final String m528g() {
            return "3.0";
        }

        public final byte[] m529h() {
            return null;
        }

        public final byte[] m530i() {
            return ck.m624a(ck.m617a(m525j()));
        }
    }

    static {
        f581a = -1;
        f582b = LetterIndexBar.SEARCH_ICON_LETTER;
    }

    public static AuthConfigManager m531a(Context context, cj cjVar, String str) {
        an a;
        Object obj;
        ca e;
        an anVar;
        Object obj2;
        Object obj3;
        Object obj4;
        byte[] bArr;
        String a2;
        JSONObject jSONObject;
        int i;
        String str2;
        String str3;
        List list;
        String str4;
        AuthConfigManager authConfigManager;
        JSONObject jSONObject2;
        Throwable th;
        JSONObject jSONObject3;
        AuthConfigManager authConfigManager2;
        Object a3;
        AuthConfigManager authConfigManager3;
        String a4;
        AuthConfigManager authConfigManager4;
        AuthConfigManager authConfigManager5;
        an anVar2 = null;
        AuthConfigManager authConfigManager6 = new AuthConfigManager();
        try {
            ah ahVar = new ah();
            a = ah.m150a(new AuthConfigManager(context, cjVar, str), true);
            if (a != null) {
                try {
                    obj = a.f197a;
                } catch (ca e2) {
                    e = e2;
                    anVar = anVar2;
                    authConfigManager6.f558a = e.f540a;
                    obj2 = anVar2;
                    obj3 = obj;
                    anVar = a;
                    obj4 = obj3;
                    if (bArr == null) {
                        return authConfigManager6;
                    }
                    if (TextUtils.isEmpty(a2)) {
                        a2 = ck.m618a(bArr);
                    }
                    try {
                        jSONObject = new JSONObject(a2);
                        if (jSONObject.has(NotificationCompatApi24.CATEGORY_STATUS)) {
                            i = jSONObject.getInt(NotificationCompatApi24.CATEGORY_STATUS);
                            if (i == 1) {
                                f581a = 1;
                            } else if (i == 0) {
                                a2 = "authcsid";
                                str2 = "authgsid";
                                if (anVar == null) {
                                    str3 = str2;
                                } else {
                                    str3 = anVar.f199c;
                                    if (anVar.f198b != null) {
                                        list = (List) anVar.f198b.get("gsid");
                                        str4 = str3;
                                        str3 = (String) list.get(0);
                                        a2 = str4;
                                    }
                                    a2 = str3;
                                    str3 = str2;
                                }
                                ck.m619a(context, a2, str3, jSONObject.toString());
                                f581a = 0;
                                if (jSONObject.has("info")) {
                                    f582b = jSONObject.getString("info");
                                }
                                if (f581a == 0) {
                                    authConfigManager6.f558a = f582b;
                                    return authConfigManager6;
                                }
                            }
                            if (jSONObject.has("ver")) {
                                authConfigManager6.f559b = jSONObject.getInt("ver");
                            }
                            if (ck.m622a(jSONObject, "result")) {
                                authConfigManager = new AuthConfigManager();
                                authConfigManager.f547a = false;
                                authConfigManager.f548b = false;
                                authConfigManager6.f572o = authConfigManager;
                                jSONObject2 = jSONObject.getJSONObject("result");
                                if (ck.m622a(jSONObject2, "11K")) {
                                    try {
                                        authConfigManager.f547a = cc.m535a(jSONObject2.getJSONObject("11K").getString("able"), false);
                                    } catch (Throwable th2) {
                                        cm.m637a(th2, "AuthConfigManager", "loadException");
                                    }
                                }
                                if (ck.m622a(jSONObject2, "11B")) {
                                    authConfigManager6.f560c = jSONObject2.getJSONObject("11B");
                                }
                                if (ck.m622a(jSONObject2, "11C")) {
                                    authConfigManager6.f563f = jSONObject2.getJSONObject("11C");
                                }
                                if (ck.m622a(jSONObject2, "11I")) {
                                    authConfigManager6.f564g = jSONObject2.getJSONObject("11I");
                                }
                                if (ck.m622a(jSONObject2, "11H")) {
                                    authConfigManager6.f565h = jSONObject2.getJSONObject("11H");
                                }
                                if (ck.m622a(jSONObject2, "11E")) {
                                    authConfigManager6.f566i = jSONObject2.getJSONObject("11E");
                                }
                                if (ck.m622a(jSONObject2, "11F")) {
                                    authConfigManager6.f567j = jSONObject2.getJSONObject("11F");
                                }
                                if (ck.m622a(jSONObject2, "13A")) {
                                    authConfigManager6.f569l = jSONObject2.getJSONObject("13A");
                                }
                                if (ck.m622a(jSONObject2, "13J")) {
                                    authConfigManager6.f561d = jSONObject2.getJSONObject("13J");
                                }
                                if (ck.m622a(jSONObject2, "11G")) {
                                    authConfigManager6.f568k = jSONObject2.getJSONObject("11G");
                                }
                                if (ck.m622a(jSONObject2, "001")) {
                                    jSONObject3 = jSONObject2.getJSONObject("001");
                                    authConfigManager2 = new AuthConfigManager();
                                    if (jSONObject3 != null) {
                                        try {
                                            obj = cc.m532a(jSONObject3, "md5");
                                            a3 = cc.m532a(jSONObject3, ParamKey.URL);
                                            obj2 = cc.m532a(jSONObject3, "sdkversion");
                                            authConfigManager2.f555a = a3;
                                            authConfigManager2.f556b = obj;
                                            authConfigManager2.f557c = obj2;
                                        } catch (Throwable th22) {
                                            cm.m637a(th22, "ConfigManager", "parseSDKUpdate");
                                        }
                                    }
                                    authConfigManager6.f573p = authConfigManager2;
                                }
                                if (ck.m622a(jSONObject2, "002")) {
                                    jSONObject3 = jSONObject2.getJSONObject("002");
                                    authConfigManager3 = new AuthConfigManager();
                                    if (jSONObject3 != null) {
                                        try {
                                            a4 = cc.m532a(jSONObject3, "md5");
                                            a2 = cc.m532a(jSONObject3, ParamKey.URL);
                                            authConfigManager3.f554b = a4;
                                            authConfigManager3.f553a = a2;
                                        } catch (Throwable th222) {
                                            cm.m637a(th222, "ConfigManager", "parseSDKCoordinate");
                                        }
                                    }
                                    authConfigManager6.f574q = authConfigManager3;
                                }
                                if (ck.m622a(jSONObject2, "006")) {
                                    authConfigManager6.f570m = jSONObject2.getJSONObject("006");
                                }
                                if (ck.m622a(jSONObject2, "010")) {
                                    authConfigManager6.f571n = jSONObject2.getJSONObject("010");
                                }
                                if (ck.m622a(jSONObject2, "11Z")) {
                                    jSONObject3 = jSONObject2.getJSONObject("11Z");
                                    authConfigManager4 = new AuthConfigManager();
                                    cc.m534a(jSONObject3, authConfigManager4);
                                    authConfigManager6.f575r = authConfigManager4;
                                }
                                if (ck.m622a(jSONObject2, "135")) {
                                    authConfigManager6.f562e = jSONObject2.getJSONObject("135");
                                }
                                if (ck.m622a(jSONObject2, "121")) {
                                    jSONObject3 = jSONObject2.getJSONObject("121");
                                    authConfigManager4 = new AuthConfigManager();
                                    cc.m534a(jSONObject3, authConfigManager4);
                                    authConfigManager6.f576s = authConfigManager4;
                                }
                                if (ck.m622a(jSONObject2, "122")) {
                                    jSONObject3 = jSONObject2.getJSONObject("122");
                                    authConfigManager4 = new AuthConfigManager();
                                    cc.m534a(jSONObject3, authConfigManager4);
                                    authConfigManager6.f577t = authConfigManager4;
                                }
                                if (ck.m622a(jSONObject2, "123")) {
                                    jSONObject3 = jSONObject2.getJSONObject("123");
                                    authConfigManager5 = new AuthConfigManager();
                                    cc.m534a(jSONObject3, authConfigManager5);
                                    authConfigManager6.f578u = authConfigManager5;
                                }
                            }
                            return authConfigManager6;
                        }
                    } catch (Throwable th2222) {
                        cm.m637a(th2222, "AuthConfigManager", "loadConfig");
                    }
                    return authConfigManager6;
                } catch (IllegalBlockSizeException e3) {
                    anVar = anVar2;
                    obj2 = anVar2;
                    obj3 = obj;
                    anVar = a;
                    obj4 = obj3;
                    if (bArr == null) {
                        return authConfigManager6;
                    }
                    if (TextUtils.isEmpty(a2)) {
                        a2 = ck.m618a(bArr);
                    }
                    jSONObject = new JSONObject(a2);
                    if (jSONObject.has(NotificationCompatApi24.CATEGORY_STATUS)) {
                        i = jSONObject.getInt(NotificationCompatApi24.CATEGORY_STATUS);
                        if (i == 1) {
                            f581a = 1;
                        } else if (i == 0) {
                            a2 = "authcsid";
                            str2 = "authgsid";
                            if (anVar == null) {
                                str3 = anVar.f199c;
                                if (anVar.f198b != null) {
                                    list = (List) anVar.f198b.get("gsid");
                                    str4 = str3;
                                    str3 = (String) list.get(0);
                                    a2 = str4;
                                }
                                a2 = str3;
                                str3 = str2;
                            } else {
                                str3 = str2;
                            }
                            ck.m619a(context, a2, str3, jSONObject.toString());
                            f581a = 0;
                            if (jSONObject.has("info")) {
                                f582b = jSONObject.getString("info");
                            }
                            if (f581a == 0) {
                                authConfigManager6.f558a = f582b;
                                return authConfigManager6;
                            }
                        }
                        if (jSONObject.has("ver")) {
                            authConfigManager6.f559b = jSONObject.getInt("ver");
                        }
                        if (ck.m622a(jSONObject, "result")) {
                            authConfigManager = new AuthConfigManager();
                            authConfigManager.f547a = false;
                            authConfigManager.f548b = false;
                            authConfigManager6.f572o = authConfigManager;
                            jSONObject2 = jSONObject.getJSONObject("result");
                            if (ck.m622a(jSONObject2, "11K")) {
                                authConfigManager.f547a = cc.m535a(jSONObject2.getJSONObject("11K").getString("able"), false);
                            }
                            if (ck.m622a(jSONObject2, "11B")) {
                                authConfigManager6.f560c = jSONObject2.getJSONObject("11B");
                            }
                            if (ck.m622a(jSONObject2, "11C")) {
                                authConfigManager6.f563f = jSONObject2.getJSONObject("11C");
                            }
                            if (ck.m622a(jSONObject2, "11I")) {
                                authConfigManager6.f564g = jSONObject2.getJSONObject("11I");
                            }
                            if (ck.m622a(jSONObject2, "11H")) {
                                authConfigManager6.f565h = jSONObject2.getJSONObject("11H");
                            }
                            if (ck.m622a(jSONObject2, "11E")) {
                                authConfigManager6.f566i = jSONObject2.getJSONObject("11E");
                            }
                            if (ck.m622a(jSONObject2, "11F")) {
                                authConfigManager6.f567j = jSONObject2.getJSONObject("11F");
                            }
                            if (ck.m622a(jSONObject2, "13A")) {
                                authConfigManager6.f569l = jSONObject2.getJSONObject("13A");
                            }
                            if (ck.m622a(jSONObject2, "13J")) {
                                authConfigManager6.f561d = jSONObject2.getJSONObject("13J");
                            }
                            if (ck.m622a(jSONObject2, "11G")) {
                                authConfigManager6.f568k = jSONObject2.getJSONObject("11G");
                            }
                            if (ck.m622a(jSONObject2, "001")) {
                                jSONObject3 = jSONObject2.getJSONObject("001");
                                authConfigManager2 = new AuthConfigManager();
                                if (jSONObject3 != null) {
                                    obj = cc.m532a(jSONObject3, "md5");
                                    a3 = cc.m532a(jSONObject3, ParamKey.URL);
                                    obj2 = cc.m532a(jSONObject3, "sdkversion");
                                    authConfigManager2.f555a = a3;
                                    authConfigManager2.f556b = obj;
                                    authConfigManager2.f557c = obj2;
                                }
                                authConfigManager6.f573p = authConfigManager2;
                            }
                            if (ck.m622a(jSONObject2, "002")) {
                                jSONObject3 = jSONObject2.getJSONObject("002");
                                authConfigManager3 = new AuthConfigManager();
                                if (jSONObject3 != null) {
                                    a4 = cc.m532a(jSONObject3, "md5");
                                    a2 = cc.m532a(jSONObject3, ParamKey.URL);
                                    authConfigManager3.f554b = a4;
                                    authConfigManager3.f553a = a2;
                                }
                                authConfigManager6.f574q = authConfigManager3;
                            }
                            if (ck.m622a(jSONObject2, "006")) {
                                authConfigManager6.f570m = jSONObject2.getJSONObject("006");
                            }
                            if (ck.m622a(jSONObject2, "010")) {
                                authConfigManager6.f571n = jSONObject2.getJSONObject("010");
                            }
                            if (ck.m622a(jSONObject2, "11Z")) {
                                jSONObject3 = jSONObject2.getJSONObject("11Z");
                                authConfigManager4 = new AuthConfigManager();
                                cc.m534a(jSONObject3, authConfigManager4);
                                authConfigManager6.f575r = authConfigManager4;
                            }
                            if (ck.m622a(jSONObject2, "135")) {
                                authConfigManager6.f562e = jSONObject2.getJSONObject("135");
                            }
                            if (ck.m622a(jSONObject2, "121")) {
                                jSONObject3 = jSONObject2.getJSONObject("121");
                                authConfigManager4 = new AuthConfigManager();
                                cc.m534a(jSONObject3, authConfigManager4);
                                authConfigManager6.f576s = authConfigManager4;
                            }
                            if (ck.m622a(jSONObject2, "122")) {
                                jSONObject3 = jSONObject2.getJSONObject("122");
                                authConfigManager4 = new AuthConfigManager();
                                cc.m534a(jSONObject3, authConfigManager4);
                                authConfigManager6.f577t = authConfigManager4;
                            }
                            if (ck.m622a(jSONObject2, "123")) {
                                jSONObject3 = jSONObject2.getJSONObject("123");
                                authConfigManager5 = new AuthConfigManager();
                                cc.m534a(jSONObject3, authConfigManager5);
                                authConfigManager6.f578u = authConfigManager5;
                            }
                        }
                        return authConfigManager6;
                    }
                    return authConfigManager6;
                } catch (Throwable th3) {
                    th2222 = th3;
                    anVar = anVar2;
                    cm.m637a(th2222, "ConfigManager", "loadConfig");
                    obj2 = anVar2;
                    obj3 = obj;
                    anVar = a;
                    obj4 = obj3;
                    if (bArr == null) {
                        return authConfigManager6;
                    }
                    if (TextUtils.isEmpty(a2)) {
                        a2 = ck.m618a(bArr);
                    }
                    jSONObject = new JSONObject(a2);
                    if (jSONObject.has(NotificationCompatApi24.CATEGORY_STATUS)) {
                        i = jSONObject.getInt(NotificationCompatApi24.CATEGORY_STATUS);
                        if (i == 1) {
                            f581a = 1;
                        } else if (i == 0) {
                            a2 = "authcsid";
                            str2 = "authgsid";
                            if (anVar == null) {
                                str3 = str2;
                            } else {
                                str3 = anVar.f199c;
                                if (anVar.f198b != null) {
                                    list = (List) anVar.f198b.get("gsid");
                                    str4 = str3;
                                    str3 = (String) list.get(0);
                                    a2 = str4;
                                }
                                a2 = str3;
                                str3 = str2;
                            }
                            ck.m619a(context, a2, str3, jSONObject.toString());
                            f581a = 0;
                            if (jSONObject.has("info")) {
                                f582b = jSONObject.getString("info");
                            }
                            if (f581a == 0) {
                                authConfigManager6.f558a = f582b;
                                return authConfigManager6;
                            }
                        }
                        if (jSONObject.has("ver")) {
                            authConfigManager6.f559b = jSONObject.getInt("ver");
                        }
                        if (ck.m622a(jSONObject, "result")) {
                            authConfigManager = new AuthConfigManager();
                            authConfigManager.f547a = false;
                            authConfigManager.f548b = false;
                            authConfigManager6.f572o = authConfigManager;
                            jSONObject2 = jSONObject.getJSONObject("result");
                            if (ck.m622a(jSONObject2, "11K")) {
                                authConfigManager.f547a = cc.m535a(jSONObject2.getJSONObject("11K").getString("able"), false);
                            }
                            if (ck.m622a(jSONObject2, "11B")) {
                                authConfigManager6.f560c = jSONObject2.getJSONObject("11B");
                            }
                            if (ck.m622a(jSONObject2, "11C")) {
                                authConfigManager6.f563f = jSONObject2.getJSONObject("11C");
                            }
                            if (ck.m622a(jSONObject2, "11I")) {
                                authConfigManager6.f564g = jSONObject2.getJSONObject("11I");
                            }
                            if (ck.m622a(jSONObject2, "11H")) {
                                authConfigManager6.f565h = jSONObject2.getJSONObject("11H");
                            }
                            if (ck.m622a(jSONObject2, "11E")) {
                                authConfigManager6.f566i = jSONObject2.getJSONObject("11E");
                            }
                            if (ck.m622a(jSONObject2, "11F")) {
                                authConfigManager6.f567j = jSONObject2.getJSONObject("11F");
                            }
                            if (ck.m622a(jSONObject2, "13A")) {
                                authConfigManager6.f569l = jSONObject2.getJSONObject("13A");
                            }
                            if (ck.m622a(jSONObject2, "13J")) {
                                authConfigManager6.f561d = jSONObject2.getJSONObject("13J");
                            }
                            if (ck.m622a(jSONObject2, "11G")) {
                                authConfigManager6.f568k = jSONObject2.getJSONObject("11G");
                            }
                            if (ck.m622a(jSONObject2, "001")) {
                                jSONObject3 = jSONObject2.getJSONObject("001");
                                authConfigManager2 = new AuthConfigManager();
                                if (jSONObject3 != null) {
                                    obj = cc.m532a(jSONObject3, "md5");
                                    a3 = cc.m532a(jSONObject3, ParamKey.URL);
                                    obj2 = cc.m532a(jSONObject3, "sdkversion");
                                    authConfigManager2.f555a = a3;
                                    authConfigManager2.f556b = obj;
                                    authConfigManager2.f557c = obj2;
                                }
                                authConfigManager6.f573p = authConfigManager2;
                            }
                            if (ck.m622a(jSONObject2, "002")) {
                                jSONObject3 = jSONObject2.getJSONObject("002");
                                authConfigManager3 = new AuthConfigManager();
                                if (jSONObject3 != null) {
                                    a4 = cc.m532a(jSONObject3, "md5");
                                    a2 = cc.m532a(jSONObject3, ParamKey.URL);
                                    authConfigManager3.f554b = a4;
                                    authConfigManager3.f553a = a2;
                                }
                                authConfigManager6.f574q = authConfigManager3;
                            }
                            if (ck.m622a(jSONObject2, "006")) {
                                authConfigManager6.f570m = jSONObject2.getJSONObject("006");
                            }
                            if (ck.m622a(jSONObject2, "010")) {
                                authConfigManager6.f571n = jSONObject2.getJSONObject("010");
                            }
                            if (ck.m622a(jSONObject2, "11Z")) {
                                jSONObject3 = jSONObject2.getJSONObject("11Z");
                                authConfigManager4 = new AuthConfigManager();
                                cc.m534a(jSONObject3, authConfigManager4);
                                authConfigManager6.f575r = authConfigManager4;
                            }
                            if (ck.m622a(jSONObject2, "135")) {
                                authConfigManager6.f562e = jSONObject2.getJSONObject("135");
                            }
                            if (ck.m622a(jSONObject2, "121")) {
                                jSONObject3 = jSONObject2.getJSONObject("121");
                                authConfigManager4 = new AuthConfigManager();
                                cc.m534a(jSONObject3, authConfigManager4);
                                authConfigManager6.f576s = authConfigManager4;
                            }
                            if (ck.m622a(jSONObject2, "122")) {
                                jSONObject3 = jSONObject2.getJSONObject("122");
                                authConfigManager4 = new AuthConfigManager();
                                cc.m534a(jSONObject3, authConfigManager4);
                                authConfigManager6.f577t = authConfigManager4;
                            }
                            if (ck.m622a(jSONObject2, "123")) {
                                jSONObject3 = jSONObject2.getJSONObject("123");
                                authConfigManager5 = new AuthConfigManager();
                                cc.m534a(jSONObject3, authConfigManager5);
                                authConfigManager6.f578u = authConfigManager5;
                            }
                        }
                        return authConfigManager6;
                    }
                    return authConfigManager6;
                }
            }
            anVar = anVar2;
            try {
                obj2 = new byte[16];
                a3 = new byte[(obj.length - 16)];
                System.arraycopy(obj, 0, obj2, 0, 16);
                System.arraycopy(obj, 16, a3, 0, obj.length - 16);
                Key secretKeySpec = new SecretKeySpec(obj2, "AES");
                Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
                instance.init(2, secretKeySpec, new IvParameterSpec(ck.m623a()));
                a2 = ck.m618a(instance.doFinal(a3));
                obj3 = obj;
                anVar = a;
                bArr = obj3;
            } catch (ca e4) {
                e = e4;
                authConfigManager6.f558a = e.f540a;
                obj2 = anVar2;
                obj3 = obj;
                anVar = a;
                obj4 = obj3;
                if (bArr == null) {
                    return authConfigManager6;
                }
                if (TextUtils.isEmpty(a2)) {
                    a2 = ck.m618a(bArr);
                }
                jSONObject = new JSONObject(a2);
                if (jSONObject.has(NotificationCompatApi24.CATEGORY_STATUS)) {
                    i = jSONObject.getInt(NotificationCompatApi24.CATEGORY_STATUS);
                    if (i == 1) {
                        f581a = 1;
                    } else if (i == 0) {
                        a2 = "authcsid";
                        str2 = "authgsid";
                        if (anVar == null) {
                            str3 = str2;
                        } else {
                            str3 = anVar.f199c;
                            if (anVar.f198b != null) {
                                list = (List) anVar.f198b.get("gsid");
                                str4 = str3;
                                str3 = (String) list.get(0);
                                a2 = str4;
                            }
                            a2 = str3;
                            str3 = str2;
                        }
                        ck.m619a(context, a2, str3, jSONObject.toString());
                        f581a = 0;
                        if (jSONObject.has("info")) {
                            f582b = jSONObject.getString("info");
                        }
                        if (f581a == 0) {
                            authConfigManager6.f558a = f582b;
                            return authConfigManager6;
                        }
                    }
                    if (jSONObject.has("ver")) {
                        authConfigManager6.f559b = jSONObject.getInt("ver");
                    }
                    if (ck.m622a(jSONObject, "result")) {
                        authConfigManager = new AuthConfigManager();
                        authConfigManager.f547a = false;
                        authConfigManager.f548b = false;
                        authConfigManager6.f572o = authConfigManager;
                        jSONObject2 = jSONObject.getJSONObject("result");
                        if (ck.m622a(jSONObject2, "11K")) {
                            authConfigManager.f547a = cc.m535a(jSONObject2.getJSONObject("11K").getString("able"), false);
                        }
                        if (ck.m622a(jSONObject2, "11B")) {
                            authConfigManager6.f560c = jSONObject2.getJSONObject("11B");
                        }
                        if (ck.m622a(jSONObject2, "11C")) {
                            authConfigManager6.f563f = jSONObject2.getJSONObject("11C");
                        }
                        if (ck.m622a(jSONObject2, "11I")) {
                            authConfigManager6.f564g = jSONObject2.getJSONObject("11I");
                        }
                        if (ck.m622a(jSONObject2, "11H")) {
                            authConfigManager6.f565h = jSONObject2.getJSONObject("11H");
                        }
                        if (ck.m622a(jSONObject2, "11E")) {
                            authConfigManager6.f566i = jSONObject2.getJSONObject("11E");
                        }
                        if (ck.m622a(jSONObject2, "11F")) {
                            authConfigManager6.f567j = jSONObject2.getJSONObject("11F");
                        }
                        if (ck.m622a(jSONObject2, "13A")) {
                            authConfigManager6.f569l = jSONObject2.getJSONObject("13A");
                        }
                        if (ck.m622a(jSONObject2, "13J")) {
                            authConfigManager6.f561d = jSONObject2.getJSONObject("13J");
                        }
                        if (ck.m622a(jSONObject2, "11G")) {
                            authConfigManager6.f568k = jSONObject2.getJSONObject("11G");
                        }
                        if (ck.m622a(jSONObject2, "001")) {
                            jSONObject3 = jSONObject2.getJSONObject("001");
                            authConfigManager2 = new AuthConfigManager();
                            if (jSONObject3 != null) {
                                obj = cc.m532a(jSONObject3, "md5");
                                a3 = cc.m532a(jSONObject3, ParamKey.URL);
                                obj2 = cc.m532a(jSONObject3, "sdkversion");
                                authConfigManager2.f555a = a3;
                                authConfigManager2.f556b = obj;
                                authConfigManager2.f557c = obj2;
                            }
                            authConfigManager6.f573p = authConfigManager2;
                        }
                        if (ck.m622a(jSONObject2, "002")) {
                            jSONObject3 = jSONObject2.getJSONObject("002");
                            authConfigManager3 = new AuthConfigManager();
                            if (jSONObject3 != null) {
                                a4 = cc.m532a(jSONObject3, "md5");
                                a2 = cc.m532a(jSONObject3, ParamKey.URL);
                                authConfigManager3.f554b = a4;
                                authConfigManager3.f553a = a2;
                            }
                            authConfigManager6.f574q = authConfigManager3;
                        }
                        if (ck.m622a(jSONObject2, "006")) {
                            authConfigManager6.f570m = jSONObject2.getJSONObject("006");
                        }
                        if (ck.m622a(jSONObject2, "010")) {
                            authConfigManager6.f571n = jSONObject2.getJSONObject("010");
                        }
                        if (ck.m622a(jSONObject2, "11Z")) {
                            jSONObject3 = jSONObject2.getJSONObject("11Z");
                            authConfigManager4 = new AuthConfigManager();
                            cc.m534a(jSONObject3, authConfigManager4);
                            authConfigManager6.f575r = authConfigManager4;
                        }
                        if (ck.m622a(jSONObject2, "135")) {
                            authConfigManager6.f562e = jSONObject2.getJSONObject("135");
                        }
                        if (ck.m622a(jSONObject2, "121")) {
                            jSONObject3 = jSONObject2.getJSONObject("121");
                            authConfigManager4 = new AuthConfigManager();
                            cc.m534a(jSONObject3, authConfigManager4);
                            authConfigManager6.f576s = authConfigManager4;
                        }
                        if (ck.m622a(jSONObject2, "122")) {
                            jSONObject3 = jSONObject2.getJSONObject("122");
                            authConfigManager4 = new AuthConfigManager();
                            cc.m534a(jSONObject3, authConfigManager4);
                            authConfigManager6.f577t = authConfigManager4;
                        }
                        if (ck.m622a(jSONObject2, "123")) {
                            jSONObject3 = jSONObject2.getJSONObject("123");
                            authConfigManager5 = new AuthConfigManager();
                            cc.m534a(jSONObject3, authConfigManager5);
                            authConfigManager6.f578u = authConfigManager5;
                        }
                    }
                    return authConfigManager6;
                }
                return authConfigManager6;
            } catch (IllegalBlockSizeException e5) {
                obj2 = anVar2;
                obj3 = obj;
                anVar = a;
                obj4 = obj3;
                if (bArr == null) {
                    return authConfigManager6;
                }
                if (TextUtils.isEmpty(a2)) {
                    a2 = ck.m618a(bArr);
                }
                jSONObject = new JSONObject(a2);
                if (jSONObject.has(NotificationCompatApi24.CATEGORY_STATUS)) {
                    i = jSONObject.getInt(NotificationCompatApi24.CATEGORY_STATUS);
                    if (i == 1) {
                        f581a = 1;
                    } else if (i == 0) {
                        a2 = "authcsid";
                        str2 = "authgsid";
                        if (anVar == null) {
                            str3 = anVar.f199c;
                            if (anVar.f198b != null) {
                                list = (List) anVar.f198b.get("gsid");
                                str4 = str3;
                                str3 = (String) list.get(0);
                                a2 = str4;
                            }
                            a2 = str3;
                            str3 = str2;
                        } else {
                            str3 = str2;
                        }
                        ck.m619a(context, a2, str3, jSONObject.toString());
                        f581a = 0;
                        if (jSONObject.has("info")) {
                            f582b = jSONObject.getString("info");
                        }
                        if (f581a == 0) {
                            authConfigManager6.f558a = f582b;
                            return authConfigManager6;
                        }
                    }
                    if (jSONObject.has("ver")) {
                        authConfigManager6.f559b = jSONObject.getInt("ver");
                    }
                    if (ck.m622a(jSONObject, "result")) {
                        authConfigManager = new AuthConfigManager();
                        authConfigManager.f547a = false;
                        authConfigManager.f548b = false;
                        authConfigManager6.f572o = authConfigManager;
                        jSONObject2 = jSONObject.getJSONObject("result");
                        if (ck.m622a(jSONObject2, "11K")) {
                            authConfigManager.f547a = cc.m535a(jSONObject2.getJSONObject("11K").getString("able"), false);
                        }
                        if (ck.m622a(jSONObject2, "11B")) {
                            authConfigManager6.f560c = jSONObject2.getJSONObject("11B");
                        }
                        if (ck.m622a(jSONObject2, "11C")) {
                            authConfigManager6.f563f = jSONObject2.getJSONObject("11C");
                        }
                        if (ck.m622a(jSONObject2, "11I")) {
                            authConfigManager6.f564g = jSONObject2.getJSONObject("11I");
                        }
                        if (ck.m622a(jSONObject2, "11H")) {
                            authConfigManager6.f565h = jSONObject2.getJSONObject("11H");
                        }
                        if (ck.m622a(jSONObject2, "11E")) {
                            authConfigManager6.f566i = jSONObject2.getJSONObject("11E");
                        }
                        if (ck.m622a(jSONObject2, "11F")) {
                            authConfigManager6.f567j = jSONObject2.getJSONObject("11F");
                        }
                        if (ck.m622a(jSONObject2, "13A")) {
                            authConfigManager6.f569l = jSONObject2.getJSONObject("13A");
                        }
                        if (ck.m622a(jSONObject2, "13J")) {
                            authConfigManager6.f561d = jSONObject2.getJSONObject("13J");
                        }
                        if (ck.m622a(jSONObject2, "11G")) {
                            authConfigManager6.f568k = jSONObject2.getJSONObject("11G");
                        }
                        if (ck.m622a(jSONObject2, "001")) {
                            jSONObject3 = jSONObject2.getJSONObject("001");
                            authConfigManager2 = new AuthConfigManager();
                            if (jSONObject3 != null) {
                                obj = cc.m532a(jSONObject3, "md5");
                                a3 = cc.m532a(jSONObject3, ParamKey.URL);
                                obj2 = cc.m532a(jSONObject3, "sdkversion");
                                authConfigManager2.f555a = a3;
                                authConfigManager2.f556b = obj;
                                authConfigManager2.f557c = obj2;
                            }
                            authConfigManager6.f573p = authConfigManager2;
                        }
                        if (ck.m622a(jSONObject2, "002")) {
                            jSONObject3 = jSONObject2.getJSONObject("002");
                            authConfigManager3 = new AuthConfigManager();
                            if (jSONObject3 != null) {
                                a4 = cc.m532a(jSONObject3, "md5");
                                a2 = cc.m532a(jSONObject3, ParamKey.URL);
                                authConfigManager3.f554b = a4;
                                authConfigManager3.f553a = a2;
                            }
                            authConfigManager6.f574q = authConfigManager3;
                        }
                        if (ck.m622a(jSONObject2, "006")) {
                            authConfigManager6.f570m = jSONObject2.getJSONObject("006");
                        }
                        if (ck.m622a(jSONObject2, "010")) {
                            authConfigManager6.f571n = jSONObject2.getJSONObject("010");
                        }
                        if (ck.m622a(jSONObject2, "11Z")) {
                            jSONObject3 = jSONObject2.getJSONObject("11Z");
                            authConfigManager4 = new AuthConfigManager();
                            cc.m534a(jSONObject3, authConfigManager4);
                            authConfigManager6.f575r = authConfigManager4;
                        }
                        if (ck.m622a(jSONObject2, "135")) {
                            authConfigManager6.f562e = jSONObject2.getJSONObject("135");
                        }
                        if (ck.m622a(jSONObject2, "121")) {
                            jSONObject3 = jSONObject2.getJSONObject("121");
                            authConfigManager4 = new AuthConfigManager();
                            cc.m534a(jSONObject3, authConfigManager4);
                            authConfigManager6.f576s = authConfigManager4;
                        }
                        if (ck.m622a(jSONObject2, "122")) {
                            jSONObject3 = jSONObject2.getJSONObject("122");
                            authConfigManager4 = new AuthConfigManager();
                            cc.m534a(jSONObject3, authConfigManager4);
                            authConfigManager6.f577t = authConfigManager4;
                        }
                        if (ck.m622a(jSONObject2, "123")) {
                            jSONObject3 = jSONObject2.getJSONObject("123");
                            authConfigManager5 = new AuthConfigManager();
                            cc.m534a(jSONObject3, authConfigManager5);
                            authConfigManager6.f578u = authConfigManager5;
                        }
                    }
                    return authConfigManager6;
                }
                return authConfigManager6;
            } catch (Throwable th4) {
                th2222 = th4;
                cm.m637a(th2222, "ConfigManager", "loadConfig");
                obj2 = anVar2;
                obj3 = obj;
                anVar = a;
                obj4 = obj3;
                if (bArr == null) {
                    return authConfigManager6;
                }
                if (TextUtils.isEmpty(a2)) {
                    a2 = ck.m618a(bArr);
                }
                jSONObject = new JSONObject(a2);
                if (jSONObject.has(NotificationCompatApi24.CATEGORY_STATUS)) {
                    i = jSONObject.getInt(NotificationCompatApi24.CATEGORY_STATUS);
                    if (i == 1) {
                        f581a = 1;
                    } else if (i == 0) {
                        a2 = "authcsid";
                        str2 = "authgsid";
                        if (anVar == null) {
                            str3 = str2;
                        } else {
                            str3 = anVar.f199c;
                            if (anVar.f198b != null) {
                                list = (List) anVar.f198b.get("gsid");
                                str4 = str3;
                                str3 = (String) list.get(0);
                                a2 = str4;
                            }
                            a2 = str3;
                            str3 = str2;
                        }
                        ck.m619a(context, a2, str3, jSONObject.toString());
                        f581a = 0;
                        if (jSONObject.has("info")) {
                            f582b = jSONObject.getString("info");
                        }
                        if (f581a == 0) {
                            authConfigManager6.f558a = f582b;
                            return authConfigManager6;
                        }
                    }
                    if (jSONObject.has("ver")) {
                        authConfigManager6.f559b = jSONObject.getInt("ver");
                    }
                    if (ck.m622a(jSONObject, "result")) {
                        authConfigManager = new AuthConfigManager();
                        authConfigManager.f547a = false;
                        authConfigManager.f548b = false;
                        authConfigManager6.f572o = authConfigManager;
                        jSONObject2 = jSONObject.getJSONObject("result");
                        if (ck.m622a(jSONObject2, "11K")) {
                            authConfigManager.f547a = cc.m535a(jSONObject2.getJSONObject("11K").getString("able"), false);
                        }
                        if (ck.m622a(jSONObject2, "11B")) {
                            authConfigManager6.f560c = jSONObject2.getJSONObject("11B");
                        }
                        if (ck.m622a(jSONObject2, "11C")) {
                            authConfigManager6.f563f = jSONObject2.getJSONObject("11C");
                        }
                        if (ck.m622a(jSONObject2, "11I")) {
                            authConfigManager6.f564g = jSONObject2.getJSONObject("11I");
                        }
                        if (ck.m622a(jSONObject2, "11H")) {
                            authConfigManager6.f565h = jSONObject2.getJSONObject("11H");
                        }
                        if (ck.m622a(jSONObject2, "11E")) {
                            authConfigManager6.f566i = jSONObject2.getJSONObject("11E");
                        }
                        if (ck.m622a(jSONObject2, "11F")) {
                            authConfigManager6.f567j = jSONObject2.getJSONObject("11F");
                        }
                        if (ck.m622a(jSONObject2, "13A")) {
                            authConfigManager6.f569l = jSONObject2.getJSONObject("13A");
                        }
                        if (ck.m622a(jSONObject2, "13J")) {
                            authConfigManager6.f561d = jSONObject2.getJSONObject("13J");
                        }
                        if (ck.m622a(jSONObject2, "11G")) {
                            authConfigManager6.f568k = jSONObject2.getJSONObject("11G");
                        }
                        if (ck.m622a(jSONObject2, "001")) {
                            jSONObject3 = jSONObject2.getJSONObject("001");
                            authConfigManager2 = new AuthConfigManager();
                            if (jSONObject3 != null) {
                                obj = cc.m532a(jSONObject3, "md5");
                                a3 = cc.m532a(jSONObject3, ParamKey.URL);
                                obj2 = cc.m532a(jSONObject3, "sdkversion");
                                authConfigManager2.f555a = a3;
                                authConfigManager2.f556b = obj;
                                authConfigManager2.f557c = obj2;
                            }
                            authConfigManager6.f573p = authConfigManager2;
                        }
                        if (ck.m622a(jSONObject2, "002")) {
                            jSONObject3 = jSONObject2.getJSONObject("002");
                            authConfigManager3 = new AuthConfigManager();
                            if (jSONObject3 != null) {
                                a4 = cc.m532a(jSONObject3, "md5");
                                a2 = cc.m532a(jSONObject3, ParamKey.URL);
                                authConfigManager3.f554b = a4;
                                authConfigManager3.f553a = a2;
                            }
                            authConfigManager6.f574q = authConfigManager3;
                        }
                        if (ck.m622a(jSONObject2, "006")) {
                            authConfigManager6.f570m = jSONObject2.getJSONObject("006");
                        }
                        if (ck.m622a(jSONObject2, "010")) {
                            authConfigManager6.f571n = jSONObject2.getJSONObject("010");
                        }
                        if (ck.m622a(jSONObject2, "11Z")) {
                            jSONObject3 = jSONObject2.getJSONObject("11Z");
                            authConfigManager4 = new AuthConfigManager();
                            cc.m534a(jSONObject3, authConfigManager4);
                            authConfigManager6.f575r = authConfigManager4;
                        }
                        if (ck.m622a(jSONObject2, "135")) {
                            authConfigManager6.f562e = jSONObject2.getJSONObject("135");
                        }
                        if (ck.m622a(jSONObject2, "121")) {
                            jSONObject3 = jSONObject2.getJSONObject("121");
                            authConfigManager4 = new AuthConfigManager();
                            cc.m534a(jSONObject3, authConfigManager4);
                            authConfigManager6.f576s = authConfigManager4;
                        }
                        if (ck.m622a(jSONObject2, "122")) {
                            jSONObject3 = jSONObject2.getJSONObject("122");
                            authConfigManager4 = new AuthConfigManager();
                            cc.m534a(jSONObject3, authConfigManager4);
                            authConfigManager6.f577t = authConfigManager4;
                        }
                        if (ck.m622a(jSONObject2, "123")) {
                            jSONObject3 = jSONObject2.getJSONObject("123");
                            authConfigManager5 = new AuthConfigManager();
                            cc.m534a(jSONObject3, authConfigManager5);
                            authConfigManager6.f578u = authConfigManager5;
                        }
                    }
                    return authConfigManager6;
                }
                return authConfigManager6;
            }
        } catch (ca e6) {
            throw e6;
        } catch (IllegalBlockSizeException e7) {
            a = anVar2;
            obj = anVar2;
            obj2 = anVar2;
            obj3 = obj;
            anVar = a;
            obj4 = obj3;
            if (bArr == null) {
                return authConfigManager6;
            }
            if (TextUtils.isEmpty(a2)) {
                a2 = ck.m618a(bArr);
            }
            jSONObject = new JSONObject(a2);
            if (jSONObject.has(NotificationCompatApi24.CATEGORY_STATUS)) {
                i = jSONObject.getInt(NotificationCompatApi24.CATEGORY_STATUS);
                if (i == 1) {
                    f581a = 1;
                } else if (i == 0) {
                    a2 = "authcsid";
                    str2 = "authgsid";
                    if (anVar == null) {
                        str3 = str2;
                    } else {
                        str3 = anVar.f199c;
                        if (anVar.f198b != null) {
                            list = (List) anVar.f198b.get("gsid");
                            str4 = str3;
                            str3 = (String) list.get(0);
                            a2 = str4;
                        }
                        a2 = str3;
                        str3 = str2;
                    }
                    ck.m619a(context, a2, str3, jSONObject.toString());
                    f581a = 0;
                    if (jSONObject.has("info")) {
                        f582b = jSONObject.getString("info");
                    }
                    if (f581a == 0) {
                        authConfigManager6.f558a = f582b;
                        return authConfigManager6;
                    }
                }
                if (jSONObject.has("ver")) {
                    authConfigManager6.f559b = jSONObject.getInt("ver");
                }
                if (ck.m622a(jSONObject, "result")) {
                    authConfigManager = new AuthConfigManager();
                    authConfigManager.f547a = false;
                    authConfigManager.f548b = false;
                    authConfigManager6.f572o = authConfigManager;
                    jSONObject2 = jSONObject.getJSONObject("result");
                    if (ck.m622a(jSONObject2, "11K")) {
                        authConfigManager.f547a = cc.m535a(jSONObject2.getJSONObject("11K").getString("able"), false);
                    }
                    if (ck.m622a(jSONObject2, "11B")) {
                        authConfigManager6.f560c = jSONObject2.getJSONObject("11B");
                    }
                    if (ck.m622a(jSONObject2, "11C")) {
                        authConfigManager6.f563f = jSONObject2.getJSONObject("11C");
                    }
                    if (ck.m622a(jSONObject2, "11I")) {
                        authConfigManager6.f564g = jSONObject2.getJSONObject("11I");
                    }
                    if (ck.m622a(jSONObject2, "11H")) {
                        authConfigManager6.f565h = jSONObject2.getJSONObject("11H");
                    }
                    if (ck.m622a(jSONObject2, "11E")) {
                        authConfigManager6.f566i = jSONObject2.getJSONObject("11E");
                    }
                    if (ck.m622a(jSONObject2, "11F")) {
                        authConfigManager6.f567j = jSONObject2.getJSONObject("11F");
                    }
                    if (ck.m622a(jSONObject2, "13A")) {
                        authConfigManager6.f569l = jSONObject2.getJSONObject("13A");
                    }
                    if (ck.m622a(jSONObject2, "13J")) {
                        authConfigManager6.f561d = jSONObject2.getJSONObject("13J");
                    }
                    if (ck.m622a(jSONObject2, "11G")) {
                        authConfigManager6.f568k = jSONObject2.getJSONObject("11G");
                    }
                    if (ck.m622a(jSONObject2, "001")) {
                        jSONObject3 = jSONObject2.getJSONObject("001");
                        authConfigManager2 = new AuthConfigManager();
                        if (jSONObject3 != null) {
                            obj = cc.m532a(jSONObject3, "md5");
                            a3 = cc.m532a(jSONObject3, ParamKey.URL);
                            obj2 = cc.m532a(jSONObject3, "sdkversion");
                            authConfigManager2.f555a = a3;
                            authConfigManager2.f556b = obj;
                            authConfigManager2.f557c = obj2;
                        }
                        authConfigManager6.f573p = authConfigManager2;
                    }
                    if (ck.m622a(jSONObject2, "002")) {
                        jSONObject3 = jSONObject2.getJSONObject("002");
                        authConfigManager3 = new AuthConfigManager();
                        if (jSONObject3 != null) {
                            a4 = cc.m532a(jSONObject3, "md5");
                            a2 = cc.m532a(jSONObject3, ParamKey.URL);
                            authConfigManager3.f554b = a4;
                            authConfigManager3.f553a = a2;
                        }
                        authConfigManager6.f574q = authConfigManager3;
                    }
                    if (ck.m622a(jSONObject2, "006")) {
                        authConfigManager6.f570m = jSONObject2.getJSONObject("006");
                    }
                    if (ck.m622a(jSONObject2, "010")) {
                        authConfigManager6.f571n = jSONObject2.getJSONObject("010");
                    }
                    if (ck.m622a(jSONObject2, "11Z")) {
                        jSONObject3 = jSONObject2.getJSONObject("11Z");
                        authConfigManager4 = new AuthConfigManager();
                        cc.m534a(jSONObject3, authConfigManager4);
                        authConfigManager6.f575r = authConfigManager4;
                    }
                    if (ck.m622a(jSONObject2, "135")) {
                        authConfigManager6.f562e = jSONObject2.getJSONObject("135");
                    }
                    if (ck.m622a(jSONObject2, "121")) {
                        jSONObject3 = jSONObject2.getJSONObject("121");
                        authConfigManager4 = new AuthConfigManager();
                        cc.m534a(jSONObject3, authConfigManager4);
                        authConfigManager6.f576s = authConfigManager4;
                    }
                    if (ck.m622a(jSONObject2, "122")) {
                        jSONObject3 = jSONObject2.getJSONObject("122");
                        authConfigManager4 = new AuthConfigManager();
                        cc.m534a(jSONObject3, authConfigManager4);
                        authConfigManager6.f577t = authConfigManager4;
                    }
                    if (ck.m622a(jSONObject2, "123")) {
                        jSONObject3 = jSONObject2.getJSONObject("123");
                        authConfigManager5 = new AuthConfigManager();
                        cc.m534a(jSONObject3, authConfigManager5);
                        authConfigManager6.f578u = authConfigManager5;
                    }
                }
                return authConfigManager6;
            }
            return authConfigManager6;
        } catch (ca e8) {
            e6 = e8;
            a = anVar2;
            obj = anVar2;
        } catch (Throwable th5) {
            th2222 = th5;
            a = anVar2;
            obj = anVar2;
            cm.m637a(th2222, "ConfigManager", "loadConfig");
            obj2 = anVar2;
            obj3 = obj;
            anVar = a;
            obj4 = obj3;
            if (bArr == null) {
                return authConfigManager6;
            }
            if (TextUtils.isEmpty(a2)) {
                a2 = ck.m618a(bArr);
            }
            jSONObject = new JSONObject(a2);
            if (jSONObject.has(NotificationCompatApi24.CATEGORY_STATUS)) {
                i = jSONObject.getInt(NotificationCompatApi24.CATEGORY_STATUS);
                if (i == 1) {
                    f581a = 1;
                } else if (i == 0) {
                    a2 = "authcsid";
                    str2 = "authgsid";
                    if (anVar == null) {
                        str3 = anVar.f199c;
                        if (anVar.f198b != null) {
                            list = (List) anVar.f198b.get("gsid");
                            str4 = str3;
                            str3 = (String) list.get(0);
                            a2 = str4;
                        }
                        a2 = str3;
                        str3 = str2;
                    } else {
                        str3 = str2;
                    }
                    ck.m619a(context, a2, str3, jSONObject.toString());
                    f581a = 0;
                    if (jSONObject.has("info")) {
                        f582b = jSONObject.getString("info");
                    }
                    if (f581a == 0) {
                        authConfigManager6.f558a = f582b;
                        return authConfigManager6;
                    }
                }
                if (jSONObject.has("ver")) {
                    authConfigManager6.f559b = jSONObject.getInt("ver");
                }
                if (ck.m622a(jSONObject, "result")) {
                    authConfigManager = new AuthConfigManager();
                    authConfigManager.f547a = false;
                    authConfigManager.f548b = false;
                    authConfigManager6.f572o = authConfigManager;
                    jSONObject2 = jSONObject.getJSONObject("result");
                    if (ck.m622a(jSONObject2, "11K")) {
                        authConfigManager.f547a = cc.m535a(jSONObject2.getJSONObject("11K").getString("able"), false);
                    }
                    if (ck.m622a(jSONObject2, "11B")) {
                        authConfigManager6.f560c = jSONObject2.getJSONObject("11B");
                    }
                    if (ck.m622a(jSONObject2, "11C")) {
                        authConfigManager6.f563f = jSONObject2.getJSONObject("11C");
                    }
                    if (ck.m622a(jSONObject2, "11I")) {
                        authConfigManager6.f564g = jSONObject2.getJSONObject("11I");
                    }
                    if (ck.m622a(jSONObject2, "11H")) {
                        authConfigManager6.f565h = jSONObject2.getJSONObject("11H");
                    }
                    if (ck.m622a(jSONObject2, "11E")) {
                        authConfigManager6.f566i = jSONObject2.getJSONObject("11E");
                    }
                    if (ck.m622a(jSONObject2, "11F")) {
                        authConfigManager6.f567j = jSONObject2.getJSONObject("11F");
                    }
                    if (ck.m622a(jSONObject2, "13A")) {
                        authConfigManager6.f569l = jSONObject2.getJSONObject("13A");
                    }
                    if (ck.m622a(jSONObject2, "13J")) {
                        authConfigManager6.f561d = jSONObject2.getJSONObject("13J");
                    }
                    if (ck.m622a(jSONObject2, "11G")) {
                        authConfigManager6.f568k = jSONObject2.getJSONObject("11G");
                    }
                    if (ck.m622a(jSONObject2, "001")) {
                        jSONObject3 = jSONObject2.getJSONObject("001");
                        authConfigManager2 = new AuthConfigManager();
                        if (jSONObject3 != null) {
                            obj = cc.m532a(jSONObject3, "md5");
                            a3 = cc.m532a(jSONObject3, ParamKey.URL);
                            obj2 = cc.m532a(jSONObject3, "sdkversion");
                            authConfigManager2.f555a = a3;
                            authConfigManager2.f556b = obj;
                            authConfigManager2.f557c = obj2;
                        }
                        authConfigManager6.f573p = authConfigManager2;
                    }
                    if (ck.m622a(jSONObject2, "002")) {
                        jSONObject3 = jSONObject2.getJSONObject("002");
                        authConfigManager3 = new AuthConfigManager();
                        if (jSONObject3 != null) {
                            a4 = cc.m532a(jSONObject3, "md5");
                            a2 = cc.m532a(jSONObject3, ParamKey.URL);
                            authConfigManager3.f554b = a4;
                            authConfigManager3.f553a = a2;
                        }
                        authConfigManager6.f574q = authConfigManager3;
                    }
                    if (ck.m622a(jSONObject2, "006")) {
                        authConfigManager6.f570m = jSONObject2.getJSONObject("006");
                    }
                    if (ck.m622a(jSONObject2, "010")) {
                        authConfigManager6.f571n = jSONObject2.getJSONObject("010");
                    }
                    if (ck.m622a(jSONObject2, "11Z")) {
                        jSONObject3 = jSONObject2.getJSONObject("11Z");
                        authConfigManager4 = new AuthConfigManager();
                        cc.m534a(jSONObject3, authConfigManager4);
                        authConfigManager6.f575r = authConfigManager4;
                    }
                    if (ck.m622a(jSONObject2, "135")) {
                        authConfigManager6.f562e = jSONObject2.getJSONObject("135");
                    }
                    if (ck.m622a(jSONObject2, "121")) {
                        jSONObject3 = jSONObject2.getJSONObject("121");
                        authConfigManager4 = new AuthConfigManager();
                        cc.m534a(jSONObject3, authConfigManager4);
                        authConfigManager6.f576s = authConfigManager4;
                    }
                    if (ck.m622a(jSONObject2, "122")) {
                        jSONObject3 = jSONObject2.getJSONObject("122");
                        authConfigManager4 = new AuthConfigManager();
                        cc.m534a(jSONObject3, authConfigManager4);
                        authConfigManager6.f577t = authConfigManager4;
                    }
                    if (ck.m622a(jSONObject2, "123")) {
                        jSONObject3 = jSONObject2.getJSONObject("123");
                        authConfigManager5 = new AuthConfigManager();
                        cc.m534a(jSONObject3, authConfigManager5);
                        authConfigManager6.f578u = authConfigManager5;
                    }
                }
                return authConfigManager6;
            }
            return authConfigManager6;
        }
        if (bArr == null) {
            return authConfigManager6;
        }
        if (TextUtils.isEmpty(a2)) {
            a2 = ck.m618a(bArr);
        }
        jSONObject = new JSONObject(a2);
        if (jSONObject.has(NotificationCompatApi24.CATEGORY_STATUS)) {
            i = jSONObject.getInt(NotificationCompatApi24.CATEGORY_STATUS);
            if (i == 1) {
                f581a = 1;
            } else if (i == 0) {
                a2 = "authcsid";
                str2 = "authgsid";
                if (anVar == null) {
                    str3 = anVar.f199c;
                    if (anVar.f198b != null) {
                        list = (List) anVar.f198b.get("gsid");
                        if (list != null && list.size() > 0) {
                            str4 = str3;
                            str3 = (String) list.get(0);
                            a2 = str4;
                        }
                    }
                    a2 = str3;
                    str3 = str2;
                } else {
                    str3 = str2;
                }
                ck.m619a(context, a2, str3, jSONObject.toString());
                f581a = 0;
                if (jSONObject.has("info")) {
                    f582b = jSONObject.getString("info");
                }
                if (f581a == 0) {
                    authConfigManager6.f558a = f582b;
                    return authConfigManager6;
                }
            }
            if (jSONObject.has("ver")) {
                authConfigManager6.f559b = jSONObject.getInt("ver");
            }
            if (ck.m622a(jSONObject, "result")) {
                authConfigManager = new AuthConfigManager();
                authConfigManager.f547a = false;
                authConfigManager.f548b = false;
                authConfigManager6.f572o = authConfigManager;
                jSONObject2 = jSONObject.getJSONObject("result");
                if (ck.m622a(jSONObject2, "11K")) {
                    authConfigManager.f547a = cc.m535a(jSONObject2.getJSONObject("11K").getString("able"), false);
                }
                if (ck.m622a(jSONObject2, "11B")) {
                    authConfigManager6.f560c = jSONObject2.getJSONObject("11B");
                }
                if (ck.m622a(jSONObject2, "11C")) {
                    authConfigManager6.f563f = jSONObject2.getJSONObject("11C");
                }
                if (ck.m622a(jSONObject2, "11I")) {
                    authConfigManager6.f564g = jSONObject2.getJSONObject("11I");
                }
                if (ck.m622a(jSONObject2, "11H")) {
                    authConfigManager6.f565h = jSONObject2.getJSONObject("11H");
                }
                if (ck.m622a(jSONObject2, "11E")) {
                    authConfigManager6.f566i = jSONObject2.getJSONObject("11E");
                }
                if (ck.m622a(jSONObject2, "11F")) {
                    authConfigManager6.f567j = jSONObject2.getJSONObject("11F");
                }
                if (ck.m622a(jSONObject2, "13A")) {
                    authConfigManager6.f569l = jSONObject2.getJSONObject("13A");
                }
                if (ck.m622a(jSONObject2, "13J")) {
                    authConfigManager6.f561d = jSONObject2.getJSONObject("13J");
                }
                if (ck.m622a(jSONObject2, "11G")) {
                    authConfigManager6.f568k = jSONObject2.getJSONObject("11G");
                }
                if (ck.m622a(jSONObject2, "001")) {
                    jSONObject3 = jSONObject2.getJSONObject("001");
                    authConfigManager2 = new AuthConfigManager();
                    if (jSONObject3 != null) {
                        obj = cc.m532a(jSONObject3, "md5");
                        a3 = cc.m532a(jSONObject3, ParamKey.URL);
                        obj2 = cc.m532a(jSONObject3, "sdkversion");
                        if (!(TextUtils.isEmpty(obj) || TextUtils.isEmpty(a3) || TextUtils.isEmpty(obj2))) {
                            authConfigManager2.f555a = a3;
                            authConfigManager2.f556b = obj;
                            authConfigManager2.f557c = obj2;
                        }
                    }
                    authConfigManager6.f573p = authConfigManager2;
                }
                if (ck.m622a(jSONObject2, "002")) {
                    jSONObject3 = jSONObject2.getJSONObject("002");
                    authConfigManager3 = new AuthConfigManager();
                    if (jSONObject3 != null) {
                        a4 = cc.m532a(jSONObject3, "md5");
                        a2 = cc.m532a(jSONObject3, ParamKey.URL);
                        authConfigManager3.f554b = a4;
                        authConfigManager3.f553a = a2;
                    }
                    authConfigManager6.f574q = authConfigManager3;
                }
                if (ck.m622a(jSONObject2, "006")) {
                    authConfigManager6.f570m = jSONObject2.getJSONObject("006");
                }
                if (ck.m622a(jSONObject2, "010")) {
                    authConfigManager6.f571n = jSONObject2.getJSONObject("010");
                }
                if (ck.m622a(jSONObject2, "11Z")) {
                    jSONObject3 = jSONObject2.getJSONObject("11Z");
                    authConfigManager4 = new AuthConfigManager();
                    cc.m534a(jSONObject3, authConfigManager4);
                    authConfigManager6.f575r = authConfigManager4;
                }
                if (ck.m622a(jSONObject2, "135")) {
                    authConfigManager6.f562e = jSONObject2.getJSONObject("135");
                }
                if (ck.m622a(jSONObject2, "121")) {
                    jSONObject3 = jSONObject2.getJSONObject("121");
                    authConfigManager4 = new AuthConfigManager();
                    cc.m534a(jSONObject3, authConfigManager4);
                    authConfigManager6.f576s = authConfigManager4;
                }
                if (ck.m622a(jSONObject2, "122")) {
                    jSONObject3 = jSONObject2.getJSONObject("122");
                    authConfigManager4 = new AuthConfigManager();
                    cc.m534a(jSONObject3, authConfigManager4);
                    authConfigManager6.f577t = authConfigManager4;
                }
                if (ck.m622a(jSONObject2, "123")) {
                    jSONObject3 = jSONObject2.getJSONObject("123");
                    authConfigManager5 = new AuthConfigManager();
                    cc.m534a(jSONObject3, authConfigManager5);
                    authConfigManager6.f578u = authConfigManager5;
                }
            }
            return authConfigManager6;
        }
        return authConfigManager6;
    }

    private static String m532a(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return LetterIndexBar.SEARCH_ICON_LETTER;
        }
        String str2 = LetterIndexBar.SEARCH_ICON_LETTER;
        return (!jSONObject.has(str) || jSONObject.getString(str).equals("[]")) ? str2 : jSONObject.optString(str);
    }

    public static void m533a(String str) {
        cb.m519b(str);
    }

    private static void m534a(JSONObject jSONObject, AuthConfigManager authConfigManager) {
        try {
            String a = cc.m532a(jSONObject, "m");
            String a2 = cc.m532a(jSONObject, "u");
            String a3 = cc.m532a(jSONObject, "v");
            String a4 = cc.m532a(jSONObject, "able");
            authConfigManager.f551c = a;
            authConfigManager.f550b = a2;
            authConfigManager.f552d = a3;
            authConfigManager.f549a = cc.m535a(a4, false);
        } catch (Throwable th) {
            cm.m637a(th, "ConfigManager", "parsePluginEntity");
        }
    }

    public static boolean m535a(String str, boolean z) {
        try {
            String[] split = URLDecoder.decode(str).split("/");
            return split[split.length + -1].charAt(4) % 2 == 1;
        } catch (Throwable th) {
            return z;
        }
    }
}
