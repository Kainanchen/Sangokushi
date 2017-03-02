package com.alipay.apmobilesecuritysdk.p007d;

import android.content.Context;
import com.alipay.p011b.p012a.p013a.p014a.C0110a;
import com.alipay.p011b.p012a.p013a.p016b.C0112a;
import com.tencent.connect.common.Constants;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.alipay.apmobilesecuritysdk.d.a */
public final class C0088a {
    public static synchronized Map<String, String> m141a(Context context, Map<String, String> map) {
        Map<String, String> hashMap;
        synchronized (C0088a.class) {
            String a = C0110a.m233a(map, "appchannel", Constants.STR_EMPTY);
            hashMap = new HashMap();
            hashMap.put("AA1", context.getPackageName());
            C0112a.m243a();
            hashMap.put("AA2", C0112a.m244a(context));
            hashMap.put("AA3", "security-sdk-token");
            hashMap.put("AA4", "3.2.0-20160621");
            hashMap.put("AA6", a);
        }
        return hashMap;
    }
}
