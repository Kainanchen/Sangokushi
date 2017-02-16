package com.facebook.p036h;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.p036h.FetchedAppSettings.FetchedAppSettings;
import com.sina.weibo.sdk.component.ShareRequestParam;
import com.sina.weibo.sdk.constant.WBPageConstants.ParamKey;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import com.sina.weibo.sdk.register.mobile.SelectCountryActivity;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.h.o */
public final class FetchedAppSettingsManager {
    private static final String[] f1688a;
    private static Map<String, FetchedAppSettings> f1689b;
    private static AtomicBoolean f1690c;

    /* renamed from: com.facebook.h.o.1 */
    static class FetchedAppSettingsManager implements Runnable {
        final /* synthetic */ Context f1685a;
        final /* synthetic */ String f1686b;
        final /* synthetic */ String f1687c;

        FetchedAppSettingsManager(Context context, String str, String str2) {
            this.f1685a = context;
            this.f1686b = str;
            this.f1687c = str2;
        }

        public final void run() {
            JSONObject jSONObject;
            SharedPreferences sharedPreferences = this.f1685a.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
            String string = sharedPreferences.getString(this.f1686b, null);
            if (!af.m1523a(string)) {
                try {
                    jSONObject = new JSONObject(string);
                } catch (Exception e) {
                    af.m1515a(e);
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    FetchedAppSettingsManager.m1651b(this.f1687c, jSONObject);
                }
            }
            jSONObject = FetchedAppSettingsManager.m1653c(this.f1687c);
            if (jSONObject != null) {
                FetchedAppSettingsManager.m1651b(this.f1687c, jSONObject);
                sharedPreferences.edit().putString(this.f1686b, jSONObject.toString()).apply();
            }
            FetchedAppSettingsManager.f1690c.set(false);
        }
    }

    static {
        f1688a = new String[]{"supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "gdpv4_chrome_custom_tabs_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url"};
        f1689b = new ConcurrentHashMap();
        f1690c = new AtomicBoolean(false);
    }

    public static void m1650a(Context context, String str) {
        boolean compareAndSet = f1690c.compareAndSet(false, true);
        if (!af.m1523a(str) && !f1689b.containsKey(str) && compareAndSet) {
            FacebookSdk.m2583d().execute(new FetchedAppSettingsManager(context, String.format("com.facebook.internal.APP_SETTINGS.%s", new Object[]{str}), str));
        }
    }

    public static FetchedAppSettings m1645a(String str) {
        return str != null ? (FetchedAppSettings) f1689b.get(str) : null;
    }

    public static FetchedAppSettings m1647a(String str, boolean z) {
        if (!z && f1689b.containsKey(str)) {
            return (FetchedAppSettings) f1689b.get(str);
        }
        JSONObject c = FetchedAppSettingsManager.m1653c(str);
        if (c == null) {
            return null;
        }
        return FetchedAppSettingsManager.m1651b(str, c);
    }

    private static FetchedAppSettings m1651b(String str, JSONObject jSONObject) {
        FacebookRequestErrorClassification a;
        JSONArray optJSONArray = jSONObject.optJSONArray("android_sdk_error_categories");
        if (optJSONArray == null) {
            a = FacebookRequestErrorClassification.m1639a();
        } else if (optJSONArray == null) {
            a = null;
        } else {
            String str2 = null;
            String str3 = null;
            String str4 = null;
            Map map = null;
            Map map2 = null;
            Map map3 = null;
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString(SelectCountryActivity.EXTRA_COUNTRY_NAME);
                    if (optString != null) {
                        if (optString.equalsIgnoreCase("other")) {
                            str4 = optJSONObject.optString("recovery_message", null);
                            map3 = FacebookRequestErrorClassification.m1640a(optJSONObject);
                        } else if (optString.equalsIgnoreCase("transient")) {
                            str3 = optJSONObject.optString("recovery_message", null);
                            map2 = FacebookRequestErrorClassification.m1640a(optJSONObject);
                        } else if (optString.equalsIgnoreCase("login_recoverable")) {
                            str2 = optJSONObject.optString("recovery_message", null);
                            map = FacebookRequestErrorClassification.m1640a(optJSONObject);
                        }
                    }
                }
            }
            a = new FacebookRequestErrorClassification(map3, map2, map, str4, str3, str2);
        }
        FetchedAppSettings fetchedAppSettings = new FetchedAppSettings(jSONObject.optBoolean("supports_implicit_sdk_logging", false), jSONObject.optString("gdpv4_nux_content", LetterIndexBar.SEARCH_ICON_LETTER), jSONObject.optBoolean("gdpv4_nux_enabled", false), jSONObject.optBoolean("gdpv4_chrome_custom_tabs_enabled", false), jSONObject.optInt("app_events_session_timeout", 60), ad.m1482a(jSONObject.optLong("seamless_login")), FetchedAppSettingsManager.m1648a(jSONObject.optJSONObject("android_dialog_configs")), (jSONObject.optInt("app_events_feature_bitmask", 0) & 8) != 0, a, jSONObject.optString("smart_login_bookmark_icon_url"), jSONObject.optString("smart_login_menu_icon_url"));
        f1689b.put(str, fetchedAppSettings);
        return fetchedAppSettings;
    }

    private static JSONObject m1653c(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", TextUtils.join(",", f1688a));
        GraphRequest a = GraphRequest.m2616a(str);
        a.f2716g = true;
        a.f2713d = bundle;
        return a.m2642a().f2735a;
    }

    private static Map<String, Map<String, FetchedAppSettings>> m1648a(JSONObject jSONObject) {
        Map hashMap = new HashMap();
        if (jSONObject != null) {
            JSONArray optJSONArray = jSONObject.optJSONArray(ShareRequestParam.RESP_UPLOAD_PIC_PARAM_DATA);
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    FetchedAppSettings fetchedAppSettings;
                    String str;
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    String optString = optJSONObject.optString(SelectCountryActivity.EXTRA_COUNTRY_NAME);
                    if (af.m1523a(optString)) {
                        fetchedAppSettings = null;
                    } else {
                        String[] split = optString.split("\\|");
                        if (split.length != 2) {
                            fetchedAppSettings = null;
                        } else {
                            str = split[0];
                            String str2 = split[1];
                            if (af.m1523a(str) || af.m1523a(str2)) {
                                fetchedAppSettings = null;
                            } else {
                                Uri uri;
                                optString = optJSONObject.optString(ParamKey.URL);
                                if (af.m1523a(optString)) {
                                    uri = null;
                                } else {
                                    uri = Uri.parse(optString);
                                }
                                fetchedAppSettings = new FetchedAppSettings(str, str2, uri, FetchedAppSettings.m1643a(optJSONObject.optJSONArray("versions")));
                            }
                        }
                    }
                    if (fetchedAppSettings != null) {
                        str = fetchedAppSettings.f1670a;
                        Map map = (Map) hashMap.get(str);
                        if (map == null) {
                            map = new HashMap();
                            hashMap.put(str, map);
                        }
                        map.put(fetchedAppSettings.f1671b, fetchedAppSettings);
                    }
                }
            }
        }
        return hashMap;
    }
}
