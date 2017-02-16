package com.facebook.common.p013b;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.common.b.f */
public final class UiThreadImmediateExecutorService extends HandlerExecutorServiceImpl {
    private static UiThreadImmediateExecutorService f1106b;

    static {
        f1106b = null;
    }

    private UiThreadImmediateExecutorService() {
        super(new Handler(Looper.getMainLooper()));
    }

    public static UiThreadImmediateExecutorService m1015a() {
        if (f1106b == null) {
            f1106b = new UiThreadImmediateExecutorService();
        }
        return f1106b;
    }

    public final void execute(Runnable runnable) {
        Object obj;
        if (Thread.currentThread() == this.f1102a.getLooper().getThread()) {
            obj = 1;
        } else {
            obj = null;
        }
        if (obj != null) {
            runnable.run();
        } else {
            super.execute(runnable);
        }
    }
}
