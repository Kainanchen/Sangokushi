package com.facebook.p004a.p005a;

import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import com.facebook.FacebookSdk;
import java.util.UUID;

/* renamed from: com.facebook.a.a.c */
final class SessionInfo {
    Long f848a;
    Long f849b;
    int f850c;
    Long f851d;
    SourceApplicationInfo f852e;
    UUID f853f;

    public SessionInfo(Long l, Long l2) {
        this(l, l2, UUID.randomUUID());
    }

    private SessionInfo(Long l, Long l2, UUID uuid) {
        this.f848a = l;
        this.f849b = l2;
        this.f853f = uuid;
    }

    public final void m838a() {
        Editor edit = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.m2586f()).edit();
        edit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", this.f848a.longValue());
        edit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", this.f849b.longValue());
        edit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.f850c);
        edit.putString("com.facebook.appevents.SessionInfo.sessionId", this.f853f.toString());
        edit.apply();
        if (this.f852e != null) {
            SourceApplicationInfo sourceApplicationInfo = this.f852e;
            Editor edit2 = PreferenceManager.getDefaultSharedPreferences(FacebookSdk.m2586f()).edit();
            edit2.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", sourceApplicationInfo.f856a);
            edit2.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", sourceApplicationInfo.f857b);
            edit2.apply();
        }
    }
}
