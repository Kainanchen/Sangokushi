package com.alipay.apmobilesecuritysdk.p007d;

import android.content.Context;
import com.alipay.p011b.p012a.p013a.p016b.C0113b;
import com.alipay.p011b.p012a.p013a.p016b.C0115d;
import com.tencent.connect.common.Constants;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.alipay.apmobilesecuritysdk.d.d */
public final class C0091d {
    public static synchronized Map<String, String> m144a(Context context) {
        Map<String, String> hashMap;
        synchronized (C0091d.class) {
            C0115d.m292a();
            C0113b.m245a();
            hashMap = new HashMap();
            hashMap.put("AE1", C0115d.m295b());
            hashMap.put("AE2", (C0115d.m296c() ? Constants.VIA_TO_TYPE_QQ_GROUP : Constants.VIA_RESULT_SUCCESS));
            hashMap.put("AE3", (C0115d.m294a(context) ? Constants.VIA_TO_TYPE_QQ_GROUP : Constants.VIA_RESULT_SUCCESS));
            hashMap.put("AE4", C0115d.m297d());
            hashMap.put("AE5", C0115d.m298e());
            hashMap.put("AE6", C0115d.m299f());
            hashMap.put("AE7", C0115d.m300g());
            hashMap.put("AE8", C0115d.m301h());
            hashMap.put("AE9", C0115d.m302i());
            hashMap.put("AE10", C0115d.m303j());
            hashMap.put("AE11", C0115d.m304k());
            hashMap.put("AE12", C0115d.m305l());
            hashMap.put("AE13", C0115d.m306m());
            hashMap.put("AE14", C0115d.m307n());
            hashMap.put("AE15", C0115d.m308o());
            hashMap.put("AE21", C0113b.m257g());
        }
        return hashMap;
    }
}
