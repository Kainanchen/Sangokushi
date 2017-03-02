package com.alipay.sdk.packet;

import android.text.TextUtils;
import com.alipay.sdk.app.statistic.C0146c;
import com.alipay.sdk.sys.C0190a;
import com.alipay.sdk.util.C0201h;
import com.tencent.connect.common.Constants;

/* renamed from: com.alipay.sdk.packet.a */
public final class C0179a {
    public static String m536a(String str) {
        if (TextUtils.isEmpty(str)) {
            return Constants.STR_EMPTY;
        }
        String[] split = str.split(C0190a.f451b);
        if (split.length == 0) {
            return Constants.STR_EMPTY;
        }
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        for (String str2 : split) {
            if (TextUtils.isEmpty(obj4)) {
                obj4 = !str2.contains("biz_type") ? null : C0179a.m540e(str2);
            }
            if (TextUtils.isEmpty(obj3)) {
                obj3 = !str2.contains("biz_no") ? null : C0179a.m540e(str2);
            }
            if (TextUtils.isEmpty(obj2)) {
                obj2 = (!str2.contains(C0146c.f240G) || str2.startsWith(C0146c.f239F)) ? null : C0179a.m540e(str2);
            }
            if (TextUtils.isEmpty(obj)) {
                if (str2.contains("app_userid")) {
                    obj = C0179a.m540e(str2);
                } else {
                    obj = null;
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (!TextUtils.isEmpty(obj4)) {
            stringBuilder.append("biz_type=" + obj4 + C0201h.f510b);
        }
        if (!TextUtils.isEmpty(obj3)) {
            stringBuilder.append("biz_no=" + obj3 + C0201h.f510b);
        }
        if (!TextUtils.isEmpty(obj2)) {
            stringBuilder.append("trade_no=" + obj2 + C0201h.f510b);
        }
        if (!TextUtils.isEmpty(obj)) {
            stringBuilder.append("app_userid=" + obj + C0201h.f510b);
        }
        String stringBuilder2 = stringBuilder.toString();
        if (stringBuilder2.endsWith(C0201h.f510b)) {
            return stringBuilder2.substring(0, stringBuilder2.length() - 1);
        }
        return stringBuilder2;
    }

    private static String m537b(String str) {
        if (str.contains("biz_type")) {
            return C0179a.m540e(str);
        }
        return null;
    }

    private static String m538c(String str) {
        if (str.contains("biz_no")) {
            return C0179a.m540e(str);
        }
        return null;
    }

    private static String m539d(String str) {
        if (!str.contains(C0146c.f240G) || str.startsWith(C0146c.f239F)) {
            return null;
        }
        return C0179a.m540e(str);
    }

    private static String m540e(String str) {
        String[] split = str.split("=");
        if (split.length <= 1) {
            return null;
        }
        String str2 = split[1];
        if (str2.contains(C0201h.f514f)) {
            return str2.replaceAll(C0201h.f514f, Constants.STR_EMPTY);
        }
        return str2;
    }

    private static String m541f(String str) {
        if (str.contains("app_userid")) {
            return C0179a.m540e(str);
        }
        return null;
    }
}
