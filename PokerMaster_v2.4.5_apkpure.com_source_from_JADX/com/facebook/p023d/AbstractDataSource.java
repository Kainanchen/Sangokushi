package com.facebook.p023d;

import android.util.Pair;
import com.android.volley.DefaultRetryPolicy;
import com.facebook.common.p011d.Preconditions;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.facebook.d.a */
public abstract class AbstractDataSource<T> implements DataSource<T> {
    @GuardedBy("this")
    private int f1180a;
    @GuardedBy("this")
    private boolean f1181b;
    @GuardedBy("this")
    @Nullable
    private T f1182c;
    @GuardedBy("this")
    private Throwable f1183d;
    @GuardedBy("this")
    private float f1184e;
    private final ConcurrentLinkedQueue<Pair<DataSubscriber<T>, Executor>> f1185f;

    /* renamed from: com.facebook.d.a.1 */
    class AbstractDataSource implements Runnable {
        final /* synthetic */ boolean f1170a;
        final /* synthetic */ DataSubscriber f1171b;
        final /* synthetic */ boolean f1172c;
        final /* synthetic */ AbstractDataSource f1173d;

        AbstractDataSource(AbstractDataSource abstractDataSource, boolean z, DataSubscriber dataSubscriber, boolean z2) {
            this.f1173d = abstractDataSource;
            this.f1170a = z;
            this.f1171b = dataSubscriber;
            this.f1172c = z2;
        }

        public final void run() {
            if (this.f1170a) {
                this.f1171b.m1171b(this.f1173d);
            } else if (!this.f1172c) {
                this.f1171b.m1170a(this.f1173d);
            }
        }
    }

    /* renamed from: com.facebook.d.a.2 */
    class AbstractDataSource implements Runnable {
        final /* synthetic */ DataSubscriber f1174a;
        final /* synthetic */ AbstractDataSource f1175b;

        AbstractDataSource(AbstractDataSource abstractDataSource, DataSubscriber dataSubscriber) {
            this.f1175b = abstractDataSource;
            this.f1174a = dataSubscriber;
        }

        public final void run() {
            this.f1174a.m1172c(this.f1175b);
        }
    }

    /* renamed from: com.facebook.d.a.a */
    private enum AbstractDataSource {
        ;

        static {
            f1176a = 1;
            f1177b = 2;
            f1178c = 3;
            f1179d = new int[]{f1176a, f1177b, f1178c};
        }
    }

    public AbstractDataSource() {
        this.f1182c = null;
        this.f1183d = null;
        this.f1184e = 0.0f;
        this.f1181b = false;
        this.f1180a = AbstractDataSource.f1176a;
        this.f1185f = new ConcurrentLinkedQueue();
    }

    public final synchronized boolean m1160a() {
        return this.f1181b;
    }

    public final synchronized boolean m1164b() {
        return this.f1180a != AbstractDataSource.f1176a;
    }

    public synchronized boolean m1165c() {
        return this.f1182c != null;
    }

    @Nullable
    public synchronized T m1166d() {
        return this.f1182c;
    }

    private synchronized boolean m1155h() {
        return this.f1180a == AbstractDataSource.f1178c;
    }

    @Nullable
    public final synchronized Throwable m1167e() {
        return this.f1183d;
    }

    public final synchronized float m1168f() {
        return this.f1184e;
    }

    public boolean m1169g() {
        boolean z = true;
        synchronized (this) {
            if (this.f1181b) {
                z = false;
            } else {
                this.f1181b = true;
                Object obj = this.f1182c;
                this.f1182c = null;
                if (obj != null) {
                    m1159a(obj);
                }
                if (!m1164b()) {
                    m1156i();
                }
                synchronized (this) {
                    this.f1185f.clear();
                }
            }
        }
        return z;
    }

    public void m1159a(@Nullable T t) {
    }

    public final void m1158a(DataSubscriber<T> dataSubscriber, Executor executor) {
        Preconditions.m1030a((Object) dataSubscriber);
        Preconditions.m1030a((Object) executor);
        synchronized (this) {
            if (this.f1181b) {
                return;
            }
            if (this.f1180a == AbstractDataSource.f1176a) {
                this.f1185f.add(Pair.create(dataSubscriber, executor));
            }
            Object obj = (m1165c() || m1164b() || m1157j()) ? 1 : null;
            if (obj != null) {
                m1151a(dataSubscriber, executor, m1155h(), m1157j());
            }
        }
    }

    private void m1156i() {
        boolean h = m1155h();
        boolean j = m1157j();
        Iterator it = this.f1185f.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            m1151a((DataSubscriber) pair.first, (Executor) pair.second, h, j);
        }
    }

    private void m1151a(DataSubscriber<T> dataSubscriber, Executor executor, boolean z, boolean z2) {
        executor.execute(new AbstractDataSource(this, z, dataSubscriber, z2));
    }

    private synchronized boolean m1157j() {
        boolean z;
        z = m1160a() && !m1164b();
        return z;
    }

    public boolean m1162a(@Nullable T t, boolean z) {
        boolean b = m1153b(t, z);
        if (b) {
            m1156i();
        }
        return b;
    }

    public boolean m1163a(Throwable th) {
        boolean b = m1154b(th);
        if (b) {
            m1156i();
        }
        return b;
    }

    public boolean m1161a(float f) {
        boolean b = m1152b(f);
        if (b) {
            Iterator it = this.f1185f.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                ((Executor) pair.second).execute(new AbstractDataSource(this, (DataSubscriber) pair.first));
            }
        }
        return b;
    }

    private boolean m1153b(@Nullable T t, boolean z) {
        Throwable th;
        try {
            synchronized (this) {
                try {
                    if (this.f1181b || this.f1180a != AbstractDataSource.f1176a) {
                        try {
                            if (t != null) {
                                m1159a((Object) t);
                            }
                            return false;
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                throw th;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                    } else {
                        if (z) {
                            this.f1180a = AbstractDataSource.f1177b;
                            this.f1184e = DefaultRetryPolicy.DEFAULT_BACKOFF_MULT;
                        }
                        if (this.f1182c != t) {
                            T t2 = this.f1182c;
                            try {
                                this.f1182c = t;
                                t = t2;
                            } catch (Throwable th4) {
                                th = th4;
                                t = t2;
                                throw th;
                            }
                        } else {
                            t = null;
                        }
                        if (t != null) {
                            m1159a((Object) t);
                        }
                        return true;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    t = null;
                    throw th;
                }
            }
        } catch (Throwable th6) {
            th = th6;
            t = null;
            if (r4 != null) {
                m1159a(r4);
            }
            throw th;
        }
    }

    private synchronized boolean m1154b(Throwable th) {
        boolean z;
        if (this.f1181b || this.f1180a != AbstractDataSource.f1176a) {
            z = false;
        } else {
            this.f1180a = AbstractDataSource.f1178c;
            this.f1183d = th;
            z = true;
        }
        return z;
    }

    private synchronized boolean m1152b(float f) {
        boolean z = false;
        synchronized (this) {
            if (!this.f1181b && this.f1180a == AbstractDataSource.f1176a) {
                if (f >= this.f1184e) {
                    this.f1184e = f;
                    z = true;
                }
            }
        }
        return z;
    }
}
