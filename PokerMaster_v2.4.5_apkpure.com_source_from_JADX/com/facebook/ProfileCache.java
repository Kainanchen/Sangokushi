package com.facebook;

import android.content.SharedPreferences;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.x */
final class ProfileCache {
    final SharedPreferences f2763a;

    ProfileCache() {
        this.f2763a = FacebookSdk.m2586f().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
    }

    final Profile m2665a() {
        String string = this.f2763a.getString("com.facebook.ProfileManager.CachedProfile", null);
        if (string != null) {
            try {
                return new Profile(new JSONObject(string));
            } catch (JSONException e) {
            }
        }
        return null;
    }
}
