package com.alipay.sdk.app.statistic;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.sdk.sys.C0190a;
import com.alipay.sdk.util.C0201h;
import com.tencent.connect.common.Constants;

/* renamed from: com.alipay.sdk.app.statistic.a */
public final class C0144a {
    public static final String f230a = "alipay_cashier_statistic_record";
    private static C0146c f231b;

    public static void m396a(Context context) {
        if (f231b == null) {
            f231b = new C0146c(context);
        }
    }

    private static void m402b(Context context, String str) {
        new Thread(new C0145b(context, str)).start();
    }

    public static synchronized void m397a(Context context, String str) {
        String str2 = null;
        synchronized (C0144a.class) {
            if (f231b != null) {
                C0146c c0146c = f231b;
                if (TextUtils.isEmpty(c0146c.f275P)) {
                    str2 = Constants.STR_EMPTY;
                } else {
                    String str3;
                    String[] split = str.split(C0190a.f451b);
                    if (split != null) {
                        str3 = null;
                        for (String split2 : split) {
                            String[] split3 = split2.split("=");
                            if (split3 != null && split3.length == 2) {
                                if (split3[0].equalsIgnoreCase(C0146c.f238E)) {
                                    split3[1].replace(C0201h.f514f, Constants.STR_EMPTY);
                                } else if (split3[0].equalsIgnoreCase(C0146c.f239F)) {
                                    str3 = split3[1].replace(C0201h.f514f, Constants.STR_EMPTY);
                                } else if (split3[0].equalsIgnoreCase(C0146c.f240G)) {
                                    str2 = split3[1].replace(C0201h.f514f, Constants.STR_EMPTY);
                                }
                            }
                        }
                    } else {
                        str3 = null;
                    }
                    str2 = C0146c.m404a(str2);
                    String a = C0146c.m404a(C0146c.m404a(str3));
                    c0146c.f268I = String.format("%s,%s,-,%s,-,-,-", new Object[]{str2, str3, a});
                    str2 = String.format("[(%s),(%s),(%s),(%s),(%s),(%s),(%s),(%s),(%s),(%s)]", new Object[]{c0146c.f267H, c0146c.f268I, c0146c.f269J, c0146c.f270K, c0146c.f271L, c0146c.f272M, c0146c.f273N, c0146c.f274O, c0146c.f275P, c0146c.f276Q});
                }
                new Thread(new C0145b(context, str2)).start();
                f231b = null;
            }
        }
    }

    public static void m401a(String str, Throwable th) {
        if (f231b != null && th.getClass() != null) {
            f231b.m416a(str, th.getClass().getSimpleName(), th);
        }
    }

    private static void m400a(String str, String str2, Throwable th, String str3) {
        if (f231b != null) {
            f231b.m415a(str, str2, C0146c.m405a(th), str3);
        }
    }

    public static void m399a(String str, String str2, Throwable th) {
        if (f231b != null) {
            f231b.m416a(str, str2, th);
        }
    }

    public static void m398a(String str, String str2, String str3) {
        if (f231b != null) {
            f231b.m414a(str, str2, str3);
        }
    }
}
