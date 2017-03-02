package com.alipay.apmobilesecuritysdk.p007d;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.p009f.C0101h;
import com.alipay.p011b.p012a.p013a.p014a.C0110a;
import com.alipay.sdk.cons.C0166b;
import com.tencent.connect.common.Constants;
import com.tencent.open.SocialConstants;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.alipay.apmobilesecuritysdk.d.b */
public final class C0089b {
    public static synchronized Map<String, String> m142a(Context context, Map<String, String> map) {
        Map<String, String> hashMap;
        synchronized (C0089b.class) {
            hashMap = new HashMap();
            String a = C0110a.m233a(map, C0166b.f352c, Constants.STR_EMPTY);
            String a2 = C0110a.m233a(map, C0166b.f356g, Constants.STR_EMPTY);
            String a3 = C0110a.m233a(map, "userId", Constants.STR_EMPTY);
            String a4 = C0110a.m233a(map, SocialConstants.PARAM_APPNAME, Constants.STR_EMPTY);
            String a5 = C0110a.m233a(map, "appKeyClient", Constants.STR_EMPTY);
            String a6 = C0110a.m233a(map, "tmxSessionId", Constants.STR_EMPTY);
            String c = C0101h.m196c(context);
            hashMap.put("AC1", a);
            hashMap.put("AC2", a2);
            hashMap.put("AC3", Constants.STR_EMPTY);
            hashMap.put("AC4", c);
            hashMap.put("AC5", a3);
            hashMap.put("AC6", a6);
            hashMap.put("AC7", Constants.STR_EMPTY);
            hashMap.put("AC8", a4);
            hashMap.put("AC9", a5);
        }
        return hashMap;
    }
}
