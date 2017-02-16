package com.facebook.p036h;

import android.util.Log;
import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import java.util.HashMap;
import java.util.Map.Entry;

/* renamed from: com.facebook.h.x */
public final class Logger {
    private static final HashMap<String, String> f1758a;
    private final LoggingBehavior f1759b;
    private final String f1760c;
    private StringBuilder f1761d;
    private int f1762e;

    static {
        f1758a = new HashMap();
    }

    private static synchronized void m1685a(String str, String str2) {
        synchronized (Logger.class) {
            f1758a.put(str, str2);
        }
    }

    public static synchronized void m1684a(String str) {
        synchronized (Logger.class) {
            if (!FacebookSdk.m2577a(LoggingBehavior.INCLUDE_ACCESS_TOKENS)) {
                Logger.m1685a(str, "ACCESS_TOKEN_REMOVED");
            }
        }
    }

    public static void m1682a(LoggingBehavior loggingBehavior, String str, String str2) {
        Logger.m1681a(loggingBehavior, 3, str, str2);
    }

    public static void m1683a(LoggingBehavior loggingBehavior, String str, String str2, Object... objArr) {
        if (FacebookSdk.m2577a(loggingBehavior)) {
            Logger.m1681a(loggingBehavior, 3, str, String.format(str2, objArr));
        }
    }

    public static void m1686b(LoggingBehavior loggingBehavior, String str, String str2, Object... objArr) {
        if (FacebookSdk.m2577a(loggingBehavior)) {
            Logger.m1681a(loggingBehavior, 5, str, String.format(str2, objArr));
        }
    }

    public static void m1681a(LoggingBehavior loggingBehavior, int i, String str, String str2) {
        if (FacebookSdk.m2577a(loggingBehavior)) {
            String c = Logger.m1687c(str2);
            if (!str.startsWith("FacebookSDK.")) {
                str = "FacebookSDK." + str;
            }
            Log.println(i, str, c);
            if (loggingBehavior == LoggingBehavior.DEVELOPER_ERRORS) {
                new Exception().printStackTrace();
            }
        }
    }

    private static synchronized String m1687c(String str) {
        synchronized (Logger.class) {
            for (Entry entry : f1758a.entrySet()) {
                str = str.replace((CharSequence) entry.getKey(), (CharSequence) entry.getValue());
            }
        }
        return str;
    }

    public Logger(LoggingBehavior loggingBehavior, String str) {
        this.f1762e = 3;
        ag.m1545a(str, "tag");
        this.f1759b = loggingBehavior;
        this.f1760c = "FacebookSDK." + str;
        this.f1761d = new StringBuilder();
    }

    public final void m1688a() {
        Logger.m1681a(this.f1759b, this.f1762e, this.f1760c, this.f1761d.toString());
        this.f1761d = new StringBuilder();
    }

    public final void m1689a(String str, Object obj) {
        String str2 = "  %s:\t%s\n";
        Object[] objArr = new Object[]{str, obj};
        if (FacebookSdk.m2577a(this.f1759b)) {
            this.f1761d.append(String.format(str2, objArr));
        }
    }

    public final void m1690b(String str) {
        if (FacebookSdk.m2577a(this.f1759b)) {
            this.f1761d.append(str);
        }
    }
}
