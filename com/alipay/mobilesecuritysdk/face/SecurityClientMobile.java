package com.alipay.mobilesecuritysdk.face;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import com.alipay.apmobilesecuritysdk.p004a.C0085a;
import com.alipay.p011b.p012a.p013a.p014a.C0110a;
import com.alipay.sdk.cons.C0166b;
import com.tencent.connect.common.Constants;
import java.util.HashMap;
import java.util.Map;

public class SecurityClientMobile {
    public static synchronized String GetApdid(Context context, Map<String, String> map) {
        String a;
        synchronized (SecurityClientMobile.class) {
            Map hashMap = new HashMap();
            hashMap.put(C0166b.f356g, C0110a.m233a(map, C0166b.f356g, Constants.STR_EMPTY));
            hashMap.put(C0166b.f352c, C0110a.m233a(map, C0166b.f352c, Constants.STR_EMPTY));
            hashMap.put("userId", C0110a.m233a(map, "userId", Constants.STR_EMPTY));
            APSecuritySdk.getInstance(context).initToken(0, hashMap, null);
            a = C0085a.m128a(context);
        }
        return a;
    }
}
