package com.facebook;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import com.facebook.p036h.af;
import com.facebook.p036h.ag;
import org.json.JSONObject;

/* renamed from: com.facebook.y */
final class ProfileManager {
    private static volatile ProfileManager f2764c;
    final ProfileCache f2765a;
    Profile f2766b;
    private final LocalBroadcastManager f2767d;

    private ProfileManager(LocalBroadcastManager localBroadcastManager, ProfileCache profileCache) {
        ag.m1544a((Object) localBroadcastManager, "localBroadcastManager");
        ag.m1544a((Object) profileCache, "profileCache");
        this.f2767d = localBroadcastManager;
        this.f2765a = profileCache;
    }

    static ProfileManager m2666a() {
        if (f2764c == null) {
            synchronized (ProfileManager.class) {
                if (f2764c == null) {
                    f2764c = new ProfileManager(LocalBroadcastManager.getInstance(FacebookSdk.m2586f()), new ProfileCache());
                }
            }
        }
        return f2764c;
    }

    final void m2667a(Profile profile, boolean z) {
        Object obj = this.f2766b;
        this.f2766b = profile;
        if (z) {
            if (profile != null) {
                ProfileCache profileCache = this.f2765a;
                ag.m1544a((Object) profile, "profile");
                JSONObject c = profile.m2664c();
                if (c != null) {
                    profileCache.f2763a.edit().putString("com.facebook.ProfileManager.CachedProfile", c.toString()).apply();
                }
            } else {
                this.f2765a.f2763a.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
            }
        }
        if (!af.m1522a(obj, (Object) profile)) {
            Intent intent = new Intent("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
            intent.putExtra("com.facebook.sdk.EXTRA_OLD_PROFILE", obj);
            intent.putExtra("com.facebook.sdk.EXTRA_NEW_PROFILE", profile);
            this.f2767d.sendBroadcast(intent);
        }
    }
}
