package com.facebook.imagepipeline.p044k;

import android.util.Pair;
import com.facebook.common.p011d.Preconditions;
import com.facebook.imagepipeline.k.ab$a.a;
import com.facebook.imagepipeline.p042d.Priority;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
/* compiled from: MultiplexProducer */
/* renamed from: com.facebook.imagepipeline.k.ab */
public abstract class ab<K, T extends Closeable> implements ag<T> {
    @GuardedBy("this")
    final Map<K, MultiplexProducer> f2184a;
    final ag<T> f2185b;

    /* renamed from: com.facebook.imagepipeline.k.ab.a */
    class MultiplexProducer {
        final K f2177a;
        final CopyOnWriteArraySet<Pair<Consumer<T>, ah>> f2178b;
        @GuardedBy("Multiplexer.this")
        @Nullable
        T f2179c;
        @GuardedBy("Multiplexer.this")
        float f2180d;
        @GuardedBy("Multiplexer.this")
        @Nullable
        BaseProducerContext f2181e;
        @GuardedBy("Multiplexer.this")
        @Nullable
        a f2182f;
        final /* synthetic */ ab f2183g;

        /* renamed from: com.facebook.imagepipeline.k.ab.a.1 */
        class MultiplexProducer extends BaseProducerContextCallbacks {
            final /* synthetic */ Pair f2174a;
            final /* synthetic */ MultiplexProducer f2175b;

            MultiplexProducer(MultiplexProducer multiplexProducer, Pair pair) {
                this.f2175b = multiplexProducer;
                this.f2174a = pair;
            }

            public final void m2114a() {
                List list;
                List list2;
                BaseProducerContext baseProducerContext;
                List list3 = null;
                synchronized (this.f2175b) {
                    boolean remove = this.f2175b.f2178b.remove(this.f2174a);
                    if (!remove) {
                        list = null;
                        list2 = null;
                        baseProducerContext = null;
                    } else if (this.f2175b.f2178b.isEmpty()) {
                        list2 = null;
                        baseProducerContext = this.f2175b.f2181e;
                        list = null;
                    } else {
                        List b = this.f2175b.m2129b();
                        list2 = this.f2175b.m2131d();
                        list = list2;
                        list2 = b;
                        baseProducerContext = null;
                        list3 = this.f2175b.m2130c();
                    }
                }
                BaseProducerContext.m2187a(list2);
                BaseProducerContext.m2189c(list);
                BaseProducerContext.m2188b(list3);
                if (baseProducerContext != null) {
                    baseProducerContext.m2203i();
                }
                if (remove) {
                    ((Consumer) this.f2174a.first).m1980b();
                }
            }

            public final void m2115b() {
                BaseProducerContext.m2187a(this.f2175b.m2129b());
            }

            public final void m2116c() {
                BaseProducerContext.m2188b(this.f2175b.m2130c());
            }

            public final void m2117d() {
                BaseProducerContext.m2189c(this.f2175b.m2131d());
            }
        }

        /* renamed from: com.facebook.imagepipeline.k.ab.a.a */
        private class MultiplexProducer extends BaseConsumer<T> {
            final /* synthetic */ MultiplexProducer f2176a;

            private MultiplexProducer(MultiplexProducer multiplexProducer) {
                this.f2176a = multiplexProducer;
            }

            protected final /* bridge */ /* synthetic */ void m2120a(Object obj, boolean z) {
                this.f2176a.m2127a(this, (Closeable) obj, z);
            }

            protected final void m2121a(Throwable th) {
                MultiplexProducer multiplexProducer = this.f2176a;
                synchronized (multiplexProducer) {
                    if (multiplexProducer.f2182f != this) {
                        return;
                    }
                    Iterator it = multiplexProducer.f2178b.iterator();
                    multiplexProducer.f2178b.clear();
                    multiplexProducer.f2183g.m2137a(multiplexProducer.f2177a, multiplexProducer);
                    MultiplexProducer.m2122a(multiplexProducer.f2179c);
                    multiplexProducer.f2179c = null;
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        synchronized (pair) {
                            ((Consumer) pair.first).m1983b(th);
                        }
                    }
                }
            }

            protected final void m2118a() {
                MultiplexProducer multiplexProducer = this.f2176a;
                synchronized (multiplexProducer) {
                    if (multiplexProducer.f2182f != this) {
                        return;
                    }
                    multiplexProducer.f2182f = null;
                    multiplexProducer.f2181e = null;
                    MultiplexProducer.m2122a(multiplexProducer.f2179c);
                    multiplexProducer.f2179c = null;
                    multiplexProducer.m2126a();
                }
            }

            protected final void m2119a(float f) {
                MultiplexProducer multiplexProducer = this.f2176a;
                synchronized (multiplexProducer) {
                    if (multiplexProducer.f2182f != this) {
                        return;
                    }
                    multiplexProducer.f2180d = f;
                    Iterator it = multiplexProducer.f2178b.iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        synchronized (pair) {
                            ((Consumer) pair.first).m1981b(f);
                        }
                    }
                }
            }
        }

        public MultiplexProducer(ab abVar, K k) {
            this.f2183g = abVar;
            this.f2178b = new CopyOnWriteArraySet();
            this.f2177a = k;
        }

        public final boolean m2128a(Consumer<T> consumer, ah ahVar) {
            Pair create = Pair.create(consumer, ahVar);
            synchronized (this) {
                if (this.f2183g.m2133a(this.f2177a) != this) {
                    return false;
                }
                this.f2178b.add(create);
                List b = m2129b();
                List d = m2131d();
                List c = m2130c();
                Closeable closeable = this.f2179c;
                float f = this.f2180d;
                BaseProducerContext.m2187a(b);
                BaseProducerContext.m2189c(d);
                BaseProducerContext.m2188b(c);
                synchronized (create) {
                    synchronized (this) {
                        if (closeable != this.f2179c) {
                            closeable = null;
                        } else if (closeable != null) {
                            closeable = this.f2183g.m2134a(closeable);
                        }
                    }
                    if (closeable != null) {
                        if (f > 0.0f) {
                            consumer.m1981b(f);
                        }
                        consumer.m1982b(closeable, false);
                        MultiplexProducer.m2122a(closeable);
                    }
                }
                ahVar.m2171a(new MultiplexProducer(this, create));
                return true;
            }
        }

        final void m2126a() {
            boolean z = true;
            synchronized (this) {
                Preconditions.m1033a(this.f2181e == null);
                if (this.f2182f != null) {
                    z = false;
                }
                Preconditions.m1033a(z);
                if (this.f2178b.isEmpty()) {
                    this.f2183g.m2137a(this.f2177a, this);
                    return;
                }
                ah ahVar = (ah) ((Pair) this.f2178b.iterator().next()).second;
                this.f2181e = new BaseProducerContext(ahVar.m2170a(), ahVar.m2172b(), ahVar.m2173c(), ahVar.m2174d(), ahVar.m2175e(), m2123e(), m2124f(), m2125g());
                this.f2182f = new MultiplexProducer();
                ah ahVar2 = this.f2181e;
                Consumer consumer = this.f2182f;
                this.f2183g.f2185b.m2094a(consumer, ahVar2);
            }
        }

        @Nullable
        final synchronized List<ai> m2129b() {
            List<ai> list;
            if (this.f2181e == null) {
                list = null;
            } else {
                list = this.f2181e.m2193a(m2123e());
            }
            return list;
        }

        private synchronized boolean m2123e() {
            boolean z;
            Iterator it = this.f2178b.iterator();
            while (it.hasNext()) {
                if (!((ah) ((Pair) it.next()).second).m2176f()) {
                    z = false;
                    break;
                }
            }
            z = true;
            return z;
        }

        @Nullable
        final synchronized List<ai> m2130c() {
            List<ai> list;
            if (this.f2181e == null) {
                list = null;
            } else {
                list = this.f2181e.m2196b(m2124f());
            }
            return list;
        }

        private synchronized boolean m2124f() {
            boolean z;
            Iterator it = this.f2178b.iterator();
            while (it.hasNext()) {
                if (((ah) ((Pair) it.next()).second).m2178h()) {
                    z = true;
                    break;
                }
            }
            z = false;
            return z;
        }

        @Nullable
        final synchronized List<ai> m2131d() {
            List<ai> list;
            if (this.f2181e == null) {
                list = null;
            } else {
                list = this.f2181e.m2192a(m2125g());
            }
            return list;
        }

        private synchronized int m2125g() {
            int i;
            int i2 = Priority.f1977a;
            Iterator it = this.f2178b.iterator();
            i = i2;
            while (it.hasNext()) {
                i = Priority.m1928a(i, ((ah) ((Pair) it.next()).second).m2177g());
            }
            return i;
        }

        public final void m2127a(a aVar, T t, boolean z) {
            synchronized (this) {
                if (this.f2182f != aVar) {
                    return;
                }
                MultiplexProducer.m2122a(this.f2179c);
                this.f2179c = null;
                Iterator it = this.f2178b.iterator();
                if (z) {
                    this.f2178b.clear();
                    this.f2183g.m2137a(this.f2177a, this);
                } else {
                    this.f2179c = this.f2183g.m2134a((Closeable) t);
                }
                while (it.hasNext()) {
                    Pair pair = (Pair) it.next();
                    synchronized (pair) {
                        ((Consumer) pair.first).m1982b(t, z);
                    }
                }
            }
        }

        static void m2122a(Closeable closeable) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (Throwable e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    protected abstract T m2134a(T t);

    protected abstract K m2135a(ah ahVar);

    protected ab(ag<T> agVar) {
        this.f2185b = agVar;
        this.f2184a = new HashMap();
    }

    public final void m2136a(Consumer<T> consumer, ah ahVar) {
        Object a = m2135a(ahVar);
        MultiplexProducer a2;
        do {
            Object obj = null;
            synchronized (this) {
                a2 = m2133a(a);
                if (a2 == null) {
                    a2 = m2132b(a);
                    obj = 1;
                }
            }
        } while (!a2.m2128a(consumer, ahVar));
        if (obj != null) {
            a2.m2126a();
        }
    }

    final synchronized MultiplexProducer m2133a(K k) {
        return (MultiplexProducer) this.f2184a.get(k);
    }

    private synchronized MultiplexProducer m2132b(K k) {
        MultiplexProducer multiplexProducer;
        multiplexProducer = new MultiplexProducer(this, k);
        this.f2184a.put(k, multiplexProducer);
        return multiplexProducer;
    }

    final synchronized void m2137a(K k, MultiplexProducer multiplexProducer) {
        if (this.f2184a.get(k) == multiplexProducer) {
            this.f2184a.remove(k);
        }
    }
}
