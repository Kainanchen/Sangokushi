package com.alipay.sdk.util;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.sdk.app.statistic.C0144a;
import com.alipay.sdk.app.statistic.C0146c;
import com.alipay.sdk.sys.C0190a;
import com.tencent.connect.common.Constants;

/* renamed from: com.alipay.sdk.util.h */
public final class C0201h {
    public static final String f509a = "pref_trade_token";
    public static final String f510b = ";";
    public static final String f511c = "result={";
    public static final String f512d = "}";
    public static final String f513e = "trade_token=\"";
    public static final String f514f = "\"";
    public static final String f515g = "trade_token=";

    private static void m661a(Context context, String str) {
        Object obj = null;
        try {
            if (!TextUtils.isEmpty(str)) {
                String[] split = str.split(f510b);
                int i = 0;
                while (i < split.length) {
                    if (split[i].startsWith(f511c) && split[i].endsWith(f512d)) {
                        String[] split2 = split[i].substring(8, split[i].length() - 1).split(C0190a.f451b);
                        int i2 = 0;
                        while (i2 < split2.length) {
                            if (split2[i2].startsWith(f513e) && split2[i2].endsWith(f514f)) {
                                obj = split2[i2].substring(13, split2[i2].length() - 1);
                                break;
                            } else if (split2[i2].startsWith(f515g)) {
                                obj = split2[i2].substring(12);
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                    i++;
                }
            }
            if (!TextUtils.isEmpty(obj)) {
                C0202i.m664a(context, f509a, obj);
            }
        } catch (Throwable th) {
            C0144a.m399a(C0146c.f242b, C0146c.f265y, th);
        }
    }

    private static String m660a(String str) {
        String str2 = null;
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(f510b);
            int i = 0;
            while (i < split.length) {
                if (split[i].startsWith(f511c) && split[i].endsWith(f512d)) {
                    String[] split2 = split[i].substring(8, split[i].length() - 1).split(C0190a.f451b);
                    int i2 = 0;
                    while (i2 < split2.length) {
                        if (split2[i2].startsWith(f513e) && split2[i2].endsWith(f514f)) {
                            str2 = split2[i2].substring(13, split2[i2].length() - 1);
                            break;
                        } else if (split2[i2].startsWith(f515g)) {
                            str2 = split2[i2].substring(12);
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                i++;
            }
        }
        return str2;
    }

    private static String m659a(Context context) {
        return C0202i.m665b(context, f509a, Constants.STR_EMPTY);
    }
}
