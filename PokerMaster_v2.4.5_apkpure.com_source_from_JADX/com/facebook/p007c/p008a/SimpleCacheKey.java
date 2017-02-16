package com.facebook.p007c.p008a;

import com.facebook.common.p011d.Preconditions;

/* renamed from: com.facebook.c.a.h */
public final class SimpleCacheKey implements CacheKey {
    final String f993a;

    public SimpleCacheKey(String str) {
        this.f993a = (String) Preconditions.m1030a((Object) str);
    }

    public final String toString() {
        return this.f993a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SimpleCacheKey)) {
            return false;
        }
        return this.f993a.equals(((SimpleCacheKey) obj).f993a);
    }

    public final int hashCode() {
        return this.f993a.hashCode();
    }
}
