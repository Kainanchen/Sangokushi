package com.facebook.p036h;

import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* compiled from: ProfileInformationCache */
/* renamed from: com.facebook.h.ab */
final class ab {
    private static final ConcurrentHashMap<String, JSONObject> f1548a;

    static {
        f1548a = new ConcurrentHashMap();
    }

    public static JSONObject m1475a(String str) {
        return (JSONObject) f1548a.get(str);
    }

    public static void m1476a(String str, JSONObject jSONObject) {
        f1548a.put(str, jSONObject);
    }
}
