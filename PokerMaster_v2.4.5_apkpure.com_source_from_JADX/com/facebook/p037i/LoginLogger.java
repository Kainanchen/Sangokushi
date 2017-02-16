package com.facebook.p037i;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import com.facebook.p004a.AppEventsLogger;
import com.facebook.p037i.LoginClient.LoginClient.LoginClient;
import com.sina.weibo.sdk.register.mobile.LetterIndexBar;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.i.l */
final class LoginLogger {
    final AppEventsLogger f1874a;
    String f1875b;
    String f1876c;

    LoginLogger(Context context, String str) {
        this.f1875b = str;
        this.f1874a = AppEventsLogger.m825a(context, str);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                PackageInfo packageInfo = packageManager.getPackageInfo("com.facebook.katana", 0);
                if (packageInfo != null) {
                    this.f1876c = packageInfo.versionName;
                }
            }
        } catch (NameNotFoundException e) {
        }
    }

    static Bundle m1832a(String str) {
        Bundle bundle = new Bundle();
        bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
        bundle.putString("0_auth_logger_id", str);
        bundle.putString("3_method", LetterIndexBar.SEARCH_ICON_LETTER);
        bundle.putString("2_result", LetterIndexBar.SEARCH_ICON_LETTER);
        bundle.putString("5_error_message", LetterIndexBar.SEARCH_ICON_LETTER);
        bundle.putString("4_error_code", LetterIndexBar.SEARCH_ICON_LETTER);
        bundle.putString("6_extras", LetterIndexBar.SEARCH_ICON_LETTER);
        return bundle;
    }

    public final void m1834a(String str, Map<String, String> map, LoginClient loginClient, Map<String, String> map2, Exception exception) {
        Bundle a = LoginLogger.m1832a(str);
        if (loginClient != null) {
            a.putString("2_result", loginClient.f1852d);
        }
        if (!(exception == null || exception.getMessage() == null)) {
            a.putString("5_error_message", exception.getMessage());
        }
        JSONObject jSONObject = null;
        if (!map.isEmpty()) {
            jSONObject = new JSONObject(map);
        }
        if (map2 != null) {
            JSONObject jSONObject2;
            if (jSONObject == null) {
                jSONObject2 = new JSONObject();
            } else {
                jSONObject2 = jSONObject;
            }
            try {
                for (Entry entry : map2.entrySet()) {
                    jSONObject2.put((String) entry.getKey(), entry.getValue());
                }
                jSONObject = jSONObject2;
            } catch (JSONException e) {
                jSONObject = jSONObject2;
            }
        }
        if (jSONObject != null) {
            a.putString("6_extras", jSONObject.toString());
        }
        this.f1874a.m837b("fb_mobile_login_complete", a);
    }

    public final void m1833a(String str, String str2, String str3) {
        Bundle a = LoginLogger.m1832a(LetterIndexBar.SEARCH_ICON_LETTER);
        a.putString("2_result", LoginClient.ERROR.f1852d);
        a.putString("5_error_message", str2);
        a.putString("3_method", str3);
        this.f1874a.m837b(str, a);
    }
}
