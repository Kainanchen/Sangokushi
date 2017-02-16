package com.facebook.p007c.p010b;

import com.facebook.p007c.p008a.CacheKey;
import java.io.IOException;

/* renamed from: com.facebook.c.b.j */
public final class SettableCacheEvent {
    private static final Object f1083h;
    private static SettableCacheEvent f1084i;
    private static int f1085j;
    CacheKey f1086a;
    String f1087b;
    long f1088c;
    long f1089d;
    long f1090e;
    IOException f1091f;
    int f1092g;
    private SettableCacheEvent f1093k;

    static {
        f1083h = new Object();
    }

    public static SettableCacheEvent m997a() {
        synchronized (f1083h) {
            if (f1084i != null) {
                SettableCacheEvent settableCacheEvent = f1084i;
                f1084i = settableCacheEvent.f1093k;
                settableCacheEvent.f1093k = null;
                f1085j--;
                return settableCacheEvent;
            }
            return new SettableCacheEvent();
        }
    }

    private SettableCacheEvent() {
    }

    public final void m998b() {
        synchronized (f1083h) {
            if (f1085j < 5) {
                this.f1086a = null;
                this.f1087b = null;
                this.f1088c = 0;
                this.f1089d = 0;
                this.f1090e = 0;
                this.f1091f = null;
                this.f1092g = 0;
                f1085j++;
                if (f1084i != null) {
                    this.f1093k = f1084i;
                }
                f1084i = this;
            }
        }
    }
}
