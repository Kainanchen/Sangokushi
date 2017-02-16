package com.facebook.imagepipeline.p041c;

import android.graphics.Bitmap;
import android.os.SystemClock;
import com.facebook.common.p011d.Preconditions;
import com.facebook.common.p011d.Supplier;
import com.facebook.common.p017h.CloseableReference;
import com.facebook.common.p017h.ResourceReleaser;
import com.facebook.imagepipeline.p040b.PlatformBitmapFactory.PlatformBitmapFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* renamed from: com.facebook.imagepipeline.c.h */
public final class CountingMemoryCache<K, V> implements MemoryCache<K, V> {
    static final long f1944a;
    @GuardedBy("this")
    final CountingLruMap<K, CountingMemoryCache<K, V>> f1945b;
    @GuardedBy("this")
    final CountingLruMap<K, CountingMemoryCache<K, V>> f1946c;
    @GuardedBy("this")
    final Map<Bitmap, Object> f1947d;
    @GuardedBy("this")
    protected MemoryCacheParams f1948e;
    private final ValueDescriptor<V> f1949f;
    private final CountingMemoryCache f1950g;
    private final Supplier<MemoryCacheParams> f1951h;
    @GuardedBy("this")
    private long f1952i;

    /* renamed from: com.facebook.imagepipeline.c.h.a */
    public interface CountingMemoryCache {
    }

    /* renamed from: com.facebook.imagepipeline.c.h.1 */
    class CountingMemoryCache implements PlatformBitmapFactory {
        final /* synthetic */ CountingMemoryCache f1934a;

        CountingMemoryCache(CountingMemoryCache countingMemoryCache) {
            this.f1934a = countingMemoryCache;
        }
    }

    /* renamed from: com.facebook.imagepipeline.c.h.2 */
    class CountingMemoryCache implements ValueDescriptor<CountingMemoryCache<K, V>> {
        final /* synthetic */ ValueDescriptor f1935a;
        final /* synthetic */ CountingMemoryCache f1936b;

        CountingMemoryCache(CountingMemoryCache countingMemoryCache, ValueDescriptor valueDescriptor) {
            this.f1936b = countingMemoryCache;
            this.f1935a = valueDescriptor;
        }

        public final /* bridge */ /* synthetic */ int m1889a(Object obj) {
            return this.f1935a.m1865a(((CountingMemoryCache) obj).f1940b.m1099a());
        }
    }

    /* renamed from: com.facebook.imagepipeline.c.h.3 */
    class CountingMemoryCache implements ResourceReleaser<V> {
        final /* synthetic */ CountingMemoryCache f1937a;
        final /* synthetic */ CountingMemoryCache f1938b;

        CountingMemoryCache(CountingMemoryCache countingMemoryCache, CountingMemoryCache countingMemoryCache2) {
            this.f1938b = countingMemoryCache;
            this.f1937a = countingMemoryCache2;
        }

        public final void m1890a(V v) {
            CountingMemoryCache.m1897a(this.f1938b, this.f1937a);
        }
    }

    /* renamed from: com.facebook.imagepipeline.c.h.b */
    static class CountingMemoryCache<K, V> {
        public final K f1939a;
        public final CloseableReference<V> f1940b;
        public int f1941c;
        public boolean f1942d;
        @Nullable
        public final CountingMemoryCache<K> f1943e;

        CountingMemoryCache(K k, CloseableReference<V> closeableReference) {
            this.f1939a = Preconditions.m1030a((Object) k);
            this.f1940b = (CloseableReference) Preconditions.m1030a(CloseableReference.m1096b(closeableReference));
            this.f1941c = 0;
            this.f1942d = false;
            this.f1943e = null;
        }
    }

    /* renamed from: com.facebook.imagepipeline.c.h.c */
    public interface CountingMemoryCache<K> {
    }

    static {
        f1944a = TimeUnit.MINUTES.toMillis(5);
    }

    public CountingMemoryCache(ValueDescriptor<V> valueDescriptor, CountingMemoryCache countingMemoryCache, Supplier<MemoryCacheParams> supplier, boolean z) {
        this.f1947d = new WeakHashMap();
        this.f1949f = valueDescriptor;
        this.f1945b = new CountingLruMap(m1894a((ValueDescriptor) valueDescriptor));
        this.f1946c = new CountingLruMap(m1894a((ValueDescriptor) valueDescriptor));
        this.f1950g = countingMemoryCache;
        this.f1951h = supplier;
        this.f1948e = (MemoryCacheParams) this.f1951h.m963a();
        this.f1952i = SystemClock.uptimeMillis();
        if (z) {
            com.facebook.imagepipeline.p040b.PlatformBitmapFactory.m1863a(new CountingMemoryCache(this));
        }
    }

    private ValueDescriptor<CountingMemoryCache<K, V>> m1894a(ValueDescriptor<V> valueDescriptor) {
        return new CountingMemoryCache(this, valueDescriptor);
    }

    public final CloseableReference<V> m1910a(K k, CloseableReference<V> closeableReference) {
        return m1899b(k, closeableReference);
    }

    private CloseableReference<V> m1899b(K k, CloseableReference<V> closeableReference) {
        CloseableReference f;
        CloseableReference<V> a;
        Preconditions.m1030a((Object) k);
        Preconditions.m1030a((Object) closeableReference);
        m1896a();
        synchronized (this) {
            this.f1945b.m1887b(k);
            CountingMemoryCache countingMemoryCache = (CountingMemoryCache) this.f1946c.m1887b(k);
            if (countingMemoryCache != null) {
                m1904c(countingMemoryCache);
                f = m1908f(countingMemoryCache);
            } else {
                f = null;
            }
            if (m1902b(closeableReference.m1099a())) {
                countingMemoryCache = new CountingMemoryCache(k, closeableReference);
                this.f1946c.m1885a(k, countingMemoryCache);
                a = m1893a(countingMemoryCache);
            } else {
                a = null;
            }
        }
        CloseableReference.m1097c(f);
        m1900b();
        return a;
    }

    private synchronized boolean m1902b(V v) {
        boolean z;
        int a = this.f1949f.m1865a(v);
        z = a <= this.f1948e.f1962e && m1903c() <= this.f1948e.f1959b - 1 && m1905d() <= this.f1948e.f1958a - a;
        return z;
    }

    @Nullable
    public final CloseableReference<V> m1909a(K k) {
        CloseableReference<V> a;
        Preconditions.m1030a((Object) k);
        synchronized (this) {
            this.f1945b.m1887b(k);
            CountingMemoryCache countingMemoryCache = (CountingMemoryCache) this.f1946c.m1884a(k);
            if (countingMemoryCache != null) {
                a = m1893a(countingMemoryCache);
            } else {
                a = null;
            }
        }
        m1896a();
        m1900b();
        return a;
    }

    private synchronized CloseableReference<V> m1893a(CountingMemoryCache<K, V> countingMemoryCache) {
        m1906d(countingMemoryCache);
        return CloseableReference.m1094a(countingMemoryCache.f1940b.m1099a(), new CountingMemoryCache(this, countingMemoryCache));
    }

    private synchronized boolean m1901b(CountingMemoryCache<K, V> countingMemoryCache) {
        boolean z;
        if (countingMemoryCache.f1942d || countingMemoryCache.f1941c != 0) {
            z = false;
        } else {
            this.f1945b.m1885a(countingMemoryCache.f1939a, countingMemoryCache);
            z = true;
        }
        return z;
    }

    private synchronized void m1896a() {
        if (this.f1952i + f1944a <= SystemClock.uptimeMillis()) {
            this.f1952i = SystemClock.uptimeMillis();
            this.f1948e = (MemoryCacheParams) this.f1951h.m963a();
        }
    }

    private void m1900b() {
        synchronized (this) {
            ArrayList a = m1895a(Math.min(this.f1948e.f1961d, this.f1948e.f1959b - m1903c()), Math.min(this.f1948e.f1960c, this.f1948e.f1958a - m1905d()));
            m1898a(a);
        }
        if (a != null) {
            Iterator it = a.iterator();
            while (it.hasNext()) {
                CloseableReference.m1097c(m1908f((CountingMemoryCache) it.next()));
            }
        }
        if (a != null) {
            Iterator it2 = a.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
    }

    @Nullable
    private synchronized ArrayList<CountingMemoryCache<K, V>> m1895a(int i, int i2) {
        ArrayList<CountingMemoryCache<K, V>> arrayList;
        int max = Math.max(i, 0);
        int max2 = Math.max(i2, 0);
        if (this.f1945b.m1883a() > max || this.f1945b.m1886b() > max2) {
            arrayList = new ArrayList();
            while (true) {
                if (this.f1945b.m1883a() <= max && this.f1945b.m1886b() <= max2) {
                    break;
                }
                Object c = this.f1945b.m1888c();
                this.f1945b.m1887b(c);
                arrayList.add(this.f1946c.m1887b(c));
            }
        } else {
            arrayList = null;
        }
        return arrayList;
    }

    private synchronized void m1898a(@Nullable ArrayList<CountingMemoryCache<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m1904c((CountingMemoryCache) it.next());
            }
        }
    }

    private synchronized void m1904c(CountingMemoryCache<K, V> countingMemoryCache) {
        boolean z = true;
        synchronized (this) {
            Preconditions.m1030a((Object) countingMemoryCache);
            if (countingMemoryCache.f1942d) {
                z = false;
            }
            Preconditions.m1035b(z);
            countingMemoryCache.f1942d = true;
        }
    }

    private synchronized void m1906d(CountingMemoryCache<K, V> countingMemoryCache) {
        Preconditions.m1030a((Object) countingMemoryCache);
        Preconditions.m1035b(!countingMemoryCache.f1942d);
        countingMemoryCache.f1941c++;
    }

    private synchronized void m1907e(CountingMemoryCache<K, V> countingMemoryCache) {
        Preconditions.m1030a((Object) countingMemoryCache);
        Preconditions.m1035b(countingMemoryCache.f1941c > 0);
        countingMemoryCache.f1941c--;
    }

    @Nullable
    private synchronized CloseableReference<V> m1908f(CountingMemoryCache<K, V> countingMemoryCache) {
        CloseableReference<V> closeableReference;
        Preconditions.m1030a((Object) countingMemoryCache);
        closeableReference = (countingMemoryCache.f1942d && countingMemoryCache.f1941c == 0) ? countingMemoryCache.f1940b : null;
        return closeableReference;
    }

    private synchronized int m1903c() {
        return this.f1946c.m1883a() - this.f1945b.m1883a();
    }

    private synchronized int m1905d() {
        return this.f1946c.m1886b() - this.f1945b.m1886b();
    }

    static /* synthetic */ void m1897a(CountingMemoryCache countingMemoryCache, CountingMemoryCache countingMemoryCache2) {
        CloseableReference f;
        Preconditions.m1030a((Object) countingMemoryCache2);
        synchronized (countingMemoryCache) {
            countingMemoryCache.m1907e(countingMemoryCache2);
            countingMemoryCache.m1901b(countingMemoryCache2);
            f = countingMemoryCache.m1908f(countingMemoryCache2);
        }
        CloseableReference.m1097c(f);
        countingMemoryCache.m1896a();
        countingMemoryCache.m1900b();
    }
}
