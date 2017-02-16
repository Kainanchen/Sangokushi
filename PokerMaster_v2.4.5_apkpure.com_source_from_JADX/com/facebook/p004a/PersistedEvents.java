package com.facebook.p004a;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.facebook.a.k */
final class PersistedEvents implements Serializable {
    HashMap<AccessTokenAppIdPair, List<AppEvent>> f908a;

    /* renamed from: com.facebook.a.k.a */
    static class PersistedEvents implements Serializable {
        private final HashMap<AccessTokenAppIdPair, List<AppEvent>> f907a;

        private PersistedEvents(HashMap<AccessTokenAppIdPair, List<AppEvent>> hashMap) {
            this.f907a = hashMap;
        }

        private Object readResolve() {
            return new PersistedEvents(this.f907a);
        }
    }

    public PersistedEvents() {
        this.f908a = new HashMap();
    }

    public PersistedEvents(HashMap<AccessTokenAppIdPair, List<AppEvent>> hashMap) {
        this.f908a = new HashMap();
        this.f908a.putAll(hashMap);
    }

    public final List<AppEvent> m875a(AccessTokenAppIdPair accessTokenAppIdPair) {
        return (List) this.f908a.get(accessTokenAppIdPair);
    }

    public final void m876a(AccessTokenAppIdPair accessTokenAppIdPair, List<AppEvent> list) {
        if (this.f908a.containsKey(accessTokenAppIdPair)) {
            ((List) this.f908a.get(accessTokenAppIdPair)).addAll(list);
        } else {
            this.f908a.put(accessTokenAppIdPair, list);
        }
    }

    private Object writeReplace() {
        return new PersistedEvents((byte) 0);
    }
}
