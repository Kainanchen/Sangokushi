package com.facebook.p023d;

import com.facebook.common.p011d.Preconditions;

/* renamed from: com.facebook.d.h */
public final class SimpleDataSource<T> extends AbstractDataSource<T> {
    SimpleDataSource() {
    }

    public final boolean m1208a(T t, boolean z) {
        return super.m1162a(Preconditions.m1030a((Object) t), z);
    }

    public final boolean m1209a(Throwable th) {
        return super.m1163a((Throwable) Preconditions.m1030a((Object) th));
    }

    public final boolean m1207a(float f) {
        return super.m1161a(f);
    }
}
