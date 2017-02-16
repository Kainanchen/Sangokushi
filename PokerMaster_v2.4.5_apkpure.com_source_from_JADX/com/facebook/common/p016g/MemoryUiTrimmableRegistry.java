package com.facebook.common.p016g;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.facebook.common.g.c */
public final class MemoryUiTrimmableRegistry {
    private static final Set<MemoryUiTrimmable> f1121a;

    static {
        f1121a = Collections.newSetFromMap(new WeakHashMap());
    }

    public static void m1089a(MemoryUiTrimmable memoryUiTrimmable) {
        f1121a.add(memoryUiTrimmable);
    }
}
