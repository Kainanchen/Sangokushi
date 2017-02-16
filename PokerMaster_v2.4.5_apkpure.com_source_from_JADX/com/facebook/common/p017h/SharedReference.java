package com.facebook.common.p017h;

import com.facebook.common.p011d.Preconditions;
import com.facebook.common.p014e.FLog;
import java.util.IdentityHashMap;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.facebook.common.h.d */
public final class SharedReference<T> {
    @GuardedBy("itself")
    private static final Map<Object, Integer> f1130c;
    @GuardedBy("this")
    T f1131a;
    final ResourceReleaser<T> f1132b;
    @GuardedBy("this")
    private int f1133d;

    /* renamed from: com.facebook.common.h.d.a */
    public static class SharedReference extends RuntimeException {
        public SharedReference() {
            super("Null shared reference");
        }
    }

    static {
        f1130c = new IdentityHashMap();
    }

    public SharedReference(T t, ResourceReleaser<T> resourceReleaser) {
        this.f1131a = Preconditions.m1030a((Object) t);
        this.f1132b = (ResourceReleaser) Preconditions.m1030a((Object) resourceReleaser);
        this.f1133d = 1;
        synchronized (f1130c) {
            Integer num = (Integer) f1130c.get(t);
            if (num == null) {
                f1130c.put(t, Integer.valueOf(1));
            } else {
                f1130c.put(t, Integer.valueOf(num.intValue() + 1));
            }
        }
    }

    static void m1103a(Object obj) {
        synchronized (f1130c) {
            Integer num = (Integer) f1130c.get(obj);
            if (num == null) {
                FLog.m1060c("SharedReference", "No entry in sLiveObjects for value of type %s", obj.getClass());
            } else if (num.intValue() == 1) {
                f1130c.remove(obj);
            } else {
                f1130c.put(obj, Integer.valueOf(num.intValue() - 1));
            }
        }
    }

    public final synchronized T m1106a() {
        return this.f1131a;
    }

    private synchronized boolean m1104d() {
        return this.f1133d > 0;
    }

    public final synchronized void m1107b() {
        m1105e();
        this.f1133d++;
    }

    final synchronized int m1108c() {
        m1105e();
        Preconditions.m1033a(this.f1133d > 0);
        this.f1133d--;
        return this.f1133d;
    }

    private void m1105e() {
        Object obj;
        if (this == null || !m1104d()) {
            obj = null;
        } else {
            obj = 1;
        }
        if (obj == null) {
            throw new SharedReference();
        }
    }
}
