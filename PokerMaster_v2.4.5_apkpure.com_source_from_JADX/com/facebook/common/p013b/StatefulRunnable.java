package com.facebook.common.p013b;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.common.b.e */
public abstract class StatefulRunnable<T> implements Runnable {
    protected final AtomicInteger f1105a;

    public abstract T m1014c();

    public StatefulRunnable() {
        this.f1105a = new AtomicInteger(0);
    }

    public final void run() {
        if (this.f1105a.compareAndSet(0, 1)) {
            try {
                Object c = m1014c();
                this.f1105a.set(3);
                try {
                    m1011a(c);
                } finally {
                    m1013b(c);
                }
            } catch (Exception e) {
                this.f1105a.set(4);
                m1010a(e);
            }
        }
    }

    public final void m1009a() {
        if (this.f1105a.compareAndSet(0, 2)) {
            m1012b();
        }
    }

    public void m1011a(T t) {
    }

    public void m1010a(Exception exception) {
    }

    public void m1012b() {
    }

    public void m1013b(T t) {
    }
}
