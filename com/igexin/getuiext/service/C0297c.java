package com.igexin.getuiext.service;

import android.graphics.Bitmap;
import com.igexin.getuiext.data.p034a.C0291d;
import java.util.HashMap;
import java.util.WeakHashMap;

/* renamed from: com.igexin.getuiext.service.c */
public final class C0297c {
    private static C0297c f803c;
    private HashMap f804a;
    private WeakHashMap f805b;

    static {
        f803c = new C0297c();
    }

    private C0297c() {
        this.f804a = new HashMap();
        this.f805b = new WeakHashMap();
    }

    public static C0297c m1021a() {
        return f803c;
    }

    public Bitmap m1022a(String str) {
        return (Bitmap) this.f805b.get(str);
    }

    public void m1023a(String str, Bitmap bitmap) {
        this.f805b.put(str, bitmap);
    }

    public void m1024a(String str, C0291d c0291d) {
        this.f804a.put(str, c0291d);
    }

    public C0291d m1025b(String str) {
        return (C0291d) this.f804a.get(str);
    }

    public void m1026c(String str) {
        this.f804a.remove(str);
    }
}
