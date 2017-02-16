package com.facebook.drawee.p026b;

import android.os.Handler;
import android.os.Looper;
import com.facebook.common.p011d.Preconditions;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.facebook.drawee.b.a */
public final class DeferredReleaser {
    private static DeferredReleaser f1275d;
    public final Set<DeferredReleaser> f1276a;
    public final Handler f1277b;
    public final Runnable f1278c;

    /* renamed from: com.facebook.drawee.b.a.a */
    public interface DeferredReleaser {
        void m1215c();
    }

    /* renamed from: com.facebook.drawee.b.a.1 */
    class DeferredReleaser implements Runnable {
        final /* synthetic */ DeferredReleaser f1274a;

        DeferredReleaser(DeferredReleaser deferredReleaser) {
            this.f1274a = deferredReleaser;
        }

        public final void run() {
            DeferredReleaser.m1285b();
            for (DeferredReleaser c : this.f1274a.f1276a) {
                c.m1215c();
            }
            this.f1274a.f1276a.clear();
        }
    }

    static {
        f1275d = null;
    }

    public static synchronized DeferredReleaser m1283a() {
        DeferredReleaser deferredReleaser;
        synchronized (DeferredReleaser.class) {
            if (f1275d == null) {
                f1275d = new DeferredReleaser();
            }
            deferredReleaser = f1275d;
        }
        return deferredReleaser;
    }

    public DeferredReleaser() {
        this.f1278c = new DeferredReleaser(this);
        this.f1276a = new HashSet();
        this.f1277b = new Handler(Looper.getMainLooper());
    }

    public final void m1287a(DeferredReleaser deferredReleaser) {
        DeferredReleaser.m1285b();
        this.f1276a.remove(deferredReleaser);
    }

    public static void m1285b() {
        Preconditions.m1035b(Looper.getMainLooper().getThread() == Thread.currentThread());
    }
}
