package com.igexin.getuiext.util;

import com.alipay.sdk.sys.C0190a;
import java.util.ArrayList;
import java.util.HashMap;
import org.apache.http.message.BasicNameValuePair;

/* renamed from: com.igexin.getuiext.util.b */
public class C0328b {
    public static String m1091a(HashMap hashMap) {
        StringBuffer stringBuffer = new StringBuffer();
        Object obj = 1;
        for (String str : hashMap.keySet()) {
            Object obj2;
            String str2 = (String) hashMap.get(str);
            if (obj != null) {
                stringBuffer.append(str).append("=").append(str2);
                obj2 = null;
            } else {
                stringBuffer.append(C0190a.f451b);
                stringBuffer.append(str).append("=").append(str2);
                obj2 = obj;
            }
            obj = obj2;
        }
        return stringBuffer.toString();
    }

    public static ArrayList m1092b(HashMap hashMap) {
        ArrayList arrayList = new ArrayList();
        for (String str : hashMap.keySet()) {
            arrayList.add(new BasicNameValuePair(str, (String) hashMap.get(str)));
        }
        return arrayList;
    }
}
