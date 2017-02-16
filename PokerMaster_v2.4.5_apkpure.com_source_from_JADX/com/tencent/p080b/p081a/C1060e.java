package com.tencent.p080b.p081a;

import android.content.Context;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.tencent.p080b.p081a.p082a.C1031b;
import com.tencent.p080b.p081a.p082a.C1034f;
import com.tencent.p080b.p081a.p082a.C1036h;
import com.tencent.p080b.p081a.p083b.C1039b;
import com.tencent.p080b.p081a.p083b.C1043f;
import com.tencent.p080b.p081a.p083b.C1049l;
import com.tencent.p080b.p081a.p083b.C1054q;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.tencent.b.a.e */
public class C1060e {
    static volatile int f8162a;
    static volatile long f8163b;
    static volatile long f8164c;
    private static C1043f f8165d;
    private static volatile Map<C1031b, Long> f8166e;
    private static volatile Map<String, Properties> f8167f;
    private static volatile Map<Integer, Integer> f8168g;
    private static volatile long f8169h;
    private static volatile long f8170i;
    private static volatile long f8171j;
    private static String f8172k;
    private static volatile int f8173l;
    private static volatile String f8174m;
    private static volatile String f8175n;
    private static Map<String, Long> f8176o;
    private static Map<String, Long> f8177p;
    private static C1039b f8178q;
    private static UncaughtExceptionHandler f8179r;
    private static volatile boolean f8180s;
    private static Context f8181t;

    static {
        f8166e = new ConcurrentHashMap();
        f8167f = new ConcurrentHashMap();
        f8168g = new ConcurrentHashMap(10);
        f8169h = 0;
        f8170i = 0;
        f8171j = 0;
        f8172k = LetterIndexBar.SEARCH_ICON_LETTER;
        f8173l = 0;
        f8174m = LetterIndexBar.SEARCH_ICON_LETTER;
        f8175n = LetterIndexBar.SEARCH_ICON_LETTER;
        f8176o = new ConcurrentHashMap();
        f8177p = new ConcurrentHashMap();
        f8178q = C1049l.m5693c();
        f8179r = null;
        f8180s = true;
        f8162a = 0;
        f8163b = 0;
        f8181t = null;
        f8164c = 0;
    }

    static int m5788a(Context context, C1061f c1061f) {
        int i = 1;
        long currentTimeMillis = System.currentTimeMillis();
        f8170i = currentTimeMillis;
        if (f8171j == 0) {
            f8171j = C1049l.m5696d();
        }
        if (currentTimeMillis >= f8171j) {
            f8171j = C1049l.m5696d();
            if (C1073r.m5835a(context).m5860b(context).f8027c != 1) {
                C1073r.m5835a(context).m5860b(context).f8027c = 1;
            }
            C1058c.m5783r();
            f8162a = 0;
            f8172k = C1049l.m5698e();
            int i2 = 1;
        } else {
            boolean z = false;
        }
        Object obj = f8172k;
        if (C1049l.m5688a(c1061f)) {
            obj = c1061f.f8182a + f8172k;
        }
        if (f8177p.containsKey(obj)) {
            i = i2;
        }
        if (i != 0) {
            if (C1049l.m5688a(c1061f)) {
                C1060e.m5799b(context, c1061f);
            } else if (C1058c.m5784s() < C1058c.m5781p()) {
                C1049l.m5719t(context);
                C1060e.m5799b(context, null);
            } else {
                f8178q.m5668e("Exceed StatConfig.getMaxDaySessionNumbers().");
            }
            f8177p.put(obj, Long.valueOf(1));
        }
        if (f8180s) {
            if (C1058c.m5765c()) {
                Context e = C1060e.m5804e(context);
                if (e == null) {
                    f8178q.m5667d("The Context of StatService.testSpeed() can not be null!");
                } else if (C1060e.m5809g(e) != null) {
                    f8165d.m5674a(new C1064i(e));
                }
            }
            f8180s = false;
        }
        return f8173l;
    }

    public static Properties m5791a(String str) {
        return (Properties) f8167f.get(str);
    }

    static void m5792a(Context context) {
        if (C1058c.m5765c()) {
            Context e = C1060e.m5804e(context);
            if (e == null) {
                f8178q.m5667d("The Context of StatService.sendNetworkDetector() can not be null!");
                return;
            }
            try {
                ai.m5656b(e).m5657a(new C1034f(e), new an());
            } catch (Throwable th) {
                f8178q.m5665b(th);
            }
        }
    }

    public static void m5793a(Context context, String str) {
        if (C1058c.m5765c()) {
            Context e = C1060e.m5804e(context);
            if (e == null) {
                f8178q.m5667d("The Context of StatService.trackCustomEvent() can not be null!");
                return;
            }
            if ((str.length() == 0 ? 1 : null) != null) {
                f8178q.m5667d("The event_id of StatService.trackCustomEvent() can not be null or empty.");
                return;
            }
            C1031b c1031b = new C1031b(str);
            if (C1060e.m5809g(e) != null) {
                f8165d.m5674a(new ao(e, c1031b));
            }
        }
    }

    static void m5794a(Context context, Throwable th) {
        if (C1058c.m5765c()) {
            Context e = C1060e.m5804e(context);
            if (e == null) {
                f8178q.m5667d("The Context of StatService.reportSdkSelfException() can not be null!");
            } else if (C1060e.m5809g(e) != null) {
                f8165d.m5674a(new am(e, th));
            }
        }
    }

    static boolean m5795a() {
        if (f8162a < 2) {
            return false;
        }
        f8163b = System.currentTimeMillis();
        return true;
    }

    public static boolean m5796a(Context context, String str, String str2) {
        try {
            if (C1058c.m5765c()) {
                String str3 = "2.0.3";
                if (C1058c.m5762b()) {
                    f8178q.m5670g("MTA SDK version, current: " + str3 + " ,required: " + str2);
                }
                if (context == null) {
                    f8178q.m5667d("Context or mtaSdkVersion in StatService.startStatService() is null, please check it!");
                    C1058c.m5757a(false);
                    return false;
                } else if (C1049l.m5691b(str3) < C1049l.m5691b(str2)) {
                    f8178q.m5667d(("MTA SDK version conflicted, current: " + str3 + ",required: " + str2) + ". please delete the current SDK and download the latest one. official website: http://mta.qq.com/ or http://mta.oa.com/");
                    C1058c.m5757a(false);
                    return false;
                } else {
                    str3 = C1058c.m5759b(context);
                    if (str3 == null || str3.length() == 0) {
                        C1058c.m5761b("-");
                    }
                    if (str != null) {
                        C1058c.m5753a(context, str);
                    }
                    if (C1060e.m5809g(context) != null) {
                        f8165d.m5674a(new C1066k(context));
                    }
                    return true;
                }
            }
            f8178q.m5667d("MTA StatService is disable.");
            return false;
        } catch (Throwable th) {
            f8178q.m5665b(th);
            return false;
        }
    }

    static void m5797b() {
        f8162a = 0;
        f8163b = 0;
    }

    public static void m5798b(Context context) {
        if (C1058c.m5765c()) {
            if (C1058c.m5762b()) {
                f8178q.m5662a((Object) "commitEvents, maxNumber=-1");
            }
            Context e = C1060e.m5804e(context);
            if (e == null) {
                f8178q.m5667d("The Context of StatService.commitEvents() can not be null!");
            } else if (C1062g.m5813a(f8181t).m5818b() && C1060e.m5809g(e) != null) {
                f8165d.m5674a(new C1063h(e));
            }
        }
    }

    private static void m5799b(Context context, C1061f c1061f) {
        if (C1060e.m5809g(context) != null) {
            if (C1058c.m5762b()) {
                f8178q.m5670g("start new session.");
            }
            if (c1061f == null || f8173l == 0) {
                f8173l = C1049l.m5680a();
            }
            C1058c.m5780o();
            C1058c.m5782q();
            new C1069n(new C1036h(context, f8173l, C1060e.m5811i(), c1061f)).m5827a();
        }
    }

    static void m5800c() {
        f8162a++;
        f8163b = System.currentTimeMillis();
        C1060e.m5801c(f8181t);
    }

    public static void m5801c(Context context) {
        if (C1058c.m5765c() && C1058c.f8140n > 0) {
            Context e = C1060e.m5804e(context);
            if (e == null) {
                f8178q.m5667d("The Context of StatService.testSpeed() can not be null!");
                return;
            }
            C1073r a = C1073r.m5835a(e);
            if (C1058c.m5765c()) {
                try {
                    a.f8217a.m5674a(new C1076u(a));
                } catch (Throwable th) {
                    C1073r.f8214d.m5665b(th);
                }
            }
        }
    }

    static void m5803d(Context context) {
        f8164c = System.currentTimeMillis() + ((long) (60000 * C1058c.m5776k()));
        C1054q.m5732a(context, "last_period_ts", f8164c);
        C1060e.m5798b(context);
    }

    private static Context m5804e(Context context) {
        return context != null ? context : f8181t;
    }

    private static synchronized void m5807f(Context context) {
        boolean z = false;
        synchronized (C1060e.class) {
            if (context != null) {
                if (f8165d == null) {
                    long a = C1054q.m5729a(context, C1058c.f8129c);
                    long b = C1049l.m5691b("2.0.3");
                    boolean z2 = true;
                    if (b <= a) {
                        f8178q.m5667d("MTA is disable for current version:" + b + ",wakeup version:" + a);
                        z2 = false;
                    }
                    a = C1054q.m5729a(context, C1058c.f8130d);
                    if (a > System.currentTimeMillis()) {
                        f8178q.m5667d("MTA is disable for current time:" + System.currentTimeMillis() + ",wakeup time:" + a);
                    } else {
                        z = z2;
                    }
                    C1058c.m5757a(z);
                    if (z) {
                        Context applicationContext = context.getApplicationContext();
                        f8181t = applicationContext;
                        f8165d = new C1043f();
                        f8172k = C1049l.m5698e();
                        f8169h = System.currentTimeMillis() + C1058c.f8135i;
                        f8165d.m5674a(new al(applicationContext));
                    }
                }
            }
        }
    }

    private static C1043f m5809g(Context context) {
        if (f8165d == null) {
            synchronized (C1060e.class) {
                if (f8165d == null) {
                    try {
                        C1060e.m5807f(context);
                    } catch (Throwable th) {
                        f8178q.m5663a(th);
                        C1058c.m5757a(false);
                    }
                }
            }
        }
        return f8165d;
    }

    private static JSONObject m5811i() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (C1058c.f8128b.f8002d != 0) {
                jSONObject2.put("v", C1058c.f8128b.f8002d);
            }
            jSONObject.put(Integer.toString(C1058c.f8128b.f7999a), jSONObject2);
            jSONObject2 = new JSONObject();
            if (C1058c.f8127a.f8002d != 0) {
                jSONObject2.put("v", C1058c.f8127a.f8002d);
            }
            jSONObject.put(Integer.toString(C1058c.f8127a.f7999a), jSONObject2);
        } catch (Throwable e) {
            f8178q.m5665b(e);
        }
        return jSONObject;
    }
}
