package com.amap.p003a;

import android.content.Context;
import dalvik.system.DexFile;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.amap.a.t */
abstract class BaseClassLoader extends ClassLoader {
    protected final Context f711a;
    protected final Map<String, Class<?>> f712b;
    protected DexFile f713c;
    volatile boolean f714d;
    protected cj f715e;
    protected String f716f;

    public BaseClassLoader(Context context, cj cjVar) {
        super(context.getClassLoader());
        this.f712b = new HashMap();
        this.f713c = null;
        this.f714d = true;
        this.f711a = context;
        this.f715e = cjVar;
    }

    public final boolean m724a() {
        return this.f713c != null;
    }

    protected final void m725b() {
        try {
            this.f712b.clear();
            if (this.f713c != null) {
                this.f713c.close();
            }
        } catch (Throwable th) {
            cm.m637a(th, "BaseClassLoader", "releaseDexFile()");
        }
    }
}
