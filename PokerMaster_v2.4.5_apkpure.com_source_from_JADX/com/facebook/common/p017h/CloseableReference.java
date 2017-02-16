package com.facebook.common.p017h;

import com.facebook.common.p011d.Closeables;
import com.facebook.common.p011d.Preconditions;
import com.facebook.common.p014e.FLog;
import java.io.Closeable;
import java.io.IOException;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.facebook.common.h.a */
public final class CloseableReference<T> implements Closeable, Cloneable {
    private static Class<CloseableReference> f1123a;
    private static final ResourceReleaser<Closeable> f1124b;
    @GuardedBy("this")
    private boolean f1125c;
    private final SharedReference<T> f1126d;

    /* renamed from: com.facebook.common.h.a.1 */
    static class CloseableReference implements ResourceReleaser<Closeable> {
        CloseableReference() {
        }

        public final /* bridge */ /* synthetic */ void m1092a(Object obj) {
            try {
                Closeables.m1021a((Closeable) obj);
            } catch (IOException e) {
            }
        }
    }

    public final /* synthetic */ Object clone() {
        return m1100b();
    }

    static {
        f1123a = CloseableReference.class;
        f1124b = new CloseableReference();
    }

    private CloseableReference(SharedReference<T> sharedReference) {
        this.f1125c = false;
        this.f1126d = (SharedReference) Preconditions.m1030a((Object) sharedReference);
        sharedReference.m1107b();
    }

    private CloseableReference(T t, ResourceReleaser<T> resourceReleaser) {
        this.f1125c = false;
        this.f1126d = new SharedReference(t, resourceReleaser);
    }

    @Nullable
    public static <T extends Closeable> CloseableReference<T> m1093a(@Nullable T t) {
        if (t == null) {
            return null;
        }
        return new CloseableReference(t, f1124b);
    }

    @Nullable
    public static <T> CloseableReference<T> m1094a(@Nullable T t, ResourceReleaser<T> resourceReleaser) {
        if (t == null) {
            return null;
        }
        return new CloseableReference(t, resourceReleaser);
    }

    public final void close() {
        synchronized (this) {
            if (this.f1125c) {
                return;
            }
            this.f1125c = true;
            SharedReference sharedReference = this.f1126d;
            if (sharedReference.m1108c() == 0) {
                Object obj;
                synchronized (sharedReference) {
                    obj = sharedReference.f1131a;
                    sharedReference.f1131a = null;
                }
                sharedReference.f1132b.m1091a(obj);
                SharedReference.m1103a(obj);
            }
        }
    }

    public final synchronized T m1099a() {
        Preconditions.m1035b(!this.f1125c);
        return this.f1126d.m1106a();
    }

    public final synchronized CloseableReference<T> m1100b() {
        Preconditions.m1035b(m1098e());
        return new CloseableReference(this.f1126d);
    }

    public final synchronized CloseableReference<T> m1101c() {
        return m1098e() ? new CloseableReference(this.f1126d) : null;
    }

    private synchronized boolean m1098e() {
        return !this.f1125c;
    }

    protected final void finalize() {
        try {
            synchronized (this) {
                if (this.f1125c) {
                    super.finalize();
                    return;
                }
                FLog.m1055b(f1123a, "Finalized without closing: %x %x (type = %s)", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f1126d)), this.f1126d.m1106a().getClass().getSimpleName());
                close();
                super.finalize();
            }
        } catch (Throwable th) {
            super.finalize();
        }
    }

    public final synchronized int m1102d() {
        return m1098e() ? System.identityHashCode(this.f1126d.m1106a()) : 0;
    }

    public static boolean m1095a(@Nullable CloseableReference<?> closeableReference) {
        return closeableReference != null && closeableReference.m1098e();
    }

    @Nullable
    public static <T> CloseableReference<T> m1096b(@Nullable CloseableReference<T> closeableReference) {
        return closeableReference != null ? closeableReference.m1101c() : null;
    }

    public static void m1097c(@Nullable CloseableReference<?> closeableReference) {
        if (closeableReference != null) {
            closeableReference.close();
        }
    }
}
