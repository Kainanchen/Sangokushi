package com.amap.p003a;

import a.does.not.Exists2;
import android.os.Build.VERSION;
import com.ali.fixHelper;
import java.util.HashMap;
import java.util.Map;

@EntityClass(a = "a")
/* compiled from: SDKInfo */
/* renamed from: com.amap.a.cj */
public class cj {
    @EntityField(a = "a6", b = 2)
    int f627a;
    @EntityField(a = "a1", b = 6)
    private String f628b;
    @EntityField(a = "a2", b = 6)
    private String f629c;
    @EntityField(a = "a3", b = 6)
    private String f630d;
    @EntityField(a = "a4", b = 6)
    private String f631e;
    @EntityField(a = "a5", b = 6)
    private String f632f;
    private String f633g;
    private String f634h;
    private String f635i;
    private String f636j;
    private String[] f637k;

    /* renamed from: com.amap.a.cj.a */
    public static class SDKInfo {
        String f621a;
        String f622b;
        String f623c;
        boolean f624d;
        String f625e;
        String[] f626f;

        public SDKInfo(String str, String str2, String str3) {
            this.f624d = true;
            this.f625e = "standard";
            this.f626f = null;
            this.f621a = str2;
            this.f623c = str3;
            this.f622b = str;
        }

        public final SDKInfo m605a(String[] strArr) {
            this.f626f = (String[]) strArr.clone();
            return this;
        }

        public final cj m606a() {
            if (this.f626f != null) {
                return new cj();
            }
            throw new ca("sdk packages is null");
        }
    }

    static {
        fixHelper.fixfunc(new int[]{176, 177, 178, 179, 180, 181, 182});
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    private native cj();

    private native cj(SDKInfo sDKInfo);

    native /* synthetic */ cj(SDKInfo sDKInfo, byte b);

    public static String m607a(String str) {
        Map hashMap = new HashMap();
        hashMap.put("a1", ck.m625b(str));
        return DBOperation.m678a(hashMap);
    }

    private static String m608a(String[] strArr) {
        String str = null;
        if (strArr != null) {
            try {
                StringBuilder stringBuilder = new StringBuilder();
                for (String append : strArr) {
                    stringBuilder.append(append).append(";");
                }
                str = stringBuilder.toString();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return str;
    }

    private static String[] m609b(String str) {
        try {
            return str.split(";");
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static String m610e() {
        return "a6=1";
    }

    public final native String m611a();

    public final native String m612b();

    public final native String m613c();

    public final native String[] m614d();
}
