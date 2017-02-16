package com.facebook.p036h;

import android.content.Context;
import com.facebook.LoggingBehavior;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.facebook.h.b */
public final class AppEventsLoggerUtility {
    private static final Map<AppEventsLoggerUtility, String> f1622a;

    /* renamed from: com.facebook.h.b.1 */
    static class AppEventsLoggerUtility extends HashMap<AppEventsLoggerUtility, String> {
        AppEventsLoggerUtility() {
            put(AppEventsLoggerUtility.MOBILE_INSTALL_EVENT, "MOBILE_APP_INSTALL");
            put(AppEventsLoggerUtility.CUSTOM_APP_EVENTS, "CUSTOM_APP_EVENTS");
        }
    }

    /* renamed from: com.facebook.h.b.a */
    public enum AppEventsLoggerUtility {
        MOBILE_INSTALL_EVENT,
        CUSTOM_APP_EVENTS
    }

    static {
        f1622a = new AppEventsLoggerUtility();
    }

    public static JSONObject m1583a(AppEventsLoggerUtility appEventsLoggerUtility, AttributionIdentifiers attributionIdentifiers, String str, boolean z, Context context) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(NotificationCompatApi24.CATEGORY_EVENT, f1622a.get(appEventsLoggerUtility));
        af.m1519a(jSONObject, attributionIdentifiers, str, z);
        try {
            af.m1518a(jSONObject, context);
        } catch (Exception e) {
            Logger.m1683a(LoggingBehavior.APP_EVENTS, "AppEvents", "Fetching extended device info parameters failed: '%s'", e.toString());
        }
        jSONObject.put("application_package_name", context.getPackageName());
        return jSONObject;
    }
}
