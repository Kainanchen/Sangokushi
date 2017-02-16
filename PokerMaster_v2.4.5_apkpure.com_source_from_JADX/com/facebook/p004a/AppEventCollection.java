package com.facebook.p004a;

import android.content.Context;
import com.facebook.FacebookSdk;
import com.facebook.p036h.AttributionIdentifiers;
import java.util.HashMap;
import java.util.Set;

/* renamed from: com.facebook.a.d */
final class AppEventCollection {
    private final HashMap<AccessTokenAppIdPair, SessionEventsState> f874a;

    public AppEventCollection() {
        this.f874a = new HashMap();
    }

    public final synchronized void m855a(PersistedEvents persistedEvents) {
        if (persistedEvents != null) {
            for (AccessTokenAppIdPair accessTokenAppIdPair : persistedEvents.f908a.keySet()) {
                SessionEventsState b = m851b(accessTokenAppIdPair);
                for (AppEvent a : persistedEvents.m875a(accessTokenAppIdPair)) {
                    b.m880a(a);
                }
            }
        }
    }

    public final synchronized void m854a(AccessTokenAppIdPair accessTokenAppIdPair, AppEvent appEvent) {
        m851b(accessTokenAppIdPair).m880a(appEvent);
    }

    public final synchronized Set<AccessTokenAppIdPair> m853a() {
        return this.f874a.keySet();
    }

    public final synchronized SessionEventsState m852a(AccessTokenAppIdPair accessTokenAppIdPair) {
        return (SessionEventsState) this.f874a.get(accessTokenAppIdPair);
    }

    public final synchronized int m856b() {
        int i;
        i = 0;
        for (SessionEventsState a : this.f874a.values()) {
            i = a.m878a() + i;
        }
        return i;
    }

    private synchronized SessionEventsState m851b(AccessTokenAppIdPair accessTokenAppIdPair) {
        SessionEventsState sessionEventsState;
        sessionEventsState = (SessionEventsState) this.f874a.get(accessTokenAppIdPair);
        if (sessionEventsState == null) {
            Context f = FacebookSdk.m2586f();
            sessionEventsState = new SessionEventsState(AttributionIdentifiers.m1586a(f), AppEventsLogger.m828b(f));
        }
        this.f874a.put(accessTokenAppIdPair, sessionEventsState);
        return sessionEventsState;
    }
}
