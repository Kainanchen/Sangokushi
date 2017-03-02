package com.alipay.sdk.util;

import com.alipay.sdk.app.C0143i;
import com.alipay.sdk.app.statistic.C0144a;
import com.alipay.sdk.app.statistic.C0146c;
import com.tencent.connect.common.Constants;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.alipay.sdk.util.j */
public final class C0203j {
    public static final String f517a = "resultStatus";
    public static final String f518b = "memo";
    public static final String f519c = "result";

    public static Map<String, String> m669a(String str) {
        C0143i a = C0143i.m392a(C0143i.CANCELED.f228h);
        Map<String, String> hashMap = new HashMap();
        hashMap.put(f517a, Integer.toString(a.f228h));
        hashMap.put(f518b, a.f229i);
        hashMap.put(f519c, Constants.STR_EMPTY);
        try {
            hashMap = C0203j.m670b(str);
        } catch (Throwable th) {
            C0144a.m399a(C0146c.f242b, C0146c.f246f, th);
        }
        return hashMap;
    }

    private static Map<String, String> m668a() {
        C0143i a = C0143i.m392a(C0143i.CANCELED.f228h);
        Map<String, String> hashMap = new HashMap();
        hashMap.put(f517a, Integer.toString(a.f228h));
        hashMap.put(f518b, a.f229i);
        hashMap.put(f519c, Constants.STR_EMPTY);
        return hashMap;
    }

    private static Map<String, String> m670b(String str) {
        String[] split = str.split(C0201h.f510b);
        Map<String, String> hashMap = new HashMap();
        for (String str2 : split) {
            String substring = str2.substring(0, str2.indexOf("={"));
            String str3 = substring + "={";
            hashMap.put(substring, str2.substring(str3.length() + str2.indexOf(str3), str2.lastIndexOf(C0201h.f512d)));
        }
        return hashMap;
    }

    private static String m667a(String str, String str2) {
        String str3 = str2 + "={";
        return str.substring(str3.length() + str.indexOf(str3), str.lastIndexOf(C0201h.f512d));
    }
}
