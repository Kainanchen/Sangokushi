package com.facebook.p004a.p005a;

import android.os.Bundle;
import com.facebook.LoggingBehavior;
import com.facebook.p004a.AppEventsLogger;
import com.facebook.p036h.Logger;
import java.util.Locale;

/* renamed from: com.facebook.a.a.d */
class SessionLogger {
    private static final String f854a;
    private static final long[] f855b;

    SessionLogger() {
    }

    static {
        f854a = SessionLogger.class.getCanonicalName();
        f855b = new long[]{300000, 900000, 1800000, 3600000, 21600000, 43200000, LogBuilder.MAX_INTERVAL, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};
    }

    public static void m842a(String str, SourceApplicationInfo sourceApplicationInfo, String str2) {
        String sourceApplicationInfo2 = sourceApplicationInfo != null ? sourceApplicationInfo.toString() : "Unclassified";
        Bundle bundle = new Bundle();
        bundle.putString("fb_mobile_launch_source", sourceApplicationInfo2);
        new InternalAppEventsLogger(str, str2).m836a("fb_mobile_activate_app", bundle);
        if (AppEventsLogger.m823a() != AppEventsLogger.AppEventsLogger.f891b) {
            AppEventsLogger.m829b();
        }
    }

    public static void m841a(String str, SessionInfo sessionInfo, String str2) {
        long j;
        long j2;
        if (sessionInfo.f851d == null) {
            j = 0;
        } else {
            j = sessionInfo.f851d.longValue();
        }
        Long valueOf = Long.valueOf(j - sessionInfo.f849b.longValue());
        if (valueOf.longValue() < 0) {
            valueOf = Long.valueOf(0);
            SessionLogger.m840a();
        }
        if (sessionInfo.f848a == null || sessionInfo.f849b == null) {
            j2 = 0;
        } else {
            j2 = sessionInfo.f849b.longValue() - sessionInfo.f848a.longValue();
        }
        Long valueOf2 = Long.valueOf(j2);
        if (valueOf2.longValue() < 0) {
            SessionLogger.m840a();
            valueOf2 = Long.valueOf(0);
        }
        Bundle bundle = new Bundle();
        bundle.putInt("fb_mobile_app_interruptions", sessionInfo.f850c);
        bundle.putString("fb_mobile_time_between_sessions", String.format(Locale.ROOT, "session_quanta_%d", new Object[]{Integer.valueOf(SessionLogger.m839a(valueOf.longValue()))}));
        SourceApplicationInfo sourceApplicationInfo = sessionInfo.f852e;
        bundle.putString("fb_mobile_launch_source", sourceApplicationInfo != null ? sourceApplicationInfo.toString() : "Unclassified");
        bundle.putLong("_logTime", sessionInfo.f849b.longValue() / 1000);
        new InternalAppEventsLogger(str, str2).m835a("fb_mobile_deactivate_app", (double) (valueOf2.longValue() / 1000), bundle);
    }

    private static void m840a() {
        Logger.m1682a(LoggingBehavior.APP_EVENTS, f854a, "Clock skew detected");
    }

    private static int m839a(long j) {
        int i = 0;
        while (i < f855b.length && f855b[i] < j) {
            i++;
        }
        return i;
    }
}
