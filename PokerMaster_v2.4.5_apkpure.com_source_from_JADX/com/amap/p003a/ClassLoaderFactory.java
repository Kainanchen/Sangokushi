package com.amap.p003a;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.amap.a.u */
public final class ClassLoaderFactory {
    private static final ClassLoaderFactory f717a;
    private final Map<String, BaseClassLoader> f718b;

    static {
        f717a = new ClassLoaderFactory();
    }

    private ClassLoaderFactory() {
        this.f718b = new HashMap();
    }

    public static ClassLoaderFactory m726a() {
        return f717a;
    }

    final synchronized BaseClassLoader m727a(Context context, cj cjVar) {
        BaseClassLoader baseClassLoader;
        Object obj;
        if (cjVar != null) {
            if (!(TextUtils.isEmpty(cjVar.m612b()) || TextUtils.isEmpty(cjVar.m611a()))) {
                obj = 1;
                if (obj != null || context == null) {
                    throw new Exception("sdkInfo or context referance is null");
                }
                String a = cjVar.m611a();
                baseClassLoader = (BaseClassLoader) this.f718b.get(a);
                if (baseClassLoader == null) {
                    try {
                        BaseClassLoader dynamicClassLoader = new DynamicClassLoader(context.getApplicationContext(), cjVar);
                        try {
                            this.f718b.put(a, dynamicClassLoader);
                            DynamicExceptionHandler.m750a(context, cjVar);
                            baseClassLoader = dynamicClassLoader;
                        } catch (Throwable th) {
                            baseClassLoader = dynamicClassLoader;
                        }
                    } catch (Throwable th2) {
                    }
                }
            }
        }
        obj = null;
        if (obj != null) {
        }
        throw new Exception("sdkInfo or context referance is null");
        return baseClassLoader;
    }
}
