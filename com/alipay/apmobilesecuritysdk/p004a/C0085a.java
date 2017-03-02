package com.alipay.apmobilesecuritysdk.p004a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.alipay.apmobilesecuritysdk.p005b.C0086a;
import com.alipay.apmobilesecuritysdk.p006c.C0087a;
import com.alipay.apmobilesecuritysdk.p007d.C0092e;
import com.alipay.apmobilesecuritysdk.p008e.C0093a;
import com.alipay.apmobilesecuritysdk.p009f.C0094a;
import com.alipay.apmobilesecuritysdk.p009f.C0095b;
import com.alipay.apmobilesecuritysdk.p009f.C0096c;
import com.alipay.apmobilesecuritysdk.p009f.C0097d;
import com.alipay.apmobilesecuritysdk.p009f.C0100g;
import com.alipay.apmobilesecuritysdk.p009f.C0101h;
import com.alipay.apmobilesecuritysdk.p009f.C0102i;
import com.alipay.p011b.p012a.p013a.p014a.C0110a;
import com.alipay.p011b.p012a.p013a.p017c.C0124d;
import com.alipay.p011b.p012a.p013a.p017c.p018a.C0116a;
import com.alipay.p011b.p012a.p013a.p017c.p018a.C0117b;
import com.alipay.p011b.p012a.p013a.p017c.p018a.C0118c;
import com.alipay.p011b.p012a.p013a.p017c.p019b.C0120a;
import com.alipay.p011b.p012a.p013a.p021e.C0129b;
import com.alipay.sdk.cons.C0166b;
import com.tencent.connect.common.Constants;
import com.tencent.open.SocialConstants;
import com.tencent.wxop.stat.common.StatConstants;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

/* renamed from: com.alipay.apmobilesecuritysdk.a.a */
public final class C0085a {
    private Context f101a;
    private C0086a f102b;
    private int f103c;

    public C0085a(Context context) {
        this.f102b = C0086a.m134a();
        this.f103c = 4;
        this.f101a = context;
    }

    public static String m128a(Context context) {
        String b = C0085a.m132b(context);
        return C0110a.m234a(b) ? C0101h.m196c(context) : b;
    }

    public static String m129a(Context context, String str) {
        try {
            String a = C0102i.m197a(str);
            if (!C0110a.m234a(a)) {
                return a;
            }
            a = C0100g.m185a(context, str);
            C0102i.m201a(str, a);
            if (!C0110a.m234a(a)) {
                return a;
            }
            return Constants.STR_EMPTY;
        } catch (Throwable th) {
        }
    }

    private static boolean m130a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String[] strArr = new String[]{"2016-11-10 2016-11-11", "2016-12-11 2016-12-12"};
        int random = ((int) (((Math.random() * 24.0d) * 60.0d) * 60.0d)) * 1;
        int i = 0;
        while (i < 2) {
            try {
                String[] split = strArr[i].split(" ");
                if (split != null && split.length == 2) {
                    Date date = new Date();
                    Date parse = simpleDateFormat.parse(split[0] + " 00:00:00");
                    Date parse2 = simpleDateFormat.parse(split[1] + " 23:59:59");
                    Calendar instance = Calendar.getInstance();
                    instance.setTime(parse2);
                    instance.add(13, random);
                    parse2 = instance.getTime();
                    if (date.after(parse) && date.before(parse2)) {
                        return true;
                    }
                }
                i++;
            } catch (Exception e) {
            }
        }
        return false;
    }

    private C0117b m131b(Map<String, String> map) {
        try {
            C0095b c;
            Context context = this.f101a;
            C0118c c0118c = new C0118c();
            String str = Constants.STR_EMPTY;
            String str2 = Constants.STR_EMPTY;
            String str3 = Constants.STR_EMPTY;
            String a = C0093a.m150a();
            String a2 = C0110a.m233a(map, "rpcVersion", Constants.STR_EMPTY);
            String a3 = C0085a.m129a(context, C0110a.m233a(map, SocialConstants.PARAM_APPNAME, Constants.STR_EMPTY));
            C0096c c2 = C0097d.m173c(context);
            C0096c b = C0097d.m171b();
            if (c2 != null) {
                str = c2.m162a();
                str3 = c2.m164c();
            }
            if (C0110a.m234a(str)) {
                c = C0094a.m158c(context);
                if (c != null) {
                    str = c.m159a();
                    str3 = c.m161c();
                }
            }
            if (b != null) {
                str2 = b.m162a();
            }
            if (C0110a.m234a(str2)) {
                c = C0094a.m156b();
                if (c != null) {
                    str2 = c.m159a();
                }
            }
            c0118c.m310a("android");
            c0118c.m315c(str);
            c0118c.m313b(str2);
            c0118c.m317d(a3);
            c0118c.m319e(a);
            c0118c.m323g(str3);
            c0118c.m321f(a2);
            c0118c.m311a(C0092e.m146a(context, map));
            return C0124d.m339a(this.f101a, this.f102b.m137c()).m328a(c0118c);
        } catch (Throwable th) {
            C0087a.m140a(th);
            return null;
        }
    }

    private static String m132b(Context context) {
        try {
            String b = C0102i.m203b();
            if (!C0110a.m234a(b)) {
                return b;
            }
            C0096c b2 = C0097d.m172b(context);
            if (b2 != null) {
                C0102i.m200a(b2);
                b = b2.m162a();
                if (C0110a.m237b(b)) {
                    return b;
                }
            }
            C0095b b3 = C0094a.m157b(context);
            if (b3 != null) {
                C0102i.m199a(b3);
                b = b3.m159a();
                if (C0110a.m237b(b)) {
                    return b;
                }
            }
            return Constants.STR_EMPTY;
        } catch (Throwable th) {
        }
    }

    public final int m133a(Map<String, String> map) {
        Object obj = 2;
        Object obj2 = 1;
        try {
            Object obj3;
            int i;
            C0087a.m138a(this.f101a, C0110a.m233a(map, C0166b.f352c, Constants.STR_EMPTY), C0110a.m233a(map, C0166b.f356g, Constants.STR_EMPTY), C0085a.m128a(this.f101a));
            String a = C0110a.m233a(map, SocialConstants.PARAM_APPNAME, Constants.STR_EMPTY);
            C0085a.m132b(this.f101a);
            C0085a.m129a(this.f101a, a);
            C0102i.m198a();
            int i2;
            if (!C0085a.m130a()) {
                C0092e.m147a();
                if ((!C0110a.m235a(C0092e.m148b(this.f101a, map), C0102i.m205c()) ? 1 : null) != null) {
                    i2 = 1;
                } else {
                    String a2 = C0110a.m233a(map, C0166b.f352c, Constants.STR_EMPTY);
                    String a3 = C0110a.m233a(map, C0166b.f356g, Constants.STR_EMPTY);
                    if (C0110a.m237b(a2) && !C0110a.m235a(a2, C0102i.m207d())) {
                        i2 = 1;
                    } else if (C0110a.m237b(a3) && !C0110a.m235a(a3, C0102i.m209e())) {
                        i2 = 1;
                    } else if (!C0102i.m202a(this.f101a, a)) {
                        i2 = 1;
                    } else if (C0110a.m234a(C0085a.m129a(this.f101a, a))) {
                        i2 = 1;
                    } else if (C0110a.m234a(C0085a.m132b(this.f101a))) {
                        i2 = 1;
                    } else {
                        obj3 = null;
                    }
                }
            } else if (C0110a.m234a(C0085a.m129a(this.f101a, a))) {
                obj3 = 1;
            } else if (C0110a.m234a(C0085a.m132b(this.f101a))) {
                i2 = 1;
            } else {
                obj3 = null;
            }
            if (obj3 == null) {
                i = 0;
            } else {
                Context context = this.f101a;
                C0086a.m134a().m136b();
                C0093a.m151b();
                C0116a b = m131b((Map) map);
                if (b != null) {
                    if (b.a) {
                        if (!C0110a.m234a(b.f150c)) {
                            obj = 1;
                        }
                    } else if ("APPKEY_ERROR".equals(b.b)) {
                        obj = 3;
                    }
                }
                switch (obj) {
                    case StatConstants.XG_PRO_VERSION /*1*/:
                        C0101h.m192a(this.f101a, Constants.VIA_TO_TYPE_QQ_GROUP.equals(b.f155h));
                        C0101h.m193b(this.f101a, b.f157j == null ? Constants.VIA_RESULT_SUCCESS : b.f157j);
                        C0102i.m206c(C0092e.m148b(this.f101a, map));
                        C0102i.m201a(a, b.f151d);
                        C0102i.m204b(b.f150c);
                        C0102i.m208d(b.f152e);
                        String a4 = C0110a.m233a(map, C0166b.f352c, Constants.STR_EMPTY);
                        if (!C0110a.m237b(a4) || C0110a.m235a(a4, C0102i.m207d())) {
                            a4 = C0102i.m207d();
                        } else {
                            C0102i.m210e(a4);
                        }
                        C0102i.m210e(a4);
                        a4 = C0110a.m233a(map, C0166b.f356g, Constants.STR_EMPTY);
                        if (!C0110a.m237b(a4) || C0110a.m235a(a4, C0102i.m209e())) {
                            a4 = C0102i.m209e();
                        } else {
                            C0102i.m212f(a4);
                        }
                        C0102i.m212f(a4);
                        C0102i.m198a();
                        C0097d.m170a(this.f101a, C0102i.m213g());
                        Context context2 = this.f101a;
                        C0097d.m168a();
                        C0094a.m155a(this.f101a, new C0095b(C0102i.m203b(), C0102i.m205c(), C0102i.m211f()));
                        context2 = this.f101a;
                        C0094a.m153a();
                        C0100g.m188a(this.f101a, a, C0102i.m197a(a));
                        context2 = this.f101a;
                        C0100g.m186a();
                        C0101h.m191a(this.f101a, a, System.currentTimeMillis());
                        break;
                    case StatConstants.STAT_DB_VERSION /*3*/:
                        i = 1;
                        break;
                    default:
                        if (b != null) {
                            C0087a.m139a("Server error, result:" + b.f149b);
                        } else {
                            C0087a.m139a("Server error, returned null");
                        }
                        if (C0110a.m234a(C0085a.m129a(this.f101a, a))) {
                            i = 4;
                            break;
                        }
                        break;
                }
                i = 0;
            }
            this.f103c = i;
            C0120a a5 = C0124d.m339a(this.f101a, this.f102b.m137c());
            Context context3 = this.f101a;
            ConnectivityManager connectivityManager = (ConnectivityManager) context3.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (!(activeNetworkInfo != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getType() == 1)) {
                obj2 = null;
            }
            if (obj2 != null && C0101h.m194b(context3)) {
                new C0129b(context3.getFilesDir().getAbsolutePath() + "/log/ap", a5).m348a();
            }
        } catch (Throwable e) {
            C0087a.m140a(e);
        }
        return this.f103c;
    }
}
