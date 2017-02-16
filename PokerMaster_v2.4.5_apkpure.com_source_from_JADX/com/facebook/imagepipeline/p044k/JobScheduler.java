package com.facebook.imagepipeline.p044k;

import android.os.SystemClock;
import com.facebook.imagepipeline.p047h.EncodedImage;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.facebook.imagepipeline.k.s */
public final class JobScheduler {
    final Executor f2358a;
    final JobScheduler f2359b;
    final Runnable f2360c;
    @GuardedBy("this")
    EncodedImage f2361d;
    @GuardedBy("this")
    boolean f2362e;
    @GuardedBy("this")
    int f2363f;
    @GuardedBy("this")
    long f2364g;
    @GuardedBy("this")
    long f2365h;
    private final Runnable f2366i;
    private final int f2367j;

    /* renamed from: com.facebook.imagepipeline.k.s.a */
    public interface JobScheduler {
        void m2179a(EncodedImage encodedImage, boolean z);
    }

    /* renamed from: com.facebook.imagepipeline.k.s.1 */
    class JobScheduler implements Runnable {
        final /* synthetic */ JobScheduler f2349a;

        JobScheduler(JobScheduler jobScheduler) {
            this.f2349a = jobScheduler;
        }

        public final void run() {
            JobScheduler jobScheduler = this.f2349a;
            long uptimeMillis = SystemClock.uptimeMillis();
            synchronized (jobScheduler) {
                EncodedImage encodedImage = jobScheduler.f2361d;
                boolean z = jobScheduler.f2362e;
                jobScheduler.f2361d = null;
                jobScheduler.f2362e = false;
                jobScheduler.f2363f = JobScheduler.f2355c;
                jobScheduler.f2365h = uptimeMillis;
            }
            try {
                if (JobScheduler.m2289b(encodedImage, z)) {
                    jobScheduler.f2359b.m2179a(encodedImage, z);
                }
                EncodedImage.m2029d(encodedImage);
                jobScheduler.m2293c();
            } catch (Throwable th) {
                EncodedImage.m2029d(encodedImage);
                jobScheduler.m2293c();
            }
        }
    }

    /* renamed from: com.facebook.imagepipeline.k.s.2 */
    class JobScheduler implements Runnable {
        final /* synthetic */ JobScheduler f2350a;

        JobScheduler(JobScheduler jobScheduler) {
            this.f2350a = jobScheduler;
        }

        public final void run() {
            JobScheduler jobScheduler = this.f2350a;
            jobScheduler.f2358a.execute(jobScheduler.f2360c);
        }
    }

    /* renamed from: com.facebook.imagepipeline.k.s.3 */
    static /* synthetic */ class JobScheduler {
        static final /* synthetic */ int[] f2351a;

        static {
            f2351a = new int[JobScheduler.m2287a().length];
            try {
                f2351a[JobScheduler.f2353a - 1] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                f2351a[JobScheduler.f2354b - 1] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                f2351a[JobScheduler.f2355c - 1] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                f2351a[JobScheduler.f2356d - 1] = 4;
            } catch (NoSuchFieldError e4) {
            }
        }
    }

    /* renamed from: com.facebook.imagepipeline.k.s.b */
    static class JobScheduler {
        static ScheduledExecutorService f2352a;
    }

    /* renamed from: com.facebook.imagepipeline.k.s.c */
    enum JobScheduler {
        ;

        public static int[] m2287a() {
            return (int[]) f2357e.clone();
        }

        static {
            f2353a = 1;
            f2354b = 2;
            f2355c = 3;
            f2356d = 4;
            f2357e = new int[]{f2353a, f2354b, f2355c, f2356d};
        }
    }

    public JobScheduler(Executor executor, JobScheduler jobScheduler, int i) {
        this.f2358a = executor;
        this.f2359b = jobScheduler;
        this.f2367j = i;
        this.f2360c = new JobScheduler(this);
        this.f2366i = new JobScheduler(this);
        this.f2361d = null;
        this.f2362e = false;
        this.f2363f = JobScheduler.f2353a;
        this.f2364g = 0;
        this.f2365h = 0;
    }

    public final void m2290a() {
        EncodedImage encodedImage;
        synchronized (this) {
            encodedImage = this.f2361d;
            this.f2361d = null;
            this.f2362e = false;
        }
        EncodedImage.m2029d(encodedImage);
    }

    public final boolean m2291a(EncodedImage encodedImage, boolean z) {
        if (!JobScheduler.m2289b(encodedImage, z)) {
            return false;
        }
        EncodedImage encodedImage2;
        synchronized (this) {
            encodedImage2 = this.f2361d;
            this.f2361d = EncodedImage.m2026a(encodedImage);
            this.f2362e = z;
        }
        EncodedImage.m2029d(encodedImage2);
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m2292b() {
        /*
        r8 = this;
        r1 = 1;
        r0 = 0;
        r4 = android.os.SystemClock.uptimeMillis();
        r2 = 0;
        monitor-enter(r8);
        r6 = r8.f2361d;	 Catch:{ all -> 0x0040 }
        r7 = r8.f2362e;	 Catch:{ all -> 0x0040 }
        r6 = com.facebook.imagepipeline.p044k.JobScheduler.m2289b(r6, r7);	 Catch:{ all -> 0x0040 }
        if (r6 != 0) goto L_0x0015;
    L_0x0013:
        monitor-exit(r8);	 Catch:{ all -> 0x0040 }
    L_0x0014:
        return r0;
    L_0x0015:
        r6 = com.facebook.imagepipeline.p044k.JobScheduler.JobScheduler.f2351a;	 Catch:{ all -> 0x0040 }
        r7 = r8.f2363f;	 Catch:{ all -> 0x0040 }
        r7 = r7 + -1;
        r6 = r6[r7];	 Catch:{ all -> 0x0040 }
        switch(r6) {
            case 1: goto L_0x0029;
            case 2: goto L_0x0020;
            case 3: goto L_0x003b;
            default: goto L_0x0020;
        };	 Catch:{ all -> 0x0040 }
    L_0x0020:
        monitor-exit(r8);	 Catch:{ all -> 0x0040 }
        if (r0 == 0) goto L_0x0027;
    L_0x0023:
        r2 = r2 - r4;
        r8.m2288a(r2);
    L_0x0027:
        r0 = r1;
        goto L_0x0014;
    L_0x0029:
        r2 = r8.f2365h;	 Catch:{ all -> 0x0040 }
        r0 = r8.f2367j;	 Catch:{ all -> 0x0040 }
        r6 = (long) r0;	 Catch:{ all -> 0x0040 }
        r2 = r2 + r6;
        r2 = java.lang.Math.max(r2, r4);	 Catch:{ all -> 0x0040 }
        r8.f2364g = r4;	 Catch:{ all -> 0x0040 }
        r0 = com.facebook.imagepipeline.p044k.JobScheduler.JobScheduler.f2354b;	 Catch:{ all -> 0x0040 }
        r8.f2363f = r0;	 Catch:{ all -> 0x0040 }
        r0 = r1;
        goto L_0x0020;
    L_0x003b:
        r6 = com.facebook.imagepipeline.p044k.JobScheduler.JobScheduler.f2356d;	 Catch:{ all -> 0x0040 }
        r8.f2363f = r6;	 Catch:{ all -> 0x0040 }
        goto L_0x0020;
    L_0x0040:
        r0 = move-exception;
        monitor-exit(r8);	 Catch:{ all -> 0x0040 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.k.s.b():boolean");
    }

    private void m2288a(long j) {
        if (j > 0) {
            if (JobScheduler.f2352a == null) {
                JobScheduler.f2352a = Executors.newSingleThreadScheduledExecutor();
            }
            JobScheduler.f2352a.schedule(this.f2366i, j, TimeUnit.MILLISECONDS);
            return;
        }
        this.f2366i.run();
    }

    final void m2293c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = 0;
        Object obj = null;
        synchronized (this) {
            if (this.f2363f == JobScheduler.f2356d) {
                j = Math.max(this.f2365h + ((long) this.f2367j), uptimeMillis);
                obj = 1;
                this.f2364g = uptimeMillis;
                this.f2363f = JobScheduler.f2354b;
            } else {
                this.f2363f = JobScheduler.f2353a;
            }
        }
        if (obj != null) {
            m2288a(j - uptimeMillis);
        }
    }

    static boolean m2289b(EncodedImage encodedImage, boolean z) {
        return z || EncodedImage.m2031e(encodedImage);
    }

    public final synchronized long m2294d() {
        return this.f2365h - this.f2364g;
    }
}
