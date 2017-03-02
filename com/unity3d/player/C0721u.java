package com.unity3d.player;

import android.os.Build;
import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: com.unity3d.player.u */
final class C0721u implements UncaughtExceptionHandler {
    private volatile UncaughtExceptionHandler f2324a;

    C0721u() {
    }

    final synchronized boolean m2627a() {
        boolean z;
        C0721u defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler == this) {
            z = false;
        } else {
            this.f2324a = defaultUncaughtExceptionHandler;
            Thread.setDefaultUncaughtExceptionHandler(this);
            z = true;
        }
        return z;
    }

    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        try {
            Throwable error = new Error(String.format("FATAL EXCEPTION [%s]\n", new Object[]{thread.getName()}) + String.format("Unity version     : %s\n", new Object[]{"5.3.5p8"}) + String.format("Device model      : %s %s\n", new Object[]{Build.MANUFACTURER, Build.MODEL}) + String.format("Device fingerprint: %s\n", new Object[]{Build.FINGERPRINT}));
            error.setStackTrace(new StackTraceElement[0]);
            error.initCause(th);
            this.f2324a.uncaughtException(thread, error);
        } catch (Throwable th2) {
            this.f2324a.uncaughtException(thread, th);
        }
    }
}
