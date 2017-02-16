package com.facebook.imagepipeline.p044k;

import com.facebook.common.p013b.StatefulRunnable;
import java.util.Map;

/* compiled from: StatefulProducerRunnable */
/* renamed from: com.facebook.imagepipeline.k.am */
public abstract class am<T> extends StatefulRunnable<T> {
    private final Consumer<T> f2165b;
    private final aj f2166c;
    private final String f2167d;
    private final String f2168e;

    protected abstract void m2099b(T t);

    public am(Consumer<T> consumer, aj ajVar, String str, String str2) {
        this.f2165b = consumer;
        this.f2166c = ajVar;
        this.f2167d = str;
        this.f2168e = str2;
        this.f2166c.m2043a(this.f2168e, this.f2167d);
    }

    protected void m2097a(T t) {
        this.f2166c.m2046a(this.f2168e, this.f2167d, this.f2166c.m2048b(this.f2168e) ? m2100c(t) : null);
        this.f2165b.m1982b(t, true);
    }

    protected void m2096a(Exception exception) {
        aj ajVar = this.f2166c;
        String str = this.f2168e;
        String str2 = this.f2167d;
        this.f2166c.m2048b(this.f2168e);
        ajVar.m2045a(str, str2, exception, null);
        this.f2165b.m1983b((Throwable) exception);
    }

    protected void m2098b() {
        aj ajVar = this.f2166c;
        String str = this.f2168e;
        String str2 = this.f2167d;
        this.f2166c.m2048b(this.f2168e);
        ajVar.m2047b(str, str2, null);
        this.f2165b.m1980b();
    }

    protected Map<String, String> m2100c(T t) {
        return null;
    }
}
