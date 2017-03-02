package com.tencent.wxop.stat;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import com.alipay.sdk.sys.C0190a;
import com.ta.utdid2.android.utils.TimeUtils;
import com.tencent.connect.common.Constants;
import com.tencent.p055a.p056a.p057a.p058a.C0579g;
import com.tencent.wxop.stat.common.C0639k;
import com.tencent.wxop.stat.common.C0644p;
import com.tencent.wxop.stat.common.C0645q;
import com.tencent.wxop.stat.common.StatConstants;
import com.tencent.wxop.stat.common.StatLogger;
import com.ut.device.AidConstants;
import java.net.URI;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public class StatConfig {
    private static String f1773A;
    private static String f1774B;
    private static String f1775C;
    private static String f1776D;
    private static int f1777E;
    private static int f1778F;
    private static long f1779G;
    private static long f1780H;
    private static volatile String f1781I;
    private static int f1782J;
    private static volatile int f1783K;
    private static int f1784L;
    private static int f1785M;
    private static boolean f1786N;
    private static int f1787O;
    private static boolean f1788P;
    private static String f1789Q;
    private static boolean f1790R;
    private static C0650g f1791S;
    static C0649f f1792a;
    static C0649f f1793b;
    static String f1794c;
    static String f1795d;
    static String f1796e;
    static String f1797f;
    static boolean f1798g;
    static int f1799h;
    static long f1800i;
    public static boolean isAutoExceptionCaught;
    static boolean f1801j;
    static volatile String f1802k;
    static boolean f1803l;
    static int f1804m;
    static long f1805n;
    static int f1806o;
    private static StatLogger f1807p;
    private static StatReportStrategy f1808q;
    private static boolean f1809r;
    private static boolean f1810s;
    private static int f1811t;
    private static int f1812u;
    private static int f1813v;
    private static int f1814w;
    private static int f1815x;
    private static int f1816y;
    private static int f1817z;

    static {
        f1807p = C0639k.m2401b();
        f1792a = new C0649f(2);
        f1793b = new C0649f(1);
        f1808q = StatReportStrategy.APP_LAUNCH;
        f1809r = false;
        f1810s = true;
        f1811t = 30000;
        f1812u = 100000;
        f1813v = 30;
        f1814w = 10;
        f1815x = 100;
        f1816y = 30;
        f1817z = 1;
        f1794c = "__HIBERNATE__";
        f1795d = "__HIBERNATE__TIME";
        f1796e = "__MTA_KILL__";
        f1773A = null;
        f1776D = "mta_channel";
        f1797f = Constants.STR_EMPTY;
        f1777E = 180;
        f1798g = false;
        f1799h = 100;
        f1800i = 10000;
        f1778F = AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT;
        f1801j = true;
        f1779G = 0;
        f1780H = 300000;
        isAutoExceptionCaught = true;
        f1802k = StatConstants.MTA_SERVER;
        f1781I = StatConstants.MTA_REPORT_FULL_URL;
        f1782J = 0;
        f1783K = 0;
        f1784L = 20;
        f1785M = 0;
        f1786N = false;
        f1787O = AccessibilityNodeInfoCompat.ACTION_SCROLL_FORWARD;
        f1788P = false;
        f1789Q = null;
        f1790R = false;
        f1791S = null;
        f1803l = true;
        f1804m = 0;
        f1805n = 10000;
        f1806o = AccessibilityNodeInfoCompat.ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY;
    }

    static int m2204a() {
        return f1813v;
    }

    static String m2205a(Context context) {
        return C0645q.m2447a(C0644p.m2442a(context, "_mta_ky_tag_", null));
    }

    static String m2206a(String str, String str2) {
        try {
            String string = f1793b.f2076b.getString(str);
            return string != null ? string : str2;
        } catch (Throwable th) {
            f1807p.m2363w("can't find custom key:" + str);
            return str2;
        }
    }

    static synchronized void m2207a(int i) {
        synchronized (StatConfig.class) {
            f1783K = i;
        }
    }

    static void m2208a(long j) {
        C0644p.m2444b(C0651i.m2468a(), f1794c, j);
        setEnableStatService(false);
        f1807p.warn("MTA is disable for current SDK version");
    }

    static void m2209a(Context context, C0649f c0649f) {
        if (c0649f.f2075a == f1793b.f2075a) {
            f1793b = c0649f;
            m2213a(c0649f.f2076b);
            if (!f1793b.f2076b.isNull("iplist")) {
                C0625a.m2283a(context).m2291a(f1793b.f2076b.getString("iplist"));
            }
        } else if (c0649f.f2075a == f1792a.f2075a) {
            f1792a = c0649f;
        }
    }

    static void m2210a(Context context, C0649f c0649f, JSONObject jSONObject) {
        Object obj = null;
        try {
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                if (str.equalsIgnoreCase("v")) {
                    int i = jSONObject.getInt(str);
                    Object obj2 = c0649f.f2078d != i ? 1 : obj;
                    c0649f.f2078d = i;
                    obj = obj2;
                } else if (str.equalsIgnoreCase("c")) {
                    str = jSONObject.getString("c");
                    if (str.length() > 0) {
                        c0649f.f2076b = new JSONObject(str);
                    }
                } else if (str.equalsIgnoreCase("m")) {
                    c0649f.f2077c = jSONObject.getString("m");
                }
            }
            if (obj == 1) {
                au a = au.m2317a(C0651i.m2468a());
                if (a != null) {
                    a.m2347a(c0649f);
                }
                if (c0649f.f2075a == f1793b.f2075a) {
                    m2213a(c0649f.f2076b);
                    m2220b(c0649f.f2076b);
                }
            }
            m2209a(context, c0649f);
        } catch (Throwable e) {
            f1807p.m2360e(e);
        } catch (Throwable e2) {
            f1807p.m2360e(e2);
        }
    }

    static void m2211a(Context context, String str) {
        if (str != null) {
            C0644p.m2445b(context, "_mta_ky_tag_", C0645q.m2452b(str));
        }
    }

    static void m2212a(Context context, JSONObject jSONObject) {
        try {
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                if (str.equalsIgnoreCase(Integer.toString(f1793b.f2075a))) {
                    m2210a(context, f1793b, jSONObject.getJSONObject(str));
                } else if (str.equalsIgnoreCase(Integer.toString(f1792a.f2075a))) {
                    m2210a(context, f1792a, jSONObject.getJSONObject(str));
                } else if (str.equalsIgnoreCase("rs")) {
                    StatReportStrategy statReportStrategy = StatReportStrategy.getStatReportStrategy(jSONObject.getInt(str));
                    if (statReportStrategy != null) {
                        f1808q = statReportStrategy;
                        if (isDebugEnable()) {
                            f1807p.m2358d("Change to ReportStrategy:" + statReportStrategy.name());
                        }
                    }
                } else {
                    return;
                }
            }
        } catch (Throwable e) {
            f1807p.m2360e(e);
        }
    }

    static void m2213a(JSONObject jSONObject) {
        try {
            StatReportStrategy statReportStrategy = StatReportStrategy.getStatReportStrategy(jSONObject.getInt("rs"));
            if (statReportStrategy != null) {
                setStatSendStrategy(statReportStrategy);
            }
        } catch (JSONException e) {
            if (isDebugEnable()) {
                f1807p.m2361i("rs not found.");
            }
        }
    }

    static boolean m2214a(int i, int i2, int i3) {
        return i >= i2 && i <= i3;
    }

    private static boolean m2215a(String str) {
        if (str == null) {
            return false;
        }
        if (f1774B == null) {
            f1774B = str;
            return true;
        } else if (f1774B.contains(str)) {
            return false;
        } else {
            f1774B += "|" + str;
            return true;
        }
    }

    static boolean m2216a(JSONObject jSONObject, String str, String str2) {
        if (!jSONObject.isNull(str)) {
            String optString = jSONObject.optString(str);
            if (C0639k.m2405c(str2) && C0639k.m2405c(optString) && str2.equalsIgnoreCase(optString)) {
                return true;
            }
        }
        return false;
    }

    static void m2217b() {
        f1785M++;
    }

    static void m2218b(int i) {
        if (i >= 0) {
            f1785M = i;
        }
    }

    static void m2219b(Context context, JSONObject jSONObject) {
        try {
            String optString = jSONObject.optString(f1796e);
            if (C0639k.m2405c(optString)) {
                JSONObject jSONObject2 = new JSONObject(optString);
                if (jSONObject2.length() != 0) {
                    Object obj;
                    if (!jSONObject2.isNull("sm")) {
                        obj = jSONObject2.get("sm");
                        int intValue = obj instanceof Integer ? ((Integer) obj).intValue() : obj instanceof String ? Integer.valueOf((String) obj).intValue() : 0;
                        if (intValue > 0) {
                            if (isDebugEnable()) {
                                f1807p.m2361i("match sleepTime:" + intValue + " minutes");
                            }
                            C0644p.m2444b(context, f1795d, System.currentTimeMillis() + ((long) ((intValue * 60) * AidConstants.EVENT_REQUEST_STARTED)));
                            setEnableStatService(false);
                            f1807p.warn("MTA is disable for current SDK version");
                        }
                    }
                    if (m2216a(jSONObject2, C0190a.f457h, StatConstants.VERSION)) {
                        f1807p.m2361i("match sdk version:2.0.3");
                        obj = 1;
                    } else {
                        obj = null;
                    }
                    if (m2216a(jSONObject2, "md", Build.MODEL)) {
                        f1807p.m2361i("match MODEL:" + Build.MODEL);
                        obj = 1;
                    }
                    if (m2216a(jSONObject2, C0190a.f460k, C0639k.m2417j(context))) {
                        f1807p.m2361i("match app version:" + C0639k.m2417j(context));
                        obj = 1;
                    }
                    if (m2216a(jSONObject2, "mf", Build.MANUFACTURER)) {
                        f1807p.m2361i("match MANUFACTURER:" + Build.MANUFACTURER);
                        obj = 1;
                    }
                    if (m2216a(jSONObject2, "osv", VERSION.SDK_INT)) {
                        f1807p.m2361i("match android SDK version:" + VERSION.SDK_INT);
                        obj = 1;
                    }
                    if (m2216a(jSONObject2, "ov", VERSION.SDK_INT)) {
                        f1807p.m2361i("match android SDK version:" + VERSION.SDK_INT);
                        obj = 1;
                    }
                    if (m2216a(jSONObject2, "ui", au.m2317a(context).m2350b(context).m2366b())) {
                        f1807p.m2361i("match imei:" + au.m2317a(context).m2350b(context).m2366b());
                        obj = 1;
                    }
                    if (m2216a(jSONObject2, "mid", getLocalMidOnly(context))) {
                        f1807p.m2361i("match mid:" + getLocalMidOnly(context));
                        obj = 1;
                    }
                    if (obj != null) {
                        m2208a(C0639k.m2400b(StatConstants.VERSION));
                    }
                }
            }
        } catch (Throwable e) {
            f1807p.m2360e(e);
        }
    }

    static void m2220b(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            try {
                m2219b(C0651i.m2468a(), jSONObject);
                String string = jSONObject.getString(f1794c);
                if (isDebugEnable()) {
                    f1807p.m2358d("hibernateVer:" + string + ", current version:2.0.3");
                }
                long b = C0639k.m2400b(string);
                if (C0639k.m2400b(StatConstants.VERSION) <= b) {
                    m2208a(b);
                }
            } catch (JSONException e) {
                f1807p.m2358d("__HIBERNATE__ not found.");
            }
        }
    }

    static int m2221c() {
        return f1785M;
    }

    public static synchronized String getAppKey(Context context) {
        String str;
        synchronized (StatConfig.class) {
            if (f1774B != null) {
                str = f1774B;
            } else {
                if (context != null) {
                    if (f1774B == null) {
                        f1774B = C0639k.m2411f(context);
                    }
                }
                if (f1774B == null || f1774B.trim().length() == 0) {
                    f1807p.error((Object) "AppKey can not be null or empty, please read Developer's Guide first!");
                }
                str = f1774B;
            }
        }
        return str;
    }

    public static int getCurSessionStatReportCount() {
        return f1783K;
    }

    public static C0650g getCustomLogger() {
        return f1791S;
    }

    public static String getCustomProperty(String str) {
        try {
            return f1792a.f2076b.getString(str);
        } catch (Throwable th) {
            f1807p.m2360e(th);
            return null;
        }
    }

    public static String getCustomProperty(String str, String str2) {
        try {
            String string = f1792a.f2076b.getString(str);
            return string != null ? string : str2;
        } catch (Throwable th) {
            f1807p.m2360e(th);
            return str2;
        }
    }

    public static String getCustomUserId(Context context) {
        if (context == null) {
            f1807p.error((Object) "Context for getCustomUid is null.");
            return null;
        }
        if (f1789Q == null) {
            f1789Q = C0644p.m2442a(context, "MTA_CUSTOM_UID", Constants.STR_EMPTY);
        }
        return f1789Q;
    }

    public static long getFlushDBSpaceMS() {
        return f1805n;
    }

    public static synchronized String getInstallChannel(Context context) {
        String str;
        synchronized (StatConfig.class) {
            if (f1775C != null) {
                str = f1775C;
            } else {
                str = C0644p.m2442a(context, f1776D, Constants.STR_EMPTY);
                f1775C = str;
                if (str == null || f1775C.trim().length() == 0) {
                    f1775C = C0639k.m2412g(context);
                }
                if (f1775C == null || f1775C.trim().length() == 0) {
                    f1807p.m2363w("installChannel can not be null or empty, please read Developer's Guide first!");
                }
                str = f1775C;
            }
        }
        return str;
    }

    public static String getLocalMidOnly(Context context) {
        return context != null ? C0579g.m1921E(context).m1924p().m1914a() : Constants.VIA_RESULT_SUCCESS;
    }

    public static int getMaxBatchReportCount() {
        return f1816y;
    }

    public static int getMaxDaySessionNumbers() {
        return f1784L;
    }

    public static int getMaxImportantDataSendRetryCount() {
        return f1815x;
    }

    public static int getMaxParallelTimmingEvents() {
        return f1778F;
    }

    public static int getMaxReportEventLength() {
        return f1787O;
    }

    public static int getMaxSendRetryCount() {
        return f1814w;
    }

    public static int getMaxSessionStatReportCount() {
        return f1782J;
    }

    public static int getMaxStoreEventCount() {
        return f1812u;
    }

    public static String getMid(Context context) {
        return getLocalMidOnly(context);
    }

    public static long getMsPeriodForMethodsCalledLimitClear() {
        return f1800i;
    }

    public static int getNumEventsCachedInMemory() {
        return f1804m;
    }

    public static int getNumEventsCommitPerSec() {
        return f1817z;
    }

    public static int getNumOfMethodsCalledLimit() {
        return f1799h;
    }

    public static String getQQ(Context context) {
        return C0644p.m2442a(context, "mta.acc.qq", f1797f);
    }

    public static int getReportCompressedSize() {
        return f1806o;
    }

    public static int getSendPeriodMinutes() {
        return f1777E;
    }

    public static int getSessionTimoutMillis() {
        return f1811t;
    }

    public static String getStatReportHost() {
        return f1802k;
    }

    public static String getStatReportUrl() {
        return f1781I;
    }

    public static StatReportStrategy getStatSendStrategy() {
        return f1808q;
    }

    public static boolean isAutoExceptionCaught() {
        return isAutoExceptionCaught;
    }

    public static boolean isDebugEnable() {
        return f1809r;
    }

    public static boolean isEnableConcurrentProcess() {
        return f1788P;
    }

    public static boolean isEnableSmartReporting() {
        return f1801j;
    }

    public static boolean isEnableStatService() {
        return f1810s;
    }

    public static boolean isReportEventsByOrder() {
        return f1803l;
    }

    public static boolean isXGProMode() {
        return f1790R;
    }

    public static void setAppKey(Context context, String str) {
        if (context == null) {
            f1807p.error((Object) "ctx in StatConfig.setAppKey() is null");
        } else if (str == null || str.length() > AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) {
            f1807p.error((Object) "appkey in StatConfig.setAppKey() is null or exceed 256 bytes");
        } else {
            if (f1774B == null) {
                f1774B = m2205a(context);
            }
            if ((m2215a(str) | m2215a(C0639k.m2411f(context))) != 0) {
                m2211a(context, f1774B);
            }
        }
    }

    public static void setAppKey(String str) {
        if (str == null) {
            f1807p.error((Object) "appkey in StatConfig.setAppKey() is null");
        } else if (str.length() > AccessibilityNodeInfoCompat.ACTION_NEXT_AT_MOVEMENT_GRANULARITY) {
            f1807p.error((Object) "The length of appkey cann't exceed 256 bytes.");
        } else {
            f1774B = str;
        }
    }

    public static void setAutoExceptionCaught(boolean z) {
        isAutoExceptionCaught = z;
    }

    public static void setCustomLogger(C0650g c0650g) {
        f1791S = c0650g;
    }

    public static void setCustomUserId(Context context, String str) {
        if (context == null) {
            f1807p.error((Object) "Context for setCustomUid is null.");
            return;
        }
        C0644p.m2445b(context, "MTA_CUSTOM_UID", str);
        f1789Q = str;
    }

    public static void setDebugEnable(boolean z) {
        f1809r = z;
        C0639k.m2401b().setDebugEnable(z);
    }

    public static void setEnableConcurrentProcess(boolean z) {
        f1788P = z;
    }

    public static void setEnableSmartReporting(boolean z) {
        f1801j = z;
    }

    public static void setEnableStatService(boolean z) {
        f1810s = z;
        if (!z) {
            f1807p.warn("!!!!!!MTA StatService has been disabled!!!!!!");
        }
    }

    public static void setFlushDBSpaceMS(long j) {
        if (j > 0) {
            f1805n = j;
        }
    }

    public static void setInstallChannel(Context context, String str) {
        if (str.length() > AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS) {
            f1807p.error((Object) "the length of installChannel can not exceed the range of 128 bytes.");
            return;
        }
        f1775C = str;
        C0644p.m2445b(context, f1776D, str);
    }

    public static void setInstallChannel(String str) {
        if (str.length() > AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS) {
            f1807p.error((Object) "the length of installChannel can not exceed the range of 128 bytes.");
        } else {
            f1775C = str;
        }
    }

    public static void setMaxBatchReportCount(int i) {
        if (m2214a(i, 2, (int) AidConstants.EVENT_REQUEST_STARTED)) {
            f1816y = i;
        } else {
            f1807p.error((Object) "setMaxBatchReportCount can not exceed the range of [2,1000].");
        }
    }

    public static void setMaxDaySessionNumbers(int i) {
        if (i <= 0) {
            f1807p.m2359e((Object) "maxDaySessionNumbers must be greater than 0.");
        } else {
            f1784L = i;
        }
    }

    public static void setMaxImportantDataSendRetryCount(int i) {
        if (i > 100) {
            f1815x = i;
        }
    }

    public static void setMaxParallelTimmingEvents(int i) {
        if (m2214a(i, 1, (int) AccessibilityNodeInfoCompat.ACTION_SCROLL_FORWARD)) {
            f1778F = i;
        } else {
            f1807p.error((Object) "setMaxParallelTimmingEvents can not exceed the range of [1, 4096].");
        }
    }

    public static void setMaxReportEventLength(int i) {
        if (i <= 0) {
            f1807p.error((Object) "maxReportEventLength on setMaxReportEventLength() must greater than 0.");
        } else {
            f1787O = i;
        }
    }

    public static void setMaxSendRetryCount(int i) {
        if (m2214a(i, 1, (int) AidConstants.EVENT_REQUEST_STARTED)) {
            f1814w = i;
        } else {
            f1807p.error((Object) "setMaxSendRetryCount can not exceed the range of [1,1000].");
        }
    }

    public static void setMaxSessionStatReportCount(int i) {
        if (i < 0) {
            f1807p.error((Object) "maxSessionStatReportCount cannot be less than 0.");
        } else {
            f1782J = i;
        }
    }

    public static void setMaxStoreEventCount(int i) {
        if (m2214a(i, 0, 500000)) {
            f1812u = i;
        } else {
            f1807p.error((Object) "setMaxStoreEventCount can not exceed the range of [0, 500000].");
        }
    }

    public static void setNumEventsCachedInMemory(int i) {
        if (i >= 0) {
            f1804m = i;
        }
    }

    public static void setNumEventsCommitPerSec(int i) {
        if (i > 0) {
            f1817z = i;
        }
    }

    public static void setNumOfMethodsCalledLimit(int i, long j) {
        f1799h = i;
        if (j >= 1000) {
            f1800i = j;
        }
    }

    public static void setQQ(Context context, String str) {
        C0644p.m2445b(context, "mta.acc.qq", str);
        f1797f = str;
    }

    public static void setReportCompressedSize(int i) {
        if (i > 0) {
            f1806o = i;
        }
    }

    public static void setReportEventsByOrder(boolean z) {
        f1803l = z;
    }

    public static void setSendPeriodMinutes(int i) {
        if (m2214a(i, 1, 10080)) {
            f1777E = i;
        } else {
            f1807p.error((Object) "setSendPeriodMinutes can not exceed the range of [1, 7*24*60] minutes.");
        }
    }

    public static void setSessionTimoutMillis(int i) {
        if (m2214a(i, (int) AidConstants.EVENT_REQUEST_STARTED, (int) TimeUtils.TOTAL_M_S_ONE_DAY)) {
            f1811t = i;
        } else {
            f1807p.error((Object) "setSessionTimoutMillis can not exceed the range of [1000, 24 * 60 * 60 * 1000].");
        }
    }

    public static void setStatReportUrl(String str) {
        if (str == null || str.length() == 0) {
            f1807p.error((Object) "statReportUrl cannot be null or empty.");
            return;
        }
        f1781I = str;
        try {
            f1802k = new URI(f1781I).getHost();
        } catch (Exception e) {
            f1807p.m2363w(e);
        }
        if (isDebugEnable()) {
            f1807p.m2361i("url:" + f1781I + ", domain:" + f1802k);
        }
    }

    public static void setStatSendStrategy(StatReportStrategy statReportStrategy) {
        f1808q = statReportStrategy;
        if (statReportStrategy != StatReportStrategy.PERIOD) {
            StatServiceImpl.f1825c = 0;
        }
        if (isDebugEnable()) {
            f1807p.m2358d("Change to statSendStrategy: " + statReportStrategy);
        }
    }

    public static void setXGProMode(boolean z) {
        f1790R = z;
    }
}
