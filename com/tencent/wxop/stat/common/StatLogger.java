package com.tencent.wxop.stat.common;

import android.util.Log;
import com.tencent.connect.common.Constants;
import com.tencent.wxop.stat.C0650g;
import com.tencent.wxop.stat.StatConfig;

public final class StatLogger {
    private String f1991a;
    private boolean f1992b;
    private int f1993c;

    public StatLogger() {
        this.f1991a = "default";
        this.f1992b = true;
        this.f1993c = 2;
    }

    public StatLogger(String str) {
        this.f1991a = "default";
        this.f1992b = true;
        this.f1993c = 2;
        this.f1991a = str;
    }

    private String m2357a() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace == null) {
            return null;
        }
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (!stackTraceElement.isNativeMethod() && !stackTraceElement.getClassName().equals(Thread.class.getName()) && !stackTraceElement.getClassName().equals(getClass().getName())) {
                return "[" + Thread.currentThread().getName() + "(" + Thread.currentThread().getId() + "): " + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + "]";
            }
        }
        return null;
    }

    public final void m2358d(Object obj) {
        if (isDebugEnable()) {
            debug(obj);
        }
    }

    public final void debug(Object obj) {
        if (this.f1993c <= 3) {
            String a = m2357a();
            a = a == null ? obj.toString() : a + " - " + obj;
            Log.d(this.f1991a, a);
            C0650g customLogger = StatConfig.getCustomLogger();
            if (customLogger != null) {
                customLogger.m2467e(a);
            }
        }
    }

    public final void m2359e(Object obj) {
        if (isDebugEnable()) {
            error(obj);
        }
    }

    public final void m2360e(Throwable th) {
        if (isDebugEnable()) {
            error(th);
        }
    }

    public final void error(Object obj) {
        if (this.f1993c <= 6) {
            String a = m2357a();
            a = a == null ? obj.toString() : a + " - " + obj;
            Log.e(this.f1991a, a);
            C0650g customLogger = StatConfig.getCustomLogger();
            if (customLogger != null) {
                customLogger.m2466d(a);
            }
        }
    }

    public final void error(Throwable th) {
        if (this.f1993c <= 6) {
            Log.e(this.f1991a, Constants.STR_EMPTY, th);
            C0650g customLogger = StatConfig.getCustomLogger();
            if (customLogger != null) {
                customLogger.m2466d(th);
            }
        }
    }

    public final int getLogLevel() {
        return this.f1993c;
    }

    public final void m2361i(Object obj) {
        if (isDebugEnable()) {
            info(obj);
        }
    }

    public final void info(Object obj) {
        if (this.f1993c <= 4) {
            String a = m2357a();
            a = a == null ? obj.toString() : a + " - " + obj;
            Log.i(this.f1991a, a);
            C0650g customLogger = StatConfig.getCustomLogger();
            if (customLogger != null) {
                customLogger.m2463a(a);
            }
        }
    }

    public final boolean isDebugEnable() {
        return this.f1992b;
    }

    public final void setDebugEnable(boolean z) {
        this.f1992b = z;
    }

    public final void setLogLevel(int i) {
        this.f1993c = i;
    }

    public final void setTag(String str) {
        this.f1991a = str;
    }

    public final void m2362v(Object obj) {
        if (isDebugEnable()) {
            verbose(obj);
        }
    }

    public final void verbose(Object obj) {
        if (this.f1993c <= 2) {
            String a = m2357a();
            a = a == null ? obj.toString() : a + " - " + obj;
            Log.v(this.f1991a, a);
            C0650g customLogger = StatConfig.getCustomLogger();
            if (customLogger != null) {
                customLogger.m2464b(a);
            }
        }
    }

    public final void m2363w(Object obj) {
        if (isDebugEnable()) {
            warn(obj);
        }
    }

    public final void warn(Object obj) {
        if (this.f1993c <= 5) {
            String a = m2357a();
            a = a == null ? obj.toString() : a + " - " + obj;
            Log.w(this.f1991a, a);
            C0650g customLogger = StatConfig.getCustomLogger();
            if (customLogger != null) {
                customLogger.m2465c(a);
            }
        }
    }
}
