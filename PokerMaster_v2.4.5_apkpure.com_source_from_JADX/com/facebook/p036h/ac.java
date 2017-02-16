package com.facebook.p036h;

import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import com.sina.weibo.sdk.constant.WBConstants;
import java.util.Collection;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ServerProtocol */
/* renamed from: com.facebook.h.ac */
public final class ac {
    public static final Collection<String> f1549a;
    public static final Collection<String> f1550b;
    private static final String f1551c;

    static {
        f1551c = ac.class.getName();
        f1549a = af.m1503a("service_disabled", "AndroidAuthKillSwitchException");
        f1550b = af.m1503a("access_denied", "OAuthAccessDeniedException");
    }

    public static final String m1478a() {
        return String.format("m.%s", new Object[]{FacebookSdk.m2585e()});
    }

    public static final String m1479b() {
        return String.format("https://graph.%s", new Object[]{FacebookSdk.m2585e()});
    }

    public static final String m1480c() {
        return String.format("https://graph-video.%s", new Object[]{FacebookSdk.m2585e()});
    }

    public static final String m1481d() {
        return "v2.8";
    }

    public static Bundle m1477a(String str, int i, Bundle bundle) {
        String c = FacebookSdk.m2581c(FacebookSdk.m2586f());
        if (af.m1523a(c)) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("android_key_hash", c);
        bundle2.putString("app_id", FacebookSdk.m2590j());
        bundle2.putInt(LogBuilder.KEY_VERSION, i);
        bundle2.putString(WBConstants.AUTH_PARAMS_DISPLAY, "touch");
        Bundle bundle3 = new Bundle();
        bundle3.putString("action_id", str);
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            JSONObject a = BundleJSONConverter.m1608a(bundle3);
            JSONObject a2 = BundleJSONConverter.m1608a(bundle);
            bundle2.putString("bridge_args", a.toString());
            bundle2.putString("method_args", a2.toString());
        } catch (JSONException e) {
            Logger.m1681a(LoggingBehavior.DEVELOPER_ERRORS, 6, f1551c, "Error creating Url -- " + e);
            bundle2 = null;
        }
        return bundle2;
    }
}
