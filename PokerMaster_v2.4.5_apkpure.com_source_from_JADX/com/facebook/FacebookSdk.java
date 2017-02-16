package com.facebook;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import android.os.AsyncTask;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.util.Base64;
import com.facebook.ab.R;
import com.facebook.p004a.AppEventsLogger;
import com.facebook.p036h.BoltsMeasurementEventListener;
import com.facebook.p036h.FetchedAppSettingsManager;
import com.facebook.p036h.LockOnGetVariable;
import com.facebook.p036h.NativeProtocol;
import com.facebook.p036h.ac;
import com.facebook.p036h.ag;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.facebook.m */
public final class FacebookSdk {
    private static final String f2670a;
    private static final HashSet<LoggingBehavior> f2671b;
    private static volatile Executor f2672c;
    private static volatile String f2673d;
    private static volatile String f2674e;
    private static volatile String f2675f;
    private static volatile int f2676g;
    private static volatile String f2677h;
    private static AtomicLong f2678i;
    private static volatile boolean f2679j;
    private static boolean f2680k;
    private static LockOnGetVariable<File> f2681l;
    private static Context f2682m;
    private static int f2683n;
    private static final Object f2684o;
    private static final int f2685p;
    private static String f2686q;
    private static final BlockingQueue<Runnable> f2687r;
    private static final ThreadFactory f2688s;
    private static Boolean f2689t;

    /* renamed from: com.facebook.m.1 */
    static class FacebookSdk implements ThreadFactory {
        private final AtomicInteger f2665a;

        FacebookSdk() {
            this.f2665a = new AtomicInteger(0);
        }

        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "FacebookSdk #" + this.f2665a.incrementAndGet());
        }
    }

    /* renamed from: com.facebook.m.2 */
    static class FacebookSdk implements Callable<File> {
        FacebookSdk() {
        }

        public final /* synthetic */ Object call() {
            return FacebookSdk.f2682m.getCacheDir();
        }
    }

    /* renamed from: com.facebook.m.3 */
    static class FacebookSdk implements Callable<Void> {
        final /* synthetic */ FacebookSdk f2666a;
        final /* synthetic */ Context f2667b;

        FacebookSdk(Context context) {
            this.f2666a = null;
            this.f2667b = context;
        }

        public final /* synthetic */ Object call() {
            AccessTokenManager a = AccessTokenManager.m999a();
            AccessToken a2 = a.f1095a.m900a();
            if (a2 != null) {
                a.m1003a(a2, false);
            }
            ProfileManager a3 = ProfileManager.m2666a();
            Profile a4 = a3.f2765a.m2665a();
            if (a4 != null) {
                a3.m2667a(a4, false);
            }
            if (AccessToken.m883a() != null && Profile.m2661a() == null) {
                Profile.m2663b();
            }
            AppEventsLogger.m824a(this.f2667b.getApplicationContext());
            AppEventsLogger.m829b();
            return null;
        }
    }

    /* renamed from: com.facebook.m.4 */
    static class FacebookSdk implements Runnable {
        final /* synthetic */ Context f2668a;
        final /* synthetic */ String f2669b;

        FacebookSdk(Context context, String str) {
            this.f2668a = context;
            this.f2669b = str;
        }

        public final void run() {
            FacebookSdk.m2578b(this.f2668a, this.f2669b);
        }
    }

    /* renamed from: com.facebook.m.a */
    public interface FacebookSdk {
    }

    static {
        f2670a = FacebookSdk.class.getCanonicalName();
        f2671b = new HashSet(Arrays.asList(new LoggingBehavior[]{LoggingBehavior.DEVELOPER_ERRORS}));
        f2677h = "facebook.com";
        f2678i = new AtomicLong(PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH);
        f2679j = false;
        f2680k = false;
        f2683n = 64206;
        f2684o = new Object();
        f2685p = R.com_facebook_activity_theme;
        f2686q = ac.m1481d();
        f2687r = new LinkedBlockingQueue(10);
        f2688s = new FacebookSdk();
        f2689t = Boolean.valueOf(false);
    }

    public static synchronized void m2574a(Context context) {
        synchronized (FacebookSdk.class) {
            FacebookSdk.m2584d(context);
        }
    }

    private static synchronized void m2584d(Context context) {
        synchronized (FacebookSdk.class) {
            if (!f2689t.booleanValue()) {
                ag.m1544a((Object) context, "applicationContext");
                ag.m1549b(context, false);
                ag.m1543a(context, false);
                Context applicationContext = context.getApplicationContext();
                f2682m = applicationContext;
                if (applicationContext != null) {
                    try {
                        ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), AccessibilityNodeInfoCompat.ACTION_CLEAR_ACCESSIBILITY_FOCUS);
                        if (applicationInfo != null) {
                            if (applicationInfo.metaData != null) {
                                if (f2673d == null) {
                                    Object obj = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
                                    if (obj instanceof String) {
                                        String str = (String) obj;
                                        if (str.toLowerCase(Locale.ROOT).startsWith("fb")) {
                                            f2673d = str.substring(2);
                                        } else {
                                            f2673d = str;
                                        }
                                    } else if (obj instanceof Integer) {
                                        throw new FacebookException("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                                    }
                                }
                                if (f2674e == null) {
                                    f2674e = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
                                }
                                if (f2675f == null) {
                                    f2675f = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
                                }
                                if (f2676g == 0) {
                                    int i = applicationInfo.metaData.getInt("com.facebook.sdk.WebDialogTheme");
                                    if (i == 0) {
                                        i = f2685p;
                                    }
                                    f2676g = i;
                                }
                            }
                        }
                    } catch (NameNotFoundException e) {
                    }
                }
                f2689t = Boolean.valueOf(true);
                FetchedAppSettingsManager.m1650a(f2682m, f2673d);
                NativeProtocol.m1731b();
                BoltsMeasurementEventListener.m1590a(f2682m);
                f2681l = new LockOnGetVariable(new FacebookSdk());
                FacebookSdk.m2583d().execute(new FutureTask(new FacebookSdk(context)));
            }
        }
    }

    public static synchronized boolean m2576a() {
        boolean booleanValue;
        synchronized (FacebookSdk.class) {
            booleanValue = f2689t.booleanValue();
        }
        return booleanValue;
    }

    public static boolean m2577a(LoggingBehavior loggingBehavior) {
        boolean z;
        synchronized (f2671b) {
            z = f2679j && f2671b.contains(loggingBehavior);
        }
        return z;
    }

    public static boolean m2579b() {
        return f2679j;
    }

    public static boolean m2582c() {
        return f2680k;
    }

    public static Executor m2583d() {
        synchronized (f2684o) {
            if (f2672c == null) {
                f2672c = AsyncTask.THREAD_POOL_EXECUTOR;
            }
        }
        return f2672c;
    }

    public static String m2585e() {
        return f2677h;
    }

    public static Context m2586f() {
        ag.m1541a();
        return f2682m;
    }

    public static String m2587g() {
        return f2686q;
    }

    public static void m2575a(Context context, String str) {
        FacebookSdk.m2583d().execute(new FacebookSdk(context.getApplicationContext(), str));
    }

    static com.facebook.GraphResponse m2578b(android.content.Context r14, java.lang.String r15) {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:com.facebook.m.b(android.content.Context, java.lang.String):com.facebook.s. bs: [B:3:0x0007, B:11:0x005b]
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:86)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:57)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:281)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:161)
*/
        /*
        r12 = 0;
        r1 = 0;
        if (r14 == 0) goto L_0x0007;
    L_0x0005:
        if (r15 != 0) goto L_0x001f;
    L_0x0007:
        r0 = new java.lang.IllegalArgumentException;	 Catch:{ Exception -> 0x000f }
        r2 = "Both context and applicationId must be non-null";	 Catch:{ Exception -> 0x000f }
        r0.<init>(r2);	 Catch:{ Exception -> 0x000f }
        throw r0;	 Catch:{ Exception -> 0x000f }
    L_0x000f:
        r0 = move-exception;
        r2 = r0;
        com.facebook.p036h.af.m1515a(r2);
        r0 = new com.facebook.s;
        r3 = new com.facebook.l;
        r3.<init>(r1, r2);
        r0.<init>(r1, r1, r3);
    L_0x001e:
        return r0;
    L_0x001f:
        r0 = com.facebook.p036h.AttributionIdentifiers.m1586a(r14);	 Catch:{ Exception -> 0x000f }
        r2 = "com.facebook.sdk.attributionTracking";	 Catch:{ Exception -> 0x000f }
        r3 = 0;	 Catch:{ Exception -> 0x000f }
        r2 = r14.getSharedPreferences(r2, r3);	 Catch:{ Exception -> 0x000f }
        r3 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x000f }
        r3.<init>();	 Catch:{ Exception -> 0x000f }
        r3 = r3.append(r15);	 Catch:{ Exception -> 0x000f }
        r4 = "ping";	 Catch:{ Exception -> 0x000f }
        r3 = r3.append(r4);	 Catch:{ Exception -> 0x000f }
        r3 = r3.toString();	 Catch:{ Exception -> 0x000f }
        r4 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x000f }
        r4.<init>();	 Catch:{ Exception -> 0x000f }
        r4 = r4.append(r15);	 Catch:{ Exception -> 0x000f }
        r5 = "json";	 Catch:{ Exception -> 0x000f }
        r4 = r4.append(r5);	 Catch:{ Exception -> 0x000f }
        r4 = r4.toString();	 Catch:{ Exception -> 0x000f }
        r6 = 0;	 Catch:{ Exception -> 0x000f }
        r6 = r2.getLong(r3, r6);	 Catch:{ Exception -> 0x000f }
        r5 = 0;	 Catch:{ Exception -> 0x000f }
        r5 = r2.getString(r4, r5);	 Catch:{ Exception -> 0x000f }
        r8 = com.facebook.p036h.AppEventsLoggerUtility.AppEventsLoggerUtility.MOBILE_INSTALL_EVENT;	 Catch:{ JSONException -> 0x00a2 }
        r9 = com.facebook.p004a.AppEventsLogger.m828b(r14);	 Catch:{ JSONException -> 0x00a2 }
        r10 = com.facebook.FacebookSdk.m2580b(r14);	 Catch:{ JSONException -> 0x00a2 }
        r0 = com.facebook.p036h.AppEventsLoggerUtility.m1583a(r8, r0, r9, r10, r14);	 Catch:{ JSONException -> 0x00a2 }
        r8 = "%s/activities";	 Catch:{ Exception -> 0x000f }
        r9 = 1;	 Catch:{ Exception -> 0x000f }
        r9 = new java.lang.Object[r9];	 Catch:{ Exception -> 0x000f }
        r10 = 0;	 Catch:{ Exception -> 0x000f }
        r9[r10] = r15;	 Catch:{ Exception -> 0x000f }
        r8 = java.lang.String.format(r8, r9);	 Catch:{ Exception -> 0x000f }
        r8 = com.facebook.GraphRequest.m2617a(r8, r0);	 Catch:{ Exception -> 0x000f }
        r0 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1));
        if (r0 == 0) goto L_0x00b8;
    L_0x007d:
        if (r5 == 0) goto L_0x00d9;
    L_0x007f:
        r0 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x00ab }
        r0.<init>(r5);	 Catch:{ JSONException -> 0x00ab }
    L_0x0084:
        r2 = r0;
    L_0x0085:
        if (r2 != 0) goto L_0x00ae;
    L_0x0087:
        r0 = "true";	 Catch:{ Exception -> 0x000f }
        r2 = 0;	 Catch:{ Exception -> 0x000f }
        r3 = new com.facebook.r;	 Catch:{ Exception -> 0x000f }
        r4 = 1;	 Catch:{ Exception -> 0x000f }
        r4 = new com.facebook.GraphRequest[r4];	 Catch:{ Exception -> 0x000f }
        r5 = 0;	 Catch:{ Exception -> 0x000f }
        r4[r5] = r8;	 Catch:{ Exception -> 0x000f }
        r3.<init>(r4);	 Catch:{ Exception -> 0x000f }
        r0 = com.facebook.GraphResponse.m2647a(r0, r2, r3);	 Catch:{ Exception -> 0x000f }
        r2 = 0;	 Catch:{ Exception -> 0x000f }
        r0 = r0.get(r2);	 Catch:{ Exception -> 0x000f }
        r0 = (com.facebook.GraphResponse) r0;	 Catch:{ Exception -> 0x000f }
        goto L_0x001e;	 Catch:{ Exception -> 0x000f }
    L_0x00a2:
        r0 = move-exception;	 Catch:{ Exception -> 0x000f }
        r2 = new com.facebook.i;	 Catch:{ Exception -> 0x000f }
        r3 = "An error occurred while publishing install.";	 Catch:{ Exception -> 0x000f }
        r2.<init>(r3, r0);	 Catch:{ Exception -> 0x000f }
        throw r2;	 Catch:{ Exception -> 0x000f }
    L_0x00ab:
        r0 = move-exception;	 Catch:{ Exception -> 0x000f }
        r2 = r1;	 Catch:{ Exception -> 0x000f }
        goto L_0x0085;	 Catch:{ Exception -> 0x000f }
    L_0x00ae:
        r0 = new com.facebook.s;	 Catch:{ Exception -> 0x000f }
        r3 = 0;	 Catch:{ Exception -> 0x000f }
        r4 = 0;	 Catch:{ Exception -> 0x000f }
        r5 = 0;	 Catch:{ Exception -> 0x000f }
        r0.<init>(r3, r4, r5, r2);	 Catch:{ Exception -> 0x000f }
        goto L_0x001e;	 Catch:{ Exception -> 0x000f }
    L_0x00b8:
        r0 = r8.m2642a();	 Catch:{ Exception -> 0x000f }
        r2 = r2.edit();	 Catch:{ Exception -> 0x000f }
        r6 = java.lang.System.currentTimeMillis();	 Catch:{ Exception -> 0x000f }
        r2.putLong(r3, r6);	 Catch:{ Exception -> 0x000f }
        r3 = r0.f2735a;	 Catch:{ Exception -> 0x000f }
        if (r3 == 0) goto L_0x00d4;	 Catch:{ Exception -> 0x000f }
    L_0x00cb:
        r3 = r0.f2735a;	 Catch:{ Exception -> 0x000f }
        r3 = r3.toString();	 Catch:{ Exception -> 0x000f }
        r2.putString(r4, r3);	 Catch:{ Exception -> 0x000f }
    L_0x00d4:
        r2.apply();	 Catch:{ Exception -> 0x000f }
        goto L_0x001e;
    L_0x00d9:
        r0 = r1;
        goto L_0x0084;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.m.b(android.content.Context, java.lang.String):com.facebook.s");
    }

    public static String m2588h() {
        return "4.18.0";
    }

    public static boolean m2580b(Context context) {
        ag.m1541a();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    public static long m2589i() {
        ag.m1541a();
        return f2678i.get();
    }

    public static String m2581c(Context context) {
        String str = null;
        ag.m1541a();
        if (context == null) {
            return str;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return str;
        }
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 64);
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr == null || signatureArr.length == 0) {
                return str;
            }
            try {
                MessageDigest instance = MessageDigest.getInstance("SHA-1");
                instance.update(packageInfo.signatures[0].toByteArray());
                return Base64.encodeToString(instance.digest(), 9);
            } catch (NoSuchAlgorithmException e) {
                return str;
            }
        } catch (NameNotFoundException e2) {
            return str;
        }
    }

    public static String m2590j() {
        ag.m1541a();
        return f2673d;
    }

    public static String m2591k() {
        ag.m1541a();
        return f2674e;
    }

    public static String m2592l() {
        ag.m1541a();
        return f2675f;
    }

    public static int m2593m() {
        ag.m1541a();
        return f2676g;
    }

    public static File m2594n() {
        ag.m1541a();
        LockOnGetVariable lockOnGetVariable = f2681l;
        if (lockOnGetVariable.f1757b != null) {
            try {
                lockOnGetVariable.f1757b.await();
            } catch (InterruptedException e) {
            }
        }
        return (File) lockOnGetVariable.f1756a;
    }

    public static int m2595o() {
        ag.m1541a();
        return f2683n;
    }
}
