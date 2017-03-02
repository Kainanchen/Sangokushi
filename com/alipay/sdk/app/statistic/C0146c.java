package com.alipay.sdk.app.statistic;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.alipay.sdk.cons.C0165a;
import com.alipay.sdk.sys.C0190a;
import com.alipay.sdk.sys.C0191b;
import com.alipay.sdk.tid.C0193b;
import com.alipay.sdk.util.C0194a;
import com.alipay.sdk.util.C0201h;
import com.tencent.connect.common.Constants;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: com.alipay.sdk.app.statistic.c */
public final class C0146c {
    public static final String f234A = "BindWaitTimeoutEx";
    public static final String f235B = "CheckClientExistEx";
    public static final String f236C = "CheckClientSignEx";
    public static final String f237D = "GetInstalledAppEx";
    public static final String f238E = "partner";
    public static final String f239F = "out_trade_no";
    public static final String f240G = "trade_no";
    public static final String f241a = "net";
    public static final String f242b = "biz";
    public static final String f243c = "cp";
    public static final String f244d = "auth";
    public static final String f245e = "third";
    public static final String f246f = "FormatResultEx";
    public static final String f247g = "GetApdidEx";
    public static final String f248h = "GetApdidNull";
    public static final String f249i = "GetApdidTimeout";
    public static final String f250j = "GetUtdidEx";
    public static final String f251k = "GetPackageInfoEx";
    public static final String f252l = "NotIncludeSignatures";
    public static final String f253m = "GetInstalledPackagesEx";
    public static final String f254n = "GetPublicKeyFromSignEx";
    public static final String f255o = "H5PayNetworkError";
    public static final String f256p = "H5AuthNetworkError";
    public static final String f257q = "SSLError";
    public static final String f258r = "H5PayDataAnalysisError";
    public static final String f259s = "H5AuthDataAnalysisError";
    public static final String f260t = "PublicKeyUnmatch";
    public static final String f261u = "ClientBindFailed";
    public static final String f262v = "TriDesEncryptError";
    public static final String f263w = "TriDesDecryptError";
    public static final String f264x = "ClientBindException";
    public static final String f265y = "SaveTradeTokenError";
    public static final String f266z = "ClientBindServiceFailed";
    String f267H;
    String f268I;
    String f269J;
    String f270K;
    String f271L;
    String f272M;
    String f273N;
    String f274O;
    String f275P;
    String f276Q;

    public C0146c(Context context) {
        this.f275P = Constants.STR_EMPTY;
        String format = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss").format(new Date());
        this.f267H = String.format("123456789,%s", new Object[]{format});
        this.f269J = C0146c.m403a(context);
        format = C0146c.m404a(C0165a.f339e);
        String a = C0146c.m404a(C0165a.f340f);
        this.f270K = String.format("android,3,%s,%s,com.alipay.mcpay,5.0,-,-,-", new Object[]{format, a});
        format = C0146c.m404a(C0193b.m619a().f472a);
        a = C0146c.m404a(C0191b.m600a().m606c());
        this.f271L = String.format("%s,%s,-,-,-", new Object[]{format, a});
        format = C0146c.m404a(C0194a.m635d(context));
        String a2 = C0146c.m404a(VERSION.RELEASE);
        String a3 = C0146c.m404a(Build.MODEL);
        String a4 = C0146c.m404a(C0194a.m628a(context).m636a());
        String a5 = C0146c.m404a(C0194a.m630b(context).f497p);
        String a6 = C0146c.m404a(C0194a.m628a(context).m637b());
        this.f272M = String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,-", new Object[]{format, "android", a2, a3, "-", a4, a5, "gw", a6});
        this.f273N = "-";
        this.f274O = "-";
        this.f276Q = "-";
    }

    private boolean m407a() {
        return TextUtils.isEmpty(this.f275P);
    }

    public final void m416a(String str, String str2, Throwable th) {
        m414a(str, str2, C0146c.m405a(th));
    }

    private void m406a(String str, String str2, Throwable th, String str3) {
        m415a(str, str2, C0146c.m405a(th), str3);
    }

    public final void m415a(String str, String str2, String str3, String str4) {
        String str5 = Constants.STR_EMPTY;
        if (!TextUtils.isEmpty(this.f275P)) {
            str5 = str5 + "^";
        }
        this.f275P += (str5 + String.format("%s,%s,%s,%s", new Object[]{str, str2, C0146c.m404a(str3), str4}));
    }

    public final void m414a(String str, String str2, String str3) {
        m415a(str, str2, str3, "-");
    }

    static String m404a(String str) {
        if (TextUtils.isEmpty(str)) {
            return Constants.STR_EMPTY;
        }
        return str.replace("[", "\u3010").replace("]", "\u3011").replace("(", "\uff08").replace(")", "\uff09").replace(",", "\uff0c").replace("-", "=").replace("^", "~");
    }

    static String m405a(Throwable th) {
        if (th == null) {
            return Constants.STR_EMPTY;
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            stringBuffer.append(th.getClass().getName()).append(":");
            stringBuffer.append(th.getMessage());
            stringBuffer.append(" \u300b ");
            StackTraceElement[] stackTrace = th.getStackTrace();
            if (stackTrace != null) {
                for (StackTraceElement stackTraceElement : stackTrace) {
                    stringBuffer.append(stackTraceElement.toString() + " \u300b ");
                }
            }
        } catch (Throwable th2) {
        }
        return stringBuffer.toString();
    }

    private String m410b(String str) {
        String str2 = null;
        if (TextUtils.isEmpty(this.f275P)) {
            return Constants.STR_EMPTY;
        }
        String str3;
        String[] split = str.split(C0190a.f451b);
        if (split != null) {
            str3 = null;
            for (String split2 : split) {
                String[] split3 = split2.split("=");
                if (split3 != null && split3.length == 2) {
                    if (split3[0].equalsIgnoreCase(f238E)) {
                        split3[1].replace(C0201h.f514f, Constants.STR_EMPTY);
                    } else if (split3[0].equalsIgnoreCase(f239F)) {
                        str3 = split3[1].replace(C0201h.f514f, Constants.STR_EMPTY);
                    } else if (split3[0].equalsIgnoreCase(f240G)) {
                        str2 = split3[1].replace(C0201h.f514f, Constants.STR_EMPTY);
                    }
                }
            }
        } else {
            str3 = null;
        }
        str2 = C0146c.m404a(str2);
        String a = C0146c.m404a(C0146c.m404a(str3));
        this.f268I = String.format("%s,%s,-,%s,-,-,-", new Object[]{str2, str3, a});
        return String.format("[(%s),(%s),(%s),(%s),(%s),(%s),(%s),(%s),(%s),(%s)]", new Object[]{this.f267H, this.f268I, this.f269J, this.f270K, this.f271L, this.f272M, this.f273N, this.f274O, this.f275P, this.f276Q});
    }

    @SuppressLint({"SimpleDateFormat"})
    private static String m408b() {
        String format = new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss").format(new Date());
        return String.format("123456789,%s", new Object[]{format});
    }

    private static String m412c(String str) {
        String str2;
        String str3 = null;
        String[] split = str.split(C0190a.f451b);
        if (split != null) {
            str2 = null;
            for (String split2 : split) {
                String[] split3 = split2.split("=");
                if (split3 != null && split3.length == 2) {
                    if (split3[0].equalsIgnoreCase(f238E)) {
                        split3[1].replace(C0201h.f514f, Constants.STR_EMPTY);
                    } else if (split3[0].equalsIgnoreCase(f239F)) {
                        str2 = split3[1].replace(C0201h.f514f, Constants.STR_EMPTY);
                    } else if (split3[0].equalsIgnoreCase(f240G)) {
                        str3 = split3[1].replace(C0201h.f514f, Constants.STR_EMPTY);
                    }
                }
            }
        } else {
            str2 = null;
        }
        str3 = C0146c.m404a(str3);
        String a = C0146c.m404a(C0146c.m404a(str2));
        return String.format("%s,%s,-,%s,-,-,-", new Object[]{str3, C0146c.m404a(str2), a});
    }

    private static String m403a(Context context) {
        String str = "-";
        String str2 = "-";
        if (context != null) {
            try {
                Context applicationContext = context.getApplicationContext();
                str = applicationContext.getPackageName();
                str2 = applicationContext.getPackageManager().getPackageInfo(str, 0).versionName;
            } catch (Throwable th) {
            }
        }
        return String.format("%s,%s,-,-,-", new Object[]{str, str2});
    }

    private static String m411c() {
        String a = C0146c.m404a(C0165a.f339e);
        String a2 = C0146c.m404a(C0165a.f340f);
        return String.format("android,3,%s,%s,com.alipay.mcpay,5.0,-,-,-", new Object[]{a, a2});
    }

    private static String m413d() {
        String a = C0146c.m404a(C0193b.m619a().f472a);
        String a2 = C0146c.m404a(C0191b.m600a().m606c());
        return String.format("%s,%s,-,-,-", new Object[]{a, a2});
    }

    private static String m409b(Context context) {
        String a = C0146c.m404a(C0194a.m635d(context));
        String a2 = C0146c.m404a(VERSION.RELEASE);
        String a3 = C0146c.m404a(Build.MODEL);
        String a4 = C0146c.m404a(C0194a.m628a(context).m636a());
        String a5 = C0146c.m404a(C0194a.m630b(context).f497p);
        String a6 = C0146c.m404a(C0194a.m628a(context).m637b());
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,-", new Object[]{a, "android", a2, a3, "-", a4, a5, "gw", a6});
    }
}
