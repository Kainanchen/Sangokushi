package com.igexin.getuiext.service;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.igexin.getuiext.data.Consts;
import com.igexin.getuiext.data.p034a.C0288a;
import com.igexin.getuiext.data.p034a.C0292e;
import com.igexin.getuiext.p033b.C0287c;
import com.igexin.getuiext.ui.promotion.C0316f;
import com.igexin.getuiext.ui.promotion.C0323m;
import com.tencent.connect.common.Constants;
import com.tencent.wxop.stat.common.StatConstants;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.igexin.getuiext.service.a */
public class C0295a {
    public static String m1014a(C0288a c0288a, int i) {
        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).format(new Date());
        if (c0288a instanceof C0292e) {
            C0292e c0292e = (C0292e) c0288a;
            return format + "|" + Consts.VERSION + "|" + Consts.CID + "|" + Consts.APPID + "|" + c0292e.j + "|" + c0292e.k + "|" + i + "|" + c0292e.b + "|" + c0292e.f781n + "|" + c0292e.f780m + "|" + c0292e.d;
        } else if (!(c0288a instanceof C0316f)) {
            return null;
        } else {
            C0316f c0316f = (C0316f) c0288a;
            return format + "|" + Consts.VERSION + "|" + Consts.CID + "|" + Consts.APPID + "|" + c0316f.j + "|" + c0316f.k + "|" + i + "|" + c0316f.b + "|" + c0316f.f862m;
        }
    }

    public static ArrayList m1015a(String str) {
        return C0287c.m994d().m997b().m991a(str);
    }

    public static void m1016a(Context context, C0288a c0288a, int i) {
        String a = C0295a.m1014a(c0288a, i);
        if (c0288a instanceof C0292e) {
            C0295a.m1018a(context, a, Constants.VIA_SSO_LOGIN);
        } else if (c0288a instanceof C0316f) {
            C0295a.m1018a(context, a, Constants.VIA_TO_TYPE_QQ_DISCUSS_GROUP);
        }
    }

    public static void m1017a(Context context, C0323m c0323m, int i, String str, String str2) {
        String str3 = Constants.STR_EMPTY;
        switch (C0296b.f802a[c0323m.ordinal()]) {
            case StatConstants.XG_PRO_VERSION /*1*/:
                str3 = Consts.PROMOTION_TYPE_IMG;
                break;
            case StatConstants.USER_ONLINE_CONFIG_TYPE /*2*/:
                str3 = Consts.PROMOTION_TYPE_TEXT;
                break;
        }
        String format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).format(new Date());
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(format).append("|").append(Consts.VERSION).append("|").append(Consts.CID).append("|").append(Consts.APPID).append("|").append(str).append("|").append(str2).append("|").append(str3).append("|").append(i);
        C0295a.m1018a(context, stringBuffer.toString(), Constants.VIA_REPORT_TYPE_JOININ_GROUP);
    }

    public static void m1018a(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            Intent intent = new Intent(context, GetuiExtService.class);
            intent.putExtra("BIData", str);
            intent.putExtra("BIType", str2);
            intent.putExtra("what", Consts.SEND_BI);
            context.startService(intent);
        }
    }

    public static void m1019a(String str, int i) {
        C0287c.m994d().m997b().m992a(str, i);
    }

    public static void m1020b(String str) {
        C0287c.m994d().m997b().m993b(str);
    }
}
