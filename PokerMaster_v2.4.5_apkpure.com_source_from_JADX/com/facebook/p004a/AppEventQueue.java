package com.facebook.p004a;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Log;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.LoggingBehavior;
import com.facebook.p004a.AppEventsLogger.AppEventsLogger;
import com.facebook.p036h.FetchedAppSettings;
import com.facebook.p036h.FetchedAppSettingsManager;
import com.facebook.p036h.Logger;
import com.sina.weibo.sdk.constant.WBConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.facebook.a.e */
class AppEventQueue {
    private static final String f884a;
    private static volatile AppEventCollection f885b;
    private static final ScheduledExecutorService f886c;
    private static ScheduledFuture f887d;
    private static final Runnable f888e;

    /* renamed from: com.facebook.a.e.1 */
    static class AppEventQueue implements Runnable {
        AppEventQueue() {
        }

        public final void run() {
            AppEventQueue.f887d = null;
            if (AppEventsLogger.m823a() != AppEventsLogger.f891b) {
                AppEventQueue.m866b(FlushReason.TIMER);
            }
        }
    }

    /* renamed from: com.facebook.a.e.2 */
    static class AppEventQueue implements Runnable {
        AppEventQueue() {
        }

        public final void run() {
            AppEventStore.m873a(AppEventQueue.f885b);
            AppEventQueue.f885b = new AppEventCollection();
        }
    }

    /* renamed from: com.facebook.a.e.3 */
    static class AppEventQueue implements Runnable {
        final /* synthetic */ FlushReason f875a;

        AppEventQueue(FlushReason flushReason) {
            this.f875a = flushReason;
        }

        public final void run() {
            AppEventQueue.m866b(this.f875a);
        }
    }

    /* renamed from: com.facebook.a.e.4 */
    static class AppEventQueue implements Runnable {
        final /* synthetic */ AccessTokenAppIdPair f876a;
        final /* synthetic */ AppEvent f877b;

        AppEventQueue(AccessTokenAppIdPair accessTokenAppIdPair, AppEvent appEvent) {
            this.f876a = accessTokenAppIdPair;
            this.f877b = appEvent;
        }

        public final void run() {
            AppEventQueue.f885b.m854a(this.f876a, this.f877b);
            if (AppEventsLogger.m823a() != AppEventsLogger.f891b && AppEventQueue.f885b.m856b() > 100) {
                AppEventQueue.m866b(FlushReason.EVENT_THRESHOLD);
            } else if (AppEventQueue.f887d == null) {
                AppEventQueue.f887d = AppEventQueue.f886c.schedule(AppEventQueue.f888e, 15, TimeUnit.SECONDS);
            }
        }
    }

    /* renamed from: com.facebook.a.e.5 */
    static class AppEventQueue implements GraphRequest {
        final /* synthetic */ AccessTokenAppIdPair f878a;
        final /* synthetic */ com.facebook.GraphRequest f879b;
        final /* synthetic */ SessionEventsState f880c;
        final /* synthetic */ FlushStatistics f881d;

        AppEventQueue(AccessTokenAppIdPair accessTokenAppIdPair, com.facebook.GraphRequest graphRequest, SessionEventsState sessionEventsState, FlushStatistics flushStatistics) {
            this.f878a = accessTokenAppIdPair;
            this.f879b = graphRequest;
            this.f880c = sessionEventsState;
            this.f881d = flushStatistics;
        }

        public final void m858a(GraphResponse graphResponse) {
            AppEventQueue.m863a(this.f878a, this.f879b, graphResponse, this.f880c, this.f881d);
        }
    }

    /* renamed from: com.facebook.a.e.6 */
    static class AppEventQueue implements Runnable {
        final /* synthetic */ AccessTokenAppIdPair f882a;
        final /* synthetic */ SessionEventsState f883b;

        AppEventQueue(AccessTokenAppIdPair accessTokenAppIdPair, SessionEventsState sessionEventsState) {
            this.f882a = accessTokenAppIdPair;
            this.f883b = sessionEventsState;
        }

        public final void run() {
            AppEventStore.m872a(this.f882a, this.f883b);
        }
    }

    AppEventQueue() {
    }

    static {
        f884a = AppEventQueue.class.getName();
        f885b = new AppEventCollection();
        f886c = Executors.newSingleThreadScheduledExecutor();
        f888e = new AppEventQueue();
    }

    public static void m861a() {
        f886c.execute(new AppEventQueue());
    }

    public static void m864a(FlushReason flushReason) {
        f886c.execute(new AppEventQueue(flushReason));
    }

    public static void m862a(AccessTokenAppIdPair accessTokenAppIdPair, AppEvent appEvent) {
        f886c.execute(new AppEventQueue(accessTokenAppIdPair, appEvent));
    }

    public static Set<AccessTokenAppIdPair> m865b() {
        return f885b.m853a();
    }

    static void m866b(FlushReason flushReason) {
        f885b.m855a(AppEventStore.m871a());
        try {
            com.facebook.GraphRequest graphRequest;
            FlushStatistics flushStatistics;
            AppEventCollection appEventCollection = f885b;
            FlushStatistics flushStatistics2 = new FlushStatistics();
            boolean b = FacebookSdk.m2580b(FacebookSdk.m2586f());
            List<com.facebook.GraphRequest> arrayList = new ArrayList();
            for (AccessTokenAppIdPair accessTokenAppIdPair : appEventCollection.m853a()) {
                boolean z;
                Object obj;
                SessionEventsState a = appEventCollection.m852a(accessTokenAppIdPair);
                FetchedAppSettings a2 = FetchedAppSettingsManager.m1647a(accessTokenAppIdPair.f859b, false);
                com.facebook.GraphRequest a3 = com.facebook.GraphRequest.m2617a(String.format("%s/activities", new Object[]{r3}), null);
                Bundle bundle = a3.f2713d;
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putString(WBConstants.AUTH_ACCESS_TOKEN, accessTokenAppIdPair.f858a);
                String d = AppEventsLogger.m831d();
                if (d != null) {
                    bundle.putString("device_token", d);
                }
                a3.f2713d = bundle;
                if (a2 != null) {
                    z = a2.f1674a;
                } else {
                    z = false;
                }
                int a4 = a.m879a(a3, FacebookSdk.m2586f(), z, b);
                if (a4 == 0) {
                    obj = null;
                } else {
                    flushStatistics2.f905a = a4 + flushStatistics2.f905a;
                    a3.m2643a(new AppEventQueue(accessTokenAppIdPair, a3, a, flushStatistics2));
                    graphRequest = a3;
                }
                if (obj != null) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.size() > 0) {
                Logger.m1683a(LoggingBehavior.APP_EVENTS, f884a, "Flushing %d events due to %s.", Integer.valueOf(flushStatistics2.f905a), flushReason.toString());
                for (com.facebook.GraphRequest graphRequest2 : arrayList) {
                    graphRequest2.m2642a();
                }
                flushStatistics = flushStatistics2;
            } else {
                flushStatistics = null;
            }
            if (flushStatistics != null) {
                Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", flushStatistics.f905a);
                intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", flushStatistics.f906b);
                LocalBroadcastManager.getInstance(FacebookSdk.m2586f()).sendBroadcast(intent);
            }
        } catch (Throwable e) {
            Log.w(f884a, "Caught unexpected exception while flushing app events: ", e);
        }
    }

    static /* synthetic */ void m863a(AccessTokenAppIdPair accessTokenAppIdPair, com.facebook.GraphRequest graphRequest, GraphResponse graphResponse, SessionEventsState sessionEventsState, FlushStatistics flushStatistics) {
        FlushResult flushResult;
        FacebookRequestError facebookRequestError = graphResponse.f2736b;
        String str = "Success";
        FlushResult flushResult2 = FlushResult.SUCCESS;
        String str2;
        if (facebookRequestError == null) {
            str2 = str;
            flushResult = flushResult2;
        } else if (facebookRequestError.f2652c == -1) {
            Object obj = "Failed: No Connectivity";
            flushResult = FlushResult.NO_CONNECTIVITY;
        } else {
            str2 = String.format("Failed:\n  Response: %s\n  Error %s", new Object[]{graphResponse.toString(), facebookRequestError.toString()});
            flushResult = FlushResult.SERVER_ERROR;
        }
        if (FacebookSdk.m2577a(LoggingBehavior.APP_EVENTS)) {
            String jSONArray;
            try {
                jSONArray = new JSONArray((String) graphRequest.f2715f).toString(2);
            } catch (JSONException e) {
                jSONArray = "<Can't encode events for debug logging>";
            }
            Logger.m1683a(LoggingBehavior.APP_EVENTS, f884a, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", graphRequest.f2712c.toString(), obj, jSONArray);
        }
        sessionEventsState.m881a(facebookRequestError != null);
        if (flushResult == FlushResult.NO_CONNECTIVITY) {
            FacebookSdk.m2583d().execute(new AppEventQueue(accessTokenAppIdPair, sessionEventsState));
        }
        if (flushResult != FlushResult.SUCCESS && flushStatistics.f906b != FlushResult.NO_CONNECTIVITY) {
            flushStatistics.f906b = flushResult;
        }
    }
}
