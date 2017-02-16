package com.facebook;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.facebook.p036h.ag;
import com.sina.weibo.sdk.constant.WBConstants;
import com.tencent.android.tpush.common.Constants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.b */
final class AccessTokenCache {
    final SharedPreferences f947a;
    private final AccessTokenCache f948b;
    private LegacyTokenHelper f949c;

    /* renamed from: com.facebook.b.a */
    static class AccessTokenCache {
        AccessTokenCache() {
        }
    }

    private AccessTokenCache(SharedPreferences sharedPreferences, AccessTokenCache accessTokenCache) {
        this.f947a = sharedPreferences;
        this.f948b = accessTokenCache;
    }

    public AccessTokenCache() {
        this(FacebookSdk.m2586f().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0), new AccessTokenCache());
    }

    public final AccessToken m900a() {
        AccessToken accessToken = null;
        if (this.f947a.contains("com.facebook.AccessTokenManager.CachedAccessToken")) {
            return m899c();
        }
        if (!FacebookSdk.m2582c()) {
            return null;
        }
        Bundle a = m902b().m2657a();
        if (a != null && LegacyTokenHelper.m2653a(a)) {
            accessToken = AccessToken.m884a(a);
        }
        if (accessToken == null) {
            return accessToken;
        }
        m901a(accessToken);
        m902b().m2658b();
        return accessToken;
    }

    public final void m901a(AccessToken accessToken) {
        ag.m1544a((Object) accessToken, "accessToken");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(LogBuilder.KEY_VERSION, 1);
            jSONObject.put(Constants.FLAG_TOKEN, accessToken.f922d);
            jSONObject.put("expires_at", accessToken.f919a.getTime());
            jSONObject.put("permissions", new JSONArray(accessToken.f920b));
            jSONObject.put("declined_permissions", new JSONArray(accessToken.f921c));
            jSONObject.put("last_refresh", accessToken.f924f.getTime());
            jSONObject.put(WBConstants.GAME_PARAMS_SOURCE, accessToken.f923e.name());
            jSONObject.put("application_id", accessToken.f925g);
            jSONObject.put("user_id", accessToken.f926h);
            this.f947a.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", jSONObject.toString()).apply();
        } catch (JSONException e) {
        }
    }

    private AccessToken m899c() {
        AccessToken accessToken = null;
        String string = this.f947a.getString("com.facebook.AccessTokenManager.CachedAccessToken", accessToken);
        if (string != null) {
            try {
                accessToken = AccessToken.m885a(new JSONObject(string));
            } catch (JSONException e) {
            }
        }
        return accessToken;
    }

    final LegacyTokenHelper m902b() {
        if (this.f949c == null) {
            synchronized (this) {
                if (this.f949c == null) {
                    this.f949c = new LegacyTokenHelper(FacebookSdk.m2586f());
                }
            }
        }
        return this.f949c;
    }
}
