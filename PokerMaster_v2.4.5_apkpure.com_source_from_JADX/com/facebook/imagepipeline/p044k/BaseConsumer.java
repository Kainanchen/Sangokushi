package com.facebook.imagepipeline.p044k;

import com.facebook.common.p014e.FLog;
import javax.annotation.Nullable;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* renamed from: com.facebook.imagepipeline.k.b */
public abstract class BaseConsumer<T> implements Consumer<T> {
    private boolean f2123a;

    public abstract void m1985a();

    public abstract void m1987a(T t, boolean z);

    public abstract void m1988a(Throwable th);

    public BaseConsumer() {
        this.f2123a = false;
    }

    public final synchronized void m1991b(@Nullable T t, boolean z) {
        if (!this.f2123a) {
            this.f2123a = z;
            try {
                m1987a(t, z);
            } catch (Exception e) {
                m1984a(e);
            }
        }
    }

    public final synchronized void m1992b(Throwable th) {
        if (!this.f2123a) {
            this.f2123a = true;
            try {
                m1988a(th);
            } catch (Exception e) {
                m1984a(e);
            }
        }
    }

    public final synchronized void m1989b() {
        if (!this.f2123a) {
            this.f2123a = true;
            try {
                m1985a();
            } catch (Exception e) {
                m1984a(e);
            }
        }
    }

    public final synchronized void m1990b(float f) {
        if (!this.f2123a) {
            try {
                m1986a(f);
            } catch (Exception e) {
                m1984a(e);
            }
        }
    }

    public void m1986a(float f) {
    }

    private void m1984a(Exception exception) {
        FLog.m1054b(getClass(), "unhandled exception", (Throwable) exception);
    }
}
