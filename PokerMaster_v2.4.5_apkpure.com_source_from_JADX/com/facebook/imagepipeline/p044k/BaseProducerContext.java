package com.facebook.imagepipeline.p044k;

import com.facebook.imagepipeline.p050l.ImageRequest;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.facebook.imagepipeline.k.d */
public class BaseProducerContext implements ah {
    public final ImageRequest f2231a;
    public final String f2232b;
    public final Object f2233c;
    private final aj f2234d;
    private final ImageRequest.ImageRequest f2235e;
    @GuardedBy("this")
    private boolean f2236f;
    @GuardedBy("this")
    private int f2237g;
    @GuardedBy("this")
    private boolean f2238h;
    @GuardedBy("this")
    private boolean f2239i;
    @GuardedBy("this")
    private final List<ai> f2240j;

    public BaseProducerContext(ImageRequest imageRequest, String str, aj ajVar, Object obj, ImageRequest.ImageRequest imageRequest2, boolean z, boolean z2, int i) {
        this.f2231a = imageRequest;
        this.f2232b = str;
        this.f2234d = ajVar;
        this.f2233c = obj;
        this.f2235e = imageRequest2;
        this.f2236f = z;
        this.f2237g = i;
        this.f2238h = z2;
        this.f2239i = false;
        this.f2240j = new ArrayList();
    }

    public final ImageRequest m2191a() {
        return this.f2231a;
    }

    public final String m2195b() {
        return this.f2232b;
    }

    public final aj m2197c() {
        return this.f2234d;
    }

    public final Object m2198d() {
        return this.f2233c;
    }

    public final ImageRequest.ImageRequest m2199e() {
        return this.f2235e;
    }

    public final synchronized boolean m2200f() {
        return this.f2236f;
    }

    public final synchronized int m2201g() {
        return this.f2237g;
    }

    public final synchronized boolean m2202h() {
        return this.f2238h;
    }

    public final void m2194a(ai aiVar) {
        Object obj = null;
        synchronized (this) {
            this.f2240j.add(aiVar);
            if (this.f2239i) {
                obj = 1;
            }
        }
        if (obj != null) {
            aiVar.m2104a();
        }
    }

    public final void m2203i() {
        List<ai> j = m2190j();
        if (j != null) {
            for (ai a : j) {
                a.m2104a();
            }
        }
    }

    @Nullable
    public final synchronized List<ai> m2193a(boolean z) {
        List<ai> list;
        if (z == this.f2236f) {
            list = null;
        } else {
            this.f2236f = z;
            list = new ArrayList(this.f2240j);
        }
        return list;
    }

    @Nullable
    public final synchronized List<ai> m2192a(int i) {
        List<ai> list;
        if (i == this.f2237g) {
            list = null;
        } else {
            this.f2237g = i;
            list = new ArrayList(this.f2240j);
        }
        return list;
    }

    @Nullable
    public final synchronized List<ai> m2196b(boolean z) {
        List<ai> list;
        if (z == this.f2238h) {
            list = null;
        } else {
            this.f2238h = z;
            list = new ArrayList(this.f2240j);
        }
        return list;
    }

    @Nullable
    private synchronized List<ai> m2190j() {
        List<ai> list;
        if (this.f2239i) {
            list = null;
        } else {
            this.f2239i = true;
            list = new ArrayList(this.f2240j);
        }
        return list;
    }

    public static void m2187a(@Nullable List<ai> list) {
        if (list != null) {
            for (ai b : list) {
                b.m2105b();
            }
        }
    }

    public static void m2188b(@Nullable List<ai> list) {
        if (list != null) {
            for (ai c : list) {
                c.m2106c();
            }
        }
    }

    public static void m2189c(@Nullable List<ai> list) {
        if (list != null) {
            for (ai d : list) {
                d.m2107d();
            }
        }
    }
}
