package com.tencent.wxop.stat;

import android.content.Context;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.tencent.connect.common.Constants;
import com.tencent.wxop.stat.common.C0630b;
import com.tencent.wxop.stat.common.C0633e;
import com.tencent.wxop.stat.common.C0639k;
import com.tencent.wxop.stat.common.C0644p;
import com.tencent.wxop.stat.common.StatConstants;
import com.tencent.wxop.stat.common.StatLogger;
import com.tencent.wxop.stat.p069a.C0614a;
import com.tencent.wxop.stat.p069a.C0616c;
import com.tencent.wxop.stat.p069a.C0621i;
import com.tencent.wxop.stat.p069a.C0624l;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public class StatServiceImpl {
    static volatile int f1823a;
    static volatile long f1824b;
    static volatile long f1825c;
    private static C0633e f1826d;
    private static volatile Map<C0616c, Long> f1827e;
    private static volatile Map<String, Properties> f1828f;
    private static volatile Map<Integer, Integer> f1829g;
    private static volatile long f1830h;
    private static volatile long f1831i;
    private static volatile long f1832j;
    private static String f1833k;
    private static volatile int f1834l;
    private static volatile String f1835m;
    private static volatile String f1836n;
    private static Map<String, Long> f1837o;
    private static Map<String, Long> f1838p;
    private static StatLogger f1839q;
    private static UncaughtExceptionHandler f1840r;
    private static volatile boolean f1841s;
    private static Context f1842t;

    static {
        f1827e = new ConcurrentHashMap();
        f1828f = new ConcurrentHashMap();
        f1829g = new ConcurrentHashMap(10);
        f1830h = 0;
        f1831i = 0;
        f1832j = 0;
        f1833k = Constants.STR_EMPTY;
        f1834l = 0;
        f1835m = Constants.STR_EMPTY;
        f1836n = Constants.STR_EMPTY;
        f1837o = new ConcurrentHashMap();
        f1838p = new ConcurrentHashMap();
        f1839q = C0639k.m2401b();
        f1840r = null;
        f1841s = true;
        f1823a = 0;
        f1824b = 0;
        f1842t = null;
        f1825c = 0;
    }

    static int m2223a(Context context, boolean z, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        int i = 1;
        long currentTimeMillis = System.currentTimeMillis();
        if (!z || currentTimeMillis - f1831i < ((long) StatConfig.getSessionTimoutMillis())) {
            boolean z2 = false;
        } else {
            int i2 = 1;
        }
        f1831i = currentTimeMillis;
        if (f1832j == 0) {
            f1832j = C0639k.m2403c();
        }
        if (currentTimeMillis >= f1832j) {
            f1832j = C0639k.m2403c();
            if (au.m2317a(context).m2350b(context).m2368d() != 1) {
                au.m2317a(context).m2350b(context).m2365a(1);
            }
            StatConfig.m2218b(0);
            f1823a = 0;
            f1833k = C0639k.m2392a(0);
            i2 = 1;
        }
        Object obj = f1833k;
        if (C0639k.m2398a(statSpecifyReportedInfo)) {
            obj = statSpecifyReportedInfo.getAppKey() + f1833k;
        }
        if (f1838p.containsKey(obj)) {
            i = i2;
        }
        if (i != 0) {
            if (C0639k.m2398a(statSpecifyReportedInfo)) {
                m2228a(context, statSpecifyReportedInfo);
            } else if (StatConfig.m2221c() < StatConfig.getMaxDaySessionNumbers()) {
                C0639k.m2431x(context);
                m2228a(context, null);
            } else {
                f1839q.m2359e((Object) "Exceed StatConfig.getMaxDaySessionNumbers().");
            }
            f1838p.put(obj, Long.valueOf(1));
        }
        if (f1841s) {
            testSpeed(context);
            f1841s = false;
        }
        return f1834l;
    }

    static synchronized void m2226a(Context context) {
        synchronized (StatServiceImpl.class) {
            if (context != null) {
                if (f1826d == null && m2235b(context)) {
                    Context applicationContext = context.getApplicationContext();
                    f1842t = applicationContext;
                    f1826d = new C0633e();
                    f1833k = C0639k.m2392a(0);
                    f1830h = System.currentTimeMillis() + StatConfig.f1800i;
                    f1826d.m2373a(new C0654l(applicationContext));
                }
            }
        }
    }

    static void m2228a(Context context, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        if (m2236c(context) != null) {
            if (StatConfig.isDebugEnable()) {
                f1839q.m2358d("start new session.");
            }
            if (statSpecifyReportedInfo == null || f1834l == 0) {
                f1834l = C0639k.m2389a();
            }
            StatConfig.m2207a(0);
            StatConfig.m2217b();
            new aq(new C0624l(context, f1834l, m2233b(), statSpecifyReportedInfo)).m2308a();
        }
    }

    static void m2229a(Context context, Throwable th) {
        if (StatConfig.isEnableStatService()) {
            Context context2 = getContext(context);
            if (context2 == null) {
                f1839q.error((Object) "The Context of StatService.reportSdkSelfException() can not be null!");
            } else if (m2236c(context2) != null) {
                f1826d.m2373a(new C0659q(context2, th));
            }
        }
    }

    static boolean m2230a() {
        if (f1823a < 2) {
            return false;
        }
        f1824b = System.currentTimeMillis();
        return true;
    }

    static boolean m2231a(String str) {
        return str == null || str.length() == 0;
    }

    static JSONObject m2233b() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (StatConfig.f1793b.f2078d != 0) {
                jSONObject2.put("v", StatConfig.f1793b.f2078d);
            }
            jSONObject.put(Integer.toString(StatConfig.f1793b.f2075a), jSONObject2);
            jSONObject2 = new JSONObject();
            if (StatConfig.f1792a.f2078d != 0) {
                jSONObject2.put("v", StatConfig.f1792a.f2078d);
            }
            jSONObject.put(Integer.toString(StatConfig.f1792a.f2075a), jSONObject2);
        } catch (Throwable e) {
            f1839q.m2360e(e);
        }
        return jSONObject;
    }

    private static void m2234b(Context context, StatAccount statAccount, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        try {
            new aq(new C0614a(context, m2223a(context, false, statSpecifyReportedInfo), statAccount, statSpecifyReportedInfo)).m2308a();
        } catch (Throwable th) {
            f1839q.m2360e(th);
            m2229a(context, th);
        }
    }

    static boolean m2235b(Context context) {
        boolean z = false;
        long a = C0644p.m2440a(context, StatConfig.f1794c, 0);
        long b = C0639k.m2400b(StatConstants.VERSION);
        boolean z2 = true;
        if (b <= a) {
            f1839q.error("MTA is disable for current version:" + b + ",wakeup version:" + a);
            z2 = false;
        }
        a = C0644p.m2440a(context, StatConfig.f1795d, 0);
        if (a > System.currentTimeMillis()) {
            f1839q.error("MTA is disable for current time:" + System.currentTimeMillis() + ",wakeup time:" + a);
        } else {
            z = z2;
        }
        StatConfig.setEnableStatService(z);
        return z;
    }

    static C0633e m2236c(Context context) {
        if (f1826d == null) {
            synchronized (StatServiceImpl.class) {
                if (f1826d == null) {
                    try {
                        m2226a(context);
                    } catch (Throwable th) {
                        f1839q.error(th);
                        StatConfig.setEnableStatService(false);
                    }
                }
            }
        }
        return f1826d;
    }

    static void m2238c() {
        f1823a = 0;
        f1824b = 0;
    }

    public static void commitEvents(Context context, int i) {
        if (StatConfig.isEnableStatService()) {
            if (StatConfig.isDebugEnable()) {
                f1839q.m2361i("commitEvents, maxNumber=" + i);
            }
            Context context2 = getContext(context);
            if (context2 == null) {
                f1839q.error((Object) "The Context of StatService.commitEvents() can not be null!");
            } else if (i < -1 || i == 0) {
                f1839q.error((Object) "The maxNumber of StatService.commitEvents() should be -1 or bigger than 0.");
            } else if (C0625a.m2283a(f1842t).m2296f() && m2236c(context2) != null) {
                f1826d.m2373a(new ad(context2, i));
            }
        }
    }

    static void m2239d() {
        f1823a++;
        f1824b = System.currentTimeMillis();
        flushDataToDB(f1842t);
    }

    static void m2240d(Context context) {
        if (StatConfig.isEnableStatService()) {
            Context context2 = getContext(context);
            if (context2 == null) {
                f1839q.error((Object) "The Context of StatService.sendNetworkDetector() can not be null!");
                return;
            }
            try {
                C0651i.m2471b(context2).m2472a(new C0621i(context2), new C0662t());
            } catch (Throwable th) {
                f1839q.m2360e(th);
            }
        }
    }

    static void m2242e(Context context) {
        f1825c = System.currentTimeMillis() + ((long) (60000 * StatConfig.getSendPeriodMinutes()));
        C0644p.m2444b(context, "last_period_ts", f1825c);
        commitEvents(context, -1);
    }

    public static void flushDataToDB(Context context) {
        if (StatConfig.isEnableStatService() && StatConfig.f1804m > 0) {
            Context context2 = getContext(context);
            if (context2 == null) {
                f1839q.error((Object) "The Context of StatService.testSpeed() can not be null!");
            } else {
                au.m2317a(context2).m2351c();
            }
        }
    }

    public static Properties getCommonKeyValueForKVEvent(String str) {
        return (Properties) f1828f.get(str);
    }

    public static Context getContext(Context context) {
        return context != null ? context : f1842t;
    }

    public static void onLowMemory(Context context) {
        if (StatConfig.isEnableStatService() && m2236c(getContext(context)) != null) {
            f1826d.m2373a(new C0657o(context));
        }
    }

    public static void onPause(Context context, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        if (StatConfig.isEnableStatService() && m2236c(context) != null) {
            f1826d.m2373a(new C0655m(context, statSpecifyReportedInfo));
        }
    }

    public static void onResume(Context context, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        if (StatConfig.isEnableStatService() && m2236c(context) != null) {
            f1826d.m2373a(new aj(context, statSpecifyReportedInfo));
        }
    }

    public static void onStop(Context context, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        if (StatConfig.isEnableStatService()) {
            Context context2 = getContext(context);
            if (m2236c(context2) != null) {
                f1826d.m2373a(new C0656n(context2));
            }
        }
    }

    public static void reportAccount(Context context, StatAccount statAccount, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        if (StatConfig.isEnableStatService()) {
            Context context2 = getContext(context);
            if (context2 == null) {
                f1839q.m2359e((Object) "context is null in reportAccount.");
            } else if (m2236c(context2) != null) {
                f1826d.m2373a(new al(statAccount, context2, statSpecifyReportedInfo));
            }
        }
    }

    public static void reportAppMonitorStat(Context context, StatAppMonitor statAppMonitor, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        if (StatConfig.isEnableStatService()) {
            Context context2 = getContext(context);
            if (context2 == null) {
                f1839q.error((Object) "The Context of StatService.reportAppMonitorStat() can not be null!");
            } else if (statAppMonitor == null) {
                f1839q.error((Object) "The StatAppMonitor of StatService.reportAppMonitorStat() can not be null!");
            } else if (statAppMonitor.getInterfaceName() == null) {
                f1839q.error((Object) "The interfaceName of StatAppMonitor on StatService.reportAppMonitorStat() can not be null!");
            } else {
                StatAppMonitor clone = statAppMonitor.clone();
                if (m2236c(context2) != null) {
                    f1826d.m2373a(new aa(context2, statSpecifyReportedInfo, clone));
                }
            }
        }
    }

    public static void reportError(Context context, String str, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        if (StatConfig.isEnableStatService()) {
            Context context2 = getContext(context);
            if (context2 == null) {
                f1839q.error((Object) "The Context of StatService.reportError() can not be null!");
            } else if (m2236c(context2) != null) {
                f1826d.m2373a(new C0658p(str, context2, statSpecifyReportedInfo));
            }
        }
    }

    public static void reportException(Context context, Throwable th, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        if (StatConfig.isEnableStatService()) {
            Context context2 = getContext(context);
            if (context2 == null) {
                f1839q.error((Object) "The Context of StatService.reportException() can not be null!");
            } else if (m2236c(context2) != null) {
                f1826d.m2373a(new C0660r(th, context2, statSpecifyReportedInfo));
            }
        }
    }

    public static void reportGameUser(Context context, StatGameUser statGameUser, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        if (StatConfig.isEnableStatService()) {
            Context context2 = getContext(context);
            if (context2 == null) {
                f1839q.error((Object) "The Context of StatService.reportGameUser() can not be null!");
            } else if (m2236c(context2) != null) {
                f1826d.m2373a(new am(statGameUser, context2, statSpecifyReportedInfo));
            }
        }
    }

    public static void reportQQ(Context context, String str, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        if (StatConfig.isEnableStatService()) {
            Context context2 = getContext(context);
            if (context2 == null) {
                f1839q.error((Object) "context is null in reportQQ()");
            } else if (m2236c(context2) != null) {
                f1826d.m2373a(new ak(str, context2, statSpecifyReportedInfo));
            }
        }
    }

    public static void setCommonKeyValueForKVEvent(String str, Properties properties) {
        if (!C0639k.m2405c(str)) {
            f1839q.m2359e((Object) "event_id or commonProp for setCommonKeyValueForKVEvent is invalid.");
        } else if (properties == null || properties.size() <= 0) {
            f1828f.remove(str);
        } else {
            f1828f.put(str, (Properties) properties.clone());
        }
    }

    public static void setContext(Context context) {
        if (context != null) {
            f1842t = context.getApplicationContext();
        }
    }

    public static void setEnvAttributes(Context context, Map<String, String> map) {
        if (map == null || map.size() > AccessibilityNodeInfoCompat.ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY) {
            f1839q.error((Object) "The map in setEnvAttributes can't be null or its size can't exceed 512.");
            return;
        }
        try {
            C0630b.m2370a(context, (Map) map);
        } catch (Throwable e) {
            f1839q.m2360e(e);
        }
    }

    public static void startNewSession(Context context, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        if (StatConfig.isEnableStatService()) {
            Context context2 = getContext(context);
            if (context2 == null) {
                f1839q.error((Object) "The Context of StatService.startNewSession() can not be null!");
            } else if (m2236c(context2) != null) {
                f1826d.m2373a(new ai(context2, statSpecifyReportedInfo));
            }
        }
    }

    public static boolean startStatService(Context context, String str, String str2, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        try {
            if (StatConfig.isEnableStatService()) {
                String str3 = StatConstants.VERSION;
                if (StatConfig.isDebugEnable()) {
                    f1839q.m2358d("MTA SDK version, current: " + str3 + " ,required: " + str2);
                }
                if (context == null || str2 == null) {
                    f1839q.error((Object) "Context or mtaSdkVersion in StatService.startStatService() is null, please check it!");
                    StatConfig.setEnableStatService(false);
                    return false;
                } else if (C0639k.m2400b(str3) < C0639k.m2400b(str2)) {
                    f1839q.error(("MTA SDK version conflicted, current: " + str3 + ",required: " + str2) + ". please delete the current SDK and download the latest one. official website: http://mta.qq.com/ or http://mta.oa.com/");
                    StatConfig.setEnableStatService(false);
                    return false;
                } else {
                    str3 = StatConfig.getInstallChannel(context);
                    if (str3 == null || str3.length() == 0) {
                        StatConfig.setInstallChannel("-");
                    }
                    if (str != null) {
                        StatConfig.setAppKey(context, str);
                    }
                    if (m2236c(context) != null) {
                        f1826d.m2373a(new an(context, statSpecifyReportedInfo));
                    }
                    return true;
                }
            }
            f1839q.error((Object) "MTA StatService is disable.");
            return false;
        } catch (Throwable th) {
            f1839q.m2360e(th);
            return false;
        }
    }

    public static void stopSession() {
        f1831i = 0;
    }

    public static void testSpeed(Context context) {
        if (StatConfig.isEnableStatService()) {
            Context context2 = getContext(context);
            if (context2 == null) {
                f1839q.error((Object) "The Context of StatService.testSpeed() can not be null!");
            } else if (m2236c(context2) != null) {
                f1826d.m2373a(new ae(context2));
            }
        }
    }

    public static void testSpeed(Context context, Map<String, Integer> map, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        if (StatConfig.isEnableStatService()) {
            Context context2 = getContext(context);
            if (context2 == null) {
                f1839q.error((Object) "The Context of StatService.testSpeed() can not be null!");
            } else if (map == null || map.size() == 0) {
                f1839q.error((Object) "The domainMap of StatService.testSpeed() can not be null or empty!");
            } else {
                Map hashMap = new HashMap(map);
                if (m2236c(context2) != null) {
                    f1826d.m2373a(new af(context2, hashMap, statSpecifyReportedInfo));
                }
            }
        }
    }

    public static void trackBeginPage(Context context, String str, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        if (StatConfig.isEnableStatService()) {
            Context context2 = getContext(context);
            if (context2 == null || str == null || str.length() == 0) {
                f1839q.error((Object) "The Context or pageName of StatService.trackBeginPage() can not be null or empty!");
                return;
            }
            String str2 = new String(str);
            if (m2236c(context2) != null) {
                f1826d.m2373a(new C0665w(str2, context2, statSpecifyReportedInfo));
            }
        }
    }

    public static void trackCustomBeginEvent(Context context, String str, StatSpecifyReportedInfo statSpecifyReportedInfo, String... strArr) {
        if (StatConfig.isEnableStatService()) {
            Context context2 = getContext(context);
            if (context2 == null) {
                f1839q.error((Object) "The Context of StatService.trackCustomBeginEvent() can not be null!");
                return;
            }
            C0616c c0616c = new C0616c(str, strArr, null);
            if (m2236c(context2) != null) {
                f1826d.m2373a(new C0664v(str, c0616c, context2));
            }
        }
    }

    public static void trackCustomBeginKVEvent(Context context, String str, Properties properties, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        if (StatConfig.isEnableStatService()) {
            Context context2 = getContext(context);
            if (context2 == null) {
                f1839q.error((Object) "The Context of StatService.trackCustomBeginEvent() can not be null!");
                return;
            }
            C0616c c0616c = new C0616c(str, null, properties);
            if (m2236c(context2) != null) {
                f1826d.m2373a(new C0667y(str, c0616c, context2));
            }
        }
    }

    public static void trackCustomEndEvent(Context context, String str, StatSpecifyReportedInfo statSpecifyReportedInfo, String... strArr) {
        if (StatConfig.isEnableStatService()) {
            Context context2 = getContext(context);
            if (context2 == null) {
                f1839q.error((Object) "The Context of StatService.trackCustomEndEvent() can not be null!");
                return;
            }
            C0616c c0616c = new C0616c(str, strArr, null);
            if (m2236c(context2) != null) {
                f1826d.m2373a(new C0666x(str, c0616c, context2, statSpecifyReportedInfo));
            }
        }
    }

    public static void trackCustomEndKVEvent(Context context, String str, Properties properties, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        if (StatConfig.isEnableStatService()) {
            Context context2 = getContext(context);
            if (context2 == null) {
                f1839q.error((Object) "The Context of StatService.trackCustomEndEvent() can not be null!");
                return;
            }
            C0616c c0616c = new C0616c(str, null, properties);
            if (m2236c(context2) != null) {
                f1826d.m2373a(new C0668z(str, c0616c, context2, statSpecifyReportedInfo));
            }
        }
    }

    public static void trackCustomEvent(Context context, String str, StatSpecifyReportedInfo statSpecifyReportedInfo, String... strArr) {
        if (StatConfig.isEnableStatService()) {
            Context context2 = getContext(context);
            if (context2 == null) {
                f1839q.error((Object) "The Context of StatService.trackCustomEvent() can not be null!");
            } else if (m2231a(str)) {
                f1839q.error((Object) "The event_id of StatService.trackCustomEvent() can not be null or empty.");
            } else {
                C0616c c0616c = new C0616c(str, strArr, null);
                if (m2236c(context2) != null) {
                    f1826d.m2373a(new C0661s(context2, statSpecifyReportedInfo, c0616c));
                }
            }
        }
    }

    public static void trackCustomKVEvent(Context context, String str, Properties properties, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        if (StatConfig.isEnableStatService()) {
            Context context2 = getContext(context);
            if (context2 == null) {
                f1839q.error((Object) "The Context of StatService.trackCustomEvent() can not be null!");
            } else if (m2231a(str)) {
                f1839q.error((Object) "The event_id of StatService.trackCustomEvent() can not be null or empty.");
            } else {
                C0616c c0616c = new C0616c(str, null, properties);
                if (m2236c(context2) != null) {
                    f1826d.m2373a(new C0663u(context2, statSpecifyReportedInfo, c0616c));
                }
            }
        }
    }

    public static void trackCustomKVTimeIntervalEvent(Context context, String str, Properties properties, int i, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        if (StatConfig.isEnableStatService()) {
            Context context2 = getContext(context);
            if (context2 == null) {
                f1839q.error((Object) "The Context of StatService.trackCustomEndEvent() can not be null!");
            } else if (m2231a(str)) {
                f1839q.error((Object) "The event_id of StatService.trackCustomEndEvent() can not be null or empty.");
            } else {
                C0616c c0616c = new C0616c(str, null, properties);
                if (m2236c(context2) != null) {
                    f1826d.m2373a(new ac(context2, statSpecifyReportedInfo, c0616c, i));
                }
            }
        }
    }

    public static void trackCustomTimeIntervalEvent(Context context, int i, String str, String... strArr) {
        if (!StatConfig.isEnableStatService()) {
            return;
        }
        if (i <= 0) {
            f1839q.error((Object) "The intervalSecond of StatService.trackCustomTimeIntervalEvent() can must bigger than 0!");
            return;
        }
        Context context2 = getContext(context);
        if (context2 == null) {
            f1839q.error((Object) "The Context of StatService.trackCustomTimeIntervalEvent() can not be null!");
        } else if (m2236c(context2) != null) {
            f1826d.m2373a(new ab());
        }
    }

    public static void trackEndPage(Context context, String str, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        if (StatConfig.isEnableStatService()) {
            Context context2 = getContext(context);
            if (context2 == null || str == null || str.length() == 0) {
                f1839q.error((Object) "The Context or pageName of StatService.trackEndPage() can not be null or empty!");
                return;
            }
            String str2 = new String(str);
            if (m2236c(context2) != null) {
                f1826d.m2373a(new ah(context2, str2, statSpecifyReportedInfo));
            }
        }
    }
}
