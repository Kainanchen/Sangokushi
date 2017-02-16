package com.facebook.imagepipeline.memory;

import android.annotation.SuppressLint;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.facebook.common.p011d.Preconditions;
import com.facebook.common.p011d.Throwables;
import com.facebook.common.p014e.FLog;
import com.facebook.common.p016g.MemoryTrimmableRegistry;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.NotThreadSafe;

/* renamed from: com.facebook.imagepipeline.memory.a */
public abstract class BasePool<V> implements Pool<V> {
    final MemoryTrimmableRegistry f2430a;
    final PoolParams f2431b;
    final SparseArray<Bucket<V>> f2432c;
    final Set<V> f2433d;
    @GuardedBy("this")
    final BasePool f2434e;
    @GuardedBy("this")
    final BasePool f2435f;
    private final Class<?> f2436g;
    private boolean f2437h;
    private final PoolStatsTracker f2438i;

    @NotThreadSafe
    /* renamed from: com.facebook.imagepipeline.memory.a.a */
    static class BasePool {
        int f2428a;
        int f2429b;

        BasePool() {
        }

        public final void m2342a(int i) {
            this.f2428a++;
            this.f2429b += i;
        }

        public final void m2343b(int i) {
            if (this.f2429b < i || this.f2428a <= 0) {
                FLog.m1060c("com.facebook.imagepipeline.memory.BasePool.Counter", "Unexpected decrement of %d. Current numBytes = %d, count = %d", Integer.valueOf(i), Integer.valueOf(this.f2429b), Integer.valueOf(this.f2428a));
                return;
            }
            this.f2428a--;
            this.f2429b -= i;
        }
    }

    /* renamed from: com.facebook.imagepipeline.memory.a.b */
    public static class BasePool extends RuntimeException {
        public BasePool(Object obj) {
            super("Invalid size: " + obj.toString());
        }
    }

    /* renamed from: com.facebook.imagepipeline.memory.a.c */
    public static class BasePool extends RuntimeException {
        public BasePool(int i, int i2, int i3, int i4) {
            super("Pool hard cap violation? Hard cap = " + i + " Used size = " + i2 + " Free size = " + i3 + " Request size = " + i4);
        }
    }

    protected abstract V m2356b(int i);

    protected abstract void m2357b(V v);

    protected abstract int m2358c(int i);

    protected abstract int m2359c(V v);

    protected abstract int m2360d(int i);

    public BasePool(MemoryTrimmableRegistry memoryTrimmableRegistry, PoolParams poolParams, PoolStatsTracker poolStatsTracker) {
        this.f2436g = getClass();
        this.f2430a = (MemoryTrimmableRegistry) Preconditions.m1030a((Object) memoryTrimmableRegistry);
        this.f2431b = (PoolParams) Preconditions.m1030a((Object) poolParams);
        this.f2438i = (PoolStatsTracker) Preconditions.m1030a((Object) poolStatsTracker);
        this.f2432c = new SparseArray();
        m2347a(new SparseIntArray(0));
        this.f2433d = Collections.newSetFromMap(new IdentityHashMap());
        this.f2435f = new BasePool();
        this.f2434e = new BasePool();
    }

    public final V m2354a(int i) {
        V a;
        m2346a();
        int c = m2358c(i);
        synchronized (this) {
            Bucket g = m2352g(c);
            if (g != null) {
                a = g.m2374a();
                if (a != null) {
                    g.f2452d++;
                }
                if (a != null) {
                    Preconditions.m1035b(this.f2433d.add(a));
                    c = m2359c((Object) a);
                    int d = m2360d(c);
                    this.f2434e.m2342a(d);
                    this.f2435f.m2343b(d);
                    m2350d();
                    if (FLog.m1051a(2)) {
                        FLog.m1042a(this.f2436g, "get (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(a)), Integer.valueOf(c));
                    }
                }
            }
            int d2 = m2360d(c);
            if (m2353h(d2)) {
                this.f2434e.m2342a(d2);
                if (g != null) {
                    g.f2452d++;
                }
                a = null;
                try {
                    a = m2356b(c);
                } catch (Throwable th) {
                    synchronized (this) {
                        this.f2434e.m2343b(d2);
                        Bucket g2 = m2352g(c);
                        if (g2 != null) {
                            g2.m2376b();
                        }
                        Throwables.m1037a(th);
                    }
                    return a;
                }
                synchronized (this) {
                    Preconditions.m1035b(this.f2433d.add(a));
                    m2348b();
                    m2350d();
                    if (FLog.m1051a(2)) {
                        FLog.m1042a(this.f2436g, "get (alloc) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(a)), Integer.valueOf(c));
                    }
                }
            } else {
                throw new BasePool(this.f2431b.f2492a, this.f2434e.f2429b, this.f2435f.f2429b, d2);
            }
        }
        return a;
    }

    public final void m2355a(V v) {
        boolean z = true;
        Preconditions.m1030a((Object) v);
        int c = m2359c((Object) v);
        int d = m2360d(c);
        synchronized (this) {
            Bucket g = m2352g(c);
            if (this.f2433d.remove(v)) {
                if (g != null) {
                    boolean z2;
                    if (g.f2452d + g.f2451c.size() > g.f2450b) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!(z2 || m2349c() || !m2361d((Object) v))) {
                        Preconditions.m1030a((Object) v);
                        if (g.f2452d <= 0) {
                            z = false;
                        }
                        Preconditions.m1035b(z);
                        g.f2452d--;
                        g.m2375a(v);
                        this.f2435f.m2342a(d);
                        this.f2434e.m2343b(d);
                        if (FLog.m1051a(2)) {
                            FLog.m1042a(this.f2436g, "release (reuse) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v)), Integer.valueOf(c));
                        }
                    }
                }
                if (g != null) {
                    g.m2376b();
                }
                if (FLog.m1051a(2)) {
                    FLog.m1042a(this.f2436g, "release (free) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v)), Integer.valueOf(c));
                }
                m2357b((Object) v);
                this.f2434e.m2343b(d);
            } else {
                FLog.m1059c(this.f2436g, "release (free, value unrecognized) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v)), Integer.valueOf(c));
                m2357b((Object) v);
            }
            m2350d();
        }
    }

    protected boolean m2361d(V v) {
        Preconditions.m1030a((Object) v);
        return true;
    }

    private synchronized void m2346a() {
        boolean z = !m2349c() || this.f2435f.f2429b == 0;
        Preconditions.m1035b(z);
    }

    private synchronized void m2347a(SparseIntArray sparseIntArray) {
        synchronized (this) {
            Preconditions.m1030a((Object) sparseIntArray);
            this.f2432c.clear();
            SparseIntArray sparseIntArray2 = this.f2431b.f2494c;
            if (sparseIntArray2 != null) {
                for (int i = 0; i < sparseIntArray2.size(); i++) {
                    int keyAt = sparseIntArray2.keyAt(i);
                    this.f2432c.put(keyAt, new Bucket(m2360d(keyAt), sparseIntArray2.valueAt(i), sparseIntArray.get(keyAt, 0)));
                }
                this.f2437h = false;
            } else {
                this.f2437h = true;
            }
        }
    }

    private synchronized void m2348b() {
        if (m2349c()) {
            m2351f(this.f2431b.f2493b);
        }
    }

    private synchronized void m2351f(int i) {
        int min = Math.min((this.f2434e.f2429b + this.f2435f.f2429b) - i, this.f2435f.f2429b);
        if (min > 0) {
            if (FLog.m1051a(2)) {
                FLog.m1043a(this.f2436g, "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d", Integer.valueOf(i), Integer.valueOf(this.f2434e.f2429b + this.f2435f.f2429b), Integer.valueOf(min));
            }
            m2350d();
            for (int i2 = 0; i2 < this.f2432c.size() && r1 > 0; i2++) {
                Bucket bucket = (Bucket) this.f2432c.valueAt(i2);
                while (min > 0) {
                    Object a = bucket.m2374a();
                    if (a == null) {
                        break;
                    }
                    m2357b(a);
                    min -= bucket.f2449a;
                    this.f2435f.m2343b(bucket.f2449a);
                }
            }
            m2350d();
            if (FLog.m1051a(2)) {
                FLog.m1042a(this.f2436g, "trimToSize: TargetSize = %d; Final Size = %d", Integer.valueOf(i), Integer.valueOf(this.f2434e.f2429b + this.f2435f.f2429b));
            }
        }
    }

    private synchronized Bucket<V> m2352g(int i) {
        Bucket<V> bucket;
        bucket = (Bucket) this.f2432c.get(i);
        if (bucket == null && this.f2437h) {
            if (FLog.m1051a(2)) {
                FLog.m1041a(this.f2436g, "creating new bucket %s", Integer.valueOf(i));
            }
            bucket = m2362e(i);
            this.f2432c.put(i, bucket);
        }
        return bucket;
    }

    Bucket<V> m2362e(int i) {
        return new Bucket(m2360d(i), ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, 0);
    }

    private synchronized boolean m2349c() {
        return this.f2434e.f2429b + this.f2435f.f2429b > this.f2431b.f2493b;
    }

    private synchronized boolean m2353h(int i) {
        boolean z = false;
        synchronized (this) {
            int i2 = this.f2431b.f2492a;
            if (i <= i2 - this.f2434e.f2429b) {
                int i3 = this.f2431b.f2493b;
                if (i > i3 - (this.f2434e.f2429b + this.f2435f.f2429b)) {
                    m2351f(i3 - i);
                }
                if (i <= i2 - (this.f2434e.f2429b + this.f2435f.f2429b)) {
                    z = true;
                }
            }
        }
        return z;
    }

    @SuppressLint({"InvalidAccessToGuardedField"})
    private void m2350d() {
        if (FLog.m1051a(2)) {
            FLog.m1044a(this.f2436g, "Used = (%d, %d); Free = (%d, %d)", Integer.valueOf(this.f2434e.f2428a), Integer.valueOf(this.f2434e.f2429b), Integer.valueOf(this.f2435f.f2428a), Integer.valueOf(this.f2435f.f2429b));
        }
    }
}
