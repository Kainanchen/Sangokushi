package com.facebook.imagepipeline.p043e;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.facebook.imagepipeline.e.k */
public final class PriorityThreadFactory implements ThreadFactory {
    private final int f2087a;

    /* renamed from: com.facebook.imagepipeline.e.k.1 */
    class PriorityThreadFactory implements Runnable {
        final /* synthetic */ Runnable f2085a;
        final /* synthetic */ PriorityThreadFactory f2086b;

        PriorityThreadFactory(PriorityThreadFactory priorityThreadFactory, Runnable runnable) {
            this.f2086b = priorityThreadFactory;
            this.f2085a = runnable;
        }

        public final void run() {
            try {
                Process.setThreadPriority(this.f2086b.f2087a);
            } catch (Throwable th) {
            }
            this.f2085a.run();
        }
    }

    public PriorityThreadFactory() {
        this.f2087a = 10;
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(new PriorityThreadFactory(this, runnable));
    }
}
