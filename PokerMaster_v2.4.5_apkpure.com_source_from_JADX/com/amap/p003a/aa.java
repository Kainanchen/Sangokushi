package com.amap.p003a;

import a.does.not.Exists2;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import java.util.HashMap;
import java.util.Map;

@EntityClass(a = "file")
/* compiled from: DynamicPlugin */
/* renamed from: com.amap.a.aa */
public class aa {
    @EntityField(a = "fname", b = 6)
    String f75a;
    @EntityField(a = "md", b = 6)
    String f76b;
    @EntityField(a = "version", b = 6)
    String f77c;
    @EntityField(a = "dversion", b = 6)
    String f78d;
    @EntityField(a = "status", b = 6)
    String f79e;
    @EntityField(a = "sname", b = 6)
    private String f80f;

    /* renamed from: com.amap.a.aa.a */
    public static class DynamicPlugin {
        String f69a;
        String f70b;
        String f71c;
        String f72d;
        String f73e;
        String f74f;

        static {
            fixHelper.fixfunc(new int[]{2990, 2991});
            if (VERSION.SDK_INT <= 0) {
                Exists2.class.toString();
            }
        }

        public native DynamicPlugin(String str, String str2, String str3, String str4, String str5);

        public final native aa m64a();
    }

    private aa() {
    }

    public aa(DynamicPlugin dynamicPlugin) {
        this.f75a = dynamicPlugin.f69a;
        this.f76b = dynamicPlugin.f70b;
        this.f80f = dynamicPlugin.f71c;
        this.f77c = dynamicPlugin.f72d;
        this.f78d = dynamicPlugin.f73e;
        this.f79e = dynamicPlugin.f74f;
    }

    public static String m65a(String str) {
        Map hashMap = new HashMap();
        hashMap.put("sname", str);
        return DBOperation.m678a(hashMap);
    }

    public static String m66a(String str, String str2) {
        Map hashMap = new HashMap();
        hashMap.put("sname", str);
        hashMap.put("dversion", str2);
        return DBOperation.m678a(hashMap);
    }

    public static String m67a(String str, String str2, String str3, String str4) {
        Map hashMap = new HashMap();
        hashMap.put("fname", str);
        hashMap.put("sname", str2);
        hashMap.put("dversion", str4);
        hashMap.put(LogBuilder.KEY_VERSION, str3);
        return DBOperation.m678a(hashMap);
    }

    public static String m68b(String str) {
        Map hashMap = new HashMap();
        hashMap.put("fname", str);
        return DBOperation.m678a(hashMap);
    }

    public static String m69b(String str, String str2) {
        Map hashMap = new HashMap();
        hashMap.put("sname", str);
        hashMap.put(NotificationCompatApi24.CATEGORY_STATUS, str2);
        return DBOperation.m678a(hashMap);
    }
}
