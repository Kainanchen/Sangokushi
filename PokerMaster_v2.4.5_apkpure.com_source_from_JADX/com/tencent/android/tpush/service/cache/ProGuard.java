package com.tencent.android.tpush.service.cache;

import java.util.HashMap;

/* renamed from: com.tencent.android.tpush.service.cache.a */
public class ProGuard {
    private static volatile HashMap f7585a;

    static {
        f7585a = new HashMap(10);
    }

    public static synchronized void m5114a(Object obj, Object obj2) {
        synchronized (ProGuard.class) {
            f7585a.put(obj, obj2);
        }
    }

    public static synchronized Object m5113a(Object obj) {
        Object obj2;
        synchronized (ProGuard.class) {
            obj2 = f7585a.get(obj);
        }
        return obj2;
    }
}
