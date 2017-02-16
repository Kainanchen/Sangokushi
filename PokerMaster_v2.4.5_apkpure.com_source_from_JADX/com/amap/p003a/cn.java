package com.amap.p003a;

import android.content.Context;
import android.text.TextUtils;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import net.sqlcipher.database.SQLiteDatabase;

/* compiled from: Log */
/* renamed from: com.amap.a.cn */
public final class cn {
    public static final String f654a;
    static final String f655b;
    static final String f656c;
    static final String f657d;
    public static final String f658e;
    public static final String f659f;

    /* renamed from: com.amap.a.cn.1 */
    static class Log implements Runnable {
        final /* synthetic */ Context f644a;
        final /* synthetic */ String f645b;
        final /* synthetic */ cj f646c;
        final /* synthetic */ String f647d;

        Log(Context context, String str, cj cjVar, String str2) {
            this.f644a = context;
            this.f645b = str;
            this.f646c = cjVar;
            this.f647d = str2;
        }

        public final void run() {
            try {
                LogProcessor d = cn.m649d(1);
                if (TextUtils.isEmpty(this.f645b)) {
                    d.m308a(this.f646c, this.f644a, new Throwable("gpsstatistics"), this.f647d, null, null);
                } else {
                    d.m307a(this.f646c, this.f644a, this.f645b, this.f647d, null, null);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: com.amap.a.cn.2 */
    static class Log implements Runnable {
        final /* synthetic */ Context f648a;
        final /* synthetic */ int f649b;
        final /* synthetic */ Throwable f650c;
        final /* synthetic */ String f651d;
        final /* synthetic */ String f652e;

        Log(Context context, int i, Throwable th, String str, String str2) {
            this.f648a = context;
            this.f649b = i;
            this.f650c = th;
            this.f651d = str;
            this.f652e = str2;
        }

        public final void run() {
            try {
                LogProcessor d = cn.m649d(this.f649b);
                if (d != null) {
                    d.m306a(this.f648a, this.f650c, this.f651d, this.f652e);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    /* renamed from: com.amap.a.cn.3 */
    static class Log implements Runnable {
        final /* synthetic */ Context f653a;

        Log(Context context) {
            this.f653a = context;
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            r7 = this;
            r0 = 0;
            r1 = 0;
            r2 = com.amap.p003a.cn.m649d(r1);	 Catch:{ RejectedExecutionException -> 0x006c, Throwable -> 0x0039, all -> 0x0056 }
            r1 = 1;
            r1 = com.amap.p003a.cn.m649d(r1);	 Catch:{ RejectedExecutionException -> 0x00a8, Throwable -> 0x0093, all -> 0x007c }
            r3 = 2;
            r0 = com.amap.p003a.cn.m649d(r3);	 Catch:{ RejectedExecutionException -> 0x00ab, Throwable -> 0x009a, all -> 0x0083 }
            r3 = r7.f653a;	 Catch:{ RejectedExecutionException -> 0x00ab, Throwable -> 0x00a1, all -> 0x008a }
            r2.m309b(r3);	 Catch:{ RejectedExecutionException -> 0x00ab, Throwable -> 0x00a1, all -> 0x008a }
            r3 = r7.f653a;	 Catch:{ RejectedExecutionException -> 0x00ab, Throwable -> 0x00a1, all -> 0x008a }
            r1.m309b(r3);	 Catch:{ RejectedExecutionException -> 0x00ab, Throwable -> 0x00a1, all -> 0x008a }
            r3 = r7.f653a;	 Catch:{ RejectedExecutionException -> 0x00ab, Throwable -> 0x00a1, all -> 0x008a }
            r0.m309b(r3);	 Catch:{ RejectedExecutionException -> 0x00ab, Throwable -> 0x00a1, all -> 0x008a }
            r3 = r7.f653a;	 Catch:{ RejectedExecutionException -> 0x00ab, Throwable -> 0x00a1, all -> 0x008a }
            com.amap.p003a.ar.m189a(r3);	 Catch:{ RejectedExecutionException -> 0x00ab, Throwable -> 0x00a1, all -> 0x008a }
            r3 = r7.f653a;	 Catch:{ RejectedExecutionException -> 0x00ab, Throwable -> 0x00a1, all -> 0x008a }
            com.amap.p003a.ap.m181a(r3);	 Catch:{ RejectedExecutionException -> 0x00ab, Throwable -> 0x00a1, all -> 0x008a }
            if (r2 == 0) goto L_0x002e;
        L_0x002b:
            r2.m304a();
        L_0x002e:
            if (r1 == 0) goto L_0x0033;
        L_0x0030:
            r1.m304a();
        L_0x0033:
            if (r0 == 0) goto L_0x0038;
        L_0x0035:
            r0.m304a();
        L_0x0038:
            return;
        L_0x0039:
            r1 = move-exception;
            r2 = r0;
            r3 = r0;
            r6 = r1;
            r1 = r0;
            r0 = r6;
        L_0x003f:
            r4 = "Log";
            r5 = "processLog";
            com.amap.p003a.cm.m637a(r0, r4, r5);	 Catch:{ all -> 0x0091 }
            if (r3 == 0) goto L_0x004b;
        L_0x0048:
            r3.m304a();
        L_0x004b:
            if (r2 == 0) goto L_0x0050;
        L_0x004d:
            r2.m304a();
        L_0x0050:
            if (r1 == 0) goto L_0x0038;
        L_0x0052:
            r1.m304a();
            goto L_0x0038;
        L_0x0056:
            r1 = move-exception;
            r2 = r0;
            r3 = r0;
            r6 = r1;
            r1 = r0;
            r0 = r6;
        L_0x005c:
            if (r3 == 0) goto L_0x0061;
        L_0x005e:
            r3.m304a();
        L_0x0061:
            if (r2 == 0) goto L_0x0066;
        L_0x0063:
            r2.m304a();
        L_0x0066:
            if (r1 == 0) goto L_0x006b;
        L_0x0068:
            r1.m304a();
        L_0x006b:
            throw r0;
        L_0x006c:
            r1 = move-exception;
            r1 = r0;
            r2 = r0;
        L_0x006f:
            if (r2 == 0) goto L_0x0074;
        L_0x0071:
            r2.m304a();
        L_0x0074:
            if (r1 == 0) goto L_0x0079;
        L_0x0076:
            r1.m304a();
        L_0x0079:
            if (r0 == 0) goto L_0x0038;
        L_0x007b:
            goto L_0x0035;
        L_0x007c:
            r1 = move-exception;
            r3 = r2;
            r2 = r0;
            r6 = r0;
            r0 = r1;
            r1 = r6;
            goto L_0x005c;
        L_0x0083:
            r3 = move-exception;
            r6 = r3;
            r3 = r2;
            r2 = r1;
            r1 = r0;
            r0 = r6;
            goto L_0x005c;
        L_0x008a:
            r3 = move-exception;
            r6 = r3;
            r3 = r2;
            r2 = r1;
            r1 = r0;
            r0 = r6;
            goto L_0x005c;
        L_0x0091:
            r0 = move-exception;
            goto L_0x005c;
        L_0x0093:
            r1 = move-exception;
            r3 = r2;
            r2 = r0;
            r6 = r0;
            r0 = r1;
            r1 = r6;
            goto L_0x003f;
        L_0x009a:
            r3 = move-exception;
            r6 = r3;
            r3 = r2;
            r2 = r1;
            r1 = r0;
            r0 = r6;
            goto L_0x003f;
        L_0x00a1:
            r3 = move-exception;
            r6 = r3;
            r3 = r2;
            r2 = r1;
            r1 = r0;
            r0 = r6;
            goto L_0x003f;
        L_0x00a8:
            r1 = move-exception;
            r1 = r0;
            goto L_0x006f;
        L_0x00ab:
            r3 = move-exception;
            goto L_0x006f;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amap.a.cn.3.run():void");
        }
    }

    static {
        f654a = "/a/";
        f655b = "b";
        f656c = "c";
        f657d = "d";
        f658e = "e";
        f659f = "f";
    }

    public static Class<? extends LogInfo> m641a(int i) {
        switch (i) {
            case SQLiteDatabase.OPEN_READWRITE /*0*/:
                return CrashLogInfo.class;
            case SQLiteDatabase.OPEN_READONLY /*1*/:
                return ExceptionLogInfo.class;
            case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                return ANRLogInfo.class;
            default:
                return null;
        }
    }

    public static String m642a(Context context, String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(context.getFilesDir().getAbsolutePath());
        stringBuilder.append(f654a);
        stringBuilder.append(str);
        return stringBuilder.toString();
    }

    static void m643a(Context context) {
        try {
            LogProcessor d = cn.m649d(2);
            if (d != null) {
                d.m305a(context);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    static void m644a(Context context, cj cjVar, String str, String str2) {
        Object obj = 1;
        try {
            if (cjVar.f627a != 1) {
                obj = null;
            }
            if (obj != null) {
                ExecutorService b = cp.m658b();
                if (b != null && !b.isShutdown()) {
                    b.submit(new Log(context, str2, cjVar, str));
                }
            }
        } catch (RejectedExecutionException e) {
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    static void m645a(Context context, Throwable th, int i, String str, String str2) {
        try {
            ExecutorService b = cp.m658b();
            if (b != null && !b.isShutdown()) {
                b.submit(new Log(context, i, th, str, str2));
            }
        } catch (RejectedExecutionException e) {
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static LogInfo m646b(int i) {
        switch (i) {
            case SQLiteDatabase.OPEN_READWRITE /*0*/:
                return new CrashLogInfo();
            case SQLiteDatabase.OPEN_READONLY /*1*/:
                return new ExceptionLogInfo();
            case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                return new ANRLogInfo();
            default:
                return null;
        }
    }

    static void m647b(Context context) {
        try {
            ExecutorService b = cp.m658b();
            if (b != null && !b.isShutdown()) {
                b.submit(new Log(context));
            }
        } catch (Throwable th) {
            cm.m637a(th, "Log", "processLog");
        }
    }

    public static String m648c(int i) {
        switch (i) {
            case SQLiteDatabase.OPEN_READWRITE /*0*/:
                return f656c;
            case SQLiteDatabase.OPEN_READONLY /*1*/:
                return f655b;
            case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                return f657d;
            default:
                return LetterIndexBar.SEARCH_ICON_LETTER;
        }
    }

    static LogProcessor m649d(int i) {
        switch (i) {
            case SQLiteDatabase.OPEN_READWRITE /*0*/:
                return new cr(i);
            case SQLiteDatabase.OPEN_READONLY /*1*/:
                return new cs(i);
            case SQLiteDatabase.CONFLICT_ABORT /*2*/:
                return new cq(i);
            default:
                return null;
        }
    }
}
