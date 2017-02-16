package com.facebook.p004a.p005a;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v4.view.PointerIconCompat;
import android.util.Log;
import bolts.AppLinks;
import com.facebook.FacebookSdk;
import com.facebook.p004a.AppEventsLogger;
import com.facebook.p036h.FetchedAppSettings;
import com.facebook.p036h.FetchedAppSettingsManager;
import com.facebook.p036h.af;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.a.a.a */
public class ActivityLifecycleTracker {
    private static final String f831a;
    private static final ScheduledExecutorService f832b;
    private static volatile ScheduledFuture f833c;
    private static AtomicInteger f834d;
    private static volatile SessionInfo f835e;
    private static AtomicBoolean f836f;
    private static String f837g;
    private static long f838h;

    /* renamed from: com.facebook.a.a.a.1 */
    static class ActivityLifecycleTracker implements ActivityLifecycleCallbacks {
        ActivityLifecycleTracker() {
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            ActivityLifecycleTracker.m812a(activity);
        }

        public final void onActivityStarted(Activity activity) {
        }

        public final void onActivityResumed(Activity activity) {
            ActivityLifecycleTracker.m815b(activity);
        }

        public final void onActivityPaused(Activity activity) {
            ActivityLifecycleTracker.m817c(activity);
        }

        public final void onActivityStopped(Activity activity) {
            AppEventsLogger.m830c();
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public final void onActivityDestroyed(Activity activity) {
        }
    }

    /* renamed from: com.facebook.a.a.a.2 */
    static class ActivityLifecycleTracker implements Runnable {
        final /* synthetic */ Activity f823a;
        final /* synthetic */ long f824b;

        ActivityLifecycleTracker(Activity activity, long j) {
            this.f823a = activity;
            this.f824b = j;
        }

        public final void run() {
            SourceApplicationInfo sourceApplicationInfo = null;
            if (ActivityLifecycleTracker.f835e == null) {
                SessionInfo sessionInfo;
                this.f823a.getApplicationContext();
                String c = af.m1533c(this.f823a);
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.m2586f());
                long j = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0);
                long j2 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0);
                String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", null);
                if (j == 0 || j2 == 0 || string == null) {
                    sessionInfo = null;
                } else {
                    SourceApplicationInfo sourceApplicationInfo2;
                    SessionInfo sessionInfo2 = new SessionInfo(Long.valueOf(j), Long.valueOf(j2));
                    sessionInfo2.f850c = defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
                    defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.m2586f());
                    if (defaultSharedPreferences.contains("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage")) {
                        sourceApplicationInfo2 = new SourceApplicationInfo(defaultSharedPreferences.getString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", null), defaultSharedPreferences.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false));
                    } else {
                        sourceApplicationInfo2 = null;
                    }
                    sessionInfo2.f852e = sourceApplicationInfo2;
                    sessionInfo2.f851d = Long.valueOf(System.currentTimeMillis());
                    sessionInfo2.f853f = UUID.fromString(string);
                    sessionInfo = sessionInfo2;
                }
                if (sessionInfo != null) {
                    SessionLogger.m841a(c, sessionInfo, ActivityLifecycleTracker.f837g);
                }
                ActivityLifecycleTracker.f835e = new SessionInfo(Long.valueOf(this.f824b), null);
                Activity activity = this.f823a;
                ComponentName callingActivity = activity.getCallingActivity();
                if (callingActivity != null) {
                    String packageName = callingActivity.getPackageName();
                    if (!packageName.equals(activity.getPackageName())) {
                        boolean z;
                        Intent intent = activity.getIntent();
                        if (!(intent == null || intent.getBooleanExtra("_fbSourceApplicationHasBeenSet", false))) {
                            intent.putExtra("_fbSourceApplicationHasBeenSet", true);
                            Bundle appLinkData = AppLinks.getAppLinkData(intent);
                            if (appLinkData != null) {
                                appLinkData = appLinkData.getBundle("referer_app_link");
                                if (appLinkData != null) {
                                    packageName = appLinkData.getString("package");
                                    z = true;
                                } else {
                                    z = true;
                                }
                                intent.putExtra("_fbSourceApplicationHasBeenSet", true);
                                sourceApplicationInfo = new SourceApplicationInfo(z, (byte) 0);
                            }
                        }
                        z = false;
                        intent.putExtra("_fbSourceApplicationHasBeenSet", true);
                        sourceApplicationInfo = new SourceApplicationInfo(z, (byte) 0);
                    }
                }
                ActivityLifecycleTracker.f835e.f852e = sourceApplicationInfo;
                SessionLogger.m842a(c, sourceApplicationInfo, ActivityLifecycleTracker.f837g);
            }
        }
    }

    /* renamed from: com.facebook.a.a.a.3 */
    static class ActivityLifecycleTracker implements Runnable {
        final /* synthetic */ Activity f825a;
        final /* synthetic */ long f826b;

        ActivityLifecycleTracker(Activity activity, long j) {
            this.f825a = activity;
            this.f826b = j;
        }

        public final void run() {
            this.f825a.getApplicationContext();
            String c = af.m1533c(this.f825a);
            if (ActivityLifecycleTracker.f835e == null) {
                ActivityLifecycleTracker.f835e = new SessionInfo(Long.valueOf(this.f826b), null);
                SessionLogger.m842a(c, null, ActivityLifecycleTracker.f837g);
            } else if (ActivityLifecycleTracker.f835e.f849b != null) {
                long longValue = this.f826b - ActivityLifecycleTracker.f835e.f849b.longValue();
                if (longValue > ((long) (ActivityLifecycleTracker.m818d() * PointerIconCompat.TYPE_DEFAULT))) {
                    SessionLogger.m841a(c, ActivityLifecycleTracker.f835e, ActivityLifecycleTracker.f837g);
                    SessionLogger.m842a(c, null, ActivityLifecycleTracker.f837g);
                    ActivityLifecycleTracker.f835e = new SessionInfo(Long.valueOf(this.f826b), null);
                } else if (longValue > 1000) {
                    SessionInfo b = ActivityLifecycleTracker.f835e;
                    b.f850c++;
                }
            }
            ActivityLifecycleTracker.f835e.f849b = Long.valueOf(this.f826b);
            ActivityLifecycleTracker.f835e.m838a();
        }
    }

    /* renamed from: com.facebook.a.a.a.4 */
    static class ActivityLifecycleTracker implements Runnable {
        final /* synthetic */ long f828a;
        final /* synthetic */ Context f829b;
        final /* synthetic */ String f830c;

        /* renamed from: com.facebook.a.a.a.4.1 */
        class ActivityLifecycleTracker implements Runnable {
            final /* synthetic */ ActivityLifecycleTracker f827a;

            ActivityLifecycleTracker(ActivityLifecycleTracker activityLifecycleTracker) {
                this.f827a = activityLifecycleTracker;
            }

            public final void run() {
                if (ActivityLifecycleTracker.f834d.get() <= 0) {
                    SessionLogger.m841a(this.f827a.f830c, ActivityLifecycleTracker.f835e, ActivityLifecycleTracker.f837g);
                    Editor edit = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.m2586f()).edit();
                    edit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
                    edit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
                    edit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
                    edit.remove("com.facebook.appevents.SessionInfo.sessionId");
                    edit.apply();
                    edit = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.m2586f()).edit();
                    edit.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
                    edit.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
                    edit.apply();
                    ActivityLifecycleTracker.f835e = null;
                }
                ActivityLifecycleTracker.f833c = null;
            }
        }

        ActivityLifecycleTracker(long j, Context context, String str) {
            this.f828a = j;
            this.f829b = context;
            this.f830c = str;
        }

        public final void run() {
            if (ActivityLifecycleTracker.f835e == null) {
                ActivityLifecycleTracker.f835e = new SessionInfo(Long.valueOf(this.f828a), null);
            }
            ActivityLifecycleTracker.f835e.f849b = Long.valueOf(this.f828a);
            if (ActivityLifecycleTracker.f834d.get() <= 0) {
                ActivityLifecycleTracker.f833c = ActivityLifecycleTracker.f832b.schedule(new ActivityLifecycleTracker(this), (long) ActivityLifecycleTracker.m818d(), TimeUnit.SECONDS);
            }
            long g = ActivityLifecycleTracker.f838h;
            g = g > 0 ? (this.f828a - g) / 1000 : 0;
            Context context = this.f829b;
            String c = ActivityLifecycleTracker.f837g;
            CharSequence charSequence = this.f830c;
            AppEventsLogger a = AppEventsLogger.m824a(context);
            if (FetchedAppSettingsManager.m1647a(c, false).f1678e && g > 0) {
                Bundle bundle = new Bundle(1);
                bundle.putCharSequence("fb_aa_time_spent_view_name", charSequence);
                a.m835a("fb_aa_time_spent_on_view", (double) g, bundle);
            }
            ActivityLifecycleTracker.f835e.m838a();
        }
    }

    static {
        f831a = ActivityLifecycleTracker.class.getCanonicalName();
        f832b = Executors.newSingleThreadScheduledExecutor();
        f834d = new AtomicInteger(0);
        f836f = new AtomicBoolean(false);
    }

    public static void m813a(Application application, String str) {
        if (f836f.compareAndSet(false, true)) {
            f837g = str;
            application.registerActivityLifecycleCallbacks(new ActivityLifecycleTracker());
        }
    }

    public static UUID m810a() {
        if (f835e != null) {
            return f835e.f853f;
        }
        return null;
    }

    public static void m812a(Activity activity) {
        f832b.execute(new ActivityLifecycleTracker(activity, System.currentTimeMillis()));
    }

    public static void m815b(Activity activity) {
        f834d.incrementAndGet();
        ActivityLifecycleTracker.m822h();
        long currentTimeMillis = System.currentTimeMillis();
        f838h = currentTimeMillis;
        f832b.execute(new ActivityLifecycleTracker(activity, currentTimeMillis));
    }

    private static void m822h() {
        if (f833c != null) {
            f833c.cancel(false);
        }
        f833c = null;
    }

    static /* synthetic */ void m817c(Activity activity) {
        if (f834d.decrementAndGet() < 0) {
            f834d.set(0);
            Log.w(f831a, "Unexpected activity pause without a matching activity resume. Logging data may be incorrect. Make sure you call activateApp from your Application's onCreate method");
        }
        ActivityLifecycleTracker.m822h();
        f832b.execute(new ActivityLifecycleTracker(System.currentTimeMillis(), activity.getApplicationContext(), af.m1533c((Context) activity)));
    }

    static /* synthetic */ int m818d() {
        FetchedAppSettings a = FetchedAppSettingsManager.m1645a(FacebookSdk.m2590j());
        if (a == null) {
            return 60;
        }
        return a.f1676c;
    }
}
