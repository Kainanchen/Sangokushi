package com.alipay.sdk.app;

import com.alipay.sdk.util.C0201h;
import com.tencent.connect.common.Constants;

/* renamed from: com.alipay.sdk.app.h */
public final class C0142h {
    public static String f219a;

    private static void m387a(String str) {
        f219a = str;
    }

    private static String m388b() {
        return f219a;
    }

    public static String m385a() {
        C0143i a = C0143i.m392a(C0143i.CANCELED.f228h);
        return C0142h.m386a(a.f228h, a.f229i, Constants.STR_EMPTY);
    }

    private static String m389c() {
        C0143i a = C0143i.m392a(C0143i.DOUBLE_REQUEST.f228h);
        return C0142h.m386a(a.f228h, a.f229i, Constants.STR_EMPTY);
    }

    private static String m390d() {
        C0143i a = C0143i.m392a(C0143i.PARAMS_ERROR.f228h);
        return C0142h.m386a(a.f228h, a.f229i, Constants.STR_EMPTY);
    }

    public static String m386a(int i, String str, String str2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("resultStatus={").append(i).append("};memo={").append(str).append("};result={").append(str2).append(C0201h.f512d);
        return stringBuilder.toString();
    }
}
