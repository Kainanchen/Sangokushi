package com.facebook.p007c.p008a;

import java.util.List;

/* renamed from: com.facebook.c.a.e */
public final class MultiCacheKey implements CacheKey {
    final List<CacheKey> f990a;

    public final String toString() {
        return "MultiCacheKey:" + this.f990a.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MultiCacheKey)) {
            return false;
        }
        return this.f990a.equals(((MultiCacheKey) obj).f990a);
    }

    public final int hashCode() {
        return this.f990a.hashCode();
    }
}
