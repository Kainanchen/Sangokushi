package com.amap.p003a;

import a.does.not.Exists2;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Looper;
import com.ali.fixHelper;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: SDKLogHandler */
/* renamed from: com.amap.a.cp */
public final class cp extends cm implements UncaughtExceptionHandler {
    private static ExecutorService f667e;
    private Context f668d;

    /* renamed from: com.amap.a.cp.1 */
    class SDKLogHandler implements Runnable {
        final /* synthetic */ Context f662a;
        final /* synthetic */ cj f663b;
        final /* synthetic */ boolean f664c;
        final /* synthetic */ cp f665d;

        SDKLogHandler(cp cpVar, Context context, cj cjVar, boolean z) {
            this.f665d = cpVar;
            this.f662a = context;
            this.f663b = cjVar;
            this.f664c = z;
        }

        public final void run() {
            try {
                synchronized (Looper.getMainLooper()) {
                    SDKDBOperation sDKDBOperation = new SDKDBOperation(this.f662a, true);
                    Object obj = this.f663b;
                    if (obj != null) {
                        try {
                            if (sDKDBOperation.f688a == null) {
                                sDKDBOperation.f688a = SDKDBOperation.m702a(sDKDBOperation.f689b, false);
                            }
                            String a = cj.m607a(obj.m611a());
                            if (sDKDBOperation.f688a.m681a(a, cj.class, false).size() == 0) {
                                sDKDBOperation.f688a.m682a(obj);
                            } else {
                                sDKDBOperation.f688a.m685a(a, obj, false);
                            }
                        } catch (Throwable th) {
                            cm.m637a(th, "SDKDB", "insert");
                            th.printStackTrace();
                        }
                    }
                }
                if (this.f664c) {
                    synchronized (Looper.getMainLooper()) {
                        UpdateLogDBOperation updateLogDBOperation = new UpdateLogDBOperation(this.f662a);
                        UpdateLogInfo updateLogInfo = new UpdateLogInfo();
                        updateLogInfo.m709c(true);
                        updateLogInfo.m707a(true);
                        updateLogInfo.m708b(true);
                        updateLogDBOperation.m706a(updateLogInfo);
                    }
                    cn.m643a(this.f665d.f668d);
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    /* renamed from: com.amap.a.cp.a */
    private static class SDKLogHandler implements al {
        private Context f666a;

        SDKLogHandler(Context context) {
            this.f666a = context;
        }

        public final void m654a() {
            try {
                cn.m647b(this.f666a);
            } catch (Throwable th) {
                cm.m637a(th, "LogNetListener", "onNetCompleted");
            }
        }
    }

    static {
        fixHelper.fixfunc(new int[]{892, 893, 894, 895, 896});
        if (VERSION.SDK_INT <= 0) {
            Exists2.class.toString();
        }
    }

    private native cp(Context context);

    public static synchronized cp m656a(Context context, cj cjVar) {
        cp cpVar;
        synchronized (cp.class) {
            if (cjVar == null) {
                throw new ca("sdk info is null");
            } else if (cjVar.m611a() == null || LetterIndexBar.SEARCH_ICON_LETTER.equals(cjVar.m611a())) {
                throw new ca("sdk name is invalid");
            } else {
                try {
                    if (cm.f641a == null) {
                        cm.f641a = new cp(context);
                    } else {
                        cm.f641a.f643c = false;
                    }
                    cm.f641a.m638a(context, cjVar, cm.f641a.f643c);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                cpVar = (cp) cm.f641a;
            }
        }
        return cpVar;
    }

    public static synchronized void m657a() {
        synchronized (cp.class) {
            try {
                if (f667e != null) {
                    f667e.shutdown();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            try {
                if (!(cm.f641a == null || Thread.getDefaultUncaughtExceptionHandler() != cm.f641a || cm.f641a.f642b == null)) {
                    Thread.setDefaultUncaughtExceptionHandler(cm.f641a.f642b);
                }
                cm.f641a = null;
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    public static synchronized ExecutorService m658b() {
        ExecutorService executorService;
        synchronized (cp.class) {
            try {
                if (f667e == null || f667e.isShutdown()) {
                    f667e = Executors.newSingleThreadExecutor();
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            executorService = f667e;
        }
        return executorService;
    }

    public static void m659b(cj cjVar, String str, String str2) {
        if (cm.f641a != null) {
            cm.f641a.m639a(cjVar, str, str2);
        }
    }

    public static void m660b(Throwable th, String str, String str2) {
        if (cm.f641a != null) {
            cm.f641a.m640a(th, 1, str, str2);
        }
    }

    protected final native void m661a(Context context, cj cjVar, boolean z);

    protected final native void m662a(cj cjVar, String str, String str2);

    protected final native void m663a(Throwable th, int i, String str, String str2);

    public final native void uncaughtException(Thread thread, Throwable th);
}
