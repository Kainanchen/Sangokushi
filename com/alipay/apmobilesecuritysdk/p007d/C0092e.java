package com.alipay.apmobilesecuritysdk.p007d;

import android.content.Context;
import com.alipay.p011b.p012a.p013a.p014a.p015a.C0108b;
import com.alipay.sdk.sys.C0190a;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.alipay.apmobilesecuritysdk.d.e */
public final class C0092e {
    private static Map<String, String> f106a;
    private static final String[] f107b;

    static {
        f106a = null;
        f107b = new String[]{"AD1", "AD2", "AD3", "AD5", "AD6", "AD7", "AD8", "AD9", "AD10", "AD11", "AD12", "AD13", "AD14", "AD15", "AD16", "AD18", "AD20", "AD21", "AD23", "AD24", "AD26", "AD27", "AD28", "AD29", "AD30", "AD31", "AD32", "AD34", "AA1", "AA2", "AA3", "AA4", "AA5", "AC4", "AE1", "AE2", "AE3", "AE4", "AE5", "AE6", "AE7", "AE8", "AE9", "AE10", "AE11", "AE12", "AE13", "AE14", "AE15"};
    }

    private static String m145a(Map<String, String> map) {
        StringBuffer stringBuffer = new StringBuffer();
        List arrayList = new ArrayList(map.keySet());
        Collections.sort(arrayList);
        int i = 0;
        while (i < arrayList.size()) {
            String str = (String) arrayList.get(i);
            String str2 = (String) map.get(str);
            if (str2 == null) {
                str2 = Constants.STR_EMPTY;
            }
            stringBuffer.append((i == 0 ? Constants.STR_EMPTY : C0190a.f451b) + str + "=" + str2);
            i++;
        }
        return stringBuffer.toString();
    }

    public static synchronized Map<String, String> m146a(Context context, Map<String, String> map) {
        Map<String, String> map2;
        synchronized (C0092e.class) {
            if (f106a == null) {
                C0092e.m149c(context, map);
            }
            map2 = f106a;
        }
        return map2;
    }

    public static synchronized void m147a() {
        synchronized (C0092e.class) {
            f106a = null;
        }
    }

    public static synchronized String m148b(Context context, Map<String, String> map) {
        Map treeMap;
        synchronized (C0092e.class) {
            C0092e.m146a(context, map);
            treeMap = new TreeMap();
            for (Object obj : f107b) {
                if (f106a.containsKey(obj)) {
                    treeMap.put(obj, f106a.get(obj));
                }
            }
        }
        return C0108b.m225a(C0092e.m145a(treeMap));
    }

    private static synchronized void m149c(Context context, Map<String, String> map) {
        synchronized (C0092e.class) {
            Map treeMap = new TreeMap();
            f106a = treeMap;
            treeMap.putAll(C0089b.m142a(context, map));
            f106a.putAll(C0091d.m144a(context));
            f106a.putAll(C0090c.m143a(context));
            f106a.putAll(C0088a.m141a(context, map));
        }
    }
}
