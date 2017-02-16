package com.facebook.p036h;

import com.facebook.FacebookSdk;
import java.util.concurrent.Executor;

/* compiled from: WorkQueue */
/* renamed from: com.facebook.h.ai */
public class ai {
    static final /* synthetic */ boolean f1612a;
    private final Object f1613b;
    private WorkQueue f1614c;
    private final int f1615d;
    private final Executor f1616e;
    private WorkQueue f1617f;
    private int f1618g;

    /* renamed from: com.facebook.h.ai.1 */
    class WorkQueue implements Runnable {
        final /* synthetic */ WorkQueue f1604a;
        final /* synthetic */ ai f1605b;

        WorkQueue(ai aiVar, WorkQueue workQueue) {
            this.f1605b = aiVar;
            this.f1604a = workQueue;
        }

        public final void run() {
            try {
                this.f1604a.f1607a.run();
            } finally {
                this.f1605b.m1578a(this.f1604a);
            }
        }
    }

    /* renamed from: com.facebook.h.ai.a */
    public interface WorkQueue {
        void m1573a();
    }

    /* renamed from: com.facebook.h.ai.b */
    private class WorkQueue implements WorkQueue {
        static final /* synthetic */ boolean f1606c;
        final Runnable f1607a;
        boolean f1608b;
        final /* synthetic */ ai f1609d;
        private WorkQueue f1610e;
        private WorkQueue f1611f;

        static {
            f1606c = !ai.class.desiredAssertionStatus();
        }

        WorkQueue(ai aiVar, Runnable runnable) {
            this.f1609d = aiVar;
            this.f1607a = runnable;
        }

        public final void m1576a() {
            synchronized (this.f1609d.f1613b) {
                if (!this.f1608b) {
                    this.f1609d.f1614c = m1574a(this.f1609d.f1614c);
                    this.f1609d.f1614c = m1575a(this.f1609d.f1614c, true);
                }
            }
        }

        final WorkQueue m1575a(WorkQueue workQueue, boolean z) {
            if (!f1606c && this.f1610e != null) {
                throw new AssertionError();
            } else if (f1606c || this.f1611f == null) {
                WorkQueue workQueue2;
                if (workQueue == null) {
                    this.f1611f = this;
                    this.f1610e = this;
                    workQueue2 = this;
                } else {
                    this.f1610e = workQueue;
                    this.f1611f = workQueue.f1611f;
                    workQueue2 = this.f1610e;
                    this.f1611f.f1610e = this;
                    workQueue2.f1611f = this;
                    workQueue2 = workQueue;
                }
                if (z) {
                    return this;
                }
                return workQueue2;
            } else {
                throw new AssertionError();
            }
        }

        final WorkQueue m1574a(WorkQueue workQueue) {
            if (!f1606c && this.f1610e == null) {
                throw new AssertionError();
            } else if (f1606c || this.f1611f != null) {
                if (workQueue == this) {
                    if (this.f1610e == this) {
                        workQueue = null;
                    } else {
                        workQueue = this.f1610e;
                    }
                }
                this.f1610e.f1611f = this.f1611f;
                this.f1611f.f1610e = this.f1610e;
                this.f1611f = null;
                this.f1610e = null;
                return workQueue;
            } else {
                throw new AssertionError();
            }
        }
    }

    static {
        f1612a = !ai.class.desiredAssertionStatus();
    }

    public ai() {
        this(8);
    }

    public ai(int i) {
        this(i, FacebookSdk.m2583d());
    }

    private ai(int i, Executor executor) {
        this.f1613b = new Object();
        this.f1617f = null;
        this.f1618g = 0;
        this.f1615d = i;
        this.f1616e = executor;
    }

    public final WorkQueue m1582a(Runnable runnable) {
        WorkQueue workQueue = new WorkQueue(this, runnable);
        synchronized (this.f1613b) {
            this.f1614c = workQueue.m1575a(this.f1614c, true);
        }
        m1578a(null);
        return workQueue;
    }

    private void m1578a(WorkQueue workQueue) {
        WorkQueue workQueue2 = null;
        synchronized (this.f1613b) {
            if (workQueue != null) {
                this.f1617f = workQueue.m1574a(this.f1617f);
                this.f1618g--;
            }
            if (this.f1618g < this.f1615d) {
                workQueue2 = this.f1614c;
                if (workQueue2 != null) {
                    this.f1614c = workQueue2.m1574a(this.f1614c);
                    this.f1617f = workQueue2.m1575a(this.f1617f, false);
                    this.f1618g++;
                    workQueue2.f1608b = true;
                }
            }
        }
        if (workQueue2 != null) {
            this.f1616e.execute(new WorkQueue(this, workQueue2));
        }
    }
}
