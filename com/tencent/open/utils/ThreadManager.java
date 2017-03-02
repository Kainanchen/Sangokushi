package com.tencent.open.utils;

import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: ProGuard */
public final class ThreadManager {
    public static final Executor NETWORK_EXECUTOR;
    private static Handler f1734a;
    private static Object f1735b;
    private static Handler f1736c;
    private static HandlerThread f1737d;
    private static Handler f1738e;
    private static HandlerThread f1739f;

    /* compiled from: ProGuard */
    private static class SerialExecutor implements Executor {
        final Queue<Runnable> f1732a;
        Runnable f1733b;

        /* renamed from: com.tencent.open.utils.ThreadManager.SerialExecutor.1 */
        class ProGuard implements Runnable {
            final /* synthetic */ Runnable f1730a;
            final /* synthetic */ SerialExecutor f1731b;

            ProGuard(SerialExecutor serialExecutor, Runnable runnable) {
                this.f1731b = serialExecutor;
                this.f1730a = runnable;
            }

            public void run() {
                try {
                    this.f1730a.run();
                } finally {
                    this.f1731b.m2192a();
                }
            }
        }

        private SerialExecutor() {
            this.f1732a = new LinkedList();
        }

        public synchronized void execute(Runnable runnable) {
            this.f1732a.offer(new ProGuard(this, runnable));
            if (this.f1733b == null) {
                m2192a();
            }
        }

        protected synchronized void m2192a() {
            Runnable runnable = (Runnable) this.f1732a.poll();
            this.f1733b = runnable;
            if (runnable != null) {
                ThreadManager.NETWORK_EXECUTOR.execute(this.f1733b);
            }
        }
    }

    static {
        f1735b = new Object();
        NETWORK_EXECUTOR = m2193a();
    }

    private static Executor m2193a() {
        Executor threadPoolExecutor;
        if (VERSION.SDK_INT >= 11) {
            threadPoolExecutor = new ThreadPoolExecutor(1, 1, 0, TimeUnit.SECONDS, new LinkedBlockingQueue());
        } else {
            Executor executor;
            try {
                Field declaredField = AsyncTask.class.getDeclaredField("sExecutor");
                declaredField.setAccessible(true);
                executor = (Executor) declaredField.get(null);
            } catch (Exception e) {
                Object threadPoolExecutor2 = new ThreadPoolExecutor(1, 1, 0, TimeUnit.SECONDS, new LinkedBlockingQueue());
            }
            threadPoolExecutor = executor;
        }
        if (threadPoolExecutor instanceof ThreadPoolExecutor) {
            ((ThreadPoolExecutor) threadPoolExecutor).setCorePoolSize(3);
        }
        return threadPoolExecutor;
    }

    public static void init() {
    }

    public static void executeOnNetWorkThread(Runnable runnable) {
        try {
            NETWORK_EXECUTOR.execute(runnable);
        } catch (RejectedExecutionException e) {
        }
    }

    public static Handler getMainHandler() {
        if (f1734a == null) {
            synchronized (f1735b) {
                if (f1734a == null) {
                    f1734a = new Handler(Looper.getMainLooper());
                }
            }
        }
        return f1734a;
    }

    public static Handler getFileThreadHandler() {
        if (f1738e == null) {
            synchronized (ThreadManager.class) {
                f1739f = new HandlerThread("SDK_FILE_RW");
                f1739f.start();
                f1738e = new Handler(f1739f.getLooper());
            }
        }
        return f1738e;
    }

    public static Looper getFileThreadLooper() {
        return getFileThreadHandler().getLooper();
    }

    public static Thread getSubThread() {
        if (f1737d == null) {
            getSubThreadHandler();
        }
        return f1737d;
    }

    public static Handler getSubThreadHandler() {
        if (f1736c == null) {
            synchronized (ThreadManager.class) {
                f1737d = new HandlerThread("SDK_SUB");
                f1737d.start();
                f1736c = new Handler(f1737d.getLooper());
            }
        }
        return f1736c;
    }

    public static Looper getSubThreadLooper() {
        return getSubThreadHandler().getLooper();
    }

    public static void executeOnSubThread(Runnable runnable) {
        getSubThreadHandler().post(runnable);
    }

    public static void executeOnFileThread(Runnable runnable) {
        getFileThreadHandler().post(runnable);
    }

    public static Executor newSerialExecutor() {
        return new SerialExecutor();
    }
}
