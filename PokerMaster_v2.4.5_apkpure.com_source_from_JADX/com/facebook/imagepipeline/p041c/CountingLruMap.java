package com.facebook.imagepipeline.p041c;

import java.util.LinkedHashMap;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* renamed from: com.facebook.imagepipeline.c.g */
public final class CountingLruMap<K, V> {
    private final ValueDescriptor<V> f1931a;
    @GuardedBy("this")
    private final LinkedHashMap<K, V> f1932b;
    @GuardedBy("this")
    private int f1933c;

    public CountingLruMap(ValueDescriptor<V> valueDescriptor) {
        this.f1932b = new LinkedHashMap();
        this.f1933c = 0;
        this.f1931a = valueDescriptor;
    }

    public final synchronized int m1883a() {
        return this.f1932b.size();
    }

    public final synchronized int m1886b() {
        return this.f1933c;
    }

    @Nullable
    public final synchronized K m1888c() {
        return this.f1932b.isEmpty() ? null : this.f1932b.keySet().iterator().next();
    }

    @Nullable
    public final synchronized V m1884a(K k) {
        return this.f1932b.get(k);
    }

    @Nullable
    public final synchronized V m1885a(K k, V v) {
        V remove;
        remove = this.f1932b.remove(k);
        this.f1933c -= m1882c(remove);
        this.f1932b.put(k, v);
        this.f1933c += m1882c(v);
        return remove;
    }

    @Nullable
    public final synchronized V m1887b(K k) {
        V remove;
        remove = this.f1932b.remove(k);
        this.f1933c -= m1882c(remove);
        return remove;
    }

    private int m1882c(V v) {
        return v == null ? 0 : this.f1931a.m1865a(v);
    }
}
