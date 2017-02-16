package com.facebook.p004a;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import com.facebook.p004a.p005a.ActivityLifecycleTracker;
import com.facebook.p036h.FetchedAppSettingsManager;
import com.facebook.p036h.Logger;
import com.facebook.p036h.af;
import com.facebook.p036h.ag;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* renamed from: com.facebook.a.g */
public class AppEventsLogger {
    private static final String f839a;
    private static ScheduledThreadPoolExecutor f840d;
    private static int f841e;
    private static Object f842f;
    private static String f843g;
    private static boolean f844h;
    private static String f845i;
    private final String f846b;
    private final AccessTokenAppIdPair f847c;

    /* renamed from: com.facebook.a.g.1 */
    static class AppEventsLogger implements Runnable {
        AppEventsLogger() {
        }

        public final void run() {
            Set<String> hashSet = new HashSet();
            for (AccessTokenAppIdPair accessTokenAppIdPair : AppEventQueue.m865b()) {
                hashSet.add(accessTokenAppIdPair.f859b);
            }
            for (String a : hashSet) {
                FetchedAppSettingsManager.m1647a(a, true);
            }
        }
    }

    /* renamed from: com.facebook.a.g.a */
    public enum AppEventsLogger {
        ;

        static {
            f890a = 1;
            f891b = 2;
            f892c = new int[]{f890a, f891b};
        }
    }

    static {
        f839a = AppEventsLogger.class.getCanonicalName();
        f841e = AppEventsLogger.f890a;
        f842f = new Object();
    }

    public static AppEventsLogger m824a(Context context) {
        return new AppEventsLogger(context, null);
    }

    public static AppEventsLogger m825a(Context context, String str) {
        return new AppEventsLogger(context, str);
    }

    public static int m823a() {
        int i;
        synchronized (f842f) {
            i = f841e;
        }
        return i;
    }

    public final void m836a(String str, Bundle bundle) {
        m827a(str, null, bundle, false, ActivityLifecycleTracker.m810a());
    }

    public final void m835a(String str, double d, Bundle bundle) {
        m827a(str, Double.valueOf(d), bundle, false, ActivityLifecycleTracker.m810a());
    }

    public static void m829b() {
        AppEventQueue.m864a(FlushReason.EXPLICIT);
    }

    public static void m830c() {
        AppEventQueue.m861a();
    }

    static String m831d() {
        String str;
        synchronized (f842f) {
            str = f845i;
        }
        return str;
    }

    public static String m832e() {
        return AnalyticsUserIDStore.m844b();
    }

    public final void m837b(String str, Bundle bundle) {
        m827a(str, null, bundle, true, ActivityLifecycleTracker.m810a());
    }

    private AppEventsLogger(Context context, String str) {
        this(af.m1533c(context), str);
    }

    public AppEventsLogger(String str, String str2) {
        ag.m1541a();
        this.f846b = str;
        AccessToken a = AccessToken.m883a();
        if (a == null || !(str2 == null || str2.equals(a.f925g))) {
            if (str2 == null) {
                str2 = af.m1496a(FacebookSdk.m2586f());
            }
            this.f847c = new AccessTokenAppIdPair(null, str2);
        } else {
            this.f847c = new AccessTokenAppIdPair(a);
        }
        AppEventsLogger.m834g();
    }

    private static void m834g() {
        synchronized (f842f) {
            if (f840d != null) {
                return;
            }
            f840d = new ScheduledThreadPoolExecutor(1);
            f840d.scheduleAtFixedRate(new AppEventsLogger(), 0, 86400, TimeUnit.SECONDS);
        }
    }

    private void m827a(String str, Double d, Bundle bundle, boolean z, @Nullable UUID uuid) {
        try {
            AppEvent appEvent = new AppEvent(this.f846b, str, d, bundle, z, uuid);
            FacebookSdk.m2586f();
            AppEventQueue.m862a(this.f847c, appEvent);
            if (!appEvent.f871b && !f844h) {
                if (appEvent.f872c == "fb_mobile_activate_app") {
                    f844h = true;
                } else {
                    Logger.m1682a(LoggingBehavior.APP_EVENTS, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
                }
            }
        } catch (JSONException e) {
            Logger.m1683a(LoggingBehavior.APP_EVENTS, "AppEvents", "JSON encoding for app event failed: '%s'", e.toString());
        } catch (FacebookException e2) {
            Logger.m1683a(LoggingBehavior.APP_EVENTS, "AppEvents", "Invalid app event: %s", e2.toString());
        }
    }

    static Executor m833f() {
        if (f840d == null) {
            AppEventsLogger.m834g();
        }
        return f840d;
    }

    public static String m828b(Context context) {
        if (f843g == null) {
            synchronized (f842f) {
                if (f843g == null) {
                    String string = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null);
                    f843g = string;
                    if (string == null) {
                        f843g = "XZ" + UUID.randomUUID().toString();
                        context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", f843g).apply();
                    }
                }
            }
        }
        return f843g;
    }

    public static void m826a(Application application) {
        if (FacebookSdk.m2576a()) {
            AnalyticsUserIDStore.m843a();
            String j = FacebookSdk.m2590j();
            FacebookSdk.m2575a(application, j);
            ActivityLifecycleTracker.m813a(application, j);
            return;
        }
        throw new FacebookException("The Facebook sdk must be initialized before calling activateApp");
    }
}
